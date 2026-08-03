package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class i extends com.ironsource.mediationsdk.a<com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener> implements com.ironsource.mediationsdk.sdk.BannerSmashListener {
    public i(com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, java.util.UUID uuid) {
        super(abstractAdapter, networkSettings, com.ironsource.mediationsdk.IronSource.a.BANNER, uuid);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData) {
        java.lang.Integer num = adData.getInt("instanceType");
        com.ironsource.mediationsdk.o oVar = (com.ironsource.mediationsdk.o) adData.getAdUnitData().get(com.ironsource.K2.t);
        if (oVar == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("Banner layout is null, cannot load banner ad"));
            if (this.b.get() != null) {
                ((com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "Banner layout is null");
                return;
            }
            return;
        }
        if (num == null || num.intValue() != 1) {
            this.f6395a.loadBannerForBidding(jSONObject, jSONObject2, adData.getServerData(), oVar.getSize(), this);
        } else {
            this.f6395a.loadBanner(jSONObject, jSONObject2, oVar.getSize(), this);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    protected com.ironsource.mediationsdk.IronSource.a b() {
        return com.ironsource.mediationsdk.IronSource.a.BANNER;
    }

    @Override // com.ironsource.mediationsdk.a
    public void c(org.json.JSONObject jSONObject) {
        this.f6395a.onBannerViewBound(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.a
    public void d(org.json.JSONObject jSONObject) {
        this.f6395a.onBannerViewWillBind(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdClicked(java.util.Map map) {
        onBannerAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdLeftApplication();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLeftApplication(java.util.Map map) {
        onBannerAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdLoadFailed(a(ironSourceError) ? com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onBannerAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        onBannerAdLoaded(view, layoutParams, new java.util.HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdScreenDismissed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenDismissed(java.util.Map map) {
        onBannerAdScreenDismissed();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdScreenPresented();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenPresented(java.util.Map map) {
        onBannerAdScreenPresented();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        onBannerAdShown(new java.util.HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onBannerInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitSuccess(java.util.Map map) {
        onBannerInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams, java.util.Map<java.lang.String, java.lang.Object> map) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdLoadSuccess(view, layoutParams, map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener) this.b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject) {
        this.f6395a.destroyBanner(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        this.f6395a.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    protected boolean a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 606;
    }
}
