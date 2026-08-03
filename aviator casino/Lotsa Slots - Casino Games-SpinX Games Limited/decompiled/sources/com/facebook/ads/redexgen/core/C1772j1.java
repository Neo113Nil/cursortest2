package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1772j1 extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1771j0 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1108Vm A01;

    public C1772j1(com.facebook.ads.redexgen.core.AbstractC1771j0 abstractC1771j0, com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        this.A00 = abstractC1771j0;
        this.A01 = c1108Vm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
