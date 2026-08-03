package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GZ extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04454x A00;

    public GZ(com.facebook.ads.redexgen.core.C04454x c04454x) {
        this.A00 = c04454x;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3;
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c32;
        abstractC1349c3 = this.A00.A00;
        if (abstractC1349c3 != null) {
            abstractC1349c32 = this.A00.A00;
            if (abstractC1349c32.A1N()) {
                ((com.facebook.ads.redexgen.core.AbstractC0723Gj) this.A00).A02 = true;
                this.A00.A09.setToolbarActionMode(8);
            }
        }
    }
}
