package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class StuckPlayerDetector {
    private final androidx.media3.common.Timeline.Period Camera2StreamConfigurationMap = new androidx.media3.common.Timeline.Period();
    private final androidx.media3.common.Player getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.media3.common.util.HandlerWrapper getHighSpeedVideoFpsRanges;
    private final androidx.media3.common.util.Clock getHighSpeedVideoFpsRangesFor;
    private final androidx.media3.common.util.StuckPlayerDetector.Callback getHighSpeedVideoSizes;
    private final androidx.media3.common.util.StuckPlayerDetector.StuckBufferingDetector getHighSpeedVideoSizesFor;
    private final androidx.media3.common.util.StuckPlayerDetector.StuckPlayingDetector getInputFormats;
    private final androidx.media3.common.util.StuckPlayerDetector.StuckPlayingNotEndingDetector getInputSizeshNQ4ISI;
    private final androidx.media3.common.util.StuckPlayerDetector.StuckSuppressedDetector getOutputFormats;
    private final androidx.media3.common.Player.Listener getOutputMinFrameDuration;

    public interface Callback {
        void onStuckPlayerDetected(androidx.media3.common.util.StuckPlayerException stuckPlayerException);
    }

    public StuckPlayerDetector(androidx.media3.common.Player player, androidx.media3.common.util.StuckPlayerDetector.Callback callback, androidx.media3.common.util.Clock clock, int i, int i2, int i3, int i4) {
        this.getHighResolutionOutputSizeshNQ4ISI = player;
        this.getHighSpeedVideoSizes = callback;
        this.getHighSpeedVideoFpsRangesFor = clock;
        this.getHighSpeedVideoFpsRanges = clock.createHandler(player.getApplicationLooper(), new android.os.Handler.Callback() { // from class: androidx.media3.common.util.StuckPlayerDetector$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return androidx.media3.common.util.StuckPlayerDetector.$r8$lambda$O20OfWQe0IImnmxCKXMyVoyaxfk(androidx.media3.common.util.StuckPlayerDetector.this, message);
            }
        });
        this.getHighSpeedVideoSizesFor = new androidx.media3.common.util.StuckPlayerDetector.StuckBufferingDetector(i);
        this.getInputFormats = new androidx.media3.common.util.StuckPlayerDetector.StuckPlayingDetector(i2);
        this.getInputSizeshNQ4ISI = new androidx.media3.common.util.StuckPlayerDetector.StuckPlayingNotEndingDetector(i3);
        this.getOutputFormats = new androidx.media3.common.util.StuckPlayerDetector.StuckSuppressedDetector(i4);
        androidx.media3.common.Player.Listener listener = new androidx.media3.common.Player.Listener() { // from class: androidx.media3.common.util.StuckPlayerDetector.1
            @Override // androidx.media3.common.Player.Listener
            public void onEvents(androidx.media3.common.Player player2, androidx.media3.common.Player.Events events) {
                androidx.media3.common.util.StuckPlayerDetector.Camera2StreamConfigurationMap(androidx.media3.common.util.StuckPlayerDetector.this);
            }
        };
        this.getOutputMinFrameDuration = listener;
        player.addListener(listener);
    }

    public final void release() {
        this.getHighSpeedVideoFpsRanges.removeCallbacksAndMessages(null);
        this.getHighResolutionOutputSizeshNQ4ISI.removeListener(this.getOutputMinFrameDuration);
    }

    final class StuckBufferingDetector {
        private long Camera2StreamConfigurationMap;
        private long getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoSizesFor;
        private long getInputFormats;
        private java.lang.Object getOutputFormats;
        private final int getOutputMinFrameDuration;

        public StuckBufferingDetector(int i) {
            this.getOutputMinFrameDuration = i;
        }

        public final void Camera2StreamConfigurationMap() {
            if (androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getPlaybackState() == 2 && androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getPlayWhenReady() && androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getPlaybackSuppressionReason() == 0) {
                androidx.media3.common.Timeline currentTimeline = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentTimeline();
                java.lang.Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPeriodIndex());
                int currentAdGroupIndex = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentAdGroupIndex();
                int currentAdIndexInAdGroup = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentAdIndexInAdGroup();
                long bufferedPosition = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getBufferedPosition();
                long max = java.lang.Math.max(0L, androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getTotalBufferedDuration() - java.lang.Math.max(0L, bufferedPosition - androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPosition()));
                if (uidOfPeriod != null && currentAdGroupIndex == -1) {
                    bufferedPosition -= currentTimeline.getPeriodByUid(uidOfPeriod, androidx.media3.common.util.StuckPlayerDetector.this.Camera2StreamConfigurationMap).getPositionInWindowMs();
                }
                long elapsedRealtime = androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRangesFor.elapsedRealtime();
                if (this.getHighSpeedVideoSizesFor && java.util.Objects.equals(uidOfPeriod, this.getOutputFormats) && currentAdGroupIndex == this.getHighSpeedVideoFpsRangesFor && currentAdIndexInAdGroup == this.getHighSpeedVideoSizes && bufferedPosition == this.getHighResolutionOutputSizeshNQ4ISI && max == this.Camera2StreamConfigurationMap) {
                    if (elapsedRealtime - this.getInputFormats >= this.getOutputMinFrameDuration) {
                        androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoSizes.onStuckPlayerDetected(new androidx.media3.common.util.StuckPlayerException(1, this.getOutputMinFrameDuration));
                        return;
                    }
                    return;
                }
                this.getHighSpeedVideoSizesFor = true;
                this.getInputFormats = elapsedRealtime;
                this.getOutputFormats = uidOfPeriod;
                this.getHighSpeedVideoFpsRangesFor = currentAdGroupIndex;
                this.getHighSpeedVideoSizes = currentAdIndexInAdGroup;
                this.getHighResolutionOutputSizeshNQ4ISI = bufferedPosition;
                this.Camera2StreamConfigurationMap = max;
                androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.removeMessages(1);
                androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.sendEmptyMessageDelayed(1, this.getOutputMinFrameDuration);
                return;
            }
            if (this.getHighSpeedVideoSizesFor) {
                androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.removeMessages(1);
            }
            this.getHighSpeedVideoSizesFor = false;
        }
    }

    final class StuckPlayingDetector {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private long getHighSpeedVideoSizes;
        private final int getInputFormats;
        private long getOutputFormats;
        private java.lang.Object getOutputMinFrameDuration;

        public StuckPlayingDetector(int i) {
            this.getInputFormats = i;
        }

        public final void Camera2StreamConfigurationMap() {
            if (androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.isPlaying()) {
                androidx.media3.common.Timeline currentTimeline = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentTimeline();
                java.lang.Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPeriodIndex());
                int currentAdGroupIndex = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentAdGroupIndex();
                int currentAdIndexInAdGroup = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentAdIndexInAdGroup();
                long currentPosition = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPosition();
                if (uidOfPeriod != null && currentAdGroupIndex == -1) {
                    currentPosition -= currentTimeline.getPeriodByUid(uidOfPeriod, androidx.media3.common.util.StuckPlayerDetector.this.Camera2StreamConfigurationMap).getPositionInWindowMs();
                }
                long elapsedRealtime = androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRangesFor.elapsedRealtime();
                if (this.getHighSpeedVideoFpsRangesFor && java.util.Objects.equals(uidOfPeriod, this.getOutputMinFrameDuration) && currentAdGroupIndex == this.getHighSpeedVideoFpsRanges && currentAdIndexInAdGroup == this.getHighResolutionOutputSizeshNQ4ISI && currentPosition == this.getHighSpeedVideoSizes) {
                    if (elapsedRealtime - this.getOutputFormats >= this.getInputFormats) {
                        androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoSizes.onStuckPlayerDetected(new androidx.media3.common.util.StuckPlayerException(2, this.getInputFormats));
                        return;
                    }
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                this.getOutputFormats = elapsedRealtime;
                this.getOutputMinFrameDuration = uidOfPeriod;
                this.getHighSpeedVideoFpsRanges = currentAdGroupIndex;
                this.getHighResolutionOutputSizeshNQ4ISI = currentAdIndexInAdGroup;
                this.getHighSpeedVideoSizes = currentPosition;
                androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.removeMessages(2);
                androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.sendEmptyMessageDelayed(2, this.getInputFormats);
                return;
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.removeMessages(2);
            }
            this.getHighSpeedVideoFpsRangesFor = false;
        }
    }

    final class StuckPlayingNotEndingDetector {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRangesFor;
        private java.lang.Object getHighSpeedVideoSizes;
        private long getInputFormats;
        private final int getOutputMinFrameDuration;

        public StuckPlayingNotEndingDetector(int i) {
            this.getOutputMinFrameDuration = i;
        }

        public final void Camera2StreamConfigurationMap() {
            long duration;
            androidx.media3.common.Timeline currentTimeline = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentTimeline();
            java.lang.Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPeriodIndex());
            int currentAdGroupIndex = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentAdIndexInAdGroup();
            long currentPosition = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentPosition();
            if (uidOfPeriod == null || currentAdGroupIndex != -1) {
                duration = currentAdGroupIndex != -1 ? androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getDuration() : -9223372036854775807L;
            } else {
                currentTimeline.getPeriodByUid(uidOfPeriod, androidx.media3.common.util.StuckPlayerDetector.this.Camera2StreamConfigurationMap);
                currentPosition -= androidx.media3.common.util.StuckPlayerDetector.this.Camera2StreamConfigurationMap.getPositionInWindowMs();
                duration = androidx.media3.common.util.StuckPlayerDetector.this.Camera2StreamConfigurationMap.getDurationMs();
            }
            boolean isPlaying = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.isPlaying();
            if (!isPlaying || duration == androidx.media3.common.C.TIME_UNSET || currentPosition < duration) {
                androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.removeMessages(3);
                if (isPlaying && duration != androidx.media3.common.C.TIME_UNSET) {
                    androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.sendEmptyMessageDelayed(3, (int) java.lang.Math.ceil((duration - currentPosition) / androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getPlaybackParameters().speed));
                }
                this.getHighSpeedVideoFpsRangesFor = false;
                return;
            }
            long elapsedRealtime = androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRangesFor.elapsedRealtime();
            if (this.getHighSpeedVideoFpsRangesFor && java.util.Objects.equals(uidOfPeriod, this.getHighSpeedVideoSizes) && currentAdGroupIndex == this.getHighResolutionOutputSizeshNQ4ISI && currentAdIndexInAdGroup == this.Camera2StreamConfigurationMap) {
                if (elapsedRealtime - this.getInputFormats >= this.getOutputMinFrameDuration) {
                    androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoSizes.onStuckPlayerDetected(new androidx.media3.common.util.StuckPlayerException(3, this.getOutputMinFrameDuration));
                    return;
                }
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getInputFormats = elapsedRealtime;
            this.getHighSpeedVideoSizes = uidOfPeriod;
            this.getHighResolutionOutputSizeshNQ4ISI = currentAdGroupIndex;
            this.Camera2StreamConfigurationMap = currentAdIndexInAdGroup;
            androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.removeMessages(3);
            androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.sendEmptyMessageDelayed(3, this.getOutputMinFrameDuration);
        }
    }

    final class StuckSuppressedDetector {
        private boolean Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRangesFor;
        private long getHighSpeedVideoSizes;

        public StuckSuppressedDetector(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public final void Camera2StreamConfigurationMap() {
            int playbackSuppressionReason = androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getPlaybackSuppressionReason();
            if (androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getPlayWhenReady() && androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getPlaybackState() != 1 && androidx.media3.common.util.StuckPlayerDetector.this.getHighResolutionOutputSizeshNQ4ISI.getPlaybackState() != 4 && playbackSuppressionReason != 0 && playbackSuppressionReason != 1) {
                long elapsedRealtime = androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRangesFor.elapsedRealtime();
                if (this.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == playbackSuppressionReason) {
                    if (elapsedRealtime - this.getHighSpeedVideoSizes >= this.getHighResolutionOutputSizeshNQ4ISI) {
                        androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoSizes.onStuckPlayerDetected(new androidx.media3.common.util.StuckPlayerException(4, this.getHighResolutionOutputSizeshNQ4ISI));
                        return;
                    }
                    return;
                } else {
                    this.Camera2StreamConfigurationMap = true;
                    this.getHighSpeedVideoSizes = elapsedRealtime;
                    this.getHighSpeedVideoFpsRangesFor = playbackSuppressionReason;
                    androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.removeMessages(4);
                    androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.sendEmptyMessageDelayed(4, this.getHighResolutionOutputSizeshNQ4ISI);
                    return;
                }
            }
            if (this.Camera2StreamConfigurationMap) {
                androidx.media3.common.util.StuckPlayerDetector.this.getHighSpeedVideoFpsRanges.removeMessages(4);
            }
            this.Camera2StreamConfigurationMap = false;
        }
    }

    public static /* synthetic */ boolean $r8$lambda$O20OfWQe0IImnmxCKXMyVoyaxfk(androidx.media3.common.util.StuckPlayerDetector stuckPlayerDetector, android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            stuckPlayerDetector.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap();
            return true;
        }
        if (i == 2) {
            stuckPlayerDetector.getInputFormats.Camera2StreamConfigurationMap();
            return true;
        }
        if (i == 3) {
            stuckPlayerDetector.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap();
            return true;
        }
        if (i != 4) {
            return false;
        }
        stuckPlayerDetector.getOutputFormats.Camera2StreamConfigurationMap();
        return true;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.media3.common.util.StuckPlayerDetector stuckPlayerDetector) {
        stuckPlayerDetector.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap();
        stuckPlayerDetector.getInputFormats.Camera2StreamConfigurationMap();
        stuckPlayerDetector.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap();
        stuckPlayerDetector.getOutputFormats.Camera2StreamConfigurationMap();
    }
}
