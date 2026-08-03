package com.google.android.exoplayer2.analytics;

/* loaded from: classes3.dex */
public interface AnalyticsListener {
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 20;
    public static final int EVENT_AUDIO_CODEC_ERROR = 1029;
    public static final int EVENT_AUDIO_DECODER_INITIALIZED = 1008;
    public static final int EVENT_AUDIO_DECODER_RELEASED = 1012;
    public static final int EVENT_AUDIO_DISABLED = 1013;
    public static final int EVENT_AUDIO_ENABLED = 1007;
    public static final int EVENT_AUDIO_INPUT_FORMAT_CHANGED = 1009;
    public static final int EVENT_AUDIO_POSITION_ADVANCING = 1010;
    public static final int EVENT_AUDIO_SESSION_ID = 21;
    public static final int EVENT_AUDIO_SINK_ERROR = 1014;
    public static final int EVENT_AUDIO_UNDERRUN = 1011;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 13;
    public static final int EVENT_BANDWIDTH_ESTIMATE = 1006;
    public static final int EVENT_CUES = 27;
    public static final int EVENT_DEVICE_INFO_CHANGED = 29;
    public static final int EVENT_DEVICE_VOLUME_CHANGED = 30;
    public static final int EVENT_DOWNSTREAM_FORMAT_CHANGED = 1004;
    public static final int EVENT_DRM_KEYS_LOADED = 1023;
    public static final int EVENT_DRM_KEYS_REMOVED = 1026;
    public static final int EVENT_DRM_KEYS_RESTORED = 1025;
    public static final int EVENT_DRM_SESSION_ACQUIRED = 1022;
    public static final int EVENT_DRM_SESSION_MANAGER_ERROR = 1024;
    public static final int EVENT_DRM_SESSION_RELEASED = 1027;
    public static final int EVENT_DROPPED_VIDEO_FRAMES = 1018;
    public static final int EVENT_IS_LOADING_CHANGED = 3;
    public static final int EVENT_IS_PLAYING_CHANGED = 7;
    public static final int EVENT_LOAD_CANCELED = 1002;
    public static final int EVENT_LOAD_COMPLETED = 1001;
    public static final int EVENT_LOAD_ERROR = 1003;
    public static final int EVENT_LOAD_STARTED = 1000;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 18;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 14;
    public static final int EVENT_METADATA = 28;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 12;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 4;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 6;
    public static final int EVENT_PLAYER_ERROR = 10;
    public static final int EVENT_PLAYER_RELEASED = 1028;
    public static final int EVENT_PLAYLIST_METADATA_CHANGED = 15;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 5;
    public static final int EVENT_POSITION_DISCONTINUITY = 11;
    public static final int EVENT_RENDERED_FIRST_FRAME = 26;
    public static final int EVENT_REPEAT_MODE_CHANGED = 8;
    public static final int EVENT_SEEK_BACK_INCREMENT_CHANGED = 16;
    public static final int EVENT_SEEK_FORWARD_INCREMENT_CHANGED = 17;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 9;
    public static final int EVENT_SKIP_SILENCE_ENABLED_CHANGED = 23;
    public static final int EVENT_SURFACE_SIZE_CHANGED = 24;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int EVENT_TRACK_SELECTION_PARAMETERS_CHANGED = 19;
    public static final int EVENT_UPSTREAM_DISCARDED = 1005;
    public static final int EVENT_VIDEO_CODEC_ERROR = 1030;
    public static final int EVENT_VIDEO_DECODER_INITIALIZED = 1016;
    public static final int EVENT_VIDEO_DECODER_RELEASED = 1019;
    public static final int EVENT_VIDEO_DISABLED = 1020;
    public static final int EVENT_VIDEO_ENABLED = 1015;
    public static final int EVENT_VIDEO_FRAME_PROCESSING_OFFSET = 1021;
    public static final int EVENT_VIDEO_INPUT_FORMAT_CHANGED = 1017;
    public static final int EVENT_VIDEO_SIZE_CHANGED = 25;
    public static final int EVENT_VOLUME_CHANGED = 22;

