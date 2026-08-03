package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public interface ExoPlayer extends com.google.android.exoplayer2.Player {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @java.lang.Deprecated
    public interface AudioComponent {
        @java.lang.Deprecated
        void clearAuxEffectInfo();

        @java.lang.Deprecated
        com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes();

        @java.lang.Deprecated
        int getAudioSessionId();

        @java.lang.Deprecated
        boolean getSkipSilenceEnabled();

        @java.lang.Deprecated
        float getVolume();

        @java.lang.Deprecated
        void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, boolean z);

        @java.lang.Deprecated
        void setAudioSessionId(int i);

        @java.lang.Deprecated
        void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo auxEffectInfo);

        @java.lang.Deprecated
        void setSkipSilenceEnabled(boolean z);

        @java.lang.Deprecated
        void setVolume(float f);
    }

    public interface AudioOffloadListener {

        /* renamed from: com.google.android.exoplayer2.ExoPlayer$AudioOffloadListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onExperimentalOffloadSchedulingEnabledChanged(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener _this, boolean z) {
            }

            public static void $default$onExperimentalOffloadedPlayback(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener _this, boolean z) {
            }

            public static void $default$onExperimentalSleepingForOffloadChanged(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener _this, boolean z) {
            }
        }

        void onExperimentalOffloadSchedulingEnabledChanged(boolean z);

        void onExperimentalOffloadedPlayback(boolean z);

        void onExperimentalSleepingForOffloadChanged(boolean z);
    }

    @java.lang.Deprecated
    public interface DeviceComponent {
        @java.lang.Deprecated
        void decreaseDeviceVolume();

        @java.lang.Deprecated
        com.google.android.exoplayer2.DeviceInfo getDeviceInfo();

        @java.lang.Deprecated
        int getDeviceVolume();

        @java.lang.Deprecated
        void increaseDeviceVolume();

        @java.lang.Deprecated
        boolean isDeviceMuted();

        @java.lang.Deprecated
        void setDeviceMuted(boolean z);

        @java.lang.Deprecated
        void setDeviceVolume(int i);
    }

    @java.lang.Deprecated
    public interface TextComponent {
        @java.lang.Deprecated
        com.google.android.exoplayer2.text.CueGroup getCurrentCues();
    }

    @java.lang.Deprecated
    public interface VideoComponent {
        @java.lang.Deprecated
        void clearCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener);

        @java.lang.Deprecated
        void clearVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener);

        @java.lang.Deprecated
        void clearVideoSurface();

        @java.lang.Deprecated
        void clearVideoSurface(android.view.Surface surface);

        @java.lang.Deprecated
        void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

        @java.lang.Deprecated
        void clearVideoSurfaceView(android.view.SurfaceView surfaceView);

        @java.lang.Deprecated
        void clearVideoTextureView(android.view.TextureView textureView);

        @java.lang.Deprecated
        int getVideoChangeFrameRateStrategy();

        @java.lang.Deprecated
        int getVideoScalingMode();

        @java.lang.Deprecated
        com.google.android.exoplayer2.video.VideoSize getVideoSize();

        @java.lang.Deprecated
        void setCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener);

        @java.lang.Deprecated
        void setVideoChangeFrameRateStrategy(int i);

        @java.lang.Deprecated
        void setVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener);

        @java.lang.Deprecated
        void setVideoScalingMode(int i);

        @java.lang.Deprecated
        void setVideoSurface(android.view.Surface surface);

        @java.lang.Deprecated
        void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

        @java.lang.Deprecated
        void setVideoSurfaceView(android.view.SurfaceView surfaceView);

        @java.lang.Deprecated
        void setVideoTextureView(android.view.TextureView textureView);
    }

    void addAnalyticsListener(com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener);

    void addAudioOffloadListener(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener audioOffloadListener);

    void addMediaSource(int i, com.google.android.exoplayer2.source.MediaSource mediaSource);

    void addMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource);

    void addMediaSources(int i, java.util.List<com.google.android.exoplayer2.source.MediaSource> list);

    void addMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener);

    void clearVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener);

    com.google.android.exoplayer2.PlayerMessage createMessage(com.google.android.exoplayer2.PlayerMessage.Target target);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z);

    com.google.android.exoplayer2.analytics.AnalyticsCollector getAnalyticsCollector();

    @java.lang.Deprecated
    com.google.android.exoplayer2.ExoPlayer.AudioComponent getAudioComponent();

    com.google.android.exoplayer2.decoder.DecoderCounters getAudioDecoderCounters();

    com.google.android.exoplayer2.Format getAudioFormat();

    int getAudioSessionId();

    com.google.android.exoplayer2.util.Clock getClock();

    @java.lang.Deprecated
    com.google.android.exoplayer2.source.TrackGroupArray getCurrentTrackGroups();

    @java.lang.Deprecated
    com.google.android.exoplayer2.trackselection.TrackSelectionArray getCurrentTrackSelections();

    @java.lang.Deprecated
    com.google.android.exoplayer2.ExoPlayer.DeviceComponent getDeviceComponent();

    boolean getPauseAtEndOfMediaItems();

    android.os.Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.Player
    com.google.android.exoplayer2.ExoPlaybackException getPlayerError();

    com.google.android.exoplayer2.Renderer getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    com.google.android.exoplayer2.SeekParameters getSeekParameters();

    boolean getSkipSilenceEnabled();

    @java.lang.Deprecated
    com.google.android.exoplayer2.ExoPlayer.TextComponent getTextComponent();

    com.google.android.exoplayer2.trackselection.TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @java.lang.Deprecated
    com.google.android.exoplayer2.ExoPlayer.VideoComponent getVideoComponent();

    com.google.android.exoplayer2.decoder.DecoderCounters getVideoDecoderCounters();

    com.google.android.exoplayer2.Format getVideoFormat();

    int getVideoScalingMode();

    boolean isTunnelingEnabled();

    @java.lang.Deprecated
    void prepare(com.google.android.exoplayer2.source.MediaSource mediaSource);

    @java.lang.Deprecated
    void prepare(com.google.android.exoplayer2.source.MediaSource mediaSource, boolean z, boolean z2);

    void removeAnalyticsListener(com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener);

    void removeAudioOffloadListener(com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener audioOffloadListener);

    @java.lang.Deprecated
    void retry();

    void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, boolean z);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(com.google.android.exoplayer2.audio.AuxEffectInfo auxEffectInfo);

    void setCameraMotionListener(com.google.android.exoplayer2.video.spherical.CameraMotionListener cameraMotionListener);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    @java.lang.Deprecated
    void setHandleWakeLock(boolean z);

    void setMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource);

    void setMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, long j);

    void setMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, boolean z);

    void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> list);

    void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> list, int i, long j);

    void setMediaSources(java.util.List<com.google.android.exoplayer2.source.MediaSource> list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    void setPreferredAudioDevice(android.media.AudioDeviceInfo audioDeviceInfo);

    void setPriorityTaskManager(com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager);

    void setSeekParameters(com.google.android.exoplayer2.SeekParameters seekParameters);

    void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z);

    void setVideoChangeFrameRateStrategy(int i);

    void setVideoFrameMetadataListener(com.google.android.exoplayer2.video.VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i);

    void setWakeMode(int i);

    /* renamed from: com.google.android.exoplayer2.ExoPlayer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    public static final class Builder {
        com.google.common.base.Function<com.google.android.exoplayer2.util.Clock, com.google.android.exoplayer2.analytics.AnalyticsCollector> analyticsCollectorFunction;
        com.google.android.exoplayer2.audio.AudioAttributes audioAttributes;
        com.google.common.base.Supplier<com.google.android.exoplayer2.upstream.BandwidthMeter> bandwidthMeterSupplier;
        boolean buildCalled;
        com.google.android.exoplayer2.util.Clock clock;
        final android.content.Context context;
        long detachSurfaceTimeoutMs;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        com.google.android.exoplayer2.LivePlaybackSpeedControl livePlaybackSpeedControl;
        com.google.common.base.Supplier<com.google.android.exoplayer2.LoadControl> loadControlSupplier;
        android.os.Looper looper;
        com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;
        com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory> renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        com.google.android.exoplayer2.SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        com.google.common.base.Supplier<com.google.android.exoplayer2.trackselection.TrackSelector> trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelector lambda$new$10(com.google.android.exoplayer2.trackselection.TrackSelector trackSelector) {
            return trackSelector;
        }

        static /* synthetic */ com.google.android.exoplayer2.LoadControl lambda$new$11(com.google.android.exoplayer2.LoadControl loadControl) {
            return loadControl;
        }

        static /* synthetic */ com.google.android.exoplayer2.upstream.BandwidthMeter lambda$new$12(com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        static /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsCollector lambda$new$13(com.google.android.exoplayer2.analytics.AnalyticsCollector analyticsCollector, com.google.android.exoplayer2.util.Clock clock) {
            return analyticsCollector;
        }

        static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$new$2(com.google.android.exoplayer2.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$new$5(com.google.android.exoplayer2.source.MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$new$6(com.google.android.exoplayer2.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$new$7(com.google.android.exoplayer2.source.MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$new$8(com.google.android.exoplayer2.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$new$9(com.google.android.exoplayer2.source.MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ com.google.android.exoplayer2.analytics.AnalyticsCollector lambda$setAnalyticsCollector$21(com.google.android.exoplayer2.analytics.AnalyticsCollector analyticsCollector, com.google.android.exoplayer2.util.Clock clock) {
            return analyticsCollector;
        }

        static /* synthetic */ com.google.android.exoplayer2.upstream.BandwidthMeter lambda$setBandwidthMeter$20(com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        static /* synthetic */ com.google.android.exoplayer2.LoadControl lambda$setLoadControl$19(com.google.android.exoplayer2.LoadControl loadControl) {
            return loadControl;
        }

        static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$setMediaSourceFactory$17(com.google.android.exoplayer2.source.MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$setRenderersFactory$16(com.google.android.exoplayer2.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelector lambda$setTrackSelector$18(com.google.android.exoplayer2.trackselection.TrackSelector trackSelector) {
            return trackSelector;
        }

        public Builder(final android.content.Context context) {
            this(context, (com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda11
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$0(context);
                }
            }, (com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda16
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$1(context);
                }
            });
        }

        static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$new$0(android.content.Context context) {
            return new com.google.android.exoplayer2.DefaultRenderersFactory(context);
        }

        static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$new$1(android.content.Context context) {
            return new com.google.android.exoplayer2.source.DefaultMediaSourceFactory(context, new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory());
        }

        public Builder(final android.content.Context context, final com.google.android.exoplayer2.RenderersFactory renderersFactory) {
            this(context, (com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda4
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$2(com.google.android.exoplayer2.RenderersFactory.this);
                }
            }, (com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda5
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$3(context);
                }
            });
            com.google.android.exoplayer2.util.Assertions.checkNotNull(renderersFactory);
        }

        static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.Factory lambda$new$3(android.content.Context context) {
            return new com.google.android.exoplayer2.source.DefaultMediaSourceFactory(context, new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory());
        }

        public Builder(final android.content.Context context, final com.google.android.exoplayer2.source.MediaSource.Factory factory) {
            this(context, (com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda6
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$4(context);
                }
            }, (com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda7
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$5(com.google.android.exoplayer2.source.MediaSource.Factory.this);
                }
            });
            com.google.android.exoplayer2.util.Assertions.checkNotNull(factory);
        }

        static /* synthetic */ com.google.android.exoplayer2.RenderersFactory lambda$new$4(android.content.Context context) {
            return new com.google.android.exoplayer2.DefaultRenderersFactory(context);
        }

        public Builder(android.content.Context context, final com.google.android.exoplayer2.RenderersFactory renderersFactory, final com.google.android.exoplayer2.source.MediaSource.Factory factory) {
            this(context, (com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda17
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$6(com.google.android.exoplayer2.RenderersFactory.this);
                }
            }, (com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda18
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$7(com.google.android.exoplayer2.source.MediaSource.Factory.this);
                }
            });
            com.google.android.exoplayer2.util.Assertions.checkNotNull(renderersFactory);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(factory);
        }

        public Builder(android.content.Context context, final com.google.android.exoplayer2.RenderersFactory renderersFactory, final com.google.android.exoplayer2.source.MediaSource.Factory factory, final com.google.android.exoplayer2.trackselection.TrackSelector trackSelector, final com.google.android.exoplayer2.LoadControl loadControl, final com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter, final com.google.android.exoplayer2.analytics.AnalyticsCollector analyticsCollector) {
            this(context, (com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda20
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$8(com.google.android.exoplayer2.RenderersFactory.this);
                }
            }, (com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda21
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$9(com.google.android.exoplayer2.source.MediaSource.Factory.this);
                }
            }, (com.google.common.base.Supplier<com.google.android.exoplayer2.trackselection.TrackSelector>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda22
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$10(com.google.android.exoplayer2.trackselection.TrackSelector.this);
                }
            }, (com.google.common.base.Supplier<com.google.android.exoplayer2.LoadControl>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda23
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$11(com.google.android.exoplayer2.LoadControl.this);
                }
            }, (com.google.common.base.Supplier<com.google.android.exoplayer2.upstream.BandwidthMeter>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$12(com.google.android.exoplayer2.upstream.BandwidthMeter.this);
                }
            }, (com.google.common.base.Function<com.google.android.exoplayer2.util.Clock, com.google.android.exoplayer2.analytics.AnalyticsCollector>) new com.google.common.base.Function() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$13(com.google.android.exoplayer2.analytics.AnalyticsCollector.this, (com.google.android.exoplayer2.util.Clock) obj);
                }
            });
            com.google.android.exoplayer2.util.Assertions.checkNotNull(renderersFactory);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(factory);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(trackSelector);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(bandwidthMeter);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(analyticsCollector);
        }

        private Builder(final android.content.Context context, com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory> supplier, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> supplier2) {
            this(context, supplier, supplier2, (com.google.common.base.Supplier<com.google.android.exoplayer2.trackselection.TrackSelector>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda8
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$new$14(context);
                }
            }, (com.google.common.base.Supplier<com.google.android.exoplayer2.LoadControl>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda9
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return new com.google.android.exoplayer2.DefaultLoadControl();
                }
            }, (com.google.common.base.Supplier<com.google.android.exoplayer2.upstream.BandwidthMeter>) new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda10
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    com.google.android.exoplayer2.upstream.BandwidthMeter singletonInstance;
                    singletonInstance = com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.getSingletonInstance(context);
                    return singletonInstance;
                }
            }, (com.google.common.base.Function<com.google.android.exoplayer2.util.Clock, com.google.android.exoplayer2.analytics.AnalyticsCollector>) new com.google.common.base.Function() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda12
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return new com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector((com.google.android.exoplayer2.util.Clock) obj);
                }
            });
        }

        static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelector lambda$new$14(android.content.Context context) {
            return new com.google.android.exoplayer2.trackselection.DefaultTrackSelector(context);
        }

        private Builder(android.content.Context context, com.google.common.base.Supplier<com.google.android.exoplayer2.RenderersFactory> supplier, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSource.Factory> supplier2, com.google.common.base.Supplier<com.google.android.exoplayer2.trackselection.TrackSelector> supplier3, com.google.common.base.Supplier<com.google.android.exoplayer2.LoadControl> supplier4, com.google.common.base.Supplier<com.google.android.exoplayer2.upstream.BandwidthMeter> supplier5, com.google.common.base.Function<com.google.android.exoplayer2.util.Clock, com.google.android.exoplayer2.analytics.AnalyticsCollector> function) {
            this.context = (android.content.Context) com.google.android.exoplayer2.util.Assertions.checkNotNull(context);
            this.renderersFactorySupplier = supplier;
            this.mediaSourceFactorySupplier = supplier2;
            this.trackSelectorSupplier = supplier3;
            this.loadControlSupplier = supplier4;
            this.bandwidthMeterSupplier = supplier5;
            this.analyticsCollectorFunction = function;
            this.looper = com.google.android.exoplayer2.util.Util.getCurrentOrMainLooper();
            this.audioAttributes = com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = com.google.android.exoplayer2.SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.livePlaybackSpeedControl = new com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = com.google.android.exoplayer2.util.Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder experimentalSetForegroundModeTimeoutMs(long j) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setRenderersFactory(final com.google.android.exoplayer2.RenderersFactory renderersFactory) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(renderersFactory);
            this.renderersFactorySupplier = new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda14
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$setRenderersFactory$16(com.google.android.exoplayer2.RenderersFactory.this);
                }
            };
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setMediaSourceFactory(final com.google.android.exoplayer2.source.MediaSource.Factory factory) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(factory);
            this.mediaSourceFactorySupplier = new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda15
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$setMediaSourceFactory$17(com.google.android.exoplayer2.source.MediaSource.Factory.this);
                }
            };
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setTrackSelector(final com.google.android.exoplayer2.trackselection.TrackSelector trackSelector) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda3
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$setTrackSelector$18(com.google.android.exoplayer2.trackselection.TrackSelector.this);
                }
            };
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setLoadControl(final com.google.android.exoplayer2.LoadControl loadControl) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(loadControl);
            this.loadControlSupplier = new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$setLoadControl$19(com.google.android.exoplayer2.LoadControl.this);
                }
            };
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setBandwidthMeter(final com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(bandwidthMeter);
            this.bandwidthMeterSupplier = new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda19
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$setBandwidthMeter$20(com.google.android.exoplayer2.upstream.BandwidthMeter.this);
                }
            };
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setLooper(android.os.Looper looper) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(looper);
            this.looper = looper;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setAnalyticsCollector(final com.google.android.exoplayer2.analytics.AnalyticsCollector analyticsCollector) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(analyticsCollector);
            this.analyticsCollectorFunction = new com.google.common.base.Function() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda13
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.android.exoplayer2.ExoPlayer.Builder.lambda$setAnalyticsCollector$21(com.google.android.exoplayer2.analytics.AnalyticsCollector.this, (com.google.android.exoplayer2.util.Clock) obj);
                }
            };
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setPriorityTaskManager(com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, boolean z) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.audioAttributes = (com.google.android.exoplayer2.audio.AudioAttributes) com.google.android.exoplayer2.util.Assertions.checkNotNull(audioAttributes);
            this.handleAudioFocus = z;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setWakeMode(int i) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.wakeMode = i;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setHandleAudioBecomingNoisy(boolean z) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setSkipSilenceEnabled(boolean z) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setVideoScalingMode(int i) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setVideoChangeFrameRateStrategy(int i) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setUseLazyPreparation(boolean z) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setSeekParameters(com.google.android.exoplayer2.SeekParameters seekParameters) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.seekParameters = (com.google.android.exoplayer2.SeekParameters) com.google.android.exoplayer2.util.Assertions.checkNotNull(seekParameters);
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setSeekBackIncrementMs(long j) {
            com.google.android.exoplayer2.util.Assertions.checkArgument(j > 0);
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setSeekForwardIncrementMs(long j) {
            com.google.android.exoplayer2.util.Assertions.checkArgument(j > 0);
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setReleaseTimeoutMs(long j) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setDetachSurfaceTimeoutMs(long j) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setPauseAtEndOfMediaItems(boolean z) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setLivePlaybackSpeedControl(com.google.android.exoplayer2.LivePlaybackSpeedControl livePlaybackSpeedControl) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = (com.google.android.exoplayer2.LivePlaybackSpeedControl) com.google.android.exoplayer2.util.Assertions.checkNotNull(livePlaybackSpeedControl);
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setUsePlatformDiagnostics(boolean z) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer.Builder setClock(com.google.android.exoplayer2.util.Clock clock) {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        public com.google.android.exoplayer2.ExoPlayer build() {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new com.google.android.exoplayer2.ExoPlayerImpl(this, null);
        }

        com.google.android.exoplayer2.SimpleExoPlayer buildSimpleExoPlayer() {
            com.google.android.exoplayer2.util.Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new com.google.android.exoplayer2.SimpleExoPlayer(this);
        }
    }
}
