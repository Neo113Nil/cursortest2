package com.vungle.ads.internal.downloader;

/* compiled from: AssetDownloader.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J$\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\"\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0002J\u001c\u0010$\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u0010%\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u001a\u0010&\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\"\u0010'\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u0010*\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader;", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloadExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;Lcom/vungle/ads/internal/util/PathProvider;)V", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "Lkotlin/Lazy;", "transitioning", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "cancel", "", "request", "cancelAll", "checkSpaceAvailable", "", "downloadRequest", "decodeGzipIfNeeded", "Lokhttp3/ResponseBody;", "networkResponse", "Lokhttp3/Response;", "deliverError", "downloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "downloadError", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "deliverSuccess", "file", "Ljava/io/File;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, com.vungle.ads.internal.presenter.NativeAdPresenter.DOWNLOAD, "launchRequest", "launchRequestWithRetry", "onProgressChanged", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "shouldRetryDownload", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "OkHttpSingleton", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AssetDownloader implements com.vungle.ads.internal.downloader.Downloader {
    private static final java.lang.String CONTENT_ENCODING = "Content-Encoding";
    private static final java.lang.String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 8192;
    private static final long DOWNLOAD_RETRY_FAILURE = 2;
    private static final long DOWNLOAD_RETRY_SUCCESS = 1;
    private static final java.lang.String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;
    private static final java.lang.String TAG = "AssetDownloader";
    private final com.vungle.ads.internal.executor.VungleThreadPoolExecutor downloadExecutor;

    /* renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy okHttpClient;
    private final com.vungle.ads.internal.util.PathProvider pathProvider;
    private final java.util.concurrent.CopyOnWriteArrayList<com.vungle.ads.internal.downloader.DownloadRequest> transitioning;

    public AssetDownloader(com.vungle.ads.internal.executor.VungleThreadPoolExecutor downloadExecutor, com.vungle.ads.internal.util.PathProvider pathProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<okhttp3.OkHttpClient>() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$okHttpClient$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final okhttp3.OkHttpClient invoke() {
                com.vungle.ads.internal.util.PathProvider pathProvider2;
                com.vungle.ads.internal.downloader.AssetDownloader.OkHttpSingleton okHttpSingleton = com.vungle.ads.internal.downloader.AssetDownloader.OkHttpSingleton.INSTANCE;
                pathProvider2 = com.vungle.ads.internal.downloader.AssetDownloader.this.pathProvider;
                return okHttpSingleton.createOkHttpClient(pathProvider2);
            }
        });
        this.transitioning = new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    private final okhttp3.OkHttpClient getOkHttpClient() {
        return (okhttp3.OkHttpClient) this.okHttpClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AssetDownloader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader$OkHttpSingleton;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "createOkHttpClient", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class OkHttpSingleton {
        public static final com.vungle.ads.internal.downloader.AssetDownloader.OkHttpSingleton INSTANCE = new com.vungle.ads.internal.downloader.AssetDownloader.OkHttpSingleton();
        private static okhttp3.OkHttpClient client;

        private OkHttpSingleton() {
        }

        public final okhttp3.OkHttpClient createOkHttpClient(com.vungle.ads.internal.util.PathProvider pathProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
            okhttp3.OkHttpClient okHttpClient = client;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            okhttp3.OkHttpClient.Builder followSslRedirects = new okhttp3.OkHttpClient.Builder().readTimeout(60L, java.util.concurrent.TimeUnit.SECONDS).connectTimeout(60L, java.util.concurrent.TimeUnit.SECONDS).cache(null).followRedirects(true).followSslRedirects(true);
            long cleverCacheDiskSize = com.vungle.ads.internal.ConfigManager.INSTANCE.getCleverCacheDiskSize();
            int cleverCacheDiskPercentage = com.vungle.ads.internal.ConfigManager.INSTANCE.getCleverCacheDiskPercentage();
            java.lang.String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
            long min = java.lang.Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * cleverCacheDiskPercentage) / 100);
            if (min > 0) {
                followSslRedirects.cache(new okhttp3.Cache(pathProvider.getCleverCacheDir(), min));
            } else {
                com.vungle.ads.internal.util.Logger.INSTANCE.w(com.vungle.ads.internal.downloader.AssetDownloader.TAG, "cache disk capacity size <=0, no clever cache active.");
            }
            okhttp3.OkHttpClient build = followSslRedirects.build();
            client = build;
            return build;
        }
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(final com.vungle.ads.internal.downloader.DownloadRequest downloadRequest, final com.vungle.ads.internal.downloader.AssetDownloadListener downloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new com.vungle.ads.internal.task.PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$download$1
            @Override // java.lang.Runnable
            public void run() {
                com.vungle.ads.internal.downloader.AssetDownloader.this.launchRequestWithRetry(downloadRequest, downloadListener);
            }

            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }
        }, new java.lang.Runnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.downloader.AssetDownloader.m10424download$lambda0(com.vungle.ads.internal.downloader.DownloadRequest.this, this, downloadListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: download$lambda-0, reason: not valid java name */
    public static final void m10424download$lambda0(com.vungle.ads.internal.downloader.DownloadRequest downloadRequest, com.vungle.ads.internal.downloader.AssetDownloader this$0, com.vungle.ads.internal.downloader.AssetDownloadListener assetDownloadListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deliverError(downloadRequest, assetDownloadListener, new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(-1, new com.vungle.ads.OutOfMemory("Failed to execute download request: " + downloadRequest.getAsset().getServerPath()), com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
    }

    private final void deliverError(com.vungle.ads.internal.downloader.DownloadRequest downloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener downloadListener, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError downloadError) {
        if (downloadListener != null) {
            downloadListener.onError(downloadError, downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchRequestWithRetry(com.vungle.ads.internal.downloader.DownloadRequest downloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener downloadListener) {
        if (downloadListener != null) {
            downloadListener.onStart(downloadRequest);
        }
        com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError launchRequest = launchRequest(downloadRequest, downloadListener);
        while (launchRequest != null && shouldRetryDownload(downloadRequest, launchRequest)) {
            downloadRequest.incrementRetryAttempt$vungle_ads_release();
            downloadRequest.recordRetryReason$vungle_ads_release("Error: " + launchRequest.getCause().getMessage() + ", Code: " + launchRequest.getServerCode() + ", Reason: " + launchRequest.getReason());
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "Download failed, retrying immediately. Attempt " + downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + kotlinx.io.files.FileSystemKt.UnixPathSeparator + downloadRequest.getMaxRetries() + ". URL: " + downloadRequest.getAsset().getServerPath() + ", Error: " + launchRequest.getCause().getMessage());
            launchRequest = launchRequest(downloadRequest, downloadListener);
        }
        if (launchRequest != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download failed after " + (downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + 1) + " attempts. URL: " + downloadRequest.getAsset().getServerPath() + ". Retry history: " + downloadRequest.getRetryReasons$vungle_ads_release());
            if (downloadRequest.getCurrentRetryAttempt$vungle_ads_release() > 0) {
                com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 2L, downloadRequest.getLogEntry(), "retryCount=" + downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + " url=" + downloadRequest.getAsset().getServerPath());
            }
            deliverError(downloadRequest, downloadListener, launchRequest);
        }
    }

    private final boolean shouldRetryDownload(com.vungle.ads.internal.downloader.DownloadRequest downloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError downloadError) {
        if (downloadRequest.isCancelled()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Download cancelled, not retrying");
            return false;
        }
        java.lang.Integer percentage = downloadRequest.getAsset().getPercentage();
        if (percentage != null && percentage.intValue() < 100) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Partial download asset (percentage=" + percentage + "), not retrying");
            return false;
        }
        if (!downloadRequest.canRetry$vungle_ads_release()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Max retry attempts reached (" + downloadRequest.getMaxRetries() + ')');
            return false;
        }
        if (com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.INSTANCE.shouldRetry(downloadError)) {
            return true;
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Error reason " + downloadError.getReason() + " is not retryable");
        return false;
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(com.vungle.ads.internal.downloader.DownloadRequest request) {
        if (request == null || request.isCancelled()) {
            return;
        }
        request.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        java.util.Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((com.vungle.ads.internal.downloader.DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x02b1, code lost:
    
        r6.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0621  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError launchRequest(com.vungle.ads.internal.downloader.DownloadRequest downloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener downloadListener) {
        okhttp3.ResponseBody responseBody;
        okhttp3.Call call;
        com.vungle.ads.internal.downloader.AssetDownloader assetDownloader;
        java.io.File file;
        okio.BufferedSink bufferedSink;
        okhttp3.Response response;
        okio.BufferedSource bufferedSource;
        okhttp3.ResponseBody body;
        com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError downloadError;
        int status;
        okio.BufferedSink bufferedSink2;
        okhttp3.ResponseBody body2;
        java.lang.String header$default;
        okio.BufferedSource delegateSource;
        okhttp3.Response response2;
        long j;
        java.lang.String str;
        okhttp3.Call call2;
        long read;
        okhttp3.Response response3;
        okhttp3.ResponseBody body3;
        java.lang.String str2 = "download status: ";
        com.vungle.ads.internal.model.AdAsset asset = downloadRequest.getAsset();
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "launch request in thread: " + java.lang.Thread.currentThread().getId() + " request: " + asset.getServerPath());
        if (downloadRequest.isCancelled()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Request " + asset.getServerPath() + " is cancelled before starting");
            new com.vungle.ads.internal.downloader.AssetDownloadListener.Progress().setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
            return null;
        }
        com.vungle.ads.internal.downloader.AssetDownloadListener.Progress progress = new com.vungle.ads.internal.downloader.AssetDownloadListener.Progress();
        progress.setTimestampDownloadStart(java.lang.System.currentTimeMillis());
        java.lang.String serverPath = asset.getServerPath();
        java.lang.String localPath = asset.getLocalPath();
        int i = -1;
        if (serverPath.length() == 0 || !com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(serverPath)) {
            return new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(-1, new com.vungle.ads.InvalidAssetUrlError("invalid url: " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR());
        }
        if (localPath.length() == 0) {
            return new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(-1, new com.vungle.ads.AssetWriteError("invalid path: " + localPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getFILE_NOT_FOUND_ERROR());
        }
        if (!checkSpaceAvailable(downloadRequest)) {
            return new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(-1, new com.vungle.ads.NoSpaceError(null, 1, null).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getDISK_ERROR());
        }
        java.io.File file2 = new java.io.File(localPath);
        if (file2.exists()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Deleting existing file before download: " + file2.getAbsolutePath());
            if (!file2.delete()) {
                return new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(-1, new com.vungle.ads.AssetWriteError("Cannot delete partial file for restart").setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getDISK_ERROR());
            }
        }
        try {
            java.io.File parentFile = file2.getParentFile();
            if (parentFile != null) {
                try {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                } catch (java.lang.Exception e) {
                    e = e;
                    assetDownloader = this;
                    call = null;
                    response = null;
                    bufferedSink2 = null;
                    bufferedSource = null;
                    file = file2;
                    try {
                        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                        progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                        downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                        if ((response != null ? response.body() : null) != null) {
                        }
                        if (call != null) {
                        }
                        com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                        com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                        status = progress.getStatus();
                        if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                        }
                        return downloadError;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        responseBody = null;
                        bufferedSink = bufferedSink2;
                        if ((response != null ? response.body() : responseBody) != null) {
                        }
                        if (call != null) {
                        }
                        com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink);
                        com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    responseBody = null;
                    call = null;
                    bufferedSink = null;
                    response = null;
                    bufferedSource = null;
                    if ((response != null ? response.body() : responseBody) != null) {
                    }
                    if (call != null) {
                    }
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink);
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                    throw th;
                }
            }
            call = getOkHttpClient().newCall(new okhttp3.Request.Builder().url(serverPath).build());
            try {
                response = call.execute();
                try {
                    try {
                        i = response.code();
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        assetDownloader = this;
                        file = file2;
                    }
                    try {
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        assetDownloader = this;
                        file = file2;
                        bufferedSink2 = null;
                        bufferedSource = null;
                        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                        progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                        downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                        if ((response != null ? response.body() : null) != null) {
                        }
                        if (call != null) {
                        }
                        com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                        com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                        status = progress.getStatus();
                        if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                        }
                        return downloadError;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            } catch (java.lang.Exception e4) {
                e = e4;
                assetDownloader = this;
                file = file2;
                response = null;
                bufferedSink2 = null;
                bufferedSource = null;
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                if ((response != null ? response.body() : null) != null) {
                }
                if (call != null) {
                }
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                status = progress.getStatus();
                if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                }
                return downloadError;
            } catch (java.lang.Throwable th4) {
                th = th4;
                responseBody = null;
                bufferedSink = null;
                response = null;
                bufferedSource = null;
                if ((response != null ? response.body() : responseBody) != null) {
                }
                if (call != null) {
                }
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink);
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                throw th;
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            assetDownloader = this;
            file = file2;
            call = null;
        } catch (java.lang.Throwable th5) {
            th = th5;
            responseBody = null;
            call = null;
        }
        if (!response.isSuccessful()) {
            assetDownloader = this;
            file = file2;
            try {
                throw new com.vungle.ads.internal.downloader.Downloader.RequestException(response.message());
            } catch (java.lang.Exception e6) {
                e = e6;
                i = i;
                response = response;
                call = call;
                bufferedSink2 = null;
                bufferedSource = null;
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                if ((response != null ? response.body() : null) != null) {
                }
                if (call != null) {
                }
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                status = progress.getStatus();
                if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                }
                return downloadError;
            } catch (java.lang.Throwable th6) {
                th = th6;
                response = response;
                call = call;
                responseBody = null;
                bufferedSink = null;
                bufferedSource = null;
                if ((response != null ? response.body() : responseBody) != null) {
                }
                if (call != null) {
                }
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink);
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                throw th;
            }
        }
        if (response.cacheResponse() != null) {
            try {
                try {
                    com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), downloadRequest.getLogEntry(), serverPath);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } catch (java.lang.Exception e7) {
                    e = e7;
                    assetDownloader = this;
                    file = file2;
                    bufferedSink2 = null;
                    bufferedSource = null;
                    com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                    progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                    downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                    if ((response != null ? response.body() : null) != null) {
                    }
                    if (call != null) {
                    }
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                    status = progress.getStatus();
                    if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                    }
                    return downloadError;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                responseBody = null;
                bufferedSink = null;
                bufferedSource = null;
                if ((response != null ? response.body() : responseBody) != null) {
                    body.close();
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                }
                if (call != null) {
                }
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink);
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                throw th;
            }
        }
        okhttp3.ResponseBody decodeGzipIfNeeded = decodeGzipIfNeeded(response);
        try {
            header$default = okhttp3.Response.header$default(response, "Content-Type", null, 2, null);
            if (header$default != null) {
                try {
                    downloadRequest.getAsset().setMimeType(header$default);
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                } catch (java.lang.Exception e8) {
                    e = e8;
                    assetDownloader = this;
                    file = file2;
                    i = i;
                    bufferedSink2 = null;
                    bufferedSource = null;
                    com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                    progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                    downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                    if ((response != null ? response.body() : null) != null && (body2 = response.body()) != null) {
                        body2.close();
                        kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                    }
                    if (call != null) {
                        call.cancel();
                        kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                    }
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                    status = progress.getStatus();
                    if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                        if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                        }
                    }
                    return downloadError;
                }
            }
            delegateSource = decodeGzipIfNeeded != null ? decodeGzipIfNeeded.getDelegateSource() : null;
            try {
            } catch (java.lang.Exception e9) {
                e = e9;
                assetDownloader = this;
                file = file2;
                bufferedSource = delegateSource;
            } catch (java.lang.Throwable th8) {
                th = th8;
                bufferedSource = delegateSource;
            }
        } catch (java.lang.Exception e10) {
            e = e10;
            assetDownloader = this;
            file = file2;
        }
        try {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Start download from url: " + serverPath + " mimeType=" + header$default);
            okio.BufferedSink buffer = okio.Okio.buffer(okio.Okio__JvmOkioKt.sink$default(file2, false, 1, null));
            if (decodeGzipIfNeeded != null) {
                try {
                    long contentLength = decodeGzipIfNeeded.getContentLength();
                    response2 = response;
                    j = contentLength;
                } catch (java.lang.Exception e11) {
                    e = e11;
                    assetDownloader = this;
                    bufferedSink2 = buffer;
                    file = file2;
                    bufferedSource = delegateSource;
                    i = i;
                    str2 = "download status: ";
                    com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                    progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                    downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                    if ((response != null ? response.body() : null) != null) {
                    }
                    if (call != null) {
                    }
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                    status = progress.getStatus();
                    if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                    }
                    return downloadError;
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    bufferedSource = delegateSource;
                    responseBody = null;
                    bufferedSink = buffer;
                    str2 = "download status: ";
                    if ((response != null ? response.body() : responseBody) != null) {
                    }
                    if (call != null) {
                    }
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink);
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                    throw th;
                }
            } else {
                response2 = response;
                j = 0;
            }
            try {
                progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED());
                progress.setSizeBytes(j);
                progress.setReadBytes(0L);
                progress.setProgressPercent(0);
                asset.setContentLength(j);
                assetDownloader = this;
            } catch (java.lang.Exception e12) {
                e = e12;
                assetDownloader = this;
            } catch (java.lang.Throwable th10) {
                th = th10;
            }
            try {
                assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                long j2 = 0;
                int i2 = 0;
                while (true) {
                    if (delegateSource != null) {
                        try {
                            str = serverPath;
                            call2 = call;
                            try {
                                read = delegateSource.read(buffer.getBuffer(), android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                            } catch (java.lang.Exception e13) {
                                e = e13;
                                bufferedSink2 = buffer;
                                response = response2;
                                file = file2;
                                bufferedSource = delegateSource;
                                i = i;
                                str2 = "download status: ";
                                call = call2;
                                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                if ((response != null ? response.body() : null) != null) {
                                }
                                if (call != null) {
                                }
                                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                                status = progress.getStatus();
                                if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                                }
                                return downloadError;
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                response = response2;
                                bufferedSource = delegateSource;
                                call = call2;
                                responseBody = null;
                                bufferedSink = buffer;
                                str2 = "download status: ";
                                if ((response != null ? response.body() : responseBody) != null) {
                                }
                                if (call != null) {
                                }
                                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink);
                                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                                throw th;
                            }
                        } catch (java.lang.Exception e14) {
                            e = e14;
                            bufferedSink2 = buffer;
                            response = response2;
                            file = file2;
                            bufferedSource = delegateSource;
                            i = i;
                            str2 = "download status: ";
                            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                            progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                            downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                            if ((response != null ? response.body() : null) != null) {
                            }
                            if (call != null) {
                            }
                            com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                            com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                            status = progress.getStatus();
                            if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                            }
                            return downloadError;
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                            response = response2;
                            bufferedSource = delegateSource;
                            responseBody = null;
                            bufferedSink = buffer;
                            str2 = "download status: ";
                            if ((response != null ? response.body() : responseBody) != null) {
                            }
                            if (call != null) {
                            }
                            com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink);
                            com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                            throw th;
                        }
                    } else {
                        str = serverPath;
                        call2 = call;
                        read = -1;
                    }
                    try {
                        try {
                            kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                            if (read <= 0) {
                                break;
                            }
                            try {
                                if (!file2.exists()) {
                                    new com.vungle.ads.AssetWriteError("Asset save error " + str).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                    throw new com.vungle.ads.internal.downloader.Downloader.RequestException("File is not existing");
                                }
                                if (downloadRequest.isCancelled()) {
                                    break;
                                }
                                progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                                buffer.emit();
                                buffer.flush();
                                long j3 = j2 + read;
                                progress.setReadBytes(j3);
                                java.lang.Long rangeEnd = asset.getRangeEnd();
                                file = file2;
                                bufferedSource = delegateSource;
                                long longValue = rangeEnd != null ? rangeEnd.longValue() : asset.getRangeStart();
                                try {
                                    if (!asset.isWaitingForDownload() || j3 < longValue) {
                                        bufferedSink2 = buffer;
                                        response3 = response2;
                                    } else {
                                        com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
                                        response3 = response2;
                                        try {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            bufferedSink2 = buffer;
                                            try {
                                                try {
                                                    sb.append("Downloader totalRead=");
                                                    sb.append(j3);
                                                    sb.append(" requiredBytes=");
                                                    sb.append(longValue);
                                                    companion.e(TAG, sb.toString());
                                                    asset.notifyDownloadEnough();
                                                } catch (java.lang.Exception e15) {
                                                    e = e15;
                                                    i = i;
                                                    str2 = "download status: ";
                                                    response = response3;
                                                    call = call2;
                                                    com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                    progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                                    downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                    if ((response != null ? response.body() : null) != null) {
                                                        body2.close();
                                                        kotlin.Unit unit62 = kotlin.Unit.INSTANCE;
                                                    }
                                                    if (call != null) {
                                                    }
                                                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                                                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                                                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                                                    status = progress.getStatus();
                                                    if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                                                    }
                                                    return downloadError;
                                                }
                                            } catch (java.lang.Throwable th13) {
                                                th = th13;
                                                str2 = "download status: ";
                                                response = response3;
                                                bufferedSink = bufferedSink2;
                                                call = call2;
                                                responseBody = null;
                                                if ((response != null ? response.body() : responseBody) != null && (body = response.body()) != null) {
                                                    body.close();
                                                    kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                                                }
                                                if (call != null) {
                                                    call.cancel();
                                                    kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                                                }
                                                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink);
                                                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                                                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                                                throw th;
                                            }
                                        } catch (java.lang.Exception e16) {
                                            e = e16;
                                            bufferedSink2 = buffer;
                                        } catch (java.lang.Throwable th14) {
                                            th = th14;
                                            bufferedSink2 = buffer;
                                        }
                                    }
                                    int i3 = j > 0 ? (int) ((100 * j3) / j) : i2;
                                    while (progress.getProgressPercent() + 1 <= java.lang.Math.min(i3, 100)) {
                                        progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                                        progress.setProgressPercent(progress.getProgressPercent() + 1);
                                        if (progress.getProgressPercent() >= 100) {
                                            progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getDONE());
                                        }
                                        assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                                    }
                                    i2 = i3;
                                    response2 = response3;
                                    buffer = bufferedSink2;
                                    file2 = file;
                                    delegateSource = bufferedSource;
                                    j2 = j3;
                                    call = call2;
                                    serverPath = str;
                                } catch (java.lang.Exception e17) {
                                    e = e17;
                                    bufferedSink2 = buffer;
                                    response3 = response2;
                                } catch (java.lang.Throwable th15) {
                                    th = th15;
                                    bufferedSink2 = buffer;
                                    response3 = response2;
                                }
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                bufferedSink2 = buffer;
                                response3 = response2;
                                file = file2;
                                bufferedSource = delegateSource;
                            }
                        } catch (java.lang.Throwable th16) {
                            th = th16;
                            bufferedSink2 = buffer;
                            response3 = response2;
                            bufferedSource = delegateSource;
                        }
                    } catch (java.lang.Exception e19) {
                        e = e19;
                        bufferedSink2 = buffer;
                        response3 = response2;
                        file = file2;
                        bufferedSource = delegateSource;
                    }
                }
                bufferedSink2 = buffer;
                response3 = response2;
                file = file2;
                bufferedSource = delegateSource;
                try {
                    bufferedSink2.flush();
                    if (progress.getStatus() == com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS()) {
                        progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getDONE());
                        assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                    }
                    if ((response3 != null ? response3.body() : null) != null && (body3 = response3.body()) != null) {
                        body3.close();
                        kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                    }
                    if (call2 != null) {
                        call2.cancel();
                        kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                    }
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "download status: " + progress.getStatus());
                    downloadError = null;
                } catch (java.lang.Exception e20) {
                    e = e20;
                    str2 = "download status: ";
                    i = i;
                    response = response3;
                    call = call2;
                    com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                    progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                    downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                    if ((response != null ? response.body() : null) != null) {
                    }
                    if (call != null) {
                    }
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                    com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                    status = progress.getStatus();
                    if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                    }
                    return downloadError;
                }
            } catch (java.lang.Exception e21) {
                e = e21;
                bufferedSink2 = buffer;
                file = file2;
                bufferedSource = delegateSource;
                str2 = "download status: ";
                i = i;
                response = response2;
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                if ((response != null ? response.body() : null) != null) {
                }
                if (call != null) {
                }
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                status = progress.getStatus();
                if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                }
                return downloadError;
            } catch (java.lang.Throwable th17) {
                th = th17;
                bufferedSource = delegateSource;
                str2 = "download status: ";
                response = response2;
                bufferedSink = buffer;
                responseBody = null;
                if ((response != null ? response.body() : responseBody) != null) {
                }
                if (call != null) {
                }
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink);
                com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
                throw th;
            }
        } catch (java.lang.Exception e22) {
            e = e22;
            assetDownloader = this;
            file = file2;
            bufferedSource = delegateSource;
            str2 = "download status: ";
            i = i;
            bufferedSink2 = null;
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
            progress.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
            downloadError = new com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError(i, e, com.vungle.ads.internal.downloader.AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
            if ((response != null ? response.body() : null) != null) {
            }
            if (call != null) {
            }
            com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink2);
            com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
            status = progress.getStatus();
            if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
            }
            return downloadError;
        } catch (java.lang.Throwable th18) {
            th = th18;
            bufferedSource = delegateSource;
            str2 = "download status: ";
            responseBody = null;
            bufferedSink = null;
            if ((response != null ? response.body() : responseBody) != null) {
            }
            if (call != null) {
            }
            com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSink);
            com.vungle.ads.internal.util.FileUtility.INSTANCE.closeQuietly(bufferedSource);
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, str2 + progress.getStatus());
            throw th;
        }
        status = progress.getStatus();
        if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR() && status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED()) {
            if (status != com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "On cancel " + downloadRequest);
                assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                return null;
            }
            assetDownloader.deliverSuccess(file, downloadRequest, downloadListener);
            int currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
            if (currentRetryAttempt$vungle_ads_release > 0) {
                com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
            }
            downloadError = null;
        }
        return downloadError;
    }

    private final okhttp3.ResponseBody decodeGzipIfNeeded(okhttp3.Response networkResponse) {
        okhttp3.ResponseBody body = networkResponse.body();
        if (!kotlin.text.StringsKt.equals(GZIP, okhttp3.Response.header$default(networkResponse, "Content-Encoding", null, 2, null), true) || body == null) {
            return body;
        }
        return new okhttp3.internal.http.RealResponseBody(okhttp3.Response.header$default(networkResponse, "Content-Type", null, 2, null), -1L, okio.Okio.buffer(new okio.GzipSource(body.getDelegateSource())));
    }

    private final void deliverSuccess(java.io.File file, com.vungle.ads.internal.downloader.DownloadRequest downloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener listener) {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "On success " + downloadRequest);
        if (listener != null) {
            listener.onSuccess(file, downloadRequest);
        }
    }

    private final void onProgressChanged(com.vungle.ads.internal.downloader.DownloadRequest downloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener.Progress progress, com.vungle.ads.internal.downloader.AssetDownloadListener downloadListener) {
        if (downloadListener != null) {
            downloadListener.onProgress(progress, downloadRequest);
        }
    }

    private final boolean checkSpaceAvailable(com.vungle.ads.internal.downloader.DownloadRequest downloadRequest) {
        com.vungle.ads.internal.util.PathProvider pathProvider = this.pathProvider;
        java.lang.String absolutePath = pathProvider.getVungleDir().getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = pathProvider.getAvailableBytes(absolutePath);
        if (availableBytes >= com.unity3d.services.core.di.ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            return true;
        }
        new com.vungle.ads.NoSpaceError("Insufficient space " + availableBytes).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }
}
