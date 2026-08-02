package androidx.media3.common;

/* loaded from: classes7.dex */
public abstract class BasePlayer implements androidx.media3.common.Player {
    protected final androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();

    @Override // androidx.media3.common.Player
    public final boolean canAdvertiseSession() {
        return true;
    }

    protected abstract void seekTo(int i, long j, int i2, boolean z);

    protected BasePlayer() {
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem) {
        setMediaItems(com.google.common.collect.ImmutableList.of(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j) {
        setMediaItems(com.google.common.collect.ImmutableList.of(mediaItem), 0, j);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z) {
        setMediaItems(com.google.common.collect.ImmutableList.of(mediaItem), z);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        setMediaItems(list, true);
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        addMediaItems(i, com.google.common.collect.ImmutableList.of(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItem(androidx.media3.common.MediaItem mediaItem) {
        addMediaItems(com.google.common.collect.ImmutableList.of(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItem(int i, int i2) {
        if (i != i2) {
            moveMediaItems(i, i + 1, i2);
        }
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItem(int i, androidx.media3.common.MediaItem mediaItem) {
        replaceMediaItems(i, i + 1, com.google.common.collect.ImmutableList.of(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItem(int i) {
        removeMediaItems(i, i + 1);
    }

    @Override // androidx.media3.common.Player
    public final void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override // androidx.media3.common.Player
    public final boolean isCommandAvailable(int i) {
        return getAvailableCommands().contains(i);
    }

    @Override // androidx.media3.common.Player
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // androidx.media3.common.Player
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition() {
        seekTo(getCurrentMediaItemIndex(), androidx.media3.common.C.TIME_UNSET, 4, false);
    }

    @Override // androidx.media3.common.Player
    public final void seekBack() {
        getHighResolutionOutputSizeshNQ4ISI(-getSeekBackIncrement(), 11);
    }

    @Override // androidx.media3.common.Player
    public final void seekForward() {
        getHighResolutionOutputSizeshNQ4ISI(getSeekForwardIncrement(), 12);
    }

    @Override // androidx.media3.common.Player
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // androidx.media3.common.Player
    public final void seekToPreviousMediaItem() {
        Camera2StreamConfigurationMap(6);
    }

    @Override // androidx.media3.common.Player
    public final void seekToPrevious() {
        if (!getCurrentTimeline().isEmpty() && !isPlayingAd()) {
            boolean hasPreviousMediaItem = hasPreviousMediaItem();
            if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
                if (hasPreviousMediaItem) {
                    Camera2StreamConfigurationMap(7);
                    return;
                } else {
                    seekTo(-1, androidx.media3.common.C.TIME_UNSET, 7, false);
                    return;
                }
            }
            if (hasPreviousMediaItem && getCurrentPosition() <= getMaxSeekToPreviousPosition()) {
                Camera2StreamConfigurationMap(7);
                return;
            } else {
                seekTo(getCurrentMediaItemIndex(), 0L, 7, false);
                return;
            }
        }
        seekTo(-1, androidx.media3.common.C.TIME_UNSET, 7, false);
    }

    @Override // androidx.media3.common.Player
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // androidx.media3.common.Player
    public final void seekToNextMediaItem() {
        getHighSpeedVideoFpsRangesFor(8);
    }

    @Override // androidx.media3.common.Player
    public final void seekToNext() {
        if (!getCurrentTimeline().isEmpty() && !isPlayingAd()) {
            if (hasNextMediaItem()) {
                getHighSpeedVideoFpsRangesFor(9);
                return;
            } else if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
                seekTo(getCurrentMediaItemIndex(), androidx.media3.common.C.TIME_UNSET, 9, false);
                return;
            } else {
                seekTo(-1, androidx.media3.common.C.TIME_UNSET, 9, false);
                return;
            }
        }
        seekTo(-1, androidx.media3.common.C.TIME_UNSET, 9, false);
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(int i, long j) {
        seekTo(i, j, 10, false);
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackSpeed(float f) {
        setPlaybackParameters(getPlaybackParameters().withSpeed(f));
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final int getNextMediaItemIndex() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            repeatMode = 0;
        }
        return currentTimeline.getNextWindowIndex(currentMediaItemIndex, repeatMode, getShuffleModeEnabled());
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final int getPreviousMediaItemIndex() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            repeatMode = 0;
        }
        return currentTimeline.getPreviousWindowIndex(currentMediaItemIndex, repeatMode, getShuffleModeEnabled());
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaItem getCurrentMediaItem() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem;
    }

    @Override // androidx.media3.common.Player
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaItem getMediaItemAt(int i) {
        return getCurrentTimeline().getWindow(i, this.window).mediaItem;
    }

    @Override // androidx.media3.common.Player
    public final java.lang.Object getCurrentManifest() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).manifest;
    }

    @Override // androidx.media3.common.Player
    public final int getBufferedPercentage() {
        if (!isCommandAvailable(16)) {
            return 0;
        }
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == androidx.media3.common.C.TIME_UNSET || duration == androidx.media3.common.C.TIME_UNSET) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return androidx.media3.common.util.Util.constrainValue(androidx.media3.common.util.Util.percentInt(bufferedPosition, duration), 0, 100);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemDynamic() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isDynamic;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemLive() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isLive();
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentLiveOffset() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return (currentTimeline.isEmpty() || currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).windowStartTimeMs == androidx.media3.common.C.TIME_UNSET) ? androidx.media3.common.C.TIME_UNSET : (this.window.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - getContentPosition();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemSeekable() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isSeekable;
    }

    @Override // androidx.media3.common.Player
    public final long getContentDuration() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return currentTimeline.isEmpty() ? androidx.media3.common.C.TIME_UNSET : currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).getDurationMs();
    }

    private void getHighResolutionOutputSizeshNQ4ISI(long j, int i) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != androidx.media3.common.C.TIME_UNSET) {
            currentPosition = java.lang.Math.min(currentPosition, duration);
        }
        seekTo(getCurrentMediaItemIndex(), java.lang.Math.max(currentPosition, 0L), i, false);
    }

    private void getHighSpeedVideoFpsRangesFor(int i) {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex != -1) {
            if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
                seekTo(getCurrentMediaItemIndex(), androidx.media3.common.C.TIME_UNSET, i, true);
                return;
            } else {
                seekTo(nextMediaItemIndex, androidx.media3.common.C.TIME_UNSET, i, false);
                return;
            }
        }
        seekTo(-1, androidx.media3.common.C.TIME_UNSET, i, false);
    }

    private void Camera2StreamConfigurationMap(int i) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex != -1) {
            if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
                seekTo(getCurrentMediaItemIndex(), androidx.media3.common.C.TIME_UNSET, i, true);
                return;
            } else {
                seekTo(previousMediaItemIndex, androidx.media3.common.C.TIME_UNSET, i, false);
                return;
            }
        }
        seekTo(-1, androidx.media3.common.C.TIME_UNSET, i, false);
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(long j) {
        seekTo(getCurrentMediaItemIndex(), j, 5, false);
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition(int i) {
        seekTo(i, androidx.media3.common.C.TIME_UNSET, 10, false);
    }
}
