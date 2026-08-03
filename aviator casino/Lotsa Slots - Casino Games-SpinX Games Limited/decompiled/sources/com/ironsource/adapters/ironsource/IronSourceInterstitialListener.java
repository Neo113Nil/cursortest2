package com.ironsource.adapters.ironsource;

/* loaded from: classes5.dex */
public class IronSourceInterstitialListener implements com.ironsource.Jc {
    public final java.lang.String AD_VISIBLE_EVENT_NAME = "impressions";
    private final java.lang.String mDemandSourceName;
    private final com.ironsource.mediationsdk.sdk.InterstitialSmashListener mListener;

    IronSourceInterstitialListener(com.ironsource.mediationsdk.sdk.InterstitialSmashListener interstitialSmashListener, java.lang.String str) {
        this.mDemandSourceName = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.ironsource.Jc
    public void onInterstitialAdRewarded(java.lang.String str, int i) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener demandSourceId=" + str + " amount=" + i);
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClick() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClose() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialEventNotificationReceived(java.lang.String str, org.json.JSONObject jSONObject) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onInterstitialAdVisible();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitFailed(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadFailed(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdLoadFailed(com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadSuccess(com.ironsource.J9 j9) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialOpen() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowFailed(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdShowFailed(com.ironsource.mediationsdk.utils.ErrorBuilder.buildShowFailedError("Interstitial", str));
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
