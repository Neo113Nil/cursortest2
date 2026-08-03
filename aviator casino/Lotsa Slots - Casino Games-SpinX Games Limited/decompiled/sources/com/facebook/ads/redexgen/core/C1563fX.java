package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1563fX {
    public static byte[] A02;
    public final com.facebook.ads.redexgen.core.AA A00;
    public final com.facebook.ads.redexgen.core.C2004nA A01 = new com.facebook.ads.redexgen.core.C2004nA();

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, com.google.common.base.Ascii.FF, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, com.google.common.base.Ascii.DLE, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C1563fX(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        com.facebook.ads.redexgen.core.InterfaceC0675Em trackSelectionFactory = new com.facebook.ads.redexgen.core.C2021nR(this.A01);
        com.facebook.ads.redexgen.core.C05539h c05539h = new com.facebook.ads.redexgen.core.C05539h(trackSelectionFactory);
        com.facebook.ads.redexgen.core.AnonymousClass74 loadControl = new com.facebook.ads.redexgen.core.C2114ox();
        this.A00 = com.facebook.ads.redexgen.core.AbstractC04756b.A00(new com.facebook.ads.redexgen.core.C2111ou(c1636gi), c05539h, loadControl, this.A01);
    }

    public static java.lang.String A01(com.facebook.ads.redexgen.core.C2177pz c2177pz) {
        boolean z = c2177pz instanceof com.facebook.ads.redexgen.core.AD;
        java.lang.String A00 = A00(36, 2, 118);
        java.lang.String A002 = A00(0, 14, 108);
        if (z) {
            com.facebook.ads.redexgen.core.AD ad = (com.facebook.ads.redexgen.core.AD) c2177pz;
            return A00(55, 11, 8) + ad.A03 + A00(14, 22, 98) + ad.A02 + A002 + ad.getCause() + A00;
        }
        return A00(41, 14, 99) + c2177pz.getMessage() + A002 + c2177pz.getCause() + A00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7e();
    }

    public final long A07() {
        return this.A00.A7s();
    }

    public final com.facebook.ads.redexgen.core.C1561fV A08() {
        com.facebook.ads.redexgen.core.C2196qI vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C1561fV(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f) {
        this.A00.A0M(f);
    }

    public final void A0D(long j) {
        this.A00.A04(j);
    }

    public final void A0E(android.view.Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(com.facebook.ads.redexgen.core.C1632ge c1632ge, android.net.Uri uri) {
        if (com.facebook.ads.redexgen.core.C1086Up.A2z(c1632ge, A03())) {
            com.facebook.ads.redexgen.core.C1567fb cacheManager = com.facebook.ads.redexgen.core.C1567fb.A06(c1632ge);
            com.facebook.ads.redexgen.core.C5Y cachedDataSourceFactory = cacheManager.A0H(c1632ge);
            this.A00.A0Q(new com.facebook.ads.redexgen.core.C05589o(cachedDataSourceFactory).A04(uri));
            return;
        }
        com.facebook.ads.redexgen.core.InterfaceC0634Cx mediaSource = new com.facebook.ads.redexgen.core.C05589o(new com.facebook.ads.redexgen.core.C2131pE(c1632ge, com.facebook.ads.redexgen.core.C5C.A0j(c1632ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(com.facebook.ads.redexgen.core.InterfaceC1560fU interfaceC1560fU) {
        this.A00.A0O(new com.facebook.ads.redexgen.core.D6(this, interfaceC1560fU));
    }

    public final void A0H(final com.facebook.ads.redexgen.core.InterfaceC1562fW interfaceC1562fW) {
        this.A00.A0P(new com.facebook.ads.redexgen.core.InterfaceC2102ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.facebook.ads.redexgen.core.C5L
            public final void AGa(int i, int i2, int i3, float f) {
                interfaceC1562fW.AGa(i, i2, i3, f);
            }
        });
    }

    public final void A0I(boolean z) {
        this.A00.A0S(z);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
