package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ds, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1461ds implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.GS A00;

    public RunnableC1461ds(com.facebook.ads.redexgen.core.GS gs) {
        this.A00 = gs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0H(com.facebook.ads.redexgen.core.VH.A0b);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
