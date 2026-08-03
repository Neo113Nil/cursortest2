package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GD implements com.facebook.ads.redexgen.core.InterfaceC1467dy {
    public final /* synthetic */ com.facebook.ads.redexgen.core.GB A00;

    public GD(com.facebook.ads.redexgen.core.GB gb) {
        this.A00 = gb;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1467dy
    public final void AIY() {
        boolean z;
        com.facebook.ads.redexgen.core.C0908No c0908No;
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
        com.facebook.ads.redexgen.core.ZU zu;
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh2;
        com.facebook.ads.redexgen.core.ZU zu2;
        com.facebook.ads.redexgen.core.ZU zu3;
        com.facebook.ads.redexgen.core.C0908No c0908No2;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd;
        com.facebook.ads.redexgen.core.InterfaceC1178Yi A05;
        android.content.Intent intent;
        com.facebook.ads.redexgen.core.InterfaceC1178Yi interfaceC1178Yi;
        android.content.Intent intent2;
        android.os.Bundle bundle;
        com.facebook.ads.redexgen.core.InterfaceC1178Yi interfaceC1178Yi2;
        this.A00.A0B();
        z = this.A00.A0E;
        if (!z || this.A00.A01 == null) {
            c0908No = this.A00.A07;
            if (c0908No == null) {
                interfaceC1177Yh = this.A00.A0C;
                zu = this.A00.A0D;
                interfaceC1177Yh.A4j(zu.A81());
                interfaceC1177Yh2 = this.A00.A0C;
                zu2 = this.A00.A0D;
                interfaceC1177Yh2.A4j(zu2.A7w());
                return;
            }
            com.facebook.ads.redexgen.core.GB gb = this.A00;
            com.facebook.ads.redexgen.core.GB gb2 = this.A00;
            zu3 = this.A00.A0D;
            c0908No2 = this.A00.A07;
            abstractC1801jd = this.A00.A05;
            A05 = gb2.A05(zu3, c0908No2, java.lang.Boolean.valueOf(abstractC1801jd.A1n()));
            gb.A04 = A05;
            intent = this.A00.A02;
            if (intent != null && this.A00.A00 != null) {
                interfaceC1178Yi = this.A00.A04;
                intent2 = this.A00.A02;
                bundle = this.A00.A03;
                interfaceC1178Yi.AAu(intent2, bundle, this.A00.A00);
                return;
            }
            return;
        }
        if (this.A00.A01 instanceof com.facebook.ads.redexgen.core.MW) {
            this.A00.A04 = this.A00.A01;
            interfaceC1178Yi2 = this.A00.A04;
            ((com.facebook.ads.redexgen.core.MW) interfaceC1178Yi2).A0b();
        }
    }
}
