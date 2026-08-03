package f1;

/* loaded from: classes.dex */
public final class N extends java.io.ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final java.lang.Class resolveClass(java.io.ObjectStreamClass objectStreamClass) {
        java.util.Set y2 = Q1.l.y("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        java.lang.String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || y2.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new java.lang.ClassNotFoundException(objectStreamClass.getName());
    }
}
