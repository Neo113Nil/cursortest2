package androidx.media3.exoplayer.source;

/* loaded from: classes2.dex */
public final class ConcatenatingMediaSource2 extends androidx.media3.exoplayer.source.CompositeMediaSource<java.lang.Integer> {
    private static final int MSG_UPDATE_TIMELINE = 1;
    private androidx.media3.common.MediaItem mediaItem;
    private final java.util.IdentityHashMap<androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.ConcatenatingMediaSource2.MediaSourceHolder> mediaSourceByMediaPeriod;
    private final com.google.common.collect.ImmutableList<androidx.media3.exoplayer.source.ConcatenatingMediaSource2.MediaSourceHolder> mediaSourceHolders;
    private android.os.Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    private static long getChildWindowSequenceNumber(long j, int i, int i2) {
        return (j * i) + i2;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void enableInternal() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(java.lang.Integer num, int i) {
        return 0;
    }

    public static final class Builder {
        private int index;
        private androidx.media3.common.MediaItem mediaItem;
        private androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory;
        private final com.google.common.collect.ImmutableList.Builder<androidx.media3.exoplayer.source.ConcatenatingMediaSource2.MediaSourceHolder> mediaSourceHoldersBuilder = com.google.common.collect.ImmutableList.builder();

        public androidx.media3.exoplayer.source.ConcatenatingMediaSource2.Builder useDefaultMediaSourceFactory(android.content.Context context) {
            return setMediaSourceFactory(new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(context));
        }

        public androidx.media3.exoplayer.source.ConcatenatingMediaSource2.Builder setMediaSourceFactory(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            this.mediaSourceFactory = (androidx.media3.exoplayer.source.MediaSource.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory);
            return this;
        }

        public androidx.media3.exoplayer.source.ConcatenatingMediaSource2.Builder setMediaItem(androidx.media3.common.MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        public androidx.media3.exoplayer.source.ConcatenatingMediaSource2.Builder add(androidx.media3.common.MediaItem mediaItem) {
            return add(mediaItem, -9223372036854775807L);
        }

        public androidx.media3.exoplayer.source.ConcatenatingMediaSource2.Builder add(androidx.media3.common.MediaItem mediaItem, long j) {
            androidx.media3.common.util.Assertions.checkNotNull(mediaItem);
            if (j == -9223372036854775807L && mediaItem.clippingConfiguration.endPositionMs != Long.MIN_VALUE) {
                j = androidx.media3.common.util.Util.usToMs(mediaItem.clippingConfiguration.endPositionUs - mediaItem.clippingConfiguration.startPositionUs);
            }
            androidx.media3.common.util.Assertions.checkStateNotNull(this.mediaSourceFactory, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return add(this.mediaSourceFactory.createMediaSource(mediaItem), j);
        }

        public androidx.media3.exoplayer.source.ConcatenatingMediaSource2.Builder add(androidx.media3.exoplayer.source.MediaSource mediaSource) {
            return add(mediaSource, -9223372036854775807L);
        }

        public androidx.media3.exoplayer.source.ConcatenatingMediaSource2.Builder add(androidx.media3.exoplayer.source.MediaSource mediaSource, long j) {
            androidx.media3.common.util.Assertions.checkNotNull(mediaSource);
            androidx.media3.common.util.Assertions.checkState(((mediaSource instanceof androidx.media3.exoplayer.source.ProgressiveMediaSource) && j == -9223372036854775807L) ? false : true, "Progressive media source must define an initial placeholder duration.");
            com.google.common.collect.ImmutableList.Builder<androidx.media3.exoplayer.source.ConcatenatingMediaSource2.MediaSourceHolder> builder = this.mediaSourceHoldersBuilder;
            int i = this.index;
            this.index = i + 1;
            builder.add((com.google.common.collect.ImmutableList.Builder<androidx.media3.exoplayer.source.ConcatenatingMediaSource2.MediaSourceHolder>) new androidx.media3.exoplayer.source.ConcatenatingMediaSource2.MediaSourceHolder(mediaSource, i, androidx.media3.common.util.Util.msToUs(j)));
            return this;
        }

        public androidx.media3.exoplayer.source.ConcatenatingMediaSource2 build() {
            androidx.media3.common.util.Assertions.checkArgument(this.index > 0, "Must add at least one source to the concatenation.");
            if (this.mediaItem == null) {
                this.mediaItem = androidx.media3.common.MediaItem.fromUri(android.net.Uri.EMPTY);
            }
            return new androidx.media3.exoplayer.source.ConcatenatingMediaSource2(this.mediaItem, this.mediaSourceHoldersBuilder.build());
        }
    }

    private ConcatenatingMediaSource2(androidx.media3.common.MediaItem mediaItem, com.google.common.collect.ImmutableList<androidx.media3.exoplayer.source.ConcatenatingMediaSource2.MediaSourceHolder> immutableList) {
        this.mediaItem = mediaItem;
        this.mediaSourceHolders = immutableList;
        this.mediaSourceByMediaPeriod = new java.util.IdentityHashMap<>();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.common.Timeline getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized androidx.media3.common.MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new android.os.Handler(new android.os.Handler.Callback() { // from class: androidx.media3.exoplayer.source.ConcatenatingMediaSource2$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                boolean handleMessage;
                handleMessage = androidx.media3.exoplayer.source.ConcatenatingMediaSource2.this.handleMessage(message);
                return handleMessage;
            }
        });
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            prepareChildSource(java.lang.Integer.valueOf(i), this.mediaSourceHolders.get(i).mediaSource);
        }
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        androidx.media3.exoplayer.source.ConcatenatingMediaSource2.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(getChildIndex(mediaPeriodId.periodUid));
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId copyWithWindowSequenceNumber = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size(), mediaSourceHolder.index));
        enableChildSource(java.lang.Integer.valueOf(mediaSourceHolder.index));
        mediaSourceHolder.activeMediaPeriods++;
        long longValue = mediaPeriodId.isAd() ? 0L : ((java.lang.Long) androidx.media3.common.util.Assertions.checkNotNull(mediaSourceHolder.periodTimeOffsetsByUid.get(copyWithWindowSequenceNumber.periodUid))).longValue();
        androidx.media3.exoplayer.source.TimeOffsetMediaPeriod timeOffsetMediaPeriod = new androidx.media3.exoplayer.source.TimeOffsetMediaPeriod(mediaSourceHolder.mediaSource.createPeriod(copyWithWindowSequenceNumber, allocator, j - longValue), longValue);
        this.mediaSourceByMediaPeriod.put(timeOffsetMediaPeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return timeOffsetMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.source.ConcatenatingMediaSource2.MediaSourceHolder) androidx.media3.common.util.Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod))).mediaSource.releasePeriod(((androidx.media3.exoplayer.source.TimeOffsetMediaPeriod) mediaPeriod).getWrappedMediaPeriod());
        r0.activeMediaPeriods--;
        if (this.mediaSourceByMediaPeriod.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        android.os.Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void m4866x28f9175(java.lang.Integer num, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
        scheduleTimelineUpdate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(java.lang.Integer num, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size())) {
            return null;
        }
        return mediaPeriodId.copyWithPeriodUid(getPeriodUid(num.intValue(), mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(java.lang.Integer num, long j, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        java.lang.Long l;
        return (j == -9223372036854775807L || mediaPeriodId == null || mediaPeriodId.isAd() || (l = this.mediaSourceHolders.get(num.intValue()).periodTimeOffsetsByUid.get(mediaPeriodId.periodUid)) == null) ? j : j + androidx.media3.common.util.Util.usToMs(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 1) {
            updateTimeline();
        }
        return true;
    }

    private void scheduleTimelineUpdate() {
        if (this.timelineUpdateScheduled) {
            return;
        }
        ((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(this.playbackThreadHandler)).obtainMessage(1).sendToTarget();
        this.timelineUpdateScheduled = true;
    }

    private void updateTimeline() {
        this.timelineUpdateScheduled = false;
        androidx.media3.exoplayer.source.ConcatenatingMediaSource2.ConcatenatedTimeline maybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (maybeCreateConcatenatedTimeline != null) {
            refreshSourceInfo(maybeCreateConcatenatedTimeline);
        }
    }

    private void disableUnusedMediaSources() {
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            androidx.media3.exoplayer.source.ConcatenatingMediaSource2.MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i);
            if (mediaSourceHolder.activeMediaPeriods == 0) {
                disableChildSource(java.lang.Integer.valueOf(mediaSourceHolder.index));
            }
        }
    }

    private androidx.media3.exoplayer.source.ConcatenatingMediaSource2.ConcatenatedTimeline maybeCreateConcatenatedTimeline() {
        int i;
        boolean z;
        boolean z2;
        java.lang.Object obj;
        java.lang.Object obj2;
        androidx.media3.common.Timeline timeline;
        long j;
        androidx.media3.common.Timeline.Period period;
        boolean z3;
        androidx.media3.exoplayer.source.ConcatenatingMediaSource2 concatenatingMediaSource2 = this;
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        androidx.media3.common.Timeline.Period period2 = new androidx.media3.common.Timeline.Period();
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder builder2 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder builder3 = com.google.common.collect.ImmutableList.builder();
        int size = concatenatingMediaSource2.mediaSourceHolders.size();
        boolean z4 = true;
        int i2 = 0;
        boolean z5 = true;
        java.lang.Object obj3 = null;
        int i3 = 0;
        boolean z6 = false;
        boolean z7 = true;
        boolean z8 = false;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (i2 < size) {
            androidx.media3.exoplayer.source.ConcatenatingMediaSource2.MediaSourceHolder mediaSourceHolder = concatenatingMediaSource2.mediaSourceHolders.get(i2);
            androidx.media3.common.Timeline timeline2 = mediaSourceHolder.mediaSource.getTimeline();
            androidx.media3.common.util.Assertions.checkArgument(timeline2.isEmpty() ^ z4, "Can't concatenate empty child Timeline.");
            builder.add((com.google.common.collect.ImmutableList.Builder) timeline2);
            builder2.add((com.google.common.collect.ImmutableList.Builder) java.lang.Integer.valueOf(i3));
            i3 += timeline2.getPeriodCount();
            int i4 = 0;
            while (i4 < timeline2.getWindowCount()) {
                timeline2.getWindow(i4, window);
                if (!z6) {
                    obj3 = window.manifest;
                    z6 = true;
                }
                if (z5 && androidx.media3.common.util.Util.areEqual(obj3, window.manifest)) {
                    i = i2;
                    z = true;
                } else {
                    i = i2;
                    z = false;
                }
                long j5 = window.durationUs;
                if (j5 == -9223372036854775807L) {
                    if (mediaSourceHolder.initialPlaceholderDurationUs == -9223372036854775807L) {
                        return null;
                    }
                    j5 = mediaSourceHolder.initialPlaceholderDurationUs;
                }
                j2 += j5;
                if (mediaSourceHolder.index == 0 && i4 == 0) {
                    z2 = z;
                    obj = obj3;
                    j3 = window.defaultPositionUs;
                    j4 = -window.positionInFirstPeriodUs;
                } else {
                    z2 = z;
                    obj = obj3;
                }
                z7 &= window.isSeekable || window.isPlaceholder;
                z8 |= window.isDynamic;
                int i5 = window.firstPeriodIndex;
                while (i5 <= window.lastPeriodIndex) {
                    builder3.add((com.google.common.collect.ImmutableList.Builder) java.lang.Long.valueOf(j4));
                    timeline2.getPeriod(i5, period2, true);
                    int i6 = i3;
                    long j6 = period2.durationUs;
                    if (j6 == -9223372036854775807L) {
                        androidx.media3.common.util.Assertions.checkArgument(window.firstPeriodIndex == window.lastPeriodIndex, "Can't apply placeholder duration to multiple periods with unknown duration in a single window.");
                        j6 = window.positionInFirstPeriodUs + j5;
                    }
                    if (i5 != window.firstPeriodIndex || ((mediaSourceHolder.index == 0 && i4 == 0) || j6 == -9223372036854775807L)) {
                        obj2 = obj;
                        timeline = timeline2;
                        j = 0;
                    } else {
                        androidx.media3.common.Timeline timeline3 = timeline2;
                        obj2 = obj;
                        j = -window.positionInFirstPeriodUs;
                        j6 += j;
                        timeline = timeline3;
                    }
                    java.lang.Object checkNotNull = androidx.media3.common.util.Assertions.checkNotNull(period2.uid);
                    androidx.media3.common.Timeline.Window window2 = window;
                    if (mediaSourceHolder.activeMediaPeriods == 0 || !mediaSourceHolder.periodTimeOffsetsByUid.containsKey(checkNotNull)) {
                        period = period2;
                    } else {
                        period = period2;
                        if (!mediaSourceHolder.periodTimeOffsetsByUid.get(checkNotNull).equals(java.lang.Long.valueOf(j))) {
                            z3 = false;
                            androidx.media3.common.util.Assertions.checkArgument(z3, "Can't handle windows with changing offset in first period.");
                            mediaSourceHolder.periodTimeOffsetsByUid.put(checkNotNull, java.lang.Long.valueOf(j));
                            j4 += j6;
                            i5++;
                            i3 = i6;
                            obj = obj2;
                            timeline2 = timeline;
                            window = window2;
                            period2 = period;
                        }
                    }
                    z3 = true;
                    androidx.media3.common.util.Assertions.checkArgument(z3, "Can't handle windows with changing offset in first period.");
                    mediaSourceHolder.periodTimeOffsetsByUid.put(checkNotNull, java.lang.Long.valueOf(j));
                    j4 += j6;
                    i5++;
                    i3 = i6;
                    obj = obj2;
                    timeline2 = timeline;
                    window = window2;
                    period2 = period;
                }
                i4++;
                i2 = i;
                z5 = z2;
                obj3 = obj;
            }
            i2++;
            z4 = true;
            concatenatingMediaSource2 = this;
        }
        return new androidx.media3.exoplayer.source.ConcatenatingMediaSource2.ConcatenatedTimeline(getMediaItem(), builder.build(), builder2.build(), builder3.build(), z7, z8, j2, j3, z5 ? obj3 : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object getPeriodUid(int i, java.lang.Object obj) {
        return android.util.Pair.create(java.lang.Integer.valueOf(i), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getChildIndex(java.lang.Object obj) {
        return ((java.lang.Integer) ((android.util.Pair) obj).first).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object getChildPeriodUid(java.lang.Object obj) {
        return ((android.util.Pair) obj).second;
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j, int i) {
        return (int) (j % i);
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j, int i) {
        return j / i;
    }

    static final class MediaSourceHolder {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final androidx.media3.exoplayer.source.MaskingMediaSource mediaSource;
        public final java.util.HashMap<java.lang.Object, java.lang.Long> periodTimeOffsetsByUid = new java.util.HashMap<>();

        public MediaSourceHolder(androidx.media3.exoplayer.source.MediaSource mediaSource, int i, long j) {
            this.mediaSource = new androidx.media3.exoplayer.source.MaskingMediaSource(mediaSource, false);
            this.index = i;
            this.initialPlaceholderDurationUs = j;
        }
    }

    private static final class ConcatenatedTimeline extends androidx.media3.common.Timeline {
        private final long defaultPositionUs;
        private final long durationUs;
        private final com.google.common.collect.ImmutableList<java.lang.Integer> firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;
        private final java.lang.Object manifest;
        private final androidx.media3.common.MediaItem mediaItem;
        private final com.google.common.collect.ImmutableList<java.lang.Long> periodOffsetsInWindowUs;
        private final com.google.common.collect.ImmutableList<androidx.media3.common.Timeline> timelines;

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }

        public ConcatenatedTimeline(androidx.media3.common.MediaItem mediaItem, com.google.common.collect.ImmutableList<androidx.media3.common.Timeline> immutableList, com.google.common.collect.ImmutableList<java.lang.Integer> immutableList2, com.google.common.collect.ImmutableList<java.lang.Long> immutableList3, boolean z, boolean z2, long j, long j2, java.lang.Object obj) {
            this.mediaItem = mediaItem;
            this.timelines = immutableList;
            this.firstPeriodIndices = immutableList2;
            this.periodOffsetsInWindowUs = immutableList3;
            this.isSeekable = z;
            this.isDynamic = z2;
            this.durationUs = j;
            this.defaultPositionUs = j2;
            this.manifest = obj;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodOffsetsInWindowUs.size();
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
            return window.set(androidx.media3.common.Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.isSeekable, this.isDynamic, null, this.defaultPositionUs, this.durationUs, 0, getPeriodCount() - 1, -this.periodOffsetsInWindowUs.get(0).longValue());
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriodByUid(java.lang.Object obj, androidx.media3.common.Timeline.Period period) {
            int childIndex = androidx.media3.exoplayer.source.ConcatenatingMediaSource2.getChildIndex(obj);
            java.lang.Object childPeriodUid = androidx.media3.exoplayer.source.ConcatenatingMediaSource2.getChildPeriodUid(obj);
            androidx.media3.common.Timeline timeline = this.timelines.get(childIndex);
            int intValue = this.firstPeriodIndices.get(childIndex).intValue() + timeline.getIndexOfPeriod(childPeriodUid);
            timeline.getPeriodByUid(childPeriodUid, period);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(intValue).longValue();
            period.durationUs = getPeriodDurationUs(period, intValue);
            period.uid = obj;
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            this.timelines.get(childIndexByPeriodIndex).getPeriod(i - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue(), period, z);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(i).longValue();
            period.durationUs = getPeriodDurationUs(period, i);
            if (z) {
                period.uid = androidx.media3.exoplayer.source.ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, androidx.media3.common.util.Assertions.checkNotNull(period.uid));
            }
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            if (!(obj instanceof android.util.Pair) || !(((android.util.Pair) obj).first instanceof java.lang.Integer)) {
                return -1;
            }
            int childIndex = androidx.media3.exoplayer.source.ConcatenatingMediaSource2.getChildIndex(obj);
            int indexOfPeriod = this.timelines.get(childIndex).getIndexOfPeriod(androidx.media3.exoplayer.source.ConcatenatingMediaSource2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return this.firstPeriodIndices.get(childIndex).intValue() + indexOfPeriod;
        }

        @Override // androidx.media3.common.Timeline
        public java.lang.Object getUidOfPeriod(int i) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            return androidx.media3.exoplayer.source.ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, this.timelines.get(childIndexByPeriodIndex).getUidOfPeriod(i - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue()));
        }

        private int getChildIndexByPeriodIndex(int i) {
            return androidx.media3.common.util.Util.binarySearchFloor((java.util.List<? extends java.lang.Comparable<? super java.lang.Integer>>) this.firstPeriodIndices, java.lang.Integer.valueOf(i + 1), false, false);
        }

        private long getPeriodDurationUs(androidx.media3.common.Timeline.Period period, int i) {
            long longValue;
            if (period.durationUs == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            long longValue2 = this.periodOffsetsInWindowUs.get(i).longValue();
            if (i == this.periodOffsetsInWindowUs.size() - 1) {
                longValue = this.durationUs;
            } else {
                longValue = this.periodOffsetsInWindowUs.get(i + 1).longValue();
            }
            return longValue - longValue2;
        }
    }
}
