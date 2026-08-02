package androidx.media3.common;

/* loaded from: classes7.dex */
public class ForwardingSimpleBasePlayer extends androidx.media3.common.SimpleBasePlayer {
    private boolean Camera2StreamConfigurationMap;
    private androidx.media3.common.ForwardingSimpleBasePlayer.LivePositionSuppliers getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private androidx.media3.common.Metadata getHighSpeedVideoFpsRangesFor;
    private long getHighSpeedVideoSizes;
    private androidx.media3.common.Player getInputFormats;
    private final androidx.media3.common.Player.Listener getOutputFormats;
    private int getOutputMinFrameDuration;

    static /* synthetic */ boolean Camera2StreamConfigurationMap(androidx.media3.common.ForwardingSimpleBasePlayer forwardingSimpleBasePlayer) {
        forwardingSimpleBasePlayer.Camera2StreamConfigurationMap = true;
        return true;
    }

    public ForwardingSimpleBasePlayer(androidx.media3.common.Player player) {
        super(player.getApplicationLooper());
        getHighSpeedVideoSizes(player);
        androidx.media3.common.ForwardingSimpleBasePlayer.PlayerListener playerListener = new androidx.media3.common.ForwardingSimpleBasePlayer.PlayerListener(this, (byte) 0);
        this.getOutputFormats = playerListener;
        player.addListener(playerListener);
    }

    protected final void setPlayer(androidx.media3.common.Player player) {
        androidx.media3.common.Player player2 = this.getInputFormats;
        if (player2 == player) {
            return;
        }
        if (player.getApplicationLooper() != player2.getApplicationLooper()) {
            throw new java.lang.IllegalArgumentException("Trying to swap players with non-matching loopers.");
        }
        player2.removeListener(this.getOutputFormats);
        player.addListener(this.getOutputFormats);
        getHighSpeedVideoSizes(player);
        this.getHighSpeedVideoSizes = player.getCurrentPosition();
        invalidateState();
    }

