package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GE implements com.facebook.ads.redexgen.core.InterfaceC1466dx {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4V A00;

    public GE(com.facebook.ads.redexgen.core.C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1466dx
    public final void A9l() {
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3;
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c32;
        abstractC1349c3 = this.A00.A02;
        if (abstractC1349c3 instanceof com.facebook.ads.redexgen.core.C6H) {
            abstractC1349c32 = this.A00.A02;
            ((com.facebook.ads.redexgen.core.C6H) abstractC1349c32).A1X();
            com.facebook.ads.redexgen.core.VI.A02(com.facebook.ads.redexgen.core.VH.A0e, null, ((com.facebook.ads.redexgen.core.AbstractC0723Gj) this.A00).A03.A2E(), ((com.facebook.ads.redexgen.core.AbstractC0723Gj) this.A00).A05.A0A());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1466dx
    public final void AJz() {
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3;
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c32;
        com.facebook.ads.redexgen.core.C4L c4l;
        abstractC1349c3 = this.A00.A02;
        if (abstractC1349c3 instanceof com.facebook.ads.redexgen.core.C6H) {
            abstractC1349c32 = this.A00.A02;
            c4l = this.A00.A0N;
            ((com.facebook.ads.redexgen.core.C6H) abstractC1349c32).A1b(c4l);
            com.facebook.ads.redexgen.core.VI.A02(com.facebook.ads.redexgen.core.VH.A0e, null, ((com.facebook.ads.redexgen.core.AbstractC0723Gj) this.A00).A03.A2E(), ((com.facebook.ads.redexgen.core.AbstractC0723Gj) this.A00).A05.A0A());
        }
        this.A00.A0n();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1466dx
    public final void AKE() {
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3;
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c32;
        this.A00.A0e();
        abstractC1349c3 = this.A00.A02;
        if (abstractC1349c3 instanceof com.facebook.ads.redexgen.core.C6H) {
            abstractC1349c32 = this.A00.A02;
            ((com.facebook.ads.redexgen.core.C6H) abstractC1349c32).getAdDetailsView().setVisibility(8);
        }
    }
}
