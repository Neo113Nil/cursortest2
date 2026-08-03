package com.ironsource;

/* loaded from: classes5.dex */
public final class Nf implements com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener {
    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClicked(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.C2987c8.a().b(com.ironsource.Yf.f6105a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClosed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.C2987c8.a().c(com.ironsource.Yf.f6105a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayFailed(com.unity3d.mediation.LevelPlayAdError error, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.C2987c8 a2 = com.ironsource.C2987c8.a();
        com.ironsource.Yf yf = com.ironsource.Yf.f6105a;
        a2.a(yf.a(error), yf.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.C2987c8.a().f(com.ironsource.Yf.f6105a.a(adInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public /* synthetic */ void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(levelPlayAdInfo, "adInfo");
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.ironsource.C2987c8.a().a(com.ironsource.Yf.f6105a.a(error));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.C2987c8.a().e(com.ironsource.Yf.f6105a.a(adInfo));
    }
}
