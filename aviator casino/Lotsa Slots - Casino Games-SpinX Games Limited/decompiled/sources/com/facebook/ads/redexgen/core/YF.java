package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class YF implements java.util.concurrent.ThreadFactory {
    public static byte[] A03;
    public final java.util.concurrent.atomic.AtomicInteger A00 = new java.util.concurrent.atomic.AtomicInteger(1);
    public final /* synthetic */ com.facebook.ads.redexgen.core.YG A01;
    public final /* synthetic */ java.lang.String A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{121, 116, -127, 109, 88, -90, 83, 86, 88, -105, -111, -123, -113, -126, 126, -127, -112, 124, Byte.MIN_VALUE, -116, -110, -117, -111, -126, -113, 124, -112, -123, -116, -113, -111, 124, -111, 126, -112, -120, 124, -126, -107, -126, Byte.MIN_VALUE, -110, -111, -116, -113};
    }

    public YF(com.facebook.ads.redexgen.core.YG yg, java.lang.String str) {
        this.A01 = yg;
        this.A02 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        com.facebook.ads.redexgen.core.AbstractC1054Tj.A00(A00(10, 35, 22));
        return new java.lang.Thread(runnable, java.lang.String.format(java.util.Locale.US, A00(0, 10, 44), this.A02, java.lang.Integer.valueOf(this.A00.getAndIncrement())));
    }
}
