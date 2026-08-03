package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0678Ep extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0673Ek A02;

    public C0678Ep(com.facebook.ads.redexgen.core.C0673Ek c0673Ek, int i, int i2) {
        this.A02 = c0673Ek;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.UM um;
        um = this.A02.A0C;
        um.A02(new com.facebook.ads.redexgen.core.C0661Dy(this.A00, this.A01));
    }
}
