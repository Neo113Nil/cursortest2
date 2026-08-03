package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class SingleSampleMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource {
    private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    private final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private final long durationUs;
    private final com.google.android.exoplayer2.Format format;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final com.google.android.exoplayer2.MediaItem mediaItem;
    private final com.google.android.exoplayer2.Timeline timeline;
    private com.google.android.exoplayer2.upstream.TransferListener transferListener;
    private final boolean treatLoadErrorsAsEndOfStream;

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }

    public static final class Factory {
        private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
        private java.lang.Object tag;
        private java.lang.String trackId;
        private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy();
        private boolean treatLoadErrorsAsEndOfStream = true;

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
            this.dataSourceFactory = (com.google.android.exoplayer2.upstream.DataSource.Factory) com.google.android.exoplayer2.util.Assertions.checkNotNull(factory);
        }

        public com.google.android.exoplayer2.source.SingleSampleMediaSource.Factory setTag(java.lang.Object obj) {
            this.tag = obj;
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.source.SingleSampleMediaSource.Factory setTrackId(java.lang.String str) {
            this.trackId = str;
            return this;
        }

        public com.google.android.exoplayer2.source.SingleSampleMediaSource.Factory setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy();
            }
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public com.google.android.exoplayer2.source.SingleSampleMediaSource.Factory setTreatLoadErrorsAsEndOfStream(boolean z) {
            this.treatLoadErrorsAsEndOfStream = z;
            return this;
        }

        public com.google.android.exoplayer2.source.SingleSampleMediaSource createMediaSource(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration subtitleConfiguration, long j) {
            return new com.google.android.exoplayer2.source.SingleSampleMediaSource(this.trackId, subtitleConfiguration, this.dataSourceFactory, j, this.loadErrorHandlingPolicy, this.treatLoadErrorsAsEndOfStream, this.tag);
        }
    }

    private SingleSampleMediaSource(java.lang.String str, com.google.android.exoplayer2.MediaItem.SubtitleConfiguration subtitleConfiguration, com.google.android.exoplayer2.upstream.DataSource.Factory factory, long j, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean z, java.lang.Object obj) {
        this.dataSourceFactory = factory;
        this.durationUs = j;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.treatLoadErrorsAsEndOfStream = z;
        com.google.android.exoplayer2.MediaItem build = new com.google.android.exoplayer2.MediaItem.Builder().setUri(android.net.Uri.EMPTY).setMediaId(subtitleConfiguration.uri.toString()).setSubtitleConfigurations(com.google.common.collect.ImmutableList.of(subtitleConfiguration)).setTag(obj).build();
        this.mediaItem = build;
        this.format = new com.google.android.exoplayer2.Format.Builder().setSampleMimeType((java.lang.String) com.google.common.base.MoreObjects.firstNonNull(subtitleConfiguration.mimeType, "text/x-unknown")).setLanguage(subtitleConfiguration.language).setSelectionFlags(subtitleConfiguration.selectionFlags).setRoleFlags(subtitleConfiguration.roleFlags).setLabel(subtitleConfiguration.label).setId(subtitleConfiguration.id != null ? subtitleConfiguration.id : str).build();
        this.dataSpec = new com.google.android.exoplayer2.upstream.DataSpec.Builder().setUri(subtitleConfiguration.uri).setFlags(1).build();
        this.timeline = new com.google.android.exoplayer2.source.SinglePeriodTimeline(j, true, false, false, (java.lang.Object) null, build);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        this.transferListener = transferListener;
        refreshSourceInfo(this.timeline);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.upstream.Allocator allocator, long j) {
        return new com.google.android.exoplayer2.source.SingleSampleMediaPeriod(this.dataSpec, this.dataSourceFactory, this.transferListener, this.format, this.durationUs, this.loadErrorHandlingPolicy, createEventDispatcher(mediaPeriodId), this.treatLoadErrorsAsEndOfStream);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        ((com.google.android.exoplayer2.source.SingleSampleMediaPeriod) mediaPeriod).release();
    }
}
