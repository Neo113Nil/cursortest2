package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F1 extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C1977Eu A00;

    public F1(C1977Eu c1977Eu) {
        this.A00 = c1977Eu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        C2804eg c2804eg;
        C1967Ek c1967Ek;
        E4 e4;
        EA ea;
        c2804eg = this.A00.A03;
        c2804eg.A07();
        c1967Ek = this.A00.A04;
        UM<UN, UL> eventBus = c1967Ek.getEventBus();
        e4 = this.A00.A06;
        ea = this.A00.A05;
        eventBus.A04(e4, ea);
    }
}
