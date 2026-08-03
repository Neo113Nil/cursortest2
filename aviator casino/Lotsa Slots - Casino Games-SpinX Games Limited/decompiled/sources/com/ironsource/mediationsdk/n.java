package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class n extends com.ironsource.mediationsdk.a<com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener> implements com.ironsource.mediationsdk.sdk.InterstitialSmashListener {
    public n(com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, java.util.UUID uuid) {
        super(abstractAdapter, networkSettings, com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL, uuid);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData) {
        java.lang.Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f6395a.loadInterstitialForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f6395a.loadInterstitial(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    protected boolean b(org.json.JSONObject jSONObject) {
        return this.f6395a.isInterstitialReady(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void e(org.json.JSONObject jSONObject) {
        this.f6395a.showInterstitial(jSONObject, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClicked(java.util.Map map) {
        onInterstitialAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClosed(java.util.Map map) {
        onInterstitialAdClosed();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdLoadFailed(a(ironSourceError) ? com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onInterstitialAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        onInterstitialAdOpened(new java.util.HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onInterstitialAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
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
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onInterstitialInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitSuccess(java.util.Map map) {
        onInterstitialInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.a
    protected com.ironsource.mediationsdk.IronSource.a b() {
        return com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener) this.b.get()).onAdLoadSuccess(map);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        this.f6395a.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject) {
        this.f6395a.destroyInterstitialAd(jSONObject);
    }

    protected boolean a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1158;
    }
}
