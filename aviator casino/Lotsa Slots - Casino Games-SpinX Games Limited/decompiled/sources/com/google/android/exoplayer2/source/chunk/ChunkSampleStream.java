package com.google.android.exoplayer2.source.chunk;

/* loaded from: classes3.dex */
public class ChunkSampleStream<T extends com.google.android.exoplayer2.source.chunk.ChunkSource> implements com.google.android.exoplayer2.source.SampleStream, com.google.android.exoplayer2.source.SequenceableLoader, com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.source.chunk.Chunk>, com.google.android.exoplayer2.upstream.Loader.ReleaseCallback {
    private static final java.lang.String TAG = "ChunkSampleStream";
    private final com.google.android.exoplayer2.source.SequenceableLoader.Callback<com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T>> callback;
    private com.google.android.exoplayer2.source.chunk.BaseMediaChunk canceledMediaChunk;
    private final com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput chunkOutput;
    private final T chunkSource;
    private final com.google.android.exoplayer2.source.SampleQueue[] embeddedSampleQueues;
    private final com.google.android.exoplayer2.Format[] embeddedTrackFormats;
    private final int[] embeddedTrackTypes;
    private final boolean[] embeddedTracksSelected;
    private long lastSeekPositionUs;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final com.google.android.exoplayer2.upstream.Loader loader;
    private com.google.android.exoplayer2.source.chunk.Chunk loadingChunk;
    boolean loadingFinished;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> mediaChunks;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final com.google.android.exoplayer2.source.chunk.ChunkHolder nextChunkHolder;
    private int nextNotifyPrimaryFormatMediaChunkIndex;
    private long pendingResetPositionUs;
    private com.google.android.exoplayer2.Format primaryDownstreamTrackFormat;
    private final com.google.android.exoplayer2.source.SampleQueue primarySampleQueue;
    public final int primaryTrackType;
    private final java.util.List<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> readOnlyMediaChunks;
    private com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback<T> releaseCallback;

    public interface ReleaseCallback<T extends com.google.android.exoplayer2.source.chunk.ChunkSource> {
        void onSampleStreamReleased(com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T> chunkSampleStream);
    }

    public ChunkSampleStream(int i, int[] iArr, com.google.android.exoplayer2.Format[] formatArr, T t, com.google.android.exoplayer2.source.SequenceableLoader.Callback<com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T>> callback, com.google.android.exoplayer2.upstream.Allocator allocator, long j, com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher2) {
        this.primaryTrackType = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.embeddedTrackTypes = iArr;
        this.embeddedTrackFormats = formatArr == null ? new com.google.android.exoplayer2.Format[0] : formatArr;
        this.chunkSource = t;
        this.callback = callback;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.loader = new com.google.android.exoplayer2.upstream.Loader(TAG);
        this.nextChunkHolder = new com.google.android.exoplayer2.source.chunk.ChunkHolder();
        java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> arrayList = new java.util.ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = java.util.Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.embeddedSampleQueues = new com.google.android.exoplayer2.source.SampleQueue[length];
        this.embeddedTracksSelected = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr = new com.google.android.exoplayer2.source.SampleQueue[i3];
        com.google.android.exoplayer2.source.SampleQueue createWithDrm = com.google.android.exoplayer2.source.SampleQueue.createWithDrm(allocator, drmSessionManager, eventDispatcher);
        this.primarySampleQueue = createWithDrm;
        iArr2[0] = i;
        sampleQueueArr[0] = createWithDrm;
        while (i2 < length) {
            com.google.android.exoplayer2.source.SampleQueue createWithoutDrm = com.google.android.exoplayer2.source.SampleQueue.createWithoutDrm(allocator);
            this.embeddedSampleQueues[i2] = createWithoutDrm;
            int i4 = i2 + 1;
            sampleQueueArr[i4] = createWithoutDrm;
            iArr2[i4] = this.embeddedTrackTypes[i2];
            i2 = i4;
        }
        this.chunkOutput = new com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput(iArr2, sampleQueueArr);
        this.pendingResetPositionUs = j;
        this.lastSeekPositionUs = j;
    }

