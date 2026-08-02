package com.facetec.sdk;

/* loaded from: classes8.dex */
final class oz<T> {

    /* renamed from: a, reason: collision with root package name */
    public static int f3737a;
    public static int b;
    private final java.lang.Class[] c;
    private final java.lang.Class<?> d;
    private final java.lang.String e;

    oz(java.lang.Class<?> cls, java.lang.String str, java.lang.Class... clsArr) {
        this.d = cls;
        this.e = str;
        this.c = clsArr;
    }

    public final boolean d(T t) {
        return c(t.getClass()) != null;
    }

    private java.lang.Object c(T t, java.lang.Object... objArr) throws java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method c = c(t.getClass());
        if (c == null) {
            return null;
        }
        try {
            return c.invoke(t, objArr);
        } catch (java.lang.IllegalAccessException unused) {
            return null;
        }
    }

    public final java.lang.Object e(T t, java.lang.Object... objArr) {
        try {
            return c(t, objArr);
        } catch (java.lang.reflect.InvocationTargetException e) {
            java.lang.Throwable targetException = e.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private java.lang.Object b(T t, java.lang.Object... objArr) throws java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method c = c(t.getClass());
        if (c == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Method ");
            sb.append(this.e);
            sb.append(" not supported for object ");
            sb.append(t);
            throw new java.lang.AssertionError(sb.toString());
        }
        try {
            return c.invoke(t, objArr);
        } catch (java.lang.IllegalAccessException e) {
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpectedly could not call: ".concat(java.lang.String.valueOf(c)));
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public final java.lang.Object d(T t, java.lang.Object... objArr) {
        try {
            return b(t, objArr);
        } catch (java.lang.reflect.InvocationTargetException e) {
            java.lang.Throwable targetException = e.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private java.lang.reflect.Method c(java.lang.Class<?> cls) {
        java.lang.Class<?> cls2;
        java.lang.String str = this.e;
        if (str == null) {
            return null;
        }
        java.lang.reflect.Method c = c(cls, str, this.c);
        if (c == null || (cls2 = this.d) == null || cls2.isAssignableFrom(c.getReturnType())) {
            return c;
        }
        return null;
    }

    private static java.lang.reflect.Method c(java.lang.Class<?> cls, java.lang.String str, java.lang.Class[] clsArr) {
        try {
            java.lang.reflect.Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (java.lang.NoSuchMethodException unused) {
                return method;
            }
        } catch (java.lang.NoSuchMethodException unused2) {
            return null;
        }
    }

    public static int d() {
        int i = b;
        b = i + 1;
        if (i % 7806472 != 0) {
            return f3737a;
        }
        int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
        f3737a = freeMemory;
        return freeMemory;
    }
}
