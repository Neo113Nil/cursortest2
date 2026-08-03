package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public class AdaptiveTrackSelection extends com.google.android.exoplayer2.trackselection.BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MAX_HEIGHT_TO_DISCARD = 719;
    public static final int DEFAULT_MAX_WIDTH_TO_DISCARD = 1279;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final java.lang.String TAG = "AdaptiveTrackSelection";
    private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint> adaptationCheckpoints;
    private final float bandwidthFraction;
    private final com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final com.google.android.exoplayer2.util.Clock clock;
    private com.google.android.exoplayer2.source.chunk.MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private final long maxDurationForQualityDecreaseUs;
    private final int maxHeightToDiscard;
    private final int maxWidthToDiscard;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    protected boolean canSelectFormat(com.google.android.exoplayer2.Format format, int i, long j) {
        return ((long) i) <= j;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public java.lang.Object getSelectionData() {
        return null;
    }

    public static class Factory implements com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final com.google.android.exoplayer2.util.Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int maxHeightToDiscard;
        private final int maxWidthToDiscard;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;

        public Factory() {
            this(10000, 25000, 25000, 0.7f);
        }

        public Factory(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, com.google.android.exoplayer2.util.Clock.DEFAULT);
        }

        public Factory(int i, int i2, int i3, int i4, int i5, float f) {
            this(i, i2, i3, i4, i5, f, 0.75f, com.google.android.exoplayer2.util.Clock.DEFAULT);
        }

        public Factory(int i, int i2, int i3, float f, float f2, com.google.android.exoplayer2.util.Clock clock) {
            this(i, i2, i3, 1279, 719, f, f2, clock);
        }

        public Factory(int i, int i2, int i3, int i4, int i5, float f, float f2, com.google.android.exoplayer2.util.Clock clock) {
            this.minDurationForQualityIncreaseMs = i;
            this.maxDurationForQualityDecreaseMs = i2;
            this.minDurationToRetainAfterDiscardMs = i3;
            this.maxWidthToDiscard = i4;
            this.maxHeightToDiscard = i5;
            this.bandwidthFraction = f;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f2;
            this.clock = clock;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        public final com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelections(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] definitionArr, com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Timeline timeline) {
            com.google.android.exoplayer2.trackselection.ExoTrackSelection createAdaptiveTrackSelection;
            com.google.common.collect.ImmutableList adaptationCheckpoints = com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.getAdaptationCheckpoints(definitionArr);
            com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[definitionArr.length];
            for (int i = 0; i < definitionArr.length; i++) {
                com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition definition = definitionArr[i];
                if (definition != null && definition.tracks.length != 0) {
                    if (definition.tracks.length == 1) {
                        createAdaptiveTrackSelection = new com.google.android.exoplayer2.trackselection.FixedTrackSelection(definition.group, definition.tracks[0], definition.type);
                    } else {
                        createAdaptiveTrackSelection = createAdaptiveTrackSelection(definition.group, definition.tracks, definition.type, bandwidthMeter, (com.google.common.collect.ImmutableList) adaptationCheckpoints.get(i));
                    }
                    exoTrackSelectionArr[i] = createAdaptiveTrackSelection;
                }
            }
            return exoTrackSelectionArr;
        }

        protected com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection createAdaptiveTrackSelection(com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr, int i, com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint> immutableList) {
            return new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection(trackGroup, iArr, i, bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.maxWidthToDiscard, this.maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, immutableList, this.clock);
        }
    }

    public AdaptiveTrackSelection(com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr, com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, 0, bandwidthMeter, 10000L, com.ironsource.V2.h, com.ironsource.V2.h, 1279, 719, 0.7f, 0.75f, com.google.common.collect.ImmutableList.of(), com.google.android.exoplayer2.util.Clock.DEFAULT);
    }

    protected AdaptiveTrackSelection(com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr, int i, com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter, long j, long j2, long j3, int i2, int i3, float f, float f2, java.util.List<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint> list, com.google.android.exoplayer2.util.Clock clock) {
        super(trackGroup, iArr, i);
        com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter2;
        long j4;
        if (j3 < j) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            bandwidthMeter2 = bandwidthMeter;
            j4 = j;
        } else {
            bandwidthMeter2 = bandwidthMeter;
            j4 = j3;
        }
        this.bandwidthMeter = bandwidthMeter2;
        this.minDurationForQualityIncreaseUs = j * 1000;
        this.maxDurationForQualityDecreaseUs = j2 * 1000;
        this.minDurationToRetainAfterDiscardUs = j4 * 1000;
        this.maxWidthToDiscard = i2;
        this.maxHeightToDiscard = i3;
        this.bandwidthFraction = f;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f2;
        this.adaptationCheckpoints = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void enable() {
        this.lastBufferEvaluationMs = -9223372036854775807L;
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f) {
        this.playbackSpeed = f;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j2, long j3, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(mediaChunkIteratorArr, list);
        int i = this.reason;
        if (i == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i2 = this.selectedIndex;
        int indexOf = list.isEmpty() ? -1 : indexOf(((com.google.android.exoplayer2.source.chunk.MediaChunk) com.google.common.collect.Iterables.getLast(list)).trackFormat);
        if (indexOf != -1) {
            i = ((com.google.android.exoplayer2.source.chunk.MediaChunk) com.google.common.collect.Iterables.getLast(list)).trackSelectionReason;
            i2 = indexOf;
        }
        int determineIdealSelectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
        if (!isBlacklisted(i2, elapsedRealtime)) {
            com.google.android.exoplayer2.Format format = getFormat(i2);
            com.google.android.exoplayer2.Format format2 = getFormat(determineIdealSelectedIndex);
            long minDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j3, nextChunkDurationUs);
            if ((format2.bitrate > format.bitrate && j2 < minDurationForQualityIncreaseUs) || (format2.bitrate < format.bitrate && j2 >= this.maxDurationForQualityDecreaseUs)) {
                determineIdealSelectedIndex = i2;
            }
        }
        if (determineIdealSelectedIndex != i2) {
            i = 3;
        }
        this.reason = i;
        this.selectedIndex = determineIdealSelectedIndex;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(elapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = elapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (com.google.android.exoplayer2.source.chunk.MediaChunk) com.google.common.collect.Iterables.getLast(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = com.google.android.exoplayer2.util.Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j, this.playbackSpeed);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (playoutDurationForMediaDuration < minDurationToRetainAfterDiscardUs) {
            return size;
        }
        com.google.android.exoplayer2.Format format = getFormat(determineIdealSelectedIndex(elapsedRealtime, getLastChunkDurationUs(list)));
        for (int i = 0; i < size; i++) {
            com.google.android.exoplayer2.source.chunk.MediaChunk mediaChunk = list.get(i);
            com.google.android.exoplayer2.Format format2 = mediaChunk.trackFormat;
            if (com.google.android.exoplayer2.util.Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j, this.playbackSpeed) >= minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && format2.height != -1 && format2.height <= this.maxHeightToDiscard && format2.width != -1 && format2.width <= this.maxWidthToDiscard && format2.height < format.height) {
                return i;
            }
        }
        return size;
    }

    protected boolean shouldEvaluateQueueSize(long j, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list) {
        long j2 = this.lastBufferEvaluationMs;
        return j2 == -9223372036854775807L || j - j2 >= 1000 || !(list.isEmpty() || ((com.google.android.exoplayer2.source.chunk.MediaChunk) com.google.common.collect.Iterables.getLast(list)).equals(this.lastBufferEvaluationMediaChunk));
    }

    protected long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    private int determineIdealSelectedIndex(long j, long j2) {
        long allocatedBandwidth = getAllocatedBandwidth(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.length; i2++) {
            if (j == Long.MIN_VALUE || !isBlacklisted(i2, j)) {
                com.google.android.exoplayer2.Format format = getFormat(i2);
                if (canSelectFormat(format, format.bitrate, allocatedBandwidth)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    private long minDurationForQualityIncreaseUs(long j, long j2) {
        if (j == -9223372036854775807L) {
            return this.minDurationForQualityIncreaseUs;
        }
        if (j2 != -9223372036854775807L) {
            j -= j2;
        }
        return java.lang.Math.min((long) (j * this.bufferedFractionToLiveEdgeForQualityIncrease), this.minDurationForQualityIncreaseUs);
    }

    private long getNextChunkDurationUs(com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list) {
        int i = this.selectedIndex;
        if (i < mediaChunkIteratorArr.length && mediaChunkIteratorArr[i].next()) {
            com.google.android.exoplayer2.source.chunk.MediaChunkIterator mediaChunkIterator = mediaChunkIteratorArr[this.selectedIndex];
            return mediaChunkIterator.getChunkEndTimeUs() - mediaChunkIterator.getChunkStartTimeUs();
        }
        for (com.google.android.exoplayer2.source.chunk.MediaChunkIterator mediaChunkIterator2 : mediaChunkIteratorArr) {
            if (mediaChunkIterator2.next()) {
                return mediaChunkIterator2.getChunkEndTimeUs() - mediaChunkIterator2.getChunkStartTimeUs();
            }
        }
        return getLastChunkDurationUs(list);
    }

    private long getLastChunkDurationUs(java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        com.google.android.exoplayer2.source.chunk.MediaChunk mediaChunk = (com.google.android.exoplayer2.source.chunk.MediaChunk) com.google.common.collect.Iterables.getLast(list);
        if (mediaChunk.startTimeUs == -9223372036854775807L || mediaChunk.endTimeUs == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return mediaChunk.endTimeUs - mediaChunk.startTimeUs;
    }

    private long getAllocatedBandwidth(long j) {
        long totalAllocatableBandwidth = getTotalAllocatableBandwidth(j);
        if (this.adaptationCheckpoints.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i = 1;
        while (i < this.adaptationCheckpoints.size() - 1 && this.adaptationCheckpoints.get(i).totalBandwidth < totalAllocatableBandwidth) {
            i++;
        }
        com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint adaptationCheckpoint = this.adaptationCheckpoints.get(i - 1);
        com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint adaptationCheckpoint2 = this.adaptationCheckpoints.get(i);
        return adaptationCheckpoint.allocatedBandwidth + ((long) (((totalAllocatableBandwidth - adaptationCheckpoint.totalBandwidth) / (adaptationCheckpoint2.totalBandwidth - adaptationCheckpoint.totalBandwidth)) * (adaptationCheckpoint2.allocatedBandwidth - adaptationCheckpoint.allocatedBandwidth)));
    }

    private long getTotalAllocatableBandwidth(long j) {
        long bitrateEstimate = (long) (this.bandwidthMeter.getBitrateEstimate() * this.bandwidthFraction);
        long timeToFirstByteEstimateUs = this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (bitrateEstimate / this.playbackSpeed);
        }
        float f = j;
        return (long) ((bitrateEstimate * java.lang.Math.max((f / this.playbackSpeed) - timeToFirstByteEstimateUs, 0.0f)) / f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint>> getAdaptationCheckpoints(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] definitionArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition definition : definitionArr) {
            if (definition != null && definition.tracks.length > 1) {
                com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
                builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint(0L, 0L));
                arrayList.add(builder);
            } else {
                arrayList.add(null);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(definitionArr);
        int[] iArr = new int[sortedTrackBitrates.length];
        long[] jArr = new long[sortedTrackBitrates.length];
        for (int i = 0; i < sortedTrackBitrates.length; i++) {
            long[] jArr2 = sortedTrackBitrates[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        addCheckpoint(arrayList, jArr);
        com.google.common.collect.ImmutableList<java.lang.Integer> switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i2 = 0; i2 < switchOrder.size(); i2++) {
            int intValue = switchOrder.get(i2).intValue();
            int i3 = iArr[intValue] + 1;
            iArr[intValue] = i3;
            jArr[intValue] = sortedTrackBitrates[intValue][i3];
            addCheckpoint(arrayList, jArr);
        }
        for (int i4 = 0; i4 < definitionArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        addCheckpoint(arrayList, jArr);
        com.google.common.collect.ImmutableList.Builder builder2 = com.google.common.collect.ImmutableList.builder();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            com.google.common.collect.ImmutableList.Builder builder3 = (com.google.common.collect.ImmutableList.Builder) arrayList.get(i5);
            builder2.add((com.google.common.collect.ImmutableList.Builder) (builder3 == null ? com.google.common.collect.ImmutableList.of() : builder3.build()));
        }
        return builder2.build();
    }

    private static long[][] getSortedTrackBitrates(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] definitionArr) {
        long[][] jArr = new long[definitionArr.length][];
        for (int i = 0; i < definitionArr.length; i++) {
            com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition definition = definitionArr[i];
            if (definition == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[definition.tracks.length];
                for (int i2 = 0; i2 < definition.tracks.length; i2++) {
                    long j = definition.group.getFormat(definition.tracks[i2]).bitrate;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i2] = j;
                }
                java.util.Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    private static com.google.common.collect.ImmutableList<java.lang.Integer> getSwitchOrder(long[][] jArr) {
        com.google.common.collect.Multimap build = com.google.common.collect.MultimapBuilder.treeKeys().arrayListValues().build();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double d = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        d = java.lang.Math.log(j);
                    }
                    dArr[i2] = d;
                    i2++;
                }
                int i3 = length - 1;
                double d2 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d3 = dArr[i4];
                    i4++;
                    build.put(java.lang.Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i4]) * 0.5d) - dArr[0]) / d2), java.lang.Integer.valueOf(i));
                }
            }
        }
        return com.google.common.collect.ImmutableList.copyOf(build.values());
    }

    private static void addCheckpoint(java.util.List<com.google.common.collect.ImmutableList.Builder<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            com.google.common.collect.ImmutableList.Builder<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint> builder = list.get(i);
            if (builder != null) {
                builder.add((com.google.common.collect.ImmutableList.Builder<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint>) new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint(j, jArr[i]));
            }
        }
    }

    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long j, long j2) {
            this.totalBandwidth = j;
            this.allocatedBandwidth = j2;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint)) {
                return false;
            }
            com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint adaptationCheckpoint = (com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.AdaptationCheckpoint) obj;
            return this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }
    }
}
