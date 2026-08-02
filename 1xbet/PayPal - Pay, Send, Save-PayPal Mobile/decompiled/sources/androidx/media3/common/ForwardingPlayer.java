package androidx.media3.common;

/* loaded from: classes7.dex */
public class ForwardingPlayer implements androidx.media3.common.Player {
    private final androidx.media3.common.Player getHighSpeedVideoFpsRangesFor;
    private final java.util.IdentityHashMap<androidx.media3.common.Player.Listener, androidx.media3.common.ForwardingPlayer.ForwardingListener> getHighSpeedVideoSizes = new java.util.IdentityHashMap<>();

    public ForwardingPlayer(androidx.media3.common.Player player) {
        this.getHighSpeedVideoFpsRangesFor = player;
    }

    @Override // androidx.media3.common.Player
    public android.os.Looper getApplicationLooper() {
        return this.getHighSpeedVideoFpsRangesFor.getApplicationLooper();
    }

    @Override // androidx.media3.common.Player
    public void addListener(androidx.media3.common.Player.Listener listener) {
        synchronized (this.getHighSpeedVideoSizes) {
            androidx.media3.common.ForwardingPlayer.ForwardingListener forwardingListener = this.getHighSpeedVideoSizes.get(listener);
            if (forwardingListener == null) {
                forwardingListener = new androidx.media3.common.ForwardingPlayer.ForwardingListener(this, listener);
            }
            this.getHighSpeedVideoFpsRangesFor.addListener(forwardingListener);
            this.getHighSpeedVideoSizes.put(listener, forwardingListener);
        }
    }

    @Override // androidx.media3.common.Player
    public void removeListener(androidx.media3.common.Player.Listener listener) {
        synchronized (this.getHighSpeedVideoSizes) {
            androidx.media3.common.ForwardingPlayer.ForwardingListener remove = this.getHighSpeedVideoSizes.remove(listener);
            androidx.media3.common.Player player = this.getHighSpeedVideoFpsRangesFor;
            if (remove != null) {
                listener = remove;
            }
            player.removeListener(listener);
        }
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        this.getHighSpeedVideoFpsRangesFor.setMediaItems(list);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setMediaItems(list, z);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        this.getHighSpeedVideoFpsRangesFor.setMediaItems(list, i, j);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.getHighSpeedVideoFpsRangesFor.setMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j) {
        this.getHighSpeedVideoFpsRangesFor.setMediaItem(mediaItem, j);
    }

