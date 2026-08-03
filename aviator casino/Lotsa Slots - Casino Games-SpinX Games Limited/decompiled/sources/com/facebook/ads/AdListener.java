package com.facebook.ads;

/* loaded from: classes2.dex */
public interface AdListener {
    void onAdClicked(com.facebook.ads.Ad ad);

    void onAdLoaded(com.facebook.ads.Ad ad);

    void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError);

    void onLoggingImpression(com.facebook.ads.Ad ad);
}
