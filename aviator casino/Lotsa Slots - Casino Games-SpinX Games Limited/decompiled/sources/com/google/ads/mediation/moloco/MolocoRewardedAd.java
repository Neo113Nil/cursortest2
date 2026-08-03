package com.google.ads.mediation.moloco;

/* compiled from: MolocoRewardedAd.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001!B5\b\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0019H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/google/ads/mediation/moloco/MolocoRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "Lcom/moloco/sdk/publisher/AdLoad$Listener;", "Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "adUnitId", "", "bidResponse", "watermark", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "molocoAd", "Lcom/moloco/sdk/publisher/RewardedInterstitialAd;", "rewardedAdCallback", "loadAd", "", "showAd", "context", "Landroid/content/Context;", com.ironsource.Vf.b, "molocoAdError", "Lcom/moloco/sdk/publisher/MolocoAdError;", "onAdLoadSuccess", "Lcom/moloco/sdk/publisher/MolocoAd;", com.ironsource.Vf.f, "onAdHidden", com.ironsource.Vf.e, "onAdShowSuccess", "onRewardedVideoCompleted", "onRewardedVideoStarted", "onUserRewarded", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MolocoRewardedAd implements com.google.android.gms.ads.mediation.MediationRewardedAd, com.moloco.sdk.publisher.AdLoad.Listener, com.moloco.sdk.publisher.RewardedInterstitialAdShowListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.ads.mediation.moloco.MolocoRewardedAd.Companion INSTANCE = new com.google.ads.mediation.moloco.MolocoRewardedAd.Companion(null);
    private final java.lang.String adUnitId;
    private final java.lang.String bidResponse;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback;
    private com.moloco.sdk.publisher.RewardedInterstitialAd molocoAd;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback rewardedAdCallback;
    private final java.lang.String watermark;

    public /* synthetic */ MolocoRewardedAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mediationAdLoadCallback, str, str2, str3);
    }

    private MolocoRewardedAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.adUnitId = str;
        this.bidResponse = str2;
        this.watermark = str3;
    }

    public final void loadAd() {
        com.moloco.sdk.publisher.Moloco.createRewardedInterstitial(new com.moloco.sdk.publisher.MediationInfo(com.google.ads.mediation.moloco.MolocoMediationAdapter.MEDIATION_PLATFORM_NAME), this.adUnitId, this.watermark, new kotlin.jvm.functions.Function2() { // from class: com.google.ads.mediation.moloco.MolocoRewardedAd$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit loadAd$lambda$0;
                loadAd$lambda$0 = com.google.ads.mediation.moloco.MolocoRewardedAd.loadAd$lambda$0(com.google.ads.mediation.moloco.MolocoRewardedAd.this, (com.moloco.sdk.publisher.RewardedInterstitialAd) obj, (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) obj2);
                return loadAd$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit loadAd$lambda$0(com.google.ads.mediation.moloco.MolocoRewardedAd molocoRewardedAd, com.moloco.sdk.publisher.RewardedInterstitialAd rewardedInterstitialAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        if (adCreateError != null) {
            molocoRewardedAd.mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(adCreateError.getErrorCode(), adCreateError.getDescription(), "com.moloco.sdk"));
            return kotlin.Unit.INSTANCE;
        }
        if (rewardedInterstitialAd == null) {
            molocoRewardedAd.mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(103, com.google.ads.mediation.moloco.MolocoMediationAdapter.ERROR_MSG_AD_IS_NULL, "com.google.ads.mediation.moloco"));
            return kotlin.Unit.INSTANCE;
        }
        molocoRewardedAd.molocoAd = rewardedInterstitialAd;
        if (rewardedInterstitialAd == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("molocoAd");
            rewardedInterstitialAd = null;
        }
        rewardedInterstitialAd.load(molocoRewardedAd.bidResponse, molocoRewardedAd);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.moloco.sdk.publisher.RewardedInterstitialAd rewardedInterstitialAd = this.molocoAd;
        if (rewardedInterstitialAd == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("molocoAd");
            rewardedInterstitialAd = null;
        }
        rewardedInterstitialAd.show(this);
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public void onAdLoadFailed(com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        this.mediationAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk"));
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public void onAdLoadSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.rewardedAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoCompleted(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoStarted(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onUserRewarded(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onUserEarnedReward();
        }
    }

    /* compiled from: MolocoRewardedAd.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/ads/mediation/moloco/MolocoRewardedAd$Companion;", "", "<init>", "()V", "newInstance", "Lkotlin/Result;", "Lcom/google/ads/mediation/moloco/MolocoRewardedAd;", "mediationRewardedAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAd;", "Lcom/google/android/gms/ads/mediation/MediationRewardedAdCallback;", "newInstance-gIAlu-s", "(Lcom/google/android/gms/ads/mediation/MediationRewardedAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)Ljava/lang/Object;", "moloco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: newInstance-gIAlu-s, reason: not valid java name */
        public final java.lang.Object m5292newInstancegIAlus(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationRewardedAdConfiguration, "mediationRewardedAdConfiguration");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
            android.os.Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
            java.lang.String string = serverParameters.getString(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID);
            java.lang.String str = string;
            if (str == null || str.length() == 0) {
                com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(102, com.google.ads.mediation.moloco.MolocoMediationAdapter.ERROR_MSG_MISSING_AD_UNIT, "com.google.ads.mediation.moloco");
                mediationAdLoadCallback.onFailure(adError);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.util.NoSuchElementException(adError.getMessage())));
            }
            java.lang.String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bidResponse, "getBidResponse(...)");
            java.lang.String watermark = mediationRewardedAdConfiguration.getWatermark();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(watermark, "getWatermark(...)");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(new com.google.ads.mediation.moloco.MolocoRewardedAd(mediationAdLoadCallback, string, bidResponse, watermark, null));
        }
    }
}
