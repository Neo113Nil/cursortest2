package org.jctools.util;

/* loaded from: classes18.dex */
public final class UnsafeLongArrayAccess {
    public static final long LONG_ARRAY_BASE;
    public static final int LONG_ELEMENT_SHIFT;

    static {
        int arrayIndexScale = org.jctools.util.UnsafeAccess.UNSAFE.arrayIndexScale(long[].class);
        if (8 == arrayIndexScale) {
            LONG_ELEMENT_SHIFT = 3;
            LONG_ARRAY_BASE = org.jctools.util.UnsafeAccess.UNSAFE.arrayBaseOffset(long[].class);
            return;
        }
        throw new java.lang.IllegalStateException("Unknown pointer size: ".concat(java.lang.String.valueOf(arrayIndexScale)));
    }

    public static void spLongElement(long[] jArr, long j, long j2) {
        org.jctools.util.UnsafeAccess.UNSAFE.putLong(jArr, j, j2);
    }

    public static void soLongElement(long[] jArr, long j, long j2) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(jArr, j, j2);
    }

    public static long lpLongElement(long[] jArr, long j) {
        return org.jctools.util.UnsafeAccess.UNSAFE.getLong(jArr, j);
    }

    public static long lvLongElement(long[] jArr, long j) {
        return org.jctools.util.UnsafeAccess.UNSAFE.getLongVolatile(jArr, j);
    }

    public static long calcLongElementOffset(long j) {
        return LONG_ARRAY_BASE + (j << LONG_ELEMENT_SHIFT);
    }

    public static long calcCircularLongElementOffset(long j, long j2) {
        return LONG_ARRAY_BASE + ((j & j2) << LONG_ELEMENT_SHIFT);
    }

    public static long[] allocateLongArray(int i) {
        return new long[i];
    }
}
