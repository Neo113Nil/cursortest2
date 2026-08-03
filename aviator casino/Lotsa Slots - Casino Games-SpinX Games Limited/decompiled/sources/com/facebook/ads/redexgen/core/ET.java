package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class ET extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4L A00;

    public ET(com.facebook.ads.redexgen.core.C4L c4l) {
        this.A00 = c4l;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        com.facebook.ads.redexgen.core.AbstractC0654Dr abstractC0654Dr;
        com.facebook.ads.redexgen.core.UN un;
        com.facebook.ads.redexgen.core.UN un2;
        com.facebook.ads.redexgen.core.UN un3;
        com.facebook.ads.redexgen.core.UN un4;
        com.facebook.ads.redexgen.core.UN un5;
        com.facebook.ads.redexgen.core.UN un6;
        com.facebook.ads.redexgen.core.UN un7;
        com.facebook.ads.redexgen.core.UN un8;
        com.facebook.ads.redexgen.core.E0 e0;
        com.facebook.ads.redexgen.core.UN un9;
        com.facebook.ads.redexgen.core.C1510eg c1510eg;
        com.facebook.ads.redexgen.core.C1510eg c1510eg2;
        c0673Ek = this.A00.A0C;
        com.facebook.ads.redexgen.core.UM<com.facebook.ads.redexgen.core.UN, com.facebook.ads.redexgen.core.UL> eventBus = c0673Ek.getEventBus();
        abstractC0654Dr = this.A00.A0E;
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
        eventBus.A04(abstractC0654Dr, un, un2, un3, un4, un5, un6, un7, un8, e0, un9);
        c1510eg = this.A00.A01;
        if (c1510eg != null) {
            c1510eg2 = this.A00.A01;
            c1510eg2.A07();
        }
    }
}
