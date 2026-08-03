package com.google.ads.mediation.inmobi.renderers;

/* loaded from: classes3.dex */
public abstract class InMobiRewardedAd extends com.inmobi.ads.listeners.InterstitialAdEventListener implements com.google.android.gms.ads.mediation.MediationRewardedAd {
    private com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory;
    protected com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer;
    private com.google.ads.mediation.inmobi.InMobiInterstitialWrapper inMobiRewardedAdWrapper;
    protected final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback rewardedAdCallback;

    protected abstract void internalLoadAd(com.google.ads.mediation.inmobi.InMobiInterstitialWrapper inMobiInterstitialWrapper, com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration);

    public abstract void loadAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration);

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onRequestPayloadCreated(byte[] bArr) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onRequestPayloadCreationFailed(com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, java.util.Map map) {
        onAdClicked2(inMobiInterstitial, (java.util.Map<java.lang.Object, java.lang.Object>) map);
    }

    public InMobiRewardedAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.inMobiInitializer = inMobiInitializer;
        this.inMobiAdFactory = inMobiAdFactory;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        if (!this.inMobiRewardedAdWrapper.isReady().booleanValue()) {
            com.google.android.gms.ads.AdError createAdapterError = com.google.ads.mediation.inmobi.InMobiConstants.createAdapterError(105, "InMobi rewarded ad is not yet ready to be shown.");
            android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createAdapterError.toString());
            com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(createAdapterError);
                return;
            }
            return;
        }
        this.inMobiRewardedAdWrapper.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void createAndLoadRewardAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        this.inMobiRewardedAdWrapper = this.inMobiAdFactory.createInMobiInterstitialWrapper(context, java.lang.Long.valueOf(com.google.ads.mediation.inmobi.InMobiAdapterUtils.getPlacementId(mediationRewardedAdConfiguration.getServerParameters())), this);
        com.google.ads.mediation.inmobi.InMobiAdapterUtils.setIsAgeRestricted();
        com.google.ads.mediation.inmobi.InMobiAdapterUtils.configureGlobalTargeting(mediationRewardedAdConfiguration.getMediationExtras());
        java.lang.String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!android.text.TextUtils.isEmpty(watermark)) {
            this.inMobiRewardedAdWrapper.setWatermarkData(new com.inmobi.ads.WatermarkData(watermark, 0.3f));
        }
        internalLoadAd(this.inMobiRewardedAdWrapper, mediationRewardedAdConfiguration);
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdWillDisplay(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi rewarded ad will be shown.");
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayed(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi rewarded ad has been shown.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.rewardedAdCallback.onVideoStart();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayFailed(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        com.google.android.gms.ads.AdError createAdapterError = com.google.ads.mediation.inmobi.InMobiConstants.createAdapterError(106, "InMobi rewarded ad failed to show.");
        android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createAdapterError.toString());
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(createAdapterError);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDismissed(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi rewarded ad has been dismissed.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onUserLeftApplication(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi rewarded ad left application.");
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onRewardsUnlocked(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, java.util.Map<java.lang.Object, java.lang.Object> map) {
        if (this.rewardedAdCallback != null) {
            android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi rewarded ad credited the user with a reward.");
            this.rewardedAdCallback.onVideoComplete();
            this.rewardedAdCallback.onUserEarnedReward();
        }
    }

    /* renamed from: onAdClicked, reason: avoid collision after fix types in other method */
    public void onAdClicked2(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, java.util.Map<java.lang.Object, java.lang.Object> map) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi rewarded ad has been clicked.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi rewarded ad has logged an impression.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdFetchSuccessful(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi SDK fetched the rewarded ad successfully, but the ad contents still need to be loaded.");
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
        com.google.android.gms.ads.AdError createSdkError = com.google.ads.mediation.inmobi.InMobiConstants.createSdkError(com.google.ads.mediation.inmobi.InMobiAdapterUtils.getMediationErrorCode(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createSdkError.toString());
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(createSdkError);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi rewarded ad has been loaded.");
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.rewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }
}
