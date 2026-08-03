package com.google.android.exoplayer2.offline;

/* loaded from: classes3.dex */
public abstract class SegmentDownloader<M extends com.google.android.exoplayer2.offline.FilterableManifest<M>> implements com.google.android.exoplayer2.offline.Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    private static final long MAX_MERGED_SEGMENT_START_TIME_DIFF_US = 20000000;
    private final java.util.ArrayList<com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>> activeRunnables;
    private final com.google.android.exoplayer2.upstream.cache.Cache cache;
    private final com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory cacheDataSourceFactory;
    private final com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory;
    private final java.util.concurrent.Executor executor;
    private volatile boolean isCanceled;
    private final com.google.android.exoplayer2.upstream.DataSpec manifestDataSpec;
    private final com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<M> manifestParser;
    private final com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
    private final java.util.ArrayList<com.google.android.exoplayer2.offline.StreamKey> streamKeys;

    protected abstract java.util.List<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> getSegments(com.google.android.exoplayer2.upstream.DataSource dataSource, M m, boolean z) throws java.io.IOException, java.lang.InterruptedException;

    protected static class Segment implements java.lang.Comparable<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> {
        public final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long j, com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
            this.startTimeUs = j;
            this.dataSpec = dataSpec;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.android.exoplayer2.offline.SegmentDownloader.Segment segment) {
            return com.google.android.exoplayer2.util.Util.compareLong(this.startTimeUs, segment.startTimeUs);
        }
    }

    public SegmentDownloader(com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser<M> parser, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        this.manifestDataSpec = getCompressibleDataSpec(mediaItem.localConfiguration.uri);
        this.manifestParser = parser;
        this.streamKeys = new java.util.ArrayList<>(mediaItem.localConfiguration.streamKeys);
        this.cacheDataSourceFactory = factory;
        this.executor = executor;
        this.cache = (com.google.android.exoplayer2.upstream.cache.Cache) com.google.android.exoplayer2.util.Assertions.checkNotNull(factory.getCache());
        this.cacheKeyFactory = factory.getCacheKeyFactory();
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
        this.activeRunnables = new java.util.ArrayList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a6 A[LOOP:1: B:37:0x019e->B:39:0x01a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bf A[LOOP:2: B:42:0x01bd->B:43:0x01bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d4  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer2.offline.SegmentDownloader] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.exoplayer2.offline.SegmentDownloader] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27 */
    @Override // com.google.android.exoplayer2.offline.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void download(com.google.android.exoplayer2.offline.Downloader.ProgressListener progressListener) throws java.io.IOException, java.lang.InterruptedException {
        com.google.android.exoplayer2.offline.SegmentDownloader<M> segmentDownloader;
        int i;
        int size;
        com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
        com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSourceForDownloading;
        byte[] bArr;
        ?? r1 = this;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayDeque arrayDeque2 = new java.util.ArrayDeque();
        com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager2 = r1.priorityTaskManager;
        if (priorityTaskManager2 != null) {
            priorityTaskManager2.add(-1000);
        }
        try {
            com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSourceForDownloading2 = r1.cacheDataSourceFactory.createDataSourceForDownloading();
            com.google.android.exoplayer2.offline.FilterableManifest manifest = r1.getManifest(createDataSourceForDownloading2, r1.manifestDataSpec, false);
            if (!r1.streamKeys.isEmpty()) {
                manifest = (com.google.android.exoplayer2.offline.FilterableManifest) manifest.copy(r1.streamKeys);
            }
            java.util.List<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> segments = r1.getSegments(createDataSourceForDownloading2, manifest, false);
            java.util.Collections.sort(segments);
            mergeSegments(segments, r1.cacheKeyFactory);
            int size2 = segments.size();
            int size3 = segments.size() - 1;
            long j = 0;
            long j2 = 0;
            int i2 = 0;
            r1 = r1;
            while (size3 >= 0) {
                try {
                    com.google.android.exoplayer2.upstream.DataSpec dataSpec = segments.get(size3).dataSpec;
                    java.lang.String buildCacheKey = r1.cacheKeyFactory.buildCacheKey(dataSpec);
                    long j3 = dataSpec.length;
                    if (j3 == -1) {
                        long contentLength = com.google.android.exoplayer2.upstream.cache.ContentMetadata.CC.getContentLength(r1.cache.getContentMetadata(buildCacheKey));
                        if (contentLength != -1) {
                            j3 = contentLength - dataSpec.position;
                        }
                    }
                    java.util.ArrayDeque arrayDeque3 = arrayDeque;
                    long cachedBytes = r1.cache.getCachedBytes(buildCacheKey, dataSpec.position, j3);
                    j2 += cachedBytes;
                    if (j3 != -1) {
                        if (j3 == cachedBytes) {
                            i2++;
                            segments.remove(size3);
                        }
                        if (j != -1) {
                            j += j3;
                        }
                    } else {
                        j = -1;
                    }
                    size3--;
                    r1 = this;
                    arrayDeque = arrayDeque3;
                } catch (java.lang.Throwable th) {
                    th = th;
                    segmentDownloader = this;
                    while (i < segmentDownloader.activeRunnables.size()) {
                    }
                    while (size >= 0) {
                    }
                    priorityTaskManager = segmentDownloader.priorityTaskManager;
                    if (priorityTaskManager != null) {
                    }
                    throw th;
                }
            }
            java.util.ArrayDeque arrayDeque4 = arrayDeque;
            com.google.android.exoplayer2.offline.SegmentDownloader.ProgressNotifier progressNotifier = progressListener != null ? new com.google.android.exoplayer2.offline.SegmentDownloader.ProgressNotifier(progressListener, j, size2, j2, i2) : null;
            arrayDeque4.addAll(segments);
            segmentDownloader = this;
            while (!segmentDownloader.isCanceled && !arrayDeque4.isEmpty()) {
                try {
                    com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager3 = segmentDownloader.priorityTaskManager;
                    if (priorityTaskManager3 != null) {
                        priorityTaskManager3.proceed(-1000);
                    }
                    if (!arrayDeque2.isEmpty()) {
                        com.google.android.exoplayer2.offline.SegmentDownloader.SegmentDownloadRunnable segmentDownloadRunnable = (com.google.android.exoplayer2.offline.SegmentDownloader.SegmentDownloadRunnable) arrayDeque2.removeFirst();
                        createDataSourceForDownloading = segmentDownloadRunnable.dataSource;
                        bArr = segmentDownloadRunnable.temporaryBuffer;
                    } else {
                        createDataSourceForDownloading = segmentDownloader.cacheDataSourceFactory.createDataSourceForDownloading();
                        bArr = new byte[131072];
                    }
                    com.google.android.exoplayer2.offline.SegmentDownloader.SegmentDownloadRunnable segmentDownloadRunnable2 = new com.google.android.exoplayer2.offline.SegmentDownloader.SegmentDownloadRunnable((com.google.android.exoplayer2.offline.SegmentDownloader.Segment) arrayDeque4.removeFirst(), createDataSourceForDownloading, progressNotifier, bArr);
                    segmentDownloader.addActiveRunnable(segmentDownloadRunnable2);
                    segmentDownloader.executor.execute(segmentDownloadRunnable2);
                    for (int size4 = segmentDownloader.activeRunnables.size() - 1; size4 >= 0; size4--) {
                        com.google.android.exoplayer2.offline.SegmentDownloader.SegmentDownloadRunnable segmentDownloadRunnable3 = (com.google.android.exoplayer2.offline.SegmentDownloader.SegmentDownloadRunnable) segmentDownloader.activeRunnables.get(size4);
                        if (arrayDeque4.isEmpty() || segmentDownloadRunnable3.isDone()) {
                            try {
                                segmentDownloadRunnable3.get();
                                segmentDownloader.removeActiveRunnable(size4);
                                arrayDeque2.addLast(segmentDownloadRunnable3);
                            } catch (java.util.concurrent.ExecutionException e) {
                                java.lang.Throwable th2 = (java.lang.Throwable) com.google.android.exoplayer2.util.Assertions.checkNotNull(e.getCause());
                                if (th2 instanceof com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException) {
                                    arrayDeque4.addFirst(segmentDownloadRunnable3.segment);
                                    segmentDownloader.removeActiveRunnable(size4);
                                    arrayDeque2.addLast(segmentDownloadRunnable3);
                                } else {
                                    if (th2 instanceof java.io.IOException) {
                                        throw ((java.io.IOException) th2);
                                    }
                                    com.google.android.exoplayer2.util.Util.sneakyThrow(th2);
                                }
                            }
                        }
                    }
                    segmentDownloadRunnable2.blockUntilStarted();
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    for (i = 0; i < segmentDownloader.activeRunnables.size(); i++) {
                        segmentDownloader.activeRunnables.get(i).cancel(true);
                    }
                    for (size = segmentDownloader.activeRunnables.size() - 1; size >= 0; size--) {
                        segmentDownloader.activeRunnables.get(size).blockUntilFinished();
                        segmentDownloader.removeActiveRunnable(size);
                    }
                    priorityTaskManager = segmentDownloader.priorityTaskManager;
                    if (priorityTaskManager != null) {
                        priorityTaskManager.remove(-1000);
                    }
                    throw th;
                }
            }
            for (int i3 = 0; i3 < segmentDownloader.activeRunnables.size(); i3++) {
                segmentDownloader.activeRunnables.get(i3).cancel(true);
            }
            for (int size5 = segmentDownloader.activeRunnables.size() - 1; size5 >= 0; size5--) {
                segmentDownloader.activeRunnables.get(size5).blockUntilFinished();
                segmentDownloader.removeActiveRunnable(size5);
            }
            com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager4 = segmentDownloader.priorityTaskManager;
            if (priorityTaskManager4 != null) {
                priorityTaskManager4.remove(-1000);
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            segmentDownloader = r1;
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
        synchronized (this.activeRunnables) {
            this.isCanceled = true;
            for (int i = 0; i < this.activeRunnables.size(); i++) {
                this.activeRunnables.get(i).cancel(true);
            }
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() {
        com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSourceForRemovingDownload = this.cacheDataSourceFactory.createDataSourceForRemovingDownload();
        try {
            try {
                java.util.List<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> segments = getSegments(createDataSourceForRemovingDownload, getManifest(createDataSourceForRemovingDownload, this.manifestDataSpec, true), true);
                for (int i = 0; i < segments.size(); i++) {
                    this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(segments.get(i).dataSpec));
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.lang.Exception unused2) {
            }
        } finally {
            this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
        }
    }

    protected final M getManifest(final com.google.android.exoplayer2.upstream.DataSource dataSource, final com.google.android.exoplayer2.upstream.DataSpec dataSpec, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        return (M) execute(new com.google.android.exoplayer2.util.RunnableFutureTask<M, java.io.IOException>() { // from class: com.google.android.exoplayer2.offline.SegmentDownloader.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.exoplayer2.util.RunnableFutureTask
            public M doWork() throws java.io.IOException {
                return (M) com.google.android.exoplayer2.upstream.ParsingLoadable.load(dataSource, com.google.android.exoplayer2.offline.SegmentDownloader.this.manifestParser, dataSpec, 4);
            }
        }, z);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|28|29|(2:34|(2:36|37)(3:38|39|40))(2:31|32)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r0 = (java.lang.Throwable) com.google.android.exoplayer2.util.Assertions.checkNotNull(r4.getCause());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if ((r0 instanceof com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0054, code lost:
    
        if ((r0 instanceof java.io.IOException) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0056, code lost:
    
        com.google.android.exoplayer2.util.Util.sneakyThrow(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
    
        throw ((java.io.IOException) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0040, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:
    
        r3.blockUntilFinished();
        removeActiveRunnable((com.google.android.exoplayer2.util.RunnableFutureTask<?, ?>) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final <T> T execute(com.google.android.exoplayer2.util.RunnableFutureTask<T, ?> runnableFutureTask, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        if (z) {
            runnableFutureTask.run();
            try {
                return runnableFutureTask.get();
            } catch (java.util.concurrent.ExecutionException e) {
                java.lang.Throwable th = (java.lang.Throwable) com.google.android.exoplayer2.util.Assertions.checkNotNull(e.getCause());
                if (th instanceof java.io.IOException) {
                    throw ((java.io.IOException) th);
                }
                com.google.android.exoplayer2.util.Util.sneakyThrow(e);
            }
        }
        while (!this.isCanceled) {
            com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(-1000);
            }
            addActiveRunnable(runnableFutureTask);
            this.executor.execute(runnableFutureTask);
            return runnableFutureTask.get();
        }
        throw new java.lang.InterruptedException();
    }

    protected static com.google.android.exoplayer2.upstream.DataSpec getCompressibleDataSpec(android.net.Uri uri) {
        return new com.google.android.exoplayer2.upstream.DataSpec.Builder().setUri(uri).setFlags(1).build();
    }

    private <T> void addActiveRunnable(com.google.android.exoplayer2.util.RunnableFutureTask<T, ?> runnableFutureTask) throws java.lang.InterruptedException {
        synchronized (this.activeRunnables) {
            if (this.isCanceled) {
                throw new java.lang.InterruptedException();
            }
            this.activeRunnables.add(runnableFutureTask);
        }
    }

    private void removeActiveRunnable(com.google.android.exoplayer2.util.RunnableFutureTask<?, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(runnableFutureTask);
        }
    }

    private void removeActiveRunnable(int i) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(i);
        }
    }

    private static void mergeSegments(java.util.List<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> list, com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory) {
        java.util.HashMap hashMap = new java.util.HashMap();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.google.android.exoplayer2.offline.SegmentDownloader.Segment segment = list.get(i2);
            java.lang.String buildCacheKey = cacheKeyFactory.buildCacheKey(segment.dataSpec);
            java.lang.Integer num = (java.lang.Integer) hashMap.get(buildCacheKey);
            com.google.android.exoplayer2.offline.SegmentDownloader.Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + MAX_MERGED_SEGMENT_START_TIME_DIFF_US || !canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                hashMap.put(buildCacheKey, java.lang.Integer.valueOf(i));
                list.set(i, segment);
                i++;
            } else {
                list.set(((java.lang.Integer) com.google.android.exoplayer2.util.Assertions.checkNotNull(num)).intValue(), new com.google.android.exoplayer2.offline.SegmentDownloader.Segment(segment2.startTimeUs, segment2.dataSpec.subrange(0L, segment.dataSpec.length != -1 ? segment2.dataSpec.length + segment.dataSpec.length : -1L)));
            }
        }
        com.google.android.exoplayer2.util.Util.removeRange(list, i, list.size());
    }

    private static boolean canMergeSegments(com.google.android.exoplayer2.upstream.DataSpec dataSpec, com.google.android.exoplayer2.upstream.DataSpec dataSpec2) {
        return dataSpec.uri.equals(dataSpec2.uri) && dataSpec.length != -1 && dataSpec.position + dataSpec.length == dataSpec2.position && com.google.android.exoplayer2.util.Util.areEqual(dataSpec.key, dataSpec2.key) && dataSpec.flags == dataSpec2.flags && dataSpec.httpMethod == dataSpec2.httpMethod && dataSpec.httpRequestHeaders.equals(dataSpec2.httpRequestHeaders);
    }

    private static final class SegmentDownloadRunnable extends com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException> {
        private final com.google.android.exoplayer2.upstream.cache.CacheWriter cacheWriter;
        public final com.google.android.exoplayer2.upstream.cache.CacheDataSource dataSource;
        private final com.google.android.exoplayer2.offline.SegmentDownloader.ProgressNotifier progressNotifier;
        public final com.google.android.exoplayer2.offline.SegmentDownloader.Segment segment;
        public final byte[] temporaryBuffer;

        public SegmentDownloadRunnable(com.google.android.exoplayer2.offline.SegmentDownloader.Segment segment, com.google.android.exoplayer2.upstream.cache.CacheDataSource cacheDataSource, com.google.android.exoplayer2.offline.SegmentDownloader.ProgressNotifier progressNotifier, byte[] bArr) {
            this.segment = segment;
            this.dataSource = cacheDataSource;
            this.progressNotifier = progressNotifier;
            this.temporaryBuffer = bArr;
            this.cacheWriter = new com.google.android.exoplayer2.upstream.cache.CacheWriter(cacheDataSource, segment.dataSpec, bArr, progressNotifier);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        public java.lang.Void doWork() throws java.io.IOException {
            this.cacheWriter.cache();
            com.google.android.exoplayer2.offline.SegmentDownloader.ProgressNotifier progressNotifier = this.progressNotifier;
            if (progressNotifier == null) {
                return null;
            }
            progressNotifier.onSegmentDownloaded();
            return null;
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        protected void cancelWork() {
            this.cacheWriter.cancel();
        }
    }

    private static final class ProgressNotifier implements com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final com.google.android.exoplayer2.offline.Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(com.google.android.exoplayer2.offline.Downloader.ProgressListener progressListener, long j, int i, long j2, int i2) {
            this.progressListener = progressListener;
            this.contentLength = j;
            this.totalSegments = i;
            this.bytesDownloaded = j2;
            this.segmentsDownloaded = i2;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
        public void onProgress(long j, long j2, long j3) {
            long j4 = this.bytesDownloaded + j3;
            this.bytesDownloaded = j4;
            this.progressListener.onProgress(this.contentLength, j4, getPercentDownloaded());
        }

        public void onSegmentDownloaded() {
            this.segmentsDownloaded++;
            this.progressListener.onProgress(this.contentLength, this.bytesDownloaded, getPercentDownloaded());
        }

        private float getPercentDownloaded() {
            long j = this.contentLength;
            if (j != -1 && j != 0) {
                return (this.bytesDownloaded * 100.0f) / j;
            }
            int i = this.totalSegments;
            if (i != 0) {
                return (this.segmentsDownloaded * 100.0f) / i;
            }
            return -1.0f;
        }
    }
}
