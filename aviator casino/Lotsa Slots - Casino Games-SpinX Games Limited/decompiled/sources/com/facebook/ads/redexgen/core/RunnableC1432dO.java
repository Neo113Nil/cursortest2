package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1432dO implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5S A00;

    public RunnableC1432dO(com.facebook.ads.redexgen.core.C5S c5s) {
        this.A00 = c5s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A08 = true;
            interfaceC1456dm = this.A00.A0P;
            interfaceC1456dm.AFw(true);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
