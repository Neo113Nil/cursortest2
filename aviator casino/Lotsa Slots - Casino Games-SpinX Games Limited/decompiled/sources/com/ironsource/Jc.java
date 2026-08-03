package com.ironsource;

/* loaded from: classes5.dex */
public interface Jc extends com.ironsource.Gc {
    void onInterstitialAdRewarded(java.lang.String str, int i);

    void onInterstitialClick();

    void onInterstitialClose();

    void onInterstitialEventNotificationReceived(java.lang.String str, org.json.JSONObject jSONObject);

    void onInterstitialInitFailed(java.lang.String str);

    void onInterstitialInitSuccess();

    void onInterstitialLoadFailed(java.lang.String str);

    void onInterstitialLoadSuccess(com.ironsource.J9 j9);

    void onInterstitialOpen();

    void onInterstitialShowFailed(java.lang.String str);

    void onInterstitialShowSuccess();
}
