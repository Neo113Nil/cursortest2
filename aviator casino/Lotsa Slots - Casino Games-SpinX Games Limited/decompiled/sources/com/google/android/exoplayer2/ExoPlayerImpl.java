package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
final class ExoPlayerImpl extends com.google.android.exoplayer2.BasePlayer implements com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent, com.google.android.exoplayer2.ExoPlayer.VideoComponent, com.google.android.exoplayer2.ExoPlayer.TextComponent, com.google.android.exoplayer2.ExoPlayer.DeviceComponent {
    private static final java.lang.String TAG = "ExoPlayerImpl";
    private final com.google.android.exoplayer2.analytics.AnalyticsCollector analyticsCollector;
    private final android.content.Context applicationContext;
    private final android.os.Looper applicationLooper;
    private com.google.android.exoplayer2.audio.AudioAttributes audioAttributes;
    private final com.google.android.exoplayer2.AudioBecomingNoisyManager audioBecomingNoisyManager;
    private com.google.android.exoplayer2.decoder.DecoderCounters audioDecoderCounters;
    private final com.google.android.exoplayer2.AudioFocusManager audioFocusManager;
    private com.google.android.exoplayer2.Format audioFormat;
    private final java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener> audioOffloadListeners;
    private int audioSessionId;
    private com.google.android.exoplayer2.Player.Commands availableCommands;
    private final com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter;
    private com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener;
    private final com.google.android.exoplayer2.util.Clock clock;
    private final com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener componentListener;
    private final com.google.android.exoplayer2.util.ConditionVariable constructorFinished;
    private com.google.android.exoplayer2.text.CueGroup currentCueGroup;
    private final long detachSurfaceTimeoutMs;
    private com.google.android.exoplayer2.DeviceInfo deviceInfo;
    final com.google.android.exoplayer2.trackselection.TrackSelectorResult emptyTrackSelectorResult;
    private boolean foregroundMode;
    private final com.google.android.exoplayer2.ExoPlayerImpl.FrameMetadataListener frameMetadataListener;
    private boolean hasNotifiedFullWrongThreadWarning;
    private final com.google.android.exoplayer2.ExoPlayerImplInternal internalPlayer;
    private boolean isPriorityTaskManagerRegistered;
    private android.media.AudioTrack keepSessionIdAudioTrack;
    private final com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player.Listener> listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private com.google.android.exoplayer2.MediaMetadata mediaMetadata;
    private final com.google.android.exoplayer2.source.MediaSource.Factory mediaSourceFactory;
    private final java.util.List<com.google.android.exoplayer2.ExoPlayerImpl.MediaSourceHolderSnapshot> mediaSourceHolderSnapshots;
    private android.view.Surface ownedSurface;
    private boolean pauseAtEndOfMediaItems;
    private boolean pendingDiscontinuity;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private int pendingPlayWhenReadyChangeReason;
    private final com.google.android.exoplayer2.Timeline.Period period;
    final com.google.android.exoplayer2.Player.Commands permanentAvailableCommands;
    private com.google.android.exoplayer2.PlaybackInfo playbackInfo;
    private final com.google.android.exoplayer2.util.HandlerWrapper playbackInfoUpdateHandler;
    private final com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private boolean playerReleased;
    private com.google.android.exoplayer2.MediaMetadata playlistMetadata;
    private com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
    private final com.google.android.exoplayer2.Renderer[] renderers;
    private int repeatMode;
    private final long seekBackIncrementMs;
    private final long seekForwardIncrementMs;
    private com.google.android.exoplayer2.SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder;
    private boolean skipSilenceEnabled;
    private com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView sphericalGLSurfaceView;
    private com.google.android.exoplayer2.MediaMetadata staticAndDynamicMediaMetadata;
    private final com.google.android.exoplayer2.StreamVolumeManager streamVolumeManager;
    private android.view.SurfaceHolder surfaceHolder;
    private boolean surfaceHolderSurfaceIsVideoOutput;
    private com.google.android.exoplayer2.util.Size surfaceSize;
    private android.view.TextureView textureView;
    private boolean throwsWhenUsingWrongThread;
    private final com.google.android.exoplayer2.trackselection.TrackSelector trackSelector;
    private final boolean useLazyPreparation;
    private int videoChangeFrameRateStrategy;
    private com.google.android.exoplayer2.decoder.DecoderCounters videoDecoderCounters;
    private com.google.android.exoplayer2.Format videoFormat;
    private com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener;
    private java.lang.Object videoOutput;
    private int videoScalingMode;
    private com.google.android.exoplayer2.video.VideoSize videoSize;
    private float volume;
    private final com.google.android.exoplayer2.WakeLockManager wakeLockManager;
    private final com.google.android.exoplayer2.WifiLockManager wifiLockManager;
    private final com.google.android.exoplayer2.Player wrappingPlayer;

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPlayWhenReadyChangeReason(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    static {
        com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule("goog.exo.exoplayer");
    }

    public ExoPlayerImpl(com.google.android.exoplayer2.ExoPlayer.Builder builder, com.google.android.exoplayer2.Player player) {
        com.google.android.exoplayer2.analytics.PlayerId registerMediaMetricsListener;
        com.google.android.exoplayer2.util.ConditionVariable conditionVariable = new com.google.android.exoplayer2.util.ConditionVariable();
        this.constructorFinished = conditionVariable;
        try {
            com.google.android.exoplayer2.util.Log.i(TAG, "Init " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [ExoPlayerLib/2.18.2] [" + com.google.android.exoplayer2.util.Util.DEVICE_DEBUG_INFO + com.ironsource.X3.j.e);
            android.content.Context applicationContext = builder.context.getApplicationContext();
            this.applicationContext = applicationContext;
            com.google.android.exoplayer2.analytics.AnalyticsCollector apply = builder.analyticsCollectorFunction.apply(builder.clock);
            this.analyticsCollector = apply;
            this.priorityTaskManager = builder.priorityTaskManager;
            this.audioAttributes = builder.audioAttributes;
            this.videoScalingMode = builder.videoScalingMode;
            this.videoChangeFrameRateStrategy = builder.videoChangeFrameRateStrategy;
            this.skipSilenceEnabled = builder.skipSilenceEnabled;
            this.detachSurfaceTimeoutMs = builder.detachSurfaceTimeoutMs;
            com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener componentListener = new com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener();
            this.componentListener = componentListener;
            com.google.android.exoplayer2.ExoPlayerImpl.FrameMetadataListener frameMetadataListener = new com.google.android.exoplayer2.ExoPlayerImpl.FrameMetadataListener();
            this.frameMetadataListener = frameMetadataListener;
            android.os.Handler handler = new android.os.Handler(builder.looper);
            com.google.android.exoplayer2.Renderer[] createRenderers = builder.renderersFactorySupplier.get().createRenderers(handler, componentListener, componentListener, componentListener, componentListener);
            this.renderers = createRenderers;
            com.google.android.exoplayer2.util.Assertions.checkState(createRenderers.length > 0);
            com.google.android.exoplayer2.trackselection.TrackSelector trackSelector = builder.trackSelectorSupplier.get();
            this.trackSelector = trackSelector;
            this.mediaSourceFactory = builder.mediaSourceFactorySupplier.get();
            com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter = builder.bandwidthMeterSupplier.get();
            this.bandwidthMeter = bandwidthMeter;
            this.useLazyPreparation = builder.useLazyPreparation;
            this.seekParameters = builder.seekParameters;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.pauseAtEndOfMediaItems = builder.pauseAtEndOfMediaItems;
            android.os.Looper looper = builder.looper;
            this.applicationLooper = looper;
            com.google.android.exoplayer2.util.Clock clock = builder.clock;
            this.clock = clock;
            com.google.android.exoplayer2.Player player2 = player == null ? this : player;
            this.wrappingPlayer = player2;
            this.listeners = new com.google.android.exoplayer2.util.ListenerSet<>(looper, clock, new com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda15
                @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
                public final void invoke(java.lang.Object obj, com.google.android.exoplayer2.util.FlagSet flagSet) {
                    com.google.android.exoplayer2.ExoPlayerImpl.this.m5366lambda$new$0$comgoogleandroidexoplayer2ExoPlayerImpl((com.google.android.exoplayer2.Player.Listener) obj, flagSet);
                }
            });
            this.audioOffloadListeners = new java.util.concurrent.CopyOnWriteArraySet<>();
            this.mediaSourceHolderSnapshots = new java.util.ArrayList();
            this.shuffleOrder = new com.google.android.exoplayer2.source.ShuffleOrder.DefaultShuffleOrder(0);
            com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult = new com.google.android.exoplayer2.trackselection.TrackSelectorResult(new com.google.android.exoplayer2.RendererConfiguration[createRenderers.length], new com.google.android.exoplayer2.trackselection.ExoTrackSelection[createRenderers.length], com.google.android.exoplayer2.Tracks.EMPTY, null);
            this.emptyTrackSelectorResult = trackSelectorResult;
            this.period = new com.google.android.exoplayer2.Timeline.Period();
            com.google.android.exoplayer2.Player.Commands build = new com.google.android.exoplayer2.Player.Commands.Builder().addAll(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).addIf(29, trackSelector.isSetParametersSupported()).build();
            this.permanentAvailableCommands = build;
            this.availableCommands = new com.google.android.exoplayer2.Player.Commands.Builder().addAll(build).add(4).add(10).build();
            this.playbackInfoUpdateHandler = clock.createHandler(looper, null);
            com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener = new com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda16
                @Override // com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener
                public final void onPlaybackInfoUpdate(com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
                    com.google.android.exoplayer2.ExoPlayerImpl.this.m5368lambda$new$2$comgoogleandroidexoplayer2ExoPlayerImpl(playbackInfoUpdate);
                }
            };
            this.playbackInfoUpdateListener = playbackInfoUpdateListener;
            this.playbackInfo = com.google.android.exoplayer2.PlaybackInfo.createDummy(trackSelectorResult);
            apply.setPlayer(player2, looper);
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 31) {
                registerMediaMetricsListener = new com.google.android.exoplayer2.analytics.PlayerId();
            } else {
                registerMediaMetricsListener = com.google.android.exoplayer2.ExoPlayerImpl.Api31.registerMediaMetricsListener(applicationContext, this, builder.usePlatformDiagnostics);
            }
            com.google.android.exoplayer2.ExoPlayerImplInternal exoPlayerImplInternal = new com.google.android.exoplayer2.ExoPlayerImplInternal(createRenderers, trackSelector, trackSelectorResult, builder.loadControlSupplier.get(), bandwidthMeter, this.repeatMode, this.shuffleModeEnabled, apply, this.seekParameters, builder.livePlaybackSpeedControl, builder.releaseTimeoutMs, this.pauseAtEndOfMediaItems, looper, clock, playbackInfoUpdateListener, registerMediaMetricsListener);
            this.internalPlayer = exoPlayerImplInternal;
            this.volume = 1.0f;
            this.repeatMode = 0;
            this.mediaMetadata = com.google.android.exoplayer2.MediaMetadata.EMPTY;
            this.playlistMetadata = com.google.android.exoplayer2.MediaMetadata.EMPTY;
            this.staticAndDynamicMediaMetadata = com.google.android.exoplayer2.MediaMetadata.EMPTY;
            this.maskingWindowIndex = -1;
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 21) {
                this.audioSessionId = initializeKeepSessionIdAudioTrack(0);
            } else {
                this.audioSessionId = com.google.android.exoplayer2.util.Util.generateAudioSessionIdV21(applicationContext);
            }
            this.currentCueGroup = com.google.android.exoplayer2.text.CueGroup.EMPTY_TIME_ZERO;
            this.throwsWhenUsingWrongThread = true;
            addListener(apply);
            bandwidthMeter.addEventListener(new android.os.Handler(looper), apply);
            addAudioOffloadListener(componentListener);
            if (builder.foregroundModeTimeoutMs > 0) {
                exoPlayerImplInternal.experimentalSetForegroundModeTimeoutMs(builder.foregroundModeTimeoutMs);
            }
            com.google.android.exoplayer2.AudioBecomingNoisyManager audioBecomingNoisyManager = new com.google.android.exoplayer2.AudioBecomingNoisyManager(builder.context, handler, componentListener);
            this.audioBecomingNoisyManager = audioBecomingNoisyManager;
            audioBecomingNoisyManager.setEnabled(builder.handleAudioBecomingNoisy);
            com.google.android.exoplayer2.AudioFocusManager audioFocusManager = new com.google.android.exoplayer2.AudioFocusManager(builder.context, handler, componentListener);
            this.audioFocusManager = audioFocusManager;
            audioFocusManager.setAudioAttributes(builder.handleAudioFocus ? this.audioAttributes : null);
            com.google.android.exoplayer2.StreamVolumeManager streamVolumeManager = new com.google.android.exoplayer2.StreamVolumeManager(builder.context, handler, componentListener);
            this.streamVolumeManager = streamVolumeManager;
            streamVolumeManager.setStreamType(com.google.android.exoplayer2.util.Util.getStreamTypeForAudioUsage(this.audioAttributes.usage));
            com.google.android.exoplayer2.WakeLockManager wakeLockManager = new com.google.android.exoplayer2.WakeLockManager(builder.context);
            this.wakeLockManager = wakeLockManager;
            wakeLockManager.setEnabled(builder.wakeMode != 0);
            com.google.android.exoplayer2.WifiLockManager wifiLockManager = new com.google.android.exoplayer2.WifiLockManager(builder.context);
            this.wifiLockManager = wifiLockManager;
            wifiLockManager.setEnabled(builder.wakeMode == 2);
            this.deviceInfo = createDeviceInfo(streamVolumeManager);
            this.videoSize = com.google.android.exoplayer2.video.VideoSize.UNKNOWN;
            this.surfaceSize = com.google.android.exoplayer2.util.Size.UNKNOWN;
            trackSelector.setAudioAttributes(this.audioAttributes);
            sendRendererMessage(1, 10, java.lang.Integer.valueOf(this.audioSessionId));
            sendRendererMessage(2, 10, java.lang.Integer.valueOf(this.audioSessionId));
            sendRendererMessage(1, 3, this.audioAttributes);
            sendRendererMessage(2, 4, java.lang.Integer.valueOf(this.videoScalingMode));
            sendRendererMessage(2, 5, java.lang.Integer.valueOf(this.videoChangeFrameRateStrategy));
            sendRendererMessage(1, 9, java.lang.Boolean.valueOf(this.skipSilenceEnabled));
            sendRendererMessage(2, 7, frameMetadataListener);
            sendRendererMessage(6, 8, frameMetadataListener);
            conditionVariable.open();
        } catch (java.lang.Throwable th) {
            this.constructorFinished.open();
            throw th;
        }
    }

    /* renamed from: lambda$new$0$com-google-android-exoplayer2-ExoPlayerImpl, reason: not valid java name */
    /* synthetic */ void m5366lambda$new$0$comgoogleandroidexoplayer2ExoPlayerImpl(com.google.android.exoplayer2.Player.Listener listener, com.google.android.exoplayer2.util.FlagSet flagSet) {
        listener.onEvents(this.wrappingPlayer, new com.google.android.exoplayer2.Player.Events(flagSet));
    }

    /* renamed from: lambda$new$2$com-google-android-exoplayer2-ExoPlayerImpl, reason: not valid java name */
    /* synthetic */ void m5368lambda$new$2$comgoogleandroidexoplayer2ExoPlayerImpl(final com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.playbackInfoUpdateHandler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ExoPlayerImpl.this.m5367lambda$new$1$comgoogleandroidexoplayer2ExoPlayerImpl(playbackInfoUpdate);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.AudioComponent getAudioComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.VideoComponent getVideoComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.TextComponent getTextComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public com.google.android.exoplayer2.ExoPlayer.DeviceComponent getDeviceComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void experimentalSetOffloadSchedulingEnabled(boolean z) {
        verifyApplicationThread();
        this.internalPlayer.experimentalSetOffloadSchedulingEnabled(z);
        java.util.Iterator<com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener> it = this.audioOffloadListeners.iterator();
        while (it.hasNext()) {
            it.next().onExperimentalOffloadSchedulingEnabledChanged(z);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean experimentalIsSleepingForOffload() {
        verifyApplicationThread();
        return this.playbackInfo.sleepingForOffload;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public android.os.Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    @Override // com.google.android.exoplayer2.Player
    public android.os.Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.util.Clock getClock() {
        return this.clock;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAudioOffloadListener(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.audioOffloadListeners.add(audioOffloadListener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAudioOffloadListener(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.audioOffloadListeners.remove(audioOffloadListener);
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return this.availableCommands;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
        verifyApplicationThread();
        return this.playbackInfo.playbackState;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return this.playbackInfo.playbackSuppressionReason;
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.ExoPlaybackException getPlayerError() {
        verifyApplicationThread();
        return this.playbackInfo.playbackError;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public void retry() {
        verifyApplicationThread();
        prepare();
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
        verifyApplicationThread();
        boolean playWhenReady = getPlayWhenReady();
        int updateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, 2);
        updatePlayWhenReady(playWhenReady, updateAudioFocus, getPlayWhenReadyChangeReason(playWhenReady, updateAudioFocus));
        if (this.playbackInfo.playbackState != 1) {
            return;
        }
        com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackError = this.playbackInfo.copyWithPlaybackError(null);
        com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackState = copyWithPlaybackError.copyWithPlaybackState(copyWithPlaybackError.timeline.isEmpty() ? 4 : 2);
        this.pendingOperationAcks++;
        this.internalPlayer.prepare();
        updatePlaybackInfo(copyWithPlaybackState, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public void prepare(com.google.android.exoplayer2.source.MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSource(mediaSource);
        prepare();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @java.lang.Deprecated
    public void prepare(com.google.android.exoplayer2.source.MediaSource mediaSource, boolean z, boolean z2) {
        verifyApplicationThread();
        setMediaSource(mediaSource, z);
        prepare();
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> list, boolean z) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), z);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> list, int i, long j) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), i, j);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSources(java.util.Collections.singletonList(mediaSource));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, long j) {
        verifyApplicationThread();
        setMediaSources(java.util.Collections.singletonList(mediaSource), 0, j);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, boolean z) {
        verifyApplicationThread();
        setMediaSources(java.util.Collections.singletonList(mediaSource), z);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> list) {
        verifyApplicationThread();
        setMediaSources(list, true);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> list, boolean z) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, -1, -9223372036854775807L, z);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> list, int i, long j) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, i, j, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(int i, java.util.List<com.google.android.exoplayer2.MediaItem> list) {
        verifyApplicationThread();
        addMediaSources(java.lang.Math.min(i, this.mediaSourceHolderSnapshots.size()), createMediaSources(list));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(java.util.Collections.singletonList(mediaSource));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(int i, com.google.android.exoplayer2.source.MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(i, java.util.Collections.singletonList(mediaSource));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> list) {
        verifyApplicationThread();
        addMediaSources(this.mediaSourceHolderSnapshots.size(), list);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(int i, java.util.List<com.google.android.exoplayer2.source.MediaSource> list) {
        verifyApplicationThread();
        com.google.android.exoplayer2.util.Assertions.checkArgument(i >= 0);
        com.google.android.exoplayer2.Timeline currentTimeline = getCurrentTimeline();
        this.pendingOperationAcks++;
        java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> addMediaSourceHolders = addMediaSourceHolders(i, list);
        com.google.android.exoplayer2.Timeline createMaskingTimeline = createMaskingTimeline();
        com.google.android.exoplayer2.PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(currentTimeline, createMaskingTimeline));
        this.internalPlayer.addMediaSources(i, addMediaSourceHolders, this.shuffleOrder);
        updatePlaybackInfo(maskTimelineAndPosition, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int i, int i2) {
        verifyApplicationThread();
        com.google.android.exoplayer2.PlaybackInfo removeMediaItemsInternal = removeMediaItemsInternal(i, java.lang.Math.min(i2, this.mediaSourceHolderSnapshots.size()));
        updatePlaybackInfo(removeMediaItemsInternal, 0, 1, false, !removeMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(removeMediaItemsInternal), -1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int i, int i2, int i3) {
        verifyApplicationThread();
        com.google.android.exoplayer2.util.Assertions.checkArgument(i >= 0 && i <= i2 && i2 <= this.mediaSourceHolderSnapshots.size() && i3 >= 0);
        com.google.android.exoplayer2.Timeline currentTimeline = getCurrentTimeline();
        this.pendingOperationAcks++;
        int min = java.lang.Math.min(i3, this.mediaSourceHolderSnapshots.size() - (i2 - i));
        com.google.android.exoplayer2.util.Util.moveItems(this.mediaSourceHolderSnapshots, i, i2, min);
        com.google.android.exoplayer2.Timeline createMaskingTimeline = createMaskingTimeline();
        com.google.android.exoplayer2.PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(currentTimeline, createMaskingTimeline));
        this.internalPlayer.moveMediaSources(i, i2, min, this.shuffleOrder);
        updatePlaybackInfo(maskTimelineAndPosition, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder) {
        verifyApplicationThread();
        this.shuffleOrder = shuffleOrder;
        com.google.android.exoplayer2.Timeline createMaskingTimeline = createMaskingTimeline();
        com.google.android.exoplayer2.PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(createMaskingTimeline, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.pendingOperationAcks++;
        this.internalPlayer.setShuffleOrder(shuffleOrder);
        updatePlaybackInfo(maskTimelineAndPosition, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z) {
        verifyApplicationThread();
        if (this.pauseAtEndOfMediaItems == z) {
            return;
        }
        this.pauseAtEndOfMediaItems = z;
        this.internalPlayer.setPauseAtEndOfWindow(z);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        verifyApplicationThread();
        return this.pauseAtEndOfMediaItems;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean z) {
        verifyApplicationThread();
        int updateAudioFocus = this.audioFocusManager.updateAudioFocus(z, getPlaybackState());
        updatePlayWhenReady(z, updateAudioFocus, getPlayWhenReadyChangeReason(z, updateAudioFocus));
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return this.playbackInfo.playWhenReady;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(final int i) {
        verifyApplicationThread();
        if (this.repeatMode != i) {
            this.repeatMode = i;
            this.internalPlayer.setRepeatMode(i);
            this.listeners.queueEvent(8, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda17
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onRepeatModeChanged(i);
                }
            });
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
        verifyApplicationThread();
        return this.repeatMode;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(final boolean z) {
        verifyApplicationThread();
        if (this.shuffleModeEnabled != z) {
            this.shuffleModeEnabled = z;
            this.internalPlayer.setShuffleModeEnabled(z);
            this.listeners.queueEvent(9, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onShuffleModeEnabledChanged(z);
                }
            });
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return this.shuffleModeEnabled;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
        verifyApplicationThread();
        return this.playbackInfo.isLoading;
    }

    @Override // com.google.android.exoplayer2.BasePlayer
    protected void repeatCurrentMediaItem() {
        verifyApplicationThread();
        seekToInternal(getCurrentMediaItemIndex(), -9223372036854775807L, true);
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(int i, long j) {
        verifyApplicationThread();
        seekToInternal(i, j, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return this.seekBackIncrementMs;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return this.seekForwardIncrementMs;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return 3000L;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        if (playbackParameters == null) {
            playbackParameters = com.google.android.exoplayer2.PlaybackParameters.DEFAULT;
        }
        if (this.playbackInfo.playbackParameters.equals(playbackParameters)) {
            return;
        }
        com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackParameters = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        this.pendingOperationAcks++;
        this.internalPlayer.setPlaybackParameters(playbackParameters);
        updatePlaybackInfo(copyWithPlaybackParameters, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return this.playbackInfo.playbackParameters;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(com.google.android.exoplayer2.SeekParameters seekParameters) {
        verifyApplicationThread();
        if (seekParameters == null) {
            seekParameters = com.google.android.exoplayer2.SeekParameters.DEFAULT;
        }
        if (this.seekParameters.equals(seekParameters)) {
            return;
        }
        this.seekParameters = seekParameters;
        this.internalPlayer.setSeekParameters(seekParameters);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.SeekParameters getSeekParameters() {
        verifyApplicationThread();
        return this.seekParameters;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setForegroundMode(boolean z) {
        verifyApplicationThread();
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (this.internalPlayer.setForegroundMode(z)) {
                return;
            }
            stopInternal(false, com.google.android.exoplayer2.ExoPlaybackException.createForUnexpected(new com.google.android.exoplayer2.ExoTimeoutException(2), 1003));
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
        verifyApplicationThread();
        stop(false);
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop(boolean z) {
        verifyApplicationThread();
        this.audioFocusManager.updateAudioFocus(getPlayWhenReady(), 1);
        stopInternal(z, null);
        this.currentCueGroup = new com.google.android.exoplayer2.text.CueGroup(com.google.common.collect.ImmutableList.of(), this.playbackInfo.positionUs);
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
        android.media.AudioTrack audioTrack;
        com.google.android.exoplayer2.util.Log.i(TAG, "Release " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [ExoPlayerLib/2.18.2] [" + com.google.android.exoplayer2.util.Util.DEVICE_DEBUG_INFO + "] [" + com.google.android.exoplayer2.ExoPlayerLibraryInfo.registeredModules() + com.ironsource.X3.j.e);
        verifyApplicationThread();
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 21 && (audioTrack = this.keepSessionIdAudioTrack) != null) {
            audioTrack.release();
            this.keepSessionIdAudioTrack = null;
        }
        this.audioBecomingNoisyManager.setEnabled(false);
        this.streamVolumeManager.release();
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
        this.audioFocusManager.release();
        if (!this.internalPlayer.release()) {
            this.listeners.sendEvent(10, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda21
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onPlayerError(com.google.android.exoplayer2.ExoPlaybackException.createForUnexpected(new com.google.android.exoplayer2.ExoTimeoutException(1), 1003));
                }
            });
        }
        this.listeners.release();
        this.playbackInfoUpdateHandler.removeCallbacksAndMessages(null);
        this.bandwidthMeter.removeEventListener(this.analyticsCollector);
        com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackState = this.playbackInfo.copyWithPlaybackState(1);
        this.playbackInfo = copyWithPlaybackState;
        com.google.android.exoplayer2.PlaybackInfo copyWithLoadingMediaPeriodId = copyWithPlaybackState.copyWithLoadingMediaPeriodId(copyWithPlaybackState.periodId);
        this.playbackInfo = copyWithLoadingMediaPeriodId;
        copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
        this.playbackInfo.totalBufferedDurationUs = 0L;
        this.analyticsCollector.release();
        this.trackSelector.release();
        removeSurfaceCallbacks();
        android.view.Surface surface = this.ownedSurface;
        if (surface != null) {
            surface.release();
            this.ownedSurface = null;
        }
        if (this.isPriorityTaskManagerRegistered) {
            ((com.google.android.exoplayer2.util.PriorityTaskManager) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.priorityTaskManager)).remove(0);
            this.isPriorityTaskManagerRegistered = false;
        }
        this.currentCueGroup = com.google.android.exoplayer2.text.CueGroup.EMPTY_TIME_ZERO;
        this.playerReleased = true;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.PlayerMessage createMessage(com.google.android.exoplayer2.PlayerMessage.Target target) {
        verifyApplicationThread();
        return createMessageInternal(target);
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingPeriodIndex;
        }
        return this.playbackInfo.timeline.getIndexOfPeriod(this.playbackInfo.periodId.periodUid);
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        int currentWindowIndexInternal = getCurrentWindowIndexInternal();
        if (currentWindowIndexInternal == -1) {
            return 0;
        }
        return currentWindowIndexInternal;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
            this.playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
            return com.google.android.exoplayer2.util.Util.usToMs(this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
        }
        return getContentDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
        verifyApplicationThread();
        return com.google.android.exoplayer2.util.Util.usToMs(getCurrentPositionUsInternal(this.playbackInfo));
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            if (this.playbackInfo.loadingMediaPeriodId.equals(this.playbackInfo.periodId)) {
                return com.google.android.exoplayer2.util.Util.usToMs(this.playbackInfo.bufferedPositionUs);
            }
            return getDuration();
        }
        return getContentBufferedPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return com.google.android.exoplayer2.util.Util.usToMs(this.playbackInfo.totalBufferedDurationUs);
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return this.playbackInfo.periodId.isAd();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            this.playbackInfo.timeline.getPeriodByUid(this.playbackInfo.periodId.periodUid, this.period);
            if (this.playbackInfo.requestedContentPositionUs == -9223372036854775807L) {
                return this.playbackInfo.timeline.getWindow(getCurrentMediaItemIndex(), this.window).getDefaultPositionMs();
            }
            return this.period.getPositionInWindowMs() + com.google.android.exoplayer2.util.Util.usToMs(this.playbackInfo.requestedContentPositionUs);
        }
        return getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowPositionMs;
        }
        if (this.playbackInfo.loadingMediaPeriodId.windowSequenceNumber != this.playbackInfo.periodId.windowSequenceNumber) {
            return this.playbackInfo.timeline.getWindow(getCurrentMediaItemIndex(), this.window).getDurationMs();
        }
        long j = this.playbackInfo.bufferedPositionUs;
        if (this.playbackInfo.loadingMediaPeriodId.isAd()) {
            com.google.android.exoplayer2.Timeline.Period periodByUid = this.playbackInfo.timeline.getPeriodByUid(this.playbackInfo.loadingMediaPeriodId.periodUid, this.period);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.playbackInfo.loadingMediaPeriodId.adGroupIndex);
            j = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.durationUs : adGroupTimeUs;
        }
        return com.google.android.exoplayer2.util.Util.usToMs(periodPositionUsToWindowPositionUs(this.playbackInfo.timeline, this.playbackInfo.loadingMediaPeriodId, j));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererCount() {
        verifyApplicationThread();
        return this.renderers.length;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererType(int i) {
        verifyApplicationThread();
        return this.renderers[i].getTrackType();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.Renderer getRenderer(int i) {
        verifyApplicationThread();
        return this.renderers[i];
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.trackselection.TrackSelector getTrackSelector() {
        verifyApplicationThread();
        return this.trackSelector;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.source.TrackGroupArray getCurrentTrackGroups() {
        verifyApplicationThread();
        return this.playbackInfo.trackGroups;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.trackselection.TrackSelectionArray getCurrentTrackSelections() {
        verifyApplicationThread();
        return new com.google.android.exoplayer2.trackselection.TrackSelectionArray(this.playbackInfo.trackSelectorResult.selections);
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Tracks getCurrentTracks() {
        verifyApplicationThread();
        return this.playbackInfo.trackSelectorResult.tracks;
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        return this.trackSelector.getParameters();
    }

    @Override // com.google.android.exoplayer2.Player
    public void setTrackSelectionParameters(final com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        if (!this.trackSelector.isSetParametersSupported() || trackSelectionParameters.equals(this.trackSelector.getParameters())) {
            return;
        }
        this.trackSelector.setParameters(trackSelectionParameters);
        this.listeners.sendEvent(19, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda23
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.Player.Listener) obj).onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.this);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return this.mediaMetadata;
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return this.playlistMetadata;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaylistMetadata(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaMetadata);
        if (mediaMetadata.equals(this.playlistMetadata)) {
            return;
        }
        this.playlistMetadata = mediaMetadata;
        this.listeners.sendEvent(15, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda14
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.ExoPlayerImpl.this.m5369xadc0e460((com.google.android.exoplayer2.Player.Listener) obj);
            }
        });
    }

    /* renamed from: lambda$setPlaylistMetadata$7$com-google-android-exoplayer2-ExoPlayerImpl, reason: not valid java name */
    /* synthetic */ void m5369xadc0e460(com.google.android.exoplayer2.Player.Listener listener) {
        listener.onPlaylistMetadataChanged(this.playlistMetadata);
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return this.playbackInfo.timeline;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int i) {
        verifyApplicationThread();
        this.videoScalingMode = i;
        sendRendererMessage(2, 4, java.lang.Integer.valueOf(i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
        verifyApplicationThread();
        return this.videoScalingMode;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoChangeFrameRateStrategy(int i) {
        verifyApplicationThread();
        if (this.videoChangeFrameRateStrategy == i) {
            return;
        }
        this.videoChangeFrameRateStrategy = i;
        sendRendererMessage(2, 5, java.lang.Integer.valueOf(i));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoChangeFrameRateStrategy() {
        verifyApplicationThread();
        return this.videoChangeFrameRateStrategy;
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public com.google.android.exoplayer2.video.VideoSize getVideoSize() {
        verifyApplicationThread();
        return this.videoSize;
    }

    @Override // com.google.android.exoplayer2.Player
    public com.google.android.exoplayer2.util.Size getSurfaceSize() {
        verifyApplicationThread();
        return this.surfaceSize;
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface() {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(null);
        maybeNotifySurfaceSizeChanged(0, 0);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        if (surface == null || surface != this.videoOutput) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(surface);
        int i = surface == null ? 0 : -1;
        maybeNotifySurfaceSizeChanged(i, i);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.surfaceHolderSurfaceIsVideoOutput = true;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        android.view.Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            setVideoOutputInternal(surface);
            android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        } else {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null || surfaceHolder != this.surfaceHolder) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        if (surfaceView instanceof com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer) {
            removeSurfaceCallbacks();
            setVideoOutputInternal(surfaceView);
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView) {
                removeSurfaceCallbacks();
                this.sphericalGLSurfaceView = (com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView) surfaceView;
                createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(this.sphericalGLSurfaceView).send();
                this.sphericalGLSurfaceView.addVideoSurfaceListener(this.componentListener);
                setVideoOutputInternal(this.sphericalGLSurfaceView.getVideoSurface());
                setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
                return;
            }
            setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.textureView = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.componentListener);
        android.graphics.SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setSurfaceTextureInternal(surfaceTexture);
            maybeNotifySurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null || textureView != this.textureView) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioAttributes(final com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, boolean z) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        if (!com.google.android.exoplayer2.util.Util.areEqual(this.audioAttributes, audioAttributes)) {
            this.audioAttributes = audioAttributes;
            sendRendererMessage(1, 3, audioAttributes);
            this.streamVolumeManager.setStreamType(com.google.android.exoplayer2.util.Util.getStreamTypeForAudioUsage(audioAttributes.usage));
            this.listeners.queueEvent(20, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda11
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onAudioAttributesChanged(com.google.android.exoplayer2.audio.AudioAttributes.this);
                }
            });
        }
        this.audioFocusManager.setAudioAttributes(z ? audioAttributes : null);
        this.trackSelector.setAudioAttributes(audioAttributes);
        boolean playWhenReady = getPlayWhenReady();
        int updateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, getPlaybackState());
        updatePlayWhenReady(playWhenReady, updateAudioFocus, getPlayWhenReadyChangeReason(playWhenReady, updateAudioFocus));
        this.listeners.flushEvents();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return this.audioAttributes;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioSessionId(final int i) {
        verifyApplicationThread();
        if (this.audioSessionId == i) {
            return;
        }
        if (i == 0) {
            if (com.google.android.exoplayer2.util.Util.SDK_INT < 21) {
                i = initializeKeepSessionIdAudioTrack(0);
            } else {
                i = com.google.android.exoplayer2.util.Util.generateAudioSessionIdV21(this.applicationContext);
            }
        } else if (com.google.android.exoplayer2.util.Util.SDK_INT < 21) {
            initializeKeepSessionIdAudioTrack(i);
        }
        this.audioSessionId = i;
        sendRendererMessage(1, 10, java.lang.Integer.valueOf(i));
        sendRendererMessage(2, 10, java.lang.Integer.valueOf(i));
        this.listeners.sendEvent(21, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda18
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.Player.Listener) obj).onAudioSessionIdChanged(i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
        verifyApplicationThread();
        return this.audioSessionId;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo auxEffectInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 6, auxEffectInfo);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
        verifyApplicationThread();
        setAuxEffectInfo(new com.google.android.exoplayer2.audio.AuxEffectInfo(0, 0.0f));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPreferredAudioDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 12, audioDeviceInfo);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setVolume(float f) {
        verifyApplicationThread();
        final float constrainValue = com.google.android.exoplayer2.util.Util.constrainValue(f, 0.0f, 1.0f);
        if (this.volume == constrainValue) {
            return;
        }
        this.volume = constrainValue;
        sendVolumeToRenderers();
        this.listeners.sendEvent(22, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda13
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.Player.Listener) obj).onVolumeChanged(constrainValue);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public float getVolume() {
        verifyApplicationThread();
        return this.volume;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
        verifyApplicationThread();
        return this.skipSilenceEnabled;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(final boolean z) {
        verifyApplicationThread();
        if (this.skipSilenceEnabled == z) {
            return;
        }
        this.skipSilenceEnabled = z;
        sendRendererMessage(1, 9, java.lang.Boolean.valueOf(z));
        this.listeners.sendEvent(23, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda22
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.Player.Listener) obj).onSkipSilenceEnabledChanged(z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.analytics.AnalyticsCollector getAnalyticsCollector() {
        verifyApplicationThread();
        return this.analyticsCollector;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAnalyticsListener(com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        this.analyticsCollector.addListener((com.google.android.exoplayer2.analytics.AnalyticsListener) com.google.android.exoplayer2.util.Assertions.checkNotNull(analyticsListener));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAnalyticsListener(com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener) {
        this.analyticsCollector.removeListener((com.google.android.exoplayer2.analytics.AnalyticsListener) com.google.android.exoplayer2.util.Assertions.checkNotNull(analyticsListener));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        this.audioBecomingNoisyManager.setEnabled(z);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPriorityTaskManager(com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager) {
        verifyApplicationThread();
        if (com.google.android.exoplayer2.util.Util.areEqual(this.priorityTaskManager, priorityTaskManager)) {
            return;
        }
        if (this.isPriorityTaskManagerRegistered) {
            ((com.google.android.exoplayer2.util.PriorityTaskManager) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.priorityTaskManager)).remove(0);
        }
        if (priorityTaskManager != null && isLoading()) {
            priorityTaskManager.add(0);
            this.isPriorityTaskManagerRegistered = true;
        } else {
            this.isPriorityTaskManagerRegistered = false;
        }
        this.priorityTaskManager = priorityTaskManager;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.Format getVideoFormat() {
        verifyApplicationThread();
        return this.videoFormat;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.Format getAudioFormat() {
        verifyApplicationThread();
        return this.audioFormat;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.decoder.DecoderCounters getVideoDecoderCounters() {
        verifyApplicationThread();
        return this.videoDecoderCounters;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public com.google.android.exoplayer2.decoder.DecoderCounters getAudioDecoderCounters() {
        verifyApplicationThread();
        return this.audioDecoderCounters;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(videoFrameMetadataListener).send();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        if (this.videoFrameMetadataListener != videoFrameMetadataListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(null).send();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        this.cameraMotionListener = cameraMotionListener;
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(cameraMotionListener).send();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        if (this.cameraMotionListener != cameraMotionListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(null).send();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.TextComponent
    public com.google.android.exoplayer2.text.CueGroup getCurrentCues() {
        verifyApplicationThread();
        return this.currentCueGroup;
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(com.google.android.exoplayer2.Player.Listener listener) {
        this.listeners.add((com.google.android.exoplayer2.Player.Listener) com.google.android.exoplayer2.util.Assertions.checkNotNull(listener));
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(com.google.android.exoplayer2.Player.Listener listener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(listener);
        this.listeners.remove(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setHandleWakeLock(boolean z) {
        verifyApplicationThread();
        setWakeMode(z ? 1 : 0);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setWakeMode(int i) {
        verifyApplicationThread();
        if (i == 0) {
            this.wakeLockManager.setEnabled(false);
            this.wifiLockManager.setEnabled(false);
        } else if (i == 1) {
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(false);
        } else {
            if (i != 2) {
                return;
            }
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(true);
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public com.google.android.exoplayer2.DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return this.deviceInfo;
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public int getDeviceVolume() {
        verifyApplicationThread();
        return this.streamVolumeManager.getVolume();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        return this.streamVolumeManager.isMuted();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceVolume(int i) {
        verifyApplicationThread();
        this.streamVolumeManager.setVolume(i);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        this.streamVolumeManager.increaseVolume();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        this.streamVolumeManager.decreaseVolume();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceMuted(boolean z) {
        verifyApplicationThread();
        this.streamVolumeManager.setMuted(z);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean isTunnelingEnabled() {
        verifyApplicationThread();
        for (com.google.android.exoplayer2.RendererConfiguration rendererConfiguration : this.playbackInfo.trackSelectorResult.rendererConfigurations) {
            if (rendererConfiguration.tunneling) {
                return true;
            }
        }
        return false;
    }

    void setThrowsWhenUsingWrongThread(boolean z) {
        this.throwsWhenUsingWrongThread = z;
    }

    private void stopInternal(boolean z, com.google.android.exoplayer2.ExoPlaybackException exoPlaybackException) {
        com.google.android.exoplayer2.PlaybackInfo copyWithLoadingMediaPeriodId;
        if (z) {
            copyWithLoadingMediaPeriodId = removeMediaItemsInternal(0, this.mediaSourceHolderSnapshots.size()).copyWithPlaybackError(null);
        } else {
            com.google.android.exoplayer2.PlaybackInfo playbackInfo = this.playbackInfo;
            copyWithLoadingMediaPeriodId = playbackInfo.copyWithLoadingMediaPeriodId(playbackInfo.periodId);
            copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
            copyWithLoadingMediaPeriodId.totalBufferedDurationUs = 0L;
        }
        com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackState = copyWithLoadingMediaPeriodId.copyWithPlaybackState(1);
        if (exoPlaybackException != null) {
            copyWithPlaybackState = copyWithPlaybackState.copyWithPlaybackError(exoPlaybackException);
        }
        com.google.android.exoplayer2.PlaybackInfo playbackInfo2 = copyWithPlaybackState;
        this.pendingOperationAcks++;
        this.internalPlayer.stop();
        updatePlaybackInfo(playbackInfo2, 0, 1, false, playbackInfo2.timeline.isEmpty() && !this.playbackInfo.timeline.isEmpty(), 4, getCurrentPositionUsInternal(playbackInfo2), -1, false);
    }

    private int getCurrentWindowIndexInternal() {
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowIndex;
        }
        return this.playbackInfo.timeline.getPeriodByUid(this.playbackInfo.periodId.periodUid, this.period).windowIndex;
    }

    private long getCurrentPositionUsInternal(com.google.android.exoplayer2.PlaybackInfo playbackInfo) {
        if (playbackInfo.timeline.isEmpty()) {
            return com.google.android.exoplayer2.util.Util.msToUs(this.maskingWindowPositionMs);
        }
        if (playbackInfo.periodId.isAd()) {
            return playbackInfo.positionUs;
        }
        return periodPositionUsToWindowPositionUs(playbackInfo.timeline, playbackInfo.periodId, playbackInfo.positionUs);
    }

    private java.util.List<com.google.android.exoplayer2.source.MediaSource> createMediaSources(java.util.List<com.google.android.exoplayer2.MediaItem> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.mediaSourceFactory.createMediaSource(list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handlePlaybackInfo, reason: merged with bridge method [inline-methods] */
    public void m5367lambda$new$1$comgoogleandroidexoplayer2ExoPlayerImpl(com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        long j;
        boolean z;
        this.pendingOperationAcks -= playbackInfoUpdate.operationAcks;
        boolean z2 = true;
        if (playbackInfoUpdate.positionDiscontinuity) {
            this.pendingDiscontinuityReason = playbackInfoUpdate.discontinuityReason;
            this.pendingDiscontinuity = true;
        }
        if (playbackInfoUpdate.hasPlayWhenReadyChangeReason) {
            this.pendingPlayWhenReadyChangeReason = playbackInfoUpdate.playWhenReadyChangeReason;
        }
        if (this.pendingOperationAcks == 0) {
            com.google.android.exoplayer2.Timeline timeline = playbackInfoUpdate.playbackInfo.timeline;
            if (!this.playbackInfo.timeline.isEmpty() && timeline.isEmpty()) {
                this.maskingWindowIndex = -1;
                this.maskingWindowPositionMs = 0L;
                this.maskingPeriodIndex = 0;
            }
            if (!timeline.isEmpty()) {
                java.util.List<com.google.android.exoplayer2.Timeline> childTimelines = ((com.google.android.exoplayer2.PlaylistTimeline) timeline).getChildTimelines();
                com.google.android.exoplayer2.util.Assertions.checkState(childTimelines.size() == this.mediaSourceHolderSnapshots.size());
                for (int i = 0; i < childTimelines.size(); i++) {
                    this.mediaSourceHolderSnapshots.get(i).timeline = childTimelines.get(i);
                }
            }
            long j2 = -9223372036854775807L;
            if (this.pendingDiscontinuity) {
                if (playbackInfoUpdate.playbackInfo.periodId.equals(this.playbackInfo.periodId) && playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs == this.playbackInfo.positionUs) {
                    z2 = false;
                }
                if (z2) {
                    if (timeline.isEmpty() || playbackInfoUpdate.playbackInfo.periodId.isAd()) {
                        j2 = playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs;
                    } else {
                        j2 = periodPositionUsToWindowPositionUs(timeline, playbackInfoUpdate.playbackInfo.periodId, playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs);
                    }
                }
                j = j2;
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.pendingDiscontinuity = false;
            updatePlaybackInfo(playbackInfoUpdate.playbackInfo, 1, this.pendingPlayWhenReadyChangeReason, false, z, this.pendingDiscontinuityReason, j, -1, false);
        }
    }

    private void updatePlaybackInfo(final com.google.android.exoplayer2.PlaybackInfo playbackInfo, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4, boolean z3) {
        com.google.android.exoplayer2.PlaybackInfo playbackInfo2 = this.playbackInfo;
        this.playbackInfo = playbackInfo;
        boolean z4 = !playbackInfo2.timeline.equals(playbackInfo.timeline);
        android.util.Pair<java.lang.Boolean, java.lang.Integer> evaluateMediaItemTransitionReason = evaluateMediaItemTransitionReason(playbackInfo, playbackInfo2, z2, i3, z4, z3);
        boolean booleanValue = ((java.lang.Boolean) evaluateMediaItemTransitionReason.first).booleanValue();
        final int intValue = ((java.lang.Integer) evaluateMediaItemTransitionReason.second).intValue();
        com.google.android.exoplayer2.MediaMetadata mediaMetadata = this.mediaMetadata;
        if (booleanValue) {
            r3 = playbackInfo.timeline.isEmpty() ? null : playbackInfo.timeline.getWindow(playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex, this.window).mediaItem;
            this.staticAndDynamicMediaMetadata = com.google.android.exoplayer2.MediaMetadata.EMPTY;
        }
        if (booleanValue || !playbackInfo2.staticMetadata.equals(playbackInfo.staticMetadata)) {
            this.staticAndDynamicMediaMetadata = this.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(playbackInfo.staticMetadata).build();
            mediaMetadata = buildUpdatedMediaMetadata();
        }
        boolean z5 = !mediaMetadata.equals(this.mediaMetadata);
        this.mediaMetadata = mediaMetadata;
        boolean z6 = playbackInfo2.playWhenReady != playbackInfo.playWhenReady;
        boolean z7 = playbackInfo2.playbackState != playbackInfo.playbackState;
        if (z7 || z6) {
            updateWakeAndWifiLock();
        }
        boolean z8 = playbackInfo2.isLoading != playbackInfo.isLoading;
        if (z8) {
            updatePriorityTaskManagerForIsLoadingChange(playbackInfo.isLoading);
        }
        if (z4) {
            this.listeners.queueEvent(0, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda24
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    com.google.android.exoplayer2.Player.Listener listener = (com.google.android.exoplayer2.Player.Listener) obj;
                    listener.onTimelineChanged(com.google.android.exoplayer2.PlaybackInfo.this.timeline, i);
                }
            });
        }
        if (z2) {
            final com.google.android.exoplayer2.Player.PositionInfo previousPositionInfo = getPreviousPositionInfo(i3, playbackInfo2, i4);
            final com.google.android.exoplayer2.Player.PositionInfo positionInfo = getPositionInfo(j);
            this.listeners.queueEvent(11, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda2
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    com.google.android.exoplayer2.ExoPlayerImpl.lambda$updatePlaybackInfo$13(i3, previousPositionInfo, positionInfo, (com.google.android.exoplayer2.Player.Listener) obj);
                }
            });
        }
        if (booleanValue) {
            this.listeners.queueEvent(1, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda3
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onMediaItemTransition(com.google.android.exoplayer2.MediaItem.this, intValue);
                }
            });
        }
        if (playbackInfo2.playbackError != playbackInfo.playbackError) {
            this.listeners.queueEvent(10, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda4
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onPlayerErrorChanged(com.google.android.exoplayer2.PlaybackInfo.this.playbackError);
                }
            });
            if (playbackInfo.playbackError != null) {
                this.listeners.queueEvent(10, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda5
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        ((com.google.android.exoplayer2.Player.Listener) obj).onPlayerError(com.google.android.exoplayer2.PlaybackInfo.this.playbackError);
                    }
                });
            }
        }
        if (playbackInfo2.trackSelectorResult != playbackInfo.trackSelectorResult) {
            this.trackSelector.onSelectionActivated(playbackInfo.trackSelectorResult.info);
            this.listeners.queueEvent(2, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda6
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onTracksChanged(com.google.android.exoplayer2.PlaybackInfo.this.trackSelectorResult.tracks);
                }
            });
        }
        if (z5) {
            final com.google.android.exoplayer2.MediaMetadata mediaMetadata2 = this.mediaMetadata;
            this.listeners.queueEvent(14, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda7
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata.this);
                }
            });
        }
        if (z8) {
            this.listeners.queueEvent(3, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda8
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    com.google.android.exoplayer2.ExoPlayerImpl.lambda$updatePlaybackInfo$19(com.google.android.exoplayer2.PlaybackInfo.this, (com.google.android.exoplayer2.Player.Listener) obj);
                }
            });
        }
        if (z7 || z6) {
            this.listeners.queueEvent(-1, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda9
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onPlayerStateChanged(r0.playWhenReady, com.google.android.exoplayer2.PlaybackInfo.this.playbackState);
                }
            });
        }
        if (z7) {
            this.listeners.queueEvent(4, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda10
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onPlaybackStateChanged(com.google.android.exoplayer2.PlaybackInfo.this.playbackState);
                }
            });
        }
        if (z6) {
            this.listeners.queueEvent(5, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda25
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    com.google.android.exoplayer2.Player.Listener listener = (com.google.android.exoplayer2.Player.Listener) obj;
                    listener.onPlayWhenReadyChanged(com.google.android.exoplayer2.PlaybackInfo.this.playWhenReady, i2);
                }
            });
        }
        if (playbackInfo2.playbackSuppressionReason != playbackInfo.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda26
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.PlaybackInfo.this.playbackSuppressionReason);
                }
            });
        }
        if (isPlaying(playbackInfo2) != isPlaying(playbackInfo)) {
            this.listeners.queueEvent(7, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda27
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onIsPlayingChanged(com.google.android.exoplayer2.ExoPlayerImpl.isPlaying(com.google.android.exoplayer2.PlaybackInfo.this));
                }
            });
        }
        if (!playbackInfo2.playbackParameters.equals(playbackInfo.playbackParameters)) {
            this.listeners.queueEvent(12, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda28
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackInfo.this.playbackParameters);
                }
            });
        }
        if (z) {
            this.listeners.queueEvent(-1, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda1
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onSeekProcessed();
                }
            });
        }
        updateAvailableCommands();
        this.listeners.flushEvents();
        if (playbackInfo2.sleepingForOffload != playbackInfo.sleepingForOffload) {
            java.util.Iterator<com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener> it = this.audioOffloadListeners.iterator();
            while (it.hasNext()) {
                it.next().onExperimentalSleepingForOffloadChanged(playbackInfo.sleepingForOffload);
            }
        }
    }

    static /* synthetic */ void lambda$updatePlaybackInfo$13(int i, com.google.android.exoplayer2.Player.PositionInfo positionInfo, com.google.android.exoplayer2.Player.PositionInfo positionInfo2, com.google.android.exoplayer2.Player.Listener listener) {
        listener.onPositionDiscontinuity(i);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i);
    }

    static /* synthetic */ void lambda$updatePlaybackInfo$19(com.google.android.exoplayer2.PlaybackInfo playbackInfo, com.google.android.exoplayer2.Player.Listener listener) {
        listener.onLoadingChanged(playbackInfo.isLoading);
        listener.onIsLoadingChanged(playbackInfo.isLoading);
    }

    private com.google.android.exoplayer2.Player.PositionInfo getPreviousPositionInfo(int i, com.google.android.exoplayer2.PlaybackInfo playbackInfo, int i2) {
        int i3;
        java.lang.Object obj;
        com.google.android.exoplayer2.MediaItem mediaItem;
        java.lang.Object obj2;
        int i4;
        long j;
        long requestedContentPositionUs;
        com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
        if (playbackInfo.timeline.isEmpty()) {
            i3 = i2;
            obj = null;
            mediaItem = null;
            obj2 = null;
            i4 = -1;
        } else {
            java.lang.Object obj3 = playbackInfo.periodId.periodUid;
            playbackInfo.timeline.getPeriodByUid(obj3, period);
            int i5 = period.windowIndex;
            int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(obj3);
            java.lang.Object obj4 = playbackInfo.timeline.getWindow(i5, this.window).uid;
            mediaItem = this.window.mediaItem;
            obj2 = obj3;
            i4 = indexOfPeriod;
            obj = obj4;
            i3 = i5;
        }
        if (i == 0) {
            if (playbackInfo.periodId.isAd()) {
                j = period.getAdDurationUs(playbackInfo.periodId.adGroupIndex, playbackInfo.periodId.adIndexInAdGroup);
                requestedContentPositionUs = getRequestedContentPositionUs(playbackInfo);
            } else {
                if (playbackInfo.periodId.nextAdGroupIndex != -1) {
                    j = getRequestedContentPositionUs(this.playbackInfo);
                } else {
                    j = period.positionInWindowUs + period.durationUs;
                }
                requestedContentPositionUs = j;
            }
        } else if (playbackInfo.periodId.isAd()) {
            j = playbackInfo.positionUs;
            requestedContentPositionUs = getRequestedContentPositionUs(playbackInfo);
        } else {
            j = period.positionInWindowUs + playbackInfo.positionUs;
            requestedContentPositionUs = j;
        }
        return new com.google.android.exoplayer2.Player.PositionInfo(obj, i3, mediaItem, obj2, i4, com.google.android.exoplayer2.util.Util.usToMs(j), com.google.android.exoplayer2.util.Util.usToMs(requestedContentPositionUs), playbackInfo.periodId.adGroupIndex, playbackInfo.periodId.adIndexInAdGroup);
    }

    private com.google.android.exoplayer2.Player.PositionInfo getPositionInfo(long j) {
        java.lang.Object obj;
        com.google.android.exoplayer2.MediaItem mediaItem;
        java.lang.Object obj2;
        int i;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (this.playbackInfo.timeline.isEmpty()) {
            obj = null;
            mediaItem = null;
            obj2 = null;
            i = -1;
        } else {
            java.lang.Object obj3 = this.playbackInfo.periodId.periodUid;
            this.playbackInfo.timeline.getPeriodByUid(obj3, this.period);
            i = this.playbackInfo.timeline.getIndexOfPeriod(obj3);
            obj = this.playbackInfo.timeline.getWindow(currentMediaItemIndex, this.window).uid;
            mediaItem = this.window.mediaItem;
            obj2 = obj3;
        }
        long usToMs = com.google.android.exoplayer2.util.Util.usToMs(j);
        return new com.google.android.exoplayer2.Player.PositionInfo(obj, currentMediaItemIndex, mediaItem, obj2, i, usToMs, this.playbackInfo.periodId.isAd() ? com.google.android.exoplayer2.util.Util.usToMs(getRequestedContentPositionUs(this.playbackInfo)) : usToMs, this.playbackInfo.periodId.adGroupIndex, this.playbackInfo.periodId.adIndexInAdGroup);
    }

    private static long getRequestedContentPositionUs(com.google.android.exoplayer2.PlaybackInfo playbackInfo) {
        com.google.android.exoplayer2.Timeline.Window window = new com.google.android.exoplayer2.Timeline.Window();
        com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, period);
        if (playbackInfo.requestedContentPositionUs == -9223372036854775807L) {
            return playbackInfo.timeline.getWindow(period.windowIndex, window).getDefaultPositionUs();
        }
        return period.getPositionInWindowUs() + playbackInfo.requestedContentPositionUs;
    }

    private android.util.Pair<java.lang.Boolean, java.lang.Integer> evaluateMediaItemTransitionReason(com.google.android.exoplayer2.PlaybackInfo playbackInfo, com.google.android.exoplayer2.PlaybackInfo playbackInfo2, boolean z, int i, boolean z2, boolean z3) {
        com.google.android.exoplayer2.Timeline timeline = playbackInfo2.timeline;
        com.google.android.exoplayer2.Timeline timeline2 = playbackInfo.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return new android.util.Pair<>(false, -1);
        }
        int i2 = 3;
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return new android.util.Pair<>(true, 3);
        }
        if (timeline.getWindow(timeline.getPeriodByUid(playbackInfo2.periodId.periodUid, this.period).windowIndex, this.window).uid.equals(timeline2.getWindow(timeline2.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex, this.window).uid)) {
            if (z && i == 0 && playbackInfo2.periodId.windowSequenceNumber < playbackInfo.periodId.windowSequenceNumber) {
                return new android.util.Pair<>(true, 0);
            }
            if (z && i == 1 && z3) {
                return new android.util.Pair<>(true, 2);
            }
            return new android.util.Pair<>(false, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new java.lang.IllegalStateException();
        }
        return new android.util.Pair<>(true, java.lang.Integer.valueOf(i2));
    }

    private void updateAvailableCommands() {
        com.google.android.exoplayer2.Player.Commands commands = this.availableCommands;
        com.google.android.exoplayer2.Player.Commands availableCommands = com.google.android.exoplayer2.util.Util.getAvailableCommands(this.wrappingPlayer, this.permanentAvailableCommands);
        this.availableCommands = availableCommands;
        if (availableCommands.equals(commands)) {
            return;
        }
        this.listeners.queueEvent(13, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda20
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                com.google.android.exoplayer2.ExoPlayerImpl.this.m5370xf07a34c4((com.google.android.exoplayer2.Player.Listener) obj);
            }
        });
    }

    /* renamed from: lambda$updateAvailableCommands$26$com-google-android-exoplayer2-ExoPlayerImpl, reason: not valid java name */
    /* synthetic */ void m5370xf07a34c4(com.google.android.exoplayer2.Player.Listener listener) {
        listener.onAvailableCommandsChanged(this.availableCommands);
    }

    private void setMediaSourcesInternal(java.util.List<com.google.android.exoplayer2.source.MediaSource> list, int i, long j, boolean z) {
        int i2;
        long j2;
        int currentWindowIndexInternal = getCurrentWindowIndexInternal();
        long currentPosition = getCurrentPosition();
        this.pendingOperationAcks++;
        if (!this.mediaSourceHolderSnapshots.isEmpty()) {
            removeMediaSourceHolders(0, this.mediaSourceHolderSnapshots.size());
        }
        java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> addMediaSourceHolders = addMediaSourceHolders(0, list);
        com.google.android.exoplayer2.Timeline createMaskingTimeline = createMaskingTimeline();
        if (!createMaskingTimeline.isEmpty() && i >= createMaskingTimeline.getWindowCount()) {
            throw new com.google.android.exoplayer2.IllegalSeekPositionException(createMaskingTimeline, i, j);
        }
        if (z) {
            j2 = -9223372036854775807L;
            i2 = createMaskingTimeline.getFirstWindowIndex(this.shuffleModeEnabled);
        } else if (i == -1) {
            i2 = currentWindowIndexInternal;
            j2 = currentPosition;
        } else {
            i2 = i;
            j2 = j;
        }
        com.google.android.exoplayer2.PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(createMaskingTimeline, i2, j2));
        int i3 = maskTimelineAndPosition.playbackState;
        if (i2 != -1 && maskTimelineAndPosition.playbackState != 1) {
            i3 = (createMaskingTimeline.isEmpty() || i2 >= createMaskingTimeline.getWindowCount()) ? 4 : 2;
        }
        com.google.android.exoplayer2.PlaybackInfo copyWithPlaybackState = maskTimelineAndPosition.copyWithPlaybackState(i3);
        this.internalPlayer.setMediaSources(addMediaSourceHolders, i2, com.google.android.exoplayer2.util.Util.msToUs(j2), this.shuffleOrder);
        updatePlaybackInfo(copyWithPlaybackState, 0, 1, false, (this.playbackInfo.periodId.periodUid.equals(copyWithPlaybackState.periodId.periodUid) || this.playbackInfo.timeline.isEmpty()) ? false : true, 4, getCurrentPositionUsInternal(copyWithPlaybackState), -1, false);
    }

    private java.util.List<com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder> addMediaSourceHolders(int i, java.util.List<com.google.android.exoplayer2.source.MediaSource> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder mediaSourceHolder = new com.google.android.exoplayer2.MediaSourceList.MediaSourceHolder(list.get(i2), this.useLazyPreparation);
            arrayList.add(mediaSourceHolder);
            this.mediaSourceHolderSnapshots.add(i2 + i, new com.google.android.exoplayer2.ExoPlayerImpl.MediaSourceHolderSnapshot(mediaSourceHolder.uid, mediaSourceHolder.mediaSource.getTimeline()));
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndInsert(i, arrayList.size());
        return arrayList;
    }

    private com.google.android.exoplayer2.PlaybackInfo removeMediaItemsInternal(int i, int i2) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(i >= 0 && i2 >= i && i2 <= this.mediaSourceHolderSnapshots.size());
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        com.google.android.exoplayer2.Timeline currentTimeline = getCurrentTimeline();
        int size = this.mediaSourceHolderSnapshots.size();
        this.pendingOperationAcks++;
        removeMediaSourceHolders(i, i2);
        com.google.android.exoplayer2.Timeline createMaskingTimeline = createMaskingTimeline();
        com.google.android.exoplayer2.PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, createMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(currentTimeline, createMaskingTimeline));
        if (maskTimelineAndPosition.playbackState != 1 && maskTimelineAndPosition.playbackState != 4 && i < i2 && i2 == size && currentMediaItemIndex >= maskTimelineAndPosition.timeline.getWindowCount()) {
            maskTimelineAndPosition = maskTimelineAndPosition.copyWithPlaybackState(4);
        }
        this.internalPlayer.removeMediaSources(i, i2, this.shuffleOrder);
        return maskTimelineAndPosition;
    }

    private void removeMediaSourceHolders(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.mediaSourceHolderSnapshots.remove(i3);
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i, i2);
    }

    private com.google.android.exoplayer2.Timeline createMaskingTimeline() {
        return new com.google.android.exoplayer2.PlaylistTimeline(this.mediaSourceHolderSnapshots, this.shuffleOrder);
    }

    private com.google.android.exoplayer2.PlaybackInfo maskTimelineAndPosition(com.google.android.exoplayer2.PlaybackInfo playbackInfo, com.google.android.exoplayer2.Timeline timeline, android.util.Pair<java.lang.Object, java.lang.Long> pair) {
        long j;
        com.google.android.exoplayer2.util.Assertions.checkArgument(timeline.isEmpty() || pair != null);
        com.google.android.exoplayer2.Timeline timeline2 = playbackInfo.timeline;
        com.google.android.exoplayer2.PlaybackInfo copyWithTimeline = playbackInfo.copyWithTimeline(timeline);
        if (timeline.isEmpty()) {
            com.google.android.exoplayer2.source.MediaSource.MediaPeriodId dummyPeriodForEmptyTimeline = com.google.android.exoplayer2.PlaybackInfo.getDummyPeriodForEmptyTimeline();
            long msToUs = com.google.android.exoplayer2.util.Util.msToUs(this.maskingWindowPositionMs);
            com.google.android.exoplayer2.PlaybackInfo copyWithLoadingMediaPeriodId = copyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, msToUs, msToUs, msToUs, 0L, com.google.android.exoplayer2.source.TrackGroupArray.EMPTY, this.emptyTrackSelectorResult, com.google.common.collect.ImmutableList.of()).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            copyWithLoadingMediaPeriodId.bufferedPositionUs = copyWithLoadingMediaPeriodId.positionUs;
            return copyWithLoadingMediaPeriodId;
        }
        java.lang.Object obj = copyWithTimeline.periodId.periodUid;
        boolean z = !obj.equals(((android.util.Pair) com.google.android.exoplayer2.util.Util.castNonNull(pair)).first);
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = z ? new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(pair.first) : copyWithTimeline.periodId;
        long longValue = ((java.lang.Long) pair.second).longValue();
        long msToUs2 = com.google.android.exoplayer2.util.Util.msToUs(getContentPosition());
        if (!timeline2.isEmpty()) {
            msToUs2 -= timeline2.getPeriodByUid(obj, this.period).getPositionInWindowUs();
        }
        if (z || longValue < msToUs2) {
            com.google.android.exoplayer2.util.Assertions.checkState(!mediaPeriodId.isAd());
            com.google.android.exoplayer2.PlaybackInfo copyWithLoadingMediaPeriodId2 = copyWithTimeline.copyWithNewPosition(mediaPeriodId, longValue, longValue, longValue, 0L, z ? com.google.android.exoplayer2.source.TrackGroupArray.EMPTY : copyWithTimeline.trackGroups, z ? this.emptyTrackSelectorResult : copyWithTimeline.trackSelectorResult, z ? com.google.common.collect.ImmutableList.of() : copyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId);
            copyWithLoadingMediaPeriodId2.bufferedPositionUs = longValue;
            return copyWithLoadingMediaPeriodId2;
        }
        if (longValue == msToUs2) {
            int indexOfPeriod = timeline.getIndexOfPeriod(copyWithTimeline.loadingMediaPeriodId.periodUid);
            if (indexOfPeriod == -1 || timeline.getPeriod(indexOfPeriod, this.period).windowIndex != timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex) {
                timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
                if (mediaPeriodId.isAd()) {
                    j = this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
                } else {
                    j = this.period.durationUs;
                }
                copyWithTimeline = copyWithTimeline.copyWithNewPosition(mediaPeriodId, copyWithTimeline.positionUs, copyWithTimeline.positionUs, copyWithTimeline.discontinuityStartPositionUs, j - copyWithTimeline.positionUs, copyWithTimeline.trackGroups, copyWithTimeline.trackSelectorResult, copyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId);
                copyWithTimeline.bufferedPositionUs = j;
            }
        } else {
            com.google.android.exoplayer2.util.Assertions.checkState(!mediaPeriodId.isAd());
            long max = java.lang.Math.max(0L, copyWithTimeline.totalBufferedDurationUs - (longValue - msToUs2));
            long j2 = copyWithTimeline.bufferedPositionUs;
            if (copyWithTimeline.loadingMediaPeriodId.equals(copyWithTimeline.periodId)) {
                j2 = longValue + max;
            }
            copyWithTimeline = copyWithTimeline.copyWithNewPosition(mediaPeriodId, longValue, longValue, longValue, max, copyWithTimeline.trackGroups, copyWithTimeline.trackSelectorResult, copyWithTimeline.staticMetadata);
            copyWithTimeline.bufferedPositionUs = j2;
        }
        return copyWithTimeline;
    }

    private android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPositionUsAfterTimelineChanged(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.Timeline timeline2) {
        long contentPosition = getContentPosition();
        if (timeline.isEmpty() || timeline2.isEmpty()) {
            boolean z = !timeline.isEmpty() && timeline2.isEmpty();
            int currentWindowIndexInternal = z ? -1 : getCurrentWindowIndexInternal();
            if (z) {
                contentPosition = -9223372036854775807L;
            }
            return maskWindowPositionMsOrGetPeriodPositionUs(timeline2, currentWindowIndexInternal, contentPosition);
        }
        android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, getCurrentMediaItemIndex(), com.google.android.exoplayer2.util.Util.msToUs(contentPosition));
        java.lang.Object obj = ((android.util.Pair) com.google.android.exoplayer2.util.Util.castNonNull(periodPositionUs)).first;
        if (timeline2.getIndexOfPeriod(obj) != -1) {
            return periodPositionUs;
        }
        java.lang.Object resolveSubsequentPeriod = com.google.android.exoplayer2.ExoPlayerImplInternal.resolveSubsequentPeriod(this.window, this.period, this.repeatMode, this.shuffleModeEnabled, obj, timeline, timeline2);
        if (resolveSubsequentPeriod != null) {
            timeline2.getPeriodByUid(resolveSubsequentPeriod, this.period);
            return maskWindowPositionMsOrGetPeriodPositionUs(timeline2, this.period.windowIndex, timeline2.getWindow(this.period.windowIndex, this.window).getDefaultPositionMs());
        }
        return maskWindowPositionMsOrGetPeriodPositionUs(timeline2, -1, -9223372036854775807L);
    }

    private android.util.Pair<java.lang.Object, java.lang.Long> maskWindowPositionMsOrGetPeriodPositionUs(com.google.android.exoplayer2.Timeline timeline, int i, long j) {
        if (timeline.isEmpty()) {
            this.maskingWindowIndex = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.maskingWindowPositionMs = j;
            this.maskingPeriodIndex = 0;
            return null;
        }
        if (i == -1 || i >= timeline.getWindowCount()) {
            i = timeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j = timeline.getWindow(i, this.window).getDefaultPositionMs();
        }
        return timeline.getPeriodPositionUs(this.window, this.period, i, com.google.android.exoplayer2.util.Util.msToUs(j));
    }

    private long periodPositionUsToWindowPositionUs(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return j + this.period.getPositionInWindowUs();
    }

    private com.google.android.exoplayer2.PlayerMessage createMessageInternal(com.google.android.exoplayer2.PlayerMessage.Target target) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal();
        return new com.google.android.exoplayer2.PlayerMessage(this.internalPlayer, target, this.playbackInfo.timeline, currentWindowIndexInternal == -1 ? 0 : currentWindowIndexInternal, this.clock, this.internalPlayer.getPlaybackLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.exoplayer2.MediaMetadata buildUpdatedMediaMetadata() {
        com.google.android.exoplayer2.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.staticAndDynamicMediaMetadata;
        }
        return this.staticAndDynamicMediaMetadata.buildUpon().populate(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem.mediaMetadata).build();
    }

    private void removeSurfaceCallbacks() {
        if (this.sphericalGLSurfaceView != null) {
            createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(null).send();
            this.sphericalGLSurfaceView.removeVideoSurfaceListener(this.componentListener);
            this.sphericalGLSurfaceView = null;
        }
        android.view.TextureView textureView = this.textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.componentListener) {
                com.google.android.exoplayer2.util.Log.w(TAG, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.textureView.setSurfaceTextureListener(null);
            }
            this.textureView = null;
        }
        android.view.SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.componentListener);
            this.surfaceHolder = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfaceTextureInternal(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        setVideoOutputInternal(surface);
        this.ownedSurface = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoOutputInternal(java.lang.Object obj) {
        boolean z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.exoplayer2.Renderer[] rendererArr = this.renderers;
        int length = rendererArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            com.google.android.exoplayer2.Renderer renderer = rendererArr[i];
            if (renderer.getTrackType() == 2) {
                arrayList.add(createMessageInternal(renderer).setType(1).setPayload(obj).send());
            }
            i++;
        }
        java.lang.Object obj2 = this.videoOutput;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.google.android.exoplayer2.PlayerMessage) it.next()).blockUntilDelivered(this.detachSurfaceTimeoutMs);
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.TimeoutException unused2) {
            }
            z = false;
            java.lang.Object obj3 = this.videoOutput;
            android.view.Surface surface = this.ownedSurface;
            if (obj3 == surface) {
                surface.release();
                this.ownedSurface = null;
            }
        }
        this.videoOutput = obj;
        if (z) {
            stopInternal(false, com.google.android.exoplayer2.ExoPlaybackException.createForUnexpected(new com.google.android.exoplayer2.ExoTimeoutException(3), 1003));
        }
    }

    private void setNonVideoOutputSurfaceHolderInternal(android.view.SurfaceHolder surfaceHolder) {
        this.surfaceHolderSurfaceIsVideoOutput = false;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        android.view.Surface surface = this.surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            android.graphics.Rect surfaceFrame = this.surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        } else {
            maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifySurfaceSizeChanged(final int i, final int i2) {
        if (i == this.surfaceSize.getWidth() && i2 == this.surfaceSize.getHeight()) {
            return;
        }
        this.surfaceSize = new com.google.android.exoplayer2.util.Size(i, i2);
        this.listeners.sendEvent(24, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda19
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((com.google.android.exoplayer2.Player.Listener) obj).onSurfaceSizeChanged(i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendVolumeToRenderers() {
        sendRendererMessage(1, 2, java.lang.Float.valueOf(this.volume * this.audioFocusManager.getVolumeMultiplier()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayWhenReady(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        if (this.playbackInfo.playWhenReady == z2 && this.playbackInfo.playbackSuppressionReason == i3) {
            return;
        }
        this.pendingOperationAcks++;
        com.google.android.exoplayer2.PlaybackInfo copyWithPlayWhenReady = this.playbackInfo.copyWithPlayWhenReady(z2, i3);
        this.internalPlayer.setPlayWhenReady(z2, i3);
        updatePlaybackInfo(copyWithPlayWhenReady, 0, i2, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWakeAndWifiLock() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.wakeLockManager.setStayAwake(getPlayWhenReady() && !experimentalIsSleepingForOffload());
                this.wifiLockManager.setStayAwake(getPlayWhenReady());
                return;
            } else if (playbackState != 4) {
                throw new java.lang.IllegalStateException();
            }
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
    }

    private void verifyApplicationThread() {
        this.constructorFinished.blockUninterruptible();
        if (java.lang.Thread.currentThread() != getApplicationLooper().getThread()) {
            java.lang.String formatInvariant = com.google.android.exoplayer2.util.Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", java.lang.Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.throwsWhenUsingWrongThread) {
                throw new java.lang.IllegalStateException(formatInvariant);
            }
            com.google.android.exoplayer2.util.Log.w(TAG, formatInvariant, this.hasNotifiedFullWrongThreadWarning ? null : new java.lang.IllegalStateException());
            this.hasNotifiedFullWrongThreadWarning = true;
        }
    }

    private void sendRendererMessage(int i, int i2, java.lang.Object obj) {
        for (com.google.android.exoplayer2.Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == i) {
                createMessageInternal(renderer).setType(i2).setPayload(obj).send();
            }
        }
    }

    private int initializeKeepSessionIdAudioTrack(int i) {
        android.media.AudioTrack audioTrack = this.keepSessionIdAudioTrack;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.keepSessionIdAudioTrack.release();
            this.keepSessionIdAudioTrack = null;
        }
        if (this.keepSessionIdAudioTrack == null) {
            this.keepSessionIdAudioTrack = new android.media.AudioTrack(3, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, 4, 2, 2, 0, i);
        }
        return this.keepSessionIdAudioTrack.getAudioSessionId();
    }

    private void updatePriorityTaskManagerForIsLoadingChange(boolean z) {
        com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            if (z && !this.isPriorityTaskManagerRegistered) {
                priorityTaskManager.add(0);
                this.isPriorityTaskManagerRegistered = true;
            } else {
                if (z || !this.isPriorityTaskManagerRegistered) {
                    return;
                }
                priorityTaskManager.remove(0);
                this.isPriorityTaskManagerRegistered = false;
            }
        }
    }

    private void seekToInternal(int i, long j, boolean z) {
        this.analyticsCollector.notifySeekStarted();
        com.google.android.exoplayer2.Timeline timeline = this.playbackInfo.timeline;
        if (i < 0 || (!timeline.isEmpty() && i >= timeline.getWindowCount())) {
            throw new com.google.android.exoplayer2.IllegalSeekPositionException(timeline, i, j);
        }
        this.pendingOperationAcks++;
        if (isPlayingAd()) {
            com.google.android.exoplayer2.util.Log.w(TAG, "seekTo ignored because an ad is playing");
            com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
            playbackInfoUpdate.incrementPendingOperationAcks(1);
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(playbackInfoUpdate);
            return;
        }
        int i2 = getPlaybackState() != 1 ? 2 : 1;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        com.google.android.exoplayer2.PlaybackInfo maskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo.copyWithPlaybackState(i2), timeline, maskWindowPositionMsOrGetPeriodPositionUs(timeline, i, j));
        this.internalPlayer.seekTo(timeline, i, com.google.android.exoplayer2.util.Util.msToUs(j));
        updatePlaybackInfo(maskTimelineAndPosition, 0, 1, true, true, 1, getCurrentPositionUsInternal(maskTimelineAndPosition), currentMediaItemIndex, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.DeviceInfo createDeviceInfo(com.google.android.exoplayer2.StreamVolumeManager streamVolumeManager) {
        return new com.google.android.exoplayer2.DeviceInfo(0, streamVolumeManager.getMinVolume(), streamVolumeManager.getMaxVolume());
    }

    private static boolean isPlaying(com.google.android.exoplayer2.PlaybackInfo playbackInfo) {
        return playbackInfo.playbackState == 3 && playbackInfo.playWhenReady && playbackInfo.playbackSuppressionReason == 0;
    }

    private static final class MediaSourceHolderSnapshot implements com.google.android.exoplayer2.MediaSourceInfoHolder {
        private com.google.android.exoplayer2.Timeline timeline;
        private final java.lang.Object uid;

        public MediaSourceHolderSnapshot(java.lang.Object obj, com.google.android.exoplayer2.Timeline timeline) {
            this.uid = obj;
            this.timeline = timeline;
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public java.lang.Object getUid() {
            return this.uid;
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public com.google.android.exoplayer2.Timeline getTimeline() {
            return this.timeline;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ComponentListener implements com.google.android.exoplayer2.video.VideoRendererEventListener, com.google.android.exoplayer2.audio.AudioRendererEventListener, com.google.android.exoplayer2.text.TextOutput, com.google.android.exoplayer2.metadata.MetadataOutput, android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener, com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener, com.google.android.exoplayer2.AudioFocusManager.PlayerControl, com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener, com.google.android.exoplayer2.StreamVolumeManager.Listener, com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener {
        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioInputFormatChanged(com.google.android.exoplayer2.Format format) {
            com.google.android.exoplayer2.audio.AudioRendererEventListener.CC.$default$onAudioInputFormatChanged(this, format);
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
            com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener.CC.$default$onExperimentalOffloadSchedulingEnabledChanged(this, z);
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public /* synthetic */ void onExperimentalOffloadedPlayback(boolean z) {
            com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener.CC.$default$onExperimentalOffloadedPlayback(this, z);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoInputFormatChanged(com.google.android.exoplayer2.Format format) {
            com.google.android.exoplayer2.video.VideoRendererEventListener.CC.$default$onVideoInputFormatChanged(this, format);
        }

        private ComponentListener() {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoEnabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.videoDecoderCounters = decoderCounters;
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onVideoEnabled(decoderCounters);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(java.lang.String str, long j, long j2) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onVideoDecoderInitialized(str, j, j2);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.videoFormat = format;
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onDroppedFrames(int i, long j) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onDroppedFrames(i, j);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoSizeChanged(final com.google.android.exoplayer2.video.VideoSize videoSize) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.videoSize = videoSize;
            com.google.android.exoplayer2.ExoPlayerImpl.this.listeners.sendEvent(25, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda8
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize.this);
                }
            });
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onRenderedFirstFrame(java.lang.Object obj, long j) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onRenderedFirstFrame(obj, j);
            if (com.google.android.exoplayer2.ExoPlayerImpl.this.videoOutput == obj) {
                com.google.android.exoplayer2.ExoPlayerImpl.this.listeners.sendEvent(26, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda4
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj2) {
                        ((com.google.android.exoplayer2.Player.Listener) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderReleased(java.lang.String str) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onVideoDecoderReleased(str);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDisabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onVideoDisabled(decoderCounters);
            com.google.android.exoplayer2.ExoPlayerImpl.this.videoFormat = null;
            com.google.android.exoplayer2.ExoPlayerImpl.this.videoDecoderCounters = null;
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long j, int i) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onVideoFrameProcessingOffset(j, i);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoCodecError(java.lang.Exception exc) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onVideoCodecError(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioEnabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.audioDecoderCounters = decoderCounters;
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onAudioEnabled(decoderCounters);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(java.lang.String str, long j, long j2) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onAudioDecoderInitialized(str, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.audioFormat = format;
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long j) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onAudioPositionAdvancing(j);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioUnderrun(int i, long j, long j2) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onAudioUnderrun(i, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(java.lang.String str) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onAudioDecoderReleased(str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDisabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onAudioDisabled(decoderCounters);
            com.google.android.exoplayer2.ExoPlayerImpl.this.audioFormat = null;
            com.google.android.exoplayer2.ExoPlayerImpl.this.audioDecoderCounters = null;
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(final boolean z) {
            if (com.google.android.exoplayer2.ExoPlayerImpl.this.skipSilenceEnabled == z) {
                return;
            }
            com.google.android.exoplayer2.ExoPlayerImpl.this.skipSilenceEnabled = z;
            com.google.android.exoplayer2.ExoPlayerImpl.this.listeners.sendEvent(23, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda6
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onSkipSilenceEnabledChanged(z);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioSinkError(java.lang.Exception exc) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onAudioSinkError(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioCodecError(java.lang.Exception exc) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.analyticsCollector.onAudioCodecError(exc);
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(final java.util.List<com.google.android.exoplayer2.text.Cue> list) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.listeners.sendEvent(27, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onCues((java.util.List<com.google.android.exoplayer2.text.Cue>) list);
                }
            });
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(final com.google.android.exoplayer2.text.CueGroup cueGroup) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.currentCueGroup = cueGroup;
            com.google.android.exoplayer2.ExoPlayerImpl.this.listeners.sendEvent(27, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda1
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onCues(com.google.android.exoplayer2.text.CueGroup.this);
                }
            });
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataOutput
        public void onMetadata(final com.google.android.exoplayer2.metadata.Metadata metadata) {
            com.google.android.exoplayer2.ExoPlayerImpl exoPlayerImpl = com.google.android.exoplayer2.ExoPlayerImpl.this;
            exoPlayerImpl.staticAndDynamicMediaMetadata = exoPlayerImpl.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(metadata).build();
            com.google.android.exoplayer2.MediaMetadata buildUpdatedMediaMetadata = com.google.android.exoplayer2.ExoPlayerImpl.this.buildUpdatedMediaMetadata();
            if (!buildUpdatedMediaMetadata.equals(com.google.android.exoplayer2.ExoPlayerImpl.this.mediaMetadata)) {
                com.google.android.exoplayer2.ExoPlayerImpl.this.mediaMetadata = buildUpdatedMediaMetadata;
                com.google.android.exoplayer2.ExoPlayerImpl.this.listeners.queueEvent(14, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda2
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        com.google.android.exoplayer2.ExoPlayerImpl.ComponentListener.this.m5371x842d3c8f((com.google.android.exoplayer2.Player.Listener) obj);
                    }
                });
            }
            com.google.android.exoplayer2.ExoPlayerImpl.this.listeners.queueEvent(28, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda3
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onMetadata(com.google.android.exoplayer2.metadata.Metadata.this);
                }
            });
            com.google.android.exoplayer2.ExoPlayerImpl.this.listeners.flushEvents();
        }

        /* renamed from: lambda$onMetadata$4$com-google-android-exoplayer2-ExoPlayerImpl$ComponentListener, reason: not valid java name */
        /* synthetic */ void m5371x842d3c8f(com.google.android.exoplayer2.Player.Listener listener) {
            listener.onMediaMetadataChanged(com.google.android.exoplayer2.ExoPlayerImpl.this.mediaMetadata);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
            if (com.google.android.exoplayer2.ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                com.google.android.exoplayer2.ExoPlayerImpl.this.setVideoOutputInternal(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
            if (com.google.android.exoplayer2.ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                com.google.android.exoplayer2.ExoPlayerImpl.this.setVideoOutputInternal(null);
            }
            com.google.android.exoplayer2.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.setSurfaceTextureInternal(surfaceTexture);
            com.google.android.exoplayer2.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.setVideoOutputInternal(null);
            com.google.android.exoplayer2.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
            return true;
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(android.view.Surface surface) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.setVideoOutputInternal(surface);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(android.view.Surface surface) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.setVideoOutputInternal(null);
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void setVolumeMultiplier(float f) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.sendVolumeToRenderers();
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void executePlayerCommand(int i) {
            boolean playWhenReady = com.google.android.exoplayer2.ExoPlayerImpl.this.getPlayWhenReady();
            com.google.android.exoplayer2.ExoPlayerImpl.this.updatePlayWhenReady(playWhenReady, i, com.google.android.exoplayer2.ExoPlayerImpl.getPlayWhenReadyChangeReason(playWhenReady, i));
        }

        @Override // com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener
        public void onAudioBecomingNoisy() {
            com.google.android.exoplayer2.ExoPlayerImpl.this.updatePlayWhenReady(false, -1, 3);
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int i) {
            final com.google.android.exoplayer2.DeviceInfo createDeviceInfo = com.google.android.exoplayer2.ExoPlayerImpl.createDeviceInfo(com.google.android.exoplayer2.ExoPlayerImpl.this.streamVolumeManager);
            if (createDeviceInfo.equals(com.google.android.exoplayer2.ExoPlayerImpl.this.deviceInfo)) {
                return;
            }
            com.google.android.exoplayer2.ExoPlayerImpl.this.deviceInfo = createDeviceInfo;
            com.google.android.exoplayer2.ExoPlayerImpl.this.listeners.sendEvent(29, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda7
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onDeviceInfoChanged(com.google.android.exoplayer2.DeviceInfo.this);
                }
            });
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(final int i, final boolean z) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.listeners.sendEvent(30, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda5
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onDeviceVolumeChanged(i, z);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public void onExperimentalSleepingForOffloadChanged(boolean z) {
            com.google.android.exoplayer2.ExoPlayerImpl.this.updateWakeAndWifiLock();
        }
    }

    private static final class FrameMetadataListener implements com.google.android.exoplayer2.video.VideoFrameMetadataListener, com.google.android.exoplayer2.video.spherical.CameraMotionListener, com.google.android.exoplayer2.PlayerMessage.Target {
        public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
        public static final int MSG_SET_SPHERICAL_SURFACE_VIEW = 10000;
        public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;
        private com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener;
        private com.google.android.exoplayer2.video.spherical.CameraMotionListener internalCameraMotionListener;
        private com.google.android.exoplayer2.video.VideoFrameMetadataListener internalVideoFrameMetadataListener;
        private com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener;

        private FrameMetadataListener() {
        }

        @Override // com.google.android.exoplayer2.PlayerMessage.Target
        public void handleMessage(int i, java.lang.Object obj) {
            if (i == 7) {
                this.videoFrameMetadataListener = (com.google.android.exoplayer2.video.VideoFrameMetadataListener) obj;
                return;
            }
            if (i == 8) {
                this.cameraMotionListener = (com.google.android.exoplayer2.video.spherical.CameraMotionListener) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView sphericalGLSurfaceView = (com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.internalVideoFrameMetadataListener = null;
                this.internalCameraMotionListener = null;
            } else {
                this.internalVideoFrameMetadataListener = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.internalCameraMotionListener = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long j, long j2, com.google.android.exoplayer2.Format format, android.media.MediaFormat mediaFormat) {
            com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener = this.internalVideoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format, mediaFormat);
            }
            com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener2 = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.onVideoFrameAboutToBeRendered(j, j2, format, mediaFormat);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotion(long j, float[] fArr) {
            com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotion(j, fArr);
            }
            com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotion(j, fArr);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
            com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotionReset();
            }
            com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotionReset();
            }
        }
    }

    private static final class Api31 {
        private Api31() {
        }

        public static com.google.android.exoplayer2.analytics.PlayerId registerMediaMetricsListener(android.content.Context context, com.google.android.exoplayer2.ExoPlayerImpl exoPlayerImpl, boolean z) {
            com.google.android.exoplayer2.analytics.MediaMetricsListener create = com.google.android.exoplayer2.analytics.MediaMetricsListener.create(context);
            if (create == null) {
                com.google.android.exoplayer2.util.Log.w(com.google.android.exoplayer2.ExoPlayerImpl.TAG, "MediaMetricsService unavailable.");
                return new com.google.android.exoplayer2.analytics.PlayerId(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z) {
                exoPlayerImpl.addAnalyticsListener(create);
            }
            return new com.google.android.exoplayer2.analytics.PlayerId(create.getLogSessionId());
        }
    }
}
