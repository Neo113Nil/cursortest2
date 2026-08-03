package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05097j extends com.facebook.ads.redexgen.core.AbstractC1771j0 {
    public C05097j(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.O7 o7) {
        super(c1636gi, o7);
    }

    private com.facebook.ads.redexgen.core.C1769iy A00(java.lang.Runnable runnable) {
        return new com.facebook.ads.redexgen.core.C1769iy(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771j0
    public final com.facebook.ads.redexgen.core.NQ A0I() {
        com.facebook.ads.redexgen.core.C1823jz successfullyLoadedAdapter = (com.facebook.ads.redexgen.core.C1823jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771j0
    public final void A0P() {
        com.facebook.ads.redexgen.core.C1823jz interstitialAdapter = (com.facebook.ads.redexgen.core.C1823jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771j0
    public final void A0R(com.facebook.ads.redexgen.core.N1 n1, com.facebook.ads.redexgen.core.C1067Tw c1067Tw, com.facebook.ads.redexgen.core.C1065Tu c1065Tu, com.facebook.ads.redexgen.core.O8 o8) {
        com.facebook.ads.redexgen.core.C1823jz c1823jz = (com.facebook.ads.redexgen.core.C1823jz) n1;
        com.facebook.ads.redexgen.core.C1770iz c1770iz = new com.facebook.ads.redexgen.core.C1770iz(this, o8, c1823jz);
        A0H().postDelayed(c1770iz, c1067Tw.A05().A05());
        java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = com.facebook.ads.CacheFlag.ALL;
        }
        c1823jz.A0A(this.A0B, A00(c1770iz), o8, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
