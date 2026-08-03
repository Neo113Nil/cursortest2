package com.ironsource.adapters.ironsource;

/* loaded from: classes5.dex */
class IronSourceBannerListener implements com.ironsource.Hc {
    private java.lang.ref.WeakReference<com.ironsource.adapters.ironsource.IronSourceAdapter> mAdapter;
    private final java.lang.String mDemandSourceName;
    private final com.ironsource.mediationsdk.sdk.BannerSmashListener mListener;

    IronSourceBannerListener(com.ironsource.adapters.ironsource.IronSourceAdapter ironSourceAdapter, com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener, java.lang.String str) {
        this.mDemandSourceName = str;
        this.mListener = bannerSmashListener;
        this.mAdapter = new java.lang.ref.WeakReference<>(ironSourceAdapter);
    }

    @Override // com.ironsource.Hc
    public void onBannerClick() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " bannerListener");
        this.mListener.onBannerAdClicked();
    }

    @Override // com.ironsource.Hc
    public void onBannerInitFailed(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " bannerListener");
    }

    @Override // com.ironsource.Hc
    public void onBannerInitSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " bannerListener");
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadFail(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " bannerListener");
        this.mListener.onBannerAdLoadFailed(com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("load failed - error = " + str));
    }

    @Override // com.ironsource.Hc
    public void onBannerLoadSuccess(com.ironsource.J9 j9, com.ironsource.C3041f8 c3041f8) {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " bannerListener");
        if (this.mAdapter.get() != null) {
            if (c3041f8 == null) {
                this.mListener.onBannerAdLoadFailed(com.ironsource.mediationsdk.utils.ErrorBuilder.adContainerIsNull(this.mAdapter.get().getProviderName()));
                return;
            }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.ironsource.J9>> concurrentHashMap = this.mAdapter.get().mDemandSourceToBnAd;
            if (concurrentHashMap.get(this.mDemandSourceName) == null) {
                concurrentHashMap.put(this.mDemandSourceName, new java.util.ArrayList<>());
            }
            concurrentHashMap.get(this.mDemandSourceName).add(j9);
            com.ironsource.C3005d8 size = c3041f8.getSize();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(size.c(), size.a());
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(c3041f8, layoutParams);
        }
    }

    @Override // com.ironsource.Hc
    public void onBannerShowSuccess() {
        com.ironsource.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " onBannerShowSuccess");
        com.ironsource.mediationsdk.sdk.BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
