package com.facebook.ads.internal.dynamicloading;

/* loaded from: assets/audience_network/classes2.dex */
public class DynamicLoaderImpl implements com.facebook.ads.internal.dynamicloading.DynamicLoader, com.facebook.ads.internal.dynamicloading.RemoteRenderingApi {
    public static com.facebook.ads.internal.api.AdSettingsApi A00;
    public static com.facebook.ads.internal.api.AudienceNetworkAdsApi A01;
    public static com.facebook.ads.internal.api.NativeAdViewApi A02;
    public static com.facebook.ads.internal.api.NativeBannerAdViewApi A03;
    public static com.facebook.ads.redexgen.core.C1007Rn A04;
    public static java.lang.String[] A05 = {"FC7PnIQgfKJQfBdQKCurjH6JKIFxjroV", "Ez", "t7pjhhQGIazlhmf4UkwJSh", "Iyhtqk6gC8uyo8Dul94yaDEfv0PrNxAT", "5egoyUR4tSKxNoVVXreZdHvR7BDPW4Oi", "IYlCvOKkAZQkBJEI1e2UxVPIL3gdF2Y", "0QNvsKlwTsAv0tvLZz9yZ17i9BLNPSLj", "RauEdYPLg0wTIRL3lDclFm017FzJm5su"};
    public static final com.facebook.ads.internal.api.InitApi A06 = new com.facebook.ads.redexgen.core.C1011Rr();

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdOptionsViewApi createAdOptionsView(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.AdOptionsView.Orientation orientation, int i, com.facebook.ads.AdOptionsView adOptionsView) {
        return new com.facebook.ads.redexgen.core.C1683hT(context, nativeAdBase, nativeAdLayout, orientation, i, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdOptionsViewApi createAdOptionsView(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.AdOptionsView adOptionsView) {
        return new com.facebook.ads.redexgen.core.C1683hT(context, nativeAdBase, nativeAdLayout, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdSettingsApi createAdSettingsApi() {
        if (A00 == null) {
            A00 = new com.facebook.ads.redexgen.core.C0996Rc();
        }
        return A00;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdSizeApi createAdSizeApi(int i) {
        return new com.facebook.ads.redexgen.core.C1070Tz(this, com.facebook.ads.redexgen.core.XG.A02(i));
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdViewApi createAdViewApi(android.content.Context context, java.lang.String str, com.facebook.ads.AdSize adSize, com.facebook.ads.internal.api.AdViewParentApi adViewParentApi, com.facebook.ads.AdView adView) {
        return (com.facebook.ads.internal.api.AdViewApi) com.facebook.ads.redexgen.core.AbstractC0994Ra.A00(new com.facebook.ads.redexgen.core.C0997Rd(context, str, adSize, adViewParentApi, adView), com.facebook.ads.internal.api.AdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdViewApi createAdViewApi(android.content.Context context, java.lang.String str, java.lang.String str2, com.facebook.ads.internal.api.AdViewParentApi adViewParentApi, com.facebook.ads.AdView adView) throws java.lang.Exception {
        try {
            return (com.facebook.ads.internal.api.AdViewApi) com.facebook.ads.redexgen.core.AbstractC0994Ra.A00(new com.facebook.ads.redexgen.core.C0997Rd(context, str, str2, adViewParentApi, adView), com.facebook.ads.internal.api.AdViewApi.class);
        } catch (com.facebook.ads.redexgen.core.C1109Vn e) {
            throw new java.lang.Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AudienceNetworkActivityApi createAudienceNetworkActivity(com.facebook.ads.AudienceNetworkActivity audienceNetworkActivity, com.facebook.ads.internal.api.AudienceNetworkActivityApi audienceNetworkActivityApi) {
        return new com.facebook.ads.redexgen.core.C0999Rf(audienceNetworkActivity, audienceNetworkActivityApi, new com.facebook.ads.redexgen.core.C0998Re(audienceNetworkActivity, audienceNetworkActivityApi));
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AudienceNetworkAdsApi createAudienceNetworkAdsApi() {
        if (A01 == null) {
            A01 = new com.facebook.ads.redexgen.core.C1001Rh();
        }
        com.facebook.ads.internal.api.AudienceNetworkAdsApi audienceNetworkAdsApi = A01;
        if (A05[2].length() != 22) {
            throw new java.lang.RuntimeException();
        }
        A05[3] = "WLYy1k58X1wQ2fFP1Kpc3q8pOUGU5mJB";
        return audienceNetworkAdsApi;
    }

    @Override // com.facebook.ads.internal.dynamicloading.RemoteRenderingApi
    public com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi createAudienceNetworkExportedActivityApi(android.app.Activity activity) {
        return new com.facebook.ads.redexgen.core.V3(activity);
    }

    @Override // com.facebook.ads.internal.dynamicloading.RemoteRenderingApi
    public com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi createAudienceNetworkRemoteService(android.app.Service service) {
        return new com.facebook.ads.redexgen.core.V4(service);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.BidderTokenProviderApi createBidderTokenProviderApi() {
        return getBidderTokenProviderApi();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi() {
        return new com.facebook.ads.redexgen.core.C1120Vz();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.InterstitialAdApi createInterstitialAd(android.content.Context context, java.lang.String str, com.facebook.ads.InterstitialAd interstitialAd) {
        return (com.facebook.ads.internal.api.InterstitialAdApi) com.facebook.ads.redexgen.core.AbstractC0994Ra.A00(new com.facebook.ads.redexgen.core.C1012Rs(context, str, interstitialAd), com.facebook.ads.internal.api.InterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.MediaViewApi createMediaViewApi() {
        return new com.facebook.ads.redexgen.core.C1666hC();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.MediaViewVideoRendererApi createMediaViewVideoRendererApi() {
        return new com.facebook.ads.redexgen.core.C1019Rz();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.redexgen.core.S2 createNativeAdApi(com.facebook.ads.NativeAd nativeAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        return new com.facebook.ads.redexgen.core.S2(nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.redexgen.core.S2 createNativeAdApi(com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        return new com.facebook.ads.redexgen.core.S2(nativeAdBase, nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdBaseApi createNativeAdBaseApi(android.content.Context context, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.UK(context, str, (com.facebook.ads.redexgen.core.InterfaceC1097Va) com.facebook.ads.redexgen.core.UK.A0K(), false);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdBaseApi createNativeAdBaseApi(com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        return new com.facebook.ads.redexgen.core.UK((com.facebook.ads.redexgen.core.UK) nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.NativeAdBase createNativeAdBaseFromBidPayload(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        try {
            return com.facebook.ads.redexgen.core.UK.A0A(context, str, str2);
        } catch (com.facebook.ads.redexgen.core.C1109Vn e) {
            throw new java.lang.Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdImageApi createNativeAdImageApi(org.json.JSONObject jSONObject) {
        return com.facebook.ads.redexgen.core.C1098Vb.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdLayoutApi createNativeAdLayoutApi() {
        return new com.facebook.ads.redexgen.core.C1665hB();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.redexgen.core.C1099Vc createNativeAdRatingApi(org.json.JSONObject jSONObject) {
        return com.facebook.ads.redexgen.core.C1099Vc.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdScrollViewApi createNativeAdScrollViewApi(com.facebook.ads.NativeAdScrollView nativeAdScrollView, android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, com.facebook.ads.NativeAdScrollView.AdViewProvider adViewProvider, int i, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes, int i2) {
        return new com.facebook.ads.redexgen.core.S3(nativeAdScrollView, context, nativeAdsManager, adViewProvider, i, type, nativeAdViewAttributes, i2);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdViewApi createNativeAdViewApi() {
        if (A02 == null) {
            A02 = new com.facebook.ads.redexgen.core.S4();
        }
        return A02;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdViewAttributesApi createNativeAdViewAttributesApi() {
        return new com.facebook.ads.redexgen.core.C1100Vd();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdViewTypeApi createNativeAdViewTypeApi(int i) {
        return new com.facebook.ads.redexgen.core.S5(i);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdsManagerApi createNativeAdsManagerApi(android.content.Context context, java.lang.String str, int i) {
        return (com.facebook.ads.internal.api.NativeAdsManagerApi) com.facebook.ads.redexgen.core.AbstractC0994Ra.A00(new com.facebook.ads.redexgen.core.S6(context, str, i), com.facebook.ads.internal.api.NativeAdsManagerApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeBannerAdApi createNativeBannerAdApi(com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        return new com.facebook.ads.redexgen.core.SA(nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeBannerAdViewApi createNativeBannerAdViewApi() {
        if (A03 == null) {
            A03 = new com.facebook.ads.redexgen.core.SB();
        }
        return A03;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeComponentTagApi createNativeComponentTagApi() {
        return new com.facebook.ads.redexgen.core.SC();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.RewardedInterstitialAdApi createRewardedInterstitialAd(android.content.Context context, java.lang.String str, com.facebook.ads.RewardedInterstitialAd rewardedInterstitialAd) {
        return (com.facebook.ads.internal.api.RewardedInterstitialAdApi) com.facebook.ads.redexgen.core.AbstractC0994Ra.A00(new com.facebook.ads.redexgen.core.SD(context, str, rewardedInterstitialAd), com.facebook.ads.internal.api.RewardedInterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.RewardedVideoAdApi createRewardedVideoAd(android.content.Context context, java.lang.String str, com.facebook.ads.RewardedVideoAd rewardedVideoAd) {
        return (com.facebook.ads.internal.api.RewardedVideoAdApi) com.facebook.ads.redexgen.core.AbstractC0994Ra.A00(new com.facebook.ads.redexgen.core.SH(context, str, rewardedVideoAd), com.facebook.ads.internal.api.RewardedVideoAdApi.class);
    }

    public static com.facebook.ads.redexgen.core.C1007Rn getBidderTokenProviderApi() {
        if (A04 == null) {
            A04 = new com.facebook.ads.redexgen.core.C1007Rn();
        }
        return A04;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.InitApi getInitApi() {
        return A06;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public void maybeInitInternally(android.content.Context context) {
        com.facebook.ads.redexgen.core.U2.A0A(com.facebook.ads.redexgen.core.C1009Rp.A09(context));
    }
}
