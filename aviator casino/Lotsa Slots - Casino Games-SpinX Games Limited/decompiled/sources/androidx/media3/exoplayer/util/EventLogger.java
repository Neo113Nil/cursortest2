package androidx.media3.exoplayer.util;

/* loaded from: classes2.dex */
public class EventLogger implements androidx.media3.exoplayer.analytics.AnalyticsListener {
    private static final java.lang.String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final java.text.NumberFormat TIME_FORMAT;
    private final androidx.media3.common.Timeline.Period period;
    private final long startTimeMs;
    private final java.lang.String tag;
    private final androidx.media3.common.Timeline.Window window;

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioCodecError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onAudioCodecError(this, eventTime, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDecoderInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onAudioDecoderInitialized(this, eventTime, str, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioPositionAdvancing(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onAudioPositionAdvancing(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioSinkError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onAudioSinkError(this, eventTime, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAvailableCommandsChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Player.Commands commands) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onAvailableCommandsChanged(this, eventTime, commands);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onBandwidthEstimate(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onCues(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.text.CueGroup cueGroup) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onCues(this, eventTime, cueGroup);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onCues(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.util.List list) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onCues(this, eventTime, list);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDeviceInfoChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.DeviceInfo deviceInfo) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onDeviceInfoChanged(this, eventTime, deviceInfo);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDeviceVolumeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, boolean z) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onDeviceVolumeChanged(this, eventTime, i, z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionAcquired(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onDrmSessionAcquired(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onEvents(androidx.media3.common.Player player, androidx.media3.exoplayer.analytics.AnalyticsListener.Events events) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onEvents(this, player, events);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadCanceled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadCompleted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadStarted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onLoadingChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onLoadingChanged(this, eventTime, z);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onMaxSeekToPreviousPositionChanged(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onMediaMetadataChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.MediaMetadata mediaMetadata) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onMediaMetadataChanged(this, eventTime, mediaMetadata);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerErrorChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.PlaybackException playbackException) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onPlayerErrorChanged(this, eventTime, playbackException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onPlayerReleased(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerStateChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z, int i) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onPlayerStateChanged(this, eventTime, z, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlaylistMetadataChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.MediaMetadata mediaMetadata) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onPlaylistMetadataChanged(this, eventTime, mediaMetadata);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPositionDiscontinuity(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onPositionDiscontinuity(this, eventTime, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onSeekBackIncrementChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onSeekBackIncrementChanged(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onSeekForwardIncrementChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onSeekForwardIncrementChanged(this, eventTime, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onSeekStarted(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onSeekStarted(this, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onTrackSelectionParametersChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onTrackSelectionParametersChanged(this, eventTime, trackSelectionParameters);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoCodecError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onVideoCodecError(this, eventTime, exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDecoderInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onVideoDecoderInitialized(this, eventTime, str, j);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoFrameProcessingOffset(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j, int i) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onVideoFrameProcessingOffset(this, eventTime, j, i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoSizeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.CC.$default$onVideoSizeChanged(this, eventTime, i, i2, i3, f);
    }

    static {
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance(java.util.Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger() {
        this(DEFAULT_TAG);
    }

    public EventLogger(java.lang.String str) {
        this.tag = str;
        this.window = new androidx.media3.common.Timeline.Window();
        this.period = new androidx.media3.common.Timeline.Period();
        this.startTimeMs = android.os.SystemClock.elapsedRealtime();
    }

    @java.lang.Deprecated
    public EventLogger(androidx.media3.exoplayer.trackselection.MappingTrackSelector mappingTrackSelector) {
        this(DEFAULT_TAG);
    }

    @java.lang.Deprecated
    public EventLogger(androidx.media3.exoplayer.trackselection.MappingTrackSelector mappingTrackSelector, java.lang.String str) {
        this(str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onIsLoadingChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "loading", java.lang.Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackStateChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "state", getStateString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayWhenReadyChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z, int i) {
        logd(eventTime, "playWhenReady", z + ", " + getPlayWhenReadyChangeReasonString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackSuppressionReasonChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onIsPlayingChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "isPlaying", java.lang.Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onRepeatModeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "repeatMode", getRepeatModeString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onShuffleModeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "shuffleModeEnabled", java.lang.Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("reason=");
        sb.append(getDiscontinuityReasonString(i));
        sb.append(", PositionInfo:old [mediaItem=");
        sb.append(positionInfo.mediaItemIndex);
        sb.append(", period=");
        sb.append(positionInfo.periodIndex);
        sb.append(", pos=");
        sb.append(positionInfo.positionMs);
        if (positionInfo.adGroupIndex != -1) {
            sb.append(", contentPos=");
            sb.append(positionInfo.contentPositionMs);
            sb.append(", adGroup=");
            sb.append(positionInfo.adGroupIndex);
            sb.append(", ad=");
            sb.append(positionInfo.adIndexInAdGroup);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        sb.append(positionInfo2.mediaItemIndex);
        sb.append(", period=");
        sb.append(positionInfo2.periodIndex);
        sb.append(", pos=");
        sb.append(positionInfo2.positionMs);
        if (positionInfo2.adGroupIndex != -1) {
            sb.append(", contentPos=");
            sb.append(positionInfo2.contentPositionMs);
            sb.append(", adGroup=");
            sb.append(positionInfo2.adGroupIndex);
            sb.append(", ad=");
            sb.append(positionInfo2.adIndexInAdGroup);
        }
        sb.append(com.ironsource.X3.j.e);
        logd(eventTime, "positionDiscontinuity", sb.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onTimelineChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        logd("timeline [" + getEventTimeString(eventTime) + ", periodCount=" + periodCount + ", windowCount=" + windowCount + ", reason=" + getTimelineChangeReasonString(i));
        for (int i2 = 0; i2 < java.lang.Math.min(periodCount, 3); i2++) {
            eventTime.timeline.getPeriod(i2, this.period);
            logd("  period [" + getTimeString(this.period.getDurationMs()) + com.ironsource.X3.j.e);
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i3 = 0; i3 < java.lang.Math.min(windowCount, 3); i3++) {
            eventTime.timeline.getWindow(i3, this.window);
            logd("  window [" + getTimeString(this.window.getDurationMs()) + ", seekable=" + this.window.isSeekable + ", dynamic=" + this.window.isDynamic + com.ironsource.X3.j.e);
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd(com.ironsource.X3.j.e);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onMediaItemTransition(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.MediaItem mediaItem, int i) {
        logd("mediaItem [" + getEventTimeString(eventTime) + ", reason=" + getMediaItemTransitionReasonString(i) + com.ironsource.X3.j.e);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayerError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.PlaybackException playbackException) {
        loge(eventTime, "playerFailed", playbackException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onTracksChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Tracks tracks) {
        androidx.media3.common.Metadata metadata;
        logd("tracks [" + getEventTimeString(eventTime));
        com.google.common.collect.ImmutableList<androidx.media3.common.Tracks.Group> groups = tracks.getGroups();
        for (int i = 0; i < groups.size(); i++) {
            androidx.media3.common.Tracks.Group group = groups.get(i);
            logd("  group [");
            for (int i2 = 0; i2 < group.length; i2++) {
                logd("    " + getTrackStatusString(group.isTrackSelected(i2)) + " Track:" + i2 + ", " + androidx.media3.common.Format.toLogString(group.getTrackFormat(i2)) + ", supported=" + androidx.media3.common.util.Util.getFormatSupportString(group.getTrackSupport(i2)));
            }
            logd("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < groups.size(); i3++) {
            androidx.media3.common.Tracks.Group group2 = groups.get(i3);
            for (int i4 = 0; !z && i4 < group2.length; i4++) {
                if (group2.isTrackSelected(i4) && (metadata = group2.getTrackFormat(i4).metadata) != null && metadata.length() > 0) {
                    logd("  Metadata [");
                    printMetadata(metadata, "    ");
                    logd("  ]");
                    z = true;
                }
            }
        }
        logd(com.ironsource.X3.j.e);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onMetadata(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Metadata metadata) {
        logd("metadata [" + getEventTimeString(eventTime));
        printMetadata(metadata, "  ");
        logd(com.ironsource.X3.j.e);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioEnabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        logd(eventTime, "audioEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioDecoderInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2) {
        logd(eventTime, "audioDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioInputFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "audioInputFormat", androidx.media3.common.Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioUnderrun(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        loge(eventTime, "audioTrackUnderrun", i + ", " + j + ", " + j2, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioDecoderReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        logd(eventTime, "audioDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioDisabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        logd(eventTime, "audioDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioSessionIdChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "audioSessionId", java.lang.Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioAttributesChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.AudioAttributes audioAttributes) {
        logd(eventTime, "audioAttributes", audioAttributes.contentType + "," + audioAttributes.flags + "," + audioAttributes.usage + "," + audioAttributes.allowedCapturePolicy);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onSkipSilenceEnabledChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "skipSilenceEnabled", java.lang.Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVolumeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, float f) {
        logd(eventTime, "volume", java.lang.Float.toString(f));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioTrackInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackInit", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onAudioTrackReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        logd(eventTime, "audioTrackReleased", getAudioTrackConfigString(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoEnabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        logd(eventTime, "videoEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDecoderInitialized(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j2) {
        logd(eventTime, "videoDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoInputFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "videoInputFormat", androidx.media3.common.Format.toLogString(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDroppedVideoFrames(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, long j) {
        logd(eventTime, "droppedFrames", java.lang.Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDecoderReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        logd(eventTime, "videoDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDisabled(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        logd(eventTime, "videoDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onRenderedFirstFrame(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Object obj, long j) {
        logd(eventTime, "renderedFirstFrame", java.lang.String.valueOf(obj));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.VideoSize videoSize) {
        logd(eventTime, "videoSize", videoSize.width + ", " + videoSize.height);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
        printInternalError(eventTime, "loadError", iOException);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onSurfaceSizeChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i, int i2) {
        logd(eventTime, "surfaceSize", i + ", " + i2);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onUpstreamDiscarded(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", androidx.media3.common.Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormat", androidx.media3.common.Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionAcquired(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "drmSessionAcquired", "state=" + i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionManagerError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmKeysRestored(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmKeysRemoved(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmKeysLoaded(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysLoaded");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionReleased(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionReleased");
    }

    protected void logd(java.lang.String str) {
        androidx.media3.common.util.Log.d(this.tag, str);
    }

    protected void loge(java.lang.String str) {
        androidx.media3.common.util.Log.e(this.tag, str);
    }

    private void logd(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        logd(getEventString(eventTime, str, null, null));
    }

    private void logd(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.String str2) {
        logd(getEventString(eventTime, str, str2, null));
    }

    private void loge(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.Throwable th) {
        loge(getEventString(eventTime, str, null, th));
    }

    private void loge(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        loge(getEventString(eventTime, str, str2, th));
    }

    private void printInternalError(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    private void printMetadata(androidx.media3.common.Metadata metadata, java.lang.String str) {
        for (int i = 0; i < metadata.length(); i++) {
            logd(str + metadata.get(i));
        }
    }

    private java.lang.String getEventString(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        java.lang.String str3 = str + " [" + getEventTimeString(eventTime);
        if (th instanceof androidx.media3.common.PlaybackException) {
            str3 = str3 + ", errorCode=" + ((androidx.media3.common.PlaybackException) th).getErrorCodeName();
        }
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        java.lang.String throwableString = androidx.media3.common.util.Log.getThrowableString(th);
        if (!android.text.TextUtils.isEmpty(throwableString)) {
            str3 = str3 + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
        }
        return str3 + com.ironsource.X3.j.e;
    }

    private java.lang.String getEventTimeString(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        java.lang.String str = "window=" + eventTime.windowIndex;
        if (eventTime.mediaPeriodId != null) {
            str = str + ", period=" + eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid);
            if (eventTime.mediaPeriodId.isAd()) {
                str = (str + ", adGroup=" + eventTime.mediaPeriodId.adGroupIndex) + ", ad=" + eventTime.mediaPeriodId.adIndexInAdGroup;
            }
        }
        return "eventTime=" + getTimeString(eventTime.realtimeMs - this.startTimeMs) + ", mediaPos=" + getTimeString(eventTime.eventPlaybackPositionMs) + ", " + str;
    }

    private static java.lang.String getTimeString(long j) {
        return j == -9223372036854775807L ? "?" : TIME_FORMAT.format(j / 1000.0f);
    }

    private static java.lang.String getStateString(int i) {
        if (i == 1) {
            return "IDLE";
        }
        if (i == 2) {
            return "BUFFERING";
        }
        if (i == 3) {
            return "READY";
        }
        if (i == 4) {
            return "ENDED";
        }
        return "?";
    }

    private static java.lang.String getTrackStatusString(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    private static java.lang.String getRepeatModeString(int i) {
        if (i == 0) {
            return "OFF";
        }
        if (i == 1) {
            return "ONE";
        }
        if (i == 2) {
            return "ALL";
        }
        return "?";
    }

    private static java.lang.String getDiscontinuityReasonString(int i) {
        switch (i) {
            case 0:
                return "AUTO_TRANSITION";
            case 1:
                return "SEEK";
            case 2:
                return "SEEK_ADJUSTMENT";
            case 3:
                return "SKIP";
            case 4:
                return "REMOVE";
            case 5:
                return "INTERNAL";
            case 6:
                return "SILENCE_SKIP";
            default:
                return "?";
        }
    }

    private static java.lang.String getTimelineChangeReasonString(int i) {
        if (i == 0) {
            return "PLAYLIST_CHANGED";
        }
        if (i == 1) {
            return "SOURCE_UPDATE";
        }
        return "?";
    }

    private static java.lang.String getMediaItemTransitionReasonString(int i) {
        if (i == 0) {
            return "REPEAT";
        }
        if (i == 1) {
            return "AUTO";
        }
        if (i == 2) {
            return "SEEK";
        }
        if (i == 3) {
            return "PLAYLIST_CHANGED";
        }
        return "?";
    }

    private static java.lang.String getPlaybackSuppressionReasonString(int i) {
        if (i == 0) {
            return "NONE";
        }
        if (i == 1) {
            return "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return "?";
    }

    private static java.lang.String getPlayWhenReadyChangeReasonString(int i) {
        if (i == 1) {
            return "USER_REQUEST";
        }
        if (i == 2) {
            return "AUDIO_FOCUS_LOSS";
        }
        if (i == 3) {
            return "AUDIO_BECOMING_NOISY";
        }
        if (i == 4) {
            return "REMOTE";
        }
        if (i == 5) {
            return "END_OF_MEDIA_ITEM";
        }
        return "?";
    }

    private static java.lang.String getAudioTrackConfigString(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        return audioTrackConfig.encoding + "," + audioTrackConfig.channelConfig + "," + audioTrackConfig.sampleRate + "," + audioTrackConfig.tunneling + "," + audioTrackConfig.offload + "," + audioTrackConfig.bufferSize;
    }
}
