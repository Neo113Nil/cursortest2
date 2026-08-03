package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1747iZ implements com.facebook.ads.redexgen.core.OG {
    public static byte[] A09;
    public static final java.lang.String A0A;
    public long A01;
    public com.facebook.ads.RewardedVideoAd A02;
    public com.facebook.ads.redexgen.core.NQ A03;
    public com.facebook.ads.redexgen.core.C05007a A04;
    public final com.facebook.ads.redexgen.core.C1636gi A06;
    public final com.facebook.ads.S2SRewardedVideoAdExtendedListener A07;
    public final com.facebook.ads.redexgen.core.C1731iI A08;
    public boolean A05 = false;
    public long A00 = -1;

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0A() {
        A09 = new byte[]{116, -95, 83, -108, -105, 83, -97, -94, -108, -105, 83, -100, -90, 83, -108, -97, -91, -104, -108, -105, -84, 83, -100, -95, 83, -93, -91, -94, -102, -91, -104, -90, -90, 97, 83, -116, -94, -88, 83, -90, -101, -94, -88, -97, -105, 83, -86, -108, -100, -89, 83, -103, -94, -91, 83, -108, -105, Byte.MAX_VALUE, -94, -108, -105, -104, -105, 91, 92, 83, -89, -94, 83, -107, -104, 83, -106, -108, -97, -97, -104, -105, -60, -15, -15, -18, -15, -97, -21, -18, -32, -29, -24, -19, -26, -97, -15, -28, -10, -32, -15, -29, -28, -29, -97, -11, -24, -29, -28, -18, -97, -32, -29, -19, -4, -11};
    }

    static {
        A0A();
        A0A = com.facebook.ads.redexgen.core.C1747iZ.class.getSimpleName();
    }

    public C1747iZ(com.facebook.ads.redexgen.core.C1731iI c1731iI, com.facebook.ads.redexgen.core.OW ow, java.lang.String str) {
        this.A08 = c1731iI;
        this.A06 = c1731iI.A0B;
        this.A07 = new com.facebook.ads.redexgen.core.C1728iF(str, ow, this, c1731iI);
    }

    private void A0C(java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType, boolean z) {
        java.lang.String extraHints;
        if (!this.A05 && this.A04 != null) {
            android.util.Log.w(A0A, A09(0, 78, 37));
        }
        A0D(false);
        this.A05 = false;
        com.facebook.ads.redexgen.core.O7 o7 = new com.facebook.ads.redexgen.core.O7(this.A08.A0D, com.facebook.ads.redexgen.core.EnumC1111Vq.A07, com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO, com.facebook.ads.redexgen.core.EnumC1110Vp.A08, 1, this.A08.A0C);
        o7.A08(z);
        if (com.facebook.ads.redexgen.core.C1086Up.A2g(this.A06) && (extraHints = com.facebook.ads.redexgen.core.XC.A02(this.A06, this.A08.A06)) != null) {
            this.A08.A06 = extraHints;
        }
        o7.A06(this.A08.A06);
        o7.A07(this.A08.A07);
        this.A04 = new com.facebook.ads.redexgen.core.C05007a(this.A08.A0B, o7);
        this.A04.A0S(new com.facebook.ads.redexgen.core.C1749ib(this));
        this.A04.A0X(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z) {
        if (this.A04 != null) {
            this.A04.A0S(new com.facebook.ads.redexgen.core.C1748ia(this));
            this.A04.A0Y(z);
            this.A04.A0K();
            this.A04 = null;
        }
    }

    public final long A0F() {
        if (this.A04 != null) {
            return this.A04.A0G();
        }
        return -1L;
    }

    public final com.facebook.ads.redexgen.core.C1731iI A0G() {
        return this.A08;
    }

    public final com.facebook.ads.redexgen.core.C1636gi A0H() {
        return this.A06;
    }

    public final void A0I(com.facebook.ads.RewardData rewardData) {
        this.A08.A03 = rewardData;
        if (this.A05 && this.A04 != null) {
            this.A04.A0a(rewardData);
        }
    }

    public final void A0J(java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType, boolean z) {
        this.A00 = java.lang.System.currentTimeMillis();
        try {
            A0C(str, adExperienceType, z);
        } catch (java.lang.Exception e) {
            android.util.Log.e(A0A, A09(78, 31, 113), e);
            this.A08.A0B.A08().ABC(A09(109, 3, 126), com.facebook.ads.redexgen.core.AbstractC1048Td.A0b, new com.facebook.ads.redexgen.core.C1049Te(e));
            com.facebook.ads.AdError internalError = com.facebook.ads.AdError.internalError(2004);
            this.A08.A0B.A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A00), internalError.getErrorCode(), internalError.getErrorMessage());
            this.A07.onError(this.A08.A6k(), internalError);
        }
    }

    public final boolean A0K() {
        return this.A04 == null || this.A04.A0Z();
    }

    public final boolean A0L() {
        return this.A05;
    }

    public final boolean A0M(int i, long j) {
        if (!this.A05) {
            this.A07.onError(this.A08.A6k(), com.facebook.ads.AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A04 != null) {
            this.A01 = java.lang.System.currentTimeMillis();
            this.A04.A08.A02(i);
            this.A04.A08.A03(j);
            this.A04.A0M();
            this.A05 = false;
            return true;
        }
        this.A05 = false;
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.OG
    public final void destroy() {
        A0D(true);
    }
}
