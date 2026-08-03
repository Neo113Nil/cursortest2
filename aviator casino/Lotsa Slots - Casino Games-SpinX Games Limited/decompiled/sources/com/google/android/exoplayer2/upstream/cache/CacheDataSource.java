package com.google.android.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class CacheDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;
    private android.net.Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final com.google.android.exoplayer2.upstream.cache.Cache cache;
    private final com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory;
    private final com.google.android.exoplayer2.upstream.DataSource cacheReadDataSource;
    private final com.google.android.exoplayer2.upstream.DataSource cacheWriteDataSource;
    private long checkCachePosition;
    private com.google.android.exoplayer2.upstream.DataSource currentDataSource;
    private long currentDataSourceBytesRead;
    private com.google.android.exoplayer2.upstream.DataSpec currentDataSpec;
    private com.google.android.exoplayer2.upstream.cache.CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;
    private final com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener eventListener;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    private long readPosition;
    private com.google.android.exoplayer2.upstream.DataSpec requestDataSpec;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final com.google.android.exoplayer2.upstream.DataSource upstreamDataSource;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
        void onCacheIgnored(int i);

        void onCachedBytesRead(long j, long j2);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class Factory implements com.google.android.exoplayer2.upstream.DataSource.Factory {
        private com.google.android.exoplayer2.upstream.cache.Cache cache;
        private boolean cacheIsReadOnly;
        private com.google.android.exoplayer2.upstream.DataSink.Factory cacheWriteDataSinkFactory;
        private com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener eventListener;
        private int flags;
        private com.google.android.exoplayer2.upstream.DataSource.Factory upstreamDataSourceFactory;
        private int upstreamPriority;
        private com.google.android.exoplayer2.util.PriorityTaskManager upstreamPriorityTaskManager;
        private com.google.android.exoplayer2.upstream.DataSource.Factory cacheReadDataSourceFactory = new com.google.android.exoplayer2.upstream.FileDataSource.Factory();
        private com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory = com.google.android.exoplayer2.upstream.cache.CacheKeyFactory.DEFAULT;

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setCache(com.google.android.exoplayer2.upstream.cache.Cache cache) {
            this.cache = cache;
            return this;
        }

        public com.google.android.exoplayer2.upstream.cache.Cache getCache() {
            return this.cache;
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setCacheReadDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
            this.cacheReadDataSourceFactory = factory;
            return this;
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setCacheWriteDataSinkFactory(com.google.android.exoplayer2.upstream.DataSink.Factory factory) {
            this.cacheWriteDataSinkFactory = factory;
            this.cacheIsReadOnly = factory == null;
            return this;
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setCacheKeyFactory(com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory) {
            this.cacheKeyFactory = cacheKeyFactory;
            return this;
        }

        public com.google.android.exoplayer2.upstream.cache.CacheKeyFactory getCacheKeyFactory() {
            return this.cacheKeyFactory;
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setUpstreamDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
            this.upstreamDataSourceFactory = factory;
            return this;
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setUpstreamPriorityTaskManager(com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager) {
            this.upstreamPriorityTaskManager = priorityTaskManager;
            return this;
        }

        public com.google.android.exoplayer2.util.PriorityTaskManager getUpstreamPriorityTaskManager() {
            return this.upstreamPriorityTaskManager;
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setUpstreamPriority(int i) {
            this.upstreamPriority = i;
            return this;
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setFlags(int i) {
            this.flags = i;
            return this;
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory setEventListener(com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener eventListener) {
            this.eventListener = eventListener;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSource() {
            com.google.android.exoplayer2.upstream.DataSource.Factory factory = this.upstreamDataSourceFactory;
            return createDataSourceInternal(factory != null ? factory.createDataSource() : null, this.flags, this.upstreamPriority);
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSourceForDownloading() {
            com.google.android.exoplayer2.upstream.DataSource.Factory factory = this.upstreamDataSourceFactory;
            return createDataSourceInternal(factory != null ? factory.createDataSource() : null, this.flags | 1, -1000);
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSourceForRemovingDownload() {
            return createDataSourceInternal(null, this.flags | 1, -1000);
        }

        private com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSourceInternal(com.google.android.exoplayer2.upstream.DataSource dataSource, int i, int i2) {
            com.google.android.exoplayer2.upstream.DataSink dataSink;
            com.google.android.exoplayer2.upstream.cache.Cache cache = (com.google.android.exoplayer2.upstream.cache.Cache) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.cache);
            if (this.cacheIsReadOnly || dataSource == null) {
                dataSink = null;
            } else {
                com.google.android.exoplayer2.upstream.DataSink.Factory factory = this.cacheWriteDataSinkFactory;
                if (factory != null) {
                    dataSink = factory.createDataSink();
                } else {
                    dataSink = new com.google.android.exoplayer2.upstream.cache.CacheDataSink.Factory().setCache(cache).createDataSink();
                }
            }
            return new com.google.android.exoplayer2.upstream.cache.CacheDataSource(cache, dataSource, this.cacheReadDataSourceFactory.createDataSource(), dataSink, this.cacheKeyFactory, i, this.upstreamPriorityTaskManager, i2, this.eventListener);
        }
    }

    public CacheDataSource(com.google.android.exoplayer2.upstream.cache.Cache cache, com.google.android.exoplayer2.upstream.DataSource dataSource) {
        this(cache, dataSource, 0);
    }

    public CacheDataSource(com.google.android.exoplayer2.upstream.cache.Cache cache, com.google.android.exoplayer2.upstream.DataSource dataSource, int i) {
        this(cache, dataSource, new com.google.android.exoplayer2.upstream.FileDataSource(), new com.google.android.exoplayer2.upstream.cache.CacheDataSink(cache, 5242880L), i, null);
    }

    public CacheDataSource(com.google.android.exoplayer2.upstream.cache.Cache cache, com.google.android.exoplayer2.upstream.DataSource dataSource, com.google.android.exoplayer2.upstream.DataSource dataSource2, com.google.android.exoplayer2.upstream.DataSink dataSink, int i, com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener eventListener) {
        this(cache, dataSource, dataSource2, dataSink, i, eventListener, null);
    }

    public CacheDataSource(com.google.android.exoplayer2.upstream.cache.Cache cache, com.google.android.exoplayer2.upstream.DataSource dataSource, com.google.android.exoplayer2.upstream.DataSource dataSource2, com.google.android.exoplayer2.upstream.DataSink dataSink, int i, com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener eventListener, com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory) {
        this(cache, dataSource, dataSource2, dataSink, cacheKeyFactory, i, null, 0, eventListener);
    }

    private CacheDataSource(com.google.android.exoplayer2.upstream.cache.Cache cache, com.google.android.exoplayer2.upstream.DataSource dataSource, com.google.android.exoplayer2.upstream.DataSource dataSource2, com.google.android.exoplayer2.upstream.DataSink dataSink, com.google.android.exoplayer2.upstream.cache.CacheKeyFactory cacheKeyFactory, int i, com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager, int i2, com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener eventListener) {
        this.cache = cache;
        this.cacheReadDataSource = dataSource2;
        this.cacheKeyFactory = cacheKeyFactory == null ? com.google.android.exoplayer2.upstream.cache.CacheKeyFactory.DEFAULT : cacheKeyFactory;
        this.blockOnCache = (i & 1) != 0;
        this.ignoreCacheOnError = (i & 2) != 0;
        this.ignoreCacheForUnsetLengthRequests = (i & 4) != 0;
        if (dataSource != null) {
            dataSource = priorityTaskManager != null ? new com.google.android.exoplayer2.upstream.PriorityDataSource(dataSource, priorityTaskManager, i2) : dataSource;
            this.upstreamDataSource = dataSource;
            this.cacheWriteDataSource = dataSink != null ? new com.google.android.exoplayer2.upstream.TeeDataSource(dataSource, dataSink) : null;
        } else {
            this.upstreamDataSource = com.google.android.exoplayer2.upstream.PlaceholderDataSource.INSTANCE;
            this.cacheWriteDataSource = null;
        }
        this.eventListener = eventListener;
    }

    public com.google.android.exoplayer2.upstream.cache.Cache getCache() {
        return this.cache;
    }

    public com.google.android.exoplayer2.upstream.cache.CacheKeyFactory getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(transferListener);
        this.cacheReadDataSource.addTransferListener(transferListener);
        this.upstreamDataSource.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws java.io.IOException {
        long min;
        try {
            java.lang.String buildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
            com.google.android.exoplayer2.upstream.DataSpec build = dataSpec.buildUpon().setKey(buildCacheKey).build();
            this.requestDataSpec = build;
            this.actualUri = getRedirectedUriOrDefault(this.cache, buildCacheKey, build.uri);
            this.readPosition = dataSpec.position;
            int shouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(dataSpec);
            boolean z = shouldIgnoreCacheForRequest != -1;
            this.currentRequestIgnoresCache = z;
            if (z) {
                notifyCacheIgnored(shouldIgnoreCacheForRequest);
            }
            if (this.currentRequestIgnoresCache) {
                this.bytesRemaining = -1L;
            } else {
                long contentLength = com.google.android.exoplayer2.upstream.cache.ContentMetadata.CC.getContentLength(this.cache.getContentMetadata(buildCacheKey));
                this.bytesRemaining = contentLength;
                if (contentLength != -1) {
                    long j = contentLength - dataSpec.position;
                    this.bytesRemaining = j;
                    if (j < 0) {
                        throw new com.google.android.exoplayer2.upstream.DataSourceException(2008);
                    }
                }
            }
            if (dataSpec.length != -1) {
                long j2 = this.bytesRemaining;
                if (j2 == -1) {
                    min = dataSpec.length;
                } else {
                    min = java.lang.Math.min(j2, dataSpec.length);
                }
                this.bytesRemaining = min;
            }
            long j3 = this.bytesRemaining;
            if (j3 > 0 || j3 == -1) {
                openNextSource(build, false);
            }
            return dataSpec.length != -1 ? dataSpec.length : this.bytesRemaining;
        } catch (java.lang.Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        com.google.android.exoplayer2.upstream.DataSpec dataSpec = (com.google.android.exoplayer2.upstream.DataSpec) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.requestDataSpec);
        com.google.android.exoplayer2.upstream.DataSpec dataSpec2 = (com.google.android.exoplayer2.upstream.DataSpec) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.currentDataSpec);
        try {
            if (this.readPosition >= this.checkCachePosition) {
                openNextSource(dataSpec, true);
            }
            int read = ((com.google.android.exoplayer2.upstream.DataSource) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.currentDataSource)).read(bArr, i, i2);
            if (read != -1) {
                if (isReadingFromCache()) {
                    this.totalCachedBytesRead += read;
                }
                long j = read;
                this.readPosition += j;
                this.currentDataSourceBytesRead += j;
                long j2 = this.bytesRemaining;
                if (j2 != -1) {
                    this.bytesRemaining = j2 - j;
                }
            } else if (isReadingFromUpstream() && (dataSpec2.length == -1 || this.currentDataSourceBytesRead < dataSpec2.length)) {
                setNoBytesRemainingAndMaybeStoreLength((java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(dataSpec.key));
            } else {
                long j3 = this.bytesRemaining;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                closeCurrentSource();
                openNextSource(dataSpec, false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (java.lang.Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public android.net.Uri getUri() {
        return this.actualUri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        if (isReadingFromUpstream()) {
            return this.upstreamDataSource.getResponseHeaders();
        }
        return java.util.Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws java.io.IOException {
        this.requestDataSpec = null;
        this.actualUri = null;
        this.readPosition = 0L;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (java.lang.Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    private void openNextSource(com.google.android.exoplayer2.upstream.DataSpec dataSpec, boolean z) throws java.io.IOException {
        com.google.android.exoplayer2.upstream.cache.CacheSpan startReadWrite;
        long j;
        com.google.android.exoplayer2.upstream.DataSpec build;
        com.google.android.exoplayer2.upstream.DataSource dataSource;
        java.lang.String str = (java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(dataSpec.key);
        if (this.currentRequestIgnoresCache) {
            startReadWrite = null;
        } else if (this.blockOnCache) {
            try {
                startReadWrite = this.cache.startReadWrite(str, this.readPosition, this.bytesRemaining);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.io.InterruptedIOException();
            }
        } else {
            startReadWrite = this.cache.startReadWriteNonBlocking(str, this.readPosition, this.bytesRemaining);
        }
        if (startReadWrite == null) {
            dataSource = this.upstreamDataSource;
            build = dataSpec.buildUpon().setPosition(this.readPosition).setLength(this.bytesRemaining).build();
        } else if (startReadWrite.isCached) {
            android.net.Uri fromFile = android.net.Uri.fromFile((java.io.File) com.google.android.exoplayer2.util.Util.castNonNull(startReadWrite.file));
            long j2 = startReadWrite.position;
            long j3 = this.readPosition - j2;
            long j4 = startReadWrite.length - j3;
            long j5 = this.bytesRemaining;
            if (j5 != -1) {
                j4 = java.lang.Math.min(j4, j5);
            }
            build = dataSpec.buildUpon().setUri(fromFile).setUriPositionOffset(j2).setPosition(j3).setLength(j4).build();
            dataSource = this.cacheReadDataSource;
        } else {
            if (startReadWrite.isOpenEnded()) {
                j = this.bytesRemaining;
            } else {
                j = startReadWrite.length;
                long j6 = this.bytesRemaining;
                if (j6 != -1) {
                    j = java.lang.Math.min(j, j6);
                }
            }
            build = dataSpec.buildUpon().setPosition(this.readPosition).setLength(j).build();
            dataSource = this.cacheWriteDataSource;
            if (dataSource == null) {
                dataSource = this.upstreamDataSource;
                this.cache.releaseHoleSpan(startReadWrite);
                startReadWrite = null;
            }
        }
        this.checkCachePosition = (this.currentRequestIgnoresCache || dataSource != this.upstreamDataSource) ? Long.MAX_VALUE : this.readPosition + MIN_READ_BEFORE_CHECKING_CACHE;
        if (z) {
            com.google.android.exoplayer2.util.Assertions.checkState(isBypassingCache());
            if (dataSource == this.upstreamDataSource) {
                return;
            }
            try {
                closeCurrentSource();
            } finally {
            }
        }
        if (startReadWrite != null && startReadWrite.isHoleSpan()) {
            this.currentHoleSpan = startReadWrite;
        }
        this.currentDataSource = dataSource;
        this.currentDataSpec = build;
        this.currentDataSourceBytesRead = 0L;
        long open = dataSource.open(build);
        com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations contentMetadataMutations = new com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations();
        if (build.length == -1 && open != -1) {
            this.bytesRemaining = open;
            com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition + open);
        }
        if (isReadingFromUpstream()) {
            this.actualUri = dataSource.getUri();
            com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations.setRedirectedUri(contentMetadataMutations, dataSpec.uri.equals(this.actualUri) ^ true ? this.actualUri : null);
        }
        if (isWritingToCache()) {
            this.cache.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    private void setNoBytesRemainingAndMaybeStoreLength(java.lang.String str) throws java.io.IOException {
        this.bytesRemaining = 0L;
        if (isWritingToCache()) {
            com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations contentMetadataMutations = new com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations();
            com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition);
            this.cache.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    private static android.net.Uri getRedirectedUriOrDefault(com.google.android.exoplayer2.upstream.cache.Cache cache, java.lang.String str, android.net.Uri uri) {
        android.net.Uri redirectedUri = com.google.android.exoplayer2.upstream.cache.ContentMetadata.CC.getRedirectedUri(cache.getContentMetadata(str));
        return redirectedUri != null ? redirectedUri : uri;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    private boolean isBypassingCache() {
        return this.currentDataSource == this.upstreamDataSource;
    }

    private boolean isReadingFromCache() {
        return this.currentDataSource == this.cacheReadDataSource;
    }

    private boolean isWritingToCache() {
        return this.currentDataSource == this.cacheWriteDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void closeCurrentSource() throws java.io.IOException {
        com.google.android.exoplayer2.upstream.DataSource dataSource = this.currentDataSource;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.currentDataSpec = null;
            this.currentDataSource = null;
            com.google.android.exoplayer2.upstream.cache.CacheSpan cacheSpan = this.currentHoleSpan;
            if (cacheSpan != null) {
                this.cache.releaseHoleSpan(cacheSpan);
                this.currentHoleSpan = null;
            }
        }
    }

    private void handleBeforeThrow(java.lang.Throwable th) {
        if (isReadingFromCache() || (th instanceof com.google.android.exoplayer2.upstream.cache.Cache.CacheException)) {
            this.seenCacheError = true;
        }
    }

    private int shouldIgnoreCacheForRequest(com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
        if (this.ignoreCacheOnError && this.seenCacheError) {
            return 0;
        }
        return (this.ignoreCacheForUnsetLengthRequests && dataSpec.length == -1) ? 1 : -1;
    }

    private void notifyCacheIgnored(int i) {
        com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.onCacheIgnored(i);
        }
    }

    private void notifyBytesRead() {
        com.google.android.exoplayer2.upstream.cache.CacheDataSource.EventListener eventListener = this.eventListener;
        if (eventListener == null || this.totalCachedBytesRead <= 0) {
            return;
        }
        eventListener.onCachedBytesRead(this.cache.getCacheSpace(), this.totalCachedBytesRead);
        this.totalCachedBytesRead = 0L;
    }
}
