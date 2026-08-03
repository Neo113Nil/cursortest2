package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
final class SingleSampleMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable> {
    private static final int INITIAL_SAMPLE_SIZE = 1024;
    private static final java.lang.String TAG = "SingleSampleMediaPeriod";
    private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    private final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private final long durationUs;
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
    final com.google.android.exoplayer2.Format format;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    boolean loadingFinished;
    byte[] sampleData;
    int sampleSize;
    private final com.google.android.exoplayer2.source.TrackGroupArray tracks;
    private final com.google.android.exoplayer2.upstream.TransferListener transferListener;
    final boolean treatLoadErrorsAsEndOfStream;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SampleStreamImpl> sampleStreams = new java.util.ArrayList<>();
    final com.google.android.exoplayer2.upstream.Loader loader = new com.google.android.exoplayer2.upstream.Loader(TAG);

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, com.google.android.exoplayer2.SeekParameters seekParameters) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ java.util.List getStreamKeys(java.util.List list) {
        java.util.List emptyList;
        emptyList = java.util.Collections.emptyList();
        return emptyList;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
    }

    public SingleSampleMediaPeriod(com.google.android.exoplayer2.upstream.DataSpec dataSpec, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.upstream.TransferListener transferListener, com.google.android.exoplayer2.Format format, long j, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher, boolean z) {
        this.dataSpec = dataSpec;
        this.dataSourceFactory = factory;
        this.transferListener = transferListener;
        this.format = format;
        this.durationUs = j;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher;
        this.treatLoadErrorsAsEndOfStream = z;
        this.tracks = new com.google.android.exoplayer2.source.TrackGroupArray(new com.google.android.exoplayer2.source.TrackGroup(format));
    }

    public void release() {
        this.loader.release();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback callback, long j) {
        callback.onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
        return this.tracks;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, com.google.android.exoplayer2.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            com.google.android.exoplayer2.source.SampleStream sampleStream = sampleStreamArr[i];
            if (sampleStream != null && (exoTrackSelectionArr[i] == null || !zArr[i])) {
                this.sampleStreams.remove(sampleStream);
                sampleStreamArr[i] = null;
            }
            if (sampleStreamArr[i] == null && exoTrackSelectionArr[i] != null) {
                com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SampleStreamImpl sampleStreamImpl = new com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SampleStreamImpl();
                this.sampleStreams.add(sampleStreamImpl);
                sampleStreamArr[i] = sampleStreamImpl;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j) {
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        com.google.android.exoplayer2.upstream.DataSource createDataSource = this.dataSourceFactory.createDataSource();
        com.google.android.exoplayer2.upstream.TransferListener transferListener = this.transferListener;
        if (transferListener != null) {
            createDataSource.addTransferListener(transferListener);
        }
        com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable sourceLoadable = new com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable(this.dataSpec, createDataSource);
        this.eventDispatcher.loadStarted(new com.google.android.exoplayer2.source.LoadEventInfo(sourceLoadable.loadTaskId, this.dataSpec, this.loader.startLoading(sourceLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(1))), 1, -1, this.format, 0, null, 0L, this.durationUs);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return (this.loadingFinished || this.loader.isLoading()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.loadingFinished ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j) {
        for (int i = 0; i < this.sampleStreams.size(); i++) {
            this.sampleStreams.get(i).reset();
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCompleted(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable sourceLoadable, long j, long j2) {
        this.sampleSize = (int) sourceLoadable.dataSource.getBytesRead();
        this.sampleData = (byte[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(sourceLoadable.sampleData);
        this.loadingFinished = true;
        com.google.android.exoplayer2.upstream.StatsDataSource statsDataSource = sourceLoadable.dataSource;
        com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo = new com.google.android.exoplayer2.source.LoadEventInfo(sourceLoadable.loadTaskId, sourceLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, this.sampleSize);
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(sourceLoadable.loadTaskId);
        this.eventDispatcher.loadCompleted(loadEventInfo, 1, -1, this.format, 0, null, 0L, this.durationUs);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCanceled(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable sourceLoadable, long j, long j2, boolean z) {
        com.google.android.exoplayer2.upstream.StatsDataSource statsDataSource = sourceLoadable.dataSource;
        com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo = new com.google.android.exoplayer2.source.LoadEventInfo(sourceLoadable.loadTaskId, sourceLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(sourceLoadable.loadTaskId);
        this.eventDispatcher.loadCanceled(loadEventInfo, 1, -1, null, 0, null, 0L, this.durationUs);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.SourceLoadable sourceLoadable, long j, long j2, java.io.IOException iOException, int i) {
        com.google.android.exoplayer2.upstream.Loader.LoadErrorAction loadErrorAction;
        com.google.android.exoplayer2.upstream.StatsDataSource statsDataSource = sourceLoadable.dataSource;
        com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo = new com.google.android.exoplayer2.source.LoadEventInfo(sourceLoadable.loadTaskId, sourceLoadable.dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j, j2, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new com.google.android.exoplayer2.source.MediaLoadData(1, -1, this.format, 0, null, 0L, com.google.android.exoplayer2.util.Util.usToMs(this.durationUs)), iOException, i));
        boolean z = retryDelayMsFor == -9223372036854775807L || i >= this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(1);
        if (this.treatLoadErrorsAsEndOfStream && z) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Loading failed, treating as end-of-stream.", iOException);
            this.loadingFinished = true;
            loadErrorAction = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY;
        } else if (retryDelayMsFor != -9223372036854775807L) {
            loadErrorAction = com.google.android.exoplayer2.upstream.Loader.createRetryAction(false, retryDelayMsFor);
        } else {
            loadErrorAction = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY_FATAL;
        }
        com.google.android.exoplayer2.upstream.Loader.LoadErrorAction loadErrorAction2 = loadErrorAction;
        boolean z2 = !loadErrorAction2.isRetry();
        this.eventDispatcher.loadError(loadEventInfo, 1, -1, this.format, 0, null, 0L, this.durationUs, iOException, z2);
        if (z2) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(sourceLoadable.loadTaskId);
        }
        return loadErrorAction2;
    }

    private final class SampleStreamImpl implements com.google.android.exoplayer2.source.SampleStream {
        private static final int STREAM_STATE_END_OF_STREAM = 2;
        private static final int STREAM_STATE_SEND_FORMAT = 0;
        private static final int STREAM_STATE_SEND_SAMPLE = 1;
        private boolean notifiedDownstreamFormat;
        private int streamState;

        private SampleStreamImpl() {
        }

        public void reset() {
            if (this.streamState == 2) {
                this.streamState = 1;
            }
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.loadingFinished;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
            if (com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.treatLoadErrorsAsEndOfStream) {
                return;
            }
            com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.loader.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder formatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            maybeNotifyDownstreamFormat();
            if (com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.loadingFinished && com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.sampleData == null) {
                this.streamState = 2;
            }
            int i2 = this.streamState;
            if (i2 == 2) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                formatHolder.format = com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.format;
                this.streamState = 1;
                return -5;
            }
            if (!com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.loadingFinished) {
                return -3;
            }
            com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.sampleData);
            decoderInputBuffer.addFlag(1);
            decoderInputBuffer.timeUs = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.ensureSpaceForWrite(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.sampleSize);
                decoderInputBuffer.data.put(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.sampleData, 0, com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.sampleSize);
            }
            if ((i & 1) == 0) {
                this.streamState = 2;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j) {
            maybeNotifyDownstreamFormat();
            if (j <= 0 || this.streamState == 2) {
                return 0;
            }
            this.streamState = 2;
            return 1;
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.notifiedDownstreamFormat) {
                return;
            }
            com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.eventDispatcher.downstreamFormatChanged(com.google.android.exoplayer2.util.MimeTypes.getTrackType(com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.format.sampleMimeType), com.google.android.exoplayer2.source.SingleSampleMediaPeriod.this.format, 0, null, 0L);
            this.notifiedDownstreamFormat = true;
        }
    }

    static final class SourceLoadable implements com.google.android.exoplayer2.upstream.Loader.Loadable {
        private final com.google.android.exoplayer2.upstream.StatsDataSource dataSource;
        public final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
        public final long loadTaskId = com.google.android.exoplayer2.source.LoadEventInfo.getNewId();
        private byte[] sampleData;

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        public SourceLoadable(com.google.android.exoplayer2.upstream.DataSpec dataSpec, com.google.android.exoplayer2.upstream.DataSource dataSource) {
            this.dataSpec = dataSpec;
            this.dataSource = new com.google.android.exoplayer2.upstream.StatsDataSource(dataSource);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws java.io.IOException {
            int bytesRead;
            com.google.android.exoplayer2.upstream.StatsDataSource statsDataSource;
            byte[] bArr;
            this.dataSource.resetBytesRead();
            try {
                this.dataSource.open(this.dataSpec);
                do {
                    bytesRead = (int) this.dataSource.getBytesRead();
                    byte[] bArr2 = this.sampleData;
                    if (bArr2 == null) {
                        this.sampleData = new byte[1024];
                    } else if (bytesRead == bArr2.length) {
                        this.sampleData = java.util.Arrays.copyOf(bArr2, bArr2.length * 2);
                    }
                    statsDataSource = this.dataSource;
                    bArr = this.sampleData;
                } while (statsDataSource.read(bArr, bytesRead, bArr.length - bytesRead) != -1);
            } finally {
                com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(this.dataSource);
            }
        }
    }
}
