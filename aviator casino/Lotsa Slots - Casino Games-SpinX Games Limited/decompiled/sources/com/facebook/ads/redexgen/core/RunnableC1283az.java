package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1283az implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1284b0 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC1285b1 A01;

    public RunnableC1283az(com.facebook.ads.redexgen.core.C1284b0 c1284b0, com.facebook.ads.redexgen.core.InterfaceC1285b1 interfaceC1285b1) {
        this.A00 = c1284b0;
        this.A01 = interfaceC1285b1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A01.ACz();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
