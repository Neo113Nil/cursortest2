package com.squareup.picasso;

/* loaded from: classes5.dex */
class Stats {
    private static final int BITMAP_DECODE_FINISHED = 2;
    private static final int BITMAP_TRANSFORMED_FINISHED = 3;
    private static final int CACHE_HIT = 0;
    private static final int CACHE_MISS = 1;
    private static final int DOWNLOAD_FINISHED = 4;
    private static final java.lang.String STATS_THREAD_NAME = "Picasso-Stats";
    long averageDownloadSize;
    long averageOriginalBitmapSize;
    long averageTransformedBitmapSize;
    final com.squareup.picasso.Cache cache;
    long cacheHits;
    long cacheMisses;
    int downloadCount;
    final android.os.Handler handler;
    int originalBitmapCount;
    final android.os.HandlerThread statsThread;
    long totalDownloadSize;
    long totalOriginalBitmapSize;
    long totalTransformedBitmapSize;
    int transformedBitmapCount;

    Stats(com.squareup.picasso.Cache cache) {
        this.cache = cache;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(STATS_THREAD_NAME, 10);
        this.statsThread = handlerThread;
        handlerThread.start();
        com.squareup.picasso.Utils.flushStackLocalLeaks(handlerThread.getLooper());
        this.handler = new com.squareup.picasso.Stats.StatsHandler(handlerThread.getLooper(), this);
    }

    void dispatchBitmapDecoded(android.graphics.Bitmap bitmap) {
        processBitmap(bitmap, 2);
    }

    void dispatchBitmapTransformed(android.graphics.Bitmap bitmap) {
        processBitmap(bitmap, 3);
    }

    void dispatchDownloadFinished(long j) {
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(4, java.lang.Long.valueOf(j)));
    }

    void dispatchCacheHit() {
        this.handler.sendEmptyMessage(0);
    }

    void dispatchCacheMiss() {
        this.handler.sendEmptyMessage(1);
    }

    void shutdown() {
        this.statsThread.quit();
    }

    void performCacheHit() {
        this.cacheHits++;
    }

    void performCacheMiss() {
        this.cacheMisses++;
    }

    void performDownloadFinished(java.lang.Long l) {
        this.downloadCount++;
        long longValue = this.totalDownloadSize + l.longValue();
        this.totalDownloadSize = longValue;
        this.averageDownloadSize = getAverage(this.downloadCount, longValue);
    }

    void performBitmapDecoded(long j) {
        int i = this.originalBitmapCount + 1;
        this.originalBitmapCount = i;
        long j2 = this.totalOriginalBitmapSize + j;
        this.totalOriginalBitmapSize = j2;
        this.averageOriginalBitmapSize = getAverage(i, j2);
    }

    void performBitmapTransformed(long j) {
        this.transformedBitmapCount++;
        long j2 = this.totalTransformedBitmapSize + j;
        this.totalTransformedBitmapSize = j2;
        this.averageTransformedBitmapSize = getAverage(this.originalBitmapCount, j2);
    }

    com.squareup.picasso.StatsSnapshot createSnapshot() {
        return new com.squareup.picasso.StatsSnapshot(this.cache.maxSize(), this.cache.size(), this.cacheHits, this.cacheMisses, this.totalDownloadSize, this.totalOriginalBitmapSize, this.totalTransformedBitmapSize, this.averageDownloadSize, this.averageOriginalBitmapSize, this.averageTransformedBitmapSize, this.downloadCount, this.originalBitmapCount, this.transformedBitmapCount, java.lang.System.currentTimeMillis());
    }

    private void processBitmap(android.graphics.Bitmap bitmap, int i) {
        int bitmapBytes = com.squareup.picasso.Utils.getBitmapBytes(bitmap);
        android.os.Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(i, bitmapBytes, 0));
    }

    private static long getAverage(int i, long j) {
        return j / i;
    }

    private static class StatsHandler extends android.os.Handler {
        private final com.squareup.picasso.Stats stats;

        StatsHandler(android.os.Looper looper, com.squareup.picasso.Stats stats) {
            super(looper);
            this.stats = stats;
        }

        @Override // android.os.Handler
        public void handleMessage(final android.os.Message message) {
            int i = message.what;
            if (i == 0) {
                this.stats.performCacheHit();
                return;
            }
            if (i == 1) {
                this.stats.performCacheMiss();
                return;
            }
            if (i == 2) {
                this.stats.performBitmapDecoded(message.arg1);
                return;
            }
            if (i == 3) {
                this.stats.performBitmapTransformed(message.arg1);
            } else if (i == 4) {
                this.stats.performDownloadFinished((java.lang.Long) message.obj);
            } else {
                com.squareup.picasso.Picasso.HANDLER.post(new java.lang.Runnable() { // from class: com.squareup.picasso.Stats.StatsHandler.1
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new java.lang.AssertionError("Unhandled stats message." + message.what);
                    }
                });
            }
        }
    }
}
