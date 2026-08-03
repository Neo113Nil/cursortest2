package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public interface Player {
    public static final int COMMAND_ADJUST_DEVICE_VOLUME = 26;
    public static final int COMMAND_CHANGE_MEDIA_ITEMS = 20;
    public static final int COMMAND_GET_AUDIO_ATTRIBUTES = 21;
    public static final int COMMAND_GET_CURRENT_MEDIA_ITEM = 16;
    public static final int COMMAND_GET_DEVICE_VOLUME = 23;
    public static final int COMMAND_GET_MEDIA_ITEMS_METADATA = 18;
    public static final int COMMAND_GET_TEXT = 28;
    public static final int COMMAND_GET_TIMELINE = 17;
    public static final int COMMAND_GET_TRACKS = 30;
    public static final int COMMAND_GET_VOLUME = 22;
    public static final int COMMAND_INVALID = -1;
    public static final int COMMAND_PLAY_PAUSE = 1;
    public static final int COMMAND_PREPARE = 2;
    public static final int COMMAND_SEEK_BACK = 11;
    public static final int COMMAND_SEEK_FORWARD = 12;
    public static final int COMMAND_SEEK_IN_CURRENT_MEDIA_ITEM = 5;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_IN_CURRENT_WINDOW = 5;
    public static final int COMMAND_SEEK_TO_DEFAULT_POSITION = 4;
    public static final int COMMAND_SEEK_TO_MEDIA_ITEM = 10;
    public static final int COMMAND_SEEK_TO_NEXT = 9;
    public static final int COMMAND_SEEK_TO_NEXT_MEDIA_ITEM = 8;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_TO_NEXT_WINDOW = 8;
    public static final int COMMAND_SEEK_TO_PREVIOUS = 7;
    public static final int COMMAND_SEEK_TO_PREVIOUS_MEDIA_ITEM = 6;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_TO_PREVIOUS_WINDOW = 6;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_TO_WINDOW = 10;
    public static final int COMMAND_SET_DEVICE_VOLUME = 25;
    public static final int COMMAND_SET_MEDIA_ITEM = 31;
    public static final int COMMAND_SET_MEDIA_ITEMS_METADATA = 19;
    public static final int COMMAND_SET_REPEAT_MODE = 15;
    public static final int COMMAND_SET_SHUFFLE_MODE = 14;
    public static final int COMMAND_SET_SPEED_AND_PITCH = 13;
    public static final int COMMAND_SET_TRACK_SELECTION_PARAMETERS = 29;
    public static final int COMMAND_SET_VIDEO_SURFACE = 27;
    public static final int COMMAND_SET_VOLUME = 24;
    public static final int COMMAND_STOP = 3;
    public static final int DISCONTINUITY_REASON_AUTO_TRANSITION = 0;
    public static final int DISCONTINUITY_REASON_INTERNAL = 5;
    public static final int DISCONTINUITY_REASON_REMOVE = 4;
    public static final int DISCONTINUITY_REASON_SEEK = 1;
    public static final int DISCONTINUITY_REASON_SEEK_ADJUSTMENT = 2;
    public static final int DISCONTINUITY_REASON_SKIP = 3;
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 20;
    public static final int EVENT_AUDIO_SESSION_ID = 21;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 13;
    public static final int EVENT_CUES = 27;
    public static final int EVENT_DEVICE_INFO_CHANGED = 29;
    public static final int EVENT_DEVICE_VOLUME_CHANGED = 30;
    public static final int EVENT_IS_LOADING_CHANGED = 3;
    public static final int EVENT_IS_PLAYING_CHANGED = 7;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 18;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 14;
    public static final int EVENT_METADATA = 28;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 12;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 4;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 6;
    public static final int EVENT_PLAYER_ERROR = 10;
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
    public static final int EVENT_VIDEO_SIZE_CHANGED = 25;
    public static final int EVENT_VOLUME_CHANGED = 22;
    public static final int MEDIA_ITEM_TRANSITION_REASON_AUTO = 1;
    public static final int MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED = 3;
    public static final int MEDIA_ITEM_TRANSITION_REASON_REPEAT = 0;
    public static final int MEDIA_ITEM_TRANSITION_REASON_SEEK = 2;
    public static final int PLAYBACK_SUPPRESSION_REASON_NONE = 0;
    public static final int PLAYBACK_SUPPRESSION_REASON_TRANSIENT_AUDIO_FOCUS_LOSS = 1;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_BECOMING_NOISY = 3;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_FOCUS_LOSS = 2;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_END_OF_MEDIA_ITEM = 5;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_REMOTE = 4;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_USER_REQUEST = 1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_OFF = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int STATE_BUFFERING = 2;
    public static final int STATE_ENDED = 4;
    public static final int STATE_IDLE = 1;
    public static final int STATE_READY = 3;
    public static final int TIMELINE_CHANGE_REASON_PLAYLIST_CHANGED = 0;
    public static final int TIMELINE_CHANGE_REASON_SOURCE_UPDATE = 1;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Command {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Event {
    }

    public interface Listener {

        /* renamed from: com.google.android.exoplayer2.Player$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onAudioAttributesChanged(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
            }

            public static void $default$onAudioSessionIdChanged(com.google.android.exoplayer2.Player.Listener _this, int i) {
            }

            public static void $default$onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.Player.Commands commands) {
            }

            public static void $default$onCues(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.text.CueGroup cueGroup) {
            }

            @java.lang.Deprecated
            public static void $default$onCues(com.google.android.exoplayer2.Player.Listener _this, java.util.List list) {
            }

            public static void $default$onDeviceInfoChanged(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.DeviceInfo deviceInfo) {
            }

            public static void $default$onDeviceVolumeChanged(com.google.android.exoplayer2.Player.Listener _this, int i, boolean z) {
            }

            public static void $default$onEvents(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.Player.Events events) {
            }

            public static void $default$onIsLoadingChanged(com.google.android.exoplayer2.Player.Listener _this, boolean z) {
            }

            public static void $default$onIsPlayingChanged(com.google.android.exoplayer2.Player.Listener _this, boolean z) {
            }

            @java.lang.Deprecated
            public static void $default$onLoadingChanged(com.google.android.exoplayer2.Player.Listener _this, boolean z) {
            }

            public static void $default$onMaxSeekToPreviousPositionChanged(com.google.android.exoplayer2.Player.Listener _this, long j) {
            }

            public static void $default$onMediaItemTransition(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.MediaItem mediaItem, int i) {
            }

            public static void $default$onMediaMetadataChanged(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
            }

            public static void $default$onMetadata(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.metadata.Metadata metadata) {
            }

            public static void $default$onPlayWhenReadyChanged(com.google.android.exoplayer2.Player.Listener _this, boolean z, int i) {
            }

            public static void $default$onPlaybackParametersChanged(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.PlaybackParameters playbackParameters) {
            }

            public static void $default$onPlaybackStateChanged(com.google.android.exoplayer2.Player.Listener _this, int i) {
            }

            public static void $default$onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.Player.Listener _this, int i) {
            }

            public static void $default$onPlayerError(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.PlaybackException playbackException) {
            }

            public static void $default$onPlayerErrorChanged(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.PlaybackException playbackException) {
            }

            @java.lang.Deprecated
            public static void $default$onPlayerStateChanged(com.google.android.exoplayer2.Player.Listener _this, boolean z, int i) {
            }

            public static void $default$onPlaylistMetadataChanged(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
            }

            @java.lang.Deprecated
            public static void $default$onPositionDiscontinuity(com.google.android.exoplayer2.Player.Listener _this, int i) {
            }

            public static void $default$onPositionDiscontinuity(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.Player.PositionInfo positionInfo, com.google.android.exoplayer2.Player.PositionInfo positionInfo2, int i) {
            }

            public static void $default$onRenderedFirstFrame(com.google.android.exoplayer2.Player.Listener _this) {
            }

            public static void $default$onRepeatModeChanged(com.google.android.exoplayer2.Player.Listener _this, int i) {
            }

            public static void $default$onSeekBackIncrementChanged(com.google.android.exoplayer2.Player.Listener _this, long j) {
            }

            public static void $default$onSeekForwardIncrementChanged(com.google.android.exoplayer2.Player.Listener _this, long j) {
            }

            @java.lang.Deprecated
            public static void $default$onSeekProcessed(com.google.android.exoplayer2.Player.Listener _this) {
            }

            public static void $default$onShuffleModeEnabledChanged(com.google.android.exoplayer2.Player.Listener _this, boolean z) {
            }

            public static void $default$onSkipSilenceEnabledChanged(com.google.android.exoplayer2.Player.Listener _this, boolean z) {
            }

            public static void $default$onSurfaceSizeChanged(com.google.android.exoplayer2.Player.Listener _this, int i, int i2) {
            }

            public static void $default$onTimelineChanged(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.Timeline timeline, int i) {
            }

            public static void $default$onTrackSelectionParametersChanged(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
            }

            public static void $default$onTracksChanged(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.Tracks tracks) {
            }

            public static void $default$onVideoSizeChanged(com.google.android.exoplayer2.Player.Listener _this, com.google.android.exoplayer2.video.VideoSize videoSize) {
            }

            public static void $default$onVolumeChanged(com.google.android.exoplayer2.Player.Listener _this, float f) {
            }
        }

        void onAudioAttributesChanged(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes);

        void onAudioSessionIdChanged(int i);

        void onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Commands commands);

        void onCues(com.google.android.exoplayer2.text.CueGroup cueGroup);

        @java.lang.Deprecated
        void onCues(java.util.List<com.google.android.exoplayer2.text.Cue> list);

        void onDeviceInfoChanged(com.google.android.exoplayer2.DeviceInfo deviceInfo);

        void onDeviceVolumeChanged(int i, boolean z);

        void onEvents(com.google.android.exoplayer2.Player player, com.google.android.exoplayer2.Player.Events events);

        void onIsLoadingChanged(boolean z);

        void onIsPlayingChanged(boolean z);

        @java.lang.Deprecated
        void onLoadingChanged(boolean z);

        void onMaxSeekToPreviousPositionChanged(long j);

        void onMediaItemTransition(com.google.android.exoplayer2.MediaItem mediaItem, int i);

        void onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata mediaMetadata);

        void onMetadata(com.google.android.exoplayer2.metadata.Metadata metadata);

        void onPlayWhenReadyChanged(boolean z, int i);

        void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters playbackParameters);

        void onPlaybackStateChanged(int i);

        void onPlaybackSuppressionReasonChanged(int i);

        void onPlayerError(com.google.android.exoplayer2.PlaybackException playbackException);

        void onPlayerErrorChanged(com.google.android.exoplayer2.PlaybackException playbackException);

        @java.lang.Deprecated
        void onPlayerStateChanged(boolean z, int i);

        void onPlaylistMetadataChanged(com.google.android.exoplayer2.MediaMetadata mediaMetadata);

        @java.lang.Deprecated
        void onPositionDiscontinuity(int i);

        void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo positionInfo, com.google.android.exoplayer2.Player.PositionInfo positionInfo2, int i);

        void onRenderedFirstFrame();

        void onRepeatModeChanged(int i);

        void onSeekBackIncrementChanged(long j);

        void onSeekForwardIncrementChanged(long j);

        @java.lang.Deprecated
        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z);

        void onSkipSilenceEnabledChanged(boolean z);

        void onSurfaceSizeChanged(int i, int i2);

        void onTimelineChanged(com.google.android.exoplayer2.Timeline timeline, int i);

        void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters);

        void onTracksChanged(com.google.android.exoplayer2.Tracks tracks);

        void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize videoSize);

        void onVolumeChanged(float f);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    void addListener(com.google.android.exoplayer2.Player.Listener listener);

    void addMediaItem(int i, com.google.android.exoplayer2.MediaItem mediaItem);

    void addMediaItem(com.google.android.exoplayer2.MediaItem mediaItem);

    void addMediaItems(int i, java.util.List<com.google.android.exoplayer2.MediaItem> list);

    void addMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> list);

    boolean canAdvertiseSession();

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(android.view.Surface surface);

    void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(android.view.SurfaceView surfaceView);

    void clearVideoTextureView(android.view.TextureView textureView);

    void decreaseDeviceVolume();

    android.os.Looper getApplicationLooper();

    com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes();

    com.google.android.exoplayer2.Player.Commands getAvailableCommands();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    com.google.android.exoplayer2.text.CueGroup getCurrentCues();

    long getCurrentLiveOffset();

    java.lang.Object getCurrentManifest();

    com.google.android.exoplayer2.MediaItem getCurrentMediaItem();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    com.google.android.exoplayer2.Timeline getCurrentTimeline();

    com.google.android.exoplayer2.Tracks getCurrentTracks();

    @java.lang.Deprecated
    int getCurrentWindowIndex();

    com.google.android.exoplayer2.DeviceInfo getDeviceInfo();

    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    com.google.android.exoplayer2.MediaItem getMediaItemAt(int i);

    int getMediaItemCount();

    com.google.android.exoplayer2.MediaMetadata getMediaMetadata();

    int getNextMediaItemIndex();

    @java.lang.Deprecated
    int getNextWindowIndex();

    boolean getPlayWhenReady();

    com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    com.google.android.exoplayer2.PlaybackException getPlayerError();

    com.google.android.exoplayer2.MediaMetadata getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    @java.lang.Deprecated
    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    com.google.android.exoplayer2.util.Size getSurfaceSize();

    long getTotalBufferedDuration();

    com.google.android.exoplayer2.trackselection.TrackSelectionParameters getTrackSelectionParameters();

    com.google.android.exoplayer2.video.VideoSize getVideoSize();

    float getVolume();

    @java.lang.Deprecated
    boolean hasNext();

    boolean hasNextMediaItem();

    @java.lang.Deprecated
    boolean hasNextWindow();

    @java.lang.Deprecated
    boolean hasPrevious();

    boolean hasPreviousMediaItem();

    @java.lang.Deprecated
    boolean hasPreviousWindow();

    void increaseDeviceVolume();

    boolean isCommandAvailable(int i);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    @java.lang.Deprecated
    boolean isCurrentWindowDynamic();

    @java.lang.Deprecated
    boolean isCurrentWindowLive();

    @java.lang.Deprecated
    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int i, int i2);

    void moveMediaItems(int i, int i2, int i3);

    @java.lang.Deprecated
    void next();

    void pause();

    void play();

    void prepare();

    @java.lang.Deprecated
    void previous();

    void release();

    void removeListener(com.google.android.exoplayer2.Player.Listener listener);

    void removeMediaItem(int i);

    void removeMediaItems(int i, int i2);

    void seekBack();

    void seekForward();

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i);

    void seekToNext();

    void seekToNextMediaItem();

    @java.lang.Deprecated
    void seekToNextWindow();

    void seekToPrevious();

    void seekToPreviousMediaItem();

    @java.lang.Deprecated
    void seekToPreviousWindow();

    void setDeviceMuted(boolean z);

    void setDeviceVolume(int i);

    void setMediaItem(com.google.android.exoplayer2.MediaItem mediaItem);

    void setMediaItem(com.google.android.exoplayer2.MediaItem mediaItem, long j);

    void setMediaItem(com.google.android.exoplayer2.MediaItem mediaItem, boolean z);

    void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> list);

    void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> list, int i, long j);

    void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> list, boolean z);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters);

    void setPlaybackSpeed(float f);

    void setPlaylistMetadata(com.google.android.exoplayer2.MediaMetadata mediaMetadata);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setTrackSelectionParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters);

    void setVideoSurface(android.view.Surface surface);

    void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(android.view.SurfaceView surfaceView);

    void setVideoTextureView(android.view.TextureView textureView);

    void setVolume(float f);

    void stop();

    @java.lang.Deprecated
    void stop(boolean z);

    public static final class Events {
        private final com.google.android.exoplayer2.util.FlagSet flags;

        public Events(com.google.android.exoplayer2.util.FlagSet flagSet) {
            this.flags = flagSet;
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

        public int hashCode() {
            return this.flags.hashCode();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof com.google.android.exoplayer2.Player.Events) {
                return this.flags.equals(((com.google.android.exoplayer2.Player.Events) obj).flags);
            }
            return false;
        }
    }

    public static final class PositionInfo implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Player.PositionInfo> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.Player$PositionInfo$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                com.google.android.exoplayer2.Player.PositionInfo fromBundle;
                fromBundle = com.google.android.exoplayer2.Player.PositionInfo.fromBundle(bundle);
                return fromBundle;
            }
        };
        private static final int FIELD_AD_GROUP_INDEX = 5;
        private static final int FIELD_AD_INDEX_IN_AD_GROUP = 6;
        private static final int FIELD_CONTENT_POSITION_MS = 4;
        private static final int FIELD_MEDIA_ITEM = 1;
        private static final int FIELD_MEDIA_ITEM_INDEX = 0;
        private static final int FIELD_PERIOD_INDEX = 2;
        private static final int FIELD_POSITION_MS = 3;
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final long contentPositionMs;
        public final com.google.android.exoplayer2.MediaItem mediaItem;
        public final int mediaItemIndex;
        public final int periodIndex;
        public final java.lang.Object periodUid;
        public final long positionMs;

        @java.lang.Deprecated
        public final int windowIndex;
        public final java.lang.Object windowUid;

        @java.lang.Deprecated
        public PositionInfo(java.lang.Object obj, int i, java.lang.Object obj2, int i2, long j, long j2, int i3, int i4) {
            this(obj, i, com.google.android.exoplayer2.MediaItem.EMPTY, obj2, i2, j, j2, i3, i4);
        }

        public PositionInfo(java.lang.Object obj, int i, com.google.android.exoplayer2.MediaItem mediaItem, java.lang.Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.windowUid = obj;
            this.windowIndex = i;
            this.mediaItemIndex = i;
            this.mediaItem = mediaItem;
            this.periodUid = obj2;
            this.periodIndex = i2;
            this.positionMs = j;
            this.contentPositionMs = j2;
            this.adGroupIndex = i3;
            this.adIndexInAdGroup = i4;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.google.android.exoplayer2.Player.PositionInfo positionInfo = (com.google.android.exoplayer2.Player.PositionInfo) obj;
            return this.mediaItemIndex == positionInfo.mediaItemIndex && this.periodIndex == positionInfo.periodIndex && this.positionMs == positionInfo.positionMs && this.contentPositionMs == positionInfo.contentPositionMs && this.adGroupIndex == positionInfo.adGroupIndex && this.adIndexInAdGroup == positionInfo.adIndexInAdGroup && com.google.common.base.Objects.equal(this.windowUid, positionInfo.windowUid) && com.google.common.base.Objects.equal(this.periodUid, positionInfo.periodUid) && com.google.common.base.Objects.equal(this.mediaItem, positionInfo.mediaItem);
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(this.windowUid, java.lang.Integer.valueOf(this.mediaItemIndex), this.mediaItem, this.periodUid, java.lang.Integer.valueOf(this.periodIndex), java.lang.Long.valueOf(this.positionMs), java.lang.Long.valueOf(this.contentPositionMs), java.lang.Integer.valueOf(this.adGroupIndex), java.lang.Integer.valueOf(this.adIndexInAdGroup));
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(keyForField(0), this.mediaItemIndex);
            if (this.mediaItem != null) {
                bundle.putBundle(keyForField(1), this.mediaItem.toBundle());
            }
            bundle.putInt(keyForField(2), this.periodIndex);
            bundle.putLong(keyForField(3), this.positionMs);
            bundle.putLong(keyForField(4), this.contentPositionMs);
            bundle.putInt(keyForField(5), this.adGroupIndex);
            bundle.putInt(keyForField(6), this.adIndexInAdGroup);
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.google.android.exoplayer2.Player.PositionInfo fromBundle(android.os.Bundle bundle) {
            int i = bundle.getInt(keyForField(0), -1);
            android.os.Bundle bundle2 = bundle.getBundle(keyForField(1));
            return new com.google.android.exoplayer2.Player.PositionInfo(null, i, bundle2 == null ? null : com.google.android.exoplayer2.MediaItem.CREATOR.fromBundle(bundle2), null, bundle.getInt(keyForField(2), -1), bundle.getLong(keyForField(3), -9223372036854775807L), bundle.getLong(keyForField(4), -9223372036854775807L), bundle.getInt(keyForField(5), -1), bundle.getInt(keyForField(6), -1));
        }

        private static java.lang.String keyForField(int i) {
            return java.lang.Integer.toString(i, 36);
        }
    }

    public static final class Commands implements com.google.android.exoplayer2.Bundleable {
        private static final int FIELD_COMMANDS = 0;
        private final com.google.android.exoplayer2.util.FlagSet flags;
        public static final com.google.android.exoplayer2.Player.Commands EMPTY = new com.google.android.exoplayer2.Player.Commands.Builder().build();
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Player.Commands> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.Player$Commands$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                com.google.android.exoplayer2.Player.Commands fromBundle;
                fromBundle = com.google.android.exoplayer2.Player.Commands.fromBundle(bundle);
                return fromBundle;
            }
        };

        public static final class Builder {
            private static final int[] SUPPORTED_COMMANDS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
            private final com.google.android.exoplayer2.util.FlagSet.Builder flagsBuilder;

            public Builder() {
                this.flagsBuilder = new com.google.android.exoplayer2.util.FlagSet.Builder();
            }

            private Builder(com.google.android.exoplayer2.Player.Commands commands) {
                com.google.android.exoplayer2.util.FlagSet.Builder builder = new com.google.android.exoplayer2.util.FlagSet.Builder();
                this.flagsBuilder = builder;
                builder.addAll(commands.flags);
            }

            public com.google.android.exoplayer2.Player.Commands.Builder add(int i) {
                this.flagsBuilder.add(i);
                return this;
            }

            public com.google.android.exoplayer2.Player.Commands.Builder addIf(int i, boolean z) {
                this.flagsBuilder.addIf(i, z);
                return this;
            }

            public com.google.android.exoplayer2.Player.Commands.Builder addAll(int... iArr) {
                this.flagsBuilder.addAll(iArr);
                return this;
            }

            public com.google.android.exoplayer2.Player.Commands.Builder addAll(com.google.android.exoplayer2.Player.Commands commands) {
                this.flagsBuilder.addAll(commands.flags);
                return this;
            }

            public com.google.android.exoplayer2.Player.Commands.Builder addAllCommands() {
                this.flagsBuilder.addAll(SUPPORTED_COMMANDS);
                return this;
            }

            public com.google.android.exoplayer2.Player.Commands.Builder remove(int i) {
                this.flagsBuilder.remove(i);
                return this;
            }

            public com.google.android.exoplayer2.Player.Commands.Builder removeIf(int i, boolean z) {
                this.flagsBuilder.removeIf(i, z);
                return this;
            }

            public com.google.android.exoplayer2.Player.Commands.Builder removeAll(int... iArr) {
                this.flagsBuilder.removeAll(iArr);
                return this;
            }

            public com.google.android.exoplayer2.Player.Commands build() {
                return new com.google.android.exoplayer2.Player.Commands(this.flagsBuilder.build());
            }
        }

        private Commands(com.google.android.exoplayer2.util.FlagSet flagSet) {
            this.flags = flagSet;
        }

        public com.google.android.exoplayer2.Player.Commands.Builder buildUpon() {
            return new com.google.android.exoplayer2.Player.Commands.Builder();
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

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof com.google.android.exoplayer2.Player.Commands) {
                return this.flags.equals(((com.google.android.exoplayer2.Player.Commands) obj).flags);
            }
            return false;
        }

        public int hashCode() {
            return this.flags.hashCode();
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
            for (int i = 0; i < this.flags.size(); i++) {
                arrayList.add(java.lang.Integer.valueOf(this.flags.get(i)));
            }
            bundle.putIntegerArrayList(keyForField(0), arrayList);
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.google.android.exoplayer2.Player.Commands fromBundle(android.os.Bundle bundle) {
            java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList(keyForField(0));
            if (integerArrayList == null) {
                return EMPTY;
            }
            com.google.android.exoplayer2.Player.Commands.Builder builder = new com.google.android.exoplayer2.Player.Commands.Builder();
            for (int i = 0; i < integerArrayList.size(); i++) {
                builder.add(integerArrayList.get(i).intValue());
            }
            return builder.build();
        }

        private static java.lang.String keyForField(int i) {
            return java.lang.Integer.toString(i, 36);
        }
    }
}
