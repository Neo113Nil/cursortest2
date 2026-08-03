package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.rG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2239rG implements java.lang.Runnable {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2238rF A01;
    public final /* synthetic */ java.lang.Exception A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{58, 56, 41, com.google.common.base.Ascii.EM, 56, 49, 60, 36};
    }

    public RunnableC2239rG(com.facebook.ads.redexgen.core.C2238rF c2238rF, int i, java.lang.Exception exc) {
        this.A01 = c2238rF;
        this.A00 = i;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        com.facebook.ads.redexgen.core.InterfaceC1692hc interfaceC1692hc;
        android.os.Handler handler;
        java.lang.Runnable runnable;
        boolean A0B;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            try {
                z = this.A01.A01;
                if (z) {
                    if (com.facebook.ads.redexgen.core.C0576Ao.A07) {
                        A0B = this.A01.A0B();
                        if (A0B) {
                            this.A01.A0F();
                            return;
                        }
                    }
                    com.facebook.ads.redexgen.core.C2238rF c2238rF = this.A01;
                    interfaceC1692hc = this.A01.A05;
                    c2238rF.A08(interfaceC1692hc.ACf());
                    com.facebook.ads.redexgen.core.C2238rF.A03(this.A01);
                    if (0 == 0) {
                        int delay = this.A00;
                        handler = this.A01.A04;
                        runnable = this.A01.A0C;
                        handler.postDelayed(runnable, delay);
                        return;
                    }
                    com.facebook.ads.redexgen.core.C2238rF.A03(this.A01);
                    throw new java.lang.NullPointerException(A00(0, 8, 12));
                }
            } catch (java.lang.Exception ex) {
                ex.initCause(this.A02);
                throw ex;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
