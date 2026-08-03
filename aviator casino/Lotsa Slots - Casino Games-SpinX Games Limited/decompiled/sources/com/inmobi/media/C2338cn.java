package com.inmobi.media;

/* renamed from: com.inmobi.media.cn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2338cn implements androidx.media3.common.Player.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.CancellableContinuationImpl f5148a;
    public final /* synthetic */ com.inmobi.media.L2 b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ com.inmobi.media.InterfaceC2772t9 d;
    public final /* synthetic */ androidx.media3.exoplayer.ExoPlayer e;

    public C2338cn(kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl, com.inmobi.media.L2 l2, java.lang.String str, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, androidx.media3.exoplayer.ExoPlayer exoPlayer) {
        this.f5148a = cancellableContinuationImpl;
        this.b = l2;
        this.c = str;
        this.d = interfaceC2772t9;
        this.e = exoPlayer;
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onAudioAttributesChanged(androidx.media3.common.AudioAttributes audioAttributes) {
        androidx.media3.common.Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onAudioSessionIdChanged(int i) {
        androidx.media3.common.Player.Listener.CC.$default$onAudioSessionIdChanged(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onAvailableCommandsChanged(androidx.media3.common.Player.Commands commands) {
        androidx.media3.common.Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onCues(androidx.media3.common.text.CueGroup cueGroup) {
        androidx.media3.common.Player.Listener.CC.$default$onCues(this, cueGroup);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onCues(java.util.List list) {
        androidx.media3.common.Player.Listener.CC.$default$onCues(this, list);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onDeviceInfoChanged(androidx.media3.common.DeviceInfo deviceInfo) {
        androidx.media3.common.Player.Listener.CC.$default$onDeviceInfoChanged(this, deviceInfo);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        androidx.media3.common.Player.Listener.CC.$default$onDeviceVolumeChanged(this, i, z);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
        androidx.media3.common.Player.Listener.CC.$default$onEvents(this, player, events);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onIsLoadingChanged(boolean z) {
        androidx.media3.common.Player.Listener.CC.$default$onIsLoadingChanged(this, z);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onIsPlayingChanged(boolean z) {
        androidx.media3.common.Player.Listener.CC.$default$onIsPlayingChanged(this, z);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onLoadingChanged(boolean z) {
        androidx.media3.common.Player.Listener.CC.$default$onLoadingChanged(this, z);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        androidx.media3.common.Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(this, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onMediaItemTransition(androidx.media3.common.MediaItem mediaItem, int i) {
        androidx.media3.common.Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onMediaMetadataChanged(androidx.media3.common.MediaMetadata mediaMetadata) {
        androidx.media3.common.Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onMetadata(androidx.media3.common.Metadata metadata) {
        androidx.media3.common.Player.Listener.CC.$default$onMetadata(this, metadata);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        androidx.media3.common.Player.Listener.CC.$default$onPlayWhenReadyChanged(this, z, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlaybackParametersChanged(androidx.media3.common.PlaybackParameters playbackParameters) {
        androidx.media3.common.Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        if (i == 3) {
            if (this.f5148a.isActive()) {
                int a2 = this.b.a(this.c);
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.d;
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).a("VideoLoaderHelper", "Media loaded successfully from URL with cache progress: " + a2);
                }
                com.inmobi.media.T4.a(this.f5148a, new com.inmobi.media.C2505j8(a2, this.e.getDuration(), this.c));
            }
            this.e.removeListener(this);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        androidx.media3.common.Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(androidx.media3.common.PlaybackException error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.d;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("VideoLoaderHelper", "Failed to load URL (" + this.c + "): " + error.getMessage());
        }
        if (this.f5148a.isActive()) {
            com.inmobi.media.T4.a(this.f5148a, new com.inmobi.media.C2428g8(com.inmobi.media.Rm.d));
        }
        this.e.removeListener(this);
        this.e.stop();
        this.e.clearMediaItems();
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlayerErrorChanged(androidx.media3.common.PlaybackException playbackException) {
        androidx.media3.common.Player.Listener.CC.$default$onPlayerErrorChanged(this, playbackException);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        androidx.media3.common.Player.Listener.CC.$default$onPlayerStateChanged(this, z, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlaylistMetadataChanged(androidx.media3.common.MediaMetadata mediaMetadata) {
        androidx.media3.common.Player.Listener.CC.$default$onPlaylistMetadataChanged(this, mediaMetadata);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(int i) {
        androidx.media3.common.Player.Listener.CC.$default$onPositionDiscontinuity(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
        androidx.media3.common.Player.Listener.CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onRenderedFirstFrame() {
        androidx.media3.common.Player.Listener.CC.$default$onRenderedFirstFrame(this);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onRepeatModeChanged(int i) {
        androidx.media3.common.Player.Listener.CC.$default$onRepeatModeChanged(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onSeekBackIncrementChanged(long j) {
        androidx.media3.common.Player.Listener.CC.$default$onSeekBackIncrementChanged(this, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        androidx.media3.common.Player.Listener.CC.$default$onSeekForwardIncrementChanged(this, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        androidx.media3.common.Player.Listener.CC.$default$onShuffleModeEnabledChanged(this, z);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        androidx.media3.common.Player.Listener.CC.$default$onSkipSilenceEnabledChanged(this, z);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        androidx.media3.common.Player.Listener.CC.$default$onSurfaceSizeChanged(this, i, i2);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onTimelineChanged(androidx.media3.common.Timeline timeline, int i) {
        androidx.media3.common.Player.Listener.CC.$default$onTimelineChanged(this, timeline, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onTrackSelectionParametersChanged(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        androidx.media3.common.Player.Listener.CC.$default$onTrackSelectionParametersChanged(this, trackSelectionParameters);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onTracksChanged(androidx.media3.common.Tracks tracks) {
        androidx.media3.common.Player.Listener.CC.$default$onTracksChanged(this, tracks);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
        androidx.media3.common.Player.Listener.CC.$default$onVideoSizeChanged(this, videoSize);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onVolumeChanged(float f) {
        androidx.media3.common.Player.Listener.CC.$default$onVolumeChanged(this, f);
    }
}
