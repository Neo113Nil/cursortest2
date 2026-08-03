package com.google.ads.mediation.inmobi.renderers;

/* loaded from: classes3.dex */
public abstract class InMobiBannerAd extends com.inmobi.ads.listeners.BannerAdEventListener implements com.google.android.gms.ads.mediation.MediationBannerAd {
    private com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory;
    private com.google.ads.mediation.inmobi.InMobiAdViewHolder inMobiAdViewHolder;
    protected com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer;
    protected final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback;

    protected abstract void internalLoadAd(com.google.ads.mediation.inmobi.InMobiBannerWrapper inMobiBannerWrapper, com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration);

    public abstract void loadAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.ads.mediation.inmobi.MediationUtilsWrapper mediationUtilsWrapper);

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onRewardsUnlocked(com.inmobi.ads.InMobiBanner inMobiBanner, java.util.Map<java.lang.Object, java.lang.Object> map) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public /* bridge */ /* synthetic */ void onAdClicked(com.inmobi.ads.InMobiBanner inMobiBanner, java.util.Map map) {
        onAdClicked2(inMobiBanner, (java.util.Map<java.lang.Object, java.lang.Object>) map);
    }

    public InMobiBannerAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.inMobiInitializer = inMobiInitializer;
        this.inMobiAdFactory = inMobiAdFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void createAndLoadBannerAd(android.content.Context context, com.google.android.gms.ads.AdSize adSize, com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        com.google.ads.mediation.inmobi.InMobiAdapterUtils.setIsAgeRestricted();
        com.google.ads.mediation.inmobi.InMobiAdapterUtils.configureGlobalTargeting(mediationBannerAdConfiguration.getMediationExtras());
        com.google.ads.mediation.inmobi.InMobiBannerWrapper createInMobiBannerWrapper = this.inMobiAdFactory.createInMobiBannerWrapper(context, java.lang.Long.valueOf(com.google.ads.mediation.inmobi.InMobiAdapterUtils.getPlacementId(mediationBannerAdConfiguration.getServerParameters())));
        createInMobiBannerWrapper.setEnableAutoRefresh(false);
        createInMobiBannerWrapper.setAnimationType(com.inmobi.ads.InMobiBanner.AnimationType.ANIMATION_OFF);
        createInMobiBannerWrapper.setListener(this);
        java.lang.String watermark = mediationBannerAdConfiguration.getWatermark();
        if (!android.text.TextUtils.isEmpty(watermark)) {
            createInMobiBannerWrapper.setWatermarkData(new com.inmobi.ads.WatermarkData(watermark, 0.3f));
        }
        com.google.ads.mediation.inmobi.InMobiAdViewHolder createInMobiAdViewHolder = this.inMobiAdFactory.createInMobiAdViewHolder(context);
        this.inMobiAdViewHolder = createInMobiAdViewHolder;
        createInMobiAdViewHolder.setLayoutParams(new android.widget.FrameLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
        createInMobiBannerWrapper.setLayoutParams(new android.widget.LinearLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context)));
        this.inMobiAdViewHolder.addView(createInMobiBannerWrapper);
        internalLoadAd(createInMobiBannerWrapper, mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public android.view.View getView() {
        return this.inMobiAdViewHolder.getFrameLayout();
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onUserLeftApplication(com.inmobi.ads.InMobiBanner inMobiBanner) {
        this.mediationBannerAdCallback.onAdLeftApplication();
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(com.inmobi.ads.InMobiBanner inMobiBanner, com.inmobi.ads.AdMetaInfo adMetaInfo) {
        this.mediationBannerAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(com.inmobi.ads.InMobiBanner inMobiBanner, com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
        com.google.android.gms.ads.AdError createSdkError = com.google.ads.mediation.inmobi.InMobiConstants.createSdkError(com.google.ads.mediation.inmobi.InMobiAdapterUtils.getMediationErrorCode(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createSdkError.toString());
        this.mediationAdLoadCallback.onFailure(createSdkError);
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onAdDisplayed(com.inmobi.ads.InMobiBanner inMobiBanner) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.BannerAdEventListener
    public void onAdDismissed(com.inmobi.ads.InMobiBanner inMobiBanner) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    /* renamed from: onAdClicked, reason: avoid collision after fix types in other method */
    public void onAdClicked2(com.inmobi.ads.InMobiBanner inMobiBanner, java.util.Map<java.lang.Object, java.lang.Object> map) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(com.inmobi.ads.InMobiBanner inMobiBanner) {
        com.google.android.gms.ads.mediation.MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
