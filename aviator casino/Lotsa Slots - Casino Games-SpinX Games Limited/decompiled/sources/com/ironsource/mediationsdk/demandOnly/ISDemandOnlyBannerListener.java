package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public interface ISDemandOnlyBannerListener {
    void onBannerAdClicked(java.lang.String str);

    void onBannerAdLeftApplication(java.lang.String str);

    void onBannerAdLoadFailed(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onBannerAdLoaded(java.lang.String str);

    void onBannerAdShown(java.lang.String str);
}
