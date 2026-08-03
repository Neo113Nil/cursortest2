package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Sr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1036Sr extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ long A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.WA A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.WD A02;
    public final /* synthetic */ java.lang.String A03;

    public C1036Sr(com.facebook.ads.redexgen.core.WD wd, java.lang.String str, long j, com.facebook.ads.redexgen.core.WA wa) {
        this.A02 = wd;
        this.A03 = str;
        this.A00 = j;
        this.A01 = wa;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        this.A02.A0N(this.A03, this.A00, this.A01);
    }
}
