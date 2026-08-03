package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
final class PlaybackInfo {
    private static final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId PLACEHOLDER_MEDIA_PERIOD_ID = new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(new java.lang.Object());
    public volatile long bufferedPositionUs;
    public final long discontinuityStartPositionUs;
    public final boolean isLoading;
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId loadingMediaPeriodId;
    public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId periodId;
    public final boolean playWhenReady;
    public final com.google.android.exoplayer2.ExoPlaybackException playbackError;
    public final com.google.android.exoplayer2.PlaybackParameters playbackParameters;
    public final int playbackState;
    public final int playbackSuppressionReason;
    public volatile long positionUs;
    public final long requestedContentPositionUs;
    public final boolean sleepingForOffload;
    public final java.util.List<com.google.android.exoplayer2.metadata.Metadata> staticMetadata;
    public final com.google.android.exoplayer2.Timeline timeline;
    public volatile long totalBufferedDurationUs;
    public final com.google.android.exoplayer2.source.TrackGroupArray trackGroups;
    public final com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult;

    public static com.google.android.exoplayer2.PlaybackInfo createDummy(com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult) {
        com.google.android.exoplayer2.Timeline timeline = com.google.android.exoplayer2.Timeline.EMPTY;
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = PLACEHOLDER_MEDIA_PERIOD_ID;
        return new com.google.android.exoplayer2.PlaybackInfo(timeline, mediaPeriodId, -9223372036854775807L, 0L, 1, null, false, com.google.android.exoplayer2.source.TrackGroupArray.EMPTY, trackSelectorResult, com.google.common.collect.ImmutableList.of(), mediaPeriodId, false, 0, com.google.android.exoplayer2.PlaybackParameters.DEFAULT, 0L, 0L, 0L, false);
    }

    public PlaybackInfo(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, int i, com.google.android.exoplayer2.ExoPlaybackException exoPlaybackException, boolean z, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult, java.util.List<com.google.android.exoplayer2.metadata.Metadata> list, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId2, boolean z2, int i2, com.google.android.exoplayer2.PlaybackParameters playbackParameters, long j3, long j4, long j5, boolean z3) {
        this.timeline = timeline;
        this.periodId = mediaPeriodId;
        this.requestedContentPositionUs = j;
        this.discontinuityStartPositionUs = j2;
        this.playbackState = i;
        this.playbackError = exoPlaybackException;
        this.isLoading = z;
        this.trackGroups = trackGroupArray;
        this.trackSelectorResult = trackSelectorResult;
        this.staticMetadata = list;
        this.loadingMediaPeriodId = mediaPeriodId2;
        this.playWhenReady = z2;
        this.playbackSuppressionReason = i2;
        this.playbackParameters = playbackParameters;
        this.bufferedPositionUs = j3;
        this.totalBufferedDurationUs = j4;
        this.positionUs = j5;
        this.sleepingForOffload = z3;
    }

    public static com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getDummyPeriodForEmptyTimeline() {
        return PLACEHOLDER_MEDIA_PERIOD_ID;
    }

    public com.google.android.exoplayer2.PlaybackInfo copyWithNewPosition(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult, java.util.List<com.google.android.exoplayer2.metadata.Metadata> list) {
        return new com.google.android.exoplayer2.PlaybackInfo(this.timeline, mediaPeriodId, j2, j3, this.playbackState, this.playbackError, this.isLoading, trackGroupArray, trackSelectorResult, list, this.loadingMediaPeriodId, this.playWhenReady, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, j4, j, this.sleepingForOffload);
    }

    public com.google.android.exoplayer2.PlaybackInfo copyWithTimeline(com.google.android.exoplayer2.Timeline timeline) {
        return new com.google.android.exoplayer2.PlaybackInfo(timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.sleepingForOffload);
    }

    public com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackState(int i) {
        return new com.google.android.exoplayer2.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, i, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.sleepingForOffload);
    }

    public com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackError(com.google.android.exoplayer2.ExoPlaybackException exoPlaybackException) {
        return new com.google.android.exoplayer2.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, exoPlaybackException, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.sleepingForOffload);
    }

    public com.google.android.exoplayer2.PlaybackInfo copyWithIsLoading(boolean z) {
        return new com.google.android.exoplayer2.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, z, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.sleepingForOffload);
    }

    public com.google.android.exoplayer2.PlaybackInfo copyWithLoadingMediaPeriodId(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return new com.google.android.exoplayer2.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, mediaPeriodId, this.playWhenReady, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.sleepingForOffload);
    }

    public com.google.android.exoplayer2.PlaybackInfo copyWithPlayWhenReady(boolean z, int i) {
        return new com.google.android.exoplayer2.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, z, i, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.sleepingForOffload);
    }

    public com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
        return new com.google.android.exoplayer2.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playbackSuppressionReason, playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.sleepingForOffload);
    }

    public com.google.android.exoplayer2.PlaybackInfo copyWithSleepingForOffload(boolean z) {
        return new com.google.android.exoplayer2.PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, z);
    }
}
