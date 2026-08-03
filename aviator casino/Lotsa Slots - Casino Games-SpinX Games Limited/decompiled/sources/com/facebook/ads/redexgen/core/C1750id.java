package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.id, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1750id implements com.facebook.ads.redexgen.core.OG {
    public static byte[] A09;
    public static final java.lang.String A0A;
    public long A00 = -1;
    public com.facebook.ads.InterstitialAd A01;
    public com.facebook.ads.redexgen.core.NQ A02;
    public com.facebook.ads.redexgen.core.C05097j A03;
    public boolean A04;
    public boolean A05;
    public final com.facebook.ads.redexgen.core.C1636gi A06;
    public final com.facebook.ads.InterstitialAdExtendedListener A07;
    public final com.facebook.ads.redexgen.core.C1746iY A08;

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0A() {
        A09 = new byte[]{-88, -43, -121, -56, -53, -121, -45, -42, -56, -53, -121, -48, -38, -121, -56, -45, -39, -52, -56, -53, -32, -121, -48, -43, -121, -41, -39, -42, -50, -39, -52, -38, -38, -107, -121, -64, -42, -36, -121, -38, -49, -42, -36, -45, -53, -121, -34, -56, -48, -37, -121, -51, -42, -39, -121, -56, -53, -77, -42, -56, -53, -52, -53, -113, -112, -121, -37, -42, -121, -55, -52, -121, -54, -56, -45, -45, -52, -53, -103, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, 112, -68, -65, -79, -76, 112, -77, -79, -68, -68, -75, -76, 112, -57, -72, -71, -68, -75, 112, -61, -72, -65, -57, -71, -66, -73, 112, -71, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, 126, -33, -18, -25};
    }

    static {
        A0A();
        A0A = com.facebook.ads.redexgen.core.C1750id.class.getSimpleName();
    }

    public C1750id(com.facebook.ads.redexgen.core.C1746iY c1746iY, com.facebook.ads.redexgen.core.OW ow, java.lang.String str) {
        this.A08 = c1746iY;
        this.A06 = c1746iY.A05();
        this.A07 = new com.facebook.ads.redexgen.core.C1729iG(str, ow, this);
    }

    public final long A0D() {
        if (this.A03 != null) {
            return this.A03.A0G();
        }
        return -1L;
    }

    public final com.facebook.ads.redexgen.core.C1746iY A0E() {
        return this.A08;
    }

    public final com.facebook.ads.redexgen.core.C1636gi A0F() {
        return this.A06;
    }

    public final void A0G(java.util.EnumSet<com.facebook.ads.CacheFlag> cacheFlags, java.lang.String str) {
        java.lang.String A02;
        this.A00 = java.lang.System.currentTimeMillis();
        if (!this.A05 && this.A03 != null) {
            android.util.Log.w(A0A, A09(0, 78, 45));
        }
        this.A05 = false;
        if (this.A04 && !com.facebook.ads.redexgen.core.C1086Up.A0i(this.A06)) {
            this.A06.A08().ABC(A09(130, 3, 68), com.facebook.ads.redexgen.core.AbstractC1048Td.A0L, new com.facebook.ads.redexgen.core.C1049Te(A09(78, 52, 22)));
            com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A06.A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A07.onError(this.A08.A6k(), new com.facebook.ads.AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        if (this.A03 != null) {
            this.A03.A0S(new com.facebook.ads.redexgen.core.C1754ii(this));
            this.A03.A0N();
            this.A03.A0K();
            this.A03 = null;
        }
        com.facebook.ads.redexgen.core.O7 o7 = new com.facebook.ads.redexgen.core.O7(this.A08.A0A(), com.facebook.ads.redexgen.core.AbstractC1113Vs.A00(this.A06.getResources().getDisplayMetrics()), com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL, com.facebook.ads.redexgen.core.EnumC1110Vp.A08, 1, cacheFlags, this.A08.A06());
        if (com.facebook.ads.redexgen.core.C1086Up.A2g(this.A06) && (A02 = com.facebook.ads.redexgen.core.XC.A02(this.A06, this.A08.A08())) != null) {
            this.A08.A0I(A02);
        }
        o7.A06(this.A08.A08());
        o7.A07(this.A08.A09());
        o7.A04(this.A08.A03());
        this.A03 = new com.facebook.ads.redexgen.core.C05097j(this.A06, o7);
        this.A03.A0S(new com.facebook.ads.redexgen.core.Cif(this));
        this.A03.A0W(str);
    }

    public final boolean A0H() {
        return this.A03 == null || this.A03.A0Z();
    }

    public final boolean A0I() {
        return this.A05;
    }

    public final boolean A0J() {
        com.facebook.ads.AdError adError = com.facebook.ads.AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A05) {
            this.A06.A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A6k(), adError);
            return false;
        }
        if (this.A03 == null) {
            this.A06.A08().ABC(A09(130, 3, 68), com.facebook.ads.redexgen.core.AbstractC1048Td.A0S, new com.facebook.ads.redexgen.core.C1049Te(com.facebook.ads.internal.protocol.AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A06.A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A6k(), adError);
            return false;
        }
        this.A03.A0M();
        this.A04 = true;
        this.A05 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final void destroy() {
        if (this.A03 != null) {
            this.A03.A0S(new com.facebook.ads.redexgen.core.C1751ie(this));
            this.A03.A0Y(true);
            this.A03.A0K();
            this.A03 = null;
            this.A05 = false;
            this.A04 = false;
        }
    }
}
