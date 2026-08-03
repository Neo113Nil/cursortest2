package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Wr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1137Wr extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.Wm A00;

    public C1137Wr(com.facebook.ads.redexgen.core.Wm wm) {
        this.A00 = wm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        long j;
        long j2;
        com.facebook.ads.redexgen.core.Wm.A00(this.A00);
        j = this.A00.A01;
        if (j > 0) {
            try {
                j2 = this.A00.A01;
                java.lang.Thread.sleep(j2);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
