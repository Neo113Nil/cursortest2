package com.google.android.gms.ads.nativead;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public interface NativeCustomFormatAd {
    public static final java.lang.String ASSET_NAME_VIDEO = "_videoMediaView";

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public interface DisplayOpenMeasurement {
        void setView(android.view.View view);

        boolean start();
    }

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public interface OnCustomClickListener {
        void onCustomClick(com.google.android.gms.ads.nativead.NativeCustomFormatAd nativeCustomFormatAd, java.lang.String str);
    }

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public interface OnCustomFormatAdLoadedListener {
        void onCustomFormatAdLoaded(com.google.android.gms.ads.nativead.NativeCustomFormatAd nativeCustomFormatAd);
    }

    void destroy();

    java.util.List<java.lang.String> getAvailableAssetNames();

    java.lang.String getCustomFormatId();

    com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement();

    com.google.android.gms.ads.nativead.NativeAd.Image getImage(java.lang.String str);

    com.google.android.gms.ads.MediaContent getMediaContent();

    java.lang.CharSequence getText(java.lang.String str);

    void performClick(java.lang.String str);

    void recordImpression();
}
