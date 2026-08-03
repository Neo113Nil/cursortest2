package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Wc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractRunnableC1123Wc implements java.lang.Runnable {
    public static byte[] A01;
    public static final java.util.concurrent.atomic.AtomicBoolean A02;
    public static final java.util.concurrent.atomic.AtomicBoolean A03;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.WS> A04;
    public final com.facebook.ads.redexgen.core.WQ A00;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{44, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.US, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ESC, 94, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.US, 10, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, 80, 94, 42, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SUB, 68, 94};
    }

    public abstract void A07();

    static {
        A03();
        A02 = new java.util.concurrent.atomic.AtomicBoolean();
        A03 = new java.util.concurrent.atomic.AtomicBoolean(false);
        A04 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public AbstractRunnableC1123Wc() {
        if (A03.get()) {
            this.A00 = com.facebook.ads.redexgen.core.C1128Wh.A01(new com.facebook.ads.redexgen.core.C1127Wg(A02(0, 26, 94) + java.lang.Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A04(boolean z) {
        A03.set(z);
    }

    public static void A05(boolean z, com.facebook.ads.redexgen.core.WS ws) {
        A02.set(z);
        A04.set(ws);
    }

    public final com.facebook.ads.redexgen.core.WQ A06() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                com.facebook.ads.redexgen.core.C1128Wh.A03(this);
            }
            try {
                A07();
            } catch (java.lang.Throwable th) {
                if (A02.get()) {
                    com.facebook.ads.redexgen.core.AbstractC1130Wj.A00().AAx(3301, th);
                    com.facebook.ads.redexgen.core.WS ws = A04.get();
                    if (ws != null) {
                        ws.AIZ(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                com.facebook.ads.redexgen.core.C1128Wh.A04(this);
            }
        } catch (java.lang.Throwable th2) {
            com.facebook.ads.redexgen.core.WU.A00(th2, this);
        }
    }
}
