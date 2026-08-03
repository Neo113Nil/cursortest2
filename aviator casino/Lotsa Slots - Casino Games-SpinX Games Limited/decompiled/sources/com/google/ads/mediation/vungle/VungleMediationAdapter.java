package com.google.ads.mediation.vungle;

/* loaded from: classes3.dex */
public class VungleMediationAdapter extends com.google.android.gms.ads.mediation.rtb.RtbAdapter implements com.google.android.gms.ads.mediation.MediationRewardedAd, com.vungle.ads.RewardedAdListener {
    public static final int ERROR_CANNOT_GET_BID_TOKEN = 108;
    public static final int ERROR_CANNOT_PLAY_AD = 107;
    public static final java.lang.String ERROR_DOMAIN = "com.google.ads.mediation.vungle";
    public static final int ERROR_INITIALIZATION_FAILURE = 105;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final java.lang.String TAG = "VungleMediationAdapter";
    public static final java.lang.String VUNGLE_SDK_ERROR_DOMAIN = "com.vungle.ads";
    private com.vungle.ads.AdConfig adConfig;
    private com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback;
    private com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback;
    private com.vungle.ads.RewardedAd rewardedAd;
    private com.google.ads.mediation.vungle.rtb.VungleRtbAppOpenAd rtbAppOpenAd;
    private com.google.ads.mediation.vungle.rtb.VungleRtbBannerAd rtbBannerAd;
    private com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd rtbInterstitialAd;
    private com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd rtbNativeAd;
    private com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd rtbRewardedAd;
    private com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd rtbRewardedInterstitialAd;
    private java.lang.String userId;
    private final com.google.ads.mediation.vungle.VungleFactory vungleFactory;
    private com.google.ads.mediation.vungle.waterfall.VungleWaterfallAppOpenAd waterfallAppOpenAd;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(com.vungle.ads.BaseAd baseAd) {
    }

    public VungleMediationAdapter() {
        this.vungleFactory = new com.google.ads.mediation.vungle.VungleFactory();
    }

    VungleMediationAdapter(com.google.ads.mediation.vungle.VungleFactory vungleFactory) {
        this.vungleFactory = vungleFactory;
    }

