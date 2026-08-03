package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KH extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.KE A00;

    public KH(com.facebook.ads.redexgen.core.KE ke) {
        this.A00 = ke;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        boolean z;
        com.facebook.ads.redexgen.core.C1385cd c1385cd;
        z = this.A00.A0Y;
        if (!z) {
            c1385cd = this.A00.A0K;
            com.facebook.ads.redexgen.core.YB.A0F(1000, c1385cd);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
