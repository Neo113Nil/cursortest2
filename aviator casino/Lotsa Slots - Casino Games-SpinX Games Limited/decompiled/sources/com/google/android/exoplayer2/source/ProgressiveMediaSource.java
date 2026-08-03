package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class ProgressiveMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource implements com.google.android.exoplayer2.source.ProgressiveMediaPeriod.Listener {
    public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
    private final int continueLoadingCheckIntervalBytes;
    private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    private final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadableLoadErrorHandlingPolicy;
    private final com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration;
    private final com.google.android.exoplayer2.MediaItem mediaItem;
    private final com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;
    private long timelineDurationUs;
    private boolean timelineIsLive;
    private boolean timelineIsPlaceholder;
    private boolean timelineIsSeekable;
    private com.google.android.exoplayer2.upstream.TransferListener transferListener;

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    public static final class Factory implements com.google.android.exoplayer2.source.MediaSourceFactory {
        private int continueLoadingCheckIntervalBytes;
        private java.lang.String customCacheKey;
        private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
        private com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider;
        private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;
        private java.lang.Object tag;

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
            this(factory, new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory());
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory, final com.google.android.exoplayer2.extractor.ExtractorsFactory extractorsFactory) {
            this(factory, new com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory() { // from class: com.google.android.exoplayer2.source.ProgressiveMediaSource$Factory$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
                public final com.google.android.exoplayer2.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(com.google.android.exoplayer2.analytics.PlayerId playerId) {
                    return com.google.android.exoplayer2.source.ProgressiveMediaSource.Factory.lambda$new$0(com.google.android.exoplayer2.extractor.ExtractorsFactory.this, playerId);
                }
            });
        }

        static /* synthetic */ com.google.android.exoplayer2.source.ProgressiveMediaExtractor lambda$new$0(com.google.android.exoplayer2.extractor.ExtractorsFactory extractorsFactory, com.google.android.exoplayer2.analytics.PlayerId playerId) {
            return new com.google.android.exoplayer2.source.BundledExtractorsAdapter(extractorsFactory);
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory factory2) {
            this(factory, factory2, new com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider(), new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy(), 1048576);
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory factory2, com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i) {
            this.dataSourceFactory = factory;
            this.progressiveMediaExtractorFactory = factory2;
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            this.continueLoadingCheckIntervalBytes = i;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public com.google.android.exoplayer2.source.ProgressiveMediaSource.Factory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy) com.google.android.exoplayer2.util.Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public com.google.android.exoplayer2.source.ProgressiveMediaSource.Factory setContinueLoadingCheckIntervalBytes(int i) {
            this.continueLoadingCheckIntervalBytes = i;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public com.google.android.exoplayer2.source.ProgressiveMediaSource.Factory setDrmSessionManagerProvider(com.google.android.exoplayer2.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = (com.google.android.exoplayer2.drm.DrmSessionManagerProvider) com.google.android.exoplayer2.util.Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public com.google.android.exoplayer2.source.ProgressiveMediaSource createMediaSource(com.google.android.exoplayer2.MediaItem mediaItem) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaItem.localConfiguration);
            boolean z = mediaItem.localConfiguration.tag == null && this.tag != null;
            boolean z2 = mediaItem.localConfiguration.customCacheKey == null && this.customCacheKey != null;
            if (z && z2) {
                mediaItem = mediaItem.buildUpon().setTag(this.tag).setCustomCacheKey(this.customCacheKey).build();
            } else if (z) {
                mediaItem = mediaItem.buildUpon().setTag(this.tag).build();
            } else if (z2) {
                mediaItem = mediaItem.buildUpon().setCustomCacheKey(this.customCacheKey).build();
            }
            com.google.android.exoplayer2.MediaItem mediaItem2 = mediaItem;
            return new com.google.android.exoplayer2.source.ProgressiveMediaSource(mediaItem2, this.dataSourceFactory, this.progressiveMediaExtractorFactory, this.drmSessionManagerProvider.get(mediaItem2), this.loadErrorHandlingPolicy, this.continueLoadingCheckIntervalBytes);
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{4};
        }
    }

    private ProgressiveMediaSource(com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory factory2, com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i) {
        this.localConfiguration = (com.google.android.exoplayer2.MediaItem.LocalConfiguration) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        this.mediaItem = mediaItem;
        this.dataSourceFactory = factory;
        this.progressiveMediaExtractorFactory = factory2;
        this.drmSessionManager = drmSessionManager;
        this.loadableLoadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.continueLoadingCheckIntervalBytes = i;
        this.timelineIsPlaceholder = true;
        this.timelineDurationUs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        this.transferListener = transferListener;
        this.drmSessionManager.prepare();
        this.drmSessionManager.setPlayer((android.os.Looper) com.google.android.exoplayer2.util.Assertions.checkNotNull(android.os.Looper.myLooper()), getPlayerId());
        notifySourceInfoRefreshed();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.upstream.Allocator allocator, long j) {
        com.google.android.exoplayer2.upstream.DataSource createDataSource = this.dataSourceFactory.createDataSource();
        com.google.android.exoplayer2.upstream.TransferListener transferListener = this.transferListener;
        if (transferListener != null) {
            createDataSource.addTransferListener(transferListener);
        }
        return new com.google.android.exoplayer2.source.ProgressiveMediaPeriod(this.localConfiguration.uri, createDataSource, this.progressiveMediaExtractorFactory.createProgressiveMediaExtractor(getPlayerId()), this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadableLoadErrorHandlingPolicy, createEventDispatcher(mediaPeriodId), this, allocator, this.localConfiguration.customCacheKey, this.continueLoadingCheckIntervalBytes);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        ((com.google.android.exoplayer2.source.ProgressiveMediaPeriod) mediaPeriod).release();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
        this.drmSessionManager.release();
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaPeriod.Listener
    public void onSourceInfoRefreshed(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.timelineDurationUs;
        }
        if (!this.timelineIsPlaceholder && this.timelineDurationUs == j && this.timelineIsSeekable == z && this.timelineIsLive == z2) {
            return;
        }
        this.timelineDurationUs = j;
        this.timelineIsSeekable = z;
        this.timelineIsLive = z2;
        this.timelineIsPlaceholder = false;
        notifySourceInfoRefreshed();
    }

    private void notifySourceInfoRefreshed() {
        com.google.android.exoplayer2.Timeline singlePeriodTimeline = new com.google.android.exoplayer2.source.SinglePeriodTimeline(this.timelineDurationUs, this.timelineIsSeekable, false, this.timelineIsLive, (java.lang.Object) null, this.mediaItem);
        if (this.timelineIsPlaceholder) {
            singlePeriodTimeline = new com.google.android.exoplayer2.source.ForwardingTimeline(this, singlePeriodTimeline) { // from class: com.google.android.exoplayer2.source.ProgressiveMediaSource.1
                @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
                public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, long j) {
                    super.getWindow(i, window, j);
                    window.isPlaceholder = true;
                    return window;
                }

                @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
                public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean z) {
                    super.getPeriod(i, period, z);
                    period.isPlaceholder = true;
                    return period;
                }
            };
        }
        refreshSourceInfo(singlePeriodTimeline);
    }
}
