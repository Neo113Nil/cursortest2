package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiBannerWrapper {
    private final com.inmobi.ads.InMobiBanner inMobiBanner;

    InMobiBannerWrapper(com.inmobi.ads.InMobiBanner inMobiBanner) {
        this.inMobiBanner = inMobiBanner;
    }

    public com.inmobi.ads.InMobiBanner getInMobiBanner() {
        return this.inMobiBanner;
    }

    public void setEnableAutoRefresh(java.lang.Boolean bool) {
        this.inMobiBanner.setEnableAutoRefresh(bool.booleanValue());
    }

    public void setAnimationType(com.inmobi.ads.InMobiBanner.AnimationType animationType) {
        this.inMobiBanner.setAnimationType(animationType);
    }

    public void setListener(com.inmobi.ads.listeners.BannerAdEventListener bannerAdEventListener) {
        this.inMobiBanner.setListener(bannerAdEventListener);
    }

    public void setWatermarkData(com.inmobi.ads.WatermarkData watermarkData) {
        this.inMobiBanner.setWatermarkData(watermarkData);
    }

    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        this.inMobiBanner.setLayoutParams(layoutParams);
    }

    public void setExtras(java.util.Map<java.lang.String, java.lang.String> map) {
        this.inMobiBanner.setExtras(map);
    }

    public void setKeywords(java.lang.String str) {
        this.inMobiBanner.setKeywords(str);
    }

    public void load() {
        this.inMobiBanner.load();
    }

    public void load(byte[] bArr) {
        this.inMobiBanner.load(bArr);
    }
}
