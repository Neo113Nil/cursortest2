package com.google.ads.mediation.inmobi.renderers;

/* loaded from: classes3.dex */
public abstract class InMobiNativeAd extends com.inmobi.ads.listeners.NativeAdEventListener {
    public com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory;
    public com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer;
    private com.google.ads.mediation.inmobi.InMobiNativeWrapper inMobiNativeWrapper;
    public com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper inMobiUnifiedNativeAdMapper;
    protected final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback;
    public com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback;
    protected final com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration;

    protected abstract void internalLoadAd(com.google.ads.mediation.inmobi.InMobiNativeWrapper inMobiNativeWrapper);

    public abstract void loadAd();

    public InMobiNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        this.mediationNativeAdConfiguration = mediationNativeAdConfiguration;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.inMobiInitializer = inMobiInitializer;
        this.inMobiAdFactory = inMobiAdFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void createAndLoadNativeAd(android.content.Context context, long j) {
        com.google.ads.mediation.inmobi.InMobiNativeWrapper createInMobiNativeWrapper = this.inMobiAdFactory.createInMobiNativeWrapper(context, java.lang.Long.valueOf(j), this);
        this.inMobiNativeWrapper = createInMobiNativeWrapper;
        createInMobiNativeWrapper.setVideoEventListener(new com.inmobi.ads.listeners.VideoEventListener() { // from class: com.google.ads.mediation.inmobi.renderers.InMobiNativeAd.1
            @Override // com.inmobi.ads.listeners.VideoEventListener
            public void onVideoCompleted(com.inmobi.ads.InMobiNative inMobiNative) {
                super.onVideoCompleted(inMobiNative);
                android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi native ad video has completed.");
                if (com.google.ads.mediation.inmobi.renderers.InMobiNativeAd.this.mediationNativeAdCallback != null) {
                    com.google.ads.mediation.inmobi.renderers.InMobiNativeAd.this.mediationNativeAdCallback.onVideoComplete();
                }
            }

            @Override // com.inmobi.ads.listeners.VideoEventListener
            public void onVideoSkipped(com.inmobi.ads.InMobiNative inMobiNative) {
                super.onVideoSkipped(inMobiNative);
                android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi native ad video has been skipped.");
            }
        });
        com.google.ads.mediation.inmobi.InMobiAdapterUtils.setIsAgeRestricted();
        com.google.ads.mediation.inmobi.InMobiAdapterUtils.configureGlobalTargeting(this.mediationNativeAdConfiguration.getMediationExtras());
        internalLoadAd(this.inMobiNativeWrapper);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(com.inmobi.ads.InMobiNative inMobiNative, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi native ad has been loaded.");
        com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions = this.mediationNativeAdConfiguration.getNativeAdOptions();
        com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper inMobiUnifiedNativeAdMapper = new com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper(this.inMobiAdFactory.createInMobiNativeWrapper(inMobiNative), java.lang.Boolean.valueOf(nativeAdOptions != null ? nativeAdOptions.shouldReturnUrlsForImageAssets() : false), this.mediationAdLoadCallback, this);
        this.inMobiUnifiedNativeAdMapper = inMobiUnifiedNativeAdMapper;
        inMobiUnifiedNativeAdMapper.mapUnifiedNativeAd(this.mediationNativeAdConfiguration.getContext());
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(com.inmobi.ads.InMobiNative inMobiNative, com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
        com.google.android.gms.ads.AdError createSdkError = com.google.ads.mediation.inmobi.InMobiConstants.createSdkError(com.google.ads.mediation.inmobi.InMobiAdapterUtils.getMediationErrorCode(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createSdkError.toString());
        this.mediationAdLoadCallback.onFailure(createSdkError);
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdFullScreenDismissed(com.inmobi.ads.InMobiNative inMobiNative) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi native ad has been dismissed.");
        com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdFullScreenDisplayed(com.inmobi.ads.InMobiNative inMobiNative) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi native ad has been displayed.");
        com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onUserWillLeaveApplication(com.inmobi.ads.InMobiNative inMobiNative) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi native ad has caused the user to leave the application.");
        com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdClicked(com.inmobi.ads.InMobiNative inMobiNative) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi native ad has been clicked.");
        com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(com.inmobi.ads.InMobiNative inMobiNative) {
        android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "InMobi native ad has logged an impression.");
        com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }
}
