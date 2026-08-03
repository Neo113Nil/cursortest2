package androidx.media3.exoplayer.source;

/* loaded from: classes2.dex */
public interface MediaSource {

    public interface Factory {
        public static final androidx.media3.exoplayer.source.MediaSource.Factory UNSUPPORTED = androidx.media3.exoplayer.source.MediaSourceFactory.UNSUPPORTED;

        /* renamed from: androidx.media3.exoplayer.source.MediaSource$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            @java.lang.Deprecated
            public static androidx.media3.exoplayer.source.MediaSource.Factory $default$experimentalParseSubtitlesDuringExtraction(androidx.media3.exoplayer.source.MediaSource.Factory _this, boolean z) {
                return _this;
            }

            public static androidx.media3.exoplayer.source.MediaSource.Factory $default$setCmcdConfigurationFactory(androidx.media3.exoplayer.source.MediaSource.Factory _this, androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory) {
                return _this;
            }

            public static androidx.media3.exoplayer.source.MediaSource.Factory $default$setSubtitleParserFactory(androidx.media3.exoplayer.source.MediaSource.Factory _this, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
                return _this;
            }
        }

        androidx.media3.exoplayer.source.MediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem);

        @java.lang.Deprecated
        androidx.media3.exoplayer.source.MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z);

        int[] getSupportedTypes();

        androidx.media3.exoplayer.source.MediaSource.Factory setCmcdConfigurationFactory(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory);

        androidx.media3.exoplayer.source.MediaSource.Factory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider);

        androidx.media3.exoplayer.source.MediaSource.Factory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy);

        androidx.media3.exoplayer.source.MediaSource.Factory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory);
    }

    public interface MediaSourceCaller {
        void onSourceInfoRefreshed(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline);
    }

    void addDrmEventListener(android.os.Handler handler, androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener);

    void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener);

    boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem);

    androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j);

    void disable(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller);

    void enable(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller);

    androidx.media3.common.Timeline getInitialTimeline();

    androidx.media3.common.MediaItem getMediaItem();

    boolean isSingleWindow();

    void maybeThrowSourceInfoRefreshError() throws java.io.IOException;

    @java.lang.Deprecated
    void prepareSource(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller, androidx.media3.datasource.TransferListener transferListener);

    void prepareSource(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller, androidx.media3.datasource.TransferListener transferListener, androidx.media3.exoplayer.analytics.PlayerId playerId);

    void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod);

    void releaseSource(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller);

    void removeDrmEventListener(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener);

    void removeEventListener(androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener);

    void updateMediaItem(androidx.media3.common.MediaItem mediaItem);

    public static final class MediaPeriodId {
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final int nextAdGroupIndex;
        public final java.lang.Object periodUid;
        public final long windowSequenceNumber;

        public MediaPeriodId(java.lang.Object obj) {
            this(obj, -1L);
        }

        public MediaPeriodId(java.lang.Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public MediaPeriodId(java.lang.Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public MediaPeriodId(java.lang.Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, -1);
        }

        private MediaPeriodId(java.lang.Object obj, int i, int i2, long j, int i3) {
            this.periodUid = obj;
            this.adGroupIndex = i;
            this.adIndexInAdGroup = i2;
            this.windowSequenceNumber = j;
            this.nextAdGroupIndex = i3;
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId copyWithPeriodUid(java.lang.Object obj) {
            return this.periodUid.equals(obj) ? this : new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(obj, this.adGroupIndex, this.adIndexInAdGroup, this.windowSequenceNumber, this.nextAdGroupIndex);
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId copyWithWindowSequenceNumber(long j) {
            return this.windowSequenceNumber == j ? this : new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(this.periodUid, this.adGroupIndex, this.adIndexInAdGroup, j, this.nextAdGroupIndex);
        }

        public boolean isAd() {
            return this.adGroupIndex != -1;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.source.MediaSource.MediaPeriodId)) {
                return false;
            }
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) obj;
            return this.periodUid.equals(mediaPeriodId.periodUid) && this.adGroupIndex == mediaPeriodId.adGroupIndex && this.adIndexInAdGroup == mediaPeriodId.adIndexInAdGroup && this.windowSequenceNumber == mediaPeriodId.windowSequenceNumber && this.nextAdGroupIndex == mediaPeriodId.nextAdGroupIndex;
        }

        public int hashCode() {
            return ((((((((com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.periodUid.hashCode()) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup) * 31) + ((int) this.windowSequenceNumber)) * 31) + this.nextAdGroupIndex;
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.MediaSource$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$canUpdateMediaItem(androidx.media3.exoplayer.source.MediaSource _this, androidx.media3.common.MediaItem mediaItem) {
            return false;
        }

        public static androidx.media3.common.Timeline $default$getInitialTimeline(androidx.media3.exoplayer.source.MediaSource _this) {
            return null;
        }

        public static boolean $default$isSingleWindow(androidx.media3.exoplayer.source.MediaSource _this) {
            return true;
        }

        public static void $default$updateMediaItem(androidx.media3.exoplayer.source.MediaSource _this, androidx.media3.common.MediaItem mediaItem) {
        }
    }
}
