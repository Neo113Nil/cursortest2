package com.google.android.exoplayer2.analytics;

/* loaded from: classes3.dex */
public final class MediaMetricsListener implements com.google.android.exoplayer2.analytics.AnalyticsListener, com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener {
    private java.lang.String activeSessionId;
    private int audioUnderruns;
    private final android.content.Context context;
    private com.google.android.exoplayer2.Format currentAudioFormat;
    private com.google.android.exoplayer2.Format currentTextFormat;
    private com.google.android.exoplayer2.Format currentVideoFormat;
    private int discontinuityReason;
    private int droppedFrames;
    private boolean hasFatalError;
    private int ioErrorType;
    private boolean isSeeking;
    private android.media.metrics.PlaybackMetrics.Builder metricsBuilder;
    private com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate pendingAudioFormat;
    private com.google.android.exoplayer2.PlaybackException pendingPlayerError;
    private com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate pendingTextFormat;
    private com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate pendingVideoFormat;
    private final android.media.metrics.PlaybackSession playbackSession;
    private int playedFrames;
    private boolean reportedEventsForCurrentSession;
    private final com.google.android.exoplayer2.analytics.PlaybackSessionManager sessionManager;
    private final com.google.android.exoplayer2.Timeline.Window window = new com.google.android.exoplayer2.Timeline.Window();
    private final com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
    private final java.util.HashMap<java.lang.String, java.lang.Long> bandwidthBytes = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, java.lang.Long> bandwidthTimeMs = new java.util.HashMap<>();
    private final long startTimeMs = android.os.SystemClock.elapsedRealtime();
    private int currentPlaybackState = 0;
    private int currentNetworkType = 0;

