package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class ET extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C4L A00;

    public ET(C4L c4l) {
        this.A00 = c4l;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        C1967Ek c1967Ek;
        AbstractC1948Dr abstractC1948Dr;
        UN un;
        UN un2;
        UN un3;
        UN un4;
        UN un5;
        UN un6;
        UN un7;
        UN un8;
        E0 e0;
        UN un9;
        C2804eg c2804eg;
        C2804eg c2804eg2;
        c1967Ek = this.A00.A0C;
        UM<UN, UL> eventBus = c1967Ek.getEventBus();
        abstractC1948Dr = this.A00.A0E;
        un = this.A00.A06;
        un2 = this.A00.A08;
        un3 = this.A00.A05;
        un4 = this.A00.A04;
        un5 = this.A00.A03;
        un6 = this.A00.A07;
        un7 = this.A00.A0A;
        un8 = this.A00.A0B;
        e0 = this.A00.A0D;
        un9 = this.A00.A09;
        eventBus.A04(abstractC1948Dr, un, un2, un3, un4, un5, un6, un7, un8, e0, un9);
        c2804eg = this.A00.A01;
        if (c2804eg != null) {
            c2804eg2 = this.A00.A01;
            c2804eg2.A07();
        }
    }
}
