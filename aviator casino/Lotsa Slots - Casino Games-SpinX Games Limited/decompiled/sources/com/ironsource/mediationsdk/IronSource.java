package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public abstract class IronSource {

    public enum a {
        REWARDED_VIDEO(com.ironsource.M6.H0),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");


        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f6393a;

        a(java.lang.String str) {
            this.f6393a = str;
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return this.f6393a;
        }
    }

    public static com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout createBannerForDemandOnly(android.app.Activity activity, com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        return com.ironsource.mediationsdk.p.h().a(activity, iSBannerSize);
    }

    public static void destroyISDemandOnlyBanner(java.lang.String str) {
        com.ironsource.mediationsdk.p.h().e(str);
    }

    public static synchronized java.lang.String getISDemandOnlyBiddingData(android.content.Context context) {
        java.lang.String a2;
        synchronized (com.ironsource.mediationsdk.IronSource.class) {
            a2 = com.ironsource.mediationsdk.p.h().a(context);
        }
        return a2;
    }

    public static boolean isISDemandOnlyInterstitialReady(java.lang.String str) {
        return com.ironsource.mediationsdk.p.h().d(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(java.lang.String str) {
        return com.ironsource.mediationsdk.p.h().h(str);
    }

    public static void loadISDemandOnlyBanner(android.app.Activity activity, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str) {
        com.ironsource.mediationsdk.p.h().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyInterstitial(android.app.Activity activity, java.lang.String str) {
        com.ironsource.mediationsdk.p.h().a(activity, str);
    }

    public static void loadISDemandOnlyRewardedVideo(android.app.Activity activity, java.lang.String str) {
        com.ironsource.mediationsdk.p.h().b(activity, str);
    }

    public static void setAdRevenueData(java.lang.String str, org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.p.h().a(str, jSONObject);
    }

    public static void setISDemandOnlyInterstitialListener(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        com.ironsource.mediationsdk.p.h().a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        com.ironsource.mediationsdk.p.h().a(iSDemandOnlyRewardedVideoListener);
    }

    public static void setMediationType(java.lang.String str) {
        com.ironsource.mediationsdk.p.h().f(str);
    }

    public static void showISDemandOnlyInterstitial(java.lang.String str) {
        com.ironsource.mediationsdk.p.h().c(str);
    }

    public static void showISDemandOnlyRewardedVideo(java.lang.String str) {
        com.ironsource.mediationsdk.p.h().a(str);
    }
}
