package androidx.media3.common;

/* loaded from: classes7.dex */
public final class PlayerTransferState {
    private final androidx.media3.common.PlaybackParameters Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem> getHighSpeedVideoFpsRanges;
    private final long getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private final boolean getOutputFormats;
    private final androidx.media3.common.TrackSelectionParameters getOutputMinFrameDuration;

    /* synthetic */ PlayerTransferState(androidx.media3.common.PlayerTransferState.Builder builder, byte b) {
        this(builder);
    }

    public static final class Builder {
        private long Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private androidx.media3.common.PlaybackParameters getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem> getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoSizesFor;
        private int getOutputFormats;
        private androidx.media3.common.TrackSelectionParameters getOutputMinFrameDuration;

        /* synthetic */ Builder(androidx.media3.common.PlayerTransferState playerTransferState, byte b) {
            this(playerTransferState);
        }

        public Builder() {
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getOutputFormats = 0;
            this.getHighSpeedVideoSizesFor = false;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.Camera2StreamConfigurationMap = 0L;
            this.getHighSpeedVideoSizes = com.google.common.collect.ImmutableList.of();
            this.getHighSpeedVideoFpsRanges = androidx.media3.common.PlaybackParameters.DEFAULT;
            this.getOutputMinFrameDuration = androidx.media3.common.TrackSelectionParameters.DEFAULT;
        }

        private Builder(androidx.media3.common.PlayerTransferState playerTransferState) {
            this.getHighResolutionOutputSizeshNQ4ISI = playerTransferState.getHighSpeedVideoSizes;
            this.getOutputFormats = playerTransferState.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = playerTransferState.getOutputFormats;
            this.getHighSpeedVideoFpsRangesFor = playerTransferState.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = playerTransferState.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = playerTransferState.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = playerTransferState.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration = playerTransferState.getOutputMinFrameDuration;
        }

        public final androidx.media3.common.PlayerTransferState.Builder setPlayWhenReady(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            return this;
        }

        public final androidx.media3.common.PlayerTransferState.Builder setRepeatMode(int i) {
            this.getOutputFormats = i;
            return this;
        }

        public final androidx.media3.common.PlayerTransferState.Builder setShuffleModeEnabled(boolean z) {
            this.getHighSpeedVideoSizesFor = z;
            return this;
        }

        public final androidx.media3.common.PlayerTransferState.Builder setCurrentMediaItemIndex(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public final androidx.media3.common.PlayerTransferState.Builder setCurrentPosition(long j) {
            this.Camera2StreamConfigurationMap = j;
            return this;
        }

        public final androidx.media3.common.PlayerTransferState.Builder setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
            this.getHighSpeedVideoSizes = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            return this;
        }

        public final androidx.media3.common.PlayerTransferState.Builder setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
            this.getHighSpeedVideoFpsRanges = (androidx.media3.common.PlaybackParameters) java.util.Objects.requireNonNull(playbackParameters);
            return this;
        }

        public final androidx.media3.common.PlayerTransferState.Builder setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            this.getOutputMinFrameDuration = (androidx.media3.common.TrackSelectionParameters) java.util.Objects.requireNonNull(trackSelectionParameters);
            return this;
        }

        public final androidx.media3.common.PlayerTransferState build() {
            return new androidx.media3.common.PlayerTransferState(this, (byte) 0);
        }
    }

    private PlayerTransferState(androidx.media3.common.PlayerTransferState.Builder builder) {
        this.getHighSpeedVideoSizes = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor = builder.getOutputFormats;
        this.getOutputFormats = builder.getHighSpeedVideoSizesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = builder.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = builder.getHighSpeedVideoFpsRanges;
        this.getOutputMinFrameDuration = builder.getOutputMinFrameDuration;
    }

    public static androidx.media3.common.PlayerTransferState fromPlayer(androidx.media3.common.Player player) {
        return builderFromPlayer(player).build();
    }

    public static androidx.media3.common.PlayerTransferState.Builder builderFromPlayer(androidx.media3.common.Player player) {
        java.util.Objects.requireNonNull(player);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < player.getMediaItemCount(); i++) {
            arrayList.add(player.getMediaItemAt(i));
        }
        return new androidx.media3.common.PlayerTransferState.Builder().setPlayWhenReady(player.getPlayWhenReady()).setRepeatMode(player.getRepeatMode()).setShuffleModeEnabled(player.getShuffleModeEnabled()).setCurrentMediaItemIndex(player.getCurrentMediaItemIndex()).setCurrentPosition(player.getCurrentPosition()).setMediaItems(arrayList).setPlaybackParameters(player.getPlaybackParameters()).setTrackSelectionParameters(player.getTrackSelectionParameters());
    }

    public final void setToPlayer(androidx.media3.common.Player player) {
        java.util.Objects.requireNonNull(player);
        if (player.getAvailableCommands().contains(1)) {
            player.setPlayWhenReady(this.getHighSpeedVideoSizes);
        }
        if (player.getAvailableCommands().contains(15)) {
            player.setRepeatMode(this.getHighSpeedVideoSizesFor);
        }
        if (player.getAvailableCommands().contains(14)) {
            player.setShuffleModeEnabled(this.getOutputFormats);
        }
        if (player.getAvailableCommands().contains(31)) {
            player.setMediaItems(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        }
        if (player.getAvailableCommands().contains(13)) {
            player.setPlaybackParameters(this.Camera2StreamConfigurationMap);
        }
        if (player.getAvailableCommands().contains(29)) {
            player.setTrackSelectionParameters(this.getOutputMinFrameDuration);
        }
    }

    public final androidx.media3.common.PlayerTransferState.Builder buildUpon() {
        return new androidx.media3.common.PlayerTransferState.Builder(this, (byte) 0);
    }

    public final boolean getPlayWhenReady() {
        return this.getHighSpeedVideoSizes;
    }

    public final int getRepeatMode() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final boolean getShuffleModeEnabled() {
        return this.getOutputFormats;
    }

    public final int getCurrentMediaItemIndex() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final long getCurrentPosition() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem> getMediaItems() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.Camera2StreamConfigurationMap;
    }

    public final androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        return this.getOutputMinFrameDuration;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.PlayerTransferState playerTransferState = (androidx.media3.common.PlayerTransferState) obj;
        return this.getHighSpeedVideoSizes == playerTransferState.getHighSpeedVideoSizes && this.getHighSpeedVideoSizesFor == playerTransferState.getHighSpeedVideoSizesFor && this.getOutputFormats == playerTransferState.getOutputFormats && this.getHighResolutionOutputSizeshNQ4ISI == playerTransferState.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor == playerTransferState.getHighSpeedVideoFpsRangesFor && java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, playerTransferState.getHighSpeedVideoFpsRanges) && java.util.Objects.equals(this.Camera2StreamConfigurationMap, playerTransferState.Camera2StreamConfigurationMap) && java.util.Objects.equals(this.getOutputMinFrameDuration, playerTransferState.getOutputMinFrameDuration);
    }

    public final int hashCode() {
        boolean z = this.getHighSpeedVideoSizes;
        int i = this.getHighSpeedVideoSizesFor;
        boolean z2 = this.getOutputFormats;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        long j = this.getHighSpeedVideoFpsRangesFor;
        return java.util.Objects.hash(java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z2), java.lang.Integer.valueOf(i2), java.lang.Long.valueOf(j), this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration);
    }
}
