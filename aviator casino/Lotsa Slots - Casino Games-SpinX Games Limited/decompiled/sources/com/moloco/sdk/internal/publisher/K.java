package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class K implements com.moloco.sdk.publisher.RewardedInterstitialAdShowListener, com.moloco.sdk.publisher.AdShowListener {
    public static final int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.publisher.AdShowListener f7078a;
    public final com.moloco.sdk.publisher.RewardedInterstitialAdShowListener b;
    public final kotlin.jvm.functions.Function0<com.moloco.sdk.internal.ortb.model.B> c;
    public final com.moloco.sdk.internal.w d;

    public K(com.moloco.sdk.publisher.RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, kotlin.jvm.functions.Function0<com.moloco.sdk.internal.ortb.model.B> provideSdkEvents, com.moloco.sdk.internal.w sdkEventUrlTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        this.f7078a = com.moloco.sdk.internal.publisher.C3426j.a(rewardedInterstitialAdShowListener);
        this.b = rewardedInterstitialAdShowListener;
        this.c = provideSdkEvents;
        this.d = sdkEventUrlTracker;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7078a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7078a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        com.moloco.sdk.publisher.RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7078a.onAdShowSuccess(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoCompleted(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        java.lang.String onRewardedVideoCompleted;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.B invoke = this.c.invoke();
        if (invoke != null && (onRewardedVideoCompleted = invoke.getOnRewardedVideoCompleted()) != null) {
            com.moloco.sdk.internal.w.a.a(this.d, onRewardedVideoCompleted, java.lang.System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.publisher.RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoCompleted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoStarted(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        java.lang.String onRewardedVideoStarted;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.B invoke = this.c.invoke();
        if (invoke != null && (onRewardedVideoStarted = invoke.getOnRewardedVideoStarted()) != null) {
            com.moloco.sdk.internal.w.a.a(this.d, onRewardedVideoStarted, java.lang.System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.publisher.RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onUserRewarded(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        java.lang.String onUserRewarded;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.B invoke = this.c.invoke();
        if (invoke != null && (onUserRewarded = invoke.getOnUserRewarded()) != null) {
            com.moloco.sdk.internal.w.a.a(this.d, onUserRewarded, java.lang.System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.publisher.RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onUserRewarded(molocoAd);
        }
    }
}
