package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class AdMobSDK extends org.cocos2dx.bole.sdk.SDKBase {
    private static org.cocos2dx.bole.sdk.AdMobSDK instance;
    private boolean adIsLoading;
    private double iadValue;
    private com.google.android.gms.ads.interstitial.InterstitialAd interstitialAdCache;
    boolean isLoading;
    private double radValue;
    private com.google.android.gms.ads.rewarded.RewardedAd rewardedAdCache;
    java.lang.String TAG = "AdMobSDK";
    private final java.util.concurrent.atomic.AtomicBoolean isMobileAdsInitializeCalled = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static org.cocos2dx.bole.sdk.AdMobSDK Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.AdMobSDK();
        }
        return instance;
    }

    @Override // org.cocos2dx.bole.sdk.SDKBase
    public void onResume() {
        super.onResume();
    }

    @Override // org.cocos2dx.bole.sdk.SDKBase
    public void onPause() {
        super.onPause();
    }

    public void initSDK(java.lang.String str) {
        if (this.isMobileAdsInitializeCalled.getAndSet(true)) {
            calllua("reinitSDK", "");
            return;
        }
        try {
            java.lang.String string = new org.json.JSONObject(str).getString("TEST_DEVICE_HASHED_ID");
            if (!string.isEmpty()) {
                com.google.android.gms.ads.MobileAds.setRequestConfiguration(new com.google.android.gms.ads.RequestConfiguration.Builder().setTestDeviceIds(java.util.Arrays.asList(string.split(","))).build());
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        new java.lang.Thread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.google.android.gms.ads.MobileAds.initialize(org.cocos2dx.bole.sdk.SDKHelper.activity, new com.google.android.gms.ads.initialization.OnInitializationCompleteListener() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.1.1
                        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                        public void onInitializationComplete(com.google.android.gms.ads.initialization.InitializationStatus initializationStatus) {
                            try {
                                java.util.Map<java.lang.String, com.google.android.gms.ads.initialization.AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                for (java.util.Map.Entry<java.lang.String, com.google.android.gms.ads.initialization.AdapterStatus> entry : adapterStatusMap.entrySet()) {
                                    java.lang.String key = entry.getKey();
                                    com.google.android.gms.ads.initialization.AdapterStatus value = entry.getValue();
                                    java.lang.String format = java.lang.String.format("Adapter name: %s, Description: %s, Latency: %d", key, value.getDescription(), java.lang.Integer.valueOf(value.getLatency()));
                                    android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "onInitializationComplete: " + format);
                                    sb.append(format);
                                }
                                org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("initSDK", new org.json.JSONObject().put("adapters", sb.toString()));
                            } catch (java.lang.Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    });
                } catch (java.lang.Exception e2) {
                    e2.printStackTrace();
                }
            }
        }).start();
    }

    public java.lang.String getAdSourceName(int i) {
        try {
            com.google.android.gms.ads.AdapterResponseInfo loadedAdapterResponseInfo = (i == 0 ? this.interstitialAdCache.getResponseInfo() : this.rewardedAdCache.getResponseInfo()).getLoadedAdapterResponseInfo();
            if (loadedAdapterResponseInfo != null) {
                return loadedAdapterResponseInfo.getAdSourceName();
            }
            return "";
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void loadInterstitialAd(final java.lang.String str) {
        org.cocos2dx.bole.sdk.SDKHelper.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!org.cocos2dx.bole.sdk.AdMobSDK.this.adIsLoading) {
                        if (org.cocos2dx.bole.sdk.AdMobSDK.this.interstitialAdCache != null) {
                            org.cocos2dx.bole.sdk.AdMobSDK adMobSDK = org.cocos2dx.bole.sdk.AdMobSDK.this;
                            adMobSDK.calllua("loadInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.ironsource.Vf.j, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adMobSDK.getAdSourceName(0));
                            return;
                        } else {
                            java.lang.String string = new org.json.JSONObject(str).getString("AD_UNIT_ID");
                            org.cocos2dx.bole.sdk.AdMobSDK.this.adIsLoading = true;
                            com.google.android.gms.ads.interstitial.InterstitialAd.load(org.cocos2dx.bole.sdk.SDKHelper.activity, string, new com.google.android.gms.ads.AdRequest.Builder().build(), new com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.2.1
                                @Override // com.google.android.gms.ads.AdLoadCallback
                                public void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
                                    android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "Ad was loaded.");
                                    org.cocos2dx.bole.sdk.AdMobSDK.this.interstitialAdCache = interstitialAd;
                                    org.cocos2dx.bole.sdk.AdMobSDK.this.adIsLoading = false;
                                    org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.ironsource.Vf.j, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, org.cocos2dx.bole.sdk.AdMobSDK.this.getAdSourceName(0));
                                }

                                @Override // com.google.android.gms.ads.AdLoadCallback
                                public void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
                                    android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, loadAdError.getMessage());
                                    org.cocos2dx.bole.sdk.AdMobSDK.this.interstitialAdCache = null;
                                    org.cocos2dx.bole.sdk.AdMobSDK.this.adIsLoading = false;
                                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "domain: %s, code: %d, message: %s", loadAdError.getDomain(), java.lang.Integer.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                                    android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "onAdFailedToLoad: " + format);
                                    org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToLoad", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, format);
                                }
                            });
                            return;
                        }
                    }
                    org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToLoad", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "adIsLoading");
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToLoad", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, e.getMessage());
                }
            }
        });
    }

    public void showInterstitialAd(java.lang.String str) {
        org.cocos2dx.bole.sdk.SDKHelper.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.3
            @Override // java.lang.Runnable
            public void run() {
                if (org.cocos2dx.bole.sdk.AdMobSDK.this.interstitialAdCache != null) {
                    final java.lang.String adSourceName = org.cocos2dx.bole.sdk.AdMobSDK.this.getAdSourceName(0);
                    org.cocos2dx.bole.sdk.AdMobSDK.this.interstitialAdCache.setOnPaidEventListener(new com.google.android.gms.ads.OnPaidEventListener() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.3.1
                        @Override // com.google.android.gms.ads.OnPaidEventListener
                        public void onPaidEvent(com.google.android.gms.ads.AdValue adValue) {
                            com.adjust.sdk.AdjustAdRevenue adjustAdRevenue = new com.adjust.sdk.AdjustAdRevenue("admob_sdk");
                            org.cocos2dx.bole.sdk.AdMobSDK.this.iadValue = adValue.getValueMicros() / 1000000.0d;
                            adjustAdRevenue.setRevenue(java.lang.Double.valueOf(org.cocos2dx.bole.sdk.AdMobSDK.this.iadValue), adValue.getCurrencyCode());
                            adjustAdRevenue.setAdRevenueNetwork(adSourceName);
                            com.adjust.sdk.Adjust.trackAdRevenue(adjustAdRevenue);
                        }
                    });
                    org.cocos2dx.bole.sdk.AdMobSDK.this.interstitialAdCache.setFullScreenContentCallback(new com.google.android.gms.ads.FullScreenContentCallback() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.3.2
                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdDismissedFullScreenContent() {
                            android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "The ad was dismissed.");
                            org.cocos2dx.bole.sdk.AdMobSDK.this.interstitialAdCache = null;
                            org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdDismissedFullScreenContent", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adSourceName, "revenue", java.lang.Double.valueOf(org.cocos2dx.bole.sdk.AdMobSDK.this.iadValue));
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                            android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "The ad failed to show.");
                            org.cocos2dx.bole.sdk.AdMobSDK.this.interstitialAdCache = null;
                            org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToShowFullScreenContent", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adSourceName + adError.getMessage());
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdShowedFullScreenContent() {
                            android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "The ad was shown.");
                            org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdShowedFullScreenContent", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adSourceName);
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdImpression() {
                            android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "The ad recorded an impression.");
                            org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdImpression", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adSourceName);
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdClicked() {
                            android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "The ad was clicked.");
                            org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.ironsource.Vf.f, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adSourceName);
                        }
                    });
                    org.cocos2dx.bole.sdk.AdMobSDK.this.interstitialAdCache.show(org.cocos2dx.bole.sdk.SDKHelper.activity);
                    return;
                }
                android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "The interstitial ad is still loading.");
                org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToShowFullScreenContent", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "interstitialAdCache==null");
            }
        });
    }

    public void loadRewardedAd(final java.lang.String str) {
        org.cocos2dx.bole.sdk.SDKHelper.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.4
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.bole.sdk.AdMobSDK.this.loadRewardedAdUIThread(str);
            }
        });
    }

    public void loadRewardedAdUIThread(java.lang.String str) {
        if (this.rewardedAdCache == null) {
            this.isLoading = true;
            try {
                com.google.android.gms.ads.rewarded.RewardedAd.load(org.cocos2dx.bole.sdk.SDKHelper.activity, new org.json.JSONObject(str).getString("AD_UNIT_ID"), new com.google.android.gms.ads.AdRequest.Builder().build(), new com.google.android.gms.ads.rewarded.RewardedAdLoadCallback() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.5
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(com.google.android.gms.ads.rewarded.RewardedAd rewardedAd) {
                        android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "Ad was loaded.");
                        org.cocos2dx.bole.sdk.AdMobSDK.this.rewardedAdCache = rewardedAd;
                        org.cocos2dx.bole.sdk.AdMobSDK.this.isLoading = false;
                        android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "rewardedAd loaded: ");
                        org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.ironsource.Vf.j, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, org.cocos2dx.bole.sdk.AdMobSDK.this.getAdSourceName(1));
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
                        android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, loadAdError.getMessage());
                        org.cocos2dx.bole.sdk.AdMobSDK.this.rewardedAdCache = null;
                        org.cocos2dx.bole.sdk.AdMobSDK.this.isLoading = false;
                        android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "onAdFailedToLoad: ");
                        org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToLoad", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, loadAdError.getMessage());
                    }
                });
                return;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                calllua("loadRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToLoad", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, e.getMessage());
                return;
            }
        }
        calllua("loadRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.ironsource.Vf.j, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, getAdSourceName(1));
    }

    public void openAdInspector(java.lang.String str) {
        org.cocos2dx.bole.sdk.SDKHelper.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.6
            @Override // java.lang.Runnable
            public void run() {
                com.google.android.gms.ads.MobileAds.openAdInspector(org.cocos2dx.bole.sdk.SDKHelper.activity, new com.google.android.gms.ads.OnAdInspectorClosedListener() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.6.1
                    @Override // com.google.android.gms.ads.OnAdInspectorClosedListener
                    public void onAdInspectorClosed(com.google.android.gms.ads.AdInspectorError adInspectorError) {
                    }
                });
            }
        });
    }

    public void showRewardedAd(final java.lang.String str) {
        org.cocos2dx.bole.sdk.SDKHelper.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.7
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.bole.sdk.AdMobSDK.this.showRewardedAdUIThread(str);
            }
        });
    }

    public void showRewardedAdUIThread(java.lang.String str) {
        if (this.rewardedAdCache == null) {
            calllua("showRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToShowFullScreenContent", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "rewardedAdCache==null");
            return;
        }
        final java.lang.String adSourceName = getAdSourceName(1);
        this.rewardedAdCache.setOnPaidEventListener(new com.google.android.gms.ads.OnPaidEventListener() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.8
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public void onPaidEvent(com.google.android.gms.ads.AdValue adValue) {
                com.adjust.sdk.AdjustAdRevenue adjustAdRevenue = new com.adjust.sdk.AdjustAdRevenue("admob_sdk");
                org.cocos2dx.bole.sdk.AdMobSDK.this.radValue = adValue.getValueMicros() / 1000000.0d;
                adjustAdRevenue.setRevenue(java.lang.Double.valueOf(org.cocos2dx.bole.sdk.AdMobSDK.this.radValue), adValue.getCurrencyCode());
                adjustAdRevenue.setAdRevenueNetwork(adSourceName);
                com.adjust.sdk.Adjust.trackAdRevenue(adjustAdRevenue);
            }
        });
        this.rewardedAdCache.setFullScreenContentCallback(new com.google.android.gms.ads.FullScreenContentCallback() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.9
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "Ad was dismissed.");
                org.cocos2dx.bole.sdk.AdMobSDK.this.rewardedAdCache = null;
                android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "onAdDismissedFullScreenContent: ");
                org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdDismissedFullScreenContent", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adSourceName);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "Ad failed to show.");
                org.cocos2dx.bole.sdk.AdMobSDK.this.rewardedAdCache = null;
                android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "onAdFailedToShowFullScreenContent: " + adError.getMessage());
                org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToShowFullScreenContent", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adError.getMessage());
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "Ad showed fullscreen content.");
                org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdShowedFullScreenContent", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adSourceName);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
                android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "Ad recorded an impression.");
                org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdImpression", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adSourceName);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
                android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "Ad was clicked.");
                org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.ironsource.Vf.f, androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adSourceName);
            }
        });
        this.rewardedAdCache.show(org.cocos2dx.bole.sdk.SDKHelper.activity, new com.google.android.gms.ads.OnUserEarnedRewardListener() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.10
            @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
            public void onUserEarnedReward(com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
                android.util.Log.d(org.cocos2dx.bole.sdk.AdMobSDK.this.TAG, "User earned the reward.");
                org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("showRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onUserEarnedReward", com.ironsource.M6.I1, adSourceName, "type", rewardItem.getType(), com.ironsource.C3300u.l, java.lang.Integer.valueOf(rewardItem.getAmount()), "revenue", java.lang.Double.valueOf(org.cocos2dx.bole.sdk.AdMobSDK.this.radValue));
            }
        });
    }

    public void startPreloadInterstitialAd(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String string = jSONObject.getString("AD_UNIT_ID");
            int i = jSONObject.getInt("BUFF_SIZE");
            if (com.google.android.gms.ads.interstitial.InterstitialAdPreloader.isAdAvailable(string)) {
                com.google.android.gms.ads.interstitial.InterstitialAdPreloader.destroyAll();
            }
            com.google.android.gms.ads.interstitial.InterstitialAdPreloader.start(string, new com.google.android.gms.ads.preload.PreloadConfiguration.Builder(string).setBufferSize(i).build(), new com.google.android.gms.ads.preload.PreloadCallbackV2() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.11
                @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
                public void onAdPreloaded(java.lang.String str2, com.google.android.gms.ads.ResponseInfo responseInfo) {
                    java.lang.String str3;
                    com.google.android.gms.ads.AdapterResponseInfo loadedAdapterResponseInfo = responseInfo.getLoadedAdapterResponseInfo();
                    if (loadedAdapterResponseInfo == null) {
                        str3 = "";
                    } else {
                        str3 = loadedAdapterResponseInfo.getAdSourceName();
                    }
                    org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onPreloadAdLoaded", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, str3);
                }

                @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
                public void onAdsExhausted(java.lang.String str2) {
                    org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdsExhausted", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, str2);
                }

                @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
                public void onAdFailedToPreload(java.lang.String str2, com.google.android.gms.ads.AdError adError) {
                    org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToPreload", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adError.getMessage());
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void showPreloadInterstitialAd(java.lang.String str) {
        try {
            com.google.android.gms.ads.interstitial.InterstitialAd pollAd = com.google.android.gms.ads.interstitial.InterstitialAdPreloader.pollAd(new org.json.JSONObject(str).getString("AD_UNIT_ID"));
            if (pollAd != null) {
                this.interstitialAdCache = pollAd;
                showInterstitialAd(str);
            } else {
                calllua("showInterstitialAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToShowFullScreenContent", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "interstitialAdCache==null");
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void startPreloadRewardedAd(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String string = jSONObject.getString("AD_UNIT_ID");
            int i = jSONObject.getInt("BUFF_SIZE");
            if (com.google.android.gms.ads.rewarded.RewardedAdPreloader.isAdAvailable(string)) {
                com.google.android.gms.ads.rewarded.RewardedAdPreloader.destroyAll();
            }
            com.google.android.gms.ads.rewarded.RewardedAdPreloader.start(string, new com.google.android.gms.ads.preload.PreloadConfiguration.Builder(string).setBufferSize(i).build(), new com.google.android.gms.ads.preload.PreloadCallbackV2() { // from class: org.cocos2dx.bole.sdk.AdMobSDK.12
                @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
                public void onAdPreloaded(java.lang.String str2, com.google.android.gms.ads.ResponseInfo responseInfo) {
                    java.lang.String str3;
                    com.google.android.gms.ads.AdapterResponseInfo loadedAdapterResponseInfo = responseInfo.getLoadedAdapterResponseInfo();
                    if (loadedAdapterResponseInfo == null) {
                        str3 = "";
                    } else {
                        str3 = loadedAdapterResponseInfo.getAdSourceName();
                    }
                    org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onPreloadAdLoaded", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, str3);
                }

                @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
                public void onAdsExhausted(java.lang.String str2) {
                    org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdsExhausted", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, str2);
                }

                @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
                public void onAdFailedToPreload(java.lang.String str2, com.google.android.gms.ads.AdError adError) {
                    org.cocos2dx.bole.sdk.AdMobSDK.this.calllua("loadRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToPreload", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, adError.getMessage());
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void showPreloadRewardedAd(java.lang.String str) {
        try {
            com.google.android.gms.ads.rewarded.RewardedAd pollAd = com.google.android.gms.ads.rewarded.RewardedAdPreloader.pollAd(new org.json.JSONObject(str).getString("AD_UNIT_ID"));
            if (pollAd != null) {
                this.rewardedAdCache = pollAd;
                showRewardedAd(str);
            } else {
                calllua("showRewardedAd", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "onAdFailedToShowFullScreenContent", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "rewardedAdCache==null");
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
