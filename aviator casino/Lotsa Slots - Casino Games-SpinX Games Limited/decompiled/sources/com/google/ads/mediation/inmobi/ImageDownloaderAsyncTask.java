package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
class ImageDownloaderAsyncTask extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.util.HashMap<java.lang.String, android.graphics.drawable.Drawable>> {
    static final java.lang.String KEY_ICON = "icon_key";
    static final java.lang.String KEY_IMAGE = "image_key";
    private final long drawableFutureTimeoutSeconds;
    private final com.google.ads.mediation.inmobi.ImageDownloaderAsyncTask.DrawableDownloadListener listener;
    final com.google.ads.mediation.inmobi.InMobiMemoryCache memoryCache;

    interface DrawableDownloadListener {
        void onDownloadFailure();

        void onDownloadSuccess(java.util.HashMap<java.lang.String, android.graphics.drawable.Drawable> hashMap);
    }

    public ImageDownloaderAsyncTask(com.google.ads.mediation.inmobi.ImageDownloaderAsyncTask.DrawableDownloadListener drawableDownloadListener) {
        this.memoryCache = new com.google.ads.mediation.inmobi.InMobiMemoryCache();
        this.listener = drawableDownloadListener;
        this.drawableFutureTimeoutSeconds = 10L;
    }

    ImageDownloaderAsyncTask(com.google.ads.mediation.inmobi.ImageDownloaderAsyncTask.DrawableDownloadListener drawableDownloadListener, java.lang.Long l) {
        this.memoryCache = new com.google.ads.mediation.inmobi.InMobiMemoryCache();
        this.listener = drawableDownloadListener;
        this.drawableFutureTimeoutSeconds = l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public java.util.HashMap<java.lang.String, android.graphics.drawable.Drawable> doInBackground(java.lang.Object... objArr) {
        android.graphics.drawable.Drawable drawable;
        java.util.HashMap hashMap = (java.util.HashMap) objArr[0];
        java.util.concurrent.ExecutorService newCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool();
        try {
            if (this.memoryCache.get(java.lang.String.valueOf(hashMap.get(KEY_ICON))) != null) {
                drawable = this.memoryCache.get(java.lang.String.valueOf(hashMap.get(KEY_ICON)));
            } else {
                android.graphics.drawable.Drawable drawable2 = getDrawableFuture((java.net.URL) hashMap.get(KEY_ICON), newCachedThreadPool).get(this.drawableFutureTimeoutSeconds, java.util.concurrent.TimeUnit.SECONDS);
                this.memoryCache.put(java.lang.String.valueOf(hashMap.get(KEY_ICON)), drawable2);
                drawable = drawable2;
            }
            java.util.HashMap<java.lang.String, android.graphics.drawable.Drawable> hashMap2 = new java.util.HashMap<>();
            hashMap2.put(KEY_ICON, drawable);
            return hashMap2;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            e.printStackTrace();
            return null;
        }
    }

    private java.util.concurrent.Future<android.graphics.drawable.Drawable> getDrawableFuture(final java.net.URL url, java.util.concurrent.ExecutorService executorService) {
        return executorService.submit(new java.util.concurrent.Callable<android.graphics.drawable.Drawable>() { // from class: com.google.ads.mediation.inmobi.ImageDownloaderAsyncTask.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public android.graphics.drawable.Drawable call() throws java.lang.Exception {
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(url.openStream());
                decodeStream.setDensity(160);
                return new android.graphics.drawable.BitmapDrawable(android.content.res.Resources.getSystem(), decodeStream);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(java.util.HashMap<java.lang.String, android.graphics.drawable.Drawable> hashMap) {
        super.onPostExecute((com.google.ads.mediation.inmobi.ImageDownloaderAsyncTask) hashMap);
        if (hashMap != null) {
            this.listener.onDownloadSuccess(hashMap);
        } else {
            this.listener.onDownloadFailure();
        }
    }
}