    private static int getTrackChangeReason(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioAttributesChanged(this, eventTime, audioAttributes);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioCodecError(this, eventTime, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDecoderInitialized(this, eventTime, str, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDecoderInitialized(this, eventTime, str, j, j2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDecoderReleased(this, eventTime, str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioDisabled(this, eventTime, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioEnabled(this, eventTime, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioInputFormatChanged(this, eventTime, format);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioInputFormatChanged(this, eventTime, format, decoderReuseEvaluation);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioPositionAdvancing(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioPositionAdvancing(this, eventTime, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioSessionIdChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioSessionIdChanged(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioSinkError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioSinkError(this, eventTime, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioUnderrun(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAudioUnderrun(this, eventTime, i, j, j2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAvailableCommandsChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Player.Commands commands) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onAvailableCommandsChanged(this, eventTime, commands);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.text.CueGroup cueGroup) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onCues(this, eventTime, cueGroup);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.util.List list) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onCues(this, eventTime, list);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderDisabled(this, eventTime, i, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderEnabled(this, eventTime, i, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, java.lang.String str, long j) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderInitialized(this, eventTime, i, str, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.Format format) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDecoderInputFormatChanged(this, eventTime, i, format);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.DeviceInfo deviceInfo) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDeviceInfoChanged(this, eventTime, deviceInfo);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDeviceVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, boolean z) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDeviceVolumeChanged(this, eventTime, i, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmKeysLoaded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmKeysLoaded(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmKeysRemoved(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmKeysRemoved(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmKeysRestored(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmKeysRestored(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionAcquired(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionAcquired(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionManagerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionManagerError(this, eventTime, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDrmSessionReleased(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDroppedVideoFrames(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, long j) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onDroppedVideoFrames(this, eventTime, i, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onIsLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onIsLoadingChanged(this, eventTime, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onIsPlayingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onIsPlayingChanged(this, eventTime, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onLoadCanceled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadCanceled(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onLoadCompleted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadCompleted(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onLoadStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadStarted(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onLoadingChanged(this, eventTime, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMaxSeekToPreviousPositionChanged(this, eventTime, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.MediaItem mediaItem, int i) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMediaItemTransition(this, eventTime, mediaItem, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMediaMetadataChanged(this, eventTime, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onMetadata(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.metadata.Metadata metadata) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onMetadata(this, eventTime, metadata);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlayWhenReadyChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z, int i) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayWhenReadyChanged(this, eventTime, z, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaybackParametersChanged(this, eventTime, playbackParameters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlaybackStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaybackStateChanged(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaybackSuppressionReasonChanged(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerErrorChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.PlaybackException playbackException) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerErrorChanged(this, eventTime, playbackException);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerReleased(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z, int i) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlayerStateChanged(this, eventTime, z, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPlaylistMetadataChanged(this, eventTime, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onPositionDiscontinuity(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onRenderedFirstFrame(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Object obj, long j) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onRenderedFirstFrame(this, eventTime, obj, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onRepeatModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onRepeatModeChanged(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekBackIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekBackIncrementChanged(this, eventTime, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekForwardIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekForwardIncrementChanged(this, eventTime, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekProcessed(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekProcessed(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSeekStarted(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onShuffleModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onShuffleModeChanged(this, eventTime, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSkipSilenceEnabledChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSkipSilenceEnabledChanged(this, eventTime, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSurfaceSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, int i2) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onSurfaceSizeChanged(this, eventTime, i, i2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onTimelineChanged(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onTrackSelectionParametersChanged(this, eventTime, trackSelectionParameters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Tracks tracks) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onTracksChanged(this, eventTime, tracks);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onUpstreamDiscarded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onUpstreamDiscarded(this, eventTime, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoCodecError(this, eventTime, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoDecoderInitialized(this, eventTime, str, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoDecoderInitialized(this, eventTime, str, j, j2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoDecoderReleased(this, eventTime, str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoEnabled(this, eventTime, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoFrameProcessingOffset(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j, int i) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoFrameProcessingOffset(this, eventTime, j, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoInputFormatChanged(this, eventTime, format);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoInputFormatChanged(this, eventTime, format, decoderReuseEvaluation);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVideoSizeChanged(this, eventTime, i, i2, i3, f);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, float f) {
        com.google.android.exoplayer2.analytics.AnalyticsListener.CC.$default$onVolumeChanged(this, eventTime, f);
    }

    public static com.google.android.exoplayer2.analytics.MediaMetricsListener create(android.content.Context context) {
        android.media.metrics.MediaMetricsManager mediaMetricsManager = (android.media.metrics.MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new com.google.android.exoplayer2.analytics.MediaMetricsListener(context, mediaMetricsManager.createPlaybackSession());
    }

    private MediaMetricsListener(android.content.Context context, android.media.metrics.PlaybackSession playbackSession) {
        this.context = context.getApplicationContext();
        this.playbackSession = playbackSession;
        com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager defaultPlaybackSessionManager = new com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        defaultPlaybackSessionManager.setListener(this);
    }

    public android.media.metrics.LogSessionId getLogSessionId() {
        return this.playbackSession.getSessionId();
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        if (eventTime.mediaPeriodId == null || !eventTime.mediaPeriodId.isAd()) {
            finishCurrentSession();
            this.activeSessionId = str;
            this.metricsBuilder = new android.media.metrics.PlaybackMetrics.Builder().setPlayerName(com.google.android.exoplayer2.ExoPlayerLibraryInfo.TAG).setPlayerVersion(com.google.android.exoplayer2.ExoPlayerLibraryInfo.VERSION);
            maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, boolean z) {
        if ((eventTime.mediaPeriodId == null || !eventTime.mediaPeriodId.isAd()) && str.equals(this.activeSessionId)) {
            finishCurrentSession();
        }
        this.bandwidthTimeMs.remove(str);
        this.bandwidthBytes.remove(str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Player.PositionInfo positionInfo, com.google.android.exoplayer2.Player.PositionInfo positionInfo2, int i) {
        if (i == 1) {
            this.isSeeking = true;
        }
        this.discontinuityReason = i;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        this.droppedFrames += decoderCounters.droppedBufferCount;
        this.playedFrames += decoderCounters.renderedOutputBufferCount;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        if (eventTime.mediaPeriodId != null) {
            java.lang.String sessionForMediaPeriodId = this.sessionManager.getSessionForMediaPeriodId(eventTime.timeline, (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) com.google.android.exoplayer2.util.Assertions.checkNotNull(eventTime.mediaPeriodId));
            java.lang.Long l = this.bandwidthBytes.get(sessionForMediaPeriodId);
            java.lang.Long l2 = this.bandwidthTimeMs.get(sessionForMediaPeriodId);
            this.bandwidthBytes.put(sessionForMediaPeriodId, java.lang.Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.bandwidthTimeMs.put(sessionForMediaPeriodId, java.lang.Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        if (eventTime.mediaPeriodId == null) {
            return;
        }
        com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate pendingFormatUpdate = new com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate((com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaLoadData.trackFormat), mediaLoadData.trackSelectionReason, this.sessionManager.getSessionForMediaPeriodId(eventTime.timeline, (com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) com.google.android.exoplayer2.util.Assertions.checkNotNull(eventTime.mediaPeriodId)));
        int i = mediaLoadData.trackType;
        if (i != 0) {
            if (i == 1) {
                this.pendingAudioFormat = pendingFormatUpdate;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.pendingTextFormat = pendingFormatUpdate;
                return;
            }
        }
        this.pendingVideoFormat = pendingFormatUpdate;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.video.VideoSize videoSize) {
        com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate pendingFormatUpdate = this.pendingVideoFormat;
        if (pendingFormatUpdate == null || pendingFormatUpdate.format.height != -1) {
            return;
        }
        this.pendingVideoFormat = new com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate(pendingFormatUpdate.format.buildUpon().setWidth(videoSize.width).setHeight(videoSize.height).build(), pendingFormatUpdate.selectionReason, pendingFormatUpdate.sessionId);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
        this.ioErrorType = mediaLoadData.dataType;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.PlaybackException playbackException) {
        this.pendingPlayerError = playbackException;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onEvents(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.analytics.AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        maybeUpdateMetricsBuilderValues(player, events);
        maybeReportPlaybackError(elapsedRealtime);
        maybeReportTrackChanges(player, events, elapsedRealtime);
        maybeReportNetworkChange(elapsedRealtime);
        maybeReportPlaybackStateChange(player, events, elapsedRealtime);
        if (events.contains(1028)) {
            this.sessionManager.finishAllSessions(events.getEventTime(1028));
        }
    }

    private void maybeAddSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.Events events) {
        for (int i = 0; i < events.size(); i++) {
            int i2 = events.get(i);
            com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime = events.getEventTime(i2);
            if (i2 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else if (i2 == 11) {
                this.sessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
            } else {
                this.sessionManager.updateSessions(eventTime);
            }
        }
    }

    private void maybeUpdateMetricsBuilderValues(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.analytics.AnalyticsListener.Events events) {
        com.google.android.exoplayer2.drm.DrmInitData drmInitData;
        if (events.contains(0)) {
            com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime = events.getEventTime(0);
            if (this.metricsBuilder != null) {
                maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
            }
        }
        if (events.contains(2) && this.metricsBuilder != null && (drmInitData = getDrmInitData(player.getCurrentTracks().getGroups())) != null) {
            ((android.media.metrics.PlaybackMetrics.Builder) com.google.android.exoplayer2.util.Util.castNonNull(this.metricsBuilder)).setDrmType(getDrmType(drmInitData));
        }
        if (events.contains(1011)) {
            this.audioUnderruns++;
        }
    }

    private void maybeReportPlaybackError(long j) {
        com.google.android.exoplayer2.PlaybackException playbackException = this.pendingPlayerError;
        if (playbackException == null) {
            return;
        }
        com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo errorInfo = getErrorInfo(playbackException, this.context, this.ioErrorType == 4);
        this.playbackSession.reportPlaybackErrorEvent(new android.media.metrics.PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j - this.startTimeMs).setErrorCode(errorInfo.errorCode).setSubErrorCode(errorInfo.subErrorCode).setException(playbackException).build());
        this.reportedEventsForCurrentSession = true;
        this.pendingPlayerError = null;
    }

    private void maybeReportTrackChanges(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.analytics.AnalyticsListener.Events events, long j) {
        if (events.contains(2)) {
            com.google.android.exoplayer2.Tracks currentTracks = player.getCurrentTracks();
            boolean isTypeSelected = currentTracks.isTypeSelected(2);
            boolean isTypeSelected2 = currentTracks.isTypeSelected(1);
            boolean isTypeSelected3 = currentTracks.isTypeSelected(3);
            if (isTypeSelected || isTypeSelected2 || isTypeSelected3) {
                if (!isTypeSelected) {
                    maybeUpdateVideoFormat(j, null, 0);
                }
                if (!isTypeSelected2) {
                    maybeUpdateAudioFormat(j, null, 0);
                }
                if (!isTypeSelected3) {
                    maybeUpdateTextFormat(j, null, 0);
                }
            }
        }
        if (canReportPendingFormatUpdate(this.pendingVideoFormat) && this.pendingVideoFormat.format.height != -1) {
            maybeUpdateVideoFormat(j, this.pendingVideoFormat.format, this.pendingVideoFormat.selectionReason);
            this.pendingVideoFormat = null;
        }
        if (canReportPendingFormatUpdate(this.pendingAudioFormat)) {
            maybeUpdateAudioFormat(j, this.pendingAudioFormat.format, this.pendingAudioFormat.selectionReason);
            this.pendingAudioFormat = null;
        }
        if (canReportPendingFormatUpdate(this.pendingTextFormat)) {
            maybeUpdateTextFormat(j, this.pendingTextFormat.format, this.pendingTextFormat.selectionReason);
            this.pendingTextFormat = null;
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = true)
    private boolean canReportPendingFormatUpdate(com.google.android.exoplayer2.analytics.MediaMetricsListener.PendingFormatUpdate pendingFormatUpdate) {
        return pendingFormatUpdate != null && pendingFormatUpdate.sessionId.equals(this.sessionManager.getActiveSessionId());
    }

    private void maybeReportNetworkChange(long j) {
        int networkType = getNetworkType(this.context);
        if (networkType != this.currentNetworkType) {
            this.currentNetworkType = networkType;
            this.playbackSession.reportNetworkEvent(new android.media.metrics.NetworkEvent.Builder().setNetworkType(networkType).setTimeSinceCreatedMillis(j - this.startTimeMs).build());
        }
    }

    private void maybeReportPlaybackStateChange(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.analytics.AnalyticsListener.Events events, long j) {
        if (player.getPlaybackState() != 2) {
            this.isSeeking = false;
        }
        if (player.getPlayerError() == null) {
            this.hasFatalError = false;
        } else if (events.contains(10)) {
            this.hasFatalError = true;
        }
        int resolveNewPlaybackState = resolveNewPlaybackState(player);
        if (this.currentPlaybackState != resolveNewPlaybackState) {
            this.currentPlaybackState = resolveNewPlaybackState;
            this.reportedEventsForCurrentSession = true;
            this.playbackSession.reportPlaybackStateEvent(new android.media.metrics.PlaybackStateEvent.Builder().setState(this.currentPlaybackState).setTimeSinceCreatedMillis(j - this.startTimeMs).build());
        }
    }

    private int resolveNewPlaybackState(com.google.android.exoplayer2.Player player) {
        int playbackState = player.getPlaybackState();
        if (this.isSeeking) {
            return 5;
        }
        if (this.hasFatalError) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i = this.currentPlaybackState;
            if (i == 0 || i == 2) {
                return 2;
            }
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.currentPlaybackState == 0) {
            return this.currentPlaybackState;
        }
        return 12;
    }

    private void maybeUpdateVideoFormat(long j, com.google.android.exoplayer2.Format format, int i) {
        if (com.google.android.exoplayer2.util.Util.areEqual(this.currentVideoFormat, format)) {
            return;
        }
        int i2 = (this.currentVideoFormat == null && i == 0) ? 1 : i;
        this.currentVideoFormat = format;
        reportTrackChangeEvent(1, j, format, i2);
    }

    private void maybeUpdateAudioFormat(long j, com.google.android.exoplayer2.Format format, int i) {
        if (com.google.android.exoplayer2.util.Util.areEqual(this.currentAudioFormat, format)) {
            return;
        }
        int i2 = (this.currentAudioFormat == null && i == 0) ? 1 : i;
        this.currentAudioFormat = format;
        reportTrackChangeEvent(0, j, format, i2);
    }

    private void maybeUpdateTextFormat(long j, com.google.android.exoplayer2.Format format, int i) {
        if (com.google.android.exoplayer2.util.Util.areEqual(this.currentTextFormat, format)) {
            return;
        }
        int i2 = (this.currentTextFormat == null && i == 0) ? 1 : i;
        this.currentTextFormat = format;
        reportTrackChangeEvent(2, j, format, i2);
    }

    private void reportTrackChangeEvent(int i, long j, com.google.android.exoplayer2.Format format, int i2) {
        android.media.metrics.TrackChangeEvent.Builder timeSinceCreatedMillis = new android.media.metrics.TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.startTimeMs);
        if (format != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(getTrackChangeReason(i2));
            if (format.containerMimeType != null) {
                timeSinceCreatedMillis.setContainerMimeType(format.containerMimeType);
            }
            if (format.sampleMimeType != null) {
                timeSinceCreatedMillis.setSampleMimeType(format.sampleMimeType);
            }
            if (format.codecs != null) {
                timeSinceCreatedMillis.setCodecName(format.codecs);
            }
            if (format.bitrate != -1) {
                timeSinceCreatedMillis.setBitrate(format.bitrate);
            }
            if (format.width != -1) {
                timeSinceCreatedMillis.setWidth(format.width);
            }
            if (format.height != -1) {
                timeSinceCreatedMillis.setHeight(format.height);
            }
            if (format.channelCount != -1) {
                timeSinceCreatedMillis.setChannelCount(format.channelCount);
            }
            if (format.sampleRate != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(format.sampleRate);
            }
            if (format.language != null) {
                android.util.Pair<java.lang.String, java.lang.String> languageAndRegion = getLanguageAndRegion(format.language);
                timeSinceCreatedMillis.setLanguage((java.lang.String) languageAndRegion.first);
                if (languageAndRegion.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((java.lang.String) languageAndRegion.second);
                }
            }
            if (format.frameRate != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(format.frameRate);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.reportedEventsForCurrentSession = true;
        this.playbackSession.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"metricsBuilder"})
    private void maybeUpdateTimelineMetadata(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        int indexOfPeriod;
        android.media.metrics.PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (mediaPeriodId == null || (indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) == -1) {
            return;
        }
        timeline.getPeriod(indexOfPeriod, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        builder.setStreamType(getStreamType(this.window.mediaItem));
        if (this.window.durationUs != -9223372036854775807L && !this.window.isPlaceholder && !this.window.isDynamic && !this.window.isLive()) {
            builder.setMediaDurationMillis(this.window.getDurationMs());
        }
        builder.setPlaybackType(this.window.isLive() ? 2 : 1);
        this.reportedEventsForCurrentSession = true;
    }

    private void finishCurrentSession() {
        android.media.metrics.PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (builder != null && this.reportedEventsForCurrentSession) {
            builder.setAudioUnderrunCount(this.audioUnderruns);
            this.metricsBuilder.setVideoFramesDropped(this.droppedFrames);
            this.metricsBuilder.setVideoFramesPlayed(this.playedFrames);
            java.lang.Long l = this.bandwidthTimeMs.get(this.activeSessionId);
            this.metricsBuilder.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            java.lang.Long l2 = this.bandwidthBytes.get(this.activeSessionId);
            this.metricsBuilder.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.metricsBuilder.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.playbackSession.reportPlaybackMetrics(this.metricsBuilder.build());
        }
        this.metricsBuilder = null;
        this.activeSessionId = null;
        this.audioUnderruns = 0;
        this.droppedFrames = 0;
        this.playedFrames = 0;
        this.currentVideoFormat = null;
        this.currentAudioFormat = null;
        this.currentTextFormat = null;
        this.reportedEventsForCurrentSession = false;
    }

    private static android.util.Pair<java.lang.String, java.lang.String> getLanguageAndRegion(java.lang.String str) {
        java.lang.String[] split = com.google.android.exoplayer2.util.Util.split(str, "-");
        return android.util.Pair.create(split[0], split.length >= 2 ? split[1] : null);
    }

    private static int getNetworkType(android.content.Context context) {
        switch (com.google.android.exoplayer2.util.NetworkTypeObserver.getInstance(context).getNetworkType()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int getStreamType(com.google.android.exoplayer2.MediaItem mediaItem) {
        if (mediaItem.localConfiguration == null) {
            return 0;
        }
        int inferContentTypeForUriAndMimeType = com.google.android.exoplayer2.util.Util.inferContentTypeForUriAndMimeType(mediaItem.localConfiguration.uri, mediaItem.localConfiguration.mimeType);
        if (inferContentTypeForUriAndMimeType == 0) {
            return 3;
        }
        if (inferContentTypeForUriAndMimeType != 1) {
            return inferContentTypeForUriAndMimeType != 2 ? 1 : 4;
        }
        return 5;
    }

    private static com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo getErrorInfo(com.google.android.exoplayer2.PlaybackException playbackException, android.content.Context context, boolean z) {
        int i;
        boolean z2;
        if (playbackException.errorCode == 1001) {
            return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(20, 0);
        }
        if (playbackException instanceof com.google.android.exoplayer2.ExoPlaybackException) {
            com.google.android.exoplayer2.ExoPlaybackException exoPlaybackException = (com.google.android.exoplayer2.ExoPlaybackException) playbackException;
            z2 = exoPlaybackException.type == 1;
            i = exoPlaybackException.rendererFormatSupport;
        } else {
            i = 0;
            z2 = false;
        }
        java.lang.Throwable th = (java.lang.Throwable) com.google.android.exoplayer2.util.Assertions.checkNotNull(playbackException.getCause());
        if (!(th instanceof java.io.IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(35, 0);
            }
            if (z2 && i == 3) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(15, 0);
            }
            if (z2 && i == 2) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(23, 0);
            }
            if (th instanceof com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(13, com.google.android.exoplayer2.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(((com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException) th).diagnosticInfo));
            }
            if (th instanceof com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(14, com.google.android.exoplayer2.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(((com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException) th).diagnosticInfo));
            }
            if (th instanceof java.lang.OutOfMemoryError) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(14, 0);
            }
            if (th instanceof com.google.android.exoplayer2.audio.AudioSink.InitializationException) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(17, ((com.google.android.exoplayer2.audio.AudioSink.InitializationException) th).audioTrackState);
            }
            if (th instanceof com.google.android.exoplayer2.audio.AudioSink.WriteException) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(18, ((com.google.android.exoplayer2.audio.AudioSink.WriteException) th).errorCode);
            }
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 16 && (th instanceof android.media.MediaCodec.CryptoException)) {
                int errorCode = ((android.media.MediaCodec.CryptoException) th).getErrorCode();
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(getDrmErrorCode(errorCode), errorCode);
            }
            return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(22, 0);
        }
        if (th instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) {
            return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(5, ((com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) th).responseCode);
        }
        if ((th instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException) || (th instanceof com.google.android.exoplayer2.ParserException)) {
            return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(z ? 10 : 11, 0);
        }
        boolean z3 = th instanceof com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;
        if (z3 || (th instanceof com.google.android.exoplayer2.upstream.UdpDataSource.UdpDataSourceException)) {
            if (com.google.android.exoplayer2.util.NetworkTypeObserver.getInstance(context).getNetworkType() == 1) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(3, 0);
            }
            java.lang.Throwable cause = th.getCause();
            if (cause instanceof java.net.UnknownHostException) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(6, 0);
            }
            if (cause instanceof java.net.SocketTimeoutException) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(7, 0);
            }
            if (z3 && ((com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException) th).type == 1) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(4, 0);
            }
            return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(8, 0);
        }
        if (playbackException.errorCode == 1002) {
            return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(21, 0);
        }
        if (th instanceof com.google.android.exoplayer2.drm.DrmSession.DrmSessionException) {
            java.lang.Throwable th2 = (java.lang.Throwable) com.google.android.exoplayer2.util.Assertions.checkNotNull(th.getCause());
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21 && (th2 instanceof android.media.MediaDrm.MediaDrmStateException)) {
                int errorCodeFromPlatformDiagnosticsInfo = com.google.android.exoplayer2.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(((android.media.MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(getDrmErrorCode(errorCodeFromPlatformDiagnosticsInfo), errorCodeFromPlatformDiagnosticsInfo);
            }
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23 && (th2 instanceof android.media.MediaDrmResetException)) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(27, 0);
            }
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 18 && (th2 instanceof android.media.NotProvisionedException)) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(24, 0);
            }
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 18 && (th2 instanceof android.media.DeniedByServerException)) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(29, 0);
            }
            if (th2 instanceof com.google.android.exoplayer2.drm.UnsupportedDrmException) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(23, 0);
            }
            if (th2 instanceof com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(28, 0);
            }
            return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(30, 0);
        }
        if ((th instanceof com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException) && (th.getCause() instanceof java.io.FileNotFoundException)) {
            java.lang.Throwable cause2 = ((java.lang.Throwable) com.google.android.exoplayer2.util.Assertions.checkNotNull(th.getCause())).getCause();
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21 && (cause2 instanceof android.system.ErrnoException) && ((android.system.ErrnoException) cause2).errno == android.system.OsConstants.EACCES) {
                return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(32, 0);
            }
            return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(31, 0);
        }
        return new com.google.android.exoplayer2.analytics.MediaMetricsListener.ErrorInfo(9, 0);
    }

    private static com.google.android.exoplayer2.drm.DrmInitData getDrmInitData(com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks.Group> immutableList) {
        com.google.android.exoplayer2.drm.DrmInitData drmInitData;
        com.google.common.collect.UnmodifiableIterator<com.google.android.exoplayer2.Tracks.Group> it = immutableList.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.Tracks.Group next = it.next();
            for (int i = 0; i < next.length; i++) {
                if (next.isTrackSelected(i) && (drmInitData = next.getTrackFormat(i).drmInitData) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int getDrmType(com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            java.util.UUID uuid = drmInitData.get(i).uuid;
            if (uuid.equals(com.google.android.exoplayer2.C.WIDEVINE_UUID)) {
                return 3;
            }
            if (uuid.equals(com.google.android.exoplayer2.C.PLAYREADY_UUID)) {
                return 2;
            }
            if (uuid.equals(com.google.android.exoplayer2.C.CLEARKEY_UUID)) {
                return 6;
            }
        }
        return 1;
    }

    private static int getDrmErrorCode(int i) {
        switch (com.google.android.exoplayer2.util.Util.getErrorCodeForMediaDrmErrorCode(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static final class ErrorInfo {
        public final int errorCode;
        public final int subErrorCode;

        public ErrorInfo(int i, int i2) {
            this.errorCode = i;
            this.subErrorCode = i2;
        }
    }

    private static final class PendingFormatUpdate {
        public final com.google.android.exoplayer2.Format format;
        public final int selectionReason;
        public final java.lang.String sessionId;

        public PendingFormatUpdate(com.google.android.exoplayer2.Format format, int i, java.lang.String str) {
            this.format = format;
            this.selectionReason = i;
            this.sessionId = str;
        }
    }
}
