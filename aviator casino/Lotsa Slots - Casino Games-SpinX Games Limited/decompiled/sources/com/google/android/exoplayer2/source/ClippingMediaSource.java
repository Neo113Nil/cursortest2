package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class ClippingMediaSource extends com.google.android.exoplayer2.source.WrappingMediaSource {
    private final boolean allowDynamicClippingUpdates;
    private com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException clippingError;
    private com.google.android.exoplayer2.source.ClippingMediaSource.ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.ClippingMediaPeriod> mediaPeriods;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final com.google.android.exoplayer2.Timeline.Window window;

    public static final class IllegalClippingException extends java.io.IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int i) {
            super("Illegal clipping: " + getReasonDescription(i));
            this.reason = i;
        }

        private static java.lang.String getReasonDescription(int i) {
            if (i == 0) {
                return "invalid period count";
            }
            if (i == 1) {
                return "not seekable to start";
            }
            if (i == 2) {
                return "start exceeds end";
            }
            return "unknown";
        }
    }

    public ClippingMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, long j, long j2) {
        this(mediaSource, j, j2, true, false, false);
    }

    public ClippingMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, long j) {
        this(mediaSource, 0L, j, true, false, true);
    }

    public ClippingMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, long j, long j2, boolean z, boolean z2, boolean z3) {
        super((com.google.android.exoplayer2.source.MediaSource) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaSource));
        com.google.android.exoplayer2.util.Assertions.checkArgument(j >= 0);
        this.startUs = j;
        this.endUs = j2;
        this.enableInitialDiscontinuity = z;
        this.allowDynamicClippingUpdates = z2;
        this.relativeToDefaultPosition = z3;
        this.mediaPeriods = new java.util.ArrayList<>();
        this.window = new com.google.android.exoplayer2.Timeline.Window();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
        com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.upstream.Allocator allocator, long j) {
        com.google.android.exoplayer2.source.ClippingMediaPeriod clippingMediaPeriod = new com.google.android.exoplayer2.source.ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((com.google.android.exoplayer2.source.ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        refreshClippedTimeline(((com.google.android.exoplayer2.source.ClippingMediaSource.ClippingTimeline) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.clippingTimeline)).timeline);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    protected void onChildSourceInfoRefreshed(com.google.android.exoplayer2.Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    private void refreshClippedTimeline(com.google.android.exoplayer2.Timeline timeline) {
        long j;
        long j2;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        if (this.clippingTimeline == null || this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            long j3 = this.startUs;
            long j4 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j3 += defaultPositionUs;
                j4 += defaultPositionUs;
            }
            this.periodStartUs = positionInFirstPeriodUs + j3;
            this.periodEndUs = this.endUs != Long.MIN_VALUE ? positionInFirstPeriodUs + j4 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i = 0; i < size; i++) {
                this.mediaPeriods.get(i).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j = j3;
            j2 = j4;
        } else {
            long j5 = this.periodStartUs - positionInFirstPeriodUs;
            j2 = this.endUs != Long.MIN_VALUE ? this.periodEndUs - positionInFirstPeriodUs : Long.MIN_VALUE;
            j = j5;
        }
        try {
            com.google.android.exoplayer2.source.ClippingMediaSource.ClippingTimeline clippingTimeline = new com.google.android.exoplayer2.source.ClippingMediaSource.ClippingTimeline(timeline, j, j2);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline);
        } catch (com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException e) {
            this.clippingError = e;
            for (int i2 = 0; i2 < this.mediaPeriods.size(); i2++) {
                this.mediaPeriods.get(i2).setClippingError(this.clippingError);
            }
        }
    }

    private static final class ClippingTimeline extends com.google.android.exoplayer2.source.ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(com.google.android.exoplayer2.Timeline timeline, long j, long j2) throws com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException {
            super(timeline);
            boolean z = false;
            if (timeline.getPeriodCount() != 1) {
                throw new com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException(0);
            }
            com.google.android.exoplayer2.Timeline.Window window = timeline.getWindow(0, new com.google.android.exoplayer2.Timeline.Window());
            long max = java.lang.Math.max(0L, j);
            if (!window.isPlaceholder && max != 0 && !window.isSeekable) {
                throw new com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException(1);
            }
            long max2 = j2 == Long.MIN_VALUE ? window.durationUs : java.lang.Math.max(0L, j2);
            if (window.durationUs != -9223372036854775807L) {
                max2 = max2 > window.durationUs ? window.durationUs : max2;
                if (max > max2) {
                    throw new com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException(2);
                }
            }
            this.startUs = max;
            this.endUs = max2;
            this.durationUs = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
            if (window.isDynamic && (max2 == -9223372036854775807L || (window.durationUs != -9223372036854775807L && max2 == window.durationUs))) {
                z = true;
            }
            this.isDynamic = z;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, long j) {
            this.timeline.getWindow(0, window, 0L);
            window.positionInFirstPeriodUs += this.startUs;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            if (window.defaultPositionUs != -9223372036854775807L) {
                window.defaultPositionUs = java.lang.Math.max(window.defaultPositionUs, this.startUs);
                long j2 = this.endUs;
                long j3 = window.defaultPositionUs;
                if (j2 != -9223372036854775807L) {
                    j3 = java.lang.Math.min(j3, this.endUs);
                }
                window.defaultPositionUs = j3;
                window.defaultPositionUs -= this.startUs;
            }
            long usToMs = com.google.android.exoplayer2.util.Util.usToMs(this.startUs);
            if (window.presentationStartTimeMs != -9223372036854775807L) {
                window.presentationStartTimeMs += usToMs;
            }
            if (window.windowStartTimeMs != -9223372036854775807L) {
                window.windowStartTimeMs += usToMs;
            }
            return window;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean z) {
            this.timeline.getPeriod(0, period, z);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j = this.durationUs;
            return period.set(period.id, period.uid, 0, j == -9223372036854775807L ? -9223372036854775807L : j - positionInWindowUs, positionInWindowUs);
        }
    }
}
