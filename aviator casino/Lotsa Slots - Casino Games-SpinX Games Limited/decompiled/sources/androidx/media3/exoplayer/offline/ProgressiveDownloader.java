package androidx.media3.exoplayer.offline;

/* loaded from: classes2.dex */
public final class ProgressiveDownloader implements androidx.media3.exoplayer.offline.Downloader {
    private final androidx.media3.datasource.cache.CacheWriter cacheWriter;
    private final androidx.media3.datasource.cache.CacheDataSource dataSource;
    private final androidx.media3.datasource.DataSpec dataSpec;
    private volatile androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> downloadRunnable;
    private final java.util.concurrent.Executor executor;
    private volatile boolean isCanceled;
    private final androidx.media3.common.PriorityTaskManager priorityTaskManager;
    private androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener;

    public ProgressiveDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory) {
        this(mediaItem, factory, new androidx.media3.exoplayer.offline.DefaultDownloaderFactory$$ExternalSyntheticLambda0());
    }

    public ProgressiveDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor) {
        this.executor = (java.util.concurrent.Executor) androidx.media3.common.util.Assertions.checkNotNull(executor);
        androidx.media3.common.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        androidx.media3.datasource.DataSpec build = new androidx.media3.datasource.DataSpec.Builder().setUri(mediaItem.localConfiguration.uri).setKey(mediaItem.localConfiguration.customCacheKey).setFlags(4).build();
        this.dataSpec = build;
        androidx.media3.datasource.cache.CacheDataSource createDataSourceForDownloading = factory.createDataSourceForDownloading();
        this.dataSource = createDataSourceForDownloading;
        this.cacheWriter = new androidx.media3.datasource.cache.CacheWriter(createDataSourceForDownloading, build, null, new androidx.media3.datasource.cache.CacheWriter.ProgressListener() { // from class: androidx.media3.exoplayer.offline.ProgressiveDownloader$$ExternalSyntheticLambda0
            @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
            public final void onProgress(long j, long j2, long j3) {
                androidx.media3.exoplayer.offline.ProgressiveDownloader.this.onProgress(j, j2, j3);
            }
        });
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void download(androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener) throws java.io.IOException, java.lang.InterruptedException {
        this.progressListener = progressListener;
        androidx.media3.common.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-4000);
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.isCanceled) {
                    break;
                }
                this.downloadRunnable = new androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException>() { // from class: androidx.media3.exoplayer.offline.ProgressiveDownloader.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // androidx.media3.common.util.RunnableFutureTask
                    public java.lang.Void doWork() throws java.io.IOException {
                        androidx.media3.exoplayer.offline.ProgressiveDownloader.this.cacheWriter.cache();
                        return null;
                    }

                    @Override // androidx.media3.common.util.RunnableFutureTask
                    protected void cancelWork() {
                        androidx.media3.exoplayer.offline.ProgressiveDownloader.this.cacheWriter.cancel();
                    }
                };
                androidx.media3.common.PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.proceed(-4000);
                }
                this.executor.execute(this.downloadRunnable);
                try {
                    this.downloadRunnable.get();
                    z = true;
                } catch (java.util.concurrent.ExecutionException e) {
                    java.lang.Throwable th = (java.lang.Throwable) androidx.media3.common.util.Assertions.checkNotNull(e.getCause());
                    if (!(th instanceof androidx.media3.common.PriorityTaskManager.PriorityTooLowException)) {
                        if (th instanceof java.io.IOException) {
                            throw ((java.io.IOException) th);
                        }
                        androidx.media3.common.util.Util.sneakyThrow(th);
                    }
                }
            } finally {
                ((androidx.media3.common.util.RunnableFutureTask) androidx.media3.common.util.Assertions.checkNotNull(this.downloadRunnable)).blockUntilFinished();
                androidx.media3.common.PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.remove(-4000);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        this.isCanceled = true;
        androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> runnableFutureTask = this.downloadRunnable;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void remove() {
        this.dataSource.getCache().removeResource(this.dataSource.getCacheKeyFactory().buildCacheKey(this.dataSpec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgress(long j, long j2, long j3) {
        androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener = this.progressListener;
        if (progressListener == null) {
            return;
        }
        progressListener.onProgress(j, j2, (j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j);
    }
}