    public static com.google.android.gms.ads.AdError getAdError(com.vungle.ads.VungleError vungleError) {
        return new com.google.android.gms.ads.AdError(vungleError.getCode(), vungleError.getErrorMessage(), "com.vungle.ads");
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getVersionInfo() {
        java.lang.String adapterVersion = getAdapterVersion();
        java.lang.String[] split = adapterVersion.split("\\.");
        if (split.length >= 4) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), (java.lang.Integer.parseInt(split[2]) * 100) + java.lang.Integer.parseInt(split[3]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public com.google.android.gms.ads.VersionInfo getSDKVersionInfo() {
        java.lang.String sdkVersion = com.google.ads.mediation.vungle.VungleSdkWrapper.delegate.getSdkVersion();
        java.lang.String[] split = sdkVersion.split("\\.");
        if (split.length >= 3) {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), java.lang.Integer.parseInt(split[2]));
        }
        android.util.Log.w(TAG, java.lang.String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion));
        return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(com.google.android.gms.ads.mediation.rtb.RtbSignalData rtbSignalData, final com.google.android.gms.ads.mediation.rtb.SignalCallbacks signalCallbacks) {
        com.google.ads.mediation.vungle.VungleSdkWrapper.delegate.getBiddingToken(rtbSignalData.getContext(), new com.vungle.ads.BidTokenCallback() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.1
            @Override // com.vungle.ads.BidTokenCallback
            public void onBidTokenCollected(java.lang.String str) {
                android.util.Log.d(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, "Liftoff Monetize bidding token=" + str);
                signalCallbacks.onSuccess(str);
            }

            @Override // com.vungle.ads.BidTokenCallback
            public void onBidTokenError(java.lang.String str) {
                com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(108, "Liftoff Monetize returned an empty bid token.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
                android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
                signalCallbacks.onFailure(adError);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(android.content.Context context, final com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list) {
        if (com.google.ads.mediation.vungle.VungleSdkWrapper.delegate.isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<com.google.android.gms.ads.mediation.MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = it.next().getServerParameters().getString(com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID);
            if (!android.text.TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            java.lang.String str = (java.lang.String) hashSet.iterator().next();
            if (size > 1) {
                android.util.Log.w(TAG, java.lang.String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Vungle SDK.", com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID, hashSet, str));
            }
            com.google.ads.mediation.vungle.VungleInitializer.getInstance().initialize(str, context, new com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.2
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    initializationCompleteCallback.onInitializationSucceeded();
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
                    initializationCompleteCallback.onInitializationFailed(adError.toString());
                }
            });
            return;
        }
        if (initializationCompleteCallback != null) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Missing or Invalid App ID.", ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.toString());
            initializationCompleteCallback.onInitializationFailed(adError.toString());
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
        new com.google.ads.mediation.vungle.waterfall.VungleWaterfallBannerAd(mediationAdLoadCallback, this.vungleFactory).validateParamsAndLoadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        android.os.Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        android.os.Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.userId = mediationExtras.getString("userId");
        }
        java.lang.String string = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        final java.lang.String string2 = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_PLACEMENT_ID);
        if (android.text.TextUtils.isEmpty(string2)) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN);
            android.util.Log.w(TAG, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.adConfig = this.vungleFactory.createAdConfig();
        if (mediationExtras != null && mediationExtras.containsKey(com.google.ads.mediation.vungle.VungleConstants.KEY_ORIENTATION)) {
            this.adConfig.setAdOrientation(mediationExtras.getInt(com.google.ads.mediation.vungle.VungleConstants.KEY_ORIENTATION, 2));
        }
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
        final android.content.Context context = mediationRewardedAdConfiguration.getContext();
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().initialize(string, context, new com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.3
            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeSuccess() {
                com.google.ads.mediation.vungle.VungleMediationAdapter vungleMediationAdapter = com.google.ads.mediation.vungle.VungleMediationAdapter.this;
                vungleMediationAdapter.rewardedAd = vungleMediationAdapter.vungleFactory.createRewardedAd(context, string2, com.google.ads.mediation.vungle.VungleMediationAdapter.this.adConfig);
                com.google.ads.mediation.vungle.VungleMediationAdapter.this.rewardedAd.setAdListener(com.google.ads.mediation.vungle.VungleMediationAdapter.this);
                com.google.ads.mediation.vungle.VungleMediationAdapter.this.rewardedAd.setAdapterAdFormat("VungleMediationAdapter-rewarded");
                if (!android.text.TextUtils.isEmpty(com.google.ads.mediation.vungle.VungleMediationAdapter.this.userId)) {
                    com.google.ads.mediation.vungle.VungleMediationAdapter.this.rewardedAd.setUserId(com.google.ads.mediation.vungle.VungleMediationAdapter.this.userId);
                }
                com.google.ads.mediation.vungle.VungleMediationAdapter.this.rewardedAd.load((java.lang.String) null);
            }

            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeError(com.google.android.gms.ads.AdError adError3) {
                android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError3.toString());
                com.google.ads.mediation.vungle.VungleMediationAdapter.this.mediationAdLoadCallback.onFailure(adError3);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(android.content.Context context) {
        com.vungle.ads.RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.play(context);
        } else if (this.mediationRewardedAdCallback != null) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(107, "Failed to show waterfall rewarded ad from Liftoff Monetize.", ERROR_DOMAIN);
            android.util.Log.w(TAG, adError.toString());
            this.mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(com.vungle.ads.BaseAd baseAd) {
        android.util.Log.d(TAG, "Loaded waterfall rewarded ad from Liftoff Monetize.");
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(com.vungle.ads.BaseAd baseAd) {
        android.util.Log.d(TAG, "Liftoff Monetize waterfall rewarded ad has started.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(com.vungle.ads.BaseAd baseAd) {
        android.util.Log.d(TAG, "Liftoff Monetize waterfall rewarded ad has ended.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(com.vungle.ads.BaseAd baseAd) {
        android.util.Log.d(TAG, "Liftoff Monetize waterfall rewarded ad was clicked.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.RewardedAdListener
    public void onAdRewarded(com.vungle.ads.BaseAd baseAd) {
        android.util.Log.d(TAG, "Received reward from Liftoff Monetize waterfall rewarded ad.");
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mediationRewardedAdCallback.onUserEarnedReward();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
        com.google.android.gms.ads.AdError adError = getAdError(vungleError);
        android.util.Log.w(TAG, "Failed to play waterfall rewarded ad from Liftoff Monetize with error: " + adError.toString());
        com.google.android.gms.ads.mediation.MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
        com.google.android.gms.ads.AdError adError = getAdError(vungleError);
        android.util.Log.w(TAG, "Failed to load waterfall rewarded ad from Liftoff Monetize with error: " + adError.toString());
        com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(com.vungle.ads.BaseAd baseAd) {
        this.mediationRewardedAdCallback.onVideoStart();
        this.mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback) {
        android.util.Log.d(TAG, "loadNativeAd()...");
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
        com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd vungleRtbNativeAd = new com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = vungleRtbNativeAd;
        vungleRtbNativeAd.render(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        java.lang.String str = TAG;
        android.util.Log.d(str, "loadRewardedInterstitialAd()...");
        android.util.Log.d(str, "Liftoff Monetize adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Liftoff Monetize.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
        com.google.ads.mediation.vungle.waterfall.VungleWaterfallAppOpenAd vungleWaterfallAppOpenAd = new com.google.ads.mediation.vungle.waterfall.VungleWaterfallAppOpenAd(mediationAdLoadCallback, this.vungleFactory);
        this.waterfallAppOpenAd = vungleWaterfallAppOpenAd;
        vungleWaterfallAppOpenAd.render(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        android.util.Log.d(TAG, "loadRtbRewardedAd()...");
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
        com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd vungleRtbRewardedAd = new com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedAd = vungleRtbRewardedAd;
        vungleRtbRewardedAd.render(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(com.google.android.gms.ads.mediation.MediationBannerAdConfiguration mediationBannerAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> mediationAdLoadCallback) {
        android.util.Log.d(TAG, "loadRtbBannerAd()...");
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
        com.google.ads.mediation.vungle.rtb.VungleRtbBannerAd vungleRtbBannerAd = new com.google.ads.mediation.vungle.rtb.VungleRtbBannerAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbBannerAd = vungleRtbBannerAd;
        vungleRtbBannerAd.validateParamsAndLoadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback) {
        android.util.Log.d(TAG, "loadRtbInterstitialAd()...");
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
        com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd vungleRtbInterstitialAd = new com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbInterstitialAd = vungleRtbInterstitialAd;
        vungleRtbInterstitialAd.render(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback) {
        android.util.Log.d(TAG, "loadRtbNativeAd()...");
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
        com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd vungleRtbNativeAd = new com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = vungleRtbNativeAd;
        vungleRtbNativeAd.render(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration mediationRewardedAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationRewardedAd, com.google.android.gms.ads.mediation.MediationRewardedAdCallback> mediationAdLoadCallback) {
        java.lang.String str = TAG;
        android.util.Log.d(str, "loadRtbRewardedInterstitialAd()...");
        android.util.Log.d(str, "Liftoff Monetize adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from Liftoff Monetize.");
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
        com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd vungleRtbRewardedAd = new com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedInterstitialAd = vungleRtbRewardedAd;
        vungleRtbRewardedAd.render(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> mediationAdLoadCallback) {
        com.google.ads.mediation.vungle.VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(com.google.android.gms.ads.MobileAds.getRequestConfiguration());
        com.google.ads.mediation.vungle.rtb.VungleRtbAppOpenAd vungleRtbAppOpenAd = new com.google.ads.mediation.vungle.rtb.VungleRtbAppOpenAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbAppOpenAd = vungleRtbAppOpenAd;
        vungleRtbAppOpenAd.render(mediationAppOpenAdConfiguration);
    }

    static java.lang.String getAdapterVersion() {
        return com.vungle.mediation.BuildConfig.ADAPTER_VERSION;
    }

    public static boolean runtimeGmaSdkListensToAdapterReportedImpressions() {
        com.google.android.gms.ads.VersionInfo version = com.google.android.gms.ads.MobileAds.getVersion();
        if (isVersionLowerThan(version, new com.google.android.gms.ads.VersionInfo(6, 5, 0)) && isVersionGreaterThanOrEqualTo(version, new com.google.android.gms.ads.VersionInfo(0, 18, 0))) {
            return true;
        }
        return isVersionGreaterThanOrEqualTo(version, new com.google.android.gms.ads.VersionInfo(24, 4, 0));
    }

    private static boolean isVersionGreaterThanOrEqualTo(com.google.android.gms.ads.VersionInfo versionInfo, com.google.android.gms.ads.VersionInfo versionInfo2) {
        if (versionInfo.getMajorVersion() > versionInfo2.getMajorVersion()) {
            return true;
        }
        if (versionInfo.getMajorVersion() == versionInfo2.getMajorVersion()) {
            if (versionInfo.getMinorVersion() > versionInfo2.getMinorVersion()) {
                return true;
            }
            return versionInfo.getMinorVersion() == versionInfo2.getMinorVersion() && versionInfo.getMicroVersion() >= versionInfo2.getMicroVersion();
        }
        return false;
    }

    private static boolean isVersionLowerThan(com.google.android.gms.ads.VersionInfo versionInfo, com.google.android.gms.ads.VersionInfo versionInfo2) {
        if (versionInfo.getMajorVersion() < versionInfo2.getMajorVersion()) {
            return true;
        }
        if (versionInfo.getMajorVersion() == versionInfo2.getMajorVersion()) {
            if (versionInfo.getMinorVersion() < versionInfo2.getMinorVersion()) {
                return true;
            }
            return versionInfo.getMinorVersion() == versionInfo2.getMinorVersion() && versionInfo.getMicroVersion() < versionInfo2.getMicroVersion();
        }
        return false;
    }
}
