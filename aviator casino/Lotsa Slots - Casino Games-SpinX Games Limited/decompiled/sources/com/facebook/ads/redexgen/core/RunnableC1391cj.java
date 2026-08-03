package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1391cj implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0799Ji A00;

    public RunnableC1391cj(com.facebook.ads.redexgen.core.C0799Ji c0799Ji) {
        this.A00 = c0799Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.facebook.ads.redexgen.core.C1353c7 c1353c7;
        com.facebook.ads.redexgen.core.C1353c7 c1353c72;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            c1353c7 = this.A00.A0b;
            if (c1353c7.A0D() != null) {
                c1353c72 = this.A00.A0b;
                c1353c72.A0D().AFw(true);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