    public void discardBuffer(long j, boolean z) {
        if (isPendingReset()) {
            return;
        }
        int firstIndex = this.primarySampleQueue.getFirstIndex();
        this.primarySampleQueue.discardTo(j, z, true);
        int firstIndex2 = this.primarySampleQueue.getFirstIndex();
        if (firstIndex2 > firstIndex) {
            long firstTimestampUs = this.primarySampleQueue.getFirstTimestampUs();
            int i = 0;
            while (true) {
                com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
                if (i >= sampleQueueArr.length) {
                    break;
                }
                sampleQueueArr[i].discardTo(firstTimestampUs, z, this.embeddedTracksSelected[i]);
                i++;
            }
        }
        discardDownstreamMediaChunks(firstIndex2);
    }

    public com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T>.EmbeddedSampleStream selectEmbeddedTrack(long j, int i) {
        for (int i2 = 0; i2 < this.embeddedSampleQueues.length; i2++) {
            if (this.embeddedTrackTypes[i2] == i) {
                com.google.android.exoplayer2.util.Assertions.checkState(!this.embeddedTracksSelected[i2]);
                this.embeddedTracksSelected[i2] = true;
                this.embeddedSampleQueues[i2].seekTo(j, true);
                return new com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream(this, this.embeddedSampleQueues[i2], i2);
            }
        }
        throw new java.lang.IllegalStateException();
    }

