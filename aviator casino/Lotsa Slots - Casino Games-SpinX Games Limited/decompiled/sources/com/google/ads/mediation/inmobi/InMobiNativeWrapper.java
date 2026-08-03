package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiNativeWrapper {
    private final com.inmobi.ads.InMobiNative inMobiNative;

    InMobiNativeWrapper(com.inmobi.ads.InMobiNative inMobiNative) {
        this.inMobiNative = inMobiNative;
    }

    public com.inmobi.ads.InMobiNative getInMobiNative() {
        return this.inMobiNative;
    }

    public void setVideoEventListener(com.inmobi.ads.listeners.VideoEventListener videoEventListener) {
        this.inMobiNative.setVideoEventListener(videoEventListener);
    }

    public void setExtras(java.util.Map<java.lang.String, java.lang.String> map) {
        this.inMobiNative.setExtras(map);
    }

    public void setKeywords(java.lang.String str) {
        this.inMobiNative.setKeywords(str);
    }

    public void load() {
        this.inMobiNative.load();
    }

    public void load(byte[] bArr) {
        this.inMobiNative.load(bArr);
    }

    public java.lang.String getAdCtaText() {
        return this.inMobiNative.getCtaText();
    }

    public java.lang.String getAdvertiserName() {
        return this.inMobiNative.getAdvertiserName();
    }

    public android.view.View getAdChoiceIcon() {
        return this.inMobiNative.getAdChoiceIcon();
    }

    public java.lang.String getAdDescription() {
        return this.inMobiNative.getAdDescription();
    }

    public java.lang.String getAdIconUrl() {
        com.inmobi.media.ads.nativeAd.InMobiNativeImage adIcon = this.inMobiNative.getAdIcon();
        if (adIcon == null) {
            return null;
        }
        return adIcon.getUrl();
    }

    public java.lang.String getAdTitle() {
        return this.inMobiNative.getAdTitle();
    }

    public org.json.JSONObject getCustomAdContent() {
        return this.inMobiNative.getAdContent();
    }

    public float getAdRating() {
        return this.inMobiNative.getAdRating();
    }

    public com.inmobi.media.ads.nativeAd.MediaView getMediaView() {
        return this.inMobiNative.getMediaView();
    }

    public java.lang.Boolean isVideo() {
        return java.lang.Boolean.valueOf(this.inMobiNative.isVideo());
    }

    public void registerForTracking(com.inmobi.media.ads.nativeAd.InMobiNativeViewData inMobiNativeViewData) {
        this.inMobiNative.registerViewForTracking(inMobiNativeViewData);
    }

    public void unTrackViews() {
        this.inMobiNative.unTrackViews();
    }

    public void destroy() {
        this.inMobiNative.destroy();
    }
}
