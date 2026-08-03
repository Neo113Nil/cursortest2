package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F1 extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0683Eu A00;

    public F1(com.facebook.ads.redexgen.core.C0683Eu c0683Eu) {
        this.A00 = c0683Eu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.C1510eg c1510eg;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        com.facebook.ads.redexgen.core.E4 e4;
        com.facebook.ads.redexgen.core.EA ea;
        c1510eg = this.A00.A03;
        c1510eg.A07();
        c0673Ek = this.A00.A04;
        com.facebook.ads.redexgen.core.UM<com.facebook.ads.redexgen.core.UN, com.facebook.ads.redexgen.core.UL> eventBus = c0673Ek.getEventBus();
        e4 = this.A00.A06;
        ea = this.A00.A05;
        eventBus.A04(e4, ea);
    }
}
