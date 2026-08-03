package com.ironsource;

/* renamed from: com.ironsource.db, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3008db {

    /* renamed from: com.ironsource.db$a */
    public static final class a implements com.ironsource.Ya {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener f6202a;

        a(com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.f6202a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.Ya
        public void onAdClicked(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + adInfo);
            this.f6202a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdClosed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + adInfo);
            this.f6202a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdDisplayFailed(com.unity3d.mediation.LevelPlayAdError error, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f6202a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f6202a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f6202a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + error);
            this.f6202a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.Ya
        public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f6202a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.Ya
        public /* synthetic */ void onAdRewarded(com.unity3d.mediation.rewarded.LevelPlayReward levelPlayReward, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo) {
            com.ironsource.Ya.CC.$default$onAdRewarded(this, levelPlayReward, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ironsource.Ya b(com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new com.ironsource.C3008db.a(levelPlayInterstitialAdListener);
    }
}
