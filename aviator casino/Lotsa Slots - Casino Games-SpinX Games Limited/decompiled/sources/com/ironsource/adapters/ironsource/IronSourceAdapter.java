package com.ironsource.adapters.ironsource;

/* loaded from: classes5.dex */
public class IronSourceAdapter extends com.ironsource.mediationsdk.AbstractAdapter {
    public static final java.lang.String IRONSOURCE_BIDDING_TOKEN_KEY = "token";
    public static final java.lang.String IRONSOURCE_ONE_FLOW_KEY = "isOneFlow";
    private static final int IS_LOAD_EXCEPTION = 1000;
    private static final int IS_SHOW_EXCEPTION = 1001;
    private static final int RV_LOAD_EXCEPTION = 1002;
    private static final int RV_SHOW_EXCEPTION = 1003;
    private static final java.lang.String VERSION = "9.4.0";
    public final java.lang.String ADM_KEY;
    private final java.lang.String DEMAND_SOURCE_NAME;
    private final java.lang.String DYNAMIC_CONTROLLER_CONFIG;
    private final java.lang.String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final java.lang.String DYNAMIC_CONTROLLER_URL;
    private final java.lang.String LWS_SUPPORT_STATE;
    private final java.lang.String SDK_PLUGIN_TYPE;
    private final java.lang.String SESSION_ID;
    private long initDuration;
    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.ironsource.J9>> mDemandSourceToBnAd;
    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.J9> mDemandSourceToISAd;
    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.J9> mDemandSourceToRvAd;
    private final com.ironsource.C3188nc mNetworkGlobalDataWriter;
    private final com.ironsource.L8 sessionDepthService;
    private static java.util.concurrent.atomic.AtomicBoolean mDidInitSdk = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.ironsource.C3033f0 mBaseAdPlayerExtraParams = new com.ironsource.C3033f0();

