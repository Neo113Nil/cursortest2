package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiInterstitialWrapper {
    private final com.inmobi.ads.InMobiInterstitial inMobiInterstitial;

    InMobiInterstitialWrapper(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        this.inMobiInterstitial = inMobiInterstitial;
    }

    public com.inmobi.ads.InMobiInterstitial getInMobiInterstitial() {
        return this.inMobiInterstitial;
    }

    public void setExtras(java.util.Map<java.lang.String, java.lang.String> map) {
        this.inMobiInterstitial.setExtras(map);
    }

    public void setKeywords(java.lang.String str) {
        this.inMobiInterstitial.setKeywords(str);
    }

    public void setWatermarkData(com.inmobi.ads.WatermarkData watermarkData) {
        this.inMobiInterstitial.setWatermarkData(watermarkData);
    }

    public void load() {
        this.inMobiInterstitial.load();
    }

    public void load(byte[] bArr) {
        this.inMobiInterstitial.load(bArr);
    }

    public java.lang.Boolean isReady() {
        return java.lang.Boolean.valueOf(this.inMobiInterstitial.isReady());
    }

    public void show() {
        this.inMobiInterstitial.show();
    }
}
