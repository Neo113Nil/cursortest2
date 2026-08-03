package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1306bM implements java.lang.Runnable {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C6U A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{com.google.common.base.Ascii.FF, 1, com.google.common.base.Ascii.GS, 5, com.google.common.base.Ascii.FF};
    }

    public RunnableC1306bM(com.facebook.ads.redexgen.core.C6U c6u) {
        this.A00 = c6u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String A00 = A00(0, 5, 64);
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0U.A0F().AKi();
            android.animation.ObjectAnimator.ofFloat(this.A00.A0Q, A00, 1.0f, 0.0f).setDuration(100L).start();
            android.animation.ObjectAnimator.ofFloat(this.A00.A0P, A00, 1.0f, 0.0f).setDuration(100L).start();
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(((com.facebook.ads.redexgen.core.AbstractC1299bF) this.A00).A09, A00, 1.0f, 0.0f).setDuration(100L);
            duration.addListener(new com.facebook.ads.redexgen.core.C1305bL(this));
            duration.start();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
