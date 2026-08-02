package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class qd {
    public static final java.nio.charset.Charset e = java.nio.charset.Charset.forName("UTF-8");

    public static int b(int i) {
        return ((i & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) << 8) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((i & 255) << 24);
    }

    public static short e(short s) {
        return (short) ((((s & kotlin.UShort.MAX_VALUE) >>> 8) & 255) | ((s & 255) << 8));
    }

    public static void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("size=%s offset=%s byteCount=%s", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
        }
    }

    public static boolean b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static void a(java.lang.Throwable th) {
        throw th;
    }
}
