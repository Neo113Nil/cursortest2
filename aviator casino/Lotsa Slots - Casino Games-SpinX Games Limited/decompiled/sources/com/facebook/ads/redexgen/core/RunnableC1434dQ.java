package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1434dQ implements java.lang.Runnable {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5T A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 77, 72, 73, 83, 52, 80, 69, 93, 70, 69, 71, 79, 41, 86, 86, 83, 86};
    }

    public RunnableC1434dQ(com.facebook.ads.redexgen.core.C5T c5t) {
        this.A00 = c5t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0S(A00(0, 18, 126));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
