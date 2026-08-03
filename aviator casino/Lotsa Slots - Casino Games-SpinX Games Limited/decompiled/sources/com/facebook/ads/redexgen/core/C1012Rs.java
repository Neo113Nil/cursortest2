package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1012Rs implements com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.internal.context.Repairable {
    public static byte[] A04;
    public final com.facebook.ads.InterstitialAd A00;
    public final com.facebook.ads.redexgen.core.C1746iY A01;
    public final com.facebook.ads.redexgen.core.C7Y A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-64, -64, -11, -16, -16, -63, -63, -61, -29, -27, -27, com.google.common.base.Ascii.NAK, -29, -21, -25, -27, -38, -39, -43, -36, -41, -41, 6, 8, 2, 39, 45, com.google.common.base.Ascii.RS, 43, 39, com.google.common.base.Ascii.SUB, 37, -39, com.google.common.base.Ascii.RS, 43, 43, 40, 43, -25, -61, 44, 81, 87, 72, 85, 86, 87, 76, 87, 76, 68, 79, 3, 68, 71, 3, 71, 72, 86, 87, 85, 82, 92, 72, 71, 50, 87, 93, 78, 91, 92, 93, 82, 93, 82, 74, 85, 9, 74, 77, 9, 85, 88, 74, 77, 9, 91, 78, 90, 94, 78, 92, 93, 78, 77, 39, 76, 82, 67, 80, 81, 82, 71, 82, 71, 63, 74, -2, 63, 66, -2, 81, 70, 77, 85, -2, 65, 63, 74, 74, 67, 66, -13, -12, 2, 3, 1, -2, 8, 88, 99, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 99, 85, 88, 53, 88, -8, -19, -12, -4};
    }

    public C1012Rs(android.content.Context context, java.lang.String str, com.facebook.ads.InterstitialAd interstitialAd) {
        java.lang.String uuid;
        this.A00 = interstitialAd;
        if (context instanceof com.facebook.ads.redexgen.core.C1636gi) {
            this.A03 = (com.facebook.ads.redexgen.core.C1636gi) context;
            uuid = this.A03.A0F().getId();
        } else {
            uuid = java.util.UUID.randomUUID().toString();
            this.A03 = com.facebook.ads.redexgen.core.C1009Rp.A06(context, uuid);
        }
        com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = this.A03.A0F();
        java.lang.String adId = com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.toString();
        A0F.A3T(adId, str);
        this.A01 = new com.facebook.ads.redexgen.core.C1746iY(this.A03, interstitialAd, str);
        this.A03.A0O(this);
        this.A02 = new com.facebook.ads.redexgen.core.C7Y(this.A01, uuid);
    }

    public final void A02(com.facebook.ads.InterstitialAdListener interstitialAdListener) {
        this.A03.A0F().A3M(interstitialAdListener != null);
        this.A01.A0E(interstitialAdListener);
    }

    public final void A03(com.facebook.ads.RewardData rewardData) {
        this.A02.A0F(rewardData);
    }

    public final void A04(com.facebook.ads.RewardedAdListener rewardedAdListener) {
        this.A01.A0G(rewardedAdListener);
    }

    public final void A05(java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet, java.lang.String str) {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(129, 8, 122), A00(65, 30, 111), A00(16, 8, 42));
        if (str == null) {
            this.A03.A0F().A3Q();
        } else {
            this.A03.A0F().A3P();
        }
        this.A02.A0E(this.A00, enumSet, str);
        this.A03.A0F().A3O();
    }

    @Override // com.facebook.ads.FullScreenAd
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new com.facebook.ads.redexgen.core.C1013Rt(this);
    }

    @Override // com.facebook.ads.FullScreenAd
    public final com.facebook.ads.InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new com.facebook.ads.redexgen.core.C1014Ru();
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(122, 7, 21), A00(40, 25, 105), A00(0, 8, 21));
        if (com.facebook.ads.redexgen.core.C1086Up.A2M(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0F().A3U();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.Ad
    public final java.lang.String getPlacementId() {
        return this.A01.A0A();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean A0G = this.A02.A0G();
        this.A03.A0F().A5f(A0G);
        return A0G;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0H();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        A05(com.facebook.ads.CacheFlag.ALL, null);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((com.facebook.ads.redexgen.core.C1013Rt) interstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(java.lang.Throwable th) {
        if (this.A01.A6o() != null) {
            this.A01.A6o().onError(this.A00, new com.facebook.ads.AdError(2001, A00(24, 16, 63) + com.facebook.ads.redexgen.core.AbstractC1163Xt.A03(this.A03, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.Ad
    @java.lang.Deprecated
    public final void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.A01.A0I(extraHints.getHints());
        this.A01.A0J(extraHints.getMediationData());
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 4, 11), A00(95, 27, 100), A00(8, 8, 56));
        this.A03.A0F().A3Z();
        boolean A0I = this.A02.A0I(this.A00, new com.facebook.ads.redexgen.core.C1014Ru());
        this.A03.A0F().A3Y(A0I);
        return A0I;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean show(com.facebook.ads.InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A03.A0F().A3Z();
        boolean A0I = this.A02.A0I(this.A00, interstitialShowAdConfig);
        this.A03.A0F().A3Y(A0I);
        return A0I;
    }
}
