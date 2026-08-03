package com.ironsource;

/* renamed from: com.ironsource.pb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3223pb {

    /* renamed from: com.ironsource.pb$a */
    public static final class a implements com.ironsource.Ya {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener f6555a;

        a(com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.f6555a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.Ya
        public void onAdClicked(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClicked() adInfo: " + adInfo);
            this.f6555a.onAdClicked(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdClosed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClosed() adInfo: " + adInfo);
            this.f6555a.onAdClosed(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdDisplayFailed(com.unity3d.mediation.LevelPlayAdError error, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayFailed() adInfo: " + adInfo + " error: " + error);
            this.f6555a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayed() adInfo: " + adInfo);
            this.f6555a.onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdInfoChanged() adInfo: " + adInfo);
            this.f6555a.onAdInfoChanged(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoadFailed() error: " + error);
            this.f6555a.onAdLoadFailed(error);
        }

        @Override // com.ironsource.Ya
        public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoaded() adInfo: " + adInfo);
            this.f6555a.onAdLoaded(adInfo);
        }

        @Override // com.ironsource.Ya
        public void onAdRewarded(com.unity3d.mediation.rewarded.LevelPlayReward reward, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "reward");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdRewarded() reward: " + reward + " adInfo: " + adInfo);
            this.f6555a.onAdRewarded(reward, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ironsource.Ya b(com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new com.ironsource.C3223pb.a(levelPlayRewardedAdListener);
    }
}
