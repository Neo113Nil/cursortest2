package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1343bx implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0819Kc A00;

    public RunnableC1343bx(com.facebook.ads.redexgen.core.C0819Kc c0819Kc) {
        this.A00 = c0819Kc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((com.facebook.ads.redexgen.core.AbstractC1349c3) this.A00).A07.A0D() != null) {
                ((com.facebook.ads.redexgen.core.AbstractC1349c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
