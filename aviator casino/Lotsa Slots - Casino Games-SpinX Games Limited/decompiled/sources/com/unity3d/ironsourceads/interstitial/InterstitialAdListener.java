package com.unity3d.ironsourceads.interstitial;

/* loaded from: classes5.dex */
public interface InterstitialAdListener {
    void onInterstitialAdClicked(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd);

    void onInterstitialAdDismissed(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd);

    void onInterstitialAdFailedToShow(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onInterstitialAdShown(com.unity3d.ironsourceads.interstitial.InterstitialAd interstitialAd);
}
