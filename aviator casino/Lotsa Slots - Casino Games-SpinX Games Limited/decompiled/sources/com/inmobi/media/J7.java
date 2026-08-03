package com.inmobi.media;

/* loaded from: classes5.dex */
public final class J7 implements androidx.media3.common.Player.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.R7 f4777a;

    public J7(com.inmobi.media.R7 r7) {
        this.f4777a = r7;
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
    public final void onIsLoadingChanged(boolean z) {
        androidx.media3.common.Player.Listener.CC.$default$onIsLoadingChanged(this, z);
        if (z) {
            this.f4777a.o.setVisibility(0);
        } else {
            this.f4777a.o.setVisibility(8);
        }
        if (this.f4777a.p.getPlaybackState() == 3 && this.f4777a.p.getBufferedPercentage() == 100) {
            this.f4777a.a(com.inmobi.media.C2269a8.f5096a);
        }
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
        androidx.media3.common.Player.Listener.CC.$default$onPlaybackStateChanged(this, i);
        if (i == 4) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4777a.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HtmlMediaPlayer", "Playback ended");
            }
            com.inmobi.media.C2899y6 c2899y6 = this.f4777a.x;
            if (c2899y6.g != 2) {
                c2899y6.g = 2;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c2899y6.b, kotlinx.coroutines.Dispatchers.getMain().getImmediate(), null, new com.inmobi.media.C2796u6(c2899y6, c2899y6.f5564a.getDuration(), null), 2, null);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        androidx.media3.common.Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(androidx.media3.common.PlaybackException error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4777a.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("HtmlMediaPlayer", "Playback error: " + error.getErrorCodeName(), error);
        }
        this.f4777a.l.set(com.inmobi.media.Bg.g);
        com.inmobi.media.R7 r7 = this.f4777a;
        int i = error.errorCode;
        java.lang.String errorCodeName = error.getErrorCodeName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorCodeName, "getErrorCodeName(...)");
        r7.a(new com.inmobi.media.C2584m8(errorCodeName));
        this.f4777a.f();
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
    public final void onTracksChanged(androidx.media3.common.Tracks tracks) {
        androidx.media3.common.Tracks.Group group;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracks, "tracks");
        com.google.common.collect.ImmutableList<androidx.media3.common.Tracks.Group> groups = tracks.getGroups();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(groups, "getGroups(...)");
        java.util.Iterator<androidx.media3.common.Tracks.Group> it = groups.iterator();
        while (true) {
            if (it.hasNext()) {
                group = it.next();
                if (group.getType() == 2) {
                    break;
                }
            } else {
                group = null;
                break;
            }
        }
        androidx.media3.common.Tracks.Group group2 = group;
        if (group2 != null) {
            com.inmobi.media.R7 r7 = this.f4777a;
            int i = group2.getMediaTrackGroup().length;
            for (int i2 = 0; i2 < i; i2++) {
                androidx.media3.common.Format format = group2.getMediaTrackGroup().getFormat(i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "getFormat(...)");
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = r7.b;
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HtmlMediaPlayer", "Metadata loaded: " + format.width + "x" + format.height + ", " + format.sampleMimeType);
                }
                r7.a(com.inmobi.media.C2558l8.f5312a);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4777a.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HtmlMediaPlayer", "onVideoSizeChanged: width=" + videoSize.width + ", height=" + videoSize.height + ", ratio=" + videoSize.pixelWidthHeightRatio);
        }
        this.f4777a.i = (int) (videoSize.width * videoSize.pixelWidthHeightRatio);
        this.f4777a.j = videoSize.height;
        com.inmobi.media.R7 r7 = this.f4777a;
        com.inmobi.media.G1 g1 = r7.n;
        int i = r7.i;
        int i2 = this.f4777a.j;
        g1.getClass();
        if (i > 0 && i2 > 0) {
            g1.f4716a = i / i2;
            g1.requestLayout();
        }
        this.f4777a.z.d.a(videoSize.width, videoSize.height);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(float f) {
        androidx.media3.common.Player.Listener.CC.$default$onVolumeChanged(this, f);
        if (f == 0.0f || f == 1.0f) {
            return;
        }
        com.inmobi.media.R7 r7 = this.f4777a;
        boolean z = r7.y.e;
        r7.a(new com.inmobi.media.C2628no());
    }
}
