package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiMediationAdapter extends com.google.android.gms.ads.mediation.rtb.RtbAdapter {
    public static final java.lang.String ERROR_MESSAGE_FOR_INVALID_ACCOUNTID = "Missing or invalid Account ID, configured for this ad source instance in the AdMob or Ad Manager UI";
    public static final java.lang.String TAG = "InMobiMediationAdapter";
    private com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory;
    private com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer;
    private com.google.ads.mediation.inmobi.rtb.InMobiRtbBannerAd inMobiRtbBannerAd;
    private com.google.ads.mediation.inmobi.rtb.InMobiRtbInterstitialAd inMobiRtbInterstitialAd;
    private com.google.ads.mediation.inmobi.rtb.InMobiRtbNativeAd inMobiRtbNativeAd;
    private com.google.ads.mediation.inmobi.rtb.InMobiRtbRewardedAd inMobiRtbRewardedAd;
    private com.google.ads.mediation.inmobi.rtb.InMobiRtbRewardedAd inMobiRtbRewardedInterstitialAd;
    private com.google.ads.mediation.inmobi.InMobiSdkWrapper inMobiSdkWrapper;
    private com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallBannerAd inMobiWaterfallBannerAd;
    private com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallInterstitialAd inMobiWaterfallInterstitialAd;
    private com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallNativeAd inMobiWaterfallNativeAd;
    private com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallRewardedAd inMobiWaterfallRewardedAd;
    private com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallRewardedAd inMobiWaterfallRewardedInterstitialAd;
    private com.google.ads.mediation.inmobi.MediationUtilsWrapper mediationUtils;

    InMobiMediationAdapter(com.google.ads.mediation.inmobi.InMobiInitializer inMobiInitializer, com.google.ads.mediation.inmobi.InMobiAdFactory inMobiAdFactory, com.google.ads.mediation.inmobi.InMobiSdkWrapper inMobiSdkWrapper, com.google.ads.mediation.inmobi.MediationUtilsWrapper mediationUtilsWrapper) {
        this.inMobiInitializer = inMobiInitializer;
        this.inMobiAdFactory = inMobiAdFactory;
        this.inMobiSdkWrapper = inMobiSdkWrapper;
        this.mediationUtils = mediationUtilsWrapper;
    }

    public InMobiMediationAdapter() {
        this.inMobiInitializer = com.google.ads.mediation.inmobi.InMobiInitializer.getInstance();
        this.inMobiAdFactory = new com.google.ads.mediation.inmobi.InMobiAdFactory();
        this.inMobiSdkWrapper = new com.google.ads.mediation.inmobi.InMobiSdkWrapper();
        this.mediationUtils = new com.google.ads.mediation.inmobi.MediationUtilsWrapper();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getVersionInfo() {
        return getVersionInfo(com.google.ads.mediation.inmobi.BuildConfig.ADAPTER_VERSION);
    }

    com.google.android.gms.ads.VersionInfo getVersionInfo(java.lang.String str) {
        java.lang.String[] split = str.split("\\.");
        if (split.length >= 4) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), (java.lang.Integer.parseInt(split[2]) * 100) + java.lang.Integer.parseInt(split[3]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getSDKVersionInfo() {
        java.lang.String version = this.inMobiSdkWrapper.getVersion();
        java.lang.String[] split = version.split("\\.");
        if (split.length >= 3) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), java.lang.Integer.parseInt(split[2]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", version));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(android.content.Context context, final com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list) {
        if (this.inMobiSdkWrapper.isSDKInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<com.google.android.gms.ads.mediation.MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = it.next().getServerParameters().getString(com.google.ads.mediation.inmobi.InMobiAdapterUtils.KEY_ACCOUNT_ID);
            if (!android.text.TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(com.google.ads.mediation.inmobi.InMobiConstants.createAdapterError(100, ERROR_MESSAGE_FOR_INVALID_ACCOUNTID).toString());
            return;
        }
        java.lang.String str = (java.lang.String) hashSet.iterator().next();
        if (size > 1) {
            android.util.Log.w(TAG, java.lang.String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the InMobi SDK", com.google.ads.mediation.inmobi.InMobiAdapterUtils.KEY_ACCOUNT_ID, hashSet, str));
        }
        this.inMobiInitializer.init(context, str, new com.google.ads.mediation.inmobi.InMobiInitializer.Listener() { // from class: com.google.ads.mediation.inmobi.InMobiMediationAdapter.1
            @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
            public void onInitializeSuccess() {
                initializationCompleteCallback.onInitializationSucceeded();
            }

            @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
            public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                initializationCompleteCallback.onInitializationFailed(adError.toString());
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData rtbSignalData, com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks) {
        com.google.ads.mediation.inmobi.InMobiExtras build = com.google.ads.mediation.inmobi.InMobiExtrasBuilder.build(rtbSignalData.getContext(), rtbSignalData.getNetworkExtras(), com.google.ads.mediation.inmobi.InMobiAdapterUtils.PROTOCOL_RTB);
        signalCallbacks.onSuccess(this.inMobiSdkWrapper.getToken(build.getParameterMap(), build.getKeywords()));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.inmobi.rtb.InMobiRtbBannerAd inMobiRtbBannerAd = new com.google.ads.mediation.inmobi.rtb.InMobiRtbBannerAd(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbBannerAd = inMobiRtbBannerAd;
        inMobiRtbBannerAd.loadAd(mediationBannerAdConfiguration, this.mediationUtils);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.inmobi.rtb.InMobiRtbInterstitialAd inMobiRtbInterstitialAd = new com.google.ads.mediation.inmobi.rtb.InMobiRtbInterstitialAd(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbInterstitialAd = inMobiRtbInterstitialAd;
        inMobiRtbInterstitialAd.loadAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.inmobi.rtb.InMobiRtbRewardedAd inMobiRtbRewardedAd = new com.google.ads.mediation.inmobi.rtb.InMobiRtbRewardedAd(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbRewardedAd = inMobiRtbRewardedAd;
        inMobiRtbRewardedAd.loadAd(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.inmobi.rtb.InMobiRtbRewardedAd inMobiRtbRewardedAd = new com.google.ads.mediation.inmobi.rtb.InMobiRtbRewardedAd(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbRewardedInterstitialAd = inMobiRtbRewardedAd;
        inMobiRtbRewardedAd.loadAd(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.inmobi.rtb.InMobiRtbNativeAd inMobiRtbNativeAd = new com.google.ads.mediation.inmobi.rtb.InMobiRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiRtbNativeAd = inMobiRtbNativeAd;
        inMobiRtbNativeAd.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallRewardedAd inMobiWaterfallRewardedAd = new com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallRewardedAd(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallRewardedAd = inMobiWaterfallRewardedAd;
        inMobiWaterfallRewardedAd.loadAd(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallRewardedAd inMobiWaterfallRewardedAd = new com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallRewardedAd(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallRewardedInterstitialAd = inMobiWaterfallRewardedAd;
        inMobiWaterfallRewardedAd.loadAd(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallBannerAd inMobiWaterfallBannerAd = new com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallBannerAd(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallBannerAd = inMobiWaterfallBannerAd;
        inMobiWaterfallBannerAd.loadAd(mediationBannerAdConfiguration, this.mediationUtils);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallInterstitialAd inMobiWaterfallInterstitialAd = new com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallInterstitialAd(mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallInterstitialAd = inMobiWaterfallInterstitialAd;
        inMobiWaterfallInterstitialAd.loadAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallNativeAd inMobiWaterfallNativeAd = new com.google.ads.mediation.inmobi.waterfall.InMobiWaterfallNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback, this.inMobiInitializer, this.inMobiAdFactory);
        this.inMobiWaterfallNativeAd = inMobiWaterfallNativeAd;
        inMobiWaterfallNativeAd.loadAd();
    }
}
