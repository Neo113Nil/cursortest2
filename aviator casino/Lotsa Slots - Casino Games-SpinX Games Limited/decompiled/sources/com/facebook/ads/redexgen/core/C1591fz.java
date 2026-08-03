package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1591fz {
    public com.facebook.ads.redexgen.core.C1595g3 A00;
    public java.util.Set<java.lang.String> A01;
    public java.util.Set<java.lang.String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final com.facebook.ads.redexgen.core.C1591fz A00(com.facebook.ads.redexgen.core.C1595g3 c1595g3) {
        this.A00 = c1595g3;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1591fz A01(java.util.Set<java.lang.String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1591fz A02(java.util.Set<java.lang.String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1591fz A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1591fz A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1592g0 A05() {
        return new com.facebook.ads.redexgen.core.C1592g0(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
