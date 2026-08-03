package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1619gR implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.CZ A00;

    public RunnableC1619gR(com.facebook.ads.redexgen.core.CZ cz) {
        this.A00 = cz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            com.facebook.ads.redexgen.core.CZ.A03(this.A00);
            throw null;
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
