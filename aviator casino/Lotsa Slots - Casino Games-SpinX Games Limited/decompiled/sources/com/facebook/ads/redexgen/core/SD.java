package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class SD implements com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.internal.context.Repairable {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.SH A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{80, 80, 1, 84, 82, 91, 91, 2, 54, 52, 97, 96, 100, 96, 55, 96, 108, 106, 59, 56, 60, 105, 56, 63, com.google.common.base.Ascii.SO, 93, 93, com.google.common.base.Ascii.FF, 10, 88, 8, com.google.common.base.Ascii.VT, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 119, 101, 115, 96, 118, 119, 118, 50, 123, 124, 102, 119, 96, 97, 102, 123, 102, 123, 115, 126, 50, 115, 118, 50, 118, 119, 97, 102, 96, 125, 107, 119, 118, com.google.common.base.Ascii.RS, 41, 59, 45, 62, 40, 41, 40, 108, 37, 34, 56, 41, 62, 63, 56, 37, 56, 37, 45, 32, 108, 45, 40, 108, 32, 35, 45, 40, 108, 62, 41, kotlin.io.encoding.Base64.padSymbol, 57, 41, 63, 56, 41, 40, 122, 77, 95, 73, 90, 76, 77, 76, 8, 65, 70, 92, 77, 90, 91, 92, 65, 92, 65, 73, 68, 8, 73, 76, 8, 91, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 95, 8, 75, 73, 68, 68, 77, 76, 126, Byte.MAX_VALUE, 105, 110, 104, 117, 99, com.google.common.base.Ascii.US, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, 50, com.google.common.base.Ascii.ETB, 41, 50, 53, 45};
    }

    public SD(android.content.Context context, java.lang.String str, com.facebook.ads.RewardedInterstitialAd rewardedInterstitialAd) {
        this.A00 = new com.facebook.ads.redexgen.core.SH(context, str, rewardedInterstitialAd);
    }

    @Override // com.facebook.ads.FullScreenAd
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new com.facebook.ads.redexgen.core.SF(this.A00.buildLoadAdConfig());
    }

    @Override // com.facebook.ads.FullScreenAd
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new com.facebook.ads.redexgen.core.SG(this.A00.buildShowAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void destroy() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(141, 7, 88), A00(32, 34, 80), A00(24, 8, 121));
        this.A00.A04();
    }

    public final void finalize() {
        this.A00.finalize();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final java.lang.String getPlacementId() {
        return this.A00.getPlacementId();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final int getVideoDuration() {
        return this.A00.getVideoDuration();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        return this.A00.isAdInvalidated();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A00.isAdLoaded();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(148, 6, 49), A00(66, 39, 14), A00(16, 8, 27));
        this.A00.A07(null, com.facebook.ads.AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void loadAd(com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        ((com.facebook.ads.redexgen.core.SF) rewardedInterstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(java.lang.Throwable th) {
        this.A00.repair(th);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    @java.lang.Deprecated
    public final void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.A00.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(154, 4, 24), A00(105, 36, 106), A00(0, 8, 33));
        return this.A00.A08(new com.facebook.ads.redexgen.core.SJ().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean show(com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(154, 4, 24), A00(105, 36, 106), A00(8, 8, 64));
        return this.A00.A08(((com.facebook.ads.redexgen.core.SG) rewardedInterstitialShowAdConfig).A00());
    }
}
