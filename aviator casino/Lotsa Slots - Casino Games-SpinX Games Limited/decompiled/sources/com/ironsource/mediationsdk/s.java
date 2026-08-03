package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class s implements com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface, com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface, com.ironsource.mediationsdk.sdk.BannerSmashListener, com.ironsource.InterfaceC3268s3, com.ironsource.mediationsdk.sdk.InterstitialSmashListener, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.AbstractAdapter f6466a;
    private java.lang.ref.WeakReference<com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener> b;

    public s(com.ironsource.mediationsdk.AbstractAdapter abstractAdapter) {
        this.f6466a = abstractAdapter;
    }

    void a() {
        java.lang.String pluginType = com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginType();
        if (android.text.TextUtils.isEmpty(pluginType)) {
            return;
        }
        this.f6466a.setPluginData(pluginType);
    }

    @Override // com.ironsource.InterfaceC3268s3
    public void collectBiddingData(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.content.Context context, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        org.json.JSONObject a2 = com.ironsource.C3079ha.a(adData.getConfiguration());
        org.json.JSONObject a3 = com.ironsource.C3079ha.a(adData.getAdUnitData());
        com.ironsource.mediationsdk.IronSource.a aVar = (com.ironsource.mediationsdk.IronSource.a) adData.getAdUnitData().get("adUnit");
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            this.f6466a.collectRewardedVideoBiddingData(a2, a3, biddingDataCallback);
            return;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            this.f6466a.collectInterstitialBiddingData(a2, a3, biddingDataCallback);
            return;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            this.f6466a.collectBannerBiddingData(a2, a3, biddingDataCallback);
            return;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) {
            this.f6466a.collectNativeAdBiddingData(a2, a3, biddingDataCallback);
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("ad unit not supported - " + aVar);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public java.lang.String getAdapterVersion() {
        return this.f6466a.getVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public java.lang.String getNetworkSDKVersion() {
        return this.f6466a.getCoreSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.content.Context context, com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener) {
        this.b = new java.lang.ref.WeakReference<>(networkInitializationListener);
        java.lang.String str = (java.lang.String) adData.getAdUnitData().get("userId");
        com.ironsource.mediationsdk.IronSource.a aVar = (com.ironsource.mediationsdk.IronSource.a) adData.getAdUnitData().get("adUnit");
        a();
        org.json.JSONObject a2 = com.ironsource.C3079ha.a(adData.getConfiguration());
        a(a2);
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            this.f6466a.initRewardedVideoWithCallback("", str, a2, this);
            return;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            java.lang.Integer num = adData.getInt("instanceType");
            if (num == null || num.intValue() != 1) {
                this.f6466a.initInterstitialForBidding("", str, a2, this);
                return;
            } else {
                this.f6466a.initInterstitial("", str, a2, this);
                return;
            }
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            java.lang.Integer num2 = adData.getInt("instanceType");
            if (num2 == null || num2.intValue() != 1) {
                this.f6466a.initBannerForBidding("", str, a2, this);
                return;
            } else {
                this.f6466a.initBanners("", str, a2, this);
                return;
            }
        }
        if (aVar != com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("ad unit not supported - " + aVar);
            return;
        }
        java.lang.Integer num3 = adData.getInt("instanceType");
        if (num3 == null || num3.intValue() != 1) {
            this.f6466a.initNativeAdForBidding("", str, a2, this);
        } else {
            this.f6466a.initNativeAds("", str, a2, this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        return this.f6466a.isUsingActivityBeforeImpression(adFormat);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdClicked(java.util.Map map) {
        onBannerAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLeftApplication(java.util.Map map) {
        onBannerAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onBannerAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams, java.util.Map map) {
        onBannerAdLoaded(view, layoutParams);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenDismissed(java.util.Map map) {
        onBannerAdScreenDismissed();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenPresented(java.util.Map map) {
        onBannerAdScreenPresented();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdShown(java.util.Map map) {
        onBannerAdShown();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onBannerInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitSuccess(java.util.Map map) {
        onBannerInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClicked(java.util.Map map) {
        onInterstitialAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClosed(java.util.Map map) {
        onInterstitialAdClosed();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onInterstitialAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdOpened(java.util.Map map) {
        onInterstitialAdOpened();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdReady(java.util.Map map) {
        onInterstitialAdReady();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onInterstitialAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowSucceeded(java.util.Map map) {
        onInterstitialAdShowSucceeded();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdVisible(java.util.Map map) {
        onInterstitialAdVisible();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onInterstitialInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitSuccess(java.util.Map map) {
        onInterstitialInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoaded(com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdShown() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClicked(java.util.Map map) {
        onRewardedVideoAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClosed(java.util.Map map) {
        onRewardedVideoAdClosed();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdEnded(java.util.Map map) {
        onRewardedVideoAdEnded();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdOpened(java.util.Map map) {
        onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdRewarded(java.util.Map map) {
        onRewardedVideoAdRewarded();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onRewardedVideoAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdStarted(java.util.Map map) {
        onRewardedVideoAdStarted();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdVisible(java.util.Map map) {
        onRewardedVideoAdVisible();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAvailabilityChanged(boolean z, java.util.Map map) {
        onRewardedVideoAvailabilityChanged(z);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onRewardedVideoInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose();
        com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener = this.b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitSuccess(java.util.Map map) {
        onRewardedVideoInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onRewardedVideoLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadSuccess(java.util.Map map) {
        onRewardedVideoLoadSuccess();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface
    public void setAPSData(com.unity3d.mediation.LevelPlay.AdFormat adFormat, org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.sdk.BannerAdapterInterface bannerAdapterInterface = this.f6466a;
        if (bannerAdapterInterface instanceof com.ironsource.mediationsdk.SetAPSInterface) {
            ((com.ironsource.mediationsdk.SetAPSInterface) bannerAdapterInterface).setAPSData(adFormat, jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z) {
        this.f6466a.setAdapterDebug(java.lang.Boolean.valueOf(z));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z) {
        this.f6466a.setConsent(z);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(java.lang.String str, java.util.List<java.lang.String> list) {
        this.f6466a.setMetaData(str, list);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(com.ironsource.mediationsdk.AdapterNetworkData adapterNetworkData) {
        this.f6466a.setNetworkData(adapterNetworkData);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface
    public void setTestMode(boolean z) {
        this.f6466a.setTestMode(z);
    }

    private void a(org.json.JSONObject jSONObject) {
        if (com.ironsource.M6.J1.equals(this.f6466a.getProviderName())) {
            try {
                jSONObject.put("eventSender", new kotlin.jvm.functions.Function3() { // from class: com.ironsource.mediationsdk.s$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        kotlin.Unit a2;
                        a2 = com.ironsource.mediationsdk.s.a((com.unity3d.mediation.LevelPlay.AdFormat) obj, (java.lang.Integer) obj2, (java.lang.String) obj3);
                        return a2;
                    }
                });
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ kotlin.Unit a(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.lang.Integer num, java.lang.String str) {
        try {
            com.ironsource.C3360x5 c3360x5 = new com.ironsource.C3360x5(num.intValue(), new org.json.JSONObject().put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str));
            if (adFormat == com.unity3d.mediation.LevelPlay.AdFormat.REWARDED) {
                com.ironsource.C3065ge.i().a(c3360x5);
            } else {
                com.ironsource.F9.i().a(c3360x5);
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
        return kotlin.Unit.INSTANCE;
    }
}
