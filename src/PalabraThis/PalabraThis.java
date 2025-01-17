package PalabraThis;

public class PalabraThis
{
    public static void main(String[] args)
    {
        Persona persona = new Persona("Juan");
    }
}

class Persona
{
    String nombre; // this apunta a un objeto de tipo persona

    Persona(String nombre)
    {
        this.nombre = nombre;

        // Imprimir el objeto persona
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this); // this contiene una referencia al objeto Persona
    }
}

class Imprimir
{
    public void imprimir(Persona p)
    {
        System.out.println("Impresión argumento: " + p); // Valor del objeto persona
        System.out.println("Impresión objeto actual (this): " + this); // this apunta a un objeto de tipo imprimir
    }
}