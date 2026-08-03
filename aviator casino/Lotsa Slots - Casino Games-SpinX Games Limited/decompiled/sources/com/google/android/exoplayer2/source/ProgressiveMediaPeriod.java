package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
final class ProgressiveMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.extractor.ExtractorOutput, com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable>, com.google.android.exoplayer2.upstream.Loader.ReleaseCallback, com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private final com.google.android.exoplayer2.upstream.Allocator allocator;
    private com.google.android.exoplayer2.source.MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;
    private final java.lang.String customCacheKey;
    private final com.google.android.exoplayer2.upstream.DataSource dataSource;
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
    private int enabledTrackCount;
    private int extractedSamplesCountAtStartOfLoad;
    private boolean haveAudioVideoTracks;
    private com.google.android.exoplayer2.metadata.icy.IcyHeaders icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private long lastSeekPositionUs;
    private final com.google.android.exoplayer2.source.ProgressiveMediaPeriod.Listener listener;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean loadingFinished;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean notifyDiscontinuity;
    private boolean pendingDeferredRetry;
    private boolean prepared;
    private final com.google.android.exoplayer2.source.ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private boolean sampleQueuesBuilt;
    private com.google.android.exoplayer2.extractor.SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackState trackState;
    private final android.net.Uri uri;
    private static final java.util.Map<java.lang.String, java.lang.String> ICY_METADATA_HEADERS = createIcyMetadataHeaders();
    private static final com.google.android.exoplayer2.Format ICY_FORMAT = new com.google.android.exoplayer2.Format.Builder().setId("icy").setSampleMimeType("application/x-icy").build();
    private final com.google.android.exoplayer2.upstream.Loader loader = new com.google.android.exoplayer2.upstream.Loader("ProgressiveMediaPeriod");
    private final com.google.android.exoplayer2.util.ConditionVariable loadCondition = new com.google.android.exoplayer2.util.ConditionVariable();
    private final java.lang.Runnable maybeFinishPrepareRunnable = new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.maybeFinishPrepare();
        }
    };
    private final java.lang.Runnable onContinueLoadingRequestedRunnable = new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.m5427x3e939aa5();
        }
    };
    private final android.os.Handler handler = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper();
    private com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId[] sampleQueueTrackIds = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId[0];
    private com.google.android.exoplayer2.source.SampleQueue[] sampleQueues = new com.google.android.exoplayer2.source.SampleQueue[0];
    private long pendingResetPositionUs = -9223372036854775807L;
    private long durationUs = -9223372036854775807L;
    private int dataType = 1;

    interface Listener {
        void onSourceInfoRefreshed(long j, boolean z, boolean z2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ java.util.List getStreamKeys(java.util.List list) {
        java.util.List emptyList;
        emptyList = java.util.Collections.emptyList();
        return emptyList;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
    }

    public ProgressiveMediaPeriod(android.net.Uri uri, com.google.android.exoplayer2.upstream.DataSource dataSource, com.google.android.exoplayer2.source.ProgressiveMediaExtractor progressiveMediaExtractor, com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher2, com.google.android.exoplayer2.source.ProgressiveMediaPeriod.Listener listener, com.google.android.exoplayer2.upstream.Allocator allocator, java.lang.String str, int i) {
        this.uri = uri;
        this.dataSource = dataSource;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.listener = listener;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i;
        this.progressiveMediaExtractor = progressiveMediaExtractor;
    }

    /* renamed from: lambda$new$0$com-google-android-exoplayer2-source-ProgressiveMediaPeriod, reason: not valid java name */
    /* synthetic */ void m5427x3e939aa5() {
        if (this.released) {
            return;
        }
        ((com.google.android.exoplayer2.source.MediaPeriod.Callback) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    public void release() {
        if (this.prepared) {
            for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.preRelease();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.release();
        }
        this.progressiveMediaExtractor.release();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.loadCondition.open();
        startLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
        assertPrepared();
        return this.trackState.tracks;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, com.google.android.exoplayer2.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection;
        assertPrepared();
        com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray = this.trackState.tracks;
        boolean[] zArr3 = this.trackState.trackEnabledStates;
        int i = this.enabledTrackCount;
        int i2 = 0;
        for (int i3 = 0; i3 < exoTrackSelectionArr.length; i3++) {
            com.google.android.exoplayer2.source.SampleStream sampleStream = sampleStreamArr[i3];
            if (sampleStream != null && (exoTrackSelectionArr[i3] == null || !zArr[i3])) {
                int i4 = ((com.google.android.exoplayer2.source.ProgressiveMediaPeriod.SampleStreamImpl) sampleStream).track;
                com.google.android.exoplayer2.util.Assertions.checkState(zArr3[i4]);
                this.enabledTrackCount--;
                zArr3[i4] = false;
                sampleStreamArr[i3] = null;
            }
        }
        boolean z = !this.seenFirstTrackSelection ? j == 0 : i != 0;
        for (int i5 = 0; i5 < exoTrackSelectionArr.length; i5++) {
            if (sampleStreamArr[i5] == null && (exoTrackSelection = exoTrackSelectionArr[i5]) != null) {
                com.google.android.exoplayer2.util.Assertions.checkState(exoTrackSelection.length() == 1);
                com.google.android.exoplayer2.util.Assertions.checkState(exoTrackSelection.getIndexInTrackGroup(0) == 0);
                int indexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
                com.google.android.exoplayer2.util.Assertions.checkState(!zArr3[indexOf]);
                this.enabledTrackCount++;
                zArr3[indexOf] = true;
                sampleStreamArr[i5] = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod.SampleStreamImpl(indexOf);
                zArr2[i5] = true;
                if (!z) {
                    com.google.android.exoplayer2.source.SampleQueue sampleQueue = this.sampleQueues[indexOf];
                    z = (sampleQueue.seekTo(j, true) || sampleQueue.getReadIndex() == 0) ? false : true;
                }
            }
        }
        if (this.enabledTrackCount == 0) {
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = false;
            if (this.loader.isLoading()) {
                com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i2 < length) {
                    sampleQueueArr[i2].discardToEnd();
                    i2++;
                }
                this.loader.cancelLoading();
            } else {
                com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr2 = this.sampleQueues;
                int length2 = sampleQueueArr2.length;
                while (i2 < length2) {
                    sampleQueueArr2[i2].reset();
                    i2++;
                }
            }
        } else if (z) {
            j = seekToUs(j);
            while (i2 < sampleStreamArr.length) {
                if (sampleStreamArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.seenFirstTrackSelection = true;
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = this.trackState.trackEnabledStates;
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            this.sampleQueues[i].discardTo(j, z, zArr[i]);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j) {
        if (this.loadingFinished || this.loader.hasFatalError() || this.pendingDeferredRetry) {
            return false;
        }
        if (this.prepared && this.enabledTrackCount == 0) {
            return false;
        }
        boolean open = this.loadCondition.open();
        if (this.loader.isLoading()) {
            return open;
        }
        startLoading();
        return true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading() && this.loadCondition.isOpen();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.notifyDiscontinuity) {
            return -9223372036854775807L;
        }
        if (!this.loadingFinished && getExtractedSamplesCount() <= this.extractedSamplesCountAtStartOfLoad) {
            return -9223372036854775807L;
        }
        this.notifyDiscontinuity = false;
        return this.lastSeekPositionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long j;
        assertPrepared();
        if (this.loadingFinished || this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (this.trackState.trackIsAudioVideoFlags[i] && this.trackState.trackEnabledStates[i] && !this.sampleQueues[i].isLastSampleQueued()) {
                    j = java.lang.Math.min(j, this.sampleQueues[i].getLargestQueuedTimestampUs());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = getLargestQueuedTimestampUs(false);
        }
        return j == Long.MIN_VALUE ? this.lastSeekPositionUs : j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (!this.seekMap.isSeekable()) {
            j = 0;
        }
        int i = 0;
        this.notifyDiscontinuity = false;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return j;
        }
        if (this.dataType != 7 && seekInsideBufferUs(zArr, j)) {
            return j;
        }
        this.pendingDeferredRetry = false;
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        if (this.loader.isLoading()) {
            com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr = this.sampleQueues;
            int length = sampleQueueArr.length;
            while (i < length) {
                sampleQueueArr[i].discardToEnd();
                i++;
            }
            this.loader.cancelLoading();
        } else {
            this.loader.clearFatalError();
            com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr2 = this.sampleQueues;
            int length2 = sampleQueueArr2.length;
            while (i < length2) {
                sampleQueueArr2[i].reset();
                i++;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, com.google.android.exoplayer2.SeekParameters seekParameters) {
        assertPrepared();
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        com.google.android.exoplayer2.extractor.SeekMap.SeekPoints seekPoints = this.seekMap.getSeekPoints(j);
        return seekParameters.resolveSeekPositionUs(j, seekPoints.first.timeUs, seekPoints.second.timeUs);
    }

    boolean isReady(int i) {
        return !suppressRead() && this.sampleQueues[i].isReady(this.loadingFinished);
    }

    void maybeThrowError(int i) throws java.io.IOException {
        this.sampleQueues[i].maybeThrowError();
        maybeThrowError();
    }

    void maybeThrowError() throws java.io.IOException {
        this.loader.maybeThrowError(this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }

    int readData(int i, com.google.android.exoplayer2.FormatHolder formatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, int i2) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i);
        int read = this.sampleQueues[i].read(formatHolder, decoderInputBuffer, i2, this.loadingFinished);
        if (read == -3) {
            maybeStartDeferredRetry(i);
        }
        return read;
    }

    int skipData(int i, long j) {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i);
        com.google.android.exoplayer2.source.SampleQueue sampleQueue = this.sampleQueues[i];
        int skipCount = sampleQueue.getSkipCount(j, this.loadingFinished);
        sampleQueue.skip(skipCount);
        if (skipCount == 0) {
            maybeStartDeferredRetry(i);
        }
        return skipCount;
    }

    private void maybeNotifyDownstreamFormat(int i) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackNotifiedDownstreamFormats;
        if (zArr[i]) {
            return;
        }
        com.google.android.exoplayer2.Format format = this.trackState.tracks.get(i).getFormat(0);
        this.mediaSourceEventDispatcher.downstreamFormatChanged(com.google.android.exoplayer2.util.MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.lastSeekPositionUs);
        zArr[i] = true;
    }

    private void maybeStartDeferredRetry(int i) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (this.pendingDeferredRetry && zArr[i]) {
            if (this.sampleQueues[i].isReady(false)) {
                return;
            }
            this.pendingResetPositionUs = 0L;
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = true;
            this.lastSeekPositionUs = 0L;
            this.extractedSamplesCountAtStartOfLoad = 0;
            for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.reset();
            }
            ((com.google.android.exoplayer2.source.MediaPeriod.Callback) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCompleted(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable, long j, long j2) {
        com.google.android.exoplayer2.extractor.SeekMap seekMap;
        if (this.durationUs == -9223372036854775807L && (seekMap = this.seekMap) != null) {
            boolean isSeekable = seekMap.isSeekable();
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j3 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.durationUs = j3;
            this.listener.onSourceInfoRefreshed(j3, isSeekable, this.isLive);
        }
        com.google.android.exoplayer2.upstream.StatsDataSource statsDataSource = extractingLoadable.dataSource;
        com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo = new com.google.android.exoplayer2.source.LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        this.loadingFinished = true;
        ((com.google.android.exoplayer2.source.MediaPeriod.Callback) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCanceled(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable, long j, long j2, boolean z) {
        com.google.android.exoplayer2.upstream.StatsDataSource statsDataSource = extractingLoadable.dataSource;
        com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo = new com.google.android.exoplayer2.source.LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        if (z) {
            return;
        }
        for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        if (this.enabledTrackCount > 0) {
            ((com.google.android.exoplayer2.source.MediaPeriod.Callback) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable, long j, long j2, java.io.IOException iOException, int i) {
        boolean z;
        com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable2;
        com.google.android.exoplayer2.upstream.Loader.LoadErrorAction loadErrorAction;
        com.google.android.exoplayer2.upstream.StatsDataSource statsDataSource = extractingLoadable.dataSource;
        com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo = new com.google.android.exoplayer2.source.LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new com.google.android.exoplayer2.source.MediaLoadData(1, -1, null, 0, null, com.google.android.exoplayer2.util.Util.usToMs(extractingLoadable.seekTimeUs), com.google.android.exoplayer2.util.Util.usToMs(this.durationUs)), iOException, i));
        if (retryDelayMsFor == -9223372036854775807L) {
            loadErrorAction = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY_FATAL;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            if (extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad) {
                extractingLoadable2 = extractingLoadable;
                z = true;
            } else {
                z = false;
                extractingLoadable2 = extractingLoadable;
            }
            if (configureRetry(extractingLoadable2, extractedSamplesCount)) {
                loadErrorAction = com.google.android.exoplayer2.upstream.Loader.createRetryAction(z, retryDelayMsFor);
            } else {
                loadErrorAction = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY;
            }
        }
        boolean z2 = !loadErrorAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, iOException, z2);
        if (z2) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        }
        return loadErrorAction;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public com.google.android.exoplayer2.extractor.TrackOutput track(int i, int i2) {
        return prepareTrackOutput(new com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId(i, false));
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(final com.google.android.exoplayer2.extractor.SeekMap seekMap) {
        this.handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.m5429x7713ecca(seekMap);
            }
        });
    }

    com.google.android.exoplayer2.extractor.TrackOutput icyTrack() {
        return prepareTrackOutput(new com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId(0, true));
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(com.google.android.exoplayer2.Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLengthKnown() {
        this.handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.ProgressiveMediaPeriod$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.m5428x6a384a65();
            }
        });
    }

    /* renamed from: lambda$onLengthKnown$2$com-google-android-exoplayer2-source-ProgressiveMediaPeriod, reason: not valid java name */
    /* synthetic */ void m5428x6a384a65() {
        this.isLengthKnown = true;
    }

    private com.google.android.exoplayer2.extractor.TrackOutput prepareTrackOutput(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId trackId) {
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            if (trackId.equals(this.sampleQueueTrackIds[i])) {
                return this.sampleQueues[i];
            }
        }
        com.google.android.exoplayer2.source.SampleQueue createWithDrm = com.google.android.exoplayer2.source.SampleQueue.createWithDrm(this.allocator, this.drmSessionManager, this.drmEventDispatcher);
        createWithDrm.setUpstreamFormatChangeListener(this);
        int i2 = length + 1;
        com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId[] trackIdArr = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId[]) java.util.Arrays.copyOf(this.sampleQueueTrackIds, i2);
        trackIdArr[length] = trackId;
        this.sampleQueueTrackIds = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId[]) com.google.android.exoplayer2.util.Util.castNonNullTypeArray(trackIdArr);
        com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr = (com.google.android.exoplayer2.source.SampleQueue[]) java.util.Arrays.copyOf(this.sampleQueues, i2);
        sampleQueueArr[length] = createWithDrm;
        this.sampleQueues = (com.google.android.exoplayer2.source.SampleQueue[]) com.google.android.exoplayer2.util.Util.castNonNullTypeArray(sampleQueueArr);
        return createWithDrm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSeekMap, reason: merged with bridge method [inline-methods] */
    public void m5429x7713ecca(com.google.android.exoplayer2.extractor.SeekMap seekMap) {
        this.seekMap = this.icyHeaders == null ? seekMap : new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(-9223372036854775807L);
        this.durationUs = seekMap.getDurationUs();
        boolean z = !this.isLengthKnown && seekMap.getDurationUs() == -9223372036854775807L;
        this.isLive = z;
        this.dataType = z ? 7 : 1;
        this.listener.onSourceInfoRefreshed(this.durationUs, seekMap.isSeekable(), this.isLive);
        if (this.prepared) {
            return;
        }
        maybeFinishPrepare();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        com.google.android.exoplayer2.metadata.Metadata copyWithAppendedEntries;
        if (this.released || this.prepared || !this.sampleQueuesBuilt || this.seekMap == null) {
            return;
        }
        for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.loadCondition.close();
        int length = this.sampleQueues.length;
        com.google.android.exoplayer2.source.TrackGroup[] trackGroupArr = new com.google.android.exoplayer2.source.TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            com.google.android.exoplayer2.Format format = (com.google.android.exoplayer2.Format) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.sampleQueues[i].getUpstreamFormat());
            java.lang.String str = format.sampleMimeType;
            boolean isAudio = com.google.android.exoplayer2.util.MimeTypes.isAudio(str);
            boolean z = isAudio || com.google.android.exoplayer2.util.MimeTypes.isVideo(str);
            zArr[i] = z;
            this.haveAudioVideoTracks = z | this.haveAudioVideoTracks;
            com.google.android.exoplayer2.metadata.icy.IcyHeaders icyHeaders = this.icyHeaders;
            if (icyHeaders != null) {
                if (isAudio || this.sampleQueueTrackIds[i].isIcyTrack) {
                    com.google.android.exoplayer2.metadata.Metadata metadata = format.metadata;
                    if (metadata == null) {
                        copyWithAppendedEntries = new com.google.android.exoplayer2.metadata.Metadata(icyHeaders);
                    } else {
                        copyWithAppendedEntries = metadata.copyWithAppendedEntries(icyHeaders);
                    }
                    format = format.buildUpon().setMetadata(copyWithAppendedEntries).build();
                }
                if (isAudio && format.averageBitrate == -1 && format.peakBitrate == -1 && icyHeaders.bitrate != -1) {
                    format = format.buildUpon().setAverageBitrate(icyHeaders.bitrate).build();
                }
            }
            trackGroupArr[i] = new com.google.android.exoplayer2.source.TrackGroup(java.lang.Integer.toString(i), format.copyWithCryptoType(this.drmSessionManager.getCryptoType(format)));
        }
        this.trackState = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackState(new com.google.android.exoplayer2.source.TrackGroupArray(trackGroupArr), zArr);
        this.prepared = true;
        ((com.google.android.exoplayer2.source.MediaPeriod.Callback) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    private void startLoading() {
        com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable = new com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable(this.uri, this.dataSource, this.progressiveMediaExtractor, this, this.loadCondition);
        if (this.prepared) {
            com.google.android.exoplayer2.util.Assertions.checkState(isPendingReset());
            long j = this.durationUs;
            if (j != -9223372036854775807L && this.pendingResetPositionUs > j) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = -9223372036854775807L;
                return;
            }
            extractingLoadable.setLoadPosition(((com.google.android.exoplayer2.extractor.SeekMap) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.seekMap)).getSeekPoints(this.pendingResetPositionUs).first.position, this.pendingResetPositionUs);
            for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
            this.pendingResetPositionUs = -9223372036854775807L;
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        this.mediaSourceEventDispatcher.loadStarted(new com.google.android.exoplayer2.source.LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, this.loader.startLoading(extractingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType))), 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
    }

    private boolean configureRetry(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ExtractingLoadable extractingLoadable, int i) {
        com.google.android.exoplayer2.extractor.SeekMap seekMap;
        if (this.isLengthKnown || ((seekMap = this.seekMap) != null && seekMap.getDurationUs() != -9223372036854775807L)) {
            this.extractedSamplesCountAtStartOfLoad = i;
            return true;
        }
        if (this.prepared && !suppressRead()) {
            this.pendingDeferredRetry = true;
            return false;
        }
        this.notifyDiscontinuity = this.prepared;
        this.lastSeekPositionUs = 0L;
        this.extractedSamplesCountAtStartOfLoad = 0;
        for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        extractingLoadable.setLoadPosition(0L, 0L);
        return true;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j) {
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            if (!this.sampleQueues[i].seekTo(j, false) && (zArr[i] || !this.haveAudioVideoTracks)) {
                return false;
            }
        }
        return true;
    }

    private int getExtractedSamplesCount() {
        int i = 0;
        for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.sampleQueues) {
            i += sampleQueue.getWriteIndex();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLargestQueuedTimestampUs(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.sampleQueues.length; i++) {
            if (z || ((com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.trackState)).trackEnabledStates[i]) {
                j = java.lang.Math.max(j, this.sampleQueues[i].getLargestQueuedTimestampUs());
            }
        }
        return j;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != -9223372036854775807L;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"trackState", "seekMap"})
    private void assertPrepared() {
        com.google.android.exoplayer2.util.Assertions.checkState(this.prepared);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.trackState);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.seekMap);
    }

    private final class SampleStreamImpl implements com.google.android.exoplayer2.source.SampleStream {
        private final int track;

        public SampleStreamImpl(int i) {
            this.track = i;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.isReady(this.track);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.maybeThrowError(this.track);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder formatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            return com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, i);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j) {
            return com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.skipData(this.track, j);
        }
    }

    final class ExtractingLoadable implements com.google.android.exoplayer2.upstream.Loader.Loadable, com.google.android.exoplayer2.source.IcyDataSource.Listener {
        private final com.google.android.exoplayer2.upstream.StatsDataSource dataSource;
        private final com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput;
        private com.google.android.exoplayer2.extractor.TrackOutput icyTrackOutput;
        private volatile boolean loadCanceled;
        private final com.google.android.exoplayer2.util.ConditionVariable loadCondition;
        private final com.google.android.exoplayer2.source.ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        private final android.net.Uri uri;
        private final com.google.android.exoplayer2.extractor.PositionHolder positionHolder = new com.google.android.exoplayer2.extractor.PositionHolder();
        private boolean pendingExtractorSeek = true;
        private final long loadTaskId = com.google.android.exoplayer2.source.LoadEventInfo.getNewId();
        private com.google.android.exoplayer2.upstream.DataSpec dataSpec = buildDataSpec(0);

        public ExtractingLoadable(android.net.Uri uri, com.google.android.exoplayer2.upstream.DataSource dataSource, com.google.android.exoplayer2.source.ProgressiveMediaExtractor progressiveMediaExtractor, com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput, com.google.android.exoplayer2.util.ConditionVariable conditionVariable) {
            this.uri = uri;
            this.dataSource = new com.google.android.exoplayer2.upstream.StatsDataSource(dataSource);
            this.progressiveMediaExtractor = progressiveMediaExtractor;
            this.extractorOutput = extractorOutput;
            this.loadCondition = conditionVariable;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws java.io.IOException {
            int i = 0;
            while (i == 0 && !this.loadCanceled) {
                try {
                    long j = this.positionHolder.position;
                    com.google.android.exoplayer2.upstream.DataSpec buildDataSpec = buildDataSpec(j);
                    this.dataSpec = buildDataSpec;
                    long open = this.dataSource.open(buildDataSpec);
                    if (open != -1) {
                        open += j;
                        com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.onLengthKnown();
                    }
                    long j2 = open;
                    com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.icyHeaders = com.google.android.exoplayer2.metadata.icy.IcyHeaders.parse(this.dataSource.getResponseHeaders());
                    com.google.android.exoplayer2.upstream.DataReader dataReader = this.dataSource;
                    if (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.icyHeaders != null && com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.icyHeaders.metadataInterval != -1) {
                        dataReader = new com.google.android.exoplayer2.source.IcyDataSource(this.dataSource, com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.icyHeaders.metadataInterval, this);
                        com.google.android.exoplayer2.extractor.TrackOutput icyTrack = com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.icyTrack();
                        this.icyTrackOutput = icyTrack;
                        icyTrack.format(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ICY_FORMAT);
                    }
                    long j3 = j;
                    this.progressiveMediaExtractor.init(dataReader, this.uri, this.dataSource.getResponseHeaders(), j, j2, this.extractorOutput);
                    if (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.icyHeaders != null) {
                        this.progressiveMediaExtractor.disableSeekingOnMp3Streams();
                    }
                    if (this.pendingExtractorSeek) {
                        this.progressiveMediaExtractor.seek(j3, this.seekTimeUs);
                        this.pendingExtractorSeek = false;
                    }
                    while (true) {
                        long j4 = j3;
                        while (i == 0 && !this.loadCanceled) {
                            try {
                                this.loadCondition.block();
                                i = this.progressiveMediaExtractor.read(this.positionHolder);
                                j3 = this.progressiveMediaExtractor.getCurrentInputPosition();
                                if (j3 > com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.continueLoadingCheckIntervalBytes + j4) {
                                    break;
                                }
                            } catch (java.lang.InterruptedException unused) {
                                throw new java.io.InterruptedIOException();
                            }
                        }
                        this.loadCondition.close();
                        com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.handler.post(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.onContinueLoadingRequestedRunnable);
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(this.dataSource);
                } catch (java.lang.Throwable th) {
                    if (i != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(this.dataSource);
                    throw th;
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.IcyDataSource.Listener
        public void onIcyMetadata(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
            long max;
            if (this.seenIcyMetadata) {
                max = java.lang.Math.max(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.getLargestQueuedTimestampUs(true), this.seekTimeUs);
            } else {
                max = this.seekTimeUs;
            }
            int bytesLeft = parsableByteArray.bytesLeft();
            com.google.android.exoplayer2.extractor.TrackOutput trackOutput = (com.google.android.exoplayer2.extractor.TrackOutput) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.icyTrackOutput);
            trackOutput.sampleData(parsableByteArray, bytesLeft);
            trackOutput.sampleMetadata(max, 1, bytesLeft, 0, null);
            this.seenIcyMetadata = true;
        }

        private com.google.android.exoplayer2.upstream.DataSpec buildDataSpec(long j) {
            return new com.google.android.exoplayer2.upstream.DataSpec.Builder().setUri(this.uri).setPosition(j).setKey(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.this.customCacheKey).setFlags(6).setHttpRequestHeaders(com.google.android.exoplayer2.source.ProgressiveMediaPeriod.ICY_METADATA_HEADERS).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j, long j2) {
            this.positionHolder.position = j;
            this.seekTimeUs = j2;
            this.pendingExtractorSeek = true;
            this.seenIcyMetadata = false;
        }
    }

    private static final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final com.google.android.exoplayer2.source.TrackGroupArray tracks;

        public TrackState(com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.tracks = trackGroupArray;
            this.trackIsAudioVideoFlags = zArr;
            this.trackEnabledStates = new boolean[trackGroupArray.length];
            this.trackNotifiedDownstreamFormats = new boolean[trackGroupArray.length];
        }
    }

    private static final class TrackId {
        public final int id;
        public final boolean isIcyTrack;

        public TrackId(int i, boolean z) {
            this.id = i;
            this.isIcyTrack = z;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId trackId = (com.google.android.exoplayer2.source.ProgressiveMediaPeriod.TrackId) obj;
            return this.id == trackId.id && this.isIcyTrack == trackId.isIcyTrack;
        }

        public int hashCode() {
            return (this.id * 31) + (this.isIcyTrack ? 1 : 0);
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> createIcyMetadataHeaders() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Icy-MetaData", "1");
        return java.util.Collections.unmodifiableMap(hashMap);
    }
}