    /* renamed from: com.google.android.exoplayer2.analytics.AnalyticsListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onAudioAttributesChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
        }

        public static void $default$onAudioCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        }

        @java.lang.Deprecated
        public static void $default$onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j) {
        }

        public static void $default$onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2) {
        }

        public static void $default$onAudioDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        }

        public static void $default$onAudioDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        }

        public static void $default$onAudioEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        }

        @java.lang.Deprecated
        public static void $default$onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format) {
        }

        public static void $default$onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        public static void $default$onAudioPositionAdvancing(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j) {
        }

        public static void $default$onAudioSessionIdChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        }

        public static void $default$onAudioSinkError(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        }

        public static void $default$onAudioUnderrun(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        }

        public static void $default$onAvailableCommandsChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Player.Commands commands) {
        }

        public static void $default$onBandwidthEstimate(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        }

        public static void $default$onCues(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.text.CueGroup cueGroup) {
        }

        @java.lang.Deprecated
        public static void $default$onCues(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.util.List list) {
        }

        @java.lang.Deprecated
        public static void $default$onDecoderDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        }

        @java.lang.Deprecated
        public static void $default$onDecoderEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        }

        @java.lang.Deprecated
        public static void $default$onDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, java.lang.String str, long j) {
        }

        @java.lang.Deprecated
        public static void $default$onDecoderInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.Format format) {
        }

        public static void $default$onDeviceInfoChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.DeviceInfo deviceInfo) {
        }

        public static void $default$onDeviceVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, boolean z) {
        }

        public static void $default$onDownstreamFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onDrmKeysLoaded(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        }

        public static void $default$onDrmKeysRemoved(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        }

        public static void $default$onDrmKeysRestored(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        }

        @java.lang.Deprecated
        public static void $default$onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        }

        public static void $default$onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        }

        public static void $default$onDrmSessionManagerError(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        }

        public static void $default$onDrmSessionReleased(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        }

        public static void $default$onDroppedVideoFrames(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, long j) {
        }

        public static void $default$onEvents(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.analytics.AnalyticsListener.Events events) {
        }

        public static void $default$onIsLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        }

        public static void $default$onIsPlayingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        }

        public static void $default$onLoadCanceled(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onLoadCompleted(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onLoadError(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
        }

        public static void $default$onLoadStarted(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        }

        @java.lang.Deprecated
        public static void $default$onLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        }

        public static void $default$onMaxSeekToPreviousPositionChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j) {
        }

        public static void $default$onMediaItemTransition(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.MediaItem mediaItem, int i) {
        }

        public static void $default$onMediaMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
        }

        public static void $default$onMetadata(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.metadata.Metadata metadata) {
        }

        public static void $default$onPlayWhenReadyChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z, int i) {
        }

        public static void $default$onPlaybackParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
        }

        public static void $default$onPlaybackStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        }

        public static void $default$onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        }

        public static void $default$onPlayerError(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.PlaybackException playbackException) {
        }

        public static void $default$onPlayerErrorChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.PlaybackException playbackException) {
        }

        public static void $default$onPlayerReleased(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        }

        @java.lang.Deprecated
        public static void $default$onPlayerStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z, int i) {
        }

        public static void $default$onPlaylistMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
        }

        @java.lang.Deprecated
        public static void $default$onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        }

        public static void $default$onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Player.PositionInfo positionInfo, com.google.android.exoplayer2.Player.PositionInfo positionInfo2, int i) {
        }

        public static void $default$onRenderedFirstFrame(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Object obj, long j) {
        }

        public static void $default$onRepeatModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        }

        public static void $default$onSeekBackIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j) {
        }

        public static void $default$onSeekForwardIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j) {
        }

        @java.lang.Deprecated
        public static void $default$onSeekProcessed(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        }

        @java.lang.Deprecated
        public static void $default$onSeekStarted(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime) {
        }

        public static void $default$onShuffleModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        }

        public static void $default$onSkipSilenceEnabledChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        }

        public static void $default$onSurfaceSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, int i2) {
        }

        public static void $default$onTimelineChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i) {
        }

        public static void $default$onTrackSelectionParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        }

        public static void $default$onTracksChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Tracks tracks) {
        }

        public static void $default$onUpstreamDiscarded(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        }

        public static void $default$onVideoCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        }

        @java.lang.Deprecated
        public static void $default$onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j) {
        }

        public static void $default$onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2) {
        }

        public static void $default$onVideoDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        }

        public static void $default$onVideoDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        }

        public static void $default$onVideoEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
        }

        public static void $default$onVideoFrameProcessingOffset(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j, int i) {
        }

        @java.lang.Deprecated
        public static void $default$onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format) {
        }

        public static void $default$onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        @java.lang.Deprecated
        public static void $default$onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
        }

        public static void $default$onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.video.VideoSize videoSize) {
        }

        public static void $default$onVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener _this, com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, float f) {
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EventFlags {
    }

    void onAudioAttributesChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes);

    void onAudioCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc);

    @java.lang.Deprecated
    void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j);

    void onAudioDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2);

    void onAudioDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str);

    void onAudioDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onAudioEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    @java.lang.Deprecated
    void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format);

    void onAudioInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j);

    void onAudioSessionIdChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i);

    void onAudioSinkError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc);

    void onAudioUnderrun(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2);

    void onAvailableCommandsChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Player.Commands commands);

    void onBandwidthEstimate(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2);

    void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.text.CueGroup cueGroup);

    @java.lang.Deprecated
    void onCues(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.util.List<com.google.android.exoplayer2.text.Cue> list);

    @java.lang.Deprecated
    void onDecoderDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    @java.lang.Deprecated
    void onDecoderEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    @java.lang.Deprecated
    void onDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, java.lang.String str, long j);

    @java.lang.Deprecated
    void onDecoderInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, com.google.android.exoplayer2.Format format);

    void onDeviceInfoChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.DeviceInfo deviceInfo);

    void onDeviceVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, boolean z);

    void onDownstreamFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData);

    void onDrmKeysLoaded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime);

    void onDrmKeysRemoved(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime);

    void onDrmKeysRestored(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime);

    @java.lang.Deprecated
    void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime);

    void onDrmSessionAcquired(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i);

    void onDrmSessionManagerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc);

    void onDrmSessionReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime);

    void onDroppedVideoFrames(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, long j);

    void onEvents(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.analytics.AnalyticsListener.Events events);

    void onIsLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z);

    void onIsPlayingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z);

    void onLoadCanceled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData);

    void onLoadCompleted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData);

    void onLoadError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z);

    void onLoadStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData);

    @java.lang.Deprecated
    void onLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z);

    void onMaxSeekToPreviousPositionChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j);

    void onMediaItemTransition(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.MediaItem mediaItem, int i);

    void onMediaMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.MediaMetadata mediaMetadata);

    void onMetadata(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.metadata.Metadata metadata);

    void onPlayWhenReadyChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z, int i);

    void onPlaybackParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.PlaybackParameters playbackParameters);

    void onPlaybackStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i);

    void onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i);

    void onPlayerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.PlaybackException playbackException);

    void onPlayerErrorChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.PlaybackException playbackException);

    void onPlayerReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime);

    @java.lang.Deprecated
    void onPlayerStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z, int i);

    void onPlaylistMetadataChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.MediaMetadata mediaMetadata);

    @java.lang.Deprecated
    void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i);

    void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Player.PositionInfo positionInfo, com.google.android.exoplayer2.Player.PositionInfo positionInfo2, int i);

    void onRenderedFirstFrame(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Object obj, long j);

    void onRepeatModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i);

    void onSeekBackIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j);

    void onSeekForwardIncrementChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j);

    @java.lang.Deprecated
    void onSeekProcessed(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime);

    @java.lang.Deprecated
    void onSeekStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime);

    void onShuffleModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z);

    void onSkipSilenceEnabledChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, boolean z);

    void onSurfaceSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, int i2);

    void onTimelineChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i);

    void onTrackSelectionParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters);

    void onTracksChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Tracks tracks);

    void onUpstreamDiscarded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData);

    void onVideoCodecError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc);

    @java.lang.Deprecated
    void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j);

    void onVideoDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2);

    void onVideoDecoderReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str);

    void onVideoDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onVideoEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, long j, int i);

    @java.lang.Deprecated
    void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format);

    void onVideoInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation);

    @java.lang.Deprecated
    void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f);

    void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, com.google.android.exoplayer2.video.VideoSize videoSize);

    void onVolumeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime, float f);

    public static final class Events {
        private final android.util.SparseArray<com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime> eventTimes;
        private final com.google.android.exoplayer2.util.FlagSet flags;

        public Events(com.google.android.exoplayer2.util.FlagSet flagSet, android.util.SparseArray<com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime> sparseArray) {
            this.flags = flagSet;
            android.util.SparseArray<com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime> sparseArray2 = new android.util.SparseArray<>(flagSet.size());
            for (int i = 0; i < flagSet.size(); i++) {
                int i2 = flagSet.get(i);
                sparseArray2.append(i2, (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) com.google.android.exoplayer2.util.Assertions.checkNotNull(sparseArray.get(i2)));
            }
            this.eventTimes = sparseArray2;
        }

        public com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime getEventTime(int i) {
            return (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.eventTimes.get(i));
        }

        public boolean contains(int i) {
            return this.flags.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.flags.containsAny(iArr);
        }

        public int size() {
            return this.flags.size();
        }

        public int get(int i) {
            return this.flags.get(i);
        }
    }

    public static final class EventTime {
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId currentMediaPeriodId;
        public final long currentPlaybackPositionMs;
        public final com.google.android.exoplayer2.Timeline currentTimeline;
        public final int currentWindowIndex;
        public final long eventPlaybackPositionMs;
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final com.google.android.exoplayer2.Timeline timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public EventTime(long j, com.google.android.exoplayer2.Timeline timeline, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j2, com.google.android.exoplayer2.Timeline timeline2, int i2, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId2, long j3, long j4) {
            this.realtimeMs = j;
            this.timeline = timeline;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
            this.eventPlaybackPositionMs = j2;
            this.currentTimeline = timeline2;
            this.currentWindowIndex = i2;
            this.currentMediaPeriodId = mediaPeriodId2;
            this.currentPlaybackPositionMs = j3;
            this.totalBufferedDurationMs = j4;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) obj;
            return this.realtimeMs == eventTime.realtimeMs && this.windowIndex == eventTime.windowIndex && this.eventPlaybackPositionMs == eventTime.eventPlaybackPositionMs && this.currentWindowIndex == eventTime.currentWindowIndex && this.currentPlaybackPositionMs == eventTime.currentPlaybackPositionMs && this.totalBufferedDurationMs == eventTime.totalBufferedDurationMs && com.google.common.base.Objects.equal(this.timeline, eventTime.timeline) && com.google.common.base.Objects.equal(this.mediaPeriodId, eventTime.mediaPeriodId) && com.google.common.base.Objects.equal(this.currentTimeline, eventTime.currentTimeline) && com.google.common.base.Objects.equal(this.currentMediaPeriodId, eventTime.currentMediaPeriodId);
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(java.lang.Long.valueOf(this.realtimeMs), this.timeline, java.lang.Integer.valueOf(this.windowIndex), this.mediaPeriodId, java.lang.Long.valueOf(this.eventPlaybackPositionMs), this.currentTimeline, java.lang.Integer.valueOf(this.currentWindowIndex), this.currentMediaPeriodId, java.lang.Long.valueOf(this.currentPlaybackPositionMs), java.lang.Long.valueOf(this.totalBufferedDurationMs));
        }
    }
}
