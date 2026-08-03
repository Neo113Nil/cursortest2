package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public interface ISDemandOnlyInterstitialListener {
    void onInterstitialAdClicked(java.lang.String str);

    void onInterstitialAdClosed(java.lang.String str);

    void onInterstitialAdLoadFailed(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onInterstitialAdOpened(java.lang.String str);

    void onInterstitialAdReady(java.lang.String str);

    void onInterstitialAdShowFailed(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);
}
