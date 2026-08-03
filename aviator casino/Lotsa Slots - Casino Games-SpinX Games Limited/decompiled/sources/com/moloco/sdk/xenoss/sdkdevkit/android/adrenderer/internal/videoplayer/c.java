package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e {
    public static final int x = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7944a;
    public final boolean b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i c;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder d;
    public final java.lang.String e;
    public final kotlinx.coroutines.CoroutineScope f;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> g;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> h;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> i;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> j;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> k;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> l;
    public final com.google.android.exoplayer2.ui.StyledPlayerView m;
    public java.lang.String n;
    public boolean o;
    public final android.os.Looper p;
    public com.google.android.exoplayer2.ExoPlayer q;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b r;
    public boolean s;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.d t;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d u;
    public long v;
    public kotlinx.coroutines.Job w;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.SimplifiedExoPlayer$1", f = "SimplifiedExoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7945a;
        public /* synthetic */ java.lang.Object b;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.a) create(aVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7945a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.b).e()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.I();
            } else {
                kotlinx.coroutines.Job job = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.w;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class b implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.exoplayer2.ExoPlayer f7946a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.C0317c b;

        public b(com.google.android.exoplayer2.ExoPlayer exoPlayer, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.C0317c c0317c) {
            this.f7946a = exoPlayer;
            this.b = c0317c;
        }

        public final void a(java.lang.Throwable th) {
            this.f7946a.removeListener(this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            a(th);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c$c, reason: collision with other inner class name */
    public static final class C0317c implements com.google.android.exoplayer2.Player.Listener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7947a;
        public final /* synthetic */ com.google.android.exoplayer2.ExoPlayer b;
        public final /* synthetic */ kotlinx.coroutines.CancellableContinuation<kotlin.Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0317c(int i, com.google.android.exoplayer2.ExoPlayer exoPlayer, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation) {
            this.f7947a = i;
            this.b = exoPlayer;
            this.c = cancellableContinuation;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioSessionIdChanged(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioSessionIdChanged(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Commands commands) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(com.google.android.exoplayer2.text.CueGroup cueGroup) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(this, cueGroup);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(java.util.List list) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.DeviceInfo deviceInfo) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceInfoChanged(this, deviceInfo);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceVolumeChanged(this, i, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onEvents(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.Player.Events events) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onEvents(this, player, events);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onIsLoadingChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onIsPlayingChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onLoadingChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onLoadingChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.MediaItem mediaItem, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMetadata(this, metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayWhenReadyChanged(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i) {
            if (i == this.f7947a) {
                this.b.removeListener(this);
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = this.c;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerError(com.google.android.exoplayer2.PlaybackException playbackException) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerError(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(com.google.android.exoplayer2.PlaybackException playbackException) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerErrorChanged(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerStateChanged(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaylistMetadataChanged(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPositionDiscontinuity(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo positionInfo, com.google.android.exoplayer2.Player.PositionInfo positionInfo2, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRenderedFirstFrame() {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onRenderedFirstFrame(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onRepeatModeChanged(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekBackIncrementChanged(long j) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekBackIncrementChanged(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekForwardIncrementChanged(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekProcessed() {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekProcessed(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onShuffleModeEnabledChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSkipSilenceEnabledChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSurfaceSizeChanged(this, i, i2);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.Timeline timeline, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onTimelineChanged(this, timeline, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onTrackSelectionParametersChanged(this, trackSelectionParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.Tracks tracks) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onTracksChanged(this, tracks);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize videoSize) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onVideoSizeChanged(this, videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onVolumeChanged(this, f);
        }
    }

    public static final class d implements com.google.android.exoplayer2.Player.Listener {
        public d() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioSessionIdChanged(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioSessionIdChanged(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Commands commands) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(com.google.android.exoplayer2.text.CueGroup cueGroup) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(this, cueGroup);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(java.util.List list) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.DeviceInfo deviceInfo) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceInfoChanged(this, deviceInfo);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceVolumeChanged(this, i, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onEvents(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.Player.Events events) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onEvents(this, player, events);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onIsLoadingChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsPlayingChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onIsPlayingChanged(this, z);
            com.google.android.exoplayer2.ExoPlayer l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.l();
            long duration = l != null ? l.getDuration() : 0L;
            com.google.android.exoplayer2.ExoPlayer l2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.l();
            boolean z2 = duration - (l2 != null ? l2.getCurrentPosition() : 0L) > 0;
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.e, "onIsPlayingChanged hasMore= " + z2, null, false, 12, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(z, true, z2));
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onLoadingChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onLoadingChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.MediaItem mediaItem, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onMetadata(this, metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayWhenReadyChanged(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackStateChanged(this, i);
            java.lang.String valueOf = i != 1 ? i != 2 ? i != 3 ? i != 4 ? java.lang.String.valueOf(i) : "ENDED" : "READY" : "BUFFERING" : "IDLE";
            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
            java.lang.String str = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.e;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("onPlaybackStateChanged: ");
            sb.append(valueOf);
            sb.append(" pos=");
            com.google.android.exoplayer2.ExoPlayer l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.l();
            sb.append(l != null ? java.lang.Long.valueOf(l.getCurrentPosition()) : null);
            sb.append(" dur=");
            com.google.android.exoplayer2.ExoPlayer l2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.l();
            sb.append(l2 != null ? java.lang.Long.valueOf(l2.getDuration()) : null);
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, sb.toString(), null, false, 12, null);
            if (i == 4) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this;
                com.google.android.exoplayer2.ExoPlayer l3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.l();
                cVar.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.a(l3 != null ? l3.getDuration() : 1L));
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.A();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(com.google.android.exoplayer2.PlaybackException error) {
            java.lang.String str;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerError(this, error);
            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
            com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.e, "Exoplayer error (streaming enabled = " + com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.b + ')', error, false, 8, null);
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.d;
            com.moloco.sdk.acm.CountEvent withTag = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.c0.c()).withTag(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE, java.lang.String.valueOf(error.errorCode));
            java.lang.String errorCodeName = com.google.android.exoplayer2.PlaybackException.getErrorCodeName(error.errorCode);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorCodeName, "getErrorCodeName(...)");
            com.moloco.sdk.acm.CountEvent withTag2 = withTag.withTag("error_code_name", errorCodeName);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.r;
            com.moloco.sdk.acm.CountEvent withTag3 = withTag2.withTag("has_streaming_error", java.lang.String.valueOf(bVar2 != null && bVar2.a()));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.g.getValue();
            if (iVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.b) {
                str = "not_available";
            } else if (iVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d) {
                str = "preparing";
            } else if (iVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c) {
                str = "position";
            } else {
                if (!(iVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.a)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str = "finished";
            }
            metricsRecorder.recordCountEvent(withTag3.withTag("playback_progress", str));
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.b && (bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.r) != null && bVar.a()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.g.getValue();
                if ((iVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.a) || (iVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c)) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.e, "Ignoring exoplayer streaming error as the user has viewed some of the ad already", null, false, 12, null);
                    return;
                } else {
                    if (!(iVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d) && !kotlin.jvm.internal.Intrinsics.areEqual(iVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.b.b)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.e, "Exoplayer streaming failed before any playback started, so report that as error", null, false, 12, null);
                }
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.k.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.f7451a);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(com.google.android.exoplayer2.PlaybackException playbackException) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerErrorChanged(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerStateChanged(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaylistMetadataChanged(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPositionDiscontinuity(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo positionInfo, com.google.android.exoplayer2.Player.PositionInfo positionInfo2, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onRenderedFirstFrame(this);
            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
            java.lang.String str = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.e;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("onRenderedFirstFrame pos=");
            com.google.android.exoplayer2.ExoPlayer l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.l();
            sb.append(l != null ? java.lang.Long.valueOf(l.getCurrentPosition()) : null);
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, str, sb.toString(), null, false, 12, null);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onRepeatModeChanged(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekBackIncrementChanged(long j) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekBackIncrementChanged(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekForwardIncrementChanged(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekProcessed() {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekProcessed(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onShuffleModeEnabledChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSkipSilenceEnabledChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onSurfaceSizeChanged(this, i, i2);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.Timeline timeline, int i) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onTimelineChanged(this, timeline, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onTrackSelectionParametersChanged(this, trackSelectionParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.Tracks tracks) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onTracksChanged(this, tracks);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize videoSize) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onVideoSizeChanged(this, videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f) {
            com.google.android.exoplayer2.Player.Listener.CC.$default$onVolumeChanged(this, f);
        }
    }

    public /* synthetic */ class e extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public e(java.lang.Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.class, "initOrResumeExoPlayer", "initOrResumeExoPlayer()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c) this.receiver).z();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ class f extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public f(java.lang.Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.class, "disposeExoPlayer", "disposeExoPlayer()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c) this.receiver).k();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.SimplifiedExoPlayer$startPlaybackProgressJob$1", f = "SimplifiedExoPlayer.kt", i = {}, l = {362}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7949a;

        public g(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.g) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7949a;
            if (i != 0 && i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            do {
                com.google.android.exoplayer2.ExoPlayer l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.l();
                if (l != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.this.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c(l.getCurrentPosition(), l.getDuration()));
                }
                this.f7949a = 1;
            } while (kotlinx.coroutines.DelayKt.delay(500L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public c(android.content.Context context, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, androidx.lifecycle.Lifecycle lifecycle, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        com.google.android.exoplayer2.ui.StyledPlayerView styledPlayerView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7944a = context;
        this.b = z;
        this.c = mediaCacheRepository;
        this.d = metricsRecorder;
        this.e = "SimplifiedExoPlayer";
        this.f = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.b.b);
        this.g = MutableStateFlow;
        this.h = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(false, false, false, 6, null));
        this.i = MutableStateFlow2;
        this.j = MutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.k = MutableStateFlow3;
        this.l = MutableStateFlow3;
        try {
            styledPlayerView = new com.google.android.exoplayer2.ui.StyledPlayerView(context);
            styledPlayerView.setUseController(false);
        } catch (android.view.InflateException e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "ExoPlayerView could not be instantiated.", e2, false, 8, null);
            this.k.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.b);
            styledPlayerView = null;
        }
        this.m = styledPlayerView;
        this.p = android.os.Looper.getMainLooper();
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(isPlaying(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.a(null)), this.f);
        this.t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.d();
        this.u = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d(lifecycle, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.e(this), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.f(this));
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void x() {
    }

    public static /* synthetic */ void y() {
    }

    public final void A() {
        this.s = false;
        this.v = 0L;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public boolean C() {
        return this.o;
    }

    public final void I() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.w;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.g(null), 3, null);
        this.w = launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.f, null, 1, null);
        this.u.destroy();
        k();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> isPlaying() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public java.lang.String m() {
        return this.n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> o() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.google.android.exoplayer2.ui.StyledPlayerView N() {
        return this.m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void pause() {
        this.s = false;
        com.google.android.exoplayer2.ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void play() {
        this.s = true;
        com.google.android.exoplayer2.ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
    }

    public final boolean s() {
        return this.s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void seekTo(long j) {
        this.v = j;
        com.google.android.exoplayer2.ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            exoPlayer.seekTo(j);
        }
    }

    public final void z() {
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "Init exo player", null, false, 12, null);
        com.google.android.exoplayer2.ui.StyledPlayerView N = N();
        if (N == null) {
            return;
        }
        if (this.q == null) {
            com.google.android.exoplayer2.ExoPlayer build = new com.google.android.exoplayer2.ExoPlayer.Builder(this.f7944a).setLooper(this.p).setPauseAtEndOfMediaItems(true).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            N.setPlayer(build);
            this.q = build;
            build.setPlayWhenReady(false);
            build.addListener(this.t);
            b(build);
            if (kotlin.jvm.internal.Intrinsics.areEqual(o().getValue(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.b.b)) {
                b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d(build.getDuration()));
            }
        }
        N.onResume();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void b(boolean z) {
        this.o = z;
        com.google.android.exoplayer2.ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            a(exoPlayer, z);
        }
    }

    public final void c(com.google.android.exoplayer2.ExoPlayer exoPlayer) {
        this.v = exoPlayer.getCurrentPosition();
    }

    public final void d(com.google.android.exoplayer2.ExoPlayer exoPlayer) {
        this.q = exoPlayer;
    }

    public final void e(boolean z) {
        this.s = z;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> f() {
        return this.l;
    }

    public final void k() {
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "Disposing exo player", null, false, 12, null);
        com.google.android.exoplayer2.ui.StyledPlayerView N = N();
        if (N != null) {
            N.onPause();
            N.setPlayer(null);
        }
        com.google.android.exoplayer2.ExoPlayer exoPlayer = this.q;
        long duration = exoPlayer != null ? exoPlayer.getDuration() : 0L;
        com.google.android.exoplayer2.ExoPlayer exoPlayer2 = this.q;
        boolean z = duration - (exoPlayer2 != null ? exoPlayer2.getCurrentPosition() : 0L) > 0;
        com.google.android.exoplayer2.ExoPlayer exoPlayer3 = this.q;
        if (exoPlayer3 != null) {
            c(exoPlayer3);
            exoPlayer3.removeListener(this.t);
            exoPlayer3.release();
        }
        this.q = null;
        this.i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(false, false, z));
    }

    public final com.google.android.exoplayer2.ExoPlayer l() {
        return this.q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public void a(java.lang.String str) {
        this.n = str;
        com.google.android.exoplayer2.ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            a(exoPlayer, str);
        }
        A();
    }

    public final void b(com.google.android.exoplayer2.ExoPlayer exoPlayer) {
        a(exoPlayer, C());
        a(exoPlayer, m());
        exoPlayer.seekTo(this.v);
        if (this.s) {
            exoPlayer.play();
        } else {
            exoPlayer.pause();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
    public java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object a2;
        com.google.android.exoplayer2.ExoPlayer exoPlayer = this.q;
        return (exoPlayer == null || (a2 = a(exoPlayer, 3, continuation)) != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? kotlin.Unit.INSTANCE : a2;
    }

    public final void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        this.g.setValue(iVar);
    }

    public final boolean a(com.google.android.exoplayer2.ExoPlayer exoPlayer) {
        return exoPlayer.getVolume() == 0.0f;
    }

    public final void a(com.google.android.exoplayer2.ExoPlayer exoPlayer, boolean z) {
        exoPlayer.setVolume(z ? 0.0f : 1.0f);
    }

    public final void a(com.google.android.exoplayer2.ExoPlayer exoPlayer, final java.lang.String str) {
        if (str == null) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "URI Source is empty", null, false, 12, null);
            return;
        }
        try {
            if (this.b) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "Streaming is enabled", null, false, 12, null);
                com.google.android.exoplayer2.source.DefaultMediaSourceFactory defaultMediaSourceFactory = new com.google.android.exoplayer2.source.DefaultMediaSourceFactory(new com.google.android.exoplayer2.upstream.DataSource.Factory() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c$$ExternalSyntheticLambda0
                    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
                    public final com.google.android.exoplayer2.upstream.DataSource createDataSource() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.a(str, this);
                    }
                });
                com.google.android.exoplayer2.MediaItem fromUri = com.google.android.exoplayer2.MediaItem.fromUri(str);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromUri, "fromUri(...)");
                exoPlayer.setMediaSource(defaultMediaSourceFactory.createMediaSource(fromUri));
            } else {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "Streaming is disabled", null, false, 12, null);
                exoPlayer.setMediaItem(com.google.android.exoplayer2.MediaItem.fromUri(str));
            }
            exoPlayer.prepare();
        } catch (java.lang.Exception e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "ExoPlayer setMediaItem exception", e2, false, 8, null);
            this.k.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.c);
        }
    }

    public static final com.google.android.exoplayer2.upstream.DataSource a(java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c cVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b(str, cVar.c);
        cVar.r = bVar;
        return bVar;
    }

    public final java.lang.Object a(com.google.android.exoplayer2.ExoPlayer exoPlayer, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.C0317c c0317c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.C0317c(i, exoPlayer, cancellableContinuationImpl);
        exoPlayer.addListener(c0317c);
        cancellableContinuationImpl.invokeOnCancellation(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c.b(exoPlayer, c0317c));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }
}