    @Override // androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setMediaItem(mediaItem, z);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.getHighSpeedVideoFpsRangesFor.addMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        this.getHighSpeedVideoFpsRangesFor.addMediaItem(i, mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        this.getHighSpeedVideoFpsRangesFor.addMediaItems(list);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        this.getHighSpeedVideoFpsRangesFor.addMediaItems(i, list);
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItem(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.moveMediaItem(i, i2);
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItems(int i, int i2, int i3) {
        this.getHighSpeedVideoFpsRangesFor.moveMediaItems(i, i2, i3);
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        this.getHighSpeedVideoFpsRangesFor.replaceMediaItem(i, mediaItem);
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        this.getHighSpeedVideoFpsRangesFor.replaceMediaItems(i, i2, list);
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItem(int i) {
        this.getHighSpeedVideoFpsRangesFor.removeMediaItem(i);
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItems(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.removeMediaItems(i, i2);
    }

    @Override // androidx.media3.common.Player
    public void clearMediaItems() {
        this.getHighSpeedVideoFpsRangesFor.clearMediaItems();
    }

    @Override // androidx.media3.common.Player
    public boolean isCommandAvailable(int i) {
        return this.getHighSpeedVideoFpsRangesFor.isCommandAvailable(i);
    }

    @Override // androidx.media3.common.Player
    public boolean canAdvertiseSession() {
        return this.getHighSpeedVideoFpsRangesFor.canAdvertiseSession();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Player.Commands getAvailableCommands() {
        return this.getHighSpeedVideoFpsRangesFor.getAvailableCommands();
    }

    @Override // androidx.media3.common.Player
    public void prepare() {
        this.getHighSpeedVideoFpsRangesFor.prepare();
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackState() {
        return this.getHighSpeedVideoFpsRangesFor.getPlaybackState();
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        return this.getHighSpeedVideoFpsRangesFor.getPlaybackSuppressionReason();
    }

    @Override // androidx.media3.common.Player
    public boolean isPlaying() {
        return this.getHighSpeedVideoFpsRangesFor.isPlaying();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.PlaybackException getPlayerError() {
        return this.getHighSpeedVideoFpsRangesFor.getPlayerError();
    }

    @Override // androidx.media3.common.Player
    public void play() {
        this.getHighSpeedVideoFpsRangesFor.play();
    }

    @Override // androidx.media3.common.Player
    public void pause() {
        this.getHighSpeedVideoFpsRangesFor.pause();
    }

    @Override // androidx.media3.common.Player
    public void setPlayWhenReady(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setPlayWhenReady(z);
    }

    @Override // androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        return this.getHighSpeedVideoFpsRangesFor.getPlayWhenReady();
    }

    @Override // androidx.media3.common.Player
    public void setRepeatMode(int i) {
        this.getHighSpeedVideoFpsRangesFor.setRepeatMode(i);
    }

    @Override // androidx.media3.common.Player
    public int getRepeatMode() {
        return this.getHighSpeedVideoFpsRangesFor.getRepeatMode();
    }

    @Override // androidx.media3.common.Player
    public void setShuffleModeEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setShuffleModeEnabled(z);
    }

    @Override // androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.getShuffleModeEnabled();
    }

    @Override // androidx.media3.common.Player
    public boolean isLoading() {
        return this.getHighSpeedVideoFpsRangesFor.isLoading();
    }

    @Override // androidx.media3.common.Player
    public void seekToDefaultPosition() {
        this.getHighSpeedVideoFpsRangesFor.seekToDefaultPosition();
    }

    @Override // androidx.media3.common.Player
    public void seekToDefaultPosition(int i) {
        this.getHighSpeedVideoFpsRangesFor.seekToDefaultPosition(i);
    }

    @Override // androidx.media3.common.Player
    public void seekTo(long j) {
        this.getHighSpeedVideoFpsRangesFor.seekTo(j);
    }

    @Override // androidx.media3.common.Player
    public void seekTo(int i, long j) {
        this.getHighSpeedVideoFpsRangesFor.seekTo(i, j);
    }

    @Override // androidx.media3.common.Player
    public long getSeekBackIncrement() {
        return this.getHighSpeedVideoFpsRangesFor.getSeekBackIncrement();
    }

    @Override // androidx.media3.common.Player
    public void seekBack() {
        this.getHighSpeedVideoFpsRangesFor.seekBack();
    }

    @Override // androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        return this.getHighSpeedVideoFpsRangesFor.getSeekForwardIncrement();
    }

    @Override // androidx.media3.common.Player
    public void seekForward() {
        this.getHighSpeedVideoFpsRangesFor.seekForward();
    }

    @Override // androidx.media3.common.Player
    public boolean hasPreviousMediaItem() {
        return this.getHighSpeedVideoFpsRangesFor.hasPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    public void seekToPreviousMediaItem() {
        this.getHighSpeedVideoFpsRangesFor.seekToPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    public void seekToPrevious() {
        this.getHighSpeedVideoFpsRangesFor.seekToPrevious();
    }

    @Override // androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        return this.getHighSpeedVideoFpsRangesFor.getMaxSeekToPreviousPosition();
    }

    @Override // androidx.media3.common.Player
    public boolean hasNextMediaItem() {
        return this.getHighSpeedVideoFpsRangesFor.hasNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    public void seekToNextMediaItem() {
        this.getHighSpeedVideoFpsRangesFor.seekToNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    public void seekToNext() {
        this.getHighSpeedVideoFpsRangesFor.seekToNext();
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.getHighSpeedVideoFpsRangesFor.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackSpeed(float f) {
        this.getHighSpeedVideoFpsRangesFor.setPlaybackSpeed(f);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.getHighSpeedVideoFpsRangesFor.getPlaybackParameters();
    }

    @Override // androidx.media3.common.Player
    public void stop() {
        this.getHighSpeedVideoFpsRangesFor.stop();
    }

    @Override // androidx.media3.common.Player
    public void release() {
        this.getHighSpeedVideoFpsRangesFor.release();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Tracks getCurrentTracks() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentTracks();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        return this.getHighSpeedVideoFpsRangesFor.getTrackSelectionParameters();
    }

    @Override // androidx.media3.common.Player
    public void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        this.getHighSpeedVideoFpsRangesFor.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getMediaMetadata() {
        return this.getHighSpeedVideoFpsRangesFor.getMediaMetadata();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        return this.getHighSpeedVideoFpsRangesFor.getPlaylistMetadata();
    }

    @Override // androidx.media3.common.Player
    public void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        this.getHighSpeedVideoFpsRangesFor.setPlaylistMetadata(mediaMetadata);
    }

    @Override // androidx.media3.common.Player
    public java.lang.Object getCurrentManifest() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentManifest();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Timeline getCurrentTimeline() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentTimeline();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentPeriodIndex();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public int getCurrentWindowIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentWindowIndex();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public int getNextWindowIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getNextWindowIndex();
    }

    @Override // androidx.media3.common.Player
    public int getNextMediaItemIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getNextMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public int getPreviousWindowIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getPreviousWindowIndex();
    }

    @Override // androidx.media3.common.Player
    public int getPreviousMediaItemIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getPreviousMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaItem getCurrentMediaItem() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentMediaItem();
    }

    @Override // androidx.media3.common.Player
    public int getMediaItemCount() {
        return this.getHighSpeedVideoFpsRangesFor.getMediaItemCount();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaItem getMediaItemAt(int i) {
        return this.getHighSpeedVideoFpsRangesFor.getMediaItemAt(i);
    }

    @Override // androidx.media3.common.Player
    public long getDuration() {
        return this.getHighSpeedVideoFpsRangesFor.getDuration();
    }

    @Override // androidx.media3.common.Player
    public long getCurrentPosition() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentPosition();
    }

    @Override // androidx.media3.common.Player
    public long getBufferedPosition() {
        return this.getHighSpeedVideoFpsRangesFor.getBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public int getBufferedPercentage() {
        return this.getHighSpeedVideoFpsRangesFor.getBufferedPercentage();
    }

    @Override // androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        return this.getHighSpeedVideoFpsRangesFor.getTotalBufferedDuration();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean isCurrentWindowDynamic() {
        return this.getHighSpeedVideoFpsRangesFor.isCurrentWindowDynamic();
    }

    @Override // androidx.media3.common.Player
    public boolean isCurrentMediaItemDynamic() {
        return this.getHighSpeedVideoFpsRangesFor.isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean isCurrentWindowLive() {
        return this.getHighSpeedVideoFpsRangesFor.isCurrentWindowLive();
    }

    @Override // androidx.media3.common.Player
    public boolean isCurrentMediaItemLive() {
        return this.getHighSpeedVideoFpsRangesFor.isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.Player
    public long getCurrentLiveOffset() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentLiveOffset();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public boolean isCurrentWindowSeekable() {
        return this.getHighSpeedVideoFpsRangesFor.isCurrentWindowSeekable();
    }

    @Override // androidx.media3.common.Player
    public boolean isCurrentMediaItemSeekable() {
        return this.getHighSpeedVideoFpsRangesFor.isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.Player
    public boolean isPlayingAd() {
        return this.getHighSpeedVideoFpsRangesFor.isPlayingAd();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentAdGroupIndex();
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentAdIndexInAdGroup();
    }

    @Override // androidx.media3.common.Player
    public long getContentDuration() {
        return this.getHighSpeedVideoFpsRangesFor.getContentDuration();
    }

    @Override // androidx.media3.common.Player
    public long getContentPosition() {
        return this.getHighSpeedVideoFpsRangesFor.getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public long getContentBufferedPosition() {
        return this.getHighSpeedVideoFpsRangesFor.getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        return this.getHighSpeedVideoFpsRangesFor.getAudioAttributes();
    }

    @Override // androidx.media3.common.Player
    public int getAudioSessionId() {
        return this.getHighSpeedVideoFpsRangesFor.getAudioSessionId();
    }

    @Override // androidx.media3.common.Player
    public void setVolume(float f) {
        this.getHighSpeedVideoFpsRangesFor.setVolume(f);
    }

    @Override // androidx.media3.common.Player
    public float getVolume() {
        return this.getHighSpeedVideoFpsRangesFor.getVolume();
    }

    @Override // androidx.media3.common.Player
    public void mute() {
        this.getHighSpeedVideoFpsRangesFor.mute();
    }

    @Override // androidx.media3.common.Player
    public void unmute() {
        this.getHighSpeedVideoFpsRangesFor.unmute();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.VideoSize getVideoSize() {
        return this.getHighSpeedVideoFpsRangesFor.getVideoSize();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.util.Size getSurfaceSize() {
        return this.getHighSpeedVideoFpsRangesFor.getSurfaceSize();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface() {
        this.getHighSpeedVideoFpsRangesFor.clearVideoSurface();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface(android.view.Surface surface) {
        this.getHighSpeedVideoFpsRangesFor.clearVideoSurface(surface);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurface(android.view.Surface surface) {
        this.getHighSpeedVideoFpsRangesFor.setVideoSurface(surface);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        this.getHighSpeedVideoFpsRangesFor.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        this.getHighSpeedVideoFpsRangesFor.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        this.getHighSpeedVideoFpsRangesFor.setVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        this.getHighSpeedVideoFpsRangesFor.clearVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public void setVideoTextureView(android.view.TextureView textureView) {
        this.getHighSpeedVideoFpsRangesFor.setVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoTextureView(android.view.TextureView textureView) {
        this.getHighSpeedVideoFpsRangesFor.clearVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.text.CueGroup getCurrentCues() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrentCues();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.DeviceInfo getDeviceInfo() {
        return this.getHighSpeedVideoFpsRangesFor.getDeviceInfo();
    }

    @Override // androidx.media3.common.Player
    public int getDeviceVolume() {
        return this.getHighSpeedVideoFpsRangesFor.getDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public boolean isDeviceMuted() {
        return this.getHighSpeedVideoFpsRangesFor.isDeviceMuted();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceVolume(int i) {
        this.getHighSpeedVideoFpsRangesFor.setDeviceVolume(i);
    }

    @Override // androidx.media3.common.Player
    public void setDeviceVolume(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.setDeviceVolume(i, i2);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void increaseDeviceVolume() {
        this.getHighSpeedVideoFpsRangesFor.increaseDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public void increaseDeviceVolume(int i) {
        this.getHighSpeedVideoFpsRangesFor.increaseDeviceVolume(i);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void decreaseDeviceVolume() {
        this.getHighSpeedVideoFpsRangesFor.decreaseDeviceVolume();
    }

    @Override // androidx.media3.common.Player
    public void decreaseDeviceVolume(int i) {
        this.getHighSpeedVideoFpsRangesFor.decreaseDeviceVolume(i);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceMuted(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setDeviceMuted(z);
    }

    @Override // androidx.media3.common.Player
    public void setDeviceMuted(boolean z, int i) {
        this.getHighSpeedVideoFpsRangesFor.setDeviceMuted(z, i);
    }

    @Override // androidx.media3.common.Player
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setAudioAttributes(audioAttributes, z);
    }

    public androidx.media3.common.Player getWrappedPlayer() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    static final class ForwardingListener implements androidx.media3.common.Player.Listener {
        private final androidx.media3.common.ForwardingPlayer getHighSpeedVideoFpsRangesFor;
        private final androidx.media3.common.Player.Listener getHighSpeedVideoSizes;

        public ForwardingListener(androidx.media3.common.ForwardingPlayer forwardingPlayer, androidx.media3.common.Player.Listener listener) {
            this.getHighSpeedVideoFpsRangesFor = forwardingPlayer;
            this.getHighSpeedVideoSizes = listener;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
            this.getHighSpeedVideoSizes.onEvents(this.getHighSpeedVideoFpsRangesFor, events);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTimelineChanged(androidx.media3.common.Timeline timeline, int i) {
            this.getHighSpeedVideoSizes.onTimelineChanged(timeline, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMediaItemTransition(androidx.media3.common.MediaItem mediaItem, int i) {
            this.getHighSpeedVideoSizes.onMediaItemTransition(mediaItem, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTracksChanged(androidx.media3.common.Tracks tracks) {
            this.getHighSpeedVideoSizes.onTracksChanged(tracks);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMediaMetadataChanged(androidx.media3.common.MediaMetadata mediaMetadata) {
            this.getHighSpeedVideoSizes.onMediaMetadataChanged(mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaylistMetadataChanged(androidx.media3.common.MediaMetadata mediaMetadata) {
            this.getHighSpeedVideoSizes.onPlaylistMetadataChanged(mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onIsLoadingChanged(boolean z) {
            this.getHighSpeedVideoSizes.onIsLoadingChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onLoadingChanged(boolean z) {
            this.getHighSpeedVideoSizes.onIsLoadingChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onAvailableCommandsChanged(androidx.media3.common.Player.Commands commands) {
            this.getHighSpeedVideoSizes.onAvailableCommandsChanged(commands);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTrackSelectionParametersChanged(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            this.getHighSpeedVideoSizes.onTrackSelectionParametersChanged(trackSelectionParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerStateChanged(boolean z, int i) {
            this.getHighSpeedVideoSizes.onPlayerStateChanged(z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackStateChanged(int i) {
            this.getHighSpeedVideoSizes.onPlaybackStateChanged(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayWhenReadyChanged(boolean z, int i) {
            this.getHighSpeedVideoSizes.onPlayWhenReadyChanged(z, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackSuppressionReasonChanged(int i) {
            this.getHighSpeedVideoSizes.onPlaybackSuppressionReasonChanged(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onIsPlayingChanged(boolean z) {
            this.getHighSpeedVideoSizes.onIsPlayingChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onRepeatModeChanged(int i) {
            this.getHighSpeedVideoSizes.onRepeatModeChanged(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onShuffleModeEnabledChanged(boolean z) {
            this.getHighSpeedVideoSizes.onShuffleModeEnabledChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerError(androidx.media3.common.PlaybackException playbackException) {
            this.getHighSpeedVideoSizes.onPlayerError(playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerErrorChanged(androidx.media3.common.PlaybackException playbackException) {
            this.getHighSpeedVideoSizes.onPlayerErrorChanged(playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPositionDiscontinuity(int i) {
            this.getHighSpeedVideoSizes.onPositionDiscontinuity(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPositionDiscontinuity(androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
            this.getHighSpeedVideoSizes.onPositionDiscontinuity(positionInfo, positionInfo2, i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackParametersChanged(androidx.media3.common.PlaybackParameters playbackParameters) {
            this.getHighSpeedVideoSizes.onPlaybackParametersChanged(playbackParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSeekBackIncrementChanged(long j) {
            this.getHighSpeedVideoSizes.onSeekBackIncrementChanged(j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSeekForwardIncrementChanged(long j) {
            this.getHighSpeedVideoSizes.onSeekForwardIncrementChanged(j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMaxSeekToPreviousPositionChanged(long j) {
            this.getHighSpeedVideoSizes.onMaxSeekToPreviousPositionChanged(j);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
            this.getHighSpeedVideoSizes.onVideoSizeChanged(videoSize);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSurfaceSizeChanged(int i, int i2) {
            this.getHighSpeedVideoSizes.onSurfaceSizeChanged(i, i2);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onRenderedFirstFrame() {
            this.getHighSpeedVideoSizes.onRenderedFirstFrame();
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onAudioSessionIdChanged(int i) {
            this.getHighSpeedVideoSizes.onAudioSessionIdChanged(i);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onAudioAttributesChanged(androidx.media3.common.AudioAttributes audioAttributes) {
            this.getHighSpeedVideoSizes.onAudioAttributesChanged(audioAttributes);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onVolumeChanged(float f) {
            this.getHighSpeedVideoSizes.onVolumeChanged(f);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSkipSilenceEnabledChanged(boolean z) {
            this.getHighSpeedVideoSizes.onSkipSilenceEnabledChanged(z);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onCues(java.util.List<androidx.media3.common.text.Cue> list) {
            this.getHighSpeedVideoSizes.onCues(list);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onCues(androidx.media3.common.text.CueGroup cueGroup) {
            this.getHighSpeedVideoSizes.onCues(cueGroup);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMetadata(androidx.media3.common.Metadata metadata) {
            this.getHighSpeedVideoSizes.onMetadata(metadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onDeviceInfoChanged(androidx.media3.common.DeviceInfo deviceInfo) {
            this.getHighSpeedVideoSizes.onDeviceInfoChanged(deviceInfo);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onDeviceVolumeChanged(int i, boolean z) {
            this.getHighSpeedVideoSizes.onDeviceVolumeChanged(i, z);
        }
    }
}
