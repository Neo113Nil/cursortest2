package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class Q1 extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ android.content.DialogInterface A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.YR A01;

    public Q1(com.facebook.ads.redexgen.core.YR yr, android.content.DialogInterface dialogInterface) {
        this.A01 = yr;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.InterfaceC1587fv interfaceC1587fv;
        com.facebook.ads.redexgen.core.InterfaceC1587fv interfaceC1587fv2;
        com.facebook.ads.redexgen.core.C1632ge c1632ge;
        java.util.Map<? extends java.lang.String, ? extends java.lang.String> A02;
        interfaceC1587fv = this.A01.A01.A02;
        if (interfaceC1587fv != null) {
            interfaceC1587fv2 = this.A01.A01.A02;
            c1632ge = this.A01.A01.A00;
            java.lang.String A03 = com.facebook.ads.redexgen.core.WI.A03(c1632ge);
            com.facebook.ads.redexgen.core.C1601g9 c1601g9 = new com.facebook.ads.redexgen.core.C1601g9();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC1587fv2.AGx(A03, c1601g9.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
