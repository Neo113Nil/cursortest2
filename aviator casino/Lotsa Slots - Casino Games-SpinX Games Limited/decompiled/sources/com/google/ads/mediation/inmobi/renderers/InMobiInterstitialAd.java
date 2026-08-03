package com.google.ads.mediation.inmobi.renderers;

/* loaded from: classes3.dex */
public abstract class InMobiInterstitialAd extends com.inmobi.ads.listeners.InterstitialAdEventListener implements com.google.android.gms.ads.mediation.MediationInterstitialAd {
    private com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory;
    protected com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer;
    private com.google.ads.mediation.inmobi.InMobiInterstitialWrapper inMobiInterstitialWrapper;
    private com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
    protected final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback;

    protected abstract void internalLoadAd(com.google.ads.mediation.inmobi.InMobiInterstitialWrapper inMobiInterstitialWrapper, com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    public abstract void loadAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onRewardsUnlocked(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, java.util.Map<java.lang.Object, java.lang.Object> map) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, java.util.Map map) {
        onAdClicked2(inMobiInterstitial, (java.util.Map<java.lang.Object, java.lang.Object>) map);
    }

    public InMobiInterstitialAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.inMobiInitializer = inMobiInitializer;
        this.inMobiAdFactory = inMobiAdFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void createAndLoadInterstitialAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        this.inMobiInterstitialWrapper = this.inMobiAdFactory.createInMobiInterstitialWrapper(context, java.lang.Long.valueOf(com.google.ads.mediation.inmobi.InMobiAdapterUtils.getPlacementId(mediationInterstitialAdConfiguration.getServerParameters())), this);
        com.google.ads.mediation.inmobi.InMobiAdapterUtils.setIsAgeRestricted();
        com.google.ads.mediation.inmobi.InMobiAdapterUtils.configureGlobalTargeting(mediationInterstitialAdConfiguration.getMediationExtras());
        java.lang.String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!android.text.TextUtils.isEmpty(watermark)) {
            this.inMobiInterstitialWrapper.setWatermarkData(new com.inmobi.ads.WatermarkData(watermark, 0.3f));
        }
        internalLoadAd(this.inMobiInterstitialWrapper, mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        if (!this.inMobiInterstitialWrapper.isReady().booleanValue()) {
            com.google.android.gms.ads.AdError createAdapterError = com.google.ads.mediation.inmobi.InMobiConstants.createAdapterError(105, "InMobi interstitial ad is not yet ready to be shown.");
            android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createAdapterError.toString());
            com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(createAdapterError);
                return;
            }
            return;
        }
        this.inMobiInterstitialWrapper.show();
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onUserLeftApplication(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi interstitial ad has caused the user to leave the application.");
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayFailed(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        com.google.android.gms.ads.AdError createAdapterError = com.google.ads.mediation.inmobi.InMobiConstants.createAdapterError(106, "InMobi SDK failed to display an interstitial ad.");
        android.util.Log.e(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createAdapterError.toString());
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(createAdapterError);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdWillDisplay(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi interstitial ad will be shown.");
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi interstitial ad has been loaded.");
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.interstitialAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
        com.google.android.gms.ads.AdError createSdkError = com.google.ads.mediation.inmobi.InMobiConstants.createSdkError(com.google.ads.mediation.inmobi.InMobiAdapterUtils.getMediationErrorCode(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        android.util.Log.e(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createSdkError.toString());
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(createSdkError);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdFetchSuccessful(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi SDK fetched the interstitial ad successfully, but the ad contents still need to be loaded.");
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDisplayed(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi interstitial ad has been shown.");
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public void onAdDismissed(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi interstitial ad has been dismissed.");
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    /* renamed from: onAdClicked, reason: avoid collision after fix types in other method */
    public void onAdClicked2(com.inmobi.ads.InMobiInterstitial inMobiInterstitial, java.util.Map<java.lang.Object, java.lang.Object> map) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi interstitial ad has been clicked.");
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi interstitial ad has logged an impression.");
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }
}
