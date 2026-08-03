package com.google.android.exoplayer2.source.ads;

/* loaded from: classes3.dex */
public interface AdsLoader {

    public interface EventListener {

        /* renamed from: com.google.android.exoplayer2.source.ads.AdsLoader$EventListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onAdClicked(com.google.android.exoplayer2.source.ads.AdsLoader.EventListener _this) {
            }

            public static void $default$onAdLoadError(com.google.android.exoplayer2.source.ads.AdsLoader.EventListener _this, com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException adLoadException, com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
            }

            public static void $default$onAdPlaybackState(com.google.android.exoplayer2.source.ads.AdsLoader.EventListener _this, com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState) {
            }

            public static void $default$onAdTapped(com.google.android.exoplayer2.source.ads.AdsLoader.EventListener _this) {
            }
        }

        void onAdClicked();

        void onAdLoadError(com.google.android.exoplayer2.source.ads.AdsMediaSource.AdLoadException adLoadException, com.google.android.exoplayer2.upstream.DataSpec dataSpec);

        void onAdPlaybackState(com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState);

        void onAdTapped();
    }

    public interface Provider {
        com.google.android.exoplayer2.source.ads.AdsLoader getAdsLoader(com.google.android.exoplayer2.MediaItem.AdsConfiguration adsConfiguration);
    }

    void handlePrepareComplete(com.google.android.exoplayer2.source.ads.AdsMediaSource adsMediaSource, int i, int i2);

    void handlePrepareError(com.google.android.exoplayer2.source.ads.AdsMediaSource adsMediaSource, int i, int i2, java.io.IOException iOException);

    void release();

    void setPlayer(com.google.android.exoplayer2.Player player);

    void setSupportedContentTypes(int... iArr);

    void start(com.google.android.exoplayer2.source.ads.AdsMediaSource adsMediaSource, com.google.android.exoplayer2.upstream.DataSpec dataSpec, java.lang.Object obj, com.google.android.exoplayer2.ui.AdViewProvider adViewProvider, com.google.android.exoplayer2.source.ads.AdsLoader.EventListener eventListener);

    void stop(com.google.android.exoplayer2.source.ads.AdsMediaSource adsMediaSource, com.google.android.exoplayer2.source.ads.AdsLoader.EventListener eventListener);
}
