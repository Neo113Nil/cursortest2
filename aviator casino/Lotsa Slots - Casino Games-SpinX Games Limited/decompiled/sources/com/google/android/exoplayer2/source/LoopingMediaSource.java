package com.google.android.exoplayer2.source;

@java.lang.Deprecated
/* loaded from: classes3.dex */
public final class LoopingMediaSource extends com.google.android.exoplayer2.source.WrappingMediaSource {
    private final java.util.Map<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> childMediaPeriodIdToMediaPeriodId;
    private final int loopCount;
    private final java.util.Map<com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> mediaPeriodToChildMediaPeriodId;

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public LoopingMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource) {
        this(mediaSource, Integer.MAX_VALUE);
    }

    public LoopingMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, int i) {
        super(new com.google.android.exoplayer2.source.MaskingMediaSource(mediaSource, false));
        com.google.android.exoplayer2.util.Assertions.checkArgument(i > 0);
        this.loopCount = i;
        this.childMediaPeriodIdToMediaPeriodId = new java.util.HashMap();
        this.mediaPeriodToChildMediaPeriodId = new java.util.HashMap();
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.Timeline getInitialTimeline() {
        com.google.android.exoplayer2.source.MaskingMediaSource maskingMediaSource = (com.google.android.exoplayer2.source.MaskingMediaSource) this.mediaSource;
        if (this.loopCount != Integer.MAX_VALUE) {
            return new com.google.android.exoplayer2.source.LoopingMediaSource.LoopingTimeline(maskingMediaSource.getTimeline(), this.loopCount);
        }
        return new com.google.android.exoplayer2.source.LoopingMediaSource.InfinitelyLoopingTimeline(maskingMediaSource.getTimeline());
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.upstream.Allocator allocator, long j) {
        if (this.loopCount == Integer.MAX_VALUE) {
            return this.mediaSource.createPeriod(mediaPeriodId, allocator, j);
        }
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId copyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(com.google.android.exoplayer2.source.LoopingMediaSource.LoopingTimeline.getChildPeriodUidFromConcatenatedUid(mediaPeriodId.periodUid));
        this.childMediaPeriodIdToMediaPeriodId.put(copyWithPeriodUid, mediaPeriodId);
        com.google.android.exoplayer2.source.MediaPeriod createPeriod = this.mediaSource.createPeriod(copyWithPeriodUid, allocator, j);
        this.mediaPeriodToChildMediaPeriodId.put(createPeriod, copyWithPeriodUid);
        return createPeriod;
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        this.mediaSource.releasePeriod(mediaPeriod);
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId remove = this.mediaPeriodToChildMediaPeriodId.remove(mediaPeriod);
        if (remove != null) {
            this.childMediaPeriodIdToMediaPeriodId.remove(remove);
        }
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    protected void onChildSourceInfoRefreshed(com.google.android.exoplayer2.Timeline timeline) {
        com.google.android.exoplayer2.Timeline infinitelyLoopingTimeline;
        if (this.loopCount != Integer.MAX_VALUE) {
            infinitelyLoopingTimeline = new com.google.android.exoplayer2.source.LoopingMediaSource.LoopingTimeline(timeline, this.loopCount);
        } else {
            infinitelyLoopingTimeline = new com.google.android.exoplayer2.source.LoopingMediaSource.InfinitelyLoopingTimeline(timeline);
        }
        refreshSourceInfo(infinitelyLoopingTimeline);
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    protected com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return this.loopCount != Integer.MAX_VALUE ? this.childMediaPeriodIdToMediaPeriodId.get(mediaPeriodId) : mediaPeriodId;
    }

    private static final class LoopingTimeline extends com.google.android.exoplayer2.AbstractConcatenatedTimeline {
        private final int childPeriodCount;
        private final com.google.android.exoplayer2.Timeline childTimeline;
        private final int childWindowCount;
        private final int loopCount;

        public LoopingTimeline(com.google.android.exoplayer2.Timeline timeline, int i) {
            super(false, new com.google.android.exoplayer2.source.ShuffleOrder.UnshuffledShuffleOrder(i));
            this.childTimeline = timeline;
            int periodCount = timeline.getPeriodCount();
            this.childPeriodCount = periodCount;
            this.childWindowCount = timeline.getWindowCount();
            this.loopCount = i;
            if (periodCount > 0) {
                com.google.android.exoplayer2.util.Assertions.checkState(i <= Integer.MAX_VALUE / periodCount, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return this.childWindowCount * this.loopCount;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.childPeriodCount * this.loopCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByPeriodIndex(int i) {
            return i / this.childPeriodCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByWindowIndex(int i) {
            return i / this.childWindowCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getChildIndexByChildUid(java.lang.Object obj) {
            if (obj instanceof java.lang.Integer) {
                return ((java.lang.Integer) obj).intValue();
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected com.google.android.exoplayer2.Timeline getTimelineByChildIndex(int i) {
            return this.childTimeline;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getFirstPeriodIndexByChildIndex(int i) {
            return i * this.childPeriodCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected int getFirstWindowIndexByChildIndex(int i) {
            return i * this.childWindowCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        protected java.lang.Object getChildUidByChildIndex(int i) {
            return java.lang.Integer.valueOf(i);
        }
    }

    private static final class InfinitelyLoopingTimeline extends com.google.android.exoplayer2.source.ForwardingTimeline {
        public InfinitelyLoopingTimeline(com.google.android.exoplayer2.Timeline timeline) {
            super(timeline);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int i, int i2, boolean z) {
            int nextWindowIndex = this.timeline.getNextWindowIndex(i, i2, z);
            return nextWindowIndex == -1 ? getFirstWindowIndex(z) : nextWindowIndex;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            int previousWindowIndex = this.timeline.getPreviousWindowIndex(i, i2, z);
            return previousWindowIndex == -1 ? getLastWindowIndex(z) : previousWindowIndex;
        }
    }
}
