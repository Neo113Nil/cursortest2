package org.jctools.util;

/* loaded from: classes5.dex */
public class UnsafeAccess {
    public static final sun.misc.Unsafe UNSAFE = getUnsafe();
    public static final boolean SUPPORTS_GET_AND_SET_REF = hasGetAndSetSupport();
    public static final boolean SUPPORTS_GET_AND_ADD_LONG = hasGetAndAddLongSupport();

    private static sun.misc.Unsafe getUnsafe() {
        try {
            try {
                java.lang.reflect.Field declaredField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return (sun.misc.Unsafe) declaredField.get(null);
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        } catch (java.lang.Exception unused) {
            java.lang.reflect.Constructor declaredConstructor = sun.misc.Unsafe.class.getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            return (sun.misc.Unsafe) declaredConstructor.newInstance(new java.lang.Object[0]);
        }
    }

    private static boolean hasGetAndSetSupport() {
        try {
            sun.misc.Unsafe.class.getMethod("getAndSetObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private static boolean hasGetAndAddLongSupport() {
        try {
            sun.misc.Unsafe.class.getMethod("getAndAddLong", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Long.TYPE);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static long fieldOffset(java.lang.Class cls, java.lang.String str) throws java.lang.RuntimeException {
        try {
            return UNSAFE.objectFieldOffset(cls.getDeclaredField(str));
        } catch (java.lang.NoSuchFieldException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
