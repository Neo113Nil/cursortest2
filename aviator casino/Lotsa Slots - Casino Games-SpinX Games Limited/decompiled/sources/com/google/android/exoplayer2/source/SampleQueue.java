package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public class SampleQueue implements com.google.android.exoplayer2.extractor.TrackOutput {
    static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final java.lang.String TAG = "SampleQueue";
    private int absoluteFirstIndex;
    private com.google.android.exoplayer2.drm.DrmSession currentDrmSession;
    private com.google.android.exoplayer2.Format downstreamFormat;
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
    private boolean isLastSampleQueued;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private boolean pendingSplice;
    private int readPosition;
    private int relativeFirstIndex;
    private final com.google.android.exoplayer2.source.SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;
    private com.google.android.exoplayer2.Format unadjustedUpstreamFormat;
    private boolean upstreamAllSamplesAreSyncSamples;
    private com.google.android.exoplayer2.Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;
    private com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener upstreamFormatChangeListener;
    private int upstreamSourceId;
    private final com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder extrasHolder = new com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder();
    private int capacity = 1000;
    private int[] sourceIds = new int[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private com.google.android.exoplayer2.extractor.TrackOutput.CryptoData[] cryptoDatas = new com.google.android.exoplayer2.extractor.TrackOutput.CryptoData[1000];
    private final com.google.android.exoplayer2.source.SpannedData<com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata> sharedSampleMetadata = new com.google.android.exoplayer2.source.SpannedData<>(new com.google.android.exoplayer2.util.Consumer() { // from class: com.google.android.exoplayer2.source.SampleQueue$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.util.Consumer
        public final void accept(java.lang.Object obj) {
            ((com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata) obj).drmSessionReference.release();
        }
    });
    private long startTimeUs = Long.MIN_VALUE;
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;

    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(com.google.android.exoplayer2.Format format);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public /* synthetic */ int sampleData(com.google.android.exoplayer2.upstream.DataReader dataReader, int i, boolean z) {
        int sampleData;
        sampleData = sampleData(dataReader, i, z, 0);
        return sampleData;
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public /* synthetic */ void sampleData(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) {
        sampleData(parsableByteArray, i, 0);
    }

    public static com.google.android.exoplayer2.source.SampleQueue createWithoutDrm(com.google.android.exoplayer2.upstream.Allocator allocator) {
        return new com.google.android.exoplayer2.source.SampleQueue(allocator, null, null);
    }

    public static com.google.android.exoplayer2.source.SampleQueue createWithDrm(com.google.android.exoplayer2.upstream.Allocator allocator, com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new com.google.android.exoplayer2.source.SampleQueue(allocator, (com.google.android.exoplayer2.drm.DrmSessionManager) com.google.android.exoplayer2.util.Assertions.checkNotNull(drmSessionManager), (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher) com.google.android.exoplayer2.util.Assertions.checkNotNull(eventDispatcher));
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.source.SampleQueue createWithDrm(com.google.android.exoplayer2.upstream.Allocator allocator, android.os.Looper looper, com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSessionManager.setPlayer(looper, com.google.android.exoplayer2.analytics.PlayerId.UNSET);
        return new com.google.android.exoplayer2.source.SampleQueue(allocator, (com.google.android.exoplayer2.drm.DrmSessionManager) com.google.android.exoplayer2.util.Assertions.checkNotNull(drmSessionManager), (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher) com.google.android.exoplayer2.util.Assertions.checkNotNull(eventDispatcher));
    }

    protected SampleQueue(com.google.android.exoplayer2.upstream.Allocator allocator, com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.sampleDataQueue = new com.google.android.exoplayer2.source.SampleDataQueue(allocator);
    }

    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public final void reset() {
        reset(false);
    }

    public void reset(boolean z) {
        this.sampleDataQueue.reset();
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.upstreamKeyframeRequired = true;
        this.startTimeUs = Long.MIN_VALUE;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        this.sharedSampleMetadata.clear();
        if (z) {
            this.unadjustedUpstreamFormat = null;
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
        }
    }

    public final void setStartTimeUs(long j) {
        this.startTimeUs = j;
    }

    public final void sourceId(int i) {
        this.upstreamSourceId = i;
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    public final void discardUpstreamSamples(int i) {
        this.sampleDataQueue.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i));
    }

    public final void discardUpstreamFrom(long j) {
        if (this.length == 0) {
            return;
        }
        com.google.android.exoplayer2.util.Assertions.checkArgument(j > getLargestReadTimestampUs());
        discardUpstreamSamples(this.absoluteFirstIndex + countUnreadSamplesBefore(j));
    }

    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    public void maybeThrowError() throws java.io.IOException {
        com.google.android.exoplayer2.drm.DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((com.google.android.exoplayer2.drm.DrmSession.DrmSessionException) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.currentDrmSession.getError()));
        }
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized int peekSourceId() {
        return hasNextSample() ? this.sourceIds[getRelativeIndex(this.readPosition)] : this.upstreamSourceId;
    }

    public final synchronized com.google.android.exoplayer2.Format getUpstreamFormat() {
        return this.upstreamFormatRequired ? null : this.upstreamFormat;
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return java.lang.Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition));
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.isLastSampleQueued;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.length == 0 ? Long.MIN_VALUE : this.timesUs[this.relativeFirstIndex];
    }

    public synchronized boolean isReady(boolean z) {
        com.google.android.exoplayer2.Format format;
        boolean z2 = true;
        if (!hasNextSample()) {
            if (!z && !this.isLastSampleQueued && ((format = this.upstreamFormat) == null || format == this.downstreamFormat)) {
                z2 = false;
            }
            return z2;
        }
        if (this.sharedSampleMetadata.get(getReadIndex()).format != this.downstreamFormat) {
            return true;
        }
        return mayReadSample(getRelativeIndex(this.readPosition));
    }

    public int read(com.google.android.exoplayer2.FormatHolder formatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        int peekSampleMetadata = peekSampleMetadata(formatHolder, decoderInputBuffer, (i & 2) != 0, z, this.extrasHolder);
        if (peekSampleMetadata == -4 && !decoderInputBuffer.isEndOfStream()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z2) {
                    this.sampleDataQueue.peekToBuffer(decoderInputBuffer, this.extrasHolder);
                } else {
                    this.sampleDataQueue.readToBuffer(decoderInputBuffer, this.extrasHolder);
                }
            }
            if (!z2) {
                this.readPosition++;
            }
        }
        return peekSampleMetadata;
    }

    public final synchronized boolean seekTo(int i) {
        rewind();
        int i2 = this.absoluteFirstIndex;
        if (i >= i2 && i <= this.length + i2) {
            this.startTimeUs = Long.MIN_VALUE;
            this.readPosition = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean seekTo(long j, boolean z) {
        rewind();
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j >= this.timesUs[relativeIndex] && (j <= this.largestQueuedTimestampUs || z)) {
            int findSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j, true);
            if (findSampleBefore == -1) {
                return false;
            }
            this.startTimeUs = j;
            this.readPosition += findSampleBefore;
            return true;
        }
        return false;
    }

    public final synchronized int getSkipCount(long j, boolean z) {
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j >= this.timesUs[relativeIndex]) {
            if (j > this.largestQueuedTimestampUs && z) {
                return this.length - this.readPosition;
            }
            int findSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j, true);
            if (findSampleBefore == -1) {
                return 0;
            }
            return findSampleBefore;
        }
        return 0;
    }

    public final synchronized void skip(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.readPosition + i <= this.length) {
                    z = true;
                    com.google.android.exoplayer2.util.Assertions.checkArgument(z);
                    this.readPosition += i;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        z = false;
        com.google.android.exoplayer2.util.Assertions.checkArgument(z);
        this.readPosition += i;
    }

    public final void discardTo(long j, boolean z, boolean z2) {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataTo(j, z, z2));
    }

    public final void discardToRead() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardToEnd() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void setSampleOffsetUs(long j) {
        if (this.sampleOffsetUs != j) {
            this.sampleOffsetUs = j;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setUpstreamFormatChangeListener(com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void format(com.google.android.exoplayer2.Format format) {
        com.google.android.exoplayer2.Format adjustedUpstreamFormat = getAdjustedUpstreamFormat(format);
        this.upstreamFormatAdjustmentRequired = false;
        this.unadjustedUpstreamFormat = format;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener == null || !upstreamFormat) {
            return;
        }
        upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int sampleData(com.google.android.exoplayer2.upstream.DataReader dataReader, int i, boolean z, int i2) throws java.io.IOException {
        return this.sampleDataQueue.sampleData(dataReader, i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleData(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i, int i2) {
        this.sampleDataQueue.sampleData(parsableByteArray, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sampleMetadata(long j, int i, int i2, int i3, com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData) {
        int i4;
        if (this.upstreamFormatAdjustmentRequired) {
            format((com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.unadjustedUpstreamFormat));
        }
        int i5 = i & 1;
        boolean z = i5 != 0;
        if (this.upstreamKeyframeRequired) {
            if (!z) {
                return;
            } else {
                this.upstreamKeyframeRequired = false;
            }
        }
        long j2 = this.sampleOffsetUs + j;
        if (this.upstreamAllSamplesAreSyncSamples) {
            if (j2 < this.startTimeUs) {
                return;
            }
            if (i5 == 0) {
                if (!this.loggedUnexpectedNonSyncSample) {
                    com.google.android.exoplayer2.util.Log.w(TAG, "Overriding unexpected non-sync sample for format: " + this.upstreamFormat);
                    this.loggedUnexpectedNonSyncSample = true;
                }
                i4 = i | 1;
                if (this.pendingSplice) {
                    if (!z || !attemptSplice(j2)) {
                        return;
                    } else {
                        this.pendingSplice = false;
                    }
                }
                commitSample(j2, i4, (this.sampleDataQueue.getTotalBytesWritten() - i2) - i3, i2, cryptoData);
            }
        }
        i4 = i;
        if (this.pendingSplice) {
        }
        commitSample(j2, i4, (this.sampleDataQueue.getTotalBytesWritten() - i2) - i3, i2, cryptoData);
    }

    protected final void invalidateUpstreamFormatAdjustment() {
        this.upstreamFormatAdjustmentRequired = true;
    }

    protected com.google.android.exoplayer2.Format getAdjustedUpstreamFormat(com.google.android.exoplayer2.Format format) {
        return (this.sampleOffsetUs == 0 || format.subsampleOffsetUs == Long.MAX_VALUE) ? format : format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.sampleOffsetUs).build();
    }

    private synchronized void rewind() {
        this.readPosition = 0;
        this.sampleDataQueue.rewind();
    }

    private synchronized int peekSampleMetadata(com.google.android.exoplayer2.FormatHolder formatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        decoderInputBuffer.waitingForKeys = false;
        if (!hasNextSample()) {
            if (!z2 && !this.isLastSampleQueued) {
                com.google.android.exoplayer2.Format format = this.upstreamFormat;
                if (format == null || (!z && format == this.downstreamFormat)) {
                    return -3;
                }
                onFormatResult((com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkNotNull(format), formatHolder);
                return -5;
            }
            decoderInputBuffer.setFlags(4);
            return -4;
        }
        com.google.android.exoplayer2.Format format2 = this.sharedSampleMetadata.get(getReadIndex()).format;
        if (!z && format2 == this.downstreamFormat) {
            int relativeIndex = getRelativeIndex(this.readPosition);
            if (!mayReadSample(relativeIndex)) {
                decoderInputBuffer.waitingForKeys = true;
                return -3;
            }
            decoderInputBuffer.setFlags(this.flags[relativeIndex]);
            decoderInputBuffer.timeUs = this.timesUs[relativeIndex];
            if (decoderInputBuffer.timeUs < this.startTimeUs) {
                decoderInputBuffer.addFlag(Integer.MIN_VALUE);
            }
            sampleExtrasHolder.size = this.sizes[relativeIndex];
            sampleExtrasHolder.offset = this.offsets[relativeIndex];
            sampleExtrasHolder.cryptoData = this.cryptoDatas[relativeIndex];
            return -4;
        }
        onFormatResult(format2, formatHolder);
        return -5;
    }

    private synchronized boolean setUpstreamFormat(com.google.android.exoplayer2.Format format) {
        this.upstreamFormatRequired = false;
        if (com.google.android.exoplayer2.util.Util.areEqual(format, this.upstreamFormat)) {
            return false;
        }
        if (!this.sharedSampleMetadata.isEmpty() && this.sharedSampleMetadata.getEndValue().format.equals(format)) {
            this.upstreamFormat = this.sharedSampleMetadata.getEndValue().format;
        } else {
            this.upstreamFormat = format;
        }
        this.upstreamAllSamplesAreSyncSamples = com.google.android.exoplayer2.util.MimeTypes.allSamplesAreSyncSamples(this.upstreamFormat.sampleMimeType, this.upstreamFormat.codecs);
        this.loggedUnexpectedNonSyncSample = false;
        return true;
    }

    private synchronized long discardSampleMetadataTo(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.length;
        if (i2 != 0) {
            long[] jArr = this.timesUs;
            int i3 = this.relativeFirstIndex;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.readPosition) != i2) {
                    i2 = i + 1;
                }
                int findSampleBefore = findSampleBefore(i3, i2, j, z);
                if (findSampleBefore == -1) {
                    return -1L;
                }
                return discardSamples(findSampleBefore);
            }
        }
        return -1L;
    }

    public synchronized long discardSampleMetadataToRead() {
        int i = this.readPosition;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i = this.length;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    private void releaseDrmSessionReferences() {
        com.google.android.exoplayer2.drm.DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null) {
            drmSession.release(this.drmEventDispatcher);
            this.currentDrmSession = null;
            this.downstreamFormat = null;
        }
    }

    private synchronized void commitSample(long j, int i, long j2, int i2, com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData) {
        com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference drmSessionReference;
        int i3 = this.length;
        if (i3 > 0) {
            int relativeIndex = getRelativeIndex(i3 - 1);
            com.google.android.exoplayer2.util.Assertions.checkArgument(this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]) <= j2);
        }
        this.isLastSampleQueued = (536870912 & i) != 0;
        this.largestQueuedTimestampUs = java.lang.Math.max(this.largestQueuedTimestampUs, j);
        int relativeIndex2 = getRelativeIndex(this.length);
        this.timesUs[relativeIndex2] = j;
        this.offsets[relativeIndex2] = j2;
        this.sizes[relativeIndex2] = i2;
        this.flags[relativeIndex2] = i;
        this.cryptoDatas[relativeIndex2] = cryptoData;
        this.sourceIds[relativeIndex2] = this.upstreamSourceId;
        if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(this.upstreamFormat)) {
            com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager = this.drmSessionManager;
            if (drmSessionManager != null) {
                drmSessionReference = drmSessionManager.preacquireSession(this.drmEventDispatcher, this.upstreamFormat);
            } else {
                drmSessionReference = com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference.EMPTY;
            }
            this.sharedSampleMetadata.appendSpan(getWriteIndex(), new com.google.android.exoplayer2.source.SampleQueue.SharedSampleMetadata((com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.upstreamFormat), drmSessionReference));
        }
        int i4 = this.length + 1;
        this.length = i4;
        int i5 = this.capacity;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            com.google.android.exoplayer2.extractor.TrackOutput.CryptoData[] cryptoDataArr = new com.google.android.exoplayer2.extractor.TrackOutput.CryptoData[i6];
            int i7 = this.relativeFirstIndex;
            int i8 = i5 - i7;
            java.lang.System.arraycopy(this.offsets, i7, jArr, 0, i8);
            java.lang.System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr2, 0, i8);
            java.lang.System.arraycopy(this.flags, this.relativeFirstIndex, iArr2, 0, i8);
            java.lang.System.arraycopy(this.sizes, this.relativeFirstIndex, iArr3, 0, i8);
            java.lang.System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i8);
            java.lang.System.arraycopy(this.sourceIds, this.relativeFirstIndex, iArr, 0, i8);
            int i9 = this.relativeFirstIndex;
            java.lang.System.arraycopy(this.offsets, 0, jArr, i8, i9);
            java.lang.System.arraycopy(this.timesUs, 0, jArr2, i8, i9);
            java.lang.System.arraycopy(this.flags, 0, iArr2, i8, i9);
            java.lang.System.arraycopy(this.sizes, 0, iArr3, i8, i9);
            java.lang.System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i8, i9);
            java.lang.System.arraycopy(this.sourceIds, 0, iArr, i8, i9);
            this.offsets = jArr;
            this.timesUs = jArr2;
            this.flags = iArr2;
            this.sizes = iArr3;
            this.cryptoDatas = cryptoDataArr;
            this.sourceIds = iArr;
            this.relativeFirstIndex = 0;
            this.capacity = i6;
        }
    }

    private synchronized boolean attemptSplice(long j) {
        if (this.length == 0) {
            return j > this.largestDiscardedTimestampUs;
        }
        if (getLargestReadTimestampUs() >= j) {
            return false;
        }
        discardUpstreamSampleMetadata(this.absoluteFirstIndex + countUnreadSamplesBefore(j));
        return true;
    }

    private long discardUpstreamSampleMetadata(int i) {
        int writeIndex = getWriteIndex() - i;
        boolean z = false;
        com.google.android.exoplayer2.util.Assertions.checkArgument(writeIndex >= 0 && writeIndex <= this.length - this.readPosition);
        int i2 = this.length - writeIndex;
        this.length = i2;
        this.largestQueuedTimestampUs = java.lang.Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i2));
        if (writeIndex == 0 && this.isLastSampleQueued) {
            z = true;
        }
        this.isLastSampleQueued = z;
        this.sharedSampleMetadata.discardFrom(i);
        int i3 = this.length;
        if (i3 == 0) {
            return 0L;
        }
        return this.offsets[getRelativeIndex(i3 - 1)] + this.sizes[r9];
    }

    private boolean hasNextSample() {
        return this.readPosition != this.length;
    }

    private void onFormatResult(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.FormatHolder formatHolder) {
        com.google.android.exoplayer2.Format format2 = this.downstreamFormat;
        boolean z = format2 == null;
        com.google.android.exoplayer2.drm.DrmInitData drmInitData = z ? null : format2.drmInitData;
        this.downstreamFormat = format;
        com.google.android.exoplayer2.drm.DrmInitData drmInitData2 = format.drmInitData;
        com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager = this.drmSessionManager;
        formatHolder.format = drmSessionManager != null ? format.copyWithCryptoType(drmSessionManager.getCryptoType(format)) : format;
        formatHolder.drmSession = this.currentDrmSession;
        if (this.drmSessionManager == null) {
            return;
        }
        if (z || !com.google.android.exoplayer2.util.Util.areEqual(drmInitData, drmInitData2)) {
            com.google.android.exoplayer2.drm.DrmSession drmSession = this.currentDrmSession;
            com.google.android.exoplayer2.drm.DrmSession acquireSession = this.drmSessionManager.acquireSession(this.drmEventDispatcher, format);
            this.currentDrmSession = acquireSession;
            formatHolder.drmSession = acquireSession;
            if (drmSession != null) {
                drmSession.release(this.drmEventDispatcher);
            }
        }
    }

    private boolean mayReadSample(int i) {
        com.google.android.exoplayer2.drm.DrmSession drmSession = this.currentDrmSession;
        return drmSession == null || drmSession.getState() == 4 || ((this.flags[i] & 1073741824) == 0 && this.currentDrmSession.playClearSamplesWithoutKeys());
    }

    private int findSampleBefore(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.timesUs[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.flags[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.capacity) {
                i = 0;
            }
        }
        return i3;
    }

    private int countUnreadSamplesBefore(long j) {
        int i = this.length;
        int relativeIndex = getRelativeIndex(i - 1);
        while (i > this.readPosition && this.timesUs[relativeIndex] >= j) {
            i--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return i;
    }

    private long discardSamples(int i) {
        this.largestDiscardedTimestampUs = java.lang.Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i));
        this.length -= i;
        int i2 = this.absoluteFirstIndex + i;
        this.absoluteFirstIndex = i2;
        int i3 = this.relativeFirstIndex + i;
        this.relativeFirstIndex = i3;
        int i4 = this.capacity;
        if (i3 >= i4) {
            this.relativeFirstIndex = i3 - i4;
        }
        int i5 = this.readPosition - i;
        this.readPosition = i5;
        if (i5 < 0) {
            this.readPosition = 0;
        }
        this.sharedSampleMetadata.discardTo(i2);
        if (this.length == 0) {
            int i6 = this.relativeFirstIndex;
            if (i6 == 0) {
                i6 = this.capacity;
            }
            return this.offsets[i6 - 1] + this.sizes[r6];
        }
        return this.offsets[this.relativeFirstIndex];
    }

    private long getLargestTimestamp(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = java.lang.Math.max(j, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                break;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return j;
    }

    private int getRelativeIndex(int i) {
        int i2 = this.relativeFirstIndex + i;
        int i3 = this.capacity;
        return i2 < i3 ? i2 : i2 - i3;
    }

    static final class SampleExtrasHolder {
        public com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;

        SampleExtrasHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class SharedSampleMetadata {
        public final com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference drmSessionReference;
        public final com.google.android.exoplayer2.Format format;

        private SharedSampleMetadata(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.format = format;
            this.drmSessionReference = drmSessionReference;
        }
    }
}
