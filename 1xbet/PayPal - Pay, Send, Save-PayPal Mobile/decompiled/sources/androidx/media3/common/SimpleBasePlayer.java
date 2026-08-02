package androidx.media3.common;

/* loaded from: classes7.dex */
public abstract class SimpleBasePlayer extends androidx.media3.common.BasePlayer {
    private final android.os.Looper Camera2StreamConfigurationMap;
    private final androidx.media3.common.Timeline.Period getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.HashSet<com.google.common.util.concurrent.ListenableFuture<?>> getHighSpeedVideoFpsRanges;
    private final androidx.media3.common.util.ListenerSet<androidx.media3.common.Player.Listener> getHighSpeedVideoFpsRangesFor;
    private final androidx.media3.common.util.HandlerWrapper getHighSpeedVideoSizes;
    private androidx.media3.common.SimpleBasePlayer.State getHighSpeedVideoSizesFor;
    private boolean getOutputMinFrameDuration;

    static /* synthetic */ com.google.common.util.concurrent.ListenableFuture getHighSpeedVideoFpsRanges(com.google.common.util.concurrent.ListenableFuture listenableFuture) throws java.lang.Exception {
        return listenableFuture;
    }

    static /* synthetic */ androidx.media3.common.SimpleBasePlayer.State getHighSpeedVideoSizesFor(androidx.media3.common.SimpleBasePlayer.State state) {
        return state;
    }

    protected androidx.media3.common.SimpleBasePlayer.State getPlaceholderState(androidx.media3.common.SimpleBasePlayer.State state) {
        return state;
    }

    protected abstract androidx.media3.common.SimpleBasePlayer.State getState();

    public static final class State {
        private final boolean Camera2StreamConfigurationMap;
        public final androidx.media3.common.SimpleBasePlayer.PositionSupplier adBufferedPositionMsSupplier;
        public final androidx.media3.common.SimpleBasePlayer.PositionSupplier adPositionMsSupplier;
        public final androidx.media3.common.AudioAttributes audioAttributes;
        public final int audioSessionId;
        public final androidx.media3.common.Player.Commands availableCommands;
        public final androidx.media3.common.SimpleBasePlayer.PositionSupplier contentBufferedPositionMsSupplier;
        public final androidx.media3.common.SimpleBasePlayer.PositionSupplier contentPositionMsSupplier;
        public final int currentAdGroupIndex;
        public final int currentAdIndexInAdGroup;
        public final androidx.media3.common.text.CueGroup currentCues;
        public final int currentMediaItemIndex;
        public final androidx.media3.common.MediaMetadata currentMetadata;
        public final androidx.media3.common.Tracks currentTracks;
        public final androidx.media3.common.DeviceInfo deviceInfo;
        public final int deviceVolume;
        public final long discontinuityPositionMs;
        public final boolean hasPositionDiscontinuity;
        public final boolean isDeviceMuted;
        public final boolean isLoading;
        public final long maxSeekToPreviousPositionMs;
        public final boolean newlyRenderedFirstFrame;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;
        public final androidx.media3.common.PlaybackParameters playbackParameters;
        public final int playbackState;
        public final int playbackSuppressionReason;
        public final androidx.media3.common.PlaybackException playerError;
        public final androidx.media3.common.MediaMetadata playlistMetadata;
        public final int positionDiscontinuityReason;
        public final int repeatMode;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final boolean shuffleModeEnabled;
        public final androidx.media3.common.util.Size surfaceSize;
        public final androidx.media3.common.Metadata timedMetadata;
        public final androidx.media3.common.Timeline timeline;
        public final androidx.media3.common.SimpleBasePlayer.PositionSupplier totalBufferedDurationMsSupplier;
        public final androidx.media3.common.TrackSelectionParameters trackSelectionParameters;
        public final float unmuteVolume;
        public final androidx.media3.common.VideoSize videoSize;
        public final float volume;

        /* synthetic */ State(androidx.media3.common.SimpleBasePlayer.State.Builder builder, byte b) {
            this(builder);
        }

        public static final class Builder {
            private androidx.media3.common.MediaMetadata AMEXKernel;
            private float AMEXKernelCallback;
            private androidx.media3.common.util.Size AMEXKernela;
            private boolean ArtificialStackFrames;
            private int Camera2StreamConfigurationMap;
            private int CoroutineDebuggingKt;
            private com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.MediaItemData> _BOUNDARY;
            private int _CREATION;

            /* renamed from: a, reason: collision with root package name */
            private int f2742a;
            private boolean accessartificialFrame;
            private androidx.media3.common.PlaybackException b;
            private int c;
            private boolean coroutineBoundary;
            private long coroutineCreation;
            private int d;
            private boolean exchange;
            private androidx.media3.common.PlaybackParameters getARTIFICIAL_FRAME_PACKAGE_NAME;
            private androidx.media3.common.SimpleBasePlayer.PositionSupplier getHighResolutionOutputSizeshNQ4ISI;
            private androidx.media3.common.SimpleBasePlayer.PositionSupplier getHighSpeedVideoFpsRanges;
            private androidx.media3.common.AudioAttributes getHighSpeedVideoFpsRangesFor;
            private java.lang.Long getHighSpeedVideoSizes;
            private androidx.media3.common.SimpleBasePlayer.PositionSupplier getHighSpeedVideoSizesFor;
            private androidx.media3.common.SimpleBasePlayer.PositionSupplier getInputFormats;
            private java.lang.Long getInputSizeshNQ4ISI;
            private androidx.media3.common.Player.Commands getOutputFormats;
            private int getOutputMinFrameDuration;
            private int getOutputMinFrameDurationlomOqCM;
            private androidx.media3.common.Tracks getOutputSizes;
            private androidx.media3.common.MediaMetadata getOutputSizeshNQ4ISI;
            private int getOutputStallDuration;
            private androidx.media3.common.text.CueGroup getOutputStallDurationlomOqCM;
            private androidx.media3.common.DeviceInfo getValidOutputFormatsForInputhNQ4ISI;
            private long init;
            private boolean isOutputSupportedFor;
            private boolean isOutputSupportedForhNQ4ISI;
            private long kernelVersion;
            private androidx.media3.common.VideoSize l;
            private androidx.media3.common.SimpleBasePlayer.PositionSupplier release;
            private float requestGoOnline;
            private androidx.media3.common.TrackSelectionParameters requestPINEntry;
            private androidx.media3.common.Metadata resetTransaction;
            private androidx.media3.common.Timeline startTransaction;
            private long toString;
            private int unwrapAs;

            /* synthetic */ Builder(androidx.media3.common.SimpleBasePlayer.State state, byte b) {
                this(state);
            }

            public Builder() {
                this.getOutputFormats = androidx.media3.common.Player.Commands.EMPTY;
                this.accessartificialFrame = false;
                this.CoroutineDebuggingKt = 1;
                this.f2742a = 1;
                this._CREATION = 0;
                this.b = null;
                this.d = 0;
                this.exchange = false;
                this.coroutineBoundary = false;
                this.init = 5000L;
                this.kernelVersion = 15000L;
                this.coroutineCreation = 3000L;
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = androidx.media3.common.PlaybackParameters.DEFAULT;
                this.requestPINEntry = androidx.media3.common.TrackSelectionParameters.DEFAULT;
                this.getHighSpeedVideoFpsRangesFor = androidx.media3.common.AudioAttributes.DEFAULT;
                this.Camera2StreamConfigurationMap = 0;
                this.AMEXKernelCallback = 1.0f;
                this.requestGoOnline = 1.0f;
                this.l = androidx.media3.common.VideoSize.UNKNOWN;
                this.getOutputStallDurationlomOqCM = androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO;
                this.getValidOutputFormatsForInputhNQ4ISI = androidx.media3.common.DeviceInfo.UNKNOWN;
                this.unwrapAs = 0;
                this.isOutputSupportedForhNQ4ISI = false;
                this.AMEXKernela = androidx.media3.common.util.Size.UNKNOWN;
                this.ArtificialStackFrames = false;
                this.resetTransaction = new androidx.media3.common.Metadata(androidx.media3.common.C.TIME_UNSET, new androidx.media3.common.Metadata.Entry[0]);
                this._BOUNDARY = com.google.common.collect.ImmutableList.of();
                this.startTransaction = androidx.media3.common.Timeline.EMPTY;
                this.getOutputSizes = null;
                this.getOutputSizeshNQ4ISI = null;
                this.AMEXKernel = androidx.media3.common.MediaMetadata.EMPTY;
                this.getOutputStallDuration = -1;
                this.getOutputMinFrameDuration = -1;
                this.getOutputMinFrameDurationlomOqCM = -1;
                this.getInputSizeshNQ4ISI = null;
                this.getInputFormats = androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(androidx.media3.common.C.TIME_UNSET);
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO;
                this.getHighSpeedVideoSizesFor = androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(androidx.media3.common.C.TIME_UNSET);
                this.getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO;
                this.release = androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO;
                this.isOutputSupportedFor = false;
                this.c = 5;
                this.toString = 0L;
            }

