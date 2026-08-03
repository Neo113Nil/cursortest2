package com.google.ads.mediation.unity;

/* loaded from: classes3.dex */
public class UnityInterstitialAd implements com.google.android.gms.ads.mediation.MediationInterstitialAd, com.unity3d.ads.IUnityAdsLoadListener, com.unity3d.ads.IUnityAdsShowListener {
    static final java.lang.String ERROR_MSG_INTERSTITIAL_INITIALIZATION_FAILED = "Unity Ads initialization failed for game ID '%s' with error message: %s";
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> adLoadCallback;
    private com.google.android.gms.ads.mediation.MediationInterstitialAdCallback interstitialAdCallback;
    private java.lang.String objectId;
    private java.lang.String placementId;
    private final com.google.ads.mediation.unity.UnityAdsLoader unityAdsLoader;
    private final com.google.ads.mediation.unity.UnityInitializer unityInitializer;
    private final java.lang.String watermark;

    public UnityInterstitialAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> mediationAdLoadCallback, com.google.ads.mediation.unity.UnityInitializer unityInitializer, com.google.ads.mediation.unity.UnityAdsLoader unityAdsLoader) {
        this.watermark = mediationInterstitialAdConfiguration.getWatermark();
        this.adLoadCallback = mediationAdLoadCallback;
        this.unityInitializer = unityInitializer;
        this.unityAdsLoader = unityAdsLoader;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(java.lang.String str) {
        android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", str));
        this.placementId = str;
        this.interstitialAdCallback = this.adLoadCallback.onSuccess(this);
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str2) {
        this.placementId = str;
        com.google.android.gms.ads.AdError createSDKError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsLoadError, str2);
        android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, createSDKError.toString());
        this.adLoadCallback.onFailure(createSDKError);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(java.lang.String str) {
        android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads interstitial ad started for placement ID: %s", str));
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(java.lang.String str) {
        android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads interstitial ad was clicked for placement ID: %s", str));
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
        this.interstitialAdCallback.onAdLeftApplication();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads interstitial ad finished playing for placement ID: %s", str));
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2) {
        com.google.android.gms.ads.AdError createSDKError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsShowError, str2);
        android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, createSDKError.toString());
        com.google.android.gms.ads.mediation.MediationInterstitialAdCallback mediationInterstitialAdCallback = this.interstitialAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(createSDKError);
        }
    }

    public void loadAd(com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        final android.content.Context context = mediationInterstitialAdConfiguration.getContext();
        android.os.Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        final java.lang.String string = serverParameters.getString(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID);
        java.lang.String string2 = serverParameters.getString("zoneId");
        this.placementId = string2;
        if (!com.google.ads.mediation.unity.UnityAdsAdapterUtils.areValidIds(string, string2)) {
            this.adLoadCallback.onFailure(new com.google.android.gms.ads.AdError(101, "Missing or invalid server parameters.", "com.google.ads.mediation.unity"));
        } else {
            final java.lang.String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
            this.unityInitializer.initializeUnityAds(context, string, new com.unity3d.ads.IUnityAdsInitializationListener() { // from class: com.google.ads.mediation.unity.UnityInterstitialAd.1
                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationComplete() {
                    android.util.Log.d(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, java.lang.String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", string, com.google.ads.mediation.unity.UnityInterstitialAd.this.placementId));
                    com.google.ads.mediation.unity.UnityAdsAdapterUtils.setUnityAdsPrivacy(com.google.android.gms.ads.MobileAds.getRequestConfiguration(), new com.unity3d.ads.metadata.MetaData(context));
                    com.google.ads.mediation.unity.UnityInterstitialAd.this.objectId = java.util.UUID.randomUUID().toString();
                    com.unity3d.ads.UnityAdsLoadOptions createUnityAdsLoadOptionsWithId = com.google.ads.mediation.unity.UnityInterstitialAd.this.unityAdsLoader.createUnityAdsLoadOptionsWithId(com.google.ads.mediation.unity.UnityInterstitialAd.this.objectId);
                    java.lang.String str = bidResponse;
                    if (str != null) {
                        createUnityAdsLoadOptionsWithId.setAdMarkup(str);
                    }
                    com.google.ads.mediation.unity.UnityInterstitialAd.this.unityAdsLoader.load(com.google.ads.mediation.unity.UnityInterstitialAd.this.placementId, createUnityAdsLoadOptionsWithId, com.google.ads.mediation.unity.UnityInterstitialAd.this);
                }

                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError unityAdsInitializationError, java.lang.String str) {
                    com.google.android.gms.ads.AdError createSDKError = com.google.ads.mediation.unity.UnityAdsAdapterUtils.createSDKError(unityAdsInitializationError, java.lang.String.format(com.google.ads.mediation.unity.UnityInterstitialAd.ERROR_MSG_INTERSTITIAL_INITIALIZATION_FAILED, string, str));
                    android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, createSDKError.toString());
                    com.google.ads.mediation.unity.UnityInterstitialAd.this.adLoadCallback.onFailure(createSDKError);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(android.content.Context context) {
        if (this.placementId == null) {
            android.util.Log.w(com.google.ads.mediation.unity.UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
        }
        com.unity3d.ads.UnityAdsShowOptions createUnityAdsShowOptionsWithId = this.unityAdsLoader.createUnityAdsShowOptionsWithId(this.objectId);
        createUnityAdsShowOptionsWithId.set("watermark", this.watermark);
        this.unityAdsLoader.show((android.app.Activity) context, this.placementId, createUnityAdsShowOptionsWithId, this);
    }
}
