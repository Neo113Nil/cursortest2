package com.google.android.exoplayer2.offline;

/* loaded from: classes3.dex */
public final class ProgressiveDownloader implements com.google.android.exoplayer2.offline.Downloader {
    private final com.google.android.exoplayer2.upstream.cache.CacheWriter cacheWriter;
    private final com.google.android.exoplayer2.upstream.cache.CacheDataSource dataSource;
    private final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private volatile com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException> downloadRunnable;
    private final java.util.concurrent.Executor executor;
    private volatile boolean isCanceled;
    private final com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager;
    private com.google.android.exoplayer2.offline.Downloader.ProgressListener progressListener;

    public ProgressiveDownloader(com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory factory) {
        this(mediaItem, factory, new androidx.media3.exoplayer.offline.DefaultDownloaderFactory$$ExternalSyntheticLambda0());
    }

    public ProgressiveDownloader(com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.upstream.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor) {
        this.executor = (java.util.concurrent.Executor) com.google.android.exoplayer2.util.Assertions.checkNotNull(executor);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        com.google.android.exoplayer2.upstream.DataSpec build = new com.google.android.exoplayer2.upstream.DataSpec.Builder().setUri(mediaItem.localConfiguration.uri).setKey(mediaItem.localConfiguration.customCacheKey).setFlags(4).build();
        this.dataSpec = build;
        com.google.android.exoplayer2.upstream.cache.CacheDataSource createDataSourceForDownloading = factory.createDataSourceForDownloading();
        this.dataSource = createDataSourceForDownloading;
        this.cacheWriter = new com.google.android.exoplayer2.upstream.cache.CacheWriter(createDataSourceForDownloading, build, null, new com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener() { // from class: com.google.android.exoplayer2.offline.ProgressiveDownloader$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
            public final void onProgress(long j, long j2, long j3) {
                com.google.android.exoplayer2.offline.ProgressiveDownloader.this.onProgress(j, j2, j3);
            }
        });
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void download(com.google.android.exoplayer2.offline.Downloader.ProgressListener progressListener) throws java.io.IOException, java.lang.InterruptedException {
        this.progressListener = progressListener;
        com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-1000);
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.isCanceled) {
                    break;
                }
                this.downloadRunnable = new com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException>() { // from class: com.google.android.exoplayer2.offline.ProgressiveDownloader.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.android.exoplayer2.util.RunnableFutureTask
                    public java.lang.Void doWork() throws java.io.IOException {
                        com.google.android.exoplayer2.offline.ProgressiveDownloader.this.cacheWriter.cache();
                        return null;
                    }

                    @Override // com.google.android.exoplayer2.util.RunnableFutureTask
                    protected void cancelWork() {
                        com.google.android.exoplayer2.offline.ProgressiveDownloader.this.cacheWriter.cancel();
                    }
                };
                com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.proceed(-1000);
                }
                this.executor.execute(this.downloadRunnable);
                try {
                    this.downloadRunnable.get();
                    z = true;
                } catch (java.util.concurrent.ExecutionException e) {
                    java.lang.Throwable th = (java.lang.Throwable) com.google.android.exoplayer2.util.Assertions.checkNotNull(e.getCause());
                    if (!(th instanceof com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException)) {
                        if (th instanceof java.io.IOException) {
                            throw ((java.io.IOException) th);
                        }
                        com.google.android.exoplayer2.util.Util.sneakyThrow(th);
                    }
                }
            } finally {
                ((com.google.android.exoplayer2.util.RunnableFutureTask) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.downloadRunnable)).blockUntilFinished();
                com.google.android.exoplayer2.util.PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.remove(-1000);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
        this.isCanceled = true;
        com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException> runnableFutureTask = this.downloadRunnable;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void remove() {
        this.dataSource.getCache().removeResource(this.dataSource.getCacheKeyFactory().buildCacheKey(this.dataSpec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgress(long j, long j2, long j3) {
        com.google.android.exoplayer2.offline.Downloader.ProgressListener progressListener = this.progressListener;
        if (progressListener == null) {
            return;
        }
        progressListener.onProgress(j, j2, (j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j);
    }
}