    protected final androidx.media3.common.Player getPlayer() {
        return this.getInputFormats;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected androidx.media3.common.SimpleBasePlayer.State getState() {
        androidx.media3.common.Tracks tracks;
        androidx.media3.common.SimpleBasePlayer.State.Builder builder = new androidx.media3.common.SimpleBasePlayer.State.Builder();
        androidx.media3.common.ForwardingSimpleBasePlayer.LivePositionSuppliers livePositionSuppliers = this.getHighResolutionOutputSizeshNQ4ISI;
        if (this.getInputFormats.isCommandAvailable(16)) {
            builder.setAdBufferedPositionMs(livePositionSuppliers.getHighResolutionOutputSizeshNQ4ISI);
            builder.setAdPositionMs(livePositionSuppliers.getHighSpeedVideoFpsRanges);
        }
        if (this.getInputFormats.isCommandAvailable(21)) {
            builder.setAudioAttributes(this.getInputFormats.getAudioAttributes());
        }
        builder.setAvailableCommands(this.getInputFormats.getAvailableCommands());
        if (this.getInputFormats.isCommandAvailable(16)) {
            builder.setContentBufferedPositionMs(livePositionSuppliers.getHighSpeedVideoFpsRangesFor);
            builder.setContentPositionMs(livePositionSuppliers.Camera2StreamConfigurationMap);
            if (this.getInputFormats.isCommandAvailable(17)) {
                builder.setCurrentAd(this.getInputFormats.getCurrentAdGroupIndex(), this.getInputFormats.getCurrentAdIndexInAdGroup());
            }
        }
        if (this.getInputFormats.isCommandAvailable(28)) {
            builder.setCurrentCues(this.getInputFormats.getCurrentCues());
        }
        if (this.getInputFormats.isCommandAvailable(17)) {
            builder.setCurrentMediaItemIndex(this.getInputFormats.getCurrentMediaItemIndex());
        }
        builder.setDeviceInfo(this.getInputFormats.getDeviceInfo());
        if (this.getInputFormats.isCommandAvailable(23)) {
            builder.setDeviceVolume(this.getInputFormats.getDeviceVolume());
            builder.setIsDeviceMuted(this.getInputFormats.isDeviceMuted());
        }
        builder.setIsLoading(this.getInputFormats.isLoading());
        builder.setMaxSeekToPreviousPositionMs(this.getInputFormats.getMaxSeekToPreviousPosition());
        if (this.Camera2StreamConfigurationMap) {
            builder.setNewlyRenderedFirstFrame(true);
            this.Camera2StreamConfigurationMap = false;
        }
        builder.setPlaybackParameters(this.getInputFormats.getPlaybackParameters());
        builder.setPlaybackState(this.getInputFormats.getPlaybackState());
        builder.setPlaybackSuppressionReason(this.getInputFormats.getPlaybackSuppressionReason());
        builder.setPlayerError(this.getInputFormats.getPlayerError());
        if (this.getInputFormats.isCommandAvailable(17)) {
            if (this.getInputFormats.isCommandAvailable(30)) {
                tracks = this.getInputFormats.getCurrentTracks();
            } else {
                tracks = androidx.media3.common.Tracks.EMPTY;
            }
            builder.setPlaylist(this.getInputFormats.getCurrentTimeline(), tracks, this.getInputFormats.isCommandAvailable(18) ? this.getInputFormats.getMediaMetadata() : null);
        }
        if (this.getInputFormats.isCommandAvailable(18)) {
            builder.setPlaylistMetadata(this.getInputFormats.getPlaylistMetadata());
        }
        builder.setPlayWhenReady(this.getInputFormats.getPlayWhenReady(), this.getOutputMinFrameDuration);
        long j = this.getHighSpeedVideoSizes;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            builder.setPositionDiscontinuity(this.getHighSpeedVideoFpsRanges, j);
            this.getHighSpeedVideoSizes = androidx.media3.common.C.TIME_UNSET;
        }
        builder.setRepeatMode(this.getInputFormats.getRepeatMode());
        builder.setSeekBackIncrementMs(this.getInputFormats.getSeekBackIncrement());
        builder.setSeekForwardIncrementMs(this.getInputFormats.getSeekForwardIncrement());
        builder.setShuffleModeEnabled(this.getInputFormats.getShuffleModeEnabled());
        builder.setSurfaceSize(this.getInputFormats.getSurfaceSize());
        builder.setTimedMetadata(this.getHighSpeedVideoFpsRangesFor);
        if (this.getInputFormats.isCommandAvailable(16)) {
            builder.setTotalBufferedDurationMs(livePositionSuppliers.getHighSpeedVideoSizes);
        }
        builder.setTrackSelectionParameters(this.getInputFormats.getTrackSelectionParameters());
        builder.setVideoSize(this.getInputFormats.getVideoSize());
        if (this.getInputFormats.isCommandAvailable(22)) {
            builder.setVolume(this.getInputFormats.getVolume());
        }
        return builder.build();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlayWhenReady(boolean z) {
        this.getInputFormats.setPlayWhenReady(z);
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handlePrepare() {
        this.getInputFormats.prepare();
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleStop() {
        this.getInputFormats.stop();
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleRelease() {
        this.getInputFormats.release();
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetRepeatMode(int i) {
        this.getInputFormats.setRepeatMode(i);
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetShuffleModeEnabled(boolean z) {
        this.getInputFormats.setShuffleModeEnabled(z);
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.getInputFormats.setPlaybackParameters(playbackParameters);
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        this.getInputFormats.setTrackSelectionParameters(trackSelectionParameters);
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        this.getInputFormats.setPlaylistMetadata(mediaMetadata);
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected final com.google.common.util.concurrent.ListenableFuture<?> handleSetVolume(float f) {
        this.getInputFormats.setVolume(f);
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetVolume(float f, int i) {
        if (i == 0) {
            this.getInputFormats.setVolume(f);
        } else if (i == 1) {
            this.getInputFormats.mute();
        } else if (i == 2) {
            this.getInputFormats.unmute();
        } else {
            throw new java.lang.IllegalStateException("Unknown volume operation type: ".concat(java.lang.String.valueOf(i)));
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetDeviceVolume(int i, int i2) {
        if (this.getInputFormats.isCommandAvailable(33)) {
            this.getInputFormats.setDeviceVolume(i, i2);
        } else {
            this.getInputFormats.setDeviceVolume(i);
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleIncreaseDeviceVolume(int i) {
        if (this.getInputFormats.isCommandAvailable(34)) {
            this.getInputFormats.increaseDeviceVolume(i);
        } else {
            this.getInputFormats.increaseDeviceVolume();
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleDecreaseDeviceVolume(int i) {
        if (this.getInputFormats.isCommandAvailable(34)) {
            this.getInputFormats.decreaseDeviceVolume(i);
        } else {
            this.getInputFormats.decreaseDeviceVolume();
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetDeviceMuted(boolean z, int i) {
        if (this.getInputFormats.isCommandAvailable(34)) {
            this.getInputFormats.setDeviceMuted(z, i);
        } else {
            this.getInputFormats.setDeviceMuted(z);
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        this.getInputFormats.setAudioAttributes(audioAttributes, z);
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetVideoOutput(java.lang.Object obj) {
        if (obj instanceof android.view.SurfaceView) {
            this.getInputFormats.setVideoSurfaceView((android.view.SurfaceView) obj);
        } else if (obj instanceof android.view.TextureView) {
            this.getInputFormats.setVideoTextureView((android.view.TextureView) obj);
        } else if (obj instanceof android.view.SurfaceHolder) {
            this.getInputFormats.setVideoSurfaceHolder((android.view.SurfaceHolder) obj);
        } else if (obj instanceof android.view.Surface) {
            this.getInputFormats.setVideoSurface((android.view.Surface) obj);
        } else {
            throw new java.lang.IllegalStateException();
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleClearVideoOutput(java.lang.Object obj) {
        if (obj instanceof android.view.SurfaceView) {
            this.getInputFormats.clearVideoSurfaceView((android.view.SurfaceView) obj);
        } else if (obj instanceof android.view.TextureView) {
            this.getInputFormats.clearVideoTextureView((android.view.TextureView) obj);
        } else if (obj instanceof android.view.SurfaceHolder) {
            this.getInputFormats.clearVideoSurfaceHolder((android.view.SurfaceHolder) obj);
        } else if (obj instanceof android.view.Surface) {
            this.getInputFormats.clearVideoSurface((android.view.Surface) obj);
        } else if (obj == null) {
            this.getInputFormats.clearVideoSurface();
        } else {
            throw new java.lang.IllegalStateException();
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        boolean z = list.size() == 1 && this.getInputFormats.isCommandAvailable(31);
        if (i == -1) {
            if (z) {
                this.getInputFormats.setMediaItem(list.get(0));
            } else {
                this.getInputFormats.setMediaItems(list);
            }
        } else if (z) {
            this.getInputFormats.setMediaItem(list.get(0), j);
        } else {
            this.getInputFormats.setMediaItems(list, i, j);
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleAddMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        if (list.size() == 1) {
            this.getInputFormats.addMediaItem(i, list.get(0));
        } else {
            this.getInputFormats.addMediaItems(i, list);
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleMoveMediaItems(int i, int i2, int i3) {
        if (i2 == i + 1) {
            this.getInputFormats.moveMediaItem(i, i3);
        } else {
            this.getInputFormats.moveMediaItems(i, i2, i3);
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleReplaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        if (i2 == i + 1 && list.size() == 1) {
            this.getInputFormats.replaceMediaItem(i, list.get(0));
        } else {
            this.getInputFormats.replaceMediaItems(i, i2, list);
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleRemoveMediaItems(int i, int i2) {
        if (i2 == i + 1) {
            this.getInputFormats.removeMediaItem(i);
        } else {
            this.getInputFormats.removeMediaItems(i, i2);
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSeek(int i, long j, int i2) {
        switch (i2) {
            case 4:
                this.getInputFormats.seekToDefaultPosition();
                break;
            case 5:
                this.getInputFormats.seekTo(j);
                break;
            case 6:
                this.getInputFormats.seekToPreviousMediaItem();
                break;
            case 7:
                this.getInputFormats.seekToPrevious();
                break;
            case 8:
                this.getInputFormats.seekToNextMediaItem();
                break;
            case 9:
                this.getInputFormats.seekToNext();
                break;
            case 10:
                if (i != -1) {
                    this.getInputFormats.seekTo(i, j);
                    break;
                }
                break;
            case 11:
                this.getInputFormats.seekBack();
                break;
            case 12:
                this.getInputFormats.seekForward();
                break;
            default:
                throw new java.lang.IllegalStateException();
        }
        return com.google.common.util.concurrent.Futures.immediateVoidFuture();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.player", "lastTimedMetadata", "playWhenReadyChangeReason", "pendingDiscontinuityReason", "livePositionSuppliers"})
    private void getHighSpeedVideoSizes(androidx.media3.common.Player player) {
        this.getInputFormats = player;
        this.getHighSpeedVideoFpsRangesFor = new androidx.media3.common.Metadata(androidx.media3.common.C.TIME_UNSET, new androidx.media3.common.Metadata.Entry[0]);
        this.getOutputMinFrameDuration = 1;
        this.getHighSpeedVideoFpsRanges = 5;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.media3.common.ForwardingSimpleBasePlayer.LivePositionSuppliers(player);
    }

    static final class LivePositionSuppliers {
        public final androidx.media3.common.SimpleBasePlayer.LivePositionSupplier Camera2StreamConfigurationMap;
        public final androidx.media3.common.SimpleBasePlayer.LivePositionSupplier getHighResolutionOutputSizeshNQ4ISI;
        public final androidx.media3.common.SimpleBasePlayer.LivePositionSupplier getHighSpeedVideoFpsRanges;
        public final androidx.media3.common.SimpleBasePlayer.LivePositionSupplier getHighSpeedVideoFpsRangesFor;
        public final androidx.media3.common.SimpleBasePlayer.LivePositionSupplier getHighSpeedVideoSizes;

        public LivePositionSuppliers(final androidx.media3.common.Player player) {
            java.util.Objects.requireNonNull(player);
            this.getHighSpeedVideoFpsRanges = new androidx.media3.common.SimpleBasePlayer.LivePositionSupplier(new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer$LivePositionSuppliers$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return androidx.media3.common.Player.this.getCurrentPosition();
                }
            });
            java.util.Objects.requireNonNull(player);
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.media3.common.SimpleBasePlayer.LivePositionSupplier(new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer$LivePositionSuppliers$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return androidx.media3.common.Player.this.getBufferedPosition();
                }
            });
            java.util.Objects.requireNonNull(player);
            this.Camera2StreamConfigurationMap = new androidx.media3.common.SimpleBasePlayer.LivePositionSupplier(new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer$LivePositionSuppliers$$ExternalSyntheticLambda2
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return androidx.media3.common.Player.this.getContentPosition();
                }
            });
            java.util.Objects.requireNonNull(player);
            this.getHighSpeedVideoFpsRangesFor = new androidx.media3.common.SimpleBasePlayer.LivePositionSupplier(new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer$LivePositionSuppliers$$ExternalSyntheticLambda3
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return androidx.media3.common.Player.this.getContentBufferedPosition();
                }
            });
            java.util.Objects.requireNonNull(player);
            this.getHighSpeedVideoSizes = new androidx.media3.common.SimpleBasePlayer.LivePositionSupplier(new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer$LivePositionSuppliers$$ExternalSyntheticLambda4
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return androidx.media3.common.Player.this.getTotalBufferedDuration();
                }
            });
        }
    }

    class PlayerListener implements androidx.media3.common.Player.Listener {
        private PlayerListener() {
        }

        /* synthetic */ PlayerListener(androidx.media3.common.ForwardingSimpleBasePlayer forwardingSimpleBasePlayer, byte b) {
            this();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMetadata(androidx.media3.common.Metadata metadata) {
            androidx.media3.common.ForwardingSimpleBasePlayer.this.getHighSpeedVideoFpsRangesFor = metadata;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            androidx.media3.common.ForwardingSimpleBasePlayer.this.getOutputMinFrameDuration = i;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
            androidx.media3.common.ForwardingSimpleBasePlayer.this.getHighSpeedVideoFpsRanges = i;
            androidx.media3.common.ForwardingSimpleBasePlayer.this.getHighSpeedVideoSizes = positionInfo2.positionMs;
            androidx.media3.common.ForwardingSimpleBasePlayer.LivePositionSuppliers livePositionSuppliers = androidx.media3.common.ForwardingSimpleBasePlayer.this.getHighResolutionOutputSizeshNQ4ISI;
            long j = positionInfo.positionMs;
            long j2 = positionInfo.contentPositionMs;
            livePositionSuppliers.getHighSpeedVideoFpsRanges.disconnect(j);
            livePositionSuppliers.getHighResolutionOutputSizeshNQ4ISI.disconnect(j);
            livePositionSuppliers.Camera2StreamConfigurationMap.disconnect(j2);
            livePositionSuppliers.getHighSpeedVideoFpsRangesFor.disconnect(j2);
            livePositionSuppliers.getHighSpeedVideoSizes.disconnect(0L);
            androidx.media3.common.ForwardingSimpleBasePlayer forwardingSimpleBasePlayer = androidx.media3.common.ForwardingSimpleBasePlayer.this;
            forwardingSimpleBasePlayer.getHighResolutionOutputSizeshNQ4ISI = new androidx.media3.common.ForwardingSimpleBasePlayer.LivePositionSuppliers(forwardingSimpleBasePlayer.getInputFormats);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            androidx.media3.common.ForwardingSimpleBasePlayer.Camera2StreamConfigurationMap(androidx.media3.common.ForwardingSimpleBasePlayer.this);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
            androidx.media3.common.ForwardingSimpleBasePlayer.this.invalidateState();
        }
    }
}
