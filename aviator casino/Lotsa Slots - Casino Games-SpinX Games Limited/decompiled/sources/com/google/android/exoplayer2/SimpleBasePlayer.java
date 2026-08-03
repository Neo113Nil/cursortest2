package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public abstract class SimpleBasePlayer extends com.google.android.exoplayer2.BasePlayer {
    private final com.google.android.exoplayer2.util.HandlerWrapper applicationHandler;
    private final android.os.Looper applicationLooper;
    private final com.google.android.exoplayer2.util.ListenerSet<com.google.android.exoplayer2.Player.Listener> listeners;
    private final java.util.HashSet<com.google.common.util.concurrent.ListenableFuture<?>> pendingOperations;
    private com.google.android.exoplayer2.SimpleBasePlayer.State state;

    protected com.google.android.exoplayer2.SimpleBasePlayer.State getPlaceholderState(com.google.android.exoplayer2.SimpleBasePlayer.State state) {
        return state;
    }

    protected abstract com.google.android.exoplayer2.SimpleBasePlayer.State getState();

    protected static final class State {
        public final com.google.android.exoplayer2.Player.Commands availableCommands;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;

        public static final class Builder {
            private com.google.android.exoplayer2.Player.Commands availableCommands;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;

            public Builder() {
                this.availableCommands = com.google.android.exoplayer2.Player.Commands.EMPTY;
                this.playWhenReady = false;
                this.playWhenReadyChangeReason = 1;
            }

            private Builder(com.google.android.exoplayer2.SimpleBasePlayer.State state) {
                this.availableCommands = state.availableCommands;
                this.playWhenReady = state.playWhenReady;
                this.playWhenReadyChangeReason = state.playWhenReadyChangeReason;
            }

            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setAvailableCommands(com.google.android.exoplayer2.Player.Commands commands) {
                this.availableCommands = commands;
                return this;
            }

            public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder setPlayWhenReady(boolean z, int i) {
                this.playWhenReady = z;
                this.playWhenReadyChangeReason = i;
                return this;
            }

            public com.google.android.exoplayer2.SimpleBasePlayer.State build() {
                return new com.google.android.exoplayer2.SimpleBasePlayer.State(this);
            }
        }

        private State(com.google.android.exoplayer2.SimpleBasePlayer.State.Builder builder) {
            this.availableCommands = builder.availableCommands;
            this.playWhenReady = builder.playWhenReady;
            this.playWhenReadyChangeReason = builder.playWhenReadyChangeReason;
        }

        public com.google.android.exoplayer2.SimpleBasePlayer.State.Builder buildUpon() {
            return new com.google.android.exoplayer2.SimpleBasePlayer.State.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.exoplayer2.SimpleBasePlayer.State)) {
                return false;
            }
            com.google.android.exoplayer2.SimpleBasePlayer.State state = (com.google.android.exoplayer2.SimpleBasePlayer.State) obj;
            return this.playWhenReady == state.playWhenReady && this.playWhenReadyChangeReason == state.playWhenReadyChangeReason && this.availableCommands.equals(state.availableCommands);
        }

        public int hashCode() {
            return ((((com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.availableCommands.hashCode()) * 31) + (this.playWhenReady ? 1 : 0)) * 31) + this.playWhenReadyChangeReason;
        }
    }

    protected SimpleBasePlayer(android.os.Looper looper) {
        this(looper, com.google.android.exoplayer2.util.Clock.DEFAULT);
    }

    protected SimpleBasePlayer(android.os.Looper looper, com.google.android.exoplayer2.util.Clock clock) {
        this.applicationLooper = looper;
        this.applicationHandler = clock.createHandler(looper, null);
        this.pendingOperations = new java.util.HashSet<>();
        this.listeners = new com.google.android.exoplayer2.util.ListenerSet<>(looper, clock, new com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda7
            @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
            public final void invoke(java.lang.Object obj, com.google.android.exoplayer2.util.FlagSet flagSet) {
                com.google.android.exoplayer2.SimpleBasePlayer.this.m5380lambda$new$0$comgoogleandroidexoplayer2SimpleBasePlayer((com.google.android.exoplayer2.Player.Listener) obj, flagSet);
            }
        });
    }

    /* renamed from: lambda$new$0$com-google-android-exoplayer2-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ void m5380lambda$new$0$comgoogleandroidexoplayer2SimpleBasePlayer(com.google.android.exoplayer2.Player.Listener listener, com.google.android.exoplayer2.util.FlagSet flagSet) {
        listener.onEvents(this, new com.google.android.exoplayer2.Player.Events(flagSet));
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addListener(com.google.android.exoplayer2.Player.Listener listener) {
        this.listeners.add((com.google.android.exoplayer2.Player.Listener) com.google.android.exoplayer2.util.Assertions.checkNotNull(listener));
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeListener(com.google.android.exoplayer2.Player.Listener listener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(listener);
        this.listeners.remove(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public final android.os.Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.Player.Commands getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.state.availableCommands;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlayWhenReady(final boolean z) {
        verifyApplicationThreadAndInitState();
        final com.google.android.exoplayer2.SimpleBasePlayer.State state = this.state;
        if (state.availableCommands.contains(1)) {
            updateStateForPendingOperation(handleSetPlayWhenReady(z), new com.google.common.base.Supplier() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda4
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    com.google.android.exoplayer2.SimpleBasePlayer.State build;
                    build = com.google.android.exoplayer2.SimpleBasePlayer.State.this.buildUpon().setPlayWhenReady(z, 1).build();
                    return build;
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.state.playWhenReady;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> list, boolean z) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> list, int i, long j) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItems(int i, java.util.List<com.google.android.exoplayer2.MediaItem> list) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void moveMediaItems(int i, int i2, int i3) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeMediaItems(int i, int i2) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void prepare() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackState() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackSuppressionReason() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.PlaybackException getPlayerError() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setRepeatMode(int i) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getRepeatMode() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setShuffleModeEnabled(boolean z) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getShuffleModeEnabled() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isLoading() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekTo(int i, long j) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getSeekBackIncrement() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getSeekForwardIncrement() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getMaxSeekToPreviousPosition() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop(boolean z) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void release() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.Tracks getCurrentTracks() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.trackselection.TrackSelectionParameters getTrackSelectionParameters() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setTrackSelectionParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.MediaMetadata getMediaMetadata() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.MediaMetadata getPlaylistMetadata() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaylistMetadata(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.Timeline getCurrentTimeline() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentPeriodIndex() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentMediaItemIndex() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getDuration() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getBufferedPosition() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getTotalBufferedDuration() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlayingAd() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdGroupIndex() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdIndexInAdGroup() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentPosition() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentBufferedPosition() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final void setVolume(float f) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final float getVolume() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurface() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurface(android.view.Surface surface) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurface(android.view.Surface surface) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoTextureView(android.view.TextureView textureView) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoTextureView(android.view.TextureView textureView) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final com.google.android.exoplayer2.video.VideoSize getVideoSize() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.util.Size getSurfaceSize() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.TextComponent
    public final com.google.android.exoplayer2.text.CueGroup getCurrentCues() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final com.google.android.exoplayer2.DeviceInfo getDeviceInfo() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final int getDeviceVolume() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final boolean isDeviceMuted() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void setDeviceVolume(int i) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void increaseDeviceVolume() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void decreaseDeviceVolume() {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final void setDeviceMuted(boolean z) {
        throw new java.lang.IllegalStateException();
    }

    protected final void invalidateState() {
        verifyApplicationThreadAndInitState();
        if (this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState());
        }
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlayWhenReady(boolean z) {
        throw new java.lang.IllegalStateException();
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void updateStateAndInformListeners(final com.google.android.exoplayer2.SimpleBasePlayer.State state) {
        com.google.android.exoplayer2.SimpleBasePlayer.State state2 = this.state;
        this.state = state;
        boolean z = state2.playWhenReady != state.playWhenReady;
        if (z) {
            this.listeners.queueEvent(-1, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onPlayerStateChanged(com.google.android.exoplayer2.SimpleBasePlayer.State.this.playWhenReady, 1);
                }
            });
        }
        if (z || state2.playWhenReadyChangeReason != state.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda1
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onPlayWhenReadyChanged(r0.playWhenReady, com.google.android.exoplayer2.SimpleBasePlayer.State.this.playWhenReadyChangeReason);
                }
            });
        }
        if (isPlaying(state2) != isPlaying(state)) {
            this.listeners.queueEvent(7, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda2
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onIsPlayingChanged(com.google.android.exoplayer2.SimpleBasePlayer.isPlaying(com.google.android.exoplayer2.SimpleBasePlayer.State.this));
                }
            });
        }
        if (!state2.availableCommands.equals(state.availableCommands)) {
            this.listeners.queueEvent(13, new com.google.android.exoplayer2.util.ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda3
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((com.google.android.exoplayer2.Player.Listener) obj).onAvailableCommandsChanged(com.google.android.exoplayer2.SimpleBasePlayer.State.this.availableCommands);
                }
            });
        }
        this.listeners.flushEvents();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"state"})
    private void verifyApplicationThreadAndInitState() {
        if (java.lang.Thread.currentThread() != this.applicationLooper.getThread()) {
            throw new java.lang.IllegalStateException(com.google.android.exoplayer2.util.Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", java.lang.Thread.currentThread().getName(), this.applicationLooper.getThread().getName()));
        }
        if (this.state == null) {
            this.state = getState();
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void updateStateForPendingOperation(final com.google.common.util.concurrent.ListenableFuture<?> listenableFuture, com.google.common.base.Supplier<com.google.android.exoplayer2.SimpleBasePlayer.State> supplier) {
        if (listenableFuture.isDone() && this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState());
            return;
        }
        this.pendingOperations.add(listenableFuture);
        updateStateAndInformListeners(getPlaceholderState(supplier.get()));
        listenableFuture.addListener(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.SimpleBasePlayer.this.m5381xd55da8da(listenableFuture);
            }
        }, new java.util.concurrent.Executor() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda6
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                com.google.android.exoplayer2.SimpleBasePlayer.this.postOrRunOnApplicationHandler(runnable);
            }
        });
    }

    /* renamed from: lambda$updateStateForPendingOperation$6$com-google-android-exoplayer2-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ void m5381xd55da8da(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        com.google.android.exoplayer2.util.Util.castNonNull(this.state);
        this.pendingOperations.remove(listenableFuture);
        if (this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(java.lang.Runnable runnable) {
        if (this.applicationHandler.getLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            this.applicationHandler.post(runnable);
        }
    }

    private static boolean isPlaying(com.google.android.exoplayer2.SimpleBasePlayer.State state) {
        boolean z = state.playWhenReady;
        return false;
    }
}