            private Builder(androidx.media3.common.SimpleBasePlayer.State state) {
                this.getOutputFormats = state.availableCommands;
                this.accessartificialFrame = state.playWhenReady;
                this.CoroutineDebuggingKt = state.playWhenReadyChangeReason;
                this.f2742a = state.playbackState;
                this._CREATION = state.playbackSuppressionReason;
                this.b = state.playerError;
                this.d = state.repeatMode;
                this.exchange = state.shuffleModeEnabled;
                this.coroutineBoundary = state.isLoading;
                this.init = state.seekBackIncrementMs;
                this.kernelVersion = state.seekForwardIncrementMs;
                this.coroutineCreation = state.maxSeekToPreviousPositionMs;
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = state.playbackParameters;
                this.requestPINEntry = state.trackSelectionParameters;
                this.getHighSpeedVideoFpsRangesFor = state.audioAttributes;
                this.Camera2StreamConfigurationMap = state.audioSessionId;
                this.AMEXKernelCallback = state.volume;
                this.requestGoOnline = state.unmuteVolume;
                this.l = state.videoSize;
                this.getOutputStallDurationlomOqCM = state.currentCues;
                this.getValidOutputFormatsForInputhNQ4ISI = state.deviceInfo;
                this.unwrapAs = state.deviceVolume;
                this.isOutputSupportedForhNQ4ISI = state.isDeviceMuted;
                this.AMEXKernela = state.surfaceSize;
                this.ArtificialStackFrames = state.newlyRenderedFirstFrame;
                this.resetTransaction = state.timedMetadata;
                this.startTransaction = state.timeline;
                if (!(state.timeline instanceof androidx.media3.common.SimpleBasePlayer.PlaylistTimeline)) {
                    this.getOutputSizes = state.currentTracks;
                    this.getOutputSizeshNQ4ISI = state.Camera2StreamConfigurationMap ? null : state.currentMetadata;
                } else {
                    this._BOUNDARY = ((androidx.media3.common.SimpleBasePlayer.PlaylistTimeline) state.timeline).getHighSpeedVideoSizes;
                }
                this.AMEXKernel = state.playlistMetadata;
                this.getOutputStallDuration = state.currentMediaItemIndex;
                this.getOutputMinFrameDuration = state.currentAdGroupIndex;
                this.getOutputMinFrameDurationlomOqCM = state.currentAdIndexInAdGroup;
                this.getInputSizeshNQ4ISI = null;
                this.getInputFormats = state.contentPositionMsSupplier;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = state.adPositionMsSupplier;
                this.getHighSpeedVideoSizesFor = state.contentBufferedPositionMsSupplier;
                this.getHighResolutionOutputSizeshNQ4ISI = state.adBufferedPositionMsSupplier;
                this.release = state.totalBufferedDurationMsSupplier;
                this.isOutputSupportedFor = state.hasPositionDiscontinuity;
                this.c = state.positionDiscontinuityReason;
                this.toString = state.discontinuityPositionMs;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setAvailableCommands(androidx.media3.common.Player.Commands commands) {
                this.getOutputFormats = commands;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setPlayWhenReady(boolean z, int i) {
                this.accessartificialFrame = z;
                this.CoroutineDebuggingKt = i;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setPlaybackState(int i) {
                this.f2742a = i;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setPlaybackSuppressionReason(int i) {
                this._CREATION = i;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setPlayerError(androidx.media3.common.PlaybackException playbackException) {
                this.b = playbackException;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setRepeatMode(int i) {
                this.d = i;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setShuffleModeEnabled(boolean z) {
                this.exchange = z;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setIsLoading(boolean z) {
                this.coroutineBoundary = z;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setSeekBackIncrementMs(long j) {
                this.init = j;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setSeekForwardIncrementMs(long j) {
                this.kernelVersion = j;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setMaxSeekToPreviousPositionMs(long j) {
                this.coroutineCreation = j;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = playbackParameters;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
                this.requestPINEntry = trackSelectionParameters;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
                this.getHighSpeedVideoFpsRangesFor = audioAttributes;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setAudioSessionId(int i) {
                this.Camera2StreamConfigurationMap = i;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setVolume(float f) {
                com.google.common.base.Preconditions.checkArgument(f >= 0.0f && f <= 1.0f);
                this.requestGoOnline = f != 0.0f ? f : this.AMEXKernelCallback;
                this.AMEXKernelCallback = f;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setUnmuteVolume(float f) {
                com.google.common.base.Preconditions.checkArgument(f >= 0.0f && f <= 1.0f);
                this.requestGoOnline = f;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setVideoSize(androidx.media3.common.VideoSize videoSize) {
                this.l = videoSize;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setCurrentCues(androidx.media3.common.text.CueGroup cueGroup) {
                this.getOutputStallDurationlomOqCM = cueGroup;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setDeviceInfo(androidx.media3.common.DeviceInfo deviceInfo) {
                this.getValidOutputFormatsForInputhNQ4ISI = deviceInfo;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setDeviceVolume(int i) {
                com.google.common.base.Preconditions.checkArgument(i >= 0);
                this.unwrapAs = i;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setIsDeviceMuted(boolean z) {
                this.isOutputSupportedForhNQ4ISI = z;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setSurfaceSize(androidx.media3.common.util.Size size) {
                this.AMEXKernela = size;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setNewlyRenderedFirstFrame(boolean z) {
                this.ArtificialStackFrames = z;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setTimedMetadata(androidx.media3.common.Metadata metadata) {
                this.resetTransaction = metadata;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setPlaylist(java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> list) {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (int i = 0; i < list.size(); i++) {
                    com.google.common.base.Preconditions.checkArgument(hashSet.add(list.get(i).uid), "Duplicate MediaItemData UID in playlist");
                }
                this._BOUNDARY = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                this.startTransaction = new androidx.media3.common.SimpleBasePlayer.PlaylistTimeline(this._BOUNDARY);
                this.getOutputSizes = null;
                this.getOutputSizeshNQ4ISI = null;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setPlaylist(androidx.media3.common.Timeline timeline, androidx.media3.common.Tracks tracks, androidx.media3.common.MediaMetadata mediaMetadata) {
                this._BOUNDARY = null;
                this.startTransaction = timeline;
                this.getOutputSizes = tracks;
                this.getOutputSizeshNQ4ISI = mediaMetadata;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
                this.AMEXKernel = mediaMetadata;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setCurrentMediaItemIndex(int i) {
                this.getOutputStallDuration = i;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setCurrentAd(int i, int i2) {
                com.google.common.base.Preconditions.checkArgument((i == -1) == (i2 == -1));
                this.getOutputMinFrameDuration = i;
                this.getOutputMinFrameDurationlomOqCM = i2;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setContentPositionMs(long j) {
                this.getInputSizeshNQ4ISI = java.lang.Long.valueOf(j);
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setContentPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier positionSupplier) {
                this.getInputSizeshNQ4ISI = null;
                this.getInputFormats = positionSupplier;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setAdPositionMs(long j) {
                this.getHighSpeedVideoSizes = java.lang.Long.valueOf(j);
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setAdPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier positionSupplier) {
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = positionSupplier;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setContentBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier positionSupplier) {
                this.getHighSpeedVideoSizesFor = positionSupplier;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setAdBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier positionSupplier) {
                this.getHighResolutionOutputSizeshNQ4ISI = positionSupplier;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier positionSupplier) {
                this.release = positionSupplier;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder setPositionDiscontinuity(int i, long j) {
                this.isOutputSupportedFor = true;
                this.c = i;
                this.toString = j;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State.Builder clearPositionDiscontinuity() {
                this.isOutputSupportedFor = false;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.State build() {
                return new androidx.media3.common.SimpleBasePlayer.State(this, (byte) 0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x018a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private State(androidx.media3.common.SimpleBasePlayer.State.Builder builder) {
            boolean z;
            androidx.media3.common.Tracks tracks = builder.getOutputSizes;
            androidx.media3.common.MediaMetadata mediaMetadata = builder.getOutputSizeshNQ4ISI;
            if (!builder.startTransaction.isEmpty()) {
                int i = builder.getOutputStallDuration;
                if (i == -1) {
                    i = 0;
                } else {
                    com.google.common.base.Preconditions.checkArgument(builder.getOutputStallDuration < builder.startTransaction.getWindowCount(), "currentMediaItemIndex must be less than playlist.size()");
                }
                if (builder.getOutputMinFrameDuration != -1) {
                    androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
                    builder.startTransaction.getPeriod(androidx.media3.common.SimpleBasePlayer.Camera2StreamConfigurationMap(builder.startTransaction, i, builder.getInputSizeshNQ4ISI != null ? builder.getInputSizeshNQ4ISI.longValue() : builder.getInputFormats.get(), new androidx.media3.common.Timeline.Window(), period), period);
                    com.google.common.base.Preconditions.checkArgument(builder.getOutputMinFrameDuration < period.getAdGroupCount(), "PeriodData has less ad groups than adGroupIndex");
                    int adCountInAdGroup = period.getAdCountInAdGroup(builder.getOutputMinFrameDuration);
                    if (adCountInAdGroup != -1) {
                        com.google.common.base.Preconditions.checkArgument(builder.getOutputMinFrameDurationlomOqCM < adCountInAdGroup, "Ad group has less ads than adIndexInGroupIndex");
                    }
                }
                if (builder._BOUNDARY != null) {
                    androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData = (androidx.media3.common.SimpleBasePlayer.MediaItemData) builder._BOUNDARY.get(i);
                    androidx.media3.common.Tracks tracks2 = mediaItemData.tracks;
                    mediaMetadata = mediaItemData.mediaMetadata;
                    tracks = tracks2;
                }
                if (mediaMetadata == null) {
                    mediaMetadata = androidx.media3.common.SimpleBasePlayer.Camera2StreamConfigurationMap(builder.startTransaction.getWindow(i, new androidx.media3.common.Timeline.Window()).mediaItem, (androidx.media3.common.Tracks) com.google.common.base.Preconditions.checkNotNull(tracks));
                    z = true;
                    if (builder.b != null) {
                        com.google.common.base.Preconditions.checkArgument(builder.f2742a == 1, "Player error only allowed in STATE_IDLE");
                    }
                    if (builder.f2742a != 1 || builder.f2742a == 4) {
                        com.google.common.base.Preconditions.checkArgument(!builder.coroutineBoundary, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
                    }
                    androidx.media3.common.SimpleBasePlayer.PositionSupplier extrapolating = builder.getInputSizeshNQ4ISI != null ? (builder.getOutputMinFrameDuration == -1 && builder.accessartificialFrame && builder.f2742a == 3 && builder._CREATION == 0 && builder.getInputSizeshNQ4ISI.longValue() != androidx.media3.common.C.TIME_UNSET) ? androidx.media3.common.SimpleBasePlayer.PositionSupplier.getExtrapolating(builder.getInputSizeshNQ4ISI.longValue(), builder.getARTIFICIAL_FRAME_PACKAGE_NAME.speed) : androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(builder.getInputSizeshNQ4ISI.longValue()) : builder.getInputFormats;
                    androidx.media3.common.SimpleBasePlayer.PositionSupplier extrapolating2 = builder.getHighSpeedVideoSizes != null ? (builder.getOutputMinFrameDuration != -1 && builder.accessartificialFrame && builder.f2742a == 3 && builder._CREATION == 0) ? androidx.media3.common.SimpleBasePlayer.PositionSupplier.getExtrapolating(builder.getHighSpeedVideoSizes.longValue(), 1.0f) : androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(builder.getHighSpeedVideoSizes.longValue()) : builder.getHighSpeedVideoFpsRanges;
                    this.availableCommands = builder.getOutputFormats;
                    this.playWhenReady = builder.accessartificialFrame;
                    this.playWhenReadyChangeReason = builder.CoroutineDebuggingKt;
                    this.playbackState = builder.f2742a;
                    this.playbackSuppressionReason = builder._CREATION;
                    this.playerError = builder.b;
                    this.repeatMode = builder.d;
                    this.shuffleModeEnabled = builder.exchange;
                    this.isLoading = builder.coroutineBoundary;
                    this.seekBackIncrementMs = builder.init;
                    this.seekForwardIncrementMs = builder.kernelVersion;
                    this.maxSeekToPreviousPositionMs = builder.coroutineCreation;
                    this.playbackParameters = builder.getARTIFICIAL_FRAME_PACKAGE_NAME;
                    this.trackSelectionParameters = builder.requestPINEntry;
                    this.audioAttributes = builder.getHighSpeedVideoFpsRangesFor;
                    this.audioSessionId = builder.Camera2StreamConfigurationMap;
                    this.volume = builder.AMEXKernelCallback;
                    this.unmuteVolume = builder.requestGoOnline;
                    this.videoSize = builder.l;
                    this.currentCues = builder.getOutputStallDurationlomOqCM;
                    this.deviceInfo = builder.getValidOutputFormatsForInputhNQ4ISI;
                    this.deviceVolume = builder.unwrapAs;
                    this.isDeviceMuted = builder.isOutputSupportedForhNQ4ISI;
                    this.surfaceSize = builder.AMEXKernela;
                    this.newlyRenderedFirstFrame = builder.ArtificialStackFrames;
                    this.timedMetadata = builder.resetTransaction;
                    this.timeline = builder.startTransaction;
                    this.currentTracks = (androidx.media3.common.Tracks) com.google.common.base.Preconditions.checkNotNull(tracks);
                    this.currentMetadata = mediaMetadata;
                    this.playlistMetadata = builder.AMEXKernel;
                    this.currentMediaItemIndex = builder.getOutputStallDuration;
                    this.currentAdGroupIndex = builder.getOutputMinFrameDuration;
                    this.currentAdIndexInAdGroup = builder.getOutputMinFrameDurationlomOqCM;
                    this.contentPositionMsSupplier = extrapolating;
                    this.adPositionMsSupplier = extrapolating2;
                    this.contentBufferedPositionMsSupplier = builder.getHighSpeedVideoSizesFor;
                    this.adBufferedPositionMsSupplier = builder.getHighResolutionOutputSizeshNQ4ISI;
                    this.totalBufferedDurationMsSupplier = builder.release;
                    this.hasPositionDiscontinuity = builder.isOutputSupportedFor;
                    this.positionDiscontinuityReason = builder.c;
                    this.discontinuityPositionMs = builder.toString;
                    this.Camera2StreamConfigurationMap = z;
                }
            } else {
                com.google.common.base.Preconditions.checkArgument(builder.f2742a == 1 || builder.f2742a == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
                com.google.common.base.Preconditions.checkArgument(builder.getOutputMinFrameDuration == -1 && builder.getOutputMinFrameDurationlomOqCM == -1, "Ads not allowed if playlist is empty");
                tracks = tracks == null ? androidx.media3.common.Tracks.EMPTY : tracks;
                if (mediaMetadata == null) {
                    mediaMetadata = androidx.media3.common.MediaMetadata.EMPTY;
                }
            }
            z = false;
            if (builder.b != null) {
            }
            if (builder.f2742a != 1) {
            }
            com.google.common.base.Preconditions.checkArgument(!builder.coroutineBoundary, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            if (builder.getInputSizeshNQ4ISI != null) {
            }
            if (builder.getHighSpeedVideoSizes != null) {
            }
            this.availableCommands = builder.getOutputFormats;
            this.playWhenReady = builder.accessartificialFrame;
            this.playWhenReadyChangeReason = builder.CoroutineDebuggingKt;
            this.playbackState = builder.f2742a;
            this.playbackSuppressionReason = builder._CREATION;
            this.playerError = builder.b;
            this.repeatMode = builder.d;
            this.shuffleModeEnabled = builder.exchange;
            this.isLoading = builder.coroutineBoundary;
            this.seekBackIncrementMs = builder.init;
            this.seekForwardIncrementMs = builder.kernelVersion;
            this.maxSeekToPreviousPositionMs = builder.coroutineCreation;
            this.playbackParameters = builder.getARTIFICIAL_FRAME_PACKAGE_NAME;
            this.trackSelectionParameters = builder.requestPINEntry;
            this.audioAttributes = builder.getHighSpeedVideoFpsRangesFor;
            this.audioSessionId = builder.Camera2StreamConfigurationMap;
            this.volume = builder.AMEXKernelCallback;
            this.unmuteVolume = builder.requestGoOnline;
            this.videoSize = builder.l;
            this.currentCues = builder.getOutputStallDurationlomOqCM;
            this.deviceInfo = builder.getValidOutputFormatsForInputhNQ4ISI;
            this.deviceVolume = builder.unwrapAs;
            this.isDeviceMuted = builder.isOutputSupportedForhNQ4ISI;
            this.surfaceSize = builder.AMEXKernela;
            this.newlyRenderedFirstFrame = builder.ArtificialStackFrames;
            this.timedMetadata = builder.resetTransaction;
            this.timeline = builder.startTransaction;
            this.currentTracks = (androidx.media3.common.Tracks) com.google.common.base.Preconditions.checkNotNull(tracks);
            this.currentMetadata = mediaMetadata;
            this.playlistMetadata = builder.AMEXKernel;
            this.currentMediaItemIndex = builder.getOutputStallDuration;
            this.currentAdGroupIndex = builder.getOutputMinFrameDuration;
            this.currentAdIndexInAdGroup = builder.getOutputMinFrameDurationlomOqCM;
            this.contentPositionMsSupplier = extrapolating;
            this.adPositionMsSupplier = extrapolating2;
            this.contentBufferedPositionMsSupplier = builder.getHighSpeedVideoSizesFor;
            this.adBufferedPositionMsSupplier = builder.getHighResolutionOutputSizeshNQ4ISI;
            this.totalBufferedDurationMsSupplier = builder.release;
            this.hasPositionDiscontinuity = builder.isOutputSupportedFor;
            this.positionDiscontinuityReason = builder.c;
            this.discontinuityPositionMs = builder.toString;
            this.Camera2StreamConfigurationMap = z;
        }

        public final androidx.media3.common.SimpleBasePlayer.State.Builder buildUpon() {
            return new androidx.media3.common.SimpleBasePlayer.State.Builder(this, (byte) 0);
        }

        public final com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.MediaItemData> getPlaylist() {
            androidx.media3.common.Timeline timeline = this.timeline;
            if (!(timeline instanceof androidx.media3.common.SimpleBasePlayer.PlaylistTimeline)) {
                androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
                androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
                com.google.common.collect.ImmutableList.Builder builderWithExpectedSize = com.google.common.collect.ImmutableList.builderWithExpectedSize(this.timeline.getWindowCount());
                for (int i = 0; i < this.timeline.getWindowCount(); i++) {
                    builderWithExpectedSize.add((com.google.common.collect.ImmutableList.Builder) androidx.media3.common.SimpleBasePlayer.MediaItemData.getHighResolutionOutputSizeshNQ4ISI(this, i, period, window));
                }
                return builderWithExpectedSize.build();
            }
            return ((androidx.media3.common.SimpleBasePlayer.PlaylistTimeline) timeline).getHighSpeedVideoSizes;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.SimpleBasePlayer.State)) {
                return false;
            }
            androidx.media3.common.SimpleBasePlayer.State state = (androidx.media3.common.SimpleBasePlayer.State) obj;
            return this.playWhenReady == state.playWhenReady && this.playWhenReadyChangeReason == state.playWhenReadyChangeReason && this.availableCommands.equals(state.availableCommands) && this.playbackState == state.playbackState && this.playbackSuppressionReason == state.playbackSuppressionReason && java.util.Objects.equals(this.playerError, state.playerError) && this.repeatMode == state.repeatMode && this.shuffleModeEnabled == state.shuffleModeEnabled && this.isLoading == state.isLoading && this.seekBackIncrementMs == state.seekBackIncrementMs && this.seekForwardIncrementMs == state.seekForwardIncrementMs && this.maxSeekToPreviousPositionMs == state.maxSeekToPreviousPositionMs && this.playbackParameters.equals(state.playbackParameters) && this.trackSelectionParameters.equals(state.trackSelectionParameters) && this.audioAttributes.equals(state.audioAttributes) && this.volume == state.volume && this.unmuteVolume == state.unmuteVolume && this.videoSize.equals(state.videoSize) && this.currentCues.equals(state.currentCues) && this.deviceInfo.equals(state.deviceInfo) && this.deviceVolume == state.deviceVolume && this.isDeviceMuted == state.isDeviceMuted && this.surfaceSize.equals(state.surfaceSize) && this.newlyRenderedFirstFrame == state.newlyRenderedFirstFrame && this.timedMetadata.equals(state.timedMetadata) && this.timeline.equals(state.timeline) && this.currentTracks.equals(state.currentTracks) && this.currentMetadata.equals(state.currentMetadata) && this.playlistMetadata.equals(state.playlistMetadata) && this.currentMediaItemIndex == state.currentMediaItemIndex && this.currentAdGroupIndex == state.currentAdGroupIndex && this.currentAdIndexInAdGroup == state.currentAdIndexInAdGroup && this.contentPositionMsSupplier.equals(state.contentPositionMsSupplier) && this.adPositionMsSupplier.equals(state.adPositionMsSupplier) && this.contentBufferedPositionMsSupplier.equals(state.contentBufferedPositionMsSupplier) && this.adBufferedPositionMsSupplier.equals(state.adBufferedPositionMsSupplier) && this.totalBufferedDurationMsSupplier.equals(state.totalBufferedDurationMsSupplier) && this.hasPositionDiscontinuity == state.hasPositionDiscontinuity && this.positionDiscontinuityReason == state.positionDiscontinuityReason && this.discontinuityPositionMs == state.discontinuityPositionMs;
        }

        public final int hashCode() {
            int hashCode = this.availableCommands.hashCode();
            boolean z = this.playWhenReady;
            int i = this.playWhenReadyChangeReason;
            int i2 = this.playbackState;
            int i3 = this.playbackSuppressionReason;
            androidx.media3.common.PlaybackException playbackException = this.playerError;
            int hashCode2 = playbackException == null ? 0 : playbackException.hashCode();
            int i4 = this.repeatMode;
            boolean z2 = this.shuffleModeEnabled;
            boolean z3 = this.isLoading;
            long j = this.seekBackIncrementMs;
            int i5 = (int) (j ^ (j >>> 32));
            long j2 = this.seekForwardIncrementMs;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            long j3 = this.maxSeekToPreviousPositionMs;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            int hashCode3 = this.playbackParameters.hashCode();
            int hashCode4 = this.trackSelectionParameters.hashCode();
            int hashCode5 = this.audioAttributes.hashCode();
            int floatToRawIntBits = java.lang.Float.floatToRawIntBits(this.volume);
            int floatToRawIntBits2 = java.lang.Float.floatToRawIntBits(this.unmuteVolume);
            int hashCode6 = this.videoSize.hashCode();
            int hashCode7 = this.currentCues.hashCode();
            int hashCode8 = this.deviceInfo.hashCode();
            int i8 = this.deviceVolume;
            boolean z4 = this.isDeviceMuted;
            int hashCode9 = this.surfaceSize.hashCode();
            boolean z5 = this.newlyRenderedFirstFrame;
            int hashCode10 = this.timedMetadata.hashCode();
            int hashCode11 = this.timeline.hashCode();
            int hashCode12 = this.currentTracks.hashCode();
            int hashCode13 = this.currentMetadata.hashCode();
            int hashCode14 = this.playlistMetadata.hashCode();
            int i9 = this.currentMediaItemIndex;
            int i10 = this.currentAdGroupIndex;
            int i11 = this.currentAdIndexInAdGroup;
            int hashCode15 = this.contentPositionMsSupplier.hashCode();
            int hashCode16 = this.adPositionMsSupplier.hashCode();
            int hashCode17 = this.contentBufferedPositionMsSupplier.hashCode();
            int hashCode18 = this.adBufferedPositionMsSupplier.hashCode();
            int hashCode19 = this.totalBufferedDurationMsSupplier.hashCode();
            boolean z6 = this.hasPositionDiscontinuity;
            int i12 = this.positionDiscontinuityReason;
            long j4 = this.discontinuityPositionMs;
            return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) * 31) + (z ? 1 : 0)) * 31) + i) * 31) + i2) * 31) + i3) * 31) + hashCode2) * 31) + i4) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + floatToRawIntBits) * 31) + floatToRawIntBits2) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i8) * 31) + (z4 ? 1 : 0)) * 31) + hashCode9) * 31) + (z5 ? 1 : 0)) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + i9) * 31) + i10) * 31) + i11) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + (z6 ? 1 : 0)) * 31) + i12) * 31) + ((int) ((j4 >>> 32) ^ j4));
        }
    }

    static final class PlaylistTimeline extends androidx.media3.common.Timeline {
        private final int[] Camera2StreamConfigurationMap;
        private final java.util.HashMap<java.lang.Object, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;
        private final int[] getHighSpeedVideoFpsRanges;
        private final com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.MediaItemData> getHighSpeedVideoSizes;

        public PlaylistTimeline(java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> list) {
            int size = list.size();
            this.getHighSpeedVideoSizes = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            this.Camera2StreamConfigurationMap = new int[size];
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i >= size) {
                    break;
                }
                androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData = list.get(i);
                this.Camera2StreamConfigurationMap[i] = i2;
                if (!mediaItemData.periods.isEmpty()) {
                    i3 = mediaItemData.periods.size();
                }
                i2 += i3;
                i++;
            }
            this.getHighSpeedVideoFpsRanges = new int[i2];
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap<>();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData2 = list.get(i5);
                int i6 = 0;
                while (true) {
                    if (i6 < (mediaItemData2.periods.isEmpty() ? 1 : mediaItemData2.periods.size())) {
                        this.getHighResolutionOutputSizeshNQ4ISI.put(androidx.media3.common.SimpleBasePlayer.MediaItemData.getHighSpeedVideoFpsRangesFor(mediaItemData2, i6), java.lang.Integer.valueOf(i4));
                        this.getHighSpeedVideoFpsRanges[i4] = i5;
                        i4++;
                        i6++;
                    }
                }
            }
        }

