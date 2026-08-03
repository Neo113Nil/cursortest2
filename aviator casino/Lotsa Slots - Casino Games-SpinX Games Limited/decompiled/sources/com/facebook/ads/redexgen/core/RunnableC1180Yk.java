package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1180Yk implements java.lang.Runnable {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.ViewOnClickListenerC04976x A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-106, -108, -122, -109, Byte.MIN_VALUE, -125, -106, -121, -121, -122, -109, -122, -123, Byte.MIN_VALUE, -124, -115, -118, -124, -116, Byte.MIN_VALUE, -126, -121, -107, -122, -109, Byte.MIN_VALUE, -123, -122, -115, -126, -102};
    }

    public RunnableC1180Yk(com.facebook.ads.redexgen.core.ViewOnClickListenerC04976x viewOnClickListenerC04976x) {
        this.A00 = viewOnClickListenerC04976x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0I(A00(0, 31, 20));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
