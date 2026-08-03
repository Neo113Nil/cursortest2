package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiAdFactory {
    public com.google.ads.mediation.inmobi.InMobiBannerWrapper createInMobiBannerWrapper(android.content.Context context, java.lang.Long l) {
        return new com.google.ads.mediation.inmobi.InMobiBannerWrapper(new com.inmobi.ads.InMobiBanner(context, l.longValue()));
    }

    public com.google.ads.mediation.inmobi.InMobiAdViewHolder createInMobiAdViewHolder(android.content.Context context) {
        return new com.google.ads.mediation.inmobi.InMobiAdViewHolder(new android.widget.FrameLayout(context));
    }

    public com.google.ads.mediation.inmobi.InMobiInterstitialWrapper createInMobiInterstitialWrapper(android.content.Context context, java.lang.Long l, com.inmobi.ads.listeners.InterstitialAdEventListener interstitialAdEventListener) {
        return new com.google.ads.mediation.inmobi.InMobiInterstitialWrapper(new com.inmobi.ads.InMobiInterstitial(context, l.longValue(), interstitialAdEventListener));
    }

    public com.google.ads.mediation.inmobi.InMobiNativeWrapper createInMobiNativeWrapper(android.content.Context context, java.lang.Long l, com.inmobi.ads.listeners.NativeAdEventListener nativeAdEventListener) {
        return new com.google.ads.mediation.inmobi.InMobiNativeWrapper(new com.inmobi.ads.InMobiNative(context, l.longValue(), nativeAdEventListener));
    }

    public com.google.ads.mediation.inmobi.InMobiNativeWrapper createInMobiNativeWrapper(com.inmobi.ads.InMobiNative inMobiNative) {
        return new com.google.ads.mediation.inmobi.InMobiNativeWrapper(inMobiNative);
    }
}
