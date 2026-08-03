package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public abstract class AbstractAdapter implements com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface, com.ironsource.mediationsdk.sdk.BannerAdapterInterface, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface {
    private static java.lang.Boolean mAdapterDebug;
    private java.lang.String mPluginType;
    private final java.lang.String mProviderName;
    private java.lang.String mProviderNetworkKey;
    private final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface> mAdUnitAdapters = new java.util.HashMap();
    protected com.ironsource.mediationsdk.LoadWhileShowSupportState mLWSSupportState = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE;
    protected com.ironsource.mediationsdk.LoadWhileShowSupportState mBannerLoadWhileShowSupportState = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;

    public AbstractAdapter(java.lang.String str) {
        this.mProviderName = str;
    }

    private com.ironsource.mediationsdk.sdk.BannerAdapterInterface a() {
        return (com.ironsource.mediationsdk.sdk.BannerAdapterInterface) this.mAdUnitAdapters.get(com.unity3d.mediation.LevelPlay.AdFormat.BANNER);
    }

    private com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface b() {
        return (com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface) this.mAdUnitAdapters.get(com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL);
    }

    private com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface c() {
        return (com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface) this.mAdUnitAdapters.get(com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD);
    }

    private com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface d() {
        return (com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface) this.mAdUnitAdapters.get(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED);
    }

    public static void postBackgroundThread(java.lang.Runnable runnable) {
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postAdapterBackgroundTask(runnable);
    }

    public static void postOnUIThread(java.lang.Runnable runnable) {
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        com.ironsource.mediationsdk.sdk.BannerAdapterInterface a2 = a();
        if (a2 != null) {
            a2.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> bannerBiddingData = getBannerBiddingData(jSONObject, jSONObject2);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface b = b();
        if (b != null) {
            b.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> interstitialBiddingData = getInterstitialBiddingData(jSONObject, jSONObject2);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void collectNativeAdBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface c = c();
        if (c != null) {
            c.collectNativeAdBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> nativeAdBiddingData = getNativeAdBiddingData(jSONObject, jSONObject2);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.collectRewardedVideoBiddingData(jSONObject, jSONObject2, biddingDataCallback);
            return;
        }
        java.util.Map<java.lang.String, java.lang.Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(jSONObject, jSONObject2);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyBanner(org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.sdk.BannerAdapterInterface a2 = a();
        if (a2 != null) {
            a2.destroyBanner(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void destroyInterstitialAd(org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface b = b();
        if (b != null) {
            b.destroyInterstitialAd(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface c = c();
        if (c != null) {
            c.destroyNativeAd(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void destroyRewardedVideoAd(org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.destroyRewardedVideoAd(jSONObject);
        }
    }

    public void earlyInit(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int i) {
        com.ironsource.mediationsdk.sdk.BannerAdapterInterface a2 = a();
        if (a2 != null) {
            return a2.getAdaptiveHeight(i);
        }
        return -1;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getBannerBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.ironsource.mediationsdk.sdk.BannerAdapterInterface a2 = a();
        if (a2 != null) {
            return a2.getBannerBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public com.ironsource.mediationsdk.LoadWhileShowSupportState getBannerLoadWhileShowSupportState(org.json.JSONObject jSONObject) {
        return this.mBannerLoadWhileShowSupportState;
    }

    public abstract java.lang.String getCoreSDKVersion();

    public java.lang.String getDynamicUserId() {
        return com.ironsource.mediationsdk.p.h().g();
    }

    public java.util.Map<java.lang.String, java.lang.Object> getInterstitialBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface b = b();
        if (b != null) {
            return b.getInterstitialBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public com.ironsource.mediationsdk.LoadWhileShowSupportState getLoadWhileShowSupportState(org.json.JSONObject jSONObject) {
        return this.mLWSSupportState;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getNativeAdBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface c = c();
        if (c != null) {
            return c.getNativeAdBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public java.lang.String getPluginType() {
        return this.mPluginType;
    }

    public java.lang.String getProviderName() {
        return this.mProviderName;
    }

    public java.lang.String getProviderNetworkKey() {
        return this.mProviderNetworkKey;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getRewardedVideoBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface d = d();
        if (d != null) {
            return d.getRewardedVideoBiddingData(jSONObject, jSONObject2);
        }
        return null;
    }

    public abstract java.lang.String getVersion();

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface d = d();
            if (d != null) {
                d.initAndLoadRewardedVideo(str, str2, jSONObject, jSONObject2, rewardedVideoSmashListener);
            } else if (rewardedVideoSmashListener != null) {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        } catch (java.lang.Error e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    public void initBannerForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        try {
            com.ironsource.mediationsdk.sdk.BannerAdapterInterface a2 = a();
            if (a2 != null) {
                a2.initBannerForBidding(str, str2, jSONObject, bannerSmashListener);
            } else if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, "method not implemented"));
            }
        } catch (java.lang.Error e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error - ");
            sb.append(e.getMessage());
            bannerSmashListener.onBannerInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, sb.toString()));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        try {
            com.ironsource.mediationsdk.sdk.BannerAdapterInterface a2 = a();
            if (a2 != null) {
                a2.initBanners(str, str2, jSONObject, bannerSmashListener);
            } else if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, "method not implemented"));
            }
        } catch (java.lang.Error e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error - ");
            sb.append(e.getMessage());
            bannerSmashListener.onBannerInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, sb.toString()));
        }
    }

    public void initInterstitial(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        try {
            com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface b = b();
            if (b != null) {
                b.initInterstitial(str, str2, jSONObject, interstitialSmashListener);
            } else if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, "method not implemented"));
            }
        } catch (java.lang.Error e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error - ");
            sb.append(e.getMessage());
            interstitialSmashListener.onInterstitialInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, sb.toString()));
        }
    }

    public void initInterstitialForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        try {
            com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface b = b();
            if (b != null) {
                b.initInterstitialForBidding(str, str2, jSONObject, interstitialSmashListener);
            } else if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, "method not implemented"));
            }
        } catch (java.lang.Error e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error - ");
            sb.append(e.getMessage());
            interstitialSmashListener.onInterstitialInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, sb.toString()));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener) {
        com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface c = c();
        if (c != null) {
            c.initNativeAdForBidding(str, str2, jSONObject, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAds(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener) {
        com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface c = c();
        if (c != null) {
            c.initNativeAds(str, str2, jSONObject, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.initRewardedVideoForDemandOnly(str, str2, jSONObject, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface d = d();
            if (d != null) {
                d.initRewardedVideoWithCallback(str, str2, jSONObject, rewardedVideoSmashListener);
            } else if (rewardedVideoSmashListener != null) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, "method not implemented"));
            }
        } catch (java.lang.Error e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("provider -" + this.mProviderName + " error - " + e.getMessage());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error - ");
            sb.append(e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(510, sb.toString()));
        }
    }

    protected boolean isAdaptersDebugEnabled() {
        java.lang.Boolean bool = mAdapterDebug;
        return bool != null && bool.booleanValue();
    }

    public boolean isInterstitialReady(org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface b = b();
        if (b != null) {
            return b.isInterstitialReady(jSONObject);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface d = d();
        if (d != null) {
            return d.isRewardedVideoAvailable(jSONObject);
        }
        return false;
    }

    public boolean isUsingActivityBeforeImpression(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        return true;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.ISBannerSize iSBannerSize, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        com.ironsource.mediationsdk.sdk.BannerAdapterInterface a2 = a();
        if (a2 != null) {
            a2.loadBanner(jSONObject, jSONObject2, iSBannerSize, bannerSmashListener);
        }
    }

    public void loadBannerForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.ironsource.mediationsdk.ISBannerSize iSBannerSize, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        com.ironsource.mediationsdk.sdk.BannerAdapterInterface a2 = a();
        if (a2 != null) {
            a2.loadBannerForBidding(jSONObject, jSONObject2, str, iSBannerSize, bannerSmashListener);
        }
    }

    public void loadBannerForDemandOnlyForBidding(org.json.JSONObject jSONObject, java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        com.ironsource.mediationsdk.sdk.BannerAdapterInterface a2 = a();
        if (a2 != null) {
            a2.loadBannerForDemandOnlyForBidding(jSONObject, str, iSDemandOnlyBannerLayout, bannerSmashListener);
        }
    }

    public void loadInterstitial(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface b = b();
        if (b != null) {
            b.loadInterstitial(jSONObject, jSONObject2, interstitialSmashListener);
        }
    }

    public void loadInterstitialForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface b = b();
        if (b != null) {
            b.loadInterstitialForBidding(jSONObject, jSONObject2, str, interstitialSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAd(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener) {
        com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface c = c();
        if (c != null) {
            c.loadNativeAd(jSONObject, jSONObject2, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener nativeAdSmashListener) {
        com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface c = c();
        if (c != null) {
            c.loadNativeAdForBidding(jSONObject, jSONObject2, str, nativeAdSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.loadRewardedVideoForBidding(jSONObject, jSONObject2, str, rewardedVideoSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewBound(org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.sdk.BannerAdapterInterface a2 = a();
        if (a2 != null) {
            a2.onBannerViewBound(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewWillBind(org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.sdk.BannerAdapterInterface a2 = a();
        if (a2 != null) {
            a2.onBannerViewWillBind(jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(java.lang.String str) {
        java.util.Iterator<com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface> it = this.mAdUnitAdapters.values().iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed(str);
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        java.util.Iterator<com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface> it = this.mAdUnitAdapters.values().iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
    }

    protected void setAdapterDebug(java.lang.Boolean bool) {
        mAdapterDebug = bool;
    }

    protected void setBannerAdapter(com.ironsource.mediationsdk.sdk.BannerAdapterInterface bannerAdapterInterface) {
        this.mAdUnitAdapters.put(com.unity3d.mediation.LevelPlay.AdFormat.BANNER, bannerAdapterInterface);
    }

    protected void setConsent(boolean z) {
    }

    protected void setInterstitialAdapter(com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface interstitialAdapterInterface) {
        this.mAdUnitAdapters.put(com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, interstitialAdapterInterface);
    }

    protected void setMetaData(java.lang.String str, java.util.List<java.lang.String> list) {
    }

    protected void setNativeAdAdapter(com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface nativeAdAdapterInterface) {
        this.mAdUnitAdapters.put(com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD, nativeAdAdapterInterface);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(com.ironsource.mediationsdk.AdapterNetworkData adapterNetworkData) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("setNetworkData not implemented | adapter=" + getClass().getSimpleName() + ", networkData=" + adapterNetworkData);
    }

    public void setNewConsent(boolean z) {
        setConsent(z);
    }

    public void setPluginData(java.lang.String str) {
        this.mPluginType = str;
    }

    public void setProviderNetworkKey(java.lang.String str) {
        this.mProviderNetworkKey = str;
    }

    protected void setRewardedVideoAdapter(com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface rewardedVideoAdapterInterface) {
        this.mAdUnitAdapters.put(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, rewardedVideoAdapterInterface);
    }

    public void setTestMode(boolean z) {
    }

    public void showInterstitial(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface b = b();
        if (b != null) {
            b.showInterstitial(jSONObject, interstitialSmashListener);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface d = d();
        if (d != null) {
            d.showRewardedVideo(jSONObject, rewardedVideoSmashListener);
        }
    }
}
