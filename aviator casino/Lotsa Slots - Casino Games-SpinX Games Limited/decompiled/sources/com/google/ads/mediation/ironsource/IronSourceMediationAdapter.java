package com.google.ads.mediation.ironsource;

/* loaded from: classes3.dex */
public class IronSourceMediationAdapter extends com.google.android.gms.ads.mediation.rtb.RtbAdapter {
    public static final java.lang.String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.ironsource";
    public static final int ERROR_AD_ALREADY_LOADED = 103;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 105;
    public static final int ERROR_CALL_SHOW_BEFORE_LOADED_SUCCESS = 107;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 102;
    public static final int ERROR_SDK_NOT_INITIALIZED = 106;
    public static final java.lang.String IRONSOURCE_SDK_ERROR_DOMAIN = "com.ironsource.mediationsdk";
    private static final java.util.concurrent.atomic.AtomicBoolean isInitialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.google.ads.mediation.ironsource.MediationUtilsWrapper mediationUtils;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    IronSourceMediationAdapter() {
        this.mediationUtils = new com.google.ads.mediation.ironsource.MediationUtilsWrapper();
    }

    IronSourceMediationAdapter(com.google.ads.mediation.ironsource.MediationUtilsWrapper mediationUtilsWrapper) {
        this.mediationUtils = mediationUtilsWrapper;
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getSDKVersionInfo() {
        java.lang.String sdkVersion = com.unity3d.ironsourceads.IronSourceAds.getSdkVersion();
        java.lang.String[] split = sdkVersion.split("\\.");
        if (split.length >= 3) {
            int parseInt = java.lang.Integer.parseInt(split[0]);
            int parseInt2 = java.lang.Integer.parseInt(split[1]);
            int parseInt3 = java.lang.Integer.parseInt(split[2]);
            if (split.length >= 4) {
                parseInt3 = (parseInt3 * 100) + java.lang.Integer.parseInt(split[3]);
            }
            return new com.google.android.gms.ads.VersionInfo(parseInt, parseInt2, parseInt3);
        }
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getVersionInfo() {
        java.lang.String adapterVersion = com.google.ads.mediation.ironsource.IronSourceAdapterUtils.getAdapterVersion();
        java.lang.String[] split = adapterVersion.split("\\.");
        if (split.length >= 4) {
            int parseInt = java.lang.Integer.parseInt(split[0]);
            int parseInt2 = java.lang.Integer.parseInt(split[1]);
            int parseInt3 = (java.lang.Integer.parseInt(split[2]) * 100) + java.lang.Integer.parseInt(split[3]);
            if (split.length >= 5) {
                parseInt3 = (parseInt3 * 100) + java.lang.Integer.parseInt(split[4]);
            }
            return new com.google.android.gms.ads.VersionInfo(parseInt, parseInt2, parseInt3);
        }
        android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(android.content.Context context, final com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list) {
        if (isInitialized.get()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<com.google.android.gms.ads.mediation.MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = it.next().getServerParameters().getString("appKey");
            if (!android.text.TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new com.google.android.gms.ads.AdError(101, "Missing or invalid app key.", "com.google.ads.mediation.ironsource").getMessage());
            return;
        }
        java.lang.String str = (java.lang.String) hashSet.iterator().next();
        if (android.text.TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new com.google.android.gms.ads.AdError(101, "Missing or invalid app key.", "com.google.ads.mediation.ironsource").getMessage());
            return;
        }
        if (size > 1) {
            android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, java.lang.String.format("Multiple '%s' entries found: %s. Using app key '%s' to initialize the IronSource SDK.", "appKey", hashSet, str));
        }
        com.ironsource.mediationsdk.IronSource.setMediationType(com.google.ads.mediation.ironsource.IronSourceAdapterUtils.getMediationType());
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, "Initializing IronSource SDK with app key: " + str);
        configureIronSourcePrivacy();
        com.unity3d.ironsourceads.IronSourceAds.init(context, new com.unity3d.ironsourceads.InitRequest.Builder(str).withLegacyAdFormats(new java.util.ArrayList(java.util.Arrays.asList(com.unity3d.ironsourceads.IronSourceAds.AdFormat.BANNER, com.unity3d.ironsourceads.IronSourceAds.AdFormat.INTERSTITIAL, com.unity3d.ironsourceads.IronSourceAds.AdFormat.REWARDED))).build(), new com.unity3d.ironsourceads.InitListener() { // from class: com.google.ads.mediation.ironsource.IronSourceMediationAdapter.1
            @Override // com.unity3d.ironsourceads.InitListener
            public void onInitSuccess() {
                com.google.ads.mediation.ironsource.IronSourceMediationAdapter.isInitialized.set(true);
                initializationCompleteCallback.onInitializationSucceeded();
            }

            @Override // com.unity3d.ironsourceads.InitListener
            public void onInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
                initializationCompleteCallback.onInitializationFailed(ironSourceError.getErrorMessage());
            }
        });
        com.ironsource.mediationsdk.IronSource.setISDemandOnlyInterstitialListener(com.google.ads.mediation.ironsource.IronSourceInterstitialAd.getIronSourceInterstitialListener());
        com.ironsource.mediationsdk.IronSource.setISDemandOnlyRewardedVideoListener(com.google.ads.mediation.ironsource.IronSourceRewardedAd.getIronSourceRewardedListener());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData rtbSignalData, com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(com.ironsource.mediationsdk.IronSource.getISDemandOnlyBiddingData(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (!isInitialized.get()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Failed to load IronSource rewarded ad since IronSource SDK is not initialized.", "com.google.ads.mediation.ironsource");
            android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        new com.google.ads.mediation.ironsource.IronSourceRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback).loadWaterfallAd(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        new com.google.ads.mediation.ironsource.IronSourceRtbRewardedAd(mediationAdLoadCallback).loadRtbAd(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        android.util.Log.d(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, "IronSource adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from IronSource.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (!isInitialized.get()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Failed to load IronSource interstitial ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        new com.google.ads.mediation.ironsource.IronSourceInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback).loadWaterfallAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        new com.google.ads.mediation.ironsource.IronSourceRtbInterstitialAd(mediationAdLoadCallback).loadRtbAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        new com.google.ads.mediation.ironsource.IronSourceRtbBannerAd(mediationAdLoadCallback).loadRtbAd(mediationBannerAdConfiguration, this.mediationUtils);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        if (!isInitialized.get()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Failed to load IronSource banner ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
            android.util.Log.w(com.google.ads.mediation.ironsource.IronSourceConstants.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        new com.google.ads.mediation.ironsource.IronSourceBannerAd(mediationAdLoadCallback).loadAd(mediationBannerAdConfiguration, this.mediationUtils);
    }

    public void setIsInitialized(boolean z) {
        isInitialized.set(z);
    }

    private void configureIronSourcePrivacy() {
        com.google.android.gms.ads.RequestConfiguration requestConfiguration = com.google.android.gms.ads.MobileAds.getRequestConfiguration();
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1) {
            com.unity3d.mediation.LevelPlay.setMetaData(com.ironsource.mediationsdk.metadata.a.b, "true");
        } else if (requestConfiguration.getTagForChildDirectedTreatment() == 0 || requestConfiguration.getTagForUnderAgeOfConsent() == 0) {
            com.unity3d.mediation.LevelPlay.setMetaData(com.ironsource.mediationsdk.metadata.a.b, "false");
        }
    }
}
