package com.ironsource.adapters.ironsource;

/* loaded from: classes5.dex */
public class IronSourceRewardedVideoListener implements com.ironsource.Jc {
    public final java.lang.String AD_VISIBLE_EVENT_NAME = "impressions";
    private final java.lang.String mDemandSourceName;
    boolean mIsRvDemandOnly;
    com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener mListener;

    IronSourceRewardedVideoListener(com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener rewardedVideoSmashListener, java.lang.String str, boolean z) {
        this.mDemandSourceName = str;
        this.mListener = rewardedVideoSmashListener;
        this.mIsRvDemandOnly = z;
    }

    @Override // com.ironsource.Jc
    public void onInterstitialAdRewarded(java.lang.String str, int i) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener demandSourceId=" + str + " amount=" + i);
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClick() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClose() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdClosed();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialEventNotificationReceived(java.lang.String str, org.json.JSONObject jSONObject) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener eventName = " + str);
        if ("impressions".equals(str)) {
            this.mListener.onRewardedVideoAdVisible();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitFailed(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadFailed(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener " + str);
        this.mListener.onRewardedVideoLoadFailed(com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(str));
        if (this.mIsRvDemandOnly) {
            return;
        }
        this.mListener.onRewardedVideoAvailabilityChanged(false);
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadSuccess(com.ironsource.J9 j9) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        if (this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoLoadSuccess();
        } else {
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialOpen() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowFailed(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + "rewardedVideoListener " + str);
        this.mListener.onRewardedVideoAdShowFailed(com.ironsource.mediationsdk.utils.ErrorBuilder.buildShowFailedError(com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }
}