        @Override // androidx.media3.common.Timeline
        public final int getWindowCount() {
            return this.getHighSpeedVideoSizes.size();
        }

        @Override // androidx.media3.common.Timeline
        public final int getNextWindowIndex(int i, int i2, boolean z) {
            return super.getNextWindowIndex(i, i2, z);
        }

        @Override // androidx.media3.common.Timeline
        public final int getPreviousWindowIndex(int i, int i2, boolean z) {
            return super.getPreviousWindowIndex(i, i2, z);
        }

        @Override // androidx.media3.common.Timeline
        public final int getLastWindowIndex(boolean z) {
            return super.getLastWindowIndex(z);
        }

        @Override // androidx.media3.common.Timeline
        public final int getFirstWindowIndex(boolean z) {
            return super.getFirstWindowIndex(z);
        }

        @Override // androidx.media3.common.Timeline
        public final androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
            return androidx.media3.common.SimpleBasePlayer.MediaItemData.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes.get(i), this.Camera2StreamConfigurationMap[i], window);
        }

        @Override // androidx.media3.common.Timeline
        public final int getPeriodCount() {
            return this.getHighSpeedVideoFpsRanges.length;
        }

        @Override // androidx.media3.common.Timeline
        public final androidx.media3.common.Timeline.Period getPeriodByUid(java.lang.Object obj, androidx.media3.common.Timeline.Period period) {
            return getPeriod(((java.lang.Integer) com.google.common.base.Preconditions.checkNotNull(this.getHighResolutionOutputSizeshNQ4ISI.get(obj))).intValue(), period, true);
        }

        @Override // androidx.media3.common.Timeline
        public final androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
            int i2 = this.getHighSpeedVideoFpsRanges[i];
            return androidx.media3.common.SimpleBasePlayer.MediaItemData.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.get(i2), i2, i - this.Camera2StreamConfigurationMap[i2], period);
        }

        @Override // androidx.media3.common.Timeline
        public final int getIndexOfPeriod(java.lang.Object obj) {
            java.lang.Integer num = this.getHighResolutionOutputSizeshNQ4ISI.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.common.Timeline
        public final java.lang.Object getUidOfPeriod(int i) {
            int i2 = this.getHighSpeedVideoFpsRanges[i];
            return androidx.media3.common.SimpleBasePlayer.MediaItemData.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes.get(i2), i - this.Camera2StreamConfigurationMap[i2]);
        }
    }

    public static final class MediaItemData {
        public final long defaultPositionUs;
        public final long durationUs;
        public final long elapsedRealtimeEpochOffsetMs;
        private final long[] getHighSpeedVideoFpsRanges;
        public final boolean isDynamic;
        public final boolean isPlaceholder;
        public final boolean isSeekable;
        public final androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
        public final java.lang.Object manifest;
        public final androidx.media3.common.MediaItem mediaItem;
        public final androidx.media3.common.MediaMetadata mediaMetadata;
        public final com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.PeriodData> periods;
        public final long positionInFirstPeriodUs;
        public final long presentationStartTimeMs;
        public final androidx.media3.common.Tracks tracks;
        public final java.lang.Object uid;
        public final long windowStartTimeMs;

        /* synthetic */ MediaItemData(androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder builder, byte b) {
            this(builder);
        }

        public static final class Builder {
            private long Camera2StreamConfigurationMap;
            private long getHighResolutionOutputSizeshNQ4ISI;
            private long getHighSpeedVideoFpsRanges;
            private boolean getHighSpeedVideoFpsRangesFor;
            private boolean getHighSpeedVideoSizes;
            private boolean getHighSpeedVideoSizesFor;
            private java.lang.Object getInputFormats;
            private androidx.media3.common.MediaMetadata getInputSizeshNQ4ISI;
            private androidx.media3.common.MediaItem.LiveConfiguration getOutputFormats;
            private androidx.media3.common.MediaItem getOutputMinFrameDuration;
            private long getOutputMinFrameDurationlomOqCM;
            private androidx.media3.common.Tracks getOutputSizes;
            private java.lang.Object getOutputSizeshNQ4ISI;
            private com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.PeriodData> getOutputStallDuration;
            private long getOutputStallDurationlomOqCM;
            private long toString;

            /* synthetic */ Builder(androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData, byte b) {
                this(mediaItemData);
            }

            public Builder(java.lang.Object obj) {
                this.getOutputSizeshNQ4ISI = obj;
                this.getOutputSizes = androidx.media3.common.Tracks.EMPTY;
                this.getOutputMinFrameDuration = androidx.media3.common.MediaItem.EMPTY;
                this.getInputSizeshNQ4ISI = null;
                this.getInputFormats = null;
                this.getOutputFormats = null;
                this.getOutputStallDurationlomOqCM = androidx.media3.common.C.TIME_UNSET;
                this.toString = androidx.media3.common.C.TIME_UNSET;
                this.Camera2StreamConfigurationMap = androidx.media3.common.C.TIME_UNSET;
                this.getHighSpeedVideoSizesFor = false;
                this.getHighSpeedVideoFpsRangesFor = false;
                this.getHighSpeedVideoFpsRanges = 0L;
                this.getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.C.TIME_UNSET;
                this.getOutputMinFrameDurationlomOqCM = 0L;
                this.getHighSpeedVideoSizes = false;
                this.getOutputStallDuration = com.google.common.collect.ImmutableList.of();
            }

            private Builder(androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData) {
                this.getOutputSizeshNQ4ISI = mediaItemData.uid;
                this.getOutputSizes = mediaItemData.tracks;
                this.getOutputMinFrameDuration = mediaItemData.mediaItem;
                this.getInputSizeshNQ4ISI = mediaItemData.mediaMetadata;
                this.getInputFormats = mediaItemData.manifest;
                this.getOutputFormats = mediaItemData.liveConfiguration;
                this.getOutputStallDurationlomOqCM = mediaItemData.presentationStartTimeMs;
                this.toString = mediaItemData.windowStartTimeMs;
                this.Camera2StreamConfigurationMap = mediaItemData.elapsedRealtimeEpochOffsetMs;
                this.getHighSpeedVideoSizesFor = mediaItemData.isSeekable;
                this.getHighSpeedVideoFpsRangesFor = mediaItemData.isDynamic;
                this.getHighSpeedVideoFpsRanges = mediaItemData.defaultPositionUs;
                this.getHighResolutionOutputSizeshNQ4ISI = mediaItemData.durationUs;
                this.getOutputMinFrameDurationlomOqCM = mediaItemData.positionInFirstPeriodUs;
                this.getHighSpeedVideoSizes = mediaItemData.isPlaceholder;
                this.getOutputStallDuration = mediaItemData.periods;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setUid(java.lang.Object obj) {
                this.getOutputSizeshNQ4ISI = obj;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setTracks(androidx.media3.common.Tracks tracks) {
                this.getOutputSizes = tracks;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setMediaItem(androidx.media3.common.MediaItem mediaItem) {
                this.getOutputMinFrameDuration = mediaItem;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setMediaMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
                this.getInputSizeshNQ4ISI = mediaMetadata;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setManifest(java.lang.Object obj) {
                this.getInputFormats = obj;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setLiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
                this.getOutputFormats = liveConfiguration;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setPresentationStartTimeMs(long j) {
                this.getOutputStallDurationlomOqCM = j;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setWindowStartTimeMs(long j) {
                this.toString = j;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setElapsedRealtimeEpochOffsetMs(long j) {
                this.Camera2StreamConfigurationMap = j;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setIsSeekable(boolean z) {
                this.getHighSpeedVideoSizesFor = z;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setIsDynamic(boolean z) {
                this.getHighSpeedVideoFpsRangesFor = z;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setDefaultPositionUs(long j) {
                com.google.common.base.Preconditions.checkArgument(j >= 0);
                this.getHighSpeedVideoFpsRanges = j;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setDurationUs(long j) {
                com.google.common.base.Preconditions.checkArgument(j == androidx.media3.common.C.TIME_UNSET || j >= 0);
                this.getHighResolutionOutputSizeshNQ4ISI = j;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setPositionInFirstPeriodUs(long j) {
                com.google.common.base.Preconditions.checkArgument(j >= 0);
                this.getOutputMinFrameDurationlomOqCM = j;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setIsPlaceholder(boolean z) {
                this.getHighSpeedVideoSizes = z;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder setPeriods(java.util.List<androidx.media3.common.SimpleBasePlayer.PeriodData> list) {
                int size = list.size();
                int i = 0;
                while (i < size - 1) {
                    com.google.common.base.Preconditions.checkArgument(list.get(i).durationUs != androidx.media3.common.C.TIME_UNSET, "Periods other than last need a duration");
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < size; i3++) {
                        com.google.common.base.Preconditions.checkArgument(!list.get(i).uid.equals(list.get(i3).uid), "Duplicate PeriodData UIDs in period list");
                    }
                    i = i2;
                }
                this.getOutputStallDuration = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.MediaItemData build() {
                return new androidx.media3.common.SimpleBasePlayer.MediaItemData(this, (byte) 0);
            }
        }

        private MediaItemData(androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder builder) {
            int i = 0;
            if (builder.getOutputFormats == null) {
                com.google.common.base.Preconditions.checkArgument(builder.getOutputStallDurationlomOqCM == androidx.media3.common.C.TIME_UNSET, "presentationStartTimeMs can only be set if liveConfiguration != null");
                com.google.common.base.Preconditions.checkArgument(builder.toString == androidx.media3.common.C.TIME_UNSET, "windowStartTimeMs can only be set if liveConfiguration != null");
                com.google.common.base.Preconditions.checkArgument(builder.Camera2StreamConfigurationMap == androidx.media3.common.C.TIME_UNSET, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (builder.getOutputStallDurationlomOqCM != androidx.media3.common.C.TIME_UNSET && builder.toString != androidx.media3.common.C.TIME_UNSET) {
                com.google.common.base.Preconditions.checkArgument(builder.toString >= builder.getOutputStallDurationlomOqCM, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = builder.getOutputStallDuration.size();
            if (builder.getHighResolutionOutputSizeshNQ4ISI != androidx.media3.common.C.TIME_UNSET) {
                com.google.common.base.Preconditions.checkArgument(builder.getHighSpeedVideoFpsRanges <= builder.getHighResolutionOutputSizeshNQ4ISI, "defaultPositionUs can't be greater than durationUs");
            }
            this.uid = builder.getOutputSizeshNQ4ISI;
            this.tracks = builder.getOutputSizes;
            this.mediaItem = builder.getOutputMinFrameDuration;
            this.mediaMetadata = builder.getInputSizeshNQ4ISI;
            this.manifest = builder.getInputFormats;
            this.liveConfiguration = builder.getOutputFormats;
            this.presentationStartTimeMs = builder.getOutputStallDurationlomOqCM;
            this.windowStartTimeMs = builder.toString;
            this.elapsedRealtimeEpochOffsetMs = builder.Camera2StreamConfigurationMap;
            this.isSeekable = builder.getHighSpeedVideoSizesFor;
            this.isDynamic = builder.getHighSpeedVideoFpsRangesFor;
            this.defaultPositionUs = builder.getHighSpeedVideoFpsRanges;
            this.durationUs = builder.getHighResolutionOutputSizeshNQ4ISI;
            long j = builder.getOutputMinFrameDurationlomOqCM;
            this.positionInFirstPeriodUs = j;
            this.isPlaceholder = builder.getHighSpeedVideoSizes;
            com.google.common.collect.ImmutableList<androidx.media3.common.SimpleBasePlayer.PeriodData> immutableList = builder.getOutputStallDuration;
            this.periods = immutableList;
            long[] jArr = new long[immutableList.size()];
            this.getHighSpeedVideoFpsRanges = jArr;
            if (immutableList.isEmpty()) {
                return;
            }
            jArr[0] = -j;
            while (i < size - 1) {
                long[] jArr2 = this.getHighSpeedVideoFpsRanges;
                int i2 = i + 1;
                jArr2[i2] = jArr2[i] + this.periods.get(i).durationUs;
                i = i2;
            }
        }

        public final androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder buildUpon() {
            return new androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder(this, (byte) 0);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.SimpleBasePlayer.MediaItemData)) {
                return false;
            }
            androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData = (androidx.media3.common.SimpleBasePlayer.MediaItemData) obj;
            return this.uid.equals(mediaItemData.uid) && this.tracks.equals(mediaItemData.tracks) && this.mediaItem.equals(mediaItemData.mediaItem) && java.util.Objects.equals(this.mediaMetadata, mediaItemData.mediaMetadata) && java.util.Objects.equals(this.manifest, mediaItemData.manifest) && java.util.Objects.equals(this.liveConfiguration, mediaItemData.liveConfiguration) && this.presentationStartTimeMs == mediaItemData.presentationStartTimeMs && this.windowStartTimeMs == mediaItemData.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == mediaItemData.elapsedRealtimeEpochOffsetMs && this.isSeekable == mediaItemData.isSeekable && this.isDynamic == mediaItemData.isDynamic && this.defaultPositionUs == mediaItemData.defaultPositionUs && this.durationUs == mediaItemData.durationUs && this.positionInFirstPeriodUs == mediaItemData.positionInFirstPeriodUs && this.isPlaceholder == mediaItemData.isPlaceholder && this.periods.equals(mediaItemData.periods);
        }

        public final int hashCode() {
            int hashCode = this.uid.hashCode();
            int hashCode2 = this.tracks.hashCode();
            int hashCode3 = this.mediaItem.hashCode();
            androidx.media3.common.MediaMetadata mediaMetadata = this.mediaMetadata;
            int hashCode4 = mediaMetadata == null ? 0 : mediaMetadata.hashCode();
            java.lang.Object obj = this.manifest;
            int hashCode5 = obj == null ? 0 : obj.hashCode();
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int hashCode6 = liveConfiguration != null ? liveConfiguration.hashCode() : 0;
            long j = this.presentationStartTimeMs;
            long j2 = this.windowStartTimeMs;
            int i = (int) (j2 ^ (j2 >>> 32));
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            int i2 = (int) (j3 ^ (j3 >>> 32));
            boolean z = this.isSeekable;
            boolean z2 = this.isDynamic;
            long j4 = this.defaultPositionUs;
            long j5 = this.durationUs;
            int i3 = (int) (j5 ^ (j5 >>> 32));
            long j6 = this.positionInFirstPeriodUs;
            return ((((((((((((((((((((((((((((((hashCode + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + i) * 31) + i2) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + i3) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.periods.hashCode();
        }

        static /* synthetic */ androidx.media3.common.SimpleBasePlayer.MediaItemData getHighResolutionOutputSizeshNQ4ISI(androidx.media3.common.SimpleBasePlayer.State state, int i, androidx.media3.common.Timeline.Period period, androidx.media3.common.Timeline.Window window) {
            boolean z = androidx.media3.common.SimpleBasePlayer.getHighSpeedVideoFpsRanges(state) == i;
            state.timeline.getWindow(i, window);
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i2 = window.firstPeriodIndex; i2 <= window.lastPeriodIndex; i2++) {
                state.timeline.getPeriod(i2, period, true);
                builder.add((com.google.common.collect.ImmutableList.Builder) new androidx.media3.common.SimpleBasePlayer.PeriodData.Builder(com.google.common.base.Preconditions.checkNotNull(period.uid)).setAdPlaybackState(period.adPlaybackState).setDurationUs(period.durationUs).setIsPlaceholder(period.isPlaceholder).build());
            }
            return new androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder(window.uid).setDefaultPositionUs(window.defaultPositionUs).setDurationUs(window.durationUs).setElapsedRealtimeEpochOffsetMs(window.elapsedRealtimeEpochOffsetMs).setIsDynamic(window.isDynamic).setIsPlaceholder(window.isPlaceholder).setIsSeekable(window.isSeekable).setLiveConfiguration(window.liveConfiguration).setManifest(window.manifest).setMediaItem(window.mediaItem).setMediaMetadata(z ? state.currentMetadata : null).setPeriods(builder.build()).setPositionInFirstPeriodUs(window.positionInFirstPeriodUs).setPresentationStartTimeMs(window.presentationStartTimeMs).setTracks(z ? state.currentTracks : androidx.media3.common.Tracks.EMPTY).setWindowStartTimeMs(window.windowStartTimeMs).build();
        }

        static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData, int i) {
            if (mediaItemData.periods.isEmpty()) {
                return mediaItemData.uid;
            }
            return android.util.Pair.create(mediaItemData.uid, mediaItemData.periods.get(i).uid);
        }

        static /* synthetic */ androidx.media3.common.Timeline.Window Camera2StreamConfigurationMap(androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData, int i, androidx.media3.common.Timeline.Window window) {
            window.set(mediaItemData.uid, mediaItemData.mediaItem, mediaItemData.manifest, mediaItemData.presentationStartTimeMs, mediaItemData.windowStartTimeMs, mediaItemData.elapsedRealtimeEpochOffsetMs, mediaItemData.isSeekable, mediaItemData.isDynamic, mediaItemData.liveConfiguration, mediaItemData.defaultPositionUs, mediaItemData.durationUs, i, (i + (mediaItemData.periods.isEmpty() ? 1 : mediaItemData.periods.size())) - 1, mediaItemData.positionInFirstPeriodUs);
            window.isPlaceholder = mediaItemData.isPlaceholder;
            return window;
        }

        static /* synthetic */ androidx.media3.common.Timeline.Period getHighSpeedVideoSizes(androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData, int i, int i2, androidx.media3.common.Timeline.Period period) {
            if (mediaItemData.periods.isEmpty()) {
                java.lang.Object obj = mediaItemData.uid;
                long j = mediaItemData.positionInFirstPeriodUs;
                period.set(obj, obj, i, j + mediaItemData.durationUs, -j, androidx.media3.common.AdPlaybackState.NONE, mediaItemData.isPlaceholder);
                return period;
            }
            androidx.media3.common.SimpleBasePlayer.PeriodData periodData = mediaItemData.periods.get(i2);
            java.lang.Object obj2 = periodData.uid;
            period.set(obj2, android.util.Pair.create(mediaItemData.uid, obj2), i, periodData.durationUs, mediaItemData.getHighSpeedVideoFpsRanges[i2], periodData.adPlaybackState, periodData.isPlaceholder);
            return period;
        }
    }

    public static final class PeriodData {
        public final androidx.media3.common.AdPlaybackState adPlaybackState;
        public final long durationUs;
        public final boolean isPlaceholder;
        public final java.lang.Object uid;

        /* synthetic */ PeriodData(androidx.media3.common.SimpleBasePlayer.PeriodData.Builder builder, byte b) {
            this(builder);
        }

        public static final class Builder {
            private java.lang.Object Camera2StreamConfigurationMap;
            private androidx.media3.common.AdPlaybackState getHighResolutionOutputSizeshNQ4ISI;
            private long getHighSpeedVideoFpsRanges;
            private boolean getHighSpeedVideoSizes;

            /* synthetic */ Builder(androidx.media3.common.SimpleBasePlayer.PeriodData periodData, byte b) {
                this(periodData);
            }

            public Builder(java.lang.Object obj) {
                this.Camera2StreamConfigurationMap = obj;
                this.getHighSpeedVideoFpsRanges = 0L;
                this.getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.AdPlaybackState.NONE;
                this.getHighSpeedVideoSizes = false;
            }

            private Builder(androidx.media3.common.SimpleBasePlayer.PeriodData periodData) {
                this.Camera2StreamConfigurationMap = periodData.uid;
                this.getHighSpeedVideoFpsRanges = periodData.durationUs;
                this.getHighResolutionOutputSizeshNQ4ISI = periodData.adPlaybackState;
                this.getHighSpeedVideoSizes = periodData.isPlaceholder;
            }

            public final androidx.media3.common.SimpleBasePlayer.PeriodData.Builder setUid(java.lang.Object obj) {
                this.Camera2StreamConfigurationMap = obj;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.PeriodData.Builder setDurationUs(long j) {
                com.google.common.base.Preconditions.checkArgument(j == androidx.media3.common.C.TIME_UNSET || j >= 0);
                this.getHighSpeedVideoFpsRanges = j;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.PeriodData.Builder setAdPlaybackState(androidx.media3.common.AdPlaybackState adPlaybackState) {
                this.getHighResolutionOutputSizeshNQ4ISI = adPlaybackState;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.PeriodData.Builder setIsPlaceholder(boolean z) {
                this.getHighSpeedVideoSizes = z;
                return this;
            }

            public final androidx.media3.common.SimpleBasePlayer.PeriodData build() {
                return new androidx.media3.common.SimpleBasePlayer.PeriodData(this, (byte) 0);
            }
        }

        private PeriodData(androidx.media3.common.SimpleBasePlayer.PeriodData.Builder builder) {
            this.uid = builder.Camera2StreamConfigurationMap;
            this.durationUs = builder.getHighSpeedVideoFpsRanges;
            this.adPlaybackState = builder.getHighResolutionOutputSizeshNQ4ISI;
            this.isPlaceholder = builder.getHighSpeedVideoSizes;
        }

        public final androidx.media3.common.SimpleBasePlayer.PeriodData.Builder buildUpon() {
            return new androidx.media3.common.SimpleBasePlayer.PeriodData.Builder(this, (byte) 0);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.SimpleBasePlayer.PeriodData)) {
                return false;
            }
            androidx.media3.common.SimpleBasePlayer.PeriodData periodData = (androidx.media3.common.SimpleBasePlayer.PeriodData) obj;
            return this.uid.equals(periodData.uid) && this.durationUs == periodData.durationUs && this.adPlaybackState.equals(periodData.adPlaybackState) && this.isPlaceholder == periodData.isPlaceholder;
        }

        public final int hashCode() {
            int hashCode = this.uid.hashCode();
            long j = this.durationUs;
            return ((((((hashCode + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.adPlaybackState.hashCode()) * 31) + (this.isPlaceholder ? 1 : 0);
        }
    }

    public interface PositionSupplier {
        public static final androidx.media3.common.SimpleBasePlayer.PositionSupplier ZERO = getConstant(0);

        static /* synthetic */ long lambda$getConstant$0(long j) {
            return j;
        }

        long get();

        static androidx.media3.common.SimpleBasePlayer.PositionSupplier getConstant(final long j) {
            return new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return androidx.media3.common.SimpleBasePlayer.PositionSupplier.lambda$getConstant$0(j);
                }
            };
        }

        static androidx.media3.common.SimpleBasePlayer.PositionSupplier getExtrapolating(final long j, final float f) {
            final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            return new androidx.media3.common.SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return androidx.media3.common.SimpleBasePlayer.PositionSupplier.lambda$getExtrapolating$1(j, elapsedRealtime, f);
                }
            };
        }

        static /* synthetic */ long lambda$getExtrapolating$1(long j, long j2, float f) {
            return j + ((long) ((android.os.SystemClock.elapsedRealtime() - j2) * f));
        }
    }

    public static final class LivePositionSupplier implements androidx.media3.common.SimpleBasePlayer.PositionSupplier {
        private long getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.C.TIME_UNSET;
        private final androidx.media3.common.SimpleBasePlayer.PositionSupplier getHighSpeedVideoFpsRangesFor;

        public LivePositionSupplier(androidx.media3.common.SimpleBasePlayer.PositionSupplier positionSupplier) {
            this.getHighSpeedVideoFpsRangesFor = positionSupplier;
        }

        public final void disconnect(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI = j;
        }

        @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
        public final long get() {
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            return j != androidx.media3.common.C.TIME_UNSET ? j : this.getHighSpeedVideoFpsRangesFor.get();
        }
    }

    protected SimpleBasePlayer(android.os.Looper looper) {
        this(looper, androidx.media3.common.util.Clock.DEFAULT);
    }

    protected SimpleBasePlayer(android.os.Looper looper, androidx.media3.common.util.Clock clock) {
        this.Camera2StreamConfigurationMap = looper;
        this.getHighSpeedVideoSizes = clock.createHandler(looper, null);
        this.getHighSpeedVideoFpsRanges = new java.util.HashSet<>();
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.media3.common.Timeline.Period();
        this.getHighSpeedVideoFpsRangesFor = new androidx.media3.common.util.ListenerSet<>(looper, clock, new androidx.media3.common.util.ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda40
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(java.lang.Object obj, androidx.media3.common.FlagSet flagSet) {
                ((androidx.media3.common.Player.Listener) obj).onEvents(androidx.media3.common.SimpleBasePlayer.this, new androidx.media3.common.Player.Events(flagSet));
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void addListener(androidx.media3.common.Player.Listener listener) {
        this.getHighSpeedVideoFpsRangesFor.add((androidx.media3.common.Player.Listener) com.google.common.base.Preconditions.checkNotNull(listener));
    }

    @Override // androidx.media3.common.Player
    public final android.os.Looper getApplicationLooper() {
        return this.Camera2StreamConfigurationMap;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void Camera2StreamConfigurationMap(final java.util.List<androidx.media3.common.MediaItem> list, final int i, final long j) {
        com.google.common.base.Preconditions.checkArgument(i == -1 || i >= 0);
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if ((this.getOutputMinFrameDuration || !state.availableCommands.contains(20)) && !(list.size() == 1 && !this.getOutputMinFrameDuration && this.getHighSpeedVideoSizesFor.availableCommands.contains(31))) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetMediaItems(list, i, j), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda30
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return androidx.media3.common.SimpleBasePlayer.this.getHighSpeedVideoSizes(list, state, i, j);
            }
        }, false, false);
    }

    final /* synthetic */ androidx.media3.common.SimpleBasePlayer.State getHighSpeedVideoSizes(java.util.List list, androidx.media3.common.SimpleBasePlayer.State state, int i, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(getPlaceholderMediaItemData((androidx.media3.common.MediaItem) list.get(i2)));
        }
        return getHighSpeedVideoFpsRanges(state, arrayList, i, j, this.window);
    }

    final /* synthetic */ androidx.media3.common.SimpleBasePlayer.State getHighSpeedVideoFpsRanges(androidx.media3.common.SimpleBasePlayer.State state, java.util.List list, int i) {
        java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(state, this.getHighResolutionOutputSizeshNQ4ISI, this.window);
        for (int i2 = 0; i2 < list.size(); i2++) {
            highSpeedVideoFpsRangesFor.add(i2 + i, getPlaceholderMediaItemData((androidx.media3.common.MediaItem) list.get(i2)));
        }
        if (!state.timeline.isEmpty()) {
            return getHighSpeedVideoFpsRanges(state, highSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.window);
        }
        return getHighSpeedVideoFpsRanges(state, highSpeedVideoFpsRangesFor, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), this.window);
    }

    final /* synthetic */ androidx.media3.common.SimpleBasePlayer.State getHighSpeedVideoSizes(androidx.media3.common.SimpleBasePlayer.State state, int i, int i2, int i3) {
        java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(state, this.getHighResolutionOutputSizeshNQ4ISI, this.window);
        androidx.media3.common.util.Util.moveItems(highSpeedVideoFpsRangesFor, i, i2, i3);
        return getHighSpeedVideoFpsRanges(state, highSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.window);
    }

    final /* synthetic */ androidx.media3.common.SimpleBasePlayer.State getHighSpeedVideoFpsRangesFor(androidx.media3.common.SimpleBasePlayer.State state, java.util.List list, int i, int i2) {
        androidx.media3.common.SimpleBasePlayer.State highSpeedVideoFpsRanges;
        java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(state, this.getHighResolutionOutputSizeshNQ4ISI, this.window);
        for (int i3 = 0; i3 < list.size(); i3++) {
            highSpeedVideoFpsRangesFor.add(i3 + i, getPlaceholderMediaItemData((androidx.media3.common.MediaItem) list.get(i3)));
        }
        if (!state.timeline.isEmpty()) {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(state, highSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.window);
        } else {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(state, highSpeedVideoFpsRangesFor, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), this.window);
        }
        if (i2 >= i) {
            return highSpeedVideoFpsRanges;
        }
        androidx.media3.common.util.Util.removeRange(highSpeedVideoFpsRangesFor, i2, i);
        return getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, highSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.window);
    }

    final /* synthetic */ androidx.media3.common.SimpleBasePlayer.State getHighSpeedVideoSizes(androidx.media3.common.SimpleBasePlayer.State state, int i, int i2) {
        java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(state, this.getHighResolutionOutputSizeshNQ4ISI, this.window);
        androidx.media3.common.util.Util.removeRange(highSpeedVideoFpsRangesFor, i, i2);
        return getHighSpeedVideoFpsRanges(state, highSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.window);
    }

    final /* synthetic */ androidx.media3.common.SimpleBasePlayer.State getHighResolutionOutputSizeshNQ4ISI(boolean z, androidx.media3.common.SimpleBasePlayer.State state, int i, long j) {
        return z ? state : getHighSpeedVideoFpsRanges(state, null, i, j, this.window);
    }

    final /* synthetic */ androidx.media3.common.SimpleBasePlayer.State getOutputMinFrameDurationlomOqCM(androidx.media3.common.SimpleBasePlayer.State state) {
        return state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO).setContentBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(getHighSpeedVideoFpsRangesFor(state.contentPositionMsSupplier.get(), state, this.window))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface() {
        Camera2StreamConfigurationMap((java.lang.Object) null);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface(android.view.Surface surface) {
        Camera2StreamConfigurationMap(surface);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        Camera2StreamConfigurationMap(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        Camera2StreamConfigurationMap(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(android.view.TextureView textureView) {
        Camera2StreamConfigurationMap(textureView);
    }

    protected androidx.media3.common.SimpleBasePlayer.MediaItemData getPlaceholderMediaItemData(androidx.media3.common.MediaItem mediaItem) {
        return new androidx.media3.common.SimpleBasePlayer.MediaItemData.Builder(new androidx.media3.common.SimpleBasePlayer.PlaceholderUid((byte) 0)).setMediaItem(mediaItem).setIsDynamic(true).setIsPlaceholder(true).build();
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlayWhenReady(boolean z) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handlePrepare() {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleStop() {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleRelease() {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetRepeatMode(int i) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetShuffleModeEnabled(boolean z) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    @java.lang.Deprecated
    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetVolume(float f) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetVolume(float f, int i) {
        return handleSetVolume(f);
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetDeviceVolume(int i, int i2) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleIncreaseDeviceVolume(int i) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleDecreaseDeviceVolume(int i) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetDeviceMuted(boolean z, int i) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetVideoOutput(java.lang.Object obj) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleClearVideoOutput(java.lang.Object obj) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSetMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleAddMediaItems(int i, java.util.List<androidx.media3.common.MediaItem> list) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleMoveMediaItems(int i, int i2, int i3) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleReplaceMediaItems(int i, int i2, java.util.List<androidx.media3.common.MediaItem> list) {
        com.google.common.util.concurrent.ListenableFuture<?> handleAddMediaItems = handleAddMediaItems(i2, list);
        if (i == i2) {
            return handleAddMediaItems;
        }
        final com.google.common.util.concurrent.ListenableFuture<?> handleRemoveMediaItems = handleRemoveMediaItems(i, i2);
        return androidx.media3.common.util.Util.transformFutureAsync(handleAddMediaItems, new com.google.common.util.concurrent.AsyncFunction() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda56
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return androidx.media3.common.SimpleBasePlayer.getHighSpeedVideoFpsRanges(com.google.common.util.concurrent.ListenableFuture.this);
            }
        });
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleRemoveMediaItems(int i, int i2) {
        throw new java.lang.IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected com.google.common.util.concurrent.ListenableFuture<?> handleSeek(int i, long j, int i2) {
        throw new java.lang.IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    protected final void verifyApplicationThread() {
        if (java.lang.Thread.currentThread() != this.Camera2StreamConfigurationMap.getThread()) {
            throw new java.lang.IllegalStateException(androidx.media3.common.util.Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\n", java.lang.Thread.currentThread().getName(), this.Camera2StreamConfigurationMap.getThread().getName()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x015f, code lost:
    
        if (r23 != false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x026f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0343  */
    /* JADX WARN: Type inference failed for: r5v44, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [int] */
    /* JADX WARN: Type inference failed for: r7v25 */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRangesFor(final androidx.media3.common.SimpleBasePlayer.State state, boolean z, boolean z2) {
        final int i;
        boolean z3;
        final int i2;
        boolean z4;
        int i3;
        boolean z5;
        final androidx.media3.common.MediaItem mediaItem;
        final int i4;
        androidx.media3.common.SimpleBasePlayer.State state2 = this.getHighSpeedVideoSizesFor;
        this.getHighSpeedVideoSizesFor = state;
        if (state.hasPositionDiscontinuity || state.newlyRenderedFirstFrame) {
            this.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizesFor.buildUpon().clearPositionDiscontinuity().setNewlyRenderedFirstFrame(false).build();
        }
        boolean z6 = state2.playWhenReady != state.playWhenReady;
        boolean z7 = state2.playbackState != state.playbackState;
        androidx.media3.common.Timeline.Window window = this.window;
        androidx.media3.common.Timeline.Period period = this.getHighResolutionOutputSizeshNQ4ISI;
        if (state.hasPositionDiscontinuity) {
            i = state.positionDiscontinuityReason;
        } else if (z) {
            i = 1;
        } else {
            if (!state2.timeline.isEmpty()) {
                if (!state.timeline.isEmpty()) {
                    java.lang.Object uidOfPeriod = state2.timeline.getUidOfPeriod(getHighSpeedVideoFpsRanges(state2, window, period));
                    java.lang.Object uidOfPeriod2 = state.timeline.getUidOfPeriod(getHighSpeedVideoFpsRanges(state, window, period));
                    if (!(uidOfPeriod instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid) || (uidOfPeriod2 instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid)) {
                        if (!uidOfPeriod2.equals(uidOfPeriod) || state2.currentAdGroupIndex != state.currentAdGroupIndex || state2.currentAdIndexInAdGroup != state.currentAdIndexInAdGroup) {
                            if (state.timeline.getIndexOfPeriod(uidOfPeriod) != -1) {
                                long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(state2, uidOfPeriod, period, window);
                                long highSpeedVideoSizes = getHighSpeedVideoSizes(state2, uidOfPeriod, period);
                                if (highSpeedVideoSizes == androidx.media3.common.C.TIME_UNSET || Camera2StreamConfigurationMap < highSpeedVideoSizes) {
                                    i = 3;
                                }
                                i = 0;
                            }
                        } else {
                            long Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(state2, uidOfPeriod, period, window);
                            if (java.lang.Math.abs(Camera2StreamConfigurationMap2 - Camera2StreamConfigurationMap(state, uidOfPeriod2, period, window)) >= 1000) {
                                long highSpeedVideoSizes2 = getHighSpeedVideoSizes(state2, uidOfPeriod, period);
                                if (highSpeedVideoSizes2 == androidx.media3.common.C.TIME_UNSET || Camera2StreamConfigurationMap2 < highSpeedVideoSizes2) {
                                    i = 5;
                                }
                                i = 0;
                            }
                        }
                    }
                }
                i = 4;
            }
            i = -1;
        }
        boolean equals = state2.timeline.equals(state.timeline);
        androidx.media3.common.Timeline.Window window2 = this.window;
        androidx.media3.common.Timeline timeline = state2.timeline;
        androidx.media3.common.Timeline timeline2 = state.timeline;
        if (!timeline2.isEmpty() || !timeline.isEmpty()) {
            if (timeline2.isEmpty() == timeline.isEmpty()) {
                java.lang.Object obj = state2.timeline.getWindow(state2.currentMediaItemIndex != -1 ? state2.currentMediaItemIndex : 0, window2).uid;
                java.lang.Object obj2 = state.timeline.getWindow(state.currentMediaItemIndex != -1 ? state.currentMediaItemIndex : 0, window2).uid;
                if (!(obj instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid) || (obj2 instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid)) {
                    if (obj.equals(obj2)) {
                        if (i == 0) {
                            z3 = z7;
                            if (getHighSpeedVideoFpsRangesFor(state2.contentPositionMsSupplier.get(), state2, window2) > getHighSpeedVideoFpsRangesFor(state.contentPositionMsSupplier.get(), state, window2)) {
                                i2 = 0;
                            }
                        } else {
                            z3 = z7;
                        }
                        if (i == 1) {
                        }
                        i2 = -1;
                    } else if (i == 0) {
                        z3 = z7;
                        i2 = 1;
                    } else if (i == 1) {
                        z3 = z7;
                        i2 = 2;
                    }
                    if (equals) {
                        z4 = false;
                    } else {
                        androidx.media3.common.Timeline timeline3 = state2.timeline;
                        androidx.media3.common.Timeline timeline4 = state.timeline;
                        androidx.media3.common.Timeline.Window window3 = this.window;
                        if (timeline3.getWindowCount() == timeline4.getWindowCount()) {
                            for (int i5 = 0; i5 < timeline3.getWindowCount(); i5++) {
                                java.lang.Object obj3 = timeline3.getWindow(i5, window3).uid;
                                java.lang.Object obj4 = timeline4.getWindow(i5, window3).uid;
                                boolean z8 = (obj3 instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid) && !(obj4 instanceof androidx.media3.common.SimpleBasePlayer.PlaceholderUid);
                                if (obj3.equals(obj4) || z8) {
                                }
                            }
                            i4 = 1;
                            z4 = false;
                            this.getHighSpeedVideoFpsRangesFor.queueEvent(0, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda44
                                @Override // androidx.media3.common.util.ListenerSet.Event
                                public final void invoke(java.lang.Object obj5) {
                                    androidx.media3.common.Player.Listener listener = (androidx.media3.common.Player.Listener) obj5;
                                    listener.onTimelineChanged(androidx.media3.common.SimpleBasePlayer.State.this.timeline, i4);
                                }
                            });
                        }
                        i4 = 0;
                        z4 = false;
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(0, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda44
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                androidx.media3.common.Player.Listener listener = (androidx.media3.common.Player.Listener) obj5;
                                listener.onTimelineChanged(androidx.media3.common.SimpleBasePlayer.State.this.timeline, i4);
                            }
                        });
                    }
                    if (i != -1) {
                        final androidx.media3.common.Player.PositionInfo highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(state2, z4, this.window, this.getHighResolutionOutputSizeshNQ4ISI);
                        final androidx.media3.common.Player.PositionInfo highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(state, state.hasPositionDiscontinuity, this.window, this.getHighResolutionOutputSizeshNQ4ISI);
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(11, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda6
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                androidx.media3.common.SimpleBasePlayer.getHighResolutionOutputSizeshNQ4ISI(i, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, (androidx.media3.common.Player.Listener) obj5);
                            }
                        });
                    }
                    if (i2 != -1) {
                        if (state.timeline.isEmpty()) {
                            mediaItem = null;
                        } else {
                            mediaItem = state.timeline.getWindow(state.currentMediaItemIndex != -1 ? state.currentMediaItemIndex : z4, this.window).mediaItem;
                        }
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda18
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                ((androidx.media3.common.Player.Listener) obj5).onMediaItemTransition(androidx.media3.common.MediaItem.this, i2);
                            }
                        });
                    }
                    if (!java.util.Objects.equals(state2.playerError, state.playerError)) {
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda20
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                ((androidx.media3.common.Player.Listener) obj5).onPlayerErrorChanged(androidx.media3.common.SimpleBasePlayer.State.this.playerError);
                            }
                        });
                        if (state.playerError != null) {
                            this.getHighSpeedVideoFpsRangesFor.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda21
                                @Override // androidx.media3.common.util.ListenerSet.Event
                                public final void invoke(java.lang.Object obj5) {
                                    ((androidx.media3.common.Player.Listener) obj5).onPlayerError((androidx.media3.common.PlaybackException) androidx.media3.common.util.Util.castNonNull(androidx.media3.common.SimpleBasePlayer.State.this.playerError));
                                }
                            });
                        }
                    }
                    if (!state2.trackSelectionParameters.equals(state.trackSelectionParameters)) {
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(19, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda23
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                ((androidx.media3.common.Player.Listener) obj5).onTrackSelectionParametersChanged(androidx.media3.common.SimpleBasePlayer.State.this.trackSelectionParameters);
                            }
                        });
                    }
                    if (!state2.currentTracks.equals(state.currentTracks)) {
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(2, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda24
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                ((androidx.media3.common.Player.Listener) obj5).onTracksChanged(androidx.media3.common.SimpleBasePlayer.State.this.currentTracks);
                            }
                        });
                    }
                    if (!state2.currentMetadata.equals(state.currentMetadata)) {
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(14, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda25
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                ((androidx.media3.common.Player.Listener) obj5).onMediaMetadataChanged(androidx.media3.common.SimpleBasePlayer.State.this.currentMetadata);
                            }
                        });
                    }
                    if (state2.isLoading != state.isLoading) {
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(3, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda26
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                androidx.media3.common.SimpleBasePlayer.getInputSizeshNQ4ISI(androidx.media3.common.SimpleBasePlayer.State.this, (androidx.media3.common.Player.Listener) obj5);
                            }
                        });
                    }
                    if (!z6 || z3) {
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(-1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda27
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                ((androidx.media3.common.Player.Listener) obj5).onPlayerStateChanged(r0.playWhenReady, androidx.media3.common.SimpleBasePlayer.State.this.playbackState);
                            }
                        });
                    }
                    if (z3) {
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(4, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda55
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                ((androidx.media3.common.Player.Listener) obj5).onPlaybackStateChanged(androidx.media3.common.SimpleBasePlayer.State.this.playbackState);
                            }
                        });
                    }
                    if (!z6 || state2.playWhenReadyChangeReason != state.playWhenReadyChangeReason) {
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(5, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda63
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                ((androidx.media3.common.Player.Listener) obj5).onPlayWhenReadyChanged(r0.playWhenReady, androidx.media3.common.SimpleBasePlayer.State.this.playWhenReadyChangeReason);
                            }
                        });
                    }
                    if (state2.playbackSuppressionReason != state.playbackSuppressionReason) {
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(6, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda64
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                ((androidx.media3.common.Player.Listener) obj5).onPlaybackSuppressionReasonChanged(androidx.media3.common.SimpleBasePlayer.State.this.playbackSuppressionReason);
                            }
                        });
                    }
                    if (state2.playWhenReady) {
                        i3 = 3;
                        if (state2.playbackState == 3 && state2.playbackSuppressionReason == 0) {
                            z5 = true;
                            if (z5 != ((!state.playWhenReady && state.playbackState == i3 && state.playbackSuppressionReason == 0) ? true : z4)) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(7, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda65
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        androidx.media3.common.SimpleBasePlayer.State state3 = androidx.media3.common.SimpleBasePlayer.State.this;
                                        ((androidx.media3.common.Player.Listener) obj5).onIsPlayingChanged(r2.playWhenReady && r2.playbackState == 3 && r2.playbackSuppressionReason == 0);
                                    }
                                });
                            }
                            if (!state2.playbackParameters.equals(state.playbackParameters)) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(12, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda66
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onPlaybackParametersChanged(androidx.media3.common.SimpleBasePlayer.State.this.playbackParameters);
                                    }
                                });
                            }
                            if (state2.repeatMode != state.repeatMode) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(8, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda1
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onRepeatModeChanged(androidx.media3.common.SimpleBasePlayer.State.this.repeatMode);
                                    }
                                });
                            }
                            if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(9, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda2
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onShuffleModeEnabledChanged(androidx.media3.common.SimpleBasePlayer.State.this.shuffleModeEnabled);
                                    }
                                });
                            }
                            if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(16, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda3
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onSeekBackIncrementChanged(androidx.media3.common.SimpleBasePlayer.State.this.seekBackIncrementMs);
                                    }
                                });
                            }
                            if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(17, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda4
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onSeekForwardIncrementChanged(androidx.media3.common.SimpleBasePlayer.State.this.seekForwardIncrementMs);
                                    }
                                });
                            }
                            if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(18, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda5
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onMaxSeekToPreviousPositionChanged(androidx.media3.common.SimpleBasePlayer.State.this.maxSeekToPreviousPositionMs);
                                    }
                                });
                            }
                            if (!state2.audioAttributes.equals(state.audioAttributes)) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(20, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda7
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onAudioAttributesChanged(androidx.media3.common.SimpleBasePlayer.State.this.audioAttributes);
                                    }
                                });
                            }
                            if (!state2.videoSize.equals(state.videoSize)) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(25, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda8
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onVideoSizeChanged(androidx.media3.common.SimpleBasePlayer.State.this.videoSize);
                                    }
                                });
                            }
                            if (!state2.deviceInfo.equals(state.deviceInfo)) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(29, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda9
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onDeviceInfoChanged(androidx.media3.common.SimpleBasePlayer.State.this.deviceInfo);
                                    }
                                });
                            }
                            if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(15, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda10
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onPlaylistMetadataChanged(androidx.media3.common.SimpleBasePlayer.State.this.playlistMetadata);
                                    }
                                });
                            }
                            if (state.newlyRenderedFirstFrame) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(26, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda12
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onRenderedFirstFrame();
                                    }
                                });
                            }
                            if (!state2.surfaceSize.equals(state.surfaceSize)) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(24, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda13
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onSurfaceSizeChanged(r0.surfaceSize.getWidth(), androidx.media3.common.SimpleBasePlayer.State.this.surfaceSize.getHeight());
                                    }
                                });
                            }
                            if (state2.volume != state.volume) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(22, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda14
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onVolumeChanged(androidx.media3.common.SimpleBasePlayer.State.this.volume);
                                    }
                                });
                            }
                            if (state2.deviceVolume == state.deviceVolume || state2.isDeviceMuted != state.isDeviceMuted) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda15
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onDeviceVolumeChanged(r0.deviceVolume, androidx.media3.common.SimpleBasePlayer.State.this.isDeviceMuted);
                                    }
                                });
                            }
                            if (!state2.currentCues.equals(state.currentCues)) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(27, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda16
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        androidx.media3.common.SimpleBasePlayer.ArtificialStackFrames(androidx.media3.common.SimpleBasePlayer.State.this, (androidx.media3.common.Player.Listener) obj5);
                                    }
                                });
                            }
                            if (!state2.timedMetadata.equals(state.timedMetadata) && state.timedMetadata.presentationTimeUs != androidx.media3.common.C.TIME_UNSET) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(28, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda17
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onMetadata(androidx.media3.common.SimpleBasePlayer.State.this.timedMetadata);
                                    }
                                });
                            }
                            if (!state2.availableCommands.equals(state.availableCommands)) {
                                this.getHighSpeedVideoFpsRangesFor.queueEvent(13, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda19
                                    @Override // androidx.media3.common.util.ListenerSet.Event
                                    public final void invoke(java.lang.Object obj5) {
                                        ((androidx.media3.common.Player.Listener) obj5).onAvailableCommandsChanged(androidx.media3.common.SimpleBasePlayer.State.this.availableCommands);
                                    }
                                });
                            }
                            this.getHighSpeedVideoFpsRangesFor.flushEvents();
                        }
                    } else {
                        i3 = 3;
                    }
                    z5 = z4;
                    if (z5 != ((!state.playWhenReady && state.playbackState == i3 && state.playbackSuppressionReason == 0) ? true : z4)) {
                    }
                    if (!state2.playbackParameters.equals(state.playbackParameters)) {
                    }
                    if (state2.repeatMode != state.repeatMode) {
                    }
                    if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
                    }
                    if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
                    }
                    if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
                    }
                    if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
                    }
                    if (!state2.audioAttributes.equals(state.audioAttributes)) {
                    }
                    if (!state2.videoSize.equals(state.videoSize)) {
                    }
                    if (!state2.deviceInfo.equals(state.deviceInfo)) {
                    }
                    if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
                    }
                    if (state.newlyRenderedFirstFrame) {
                    }
                    if (!state2.surfaceSize.equals(state.surfaceSize)) {
                    }
                    if (state2.volume != state.volume) {
                    }
                    if (state2.deviceVolume == state.deviceVolume) {
                    }
                    this.getHighSpeedVideoFpsRangesFor.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda15
                        @Override // androidx.media3.common.util.ListenerSet.Event
                        public final void invoke(java.lang.Object obj5) {
                            ((androidx.media3.common.Player.Listener) obj5).onDeviceVolumeChanged(r0.deviceVolume, androidx.media3.common.SimpleBasePlayer.State.this.isDeviceMuted);
                        }
                    });
                    if (!state2.currentCues.equals(state.currentCues)) {
                    }
                    if (!state2.timedMetadata.equals(state.timedMetadata)) {
                        this.getHighSpeedVideoFpsRangesFor.queueEvent(28, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda17
                            @Override // androidx.media3.common.util.ListenerSet.Event
                            public final void invoke(java.lang.Object obj5) {
                                ((androidx.media3.common.Player.Listener) obj5).onMetadata(androidx.media3.common.SimpleBasePlayer.State.this.timedMetadata);
                            }
                        });
                    }
                    if (!state2.availableCommands.equals(state.availableCommands)) {
                    }
                    this.getHighSpeedVideoFpsRangesFor.flushEvents();
                }
            }
            z3 = z7;
            i2 = 3;
            if (equals) {
            }
            if (i != -1) {
            }
            if (i2 != -1) {
            }
            if (!java.util.Objects.equals(state2.playerError, state.playerError)) {
            }
            if (!state2.trackSelectionParameters.equals(state.trackSelectionParameters)) {
            }
            if (!state2.currentTracks.equals(state.currentTracks)) {
            }
            if (!state2.currentMetadata.equals(state.currentMetadata)) {
            }
            if (state2.isLoading != state.isLoading) {
            }
            if (!z6) {
            }
            this.getHighSpeedVideoFpsRangesFor.queueEvent(-1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda27
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj5) {
                    ((androidx.media3.common.Player.Listener) obj5).onPlayerStateChanged(r0.playWhenReady, androidx.media3.common.SimpleBasePlayer.State.this.playbackState);
                }
            });
            if (z3) {
            }
            if (!z6) {
            }
            this.getHighSpeedVideoFpsRangesFor.queueEvent(5, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda63
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj5) {
                    ((androidx.media3.common.Player.Listener) obj5).onPlayWhenReadyChanged(r0.playWhenReady, androidx.media3.common.SimpleBasePlayer.State.this.playWhenReadyChangeReason);
                }
            });
            if (state2.playbackSuppressionReason != state.playbackSuppressionReason) {
            }
            if (state2.playWhenReady) {
            }
            z5 = z4;
            if (z5 != ((!state.playWhenReady && state.playbackState == i3 && state.playbackSuppressionReason == 0) ? true : z4)) {
            }
            if (!state2.playbackParameters.equals(state.playbackParameters)) {
            }
            if (state2.repeatMode != state.repeatMode) {
            }
            if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
            }
            if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
            }
            if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
            }
            if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
            }
            if (!state2.audioAttributes.equals(state.audioAttributes)) {
            }
            if (!state2.videoSize.equals(state.videoSize)) {
            }
            if (!state2.deviceInfo.equals(state.deviceInfo)) {
            }
            if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
            }
            if (state.newlyRenderedFirstFrame) {
            }
            if (!state2.surfaceSize.equals(state.surfaceSize)) {
            }
            if (state2.volume != state.volume) {
            }
            if (state2.deviceVolume == state.deviceVolume) {
            }
            this.getHighSpeedVideoFpsRangesFor.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda15
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj5) {
                    ((androidx.media3.common.Player.Listener) obj5).onDeviceVolumeChanged(r0.deviceVolume, androidx.media3.common.SimpleBasePlayer.State.this.isDeviceMuted);
                }
            });
            if (!state2.currentCues.equals(state.currentCues)) {
            }
            if (!state2.timedMetadata.equals(state.timedMetadata)) {
            }
            if (!state2.availableCommands.equals(state.availableCommands)) {
            }
            this.getHighSpeedVideoFpsRangesFor.flushEvents();
        }
        z3 = z7;
        i2 = -1;
        if (equals) {
        }
        if (i != -1) {
        }
        if (i2 != -1) {
        }
        if (!java.util.Objects.equals(state2.playerError, state.playerError)) {
        }
        if (!state2.trackSelectionParameters.equals(state.trackSelectionParameters)) {
        }
        if (!state2.currentTracks.equals(state.currentTracks)) {
        }
        if (!state2.currentMetadata.equals(state.currentMetadata)) {
        }
        if (state2.isLoading != state.isLoading) {
        }
        if (!z6) {
        }
        this.getHighSpeedVideoFpsRangesFor.queueEvent(-1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda27
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj5) {
                ((androidx.media3.common.Player.Listener) obj5).onPlayerStateChanged(r0.playWhenReady, androidx.media3.common.SimpleBasePlayer.State.this.playbackState);
            }
        });
        if (z3) {
        }
        if (!z6) {
        }
        this.getHighSpeedVideoFpsRangesFor.queueEvent(5, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda63
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj5) {
                ((androidx.media3.common.Player.Listener) obj5).onPlayWhenReadyChanged(r0.playWhenReady, androidx.media3.common.SimpleBasePlayer.State.this.playWhenReadyChangeReason);
            }
        });
        if (state2.playbackSuppressionReason != state.playbackSuppressionReason) {
        }
        if (state2.playWhenReady) {
        }
        z5 = z4;
        if (z5 != ((!state.playWhenReady && state.playbackState == i3 && state.playbackSuppressionReason == 0) ? true : z4)) {
        }
        if (!state2.playbackParameters.equals(state.playbackParameters)) {
        }
        if (state2.repeatMode != state.repeatMode) {
        }
        if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
        }
        if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
        }
        if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
        }
        if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
        }
        if (!state2.audioAttributes.equals(state.audioAttributes)) {
        }
        if (!state2.videoSize.equals(state.videoSize)) {
        }
        if (!state2.deviceInfo.equals(state.deviceInfo)) {
        }
        if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
        }
        if (state.newlyRenderedFirstFrame) {
        }
        if (!state2.surfaceSize.equals(state.surfaceSize)) {
        }
        if (state2.volume != state.volume) {
        }
        if (state2.deviceVolume == state.deviceVolume) {
        }
        this.getHighSpeedVideoFpsRangesFor.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda15
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj5) {
                ((androidx.media3.common.Player.Listener) obj5).onDeviceVolumeChanged(r0.deviceVolume, androidx.media3.common.SimpleBasePlayer.State.this.isDeviceMuted);
            }
        });
        if (!state2.currentCues.equals(state.currentCues)) {
        }
        if (!state2.timedMetadata.equals(state.timedMetadata)) {
        }
        if (!state2.availableCommands.equals(state.availableCommands)) {
        }
        this.getHighSpeedVideoFpsRangesFor.flushEvents();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, androidx.media3.common.Player.Listener listener) {
        listener.onPositionDiscontinuity(i);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i);
    }

    static /* synthetic */ void getInputSizeshNQ4ISI(androidx.media3.common.SimpleBasePlayer.State state, androidx.media3.common.Player.Listener listener) {
        listener.onLoadingChanged(state.isLoading);
        listener.onIsLoadingChanged(state.isLoading);
    }

    static /* synthetic */ void ArtificialStackFrames(androidx.media3.common.SimpleBasePlayer.State state, androidx.media3.common.Player.Listener listener) {
        listener.onCues(state.currentCues.cues);
        listener.onCues(state.currentCues);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"state"})
    private void getHighResolutionOutputSizeshNQ4ISI(final com.google.common.util.concurrent.ListenableFuture<?> listenableFuture, com.google.common.base.Supplier<androidx.media3.common.SimpleBasePlayer.State> supplier, boolean z, boolean z2) {
        if (listenableFuture.isDone() && this.getHighSpeedVideoFpsRanges.isEmpty()) {
            getHighSpeedVideoFpsRangesFor(getState(), z, z2);
            return;
        }
        this.getHighSpeedVideoFpsRanges.add(listenableFuture);
        getHighSpeedVideoFpsRangesFor(getPlaceholderState(supplier.get()), z, z2);
        listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.common.SimpleBasePlayer.this.Camera2StreamConfigurationMap(listenableFuture);
            }
        }, new java.util.concurrent.Executor() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda34
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                androidx.media3.common.SimpleBasePlayer.$r8$lambda$FFq8QvDrngTZgwNelLGa_12THc4(androidx.media3.common.SimpleBasePlayer.this, runnable);
            }
        });
    }

    final /* synthetic */ void Camera2StreamConfigurationMap(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        androidx.media3.common.util.Util.castNonNull(this.getHighSpeedVideoSizesFor);
        this.getHighSpeedVideoFpsRanges.remove(listenableFuture);
        if (!this.getHighSpeedVideoFpsRanges.isEmpty() || this.getOutputMinFrameDuration) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(getState(), false, false);
    }

    private static long getHighSpeedVideoFpsRangesFor(long j, androidx.media3.common.SimpleBasePlayer.State state, androidx.media3.common.Timeline.Window window) {
        if (j != androidx.media3.common.C.TIME_UNSET) {
            return j;
        }
        if (state.timeline.isEmpty()) {
            return 0L;
        }
        return state.timeline.getWindow(state.currentMediaItemIndex != -1 ? state.currentMediaItemIndex : 0, window).getDefaultPositionMs();
    }

    private static long Camera2StreamConfigurationMap(androidx.media3.common.SimpleBasePlayer.State state, java.lang.Object obj, androidx.media3.common.Timeline.Period period, androidx.media3.common.Timeline.Window window) {
        if (state.currentAdGroupIndex != -1) {
            return state.adPositionMsSupplier.get();
        }
        return getHighSpeedVideoFpsRangesFor(state.contentPositionMsSupplier.get(), state, window) - state.timeline.getPeriodByUid(obj, period).getPositionInWindowMs();
    }

    private static long getHighSpeedVideoSizes(androidx.media3.common.SimpleBasePlayer.State state, java.lang.Object obj, androidx.media3.common.Timeline.Period period) {
        long adDurationUs;
        state.timeline.getPeriodByUid(obj, period);
        if (state.currentAdGroupIndex == -1) {
            adDurationUs = period.durationUs;
        } else {
            adDurationUs = period.getAdDurationUs(state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
        }
        return androidx.media3.common.util.Util.usToMs(adDurationUs);
    }

    private static androidx.media3.common.util.Size getHighSpeedVideoSizes(android.view.SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return androidx.media3.common.util.Size.ZERO;
        }
        android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new androidx.media3.common.util.Size(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int Camera2StreamConfigurationMap(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2, int i, androidx.media3.common.Timeline.Period period, androidx.media3.common.Timeline.Window window) {
        if (timeline.isEmpty()) {
            if (i < timeline2.getWindowCount()) {
                return i;
            }
            return -1;
        }
        java.lang.Object checkNotNull = com.google.common.base.Preconditions.checkNotNull(timeline.getPeriod(timeline.getWindow(i, window).firstPeriodIndex, period, true).uid);
        if (timeline2.getIndexOfPeriod(checkNotNull) == -1) {
            return -1;
        }
        return timeline2.getPeriodByUid(checkNotNull, period).windowIndex;
    }

    private static androidx.media3.common.SimpleBasePlayer.State getHighSpeedVideoFpsRanges(androidx.media3.common.SimpleBasePlayer.State state, java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> list, androidx.media3.common.Timeline.Period period, androidx.media3.common.Timeline.Window window) {
        androidx.media3.common.SimpleBasePlayer.State.Builder buildUpon = state.buildUpon();
        androidx.media3.common.SimpleBasePlayer.PlaylistTimeline playlistTimeline = new androidx.media3.common.SimpleBasePlayer.PlaylistTimeline(list);
        androidx.media3.common.Timeline timeline = state.timeline;
        long j = state.contentPositionMsSupplier.get();
        int i = state.currentMediaItemIndex != -1 ? state.currentMediaItemIndex : 0;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(timeline, playlistTimeline, i, period, window);
        long j2 = Camera2StreamConfigurationMap == -1 ? androidx.media3.common.C.TIME_UNSET : j;
        while (true) {
            i++;
            if (Camera2StreamConfigurationMap != -1 || i >= timeline.getWindowCount()) {
                break;
            }
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(timeline, playlistTimeline, i, period, window);
        }
        if (state.playbackState != 1 && Camera2StreamConfigurationMap == -1) {
            buildUpon.setPlaybackState(4).setIsLoading(false);
        }
        return Camera2StreamConfigurationMap(buildUpon, state, j, playlistTimeline, Camera2StreamConfigurationMap, j2, true, window);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.media3.common.Timeline] */
    private static androidx.media3.common.SimpleBasePlayer.State getHighSpeedVideoFpsRanges(androidx.media3.common.SimpleBasePlayer.State state, java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> list, int i, long j, androidx.media3.common.Timeline.Window window) {
        androidx.media3.common.SimpleBasePlayer.State.Builder buildUpon = state.buildUpon();
        androidx.media3.common.SimpleBasePlayer.PlaylistTimeline playlistTimeline = list == null ? state.timeline : new androidx.media3.common.SimpleBasePlayer.PlaylistTimeline(list);
        if (state.playbackState != 1) {
            if (playlistTimeline.isEmpty() || (i != -1 && i >= playlistTimeline.getWindowCount())) {
                buildUpon.setPlaybackState(4).setIsLoading(false);
            } else {
                buildUpon.setPlaybackState(2);
            }
        }
        return Camera2StreamConfigurationMap(buildUpon, state, state.contentPositionMsSupplier.get(), playlistTimeline, i, j, false, window);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static androidx.media3.common.SimpleBasePlayer.State Camera2StreamConfigurationMap(androidx.media3.common.SimpleBasePlayer.State.Builder builder, androidx.media3.common.SimpleBasePlayer.State state, long j, androidx.media3.common.Timeline timeline, int i, long j2, boolean z, androidx.media3.common.Timeline.Window window) {
        long j3;
        boolean z2;
        int i2 = i;
        long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(j, state, window);
        boolean z3 = false;
        if (timeline.isEmpty() || (i2 != -1 && i2 < timeline.getWindowCount())) {
            j3 = j2;
        } else {
            j3 = -9223372036854775807L;
            i2 = 0;
        }
        if (!timeline.isEmpty() && j3 == androidx.media3.common.C.TIME_UNSET) {
            j3 = timeline.getWindow(i2, window).getDefaultPositionMs();
        }
        boolean z4 = state.timeline.isEmpty() || timeline.isEmpty();
        if (!z4) {
            if (!state.timeline.getWindow(state.currentMediaItemIndex != -1 ? state.currentMediaItemIndex : 0, window).uid.equals(timeline.getWindow(i2, window).uid)) {
                z2 = true;
                if (!timeline.isEmpty()) {
                    builder.setPlaylist(timeline, androidx.media3.common.Tracks.EMPTY, null);
                } else if (timeline instanceof androidx.media3.common.SimpleBasePlayer.PlaylistTimeline) {
                    androidx.media3.common.SimpleBasePlayer.MediaItemData mediaItemData = (androidx.media3.common.SimpleBasePlayer.MediaItemData) ((androidx.media3.common.SimpleBasePlayer.PlaylistTimeline) timeline).getHighSpeedVideoSizes.get(i2);
                    builder.setPlaylist(timeline, mediaItemData.tracks, mediaItemData.mediaMetadata);
                } else {
                    if (!z4 && !z2) {
                        z3 = true;
                    }
                    builder.setPlaylist(timeline, z3 ? state.currentTracks : androidx.media3.common.Tracks.EMPTY, z3 ? state.currentMetadata : null);
                }
                if (!z4 || z2 || j3 < highSpeedVideoFpsRangesFor) {
                    builder.setCurrentMediaItemIndex(i2).setCurrentAd(-1, -1).setContentPositionMs(j3).setContentBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(j3)).setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO);
                } else if (j3 == highSpeedVideoFpsRangesFor) {
                    builder.setCurrentMediaItemIndex(i2);
                    if (state.currentAdGroupIndex != -1 && z) {
                        builder.setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(state.adBufferedPositionMsSupplier.get() - state.adPositionMsSupplier.get()));
                    } else {
                        builder.setCurrentAd(-1, -1).setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(getHighSpeedVideoFpsRangesFor(state.contentBufferedPositionMsSupplier.get(), state, window) - highSpeedVideoFpsRangesFor));
                    }
                } else {
                    builder.setCurrentMediaItemIndex(i2).setCurrentAd(-1, -1).setContentPositionMs(j3).setContentBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(java.lang.Math.max(getHighSpeedVideoFpsRangesFor(state.contentBufferedPositionMsSupplier.get(), state, window), j3))).setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(java.lang.Math.max(0L, state.totalBufferedDurationMsSupplier.get() - (j3 - highSpeedVideoFpsRangesFor))));
                }
                return builder.build();
            }
        }
        z2 = false;
        if (!timeline.isEmpty()) {
        }
        if (z4) {
        }
        builder.setCurrentMediaItemIndex(i2).setCurrentAd(-1, -1).setContentPositionMs(j3).setContentBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(j3)).setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO);
        return builder.build();
    }

    private static java.util.List<androidx.media3.common.SimpleBasePlayer.MediaItemData> getHighSpeedVideoFpsRangesFor(androidx.media3.common.SimpleBasePlayer.State state, androidx.media3.common.Timeline.Period period, androidx.media3.common.Timeline.Window window) {
        if (state.timeline instanceof androidx.media3.common.SimpleBasePlayer.PlaylistTimeline) {
            return new java.util.ArrayList(((androidx.media3.common.SimpleBasePlayer.PlaylistTimeline) state.timeline).getHighSpeedVideoSizes);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(state.timeline.getWindowCount());
        for (int i = 0; i < state.timeline.getWindowCount(); i++) {
            arrayList.add(androidx.media3.common.SimpleBasePlayer.MediaItemData.getHighResolutionOutputSizeshNQ4ISI(state, i, period, window));
        }
        return arrayList;
    }

    static final class PlaceholderUid {
        private PlaceholderUid() {
        }

        /* synthetic */ PlaceholderUid(byte b) {
            this();
        }
    }

    public static /* synthetic */ void $r8$lambda$FFq8QvDrngTZgwNelLGa_12THc4(androidx.media3.common.SimpleBasePlayer simpleBasePlayer, java.lang.Runnable runnable) {
        if (simpleBasePlayer.getHighSpeedVideoSizes.getLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            simpleBasePlayer.getHighSpeedVideoSizes.post(runnable);
        }
    }

    static /* synthetic */ int Camera2StreamConfigurationMap(androidx.media3.common.Timeline timeline, int i, long j, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        return timeline.getIndexOfPeriod(timeline.getPeriodPositionUs(window, period, i, androidx.media3.common.util.Util.msToUs(j)).first);
    }

    static /* synthetic */ androidx.media3.common.MediaMetadata Camera2StreamConfigurationMap(androidx.media3.common.MediaItem mediaItem, androidx.media3.common.Tracks tracks) {
        androidx.media3.common.MediaMetadata.Builder builder = new androidx.media3.common.MediaMetadata.Builder();
        int size = tracks.getGroups().size();
        for (int i = 0; i < size; i++) {
            androidx.media3.common.Tracks.Group group = tracks.getGroups().get(i);
            for (int i2 = 0; i2 < group.length; i2++) {
                if (group.isTrackSelected(i2)) {
                    androidx.media3.common.Format trackFormat = group.getTrackFormat(i2);
                    if (trackFormat.metadata != null) {
                        for (int i3 = 0; i3 < trackFormat.metadata.length(); i3++) {
                            trackFormat.metadata.get(i3).populateMediaMetadata(builder);
                        }
                    }
                }
            }
        }
        return builder.populate(mediaItem.mediaMetadata).build();
    }

    static /* synthetic */ int getHighSpeedVideoFpsRanges(androidx.media3.common.SimpleBasePlayer.State state) {
        if (state.currentMediaItemIndex != -1) {
            return state.currentMediaItemIndex;
        }
        return 0;
    }

    private void Camera2StreamConfigurationMap(java.lang.Object obj) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(27)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleClearVideoOutput(obj), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda49
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setSurfaceSize(androidx.media3.common.util.Size.ZERO).build();
                return build;
            }
        }, false, false);
    }

    private static int getHighSpeedVideoFpsRanges(androidx.media3.common.SimpleBasePlayer.State state, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        int i = state.currentMediaItemIndex != -1 ? state.currentMediaItemIndex : 0;
        if (state.timeline.isEmpty()) {
            return i;
        }
        androidx.media3.common.Timeline timeline = state.timeline;
        return timeline.getIndexOfPeriod(timeline.getPeriodPositionUs(window, period, i, androidx.media3.common.util.Util.msToUs(getHighSpeedVideoFpsRangesFor(state.contentPositionMsSupplier.get(), state, window))).first);
    }

    private static androidx.media3.common.Player.PositionInfo getHighSpeedVideoFpsRangesFor(androidx.media3.common.SimpleBasePlayer.State state, boolean z, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        java.lang.Object obj;
        androidx.media3.common.MediaItem mediaItem;
        java.lang.Object obj2;
        long j;
        long j2;
        int i = state.currentMediaItemIndex != -1 ? state.currentMediaItemIndex : 0;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(state, window, period);
        if (state.timeline.isEmpty()) {
            obj = null;
            mediaItem = null;
            obj2 = null;
        } else {
            obj2 = state.timeline.getPeriod(highSpeedVideoFpsRanges, period, true).uid;
            obj = state.timeline.getWindow(i, window).uid;
            mediaItem = window.mediaItem;
        }
        if (z) {
            long j3 = state.discontinuityPositionMs;
            if (state.currentAdGroupIndex == -1) {
                j = j3;
                j2 = j;
            } else {
                j = j3;
                j2 = getHighSpeedVideoFpsRangesFor(state.contentPositionMsSupplier.get(), state, window);
            }
        } else {
            long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(state.contentPositionMsSupplier.get(), state, window);
            if (state.currentAdGroupIndex != -1) {
                j2 = highSpeedVideoFpsRangesFor;
                j = state.adPositionMsSupplier.get();
            } else {
                j = highSpeedVideoFpsRangesFor;
                j2 = j;
            }
        }
        return new androidx.media3.common.Player.PositionInfo(obj, i, mediaItem, obj2, highSpeedVideoFpsRanges, j, j2, state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(int i, final java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        com.google.common.base.Preconditions.checkArgument(i >= 0);
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        int windowCount = state.timeline.getWindowCount();
        if (this.getOutputMinFrameDuration || !this.getHighSpeedVideoSizesFor.availableCommands.contains(20) || list.isEmpty()) {
            return;
        }
        final int min = java.lang.Math.min(i, windowCount);
        getHighResolutionOutputSizeshNQ4ISI(handleAddMediaItems(min, list), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda36
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return androidx.media3.common.SimpleBasePlayer.this.getHighSpeedVideoFpsRanges(state, list, min);
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(26)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleDecreaseDeviceVolume(1), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda39
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                androidx.media3.common.SimpleBasePlayer.State state2 = androidx.media3.common.SimpleBasePlayer.State.this;
                build = state2.buildUpon().setDeviceVolume(java.lang.Math.max(0, state2.deviceVolume - 1)).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void decreaseDeviceVolume(int i) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(34)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleDecreaseDeviceVolume(i), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda59
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                androidx.media3.common.SimpleBasePlayer.State state2 = androidx.media3.common.SimpleBasePlayer.State.this;
                build = state2.buildUpon().setDeviceVolume(java.lang.Math.max(0, state2.deviceVolume - 1)).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.audioAttributes;
    }

    @Override // androidx.media3.common.Player
    public final int getAudioSessionId() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.audioSessionId;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public final long getBufferedPosition() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        if (isPlayingAd()) {
            return java.lang.Math.max(this.getHighSpeedVideoSizesFor.adBufferedPositionMsSupplier.get(), this.getHighSpeedVideoSizesFor.adPositionMsSupplier.get());
        }
        return getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public final long getContentBufferedPosition() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(state.contentBufferedPositionMsSupplier.get(), state, this.window);
        androidx.media3.common.SimpleBasePlayer.State state2 = this.getHighSpeedVideoSizesFor;
        return java.lang.Math.max(highSpeedVideoFpsRangesFor, getHighSpeedVideoFpsRangesFor(state2.contentPositionMsSupplier.get(), state2, this.window));
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        return getHighSpeedVideoFpsRangesFor(state.contentPositionMsSupplier.get(), state, this.window);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.currentAdGroupIndex;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.currentAdIndexInAdGroup;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.text.CueGroup getCurrentCues() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.currentCues;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (state.currentMediaItemIndex != -1) {
            return state.currentMediaItemIndex;
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, this.window, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return isPlayingAd() ? this.getHighSpeedVideoSizesFor.adPositionMsSupplier.get() : getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Timeline getCurrentTimeline() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.timeline;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Tracks getCurrentTracks() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.currentTracks;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public final int getDeviceVolume() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.deviceVolume;
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        if (isPlayingAd()) {
            this.getHighSpeedVideoSizesFor.timeline.getPeriod(getCurrentPeriodIndex(), this.getHighResolutionOutputSizeshNQ4ISI);
            return androidx.media3.common.util.Util.usToMs(this.getHighResolutionOutputSizeshNQ4ISI.getAdDurationUs(this.getHighSpeedVideoSizesFor.currentAdGroupIndex, this.getHighSpeedVideoSizesFor.currentAdIndexInAdGroup));
        }
        return getContentDuration();
    }

    @Override // androidx.media3.common.Player
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.currentMetadata;
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.playWhenReady;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.playbackParameters;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.playbackState;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.PlaybackException getPlayerError() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.playerError;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.playlistMetadata;
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.repeatMode;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekBackIncrement() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekForwardIncrement() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.seekForwardIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.shuffleModeEnabled;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.util.Size getSurfaceSize() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.surfaceSize;
    }

    @Override // androidx.media3.common.Player
    public final long getTotalBufferedDuration() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.totalBufferedDurationMsSupplier.get();
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.trackSelectionParameters;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.VideoSize getVideoSize() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.videoSize;
    }

    @Override // androidx.media3.common.Player
    public final float getVolume() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.volume;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(26)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleIncreaseDeviceVolume(1), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda51
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = r0.buildUpon().setDeviceVolume(androidx.media3.common.SimpleBasePlayer.State.this.deviceVolume + 1).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void increaseDeviceVolume(int i) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(34)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleIncreaseDeviceVolume(i), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda35
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = r0.buildUpon().setDeviceVolume(androidx.media3.common.SimpleBasePlayer.State.this.deviceVolume + 1).build();
                return build;
            }
        }, false, false);
    }

    protected final void invalidateState() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        if (!this.getHighSpeedVideoFpsRanges.isEmpty() || this.getOutputMinFrameDuration) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(getState(), false, false);
    }

    @Override // androidx.media3.common.Player
    public final boolean isDeviceMuted() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.isDeviceMuted;
    }

    @Override // androidx.media3.common.Player
    public final boolean isLoading() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.isLoading;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        return this.getHighSpeedVideoSizesFor.currentAdGroupIndex != -1;
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItems(final int i, int i2, int i3) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        com.google.common.base.Preconditions.checkArgument(i >= 0 && i2 >= i && i3 >= 0);
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        int windowCount = state.timeline.getWindowCount();
        if (this.getOutputMinFrameDuration || !this.getHighSpeedVideoSizesFor.availableCommands.contains(20) || windowCount == 0 || i >= windowCount) {
            return;
        }
        final int min = java.lang.Math.min(i2, windowCount);
        final int min2 = java.lang.Math.min(i3, windowCount - (min - i));
        if (i == min || min2 == i) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleMoveMediaItems(i, min, min2), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda50
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return androidx.media3.common.SimpleBasePlayer.this.getHighSpeedVideoSizes(state, i, min, min2);
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void mute() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(24) || this.getHighSpeedVideoSizesFor.volume == 0.0f) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetVolume(0.0f, 1), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda29
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setVolume(0.0f).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(2)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handlePrepare(), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda58
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setPlayerError(null).setPlaybackState(r2.timeline.isEmpty() ? 4 : 2).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(32)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleRelease(), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda46
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return androidx.media3.common.SimpleBasePlayer.getHighSpeedVideoSizesFor(androidx.media3.common.SimpleBasePlayer.State.this);
            }
        }, false, false);
        this.getOutputMinFrameDuration = true;
        this.getHighSpeedVideoFpsRangesFor.release();
        this.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizesFor.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.ZERO).setContentBufferedPositionMs(androidx.media3.common.SimpleBasePlayer.PositionSupplier.getConstant(getHighSpeedVideoFpsRangesFor(state.contentPositionMsSupplier.get(), state, this.window))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
    }

    @Override // androidx.media3.common.Player
    public final void removeListener(androidx.media3.common.Player.Listener listener) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        this.getHighSpeedVideoFpsRangesFor.remove(listener);
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItems(final int i, int i2) {
        final int min;
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        com.google.common.base.Preconditions.checkArgument(i >= 0 && i2 >= i);
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        int windowCount = state.timeline.getWindowCount();
        if (this.getOutputMinFrameDuration || !this.getHighSpeedVideoSizesFor.availableCommands.contains(20) || windowCount == 0 || i >= windowCount || i == (min = java.lang.Math.min(i2, windowCount))) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleRemoveMediaItems(i, min), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda54
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return androidx.media3.common.SimpleBasePlayer.this.getHighSpeedVideoSizes(state, i, min);
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItems(final int i, int i2, final java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        com.google.common.base.Preconditions.checkArgument(i >= 0 && i <= i2);
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        int windowCount = state.timeline.getWindowCount();
        if (this.getOutputMinFrameDuration || !this.getHighSpeedVideoSizesFor.availableCommands.contains(20) || i > windowCount) {
            return;
        }
        final int min = java.lang.Math.min(i2, windowCount);
        getHighResolutionOutputSizeshNQ4ISI(handleReplaceMediaItems(i, min, list), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda28
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return androidx.media3.common.SimpleBasePlayer.this.getHighSpeedVideoFpsRangesFor(state, list, min, i);
            }
        }, false, false);
    }

    @Override // androidx.media3.common.BasePlayer
    protected final void seekTo(final int i, final long j, int i2, boolean z) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        com.google.common.base.Preconditions.checkArgument(i == -1 || i >= 0);
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(i2)) {
            return;
        }
        boolean z2 = i == -1 || isPlayingAd() || (!state.timeline.isEmpty() && i >= state.timeline.getWindowCount());
        final boolean z3 = z2;
        getHighResolutionOutputSizeshNQ4ISI(handleSeek(i, j, i2), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda53
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return androidx.media3.common.SimpleBasePlayer.this.getHighResolutionOutputSizeshNQ4ISI(z3, state, i, j);
            }
        }, !z2, z);
    }

    @Override // androidx.media3.common.Player
    public final void setAudioAttributes(final androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(35)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetAudioAttributes(audioAttributes, z), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda52
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setAudioAttributes(audioAttributes).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void setDeviceMuted(final boolean z) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(26)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetDeviceMuted(z, 1), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda48
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setIsDeviceMuted(z).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceMuted(final boolean z, int i) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(34)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetDeviceMuted(z, i), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda61
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setIsDeviceMuted(z).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void setDeviceVolume(final int i) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(25)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetDeviceVolume(i, 1), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda22
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setDeviceVolume(i).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceVolume(final int i, int i2) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(33)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetDeviceVolume(i, i2), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda38
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setDeviceVolume(i).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i, long j) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        if (i == -1) {
            i = this.getHighSpeedVideoSizesFor.currentMediaItemIndex;
            j = this.getHighSpeedVideoSizesFor.contentPositionMsSupplier.get();
        }
        Camera2StreamConfigurationMap(list, i, j);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        Camera2StreamConfigurationMap(list, z ? -1 : this.getHighSpeedVideoSizesFor.currentMediaItemIndex, z ? androidx.media3.common.C.TIME_UNSET : this.getHighSpeedVideoSizesFor.contentPositionMsSupplier.get());
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(final boolean z) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(1)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetPlayWhenReady(z), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda11
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setPlayWhenReady(z, 1).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackParameters(final androidx.media3.common.PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(13)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetPlaybackParameters(playbackParameters), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda60
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setPlaybackParameters(playbackParameters).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void setPlaylistMetadata(final androidx.media3.common.MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(19)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetPlaylistMetadata(mediaMetadata), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda41
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setPlaylistMetadata(mediaMetadata).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(final int i) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(15)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetRepeatMode(i), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda42
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setRepeatMode(i).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(final boolean z) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(14)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetShuffleModeEnabled(z), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda37
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setShuffleModeEnabled(z).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void setTrackSelectionParameters(final androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(29)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetTrackSelectionParameters(trackSelectionParameters), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda62
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setTrackSelectionParameters(trackSelectionParameters).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(27)) {
            return;
        }
        if (surface == null) {
            clearVideoSurface();
        } else {
            getHighResolutionOutputSizeshNQ4ISI(handleSetVideoOutput(surface), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda31
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    androidx.media3.common.SimpleBasePlayer.State build;
                    build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setSurfaceSize(androidx.media3.common.util.Size.UNKNOWN).build();
                    return build;
                }
            }, false, false);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceHolder(final android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(27)) {
            return;
        }
        if (surfaceHolder == null) {
            clearVideoSurface();
        } else {
            getHighResolutionOutputSizeshNQ4ISI(handleSetVideoOutput(surfaceHolder), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda45
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    androidx.media3.common.SimpleBasePlayer.State build;
                    build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setSurfaceSize(androidx.media3.common.SimpleBasePlayer.getHighSpeedVideoSizes(surfaceHolder)).build();
                    return build;
                }
            }, false, false);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(final android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(27)) {
            return;
        }
        if (surfaceView == null) {
            clearVideoSurface();
        } else {
            getHighResolutionOutputSizeshNQ4ISI(handleSetVideoOutput(surfaceView), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda47
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    androidx.media3.common.SimpleBasePlayer.State build;
                    build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setSurfaceSize(androidx.media3.common.SimpleBasePlayer.getHighSpeedVideoSizes(surfaceView.getHolder())).build();
                    return build;
                }
            }, false, false);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(android.view.TextureView textureView) {
        final androidx.media3.common.util.Size size;
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(27)) {
            return;
        }
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        if (textureView.isAvailable()) {
            size = new androidx.media3.common.util.Size(textureView.getWidth(), textureView.getHeight());
        } else {
            size = androidx.media3.common.util.Size.ZERO;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetVideoOutput(textureView), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda33
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setSurfaceSize(size).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void setVolume(final float f) {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(24)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleSetVolume(f, 0), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda43
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                androidx.media3.common.SimpleBasePlayer.State build;
                build = androidx.media3.common.SimpleBasePlayer.State.this.buildUpon().setVolume(f).build();
                return build;
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (this.getOutputMinFrameDuration || !state.availableCommands.contains(3)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(handleStop(), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda57
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return androidx.media3.common.SimpleBasePlayer.this.getOutputMinFrameDurationlomOqCM(state);
            }
        }, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void unmute() {
        verifyApplicationThread();
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = getState();
        }
        final androidx.media3.common.SimpleBasePlayer.State state = this.getHighSpeedVideoSizesFor;
        if (!this.getOutputMinFrameDuration && state.availableCommands.contains(24) && this.getHighSpeedVideoSizesFor.volume == 0.0f) {
            getHighResolutionOutputSizeshNQ4ISI(handleSetVolume(state.unmuteVolume, 2), new com.google.common.base.Supplier() { // from class: androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    androidx.media3.common.SimpleBasePlayer.State build;
                    build = r0.buildUpon().setVolume(androidx.media3.common.SimpleBasePlayer.State.this.unmuteVolume).build();
                    return build;
                }
            }, false, false);
        }
    }
}
