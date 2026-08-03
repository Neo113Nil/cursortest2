package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1534f4 extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1632ge A00;

    public C1534f4(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        this.A00 = c1632ge;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        for (com.facebook.ads.redexgen.core.TY ty : com.facebook.ads.redexgen.core.TX.A02()) {
            com.facebook.ads.redexgen.core.TX.A0A(this.A00, ty.A02(), ty.A00(), ty.A01(), false);
        }
        com.facebook.ads.redexgen.core.TX.A02().clear();
    }
}
