package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.it, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1764it extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05227w A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.O8 A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05007a A02;

    public C1764it(com.facebook.ads.redexgen.core.C05007a c05007a, com.facebook.ads.redexgen.core.O8 o8, com.facebook.ads.redexgen.core.C05227w c05227w) {
        this.A02 = c05007a;
        this.A01 = o8;
        this.A00 = c05227w;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5g(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new com.facebook.ads.redexgen.core.C1108Vm(adErrorType, ""));
    }
}
