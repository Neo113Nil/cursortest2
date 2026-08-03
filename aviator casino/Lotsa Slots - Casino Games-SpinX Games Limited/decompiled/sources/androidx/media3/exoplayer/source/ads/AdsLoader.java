package androidx.media3.exoplayer.source.ads;

/* loaded from: classes2.dex */
public interface AdsLoader {

    public interface EventListener {

        /* renamed from: androidx.media3.exoplayer.source.ads.AdsLoader$EventListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onAdClicked(androidx.media3.exoplayer.source.ads.AdsLoader.EventListener _this) {
            }

            public static void $default$onAdLoadError(androidx.media3.exoplayer.source.ads.AdsLoader.EventListener _this, androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException adLoadException, androidx.media3.datasource.DataSpec dataSpec) {
            }

            public static void $default$onAdPlaybackState(androidx.media3.exoplayer.source.ads.AdsLoader.EventListener _this, androidx.media3.common.AdPlaybackState adPlaybackState) {
            }

            public static void $default$onAdTapped(androidx.media3.exoplayer.source.ads.AdsLoader.EventListener _this) {
            }
        }

        void onAdClicked();

        void onAdLoadError(androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException adLoadException, androidx.media3.datasource.DataSpec dataSpec);

        void onAdPlaybackState(androidx.media3.common.AdPlaybackState adPlaybackState);

        void onAdTapped();
    }

    public interface Provider {
        androidx.media3.exoplayer.source.ads.AdsLoader getAdsLoader(androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration);
    }

    void handlePrepareComplete(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, int i, int i2);

    void handlePrepareError(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, int i, int i2, java.io.IOException iOException);

    void release();

    void setPlayer(androidx.media3.common.Player player);

    void setSupportedContentTypes(int... iArr);

    void start(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, androidx.media3.datasource.DataSpec dataSpec, java.lang.Object obj, androidx.media3.common.AdViewProvider adViewProvider, androidx.media3.exoplayer.source.ads.AdsLoader.EventListener eventListener);

    void stop(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, androidx.media3.exoplayer.source.ads.AdsLoader.EventListener eventListener);
}
