package com.unity3d.ironsourceads.interstitial;

/* loaded from: classes5.dex */
public interface InterstitialAdLoaderListener {
    void onInterstitialAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onInterstitialAdLoaded(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd);
}