    public T getChunkSource() {
        return this.chunkSource;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long j = this.lastSeekPositionUs;
        com.google.android.exoplayer2.source.chunk.BaseMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            if (this.mediaChunks.size() > 1) {
                lastMediaChunk = this.mediaChunks.get(r2.size() - 2);
            } else {
                lastMediaChunk = null;
            }
        }
        if (lastMediaChunk != null) {
            j = java.lang.Math.max(j, lastMediaChunk.endTimeUs);
        }
        return java.lang.Math.max(j, this.primarySampleQueue.getLargestQueuedTimestampUs());
    }

    public long getAdjustedSeekPositionUs(long j, com.google.android.exoplayer2.SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j, seekParameters);
    }

    public void seekToUs(long j) {
        com.google.android.exoplayer2.source.chunk.BaseMediaChunk baseMediaChunk;
        boolean seekTo;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.mediaChunks.size(); i2++) {
            baseMediaChunk = this.mediaChunks.get(i2);
            long j2 = baseMediaChunk.startTimeUs;
            if (j2 == j && baseMediaChunk.clippedStartTimeUs == -9223372036854775807L) {
                break;
            } else {
                if (j2 > j) {
                    break;
                }
            }
        }
        baseMediaChunk = null;
        if (baseMediaChunk != null) {
            seekTo = this.primarySampleQueue.seekTo(baseMediaChunk.getFirstSampleIndex(0));
        } else {
            seekTo = this.primarySampleQueue.seekTo(j, j < getNextLoadPositionUs());
        }
        if (seekTo) {
            this.nextNotifyPrimaryFormatMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), 0);
            com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            int length = sampleQueueArr.length;
            while (i < length) {
                sampleQueueArr[i].seekTo(j, true);
                i++;
            }
            return;
        }
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        this.nextNotifyPrimaryFormatMediaChunkIndex = 0;
        if (this.loader.isLoading()) {
            this.primarySampleQueue.discardToEnd();
            com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr2 = this.embeddedSampleQueues;
            int length2 = sampleQueueArr2.length;
            while (i < length2) {
                sampleQueueArr2[i].discardToEnd();
                i++;
            }
            this.loader.cancelLoading();
            return;
        }
        this.loader.clearFatalError();
        resetSampleQueues();
    }

    public void release() {
        release(null);
    }

    public void release(com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback<T> releaseCallback) {
        this.releaseCallback = releaseCallback;
        this.primarySampleQueue.preRelease();
        for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.preRelease();
        }
        this.loader.release(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        this.primarySampleQueue.release();
        for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.release();
        }
        this.chunkSource.release();
        com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback<T> releaseCallback = this.releaseCallback;
        if (releaseCallback != null) {
            releaseCallback.onSampleStreamReleased(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
        return !isPendingReset() && this.primarySampleQueue.isReady(this.loadingFinished);
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() throws java.io.IOException {
        this.loader.maybeThrowError();
        this.primarySampleQueue.maybeThrowError();
        if (this.loader.isLoading()) {
            return;
        }
        this.chunkSource.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(com.google.android.exoplayer2.FormatHolder formatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
        if (isPendingReset()) {
            return -3;
        }
        com.google.android.exoplayer2.source.chunk.BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null && baseMediaChunk.getFirstSampleIndex(0) <= this.primarySampleQueue.getReadIndex()) {
            return -3;
        }
        maybeNotifyPrimaryTrackFormatChanged();
        return this.primarySampleQueue.read(formatHolder, decoderInputBuffer, i, this.loadingFinished);
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long j) {
        if (isPendingReset()) {
            return 0;
        }
        int skipCount = this.primarySampleQueue.getSkipCount(j, this.loadingFinished);
        com.google.android.exoplayer2.source.chunk.BaseMediaChunk baseMediaChunk = this.canceledMediaChunk;
        if (baseMediaChunk != null) {
            skipCount = java.lang.Math.min(skipCount, baseMediaChunk.getFirstSampleIndex(0) - this.primarySampleQueue.getReadIndex());
        }
        this.primarySampleQueue.skip(skipCount);
        maybeNotifyPrimaryTrackFormatChanged();
        return skipCount;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCompleted(com.google.android.exoplayer2.source.chunk.Chunk chunk, long j, long j2) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo = new com.google.android.exoplayer2.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j2, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCanceled(com.google.android.exoplayer2.source.chunk.Chunk chunk, long j, long j2, boolean z) {
        this.loadingChunk = null;
        this.canceledMediaChunk = null;
        com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo = new com.google.android.exoplayer2.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j2, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z) {
            return;
        }
        if (isPendingReset()) {
            resetSampleQueues();
        } else if (isMediaChunk(chunk)) {
            discardUpstreamMediaChunksFromIndex(this.mediaChunks.size() - 1);
            if (this.mediaChunks.isEmpty()) {
                this.pendingResetPositionUs = this.lastSeekPositionUs;
            }
        }
        this.callback.onContinueLoadingRequested(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.source.chunk.Chunk chunk, long j, long j2, java.io.IOException iOException, int i) {
        com.google.android.exoplayer2.upstream.Loader.LoadErrorAction loadErrorAction;
        boolean z;
        long bytesLoaded = chunk.bytesLoaded();
        boolean isMediaChunk = isMediaChunk(chunk);
        int size = this.mediaChunks.size() - 1;
        boolean z2 = (bytesLoaded != 0 && isMediaChunk && haveReadFromMediaChunk(size)) ? false : true;
        com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo = new com.google.android.exoplayer2.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j2, bytesLoaded);
        com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new com.google.android.exoplayer2.source.MediaLoadData(chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, com.google.android.exoplayer2.util.Util.usToMs(chunk.startTimeUs), com.google.android.exoplayer2.util.Util.usToMs(chunk.endTimeUs)), iOException, i);
        if (this.chunkSource.onChunkLoadError(chunk, z2, loadErrorInfo, this.loadErrorHandlingPolicy)) {
            if (z2) {
                loadErrorAction = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY;
                if (isMediaChunk) {
                    com.google.android.exoplayer2.util.Assertions.checkState(discardUpstreamMediaChunksFromIndex(size) == chunk);
                    if (this.mediaChunks.isEmpty()) {
                        this.pendingResetPositionUs = this.lastSeekPositionUs;
                    }
                }
                if (loadErrorAction == null) {
                    long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
                    if (retryDelayMsFor != -9223372036854775807L) {
                        loadErrorAction = com.google.android.exoplayer2.upstream.Loader.createRetryAction(false, retryDelayMsFor);
                    } else {
                        loadErrorAction = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY_FATAL;
                    }
                }
                z = !loadErrorAction.isRetry();
                this.mediaSourceEventDispatcher.loadError(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, z);
                if (z) {
                    this.loadingChunk = null;
                    this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
                    this.callback.onContinueLoadingRequested(this);
                }
                return loadErrorAction;
            }
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring attempt to cancel non-cancelable load.");
        }
        loadErrorAction = null;
        if (loadErrorAction == null) {
        }
        z = !loadErrorAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, z);
        if (z) {
        }
        return loadErrorAction;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j) {
        java.util.List<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> list;
        long j2;
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        boolean isPendingReset = isPendingReset();
        if (isPendingReset) {
            list = java.util.Collections.emptyList();
            j2 = this.pendingResetPositionUs;
        } else {
            list = this.readOnlyMediaChunks;
            j2 = getLastMediaChunk().endTimeUs;
        }
        this.chunkSource.getNextChunk(j, j2, list, this.nextChunkHolder);
        boolean z = this.nextChunkHolder.endOfStream;
        com.google.android.exoplayer2.source.chunk.Chunk chunk = this.nextChunkHolder.chunk;
        this.nextChunkHolder.clear();
        if (z) {
            this.pendingResetPositionUs = -9223372036854775807L;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            return false;
        }
        this.loadingChunk = chunk;
        if (isMediaChunk(chunk)) {
            com.google.android.exoplayer2.source.chunk.BaseMediaChunk baseMediaChunk = (com.google.android.exoplayer2.source.chunk.BaseMediaChunk) chunk;
            if (isPendingReset) {
                long j3 = baseMediaChunk.startTimeUs;
                long j4 = this.pendingResetPositionUs;
                if (j3 != j4) {
                    this.primarySampleQueue.setStartTimeUs(j4);
                    for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
                        sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
                    }
                }
                this.pendingResetPositionUs = -9223372036854775807L;
            }
            baseMediaChunk.init(this.chunkOutput);
            this.mediaChunks.add(baseMediaChunk);
        } else if (chunk instanceof com.google.android.exoplayer2.source.chunk.InitializationChunk) {
            ((com.google.android.exoplayer2.source.chunk.InitializationChunk) chunk).init(this.chunkOutput);
        }
        this.mediaSourceEventDispatcher.loadStarted(new com.google.android.exoplayer2.source.LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, this.loader.startLoading(chunk, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(chunk.type))), chunk.type, this.primaryTrackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (this.loader.isLoading()) {
            com.google.android.exoplayer2.source.chunk.Chunk chunk = (com.google.android.exoplayer2.source.chunk.Chunk) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.loadingChunk);
            if (!(isMediaChunk(chunk) && haveReadFromMediaChunk(this.mediaChunks.size() - 1)) && this.chunkSource.shouldCancelLoad(j, chunk, this.readOnlyMediaChunks)) {
                this.loader.cancelLoading();
                if (isMediaChunk(chunk)) {
                    this.canceledMediaChunk = (com.google.android.exoplayer2.source.chunk.BaseMediaChunk) chunk;
                    return;
                }
                return;
            }
            return;
        }
        int preferredQueueSize = this.chunkSource.getPreferredQueueSize(j, this.readOnlyMediaChunks);
        if (preferredQueueSize < this.mediaChunks.size()) {
            discardUpstream(preferredQueueSize);
        }
    }

    private void discardUpstream(int i) {
        com.google.android.exoplayer2.util.Assertions.checkState(!this.loader.isLoading());
        int size = this.mediaChunks.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!haveReadFromMediaChunk(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = getLastMediaChunk().endTimeUs;
        com.google.android.exoplayer2.source.chunk.BaseMediaChunk discardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primaryTrackType, discardUpstreamMediaChunksFromIndex.startTimeUs, j);
    }

    private boolean isMediaChunk(com.google.android.exoplayer2.source.chunk.Chunk chunk) {
        return chunk instanceof com.google.android.exoplayer2.source.chunk.BaseMediaChunk;
    }

    private void resetSampleQueues() {
        this.primarySampleQueue.reset();
        for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.embeddedSampleQueues) {
            sampleQueue.reset();
        }
    }

    private boolean haveReadFromMediaChunk(int i) {
        int readIndex;
        com.google.android.exoplayer2.source.chunk.BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i);
        if (this.primarySampleQueue.getReadIndex() > baseMediaChunk.getFirstSampleIndex(0)) {
            return true;
        }
        int i2 = 0;
        do {
            com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i2 >= sampleQueueArr.length) {
                return false;
            }
            readIndex = sampleQueueArr[i2].getReadIndex();
            i2++;
        } while (readIndex <= baseMediaChunk.getFirstSampleIndex(i2));
        return true;
    }

    boolean isPendingReset() {
        return this.pendingResetPositionUs != -9223372036854775807L;
    }

    private void discardDownstreamMediaChunks(int i) {
        int min = java.lang.Math.min(primarySampleIndexToMediaChunkIndex(i, 0), this.nextNotifyPrimaryFormatMediaChunkIndex);
        if (min > 0) {
            com.google.android.exoplayer2.util.Util.removeRange(this.mediaChunks, 0, min);
            this.nextNotifyPrimaryFormatMediaChunkIndex -= min;
        }
    }

    private void maybeNotifyPrimaryTrackFormatChanged() {
        int primarySampleIndexToMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.primarySampleQueue.getReadIndex(), this.nextNotifyPrimaryFormatMediaChunkIndex - 1);
        while (true) {
            int i = this.nextNotifyPrimaryFormatMediaChunkIndex;
            if (i > primarySampleIndexToMediaChunkIndex) {
                return;
            }
            this.nextNotifyPrimaryFormatMediaChunkIndex = i + 1;
            maybeNotifyPrimaryTrackFormatChanged(i);
        }
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i) {
        com.google.android.exoplayer2.source.chunk.BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i);
        com.google.android.exoplayer2.Format format = baseMediaChunk.trackFormat;
        if (!format.equals(this.primaryDownstreamTrackFormat)) {
            this.mediaSourceEventDispatcher.downstreamFormatChanged(this.primaryTrackType, format, baseMediaChunk.trackSelectionReason, baseMediaChunk.trackSelectionData, baseMediaChunk.startTimeUs);
        }
        this.primaryDownstreamTrackFormat = format;
    }

    private int primarySampleIndexToMediaChunkIndex(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.mediaChunks.size()) {
                return this.mediaChunks.size() - 1;
            }
        } while (this.mediaChunks.get(i2).getFirstSampleIndex(0) <= i);
        return i2 - 1;
    }

    private com.google.android.exoplayer2.source.chunk.BaseMediaChunk getLastMediaChunk() {
        return this.mediaChunks.get(r0.size() - 1);
    }

    private com.google.android.exoplayer2.source.chunk.BaseMediaChunk discardUpstreamMediaChunksFromIndex(int i) {
        com.google.android.exoplayer2.source.chunk.BaseMediaChunk baseMediaChunk = this.mediaChunks.get(i);
        java.util.ArrayList<com.google.android.exoplayer2.source.chunk.BaseMediaChunk> arrayList = this.mediaChunks;
        com.google.android.exoplayer2.util.Util.removeRange(arrayList, i, arrayList.size());
        this.nextNotifyPrimaryFormatMediaChunkIndex = java.lang.Math.max(this.nextNotifyPrimaryFormatMediaChunkIndex, this.mediaChunks.size());
        int i2 = 0;
        this.primarySampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(0));
        while (true) {
            com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr = this.embeddedSampleQueues;
            if (i2 >= sampleQueueArr.length) {
                return baseMediaChunk;
            }
            com.google.android.exoplayer2.source.SampleQueue sampleQueue = sampleQueueArr[i2];
            i2++;
            sampleQueue.discardUpstreamSamples(baseMediaChunk.getFirstSampleIndex(i2));
        }
    }

    public final class EmbeddedSampleStream implements com.google.android.exoplayer2.source.SampleStream {
        private final int index;
        private boolean notifiedDownstreamFormat;
        public final com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T> parent;
        private final com.google.android.exoplayer2.source.SampleQueue sampleQueue;

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() {
        }

        public EmbeddedSampleStream(com.google.android.exoplayer2.source.chunk.ChunkSampleStream<T> chunkSampleStream, com.google.android.exoplayer2.source.SampleQueue sampleQueue, int i) {
            this.parent = chunkSampleStream;
            this.sampleQueue = sampleQueue;
            this.index = i;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return !com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.isPendingReset() && this.sampleQueue.isReady(com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.loadingFinished);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j) {
            if (com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.isPendingReset()) {
                return 0;
            }
            int skipCount = this.sampleQueue.getSkipCount(j, com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.loadingFinished);
            if (com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.canceledMediaChunk != null) {
                skipCount = java.lang.Math.min(skipCount, com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.canceledMediaChunk.getFirstSampleIndex(this.index + 1) - this.sampleQueue.getReadIndex());
            }
            this.sampleQueue.skip(skipCount);
            if (skipCount > 0) {
                maybeNotifyDownstreamFormat();
            }
            return skipCount;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder formatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            if (com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.isPendingReset()) {
                return -3;
            }
            if (com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.canceledMediaChunk != null && com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.canceledMediaChunk.getFirstSampleIndex(this.index + 1) <= this.sampleQueue.getReadIndex()) {
                return -3;
            }
            maybeNotifyDownstreamFormat();
            return this.sampleQueue.read(formatHolder, decoderInputBuffer, i, com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.loadingFinished);
        }

        public void release() {
            com.google.android.exoplayer2.util.Assertions.checkState(com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.embeddedTracksSelected[this.index]);
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.embeddedTracksSelected[this.index] = false;
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.notifiedDownstreamFormat) {
                return;
            }
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.mediaSourceEventDispatcher.downstreamFormatChanged(com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.embeddedTrackTypes[this.index], com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.embeddedTrackFormats[this.index], 0, null, com.google.android.exoplayer2.source.chunk.ChunkSampleStream.this.lastSeekPositionUs);
            this.notifiedDownstreamFormat = true;
        }
    }
}
