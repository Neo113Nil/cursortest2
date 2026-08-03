package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class v extends com.ironsource.mediationsdk.a<com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener> implements com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener {
    public v(com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, java.util.UUID uuid) {
        super(abstractAdapter, networkSettings, com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO, uuid);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData) {
        java.lang.Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f6395a.loadRewardedVideoForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f6395a.loadRewardedVideo(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    protected boolean b(org.json.JSONObject jSONObject) {
        return this.f6395a.isRewardedVideoAvailable(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void e(org.json.JSONObject jSONObject) {
        this.f6395a.showRewardedVideo(jSONObject, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClicked(java.util.Map map) {
        onRewardedVideoAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClosed(java.util.Map map) {
        onRewardedVideoAdClosed();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdEnded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdEnded(java.util.Map map) {
        onRewardedVideoAdEnded();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdRewarded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdRewarded(java.util.Map map) {
        onRewardedVideoAdRewarded();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onRewardedVideoAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdStarted();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdStarted(java.util.Map map) {
        onRewardedVideoAdStarted();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdVisible();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdVisible(java.util.Map map) {
        onRewardedVideoAdVisible();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
        onRewardedVideoAvailabilityChanged(z, java.util.Collections.emptyMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onRewardedVideoInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitSuccess(java.util.Map map) {
        onRewardedVideoInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdLoadFailed(b(ironSourceError) ? com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : a(ironSourceError) ? com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map map) {
        onRewardedVideoLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdLoadSuccess();
        }
    }

    protected boolean b(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1058;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z, java.util.Map<java.lang.String, java.lang.Object> map) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a("available = " + z));
        if (this.b.get() != null) {
            if (z) {
                ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdLoadSuccess(map);
            } else {
                ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdLoadFailed(com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, "");
            }
        }
    }

    @Override // com.ironsource.mediationsdk.a
    protected com.ironsource.mediationsdk.IronSource.a b() {
        return com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.b.get() != null) {
            ((com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener) this.b.get()).onAdLoadSuccess(map);
        }
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        this.f6395a.collectRewardedVideoBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.a
    protected void a(org.json.JSONObject jSONObject) {
        this.f6395a.destroyRewardedVideoAd(jSONObject);
    }

    private boolean a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1057;
    }
}
