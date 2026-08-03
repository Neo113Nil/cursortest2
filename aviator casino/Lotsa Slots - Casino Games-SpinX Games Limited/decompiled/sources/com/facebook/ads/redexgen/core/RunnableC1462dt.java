package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1462dt implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4V A00;

    public RunnableC1462dt(com.facebook.ads.redexgen.core.C4V c4v) {
        this.A00 = c4v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            ((com.facebook.ads.redexgen.core.AbstractC0723Gj) this.A00).A0A.A4j(((com.facebook.ads.redexgen.core.AbstractC0723Gj) this.A00).A0B.A7w());
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
