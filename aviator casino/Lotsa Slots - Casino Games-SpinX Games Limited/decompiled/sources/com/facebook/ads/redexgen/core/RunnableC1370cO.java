package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1370cO implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.KE A00;

    public RunnableC1370cO(com.facebook.ads.redexgen.core.KE ke) {
        this.A00 = ke;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0M;
            if (z) {
                this.A00.A0K();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
