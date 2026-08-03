package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class YE implements java.util.concurrent.ThreadFactory {
    public static byte[] A02;
    public final java.util.concurrent.atomic.AtomicLong A01 = new java.util.concurrent.atomic.AtomicLong();
    public int A00 = java.lang.Thread.currentThread().getPriority();

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 92);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ETB, 84, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.NAK, 17, 84, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, 9, 90, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC2, 8, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, 87, 95, com.google.common.base.Ascii.RS, 90, 95, com.google.common.base.Ascii.SO, 60, 90, 95, 70, com.google.common.base.Ascii.SO, 46, 5, com.google.common.base.Ascii.EM, 3, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.NAK, 2, 46, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.RS, 4, com.google.common.base.Ascii.US, 5, com.google.common.base.Ascii.DC4, 3, 46, 2, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, 46, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC2, 5, com.google.common.base.Ascii.RS, 3, 8};
    }

    private final java.lang.String A00() {
        return java.lang.String.format(java.util.Locale.US, A01(0, 35, 38), java.lang.Long.valueOf(this.A01.incrementAndGet()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        com.facebook.ads.redexgen.core.AbstractC1054Tj.A00(A01(35, 27, 45));
        java.lang.Thread thread = new java.lang.Thread(null, runnable, A00(), 0L);
        thread.setPriority(this.A00);
        return thread;
    }
}
