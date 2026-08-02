package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
public final class UnsafeAccess {
    public static final sun.misc.Unsafe UNSAFE;
    private static final boolean getHighResolutionOutputSizeshNQ4ISI;

    static {
        getHighResolutionOutputSizeshNQ4ISI = java.lang.System.getProperty("rx.unsafe-disable") != null;
        sun.misc.Unsafe unsafe = null;
        try {
            java.lang.reflect.Field declaredField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (sun.misc.Unsafe) declaredField.get(null);
        } catch (java.lang.Throwable unused) {
        }
        UNSAFE = unsafe;
    }

    private UnsafeAccess() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static boolean isUnsafeAvailable() {
        return (UNSAFE == null || getHighResolutionOutputSizeshNQ4ISI) ? false : true;
    }

    public static int getAndIncrementInt(java.lang.Object obj, long j) {
        sun.misc.Unsafe unsafe;
        int intVolatile;
        do {
            unsafe = UNSAFE;
            intVolatile = unsafe.getIntVolatile(obj, j);
        } while (!unsafe.compareAndSwapInt(obj, j, intVolatile, intVolatile + 1));
        return intVolatile;
    }

    public static int getAndAddInt(java.lang.Object obj, long j, int i) {
        sun.misc.Unsafe unsafe;
        int intVolatile;
        do {
            unsafe = UNSAFE;
            intVolatile = unsafe.getIntVolatile(obj, j);
        } while (!unsafe.compareAndSwapInt(obj, j, intVolatile, intVolatile + i));
        return intVolatile;
    }

    public static int getAndSetInt(java.lang.Object obj, long j, int i) {
        sun.misc.Unsafe unsafe;
        int intVolatile;
        do {
            unsafe = UNSAFE;
            intVolatile = unsafe.getIntVolatile(obj, j);
        } while (!unsafe.compareAndSwapInt(obj, j, intVolatile, i));
        return intVolatile;
    }

    public static boolean compareAndSwapInt(java.lang.Object obj, long j, int i, int i2) {
        return UNSAFE.compareAndSwapInt(obj, j, i, i2);
    }

    public static long addressOf(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return UNSAFE.objectFieldOffset(cls.getDeclaredField(str));
        } catch (java.lang.NoSuchFieldException e) {
            java.lang.InternalError internalError = new java.lang.InternalError();
            internalError.initCause(e);
            throw internalError;
        }
    }
}
