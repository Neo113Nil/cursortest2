package r;

/* loaded from: classes.dex */
public final class h extends r.g {
    @Override // r.g
    public final android.graphics.Typeface N(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f8341f, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.f8347l.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    @Override // r.g
    public final java.lang.reflect.Method S(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass();
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, java.lang.String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