    private IronSourceAdapter(java.lang.String str) {
        super(str);
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.SESSION_ID = "sessionid";
        this.SDK_PLUGIN_TYPE = com.ironsource.C3170mc.a.b;
        this.ADM_KEY = "adm";
        this.DEMAND_SOURCE_NAME = "demandSourceName";
        this.LWS_SUPPORT_STATE = "isSupportedLWS";
        this.mNetworkGlobalDataWriter = new com.ironsource.C3188nc();
        this.initDuration = 0L;
        this.sessionDepthService = com.ironsource.Jb.Y().s();
        this.mDemandSourceToRvAd = new java.util.concurrent.ConcurrentHashMap<>();
        this.mDemandSourceToISAd = new java.util.concurrent.ConcurrentHashMap<>();
        this.mDemandSourceToBnAd = new java.util.concurrent.ConcurrentHashMap<>();
        setNativeAdAdapter(new com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter(this));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r8 != false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.ironsource.C3005d8 convertBannerSize(android.content.Context context, com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        java.lang.String description = iSBannerSize.getDescription();
        description.hashCode();
        description.hashCode();
        char c = 65535;
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals(com.ironsource.mediationsdk.j.c)) {
                    c = 0;
                    break;
                }
                break;
            case 72205083:
                if (description.equals(com.ironsource.mediationsdk.j.b)) {
                    c = 1;
                    break;
                }
                break;
            case 79011241:
                if (description.equals(com.ironsource.mediationsdk.j.e)) {
                    c = 2;
                    break;
                }
                break;
            case 1951953708:
                if (description.equals(com.ironsource.mediationsdk.j.f6439a)) {
                    c = 3;
                    break;
                }
                break;
            case 1999208305:
                if (description.equals(com.ironsource.mediationsdk.j.f)) {
                    c = 4;
                    break;
                }
                break;
        }
        int i = 50;
        int i2 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        switch (c) {
            case 0:
                i2 = androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis;
                i = androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
                break;
            case 1:
                i = 90;
                break;
            case 2:
                boolean isLargeScreen = com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(context);
                if (isLargeScreen) {
                    i2 = 728;
                    break;
                }
                break;
            case 4:
                int height = iSBannerSize.getHeight();
                if (height == 50 || height == 90) {
                    i = height;
                    break;
                }
        }
        return null;
    }

    private com.ironsource.J9 createBannerAdInstance(java.lang.String str, com.ironsource.C3005d8 c3005d8, org.json.JSONObject jSONObject, com.ironsource.adapters.ironsource.LoadAdData loadAdData, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("creating banner ad instance for " + str);
        return new com.ironsource.K9(str, new com.ironsource.adapters.ironsource.IronSourceBannerListener(this, bannerSmashListener, str)).a(mBaseAdPlayerExtraParams.get()).a(jSONObject.optInt("instanceType", 2) == 2).c(jSONObject.optBoolean("isOneFlow")).a(c3005d8).b(loadAdData.isMultipleAdObjectsFlow()).b(loadAdData.adUnitId()).a();
    }

    private com.ironsource.J9 createInterstitialAdInstance(java.lang.String str, org.json.JSONObject jSONObject, com.ironsource.adapters.ironsource.LoadAdData loadAdData, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        boolean optBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z = jSONObject.optInt("instanceType", 2) == 2;
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isBidder=" + z);
        return new com.ironsource.K9(str, new com.ironsource.adapters.ironsource.IronSourceInterstitialListener(interstitialSmashListener, str)).a(mBaseAdPlayerExtraParams.get()).c(optBoolean).a(z).b(loadAdData.isMultipleAdObjectsFlow()).b(loadAdData.adUnitId()).a();
    }

    private com.ironsource.J9 createRewardedVideoAdInstance(java.lang.String str, boolean z, org.json.JSONObject jSONObject, com.ironsource.adapters.ironsource.LoadAdData loadAdData, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        boolean optBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z2 = jSONObject.optInt("instanceType", 2) == 2;
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isDemandOnly=" + z + " isBidder=" + z2);
        return new com.ironsource.K9(str, new com.ironsource.adapters.ironsource.IronSourceRewardedVideoListener(rewardedVideoSmashListener, str, z)).a(mBaseAdPlayerExtraParams.get()).c().c(optBoolean).b(loadAdData.isMultipleAdObjectsFlow()).a(z2).b(loadAdData.adUnitId()).a();
    }

    public static java.lang.String getAdapterSDKVersion() {
        return com.ironsource.sdk.utils.SDKUtils.getSDKVersion();
    }

    public static com.ironsource.mediationsdk.IntegrationData getIntegrationData(android.content.Context context) {
        return new com.ironsource.mediationsdk.IntegrationData("IronSource", "9.4.0");
    }

    private void initInterstitialInternal(java.lang.String str, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener, java.lang.String str2) {
        initSDK(str, jSONObject);
        interstitialSmashListener.onInterstitialInitSuccess();
    }

    private void initRewardedVideoInternal(java.lang.String str, org.json.JSONObject jSONObject) {
        initSDK(str, jSONObject);
    }

    private boolean isMultipleAdObjectsFlow(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean("isMultipleAdUnits", false);
    }

    private void loadBannerInternal(android.app.Activity activity, com.ironsource.mediationsdk.ISBannerSize iSBannerSize, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener, java.lang.String str, com.ironsource.adapters.ironsource.LoadAdData loadAdData) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            com.ironsource.C3005d8 convertBannerSize = convertBannerSize(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), iSBannerSize);
            if (convertBannerSize == null) {
                bannerSmashListener.onBannerAdLoadFailed(com.ironsource.mediationsdk.utils.ErrorBuilder.unsupportedBannerSize(getProviderName()));
            } else {
                com.ironsource.sdk.IronSourceNetwork.loadAdView(activity, createBannerAdInstance(demandSourceName, convertBannerSize, jSONObject, loadAdData, bannerSmashListener), new com.ironsource.adapters.ironsource.IronSourceLoadParameters.WithLog(new com.ironsource.adapters.ironsource.IronSourceLoadParameters.Base(jSONObject, str)).value());
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            bannerSmashListener.onBannerAdLoadFailed(com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - " + e.getMessage()));
        }
    }

    private void loadInterstitialAdInternal(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.adapters.ironsource.LoadAdData loadAdData, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) throws java.lang.Exception {
        com.ironsource.adapters.ironsource.IronSourceLoadParameters.WithLog withLog = new com.ironsource.adapters.ironsource.IronSourceLoadParameters.WithLog(new com.ironsource.adapters.ironsource.IronSourceLoadParameters.Base(jSONObject, str2));
        com.ironsource.J9 j9 = this.mDemandSourceToISAd.get(str);
        if (j9 == null) {
            j9 = createInterstitialAdInstance(str, jSONObject, loadAdData, interstitialSmashListener);
            this.mDemandSourceToISAd.put(str, j9);
        }
        com.ironsource.sdk.IronSourceNetwork.loadAd(j9, withLog.value());
    }

    private void loadRewardedVideoAdInternal(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, com.ironsource.adapters.ironsource.LoadAdData loadAdData, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) throws java.lang.Exception {
        com.ironsource.adapters.ironsource.IronSourceLoadParameters.WithLog withLog = new com.ironsource.adapters.ironsource.IronSourceLoadParameters.WithLog(new com.ironsource.adapters.ironsource.IronSourceLoadParameters.Base(jSONObject, str2));
        com.ironsource.J9 j9 = this.mDemandSourceToRvAd.get(str);
        if (j9 == null) {
            j9 = createRewardedVideoAdInstance(str, withLog.demandOnly(), jSONObject, loadAdData, rewardedVideoSmashListener);
            this.mDemandSourceToRvAd.put(str, j9);
        }
        com.ironsource.sdk.IronSourceNetwork.loadAd(j9, withLog.value());
    }

    private void showAdInternal(com.ironsource.J9 j9, com.ironsource.mediationsdk.IronSource.a aVar) throws java.lang.Exception {
        int a2 = this.sessionDepthService.a(aVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sessionDepth", java.lang.String.valueOf(a2));
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName=" + j9.g() + " showParams=" + hashMap);
        com.ironsource.sdk.IronSourceNetwork.showAd(com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity(), j9, hashMap);
    }

    public static com.ironsource.adapters.ironsource.IronSourceAdapter startAdapter(java.lang.String str) {
        return new com.ironsource.adapters.ironsource.IronSourceAdapter(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(org.json.JSONObject jSONObject) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose(demandSourceName + ": destroyBanner()");
        java.util.ArrayList<com.ironsource.J9> arrayList = this.mDemandSourceToBnAd.get(demandSourceName);
        if (arrayList != null) {
            try {
                java.util.Iterator<com.ironsource.J9> it = arrayList.iterator();
                while (it.hasNext()) {
                    com.ironsource.sdk.IronSourceNetwork.destroyAd(it.next());
                }
                this.mDemandSourceToBnAd.remove(demandSourceName);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("destroyBanner failed: " + e.getMessage());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void earlyInit(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        if (com.ironsource.mediationsdk.p.h().i() == null) {
            com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.error("Appkey is null for early init");
            return;
        }
        com.ironsource.mediationsdk.utils.IronSourceUtils.i(getDemandSourceName(jSONObject) + ": earlyInit");
        initSDK(com.ironsource.mediationsdk.p.h().i(), jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getBannerBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return new java.util.HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public java.lang.String getCoreSDKVersion() {
        return com.ironsource.sdk.utils.SDKUtils.getSDKVersion();
    }

    public java.lang.String getDemandSourceName(org.json.JSONObject jSONObject) {
        return !android.text.TextUtils.isEmpty(jSONObject.optString("demandSourceName")) ? jSONObject.optString("demandSourceName") : getProviderName();
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getInitParams() {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        java.lang.String pluginType = getPluginType();
        if (!android.text.TextUtils.isEmpty(pluginType)) {
            hashMap.put(com.ironsource.C3170mc.a.b, pluginType);
        }
        if (!android.text.TextUtils.isEmpty(com.ironsource.mediationsdk.p.h().o())) {
            hashMap.put("sessionid", com.ironsource.mediationsdk.p.h().o());
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getInterstitialBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return new java.util.HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public com.ironsource.mediationsdk.LoadWhileShowSupportState getLoadWhileShowSupportState(org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.LoadWhileShowSupportState loadWhileShowSupportState = this.mLWSSupportState;
        return (jSONObject == null || !jSONObject.optBoolean("isSupportedLWS")) ? loadWhileShowSupportState : com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public java.util.Map<java.lang.String, java.lang.Object> getRewardedVideoBiddingData(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return new java.util.HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public java.lang.String getVersion() {
        return "9.4.0";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
        loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        initSDK(str, jSONObject);
        bannerSmashListener.onBannerInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    public void initSDK(java.lang.String str, org.json.JSONObject jSONObject) {
        if (mDidInitSdk.compareAndSet(false, true)) {
            java.lang.String c = com.ironsource.mediationsdk.utils.IronSourceUtils.c();
            int optInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                optInt = 3;
            }
            com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API;
            ironLog.verbose("setting debug mode to " + optInt);
            com.ironsource.sdk.utils.SDKUtils.setDebugMode(optInt);
            java.lang.String a2 = com.ironsource.Jb.Y().h().a();
            if (android.text.TextUtils.isEmpty(a2)) {
                a2 = jSONObject.optString("controllerUrl");
            }
            com.ironsource.sdk.utils.SDKUtils.setControllerUrl(a2);
            ironLog.verbose("IronSourceNetwork setting controller url to " + a2);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("controllerConfig");
            java.lang.String jSONObject2 = optJSONObject != null ? optJSONObject.toString() : "";
            com.ironsource.sdk.utils.SDKUtils.setControllerConfig(jSONObject2);
            ironLog.verbose("IronSourceNetwork setting controller config to " + jSONObject2);
            java.util.HashMap<java.lang.String, java.lang.String> initParams = getInitParams();
            mBaseAdPlayerExtraParams.a(initParams);
            java.lang.String i = com.ironsource.mediationsdk.p.h().i();
            ironLog.verbose("with appKey=" + i + " userId=" + c + " parameters " + initParams);
            com.ironsource.sdk.IronSourceNetwork.addInitListener(new com.ironsource.Lc() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.1
                @Override // com.ironsource.Lc
                public void onFail(com.ironsource.C3220p8 c3220p8) {
                    com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener fail - code:" + c3220p8.a() + " message:" + c3220p8.b());
                    try {
                        com.ironsource.adapters.ironsource.IronSourceAdapter.this.initDuration = java.lang.System.currentTimeMillis() - com.ironsource.adapters.ironsource.IronSourceAdapter.this.initDuration;
                        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.IADS_INIT_FAIL, new org.json.JSONObject().put("reason", c3220p8.b()).put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, com.ironsource.adapters.ironsource.IronSourceAdapter.this.initDuration)));
                    } catch (java.lang.Exception e) {
                        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.getMessage());
                    }
                }

                @Override // com.ironsource.Lc
                public void onSuccess() {
                    com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener success");
                    try {
                        com.ironsource.adapters.ironsource.IronSourceAdapter.this.initDuration = java.lang.System.currentTimeMillis() - com.ironsource.adapters.ironsource.IronSourceAdapter.this.initDuration;
                        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.IADS_INIT_SUCCESS, new org.json.JSONObject().put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, com.ironsource.adapters.ironsource.IronSourceAdapter.this.initDuration)));
                    } catch (java.lang.Exception unused) {
                    }
                }
            });
            try {
                this.initDuration = java.lang.System.currentTimeMillis();
                com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.IADS_INIT, new org.json.JSONObject()));
            } catch (java.lang.Exception unused) {
            }
            com.ironsource.sdk.IronSourceNetwork.initSDK(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), i, c, initParams);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(org.json.JSONObject jSONObject) {
        com.ironsource.J9 j9 = this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject));
        return j9 != null && com.ironsource.sdk.IronSourceNetwork.isAdAvailableForInstance(j9);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(org.json.JSONObject jSONObject) {
        com.ironsource.J9 j9 = this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject));
        return j9 != null && com.ironsource.sdk.IronSourceNetwork.isAdAvailableForInstance(j9);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.ironsource.mediationsdk.ISBannerSize iSBannerSize, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        if (iSBannerSize != null) {
            loadBannerInternal(com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSize, jSONObject, bannerSmashListener, str, new com.ironsource.adapters.ironsource.LoadAdData(jSONObject2));
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner size is null"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(org.json.JSONObject jSONObject, java.lang.String str, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener) {
        if (iSDemandOnlyBannerLayout != null) {
            loadBannerInternal(iSDemandOnlyBannerLayout.getActivity(), iSDemandOnlyBannerLayout.getSize(), jSONObject, bannerSmashListener, str, new com.ironsource.adapters.ironsource.LoadAdData());
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadInterstitialAdInternal(demandSourceName, null, jSONObject, new com.ironsource.adapters.ironsource.LoadAdData(jSONObject2), interstitialSmashListener);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new com.ironsource.mediationsdk.logger.IronSourceError(1000, e.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadInterstitialAdInternal(demandSourceName, str, jSONObject, new com.ironsource.adapters.ironsource.LoadAdData(jSONObject2), interstitialSmashListener);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.error("for bidding exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new com.ironsource.mediationsdk.logger.IronSourceError(1000, e.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadRewardedVideoAdInternal(jSONObject, demandSourceName, null, new com.ironsource.adapters.ironsource.LoadAdData(jSONObject2), rewardedVideoSmashListener);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new com.ironsource.mediationsdk.logger.IronSourceError(1002, e.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            loadRewardedVideoAdInternal(jSONObject, demandSourceName, str, new com.ironsource.adapters.ironsource.LoadAdData(jSONObject2), rewardedVideoSmashListener);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new com.ironsource.mediationsdk.logger.IronSourceError(1002, e.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean z) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(z ? "true" : "false");
        sb.append(")");
        ironLog.verbose(sb.toString());
        com.unity3d.ironsourceads.IronSourceAds.setConsent(z);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setMetaData(java.lang.String str, java.util.List<java.lang.String> list) {
        if (list.isEmpty()) {
            return;
        }
        mBaseAdPlayerExtraParams.b(str, list.get(0));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener) {
        java.lang.String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            showAdInternal(this.mDemandSourceToISAd.get(demandSourceName), com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.error("exception " + e.getMessage());
            interstitialSmashListener.onInterstitialAdShowFailed(new com.ironsource.mediationsdk.logger.IronSourceError(1001, e.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            showAdInternal(this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject)), com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.error("exception " + e.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new com.ironsource.mediationsdk.logger.IronSourceError(1003, e.getMessage()));
        }
    }
}
