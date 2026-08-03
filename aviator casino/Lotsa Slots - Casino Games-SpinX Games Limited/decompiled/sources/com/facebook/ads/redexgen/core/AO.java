package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AO implements com.facebook.ads.redexgen.core.C5Y {
    public com.facebook.ads.redexgen.core.InterfaceC04675t A02;
    public com.facebook.ads.redexgen.core.InterfaceC1867kj<java.lang.String> A03;
    public java.lang.String A04;
    public boolean A05;
    public boolean A06;
    public final com.facebook.ads.redexgen.core.C04625o A07 = new com.facebook.ads.redexgen.core.C04625o();
    public int A00 = 8000;
    public int A01 = 8000;

    public final com.facebook.ads.redexgen.core.AO A00(com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
        this.A02 = interfaceC04675t;
        return this;
    }

    public final com.facebook.ads.redexgen.core.AO A01(java.lang.String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C5Y
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C03581k A5I() {
        com.facebook.ads.redexgen.core.C03581k c03581k = new com.facebook.ads.redexgen.core.C03581k(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c03581k.A43(this.A02);
        }
        return c03581k;
    }
}
