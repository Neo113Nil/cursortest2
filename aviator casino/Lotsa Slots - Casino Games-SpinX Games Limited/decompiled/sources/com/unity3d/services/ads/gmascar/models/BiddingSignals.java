package com.unity3d.services.ads.gmascar.models;

/* loaded from: classes5.dex */
public class BiddingSignals {
    private final java.lang.String bannerSignal;
    private final java.lang.String interstitialSignal;
    private final java.lang.String rvSignal;

    public BiddingSignals(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.rvSignal = str;
        this.interstitialSignal = str2;
        this.bannerSignal = str3;
    }

    public BiddingSignals(java.lang.String str, java.lang.String str2) {
        this.rvSignal = str;
        this.interstitialSignal = str2;
        this.bannerSignal = "";
    }

    public java.lang.String getRvSignal() {
        return this.rvSignal;
    }

    public java.lang.String getInterstitialSignal() {
        return this.interstitialSignal;
    }

    public java.lang.String getBannerSignal() {
        return this.bannerSignal;
    }

    public boolean isEmpty() {
        return android.text.TextUtils.isEmpty(getRvSignal()) && android.text.TextUtils.isEmpty(getInterstitialSignal()) && android.text.TextUtils.isEmpty(getBannerSignal());
    }

    public java.util.Map<java.lang.String, java.lang.String> getMap() {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(getRvSignal())) {
            hashMap.put(com.unity3d.services.ads.gmascar.utils.ScarConstants.RV_SIGNAL_KEY, getRvSignal());
        }
        if (!android.text.TextUtils.isEmpty(getInterstitialSignal())) {
            hashMap.put(com.unity3d.services.ads.gmascar.utils.ScarConstants.IN_SIGNAL_KEY, getInterstitialSignal());
        }
        if (!android.text.TextUtils.isEmpty(getBannerSignal())) {
            hashMap.put(com.unity3d.services.ads.gmascar.utils.ScarConstants.BN_SIGNAL_KEY, getBannerSignal());
        }
        return hashMap;
    }
}
