package com.facebook.internal;

/* compiled from: ImageDownloader.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004-./0B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J \u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J(\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\"H\u0007J2\u0010#\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u000e\u0010$\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\u0012H\u0002J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010+\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/facebook/internal/ImageDownloader;", "", "()V", "CACHE_READ_QUEUE_MAX_CONCURRENT", "", "DOWNLOAD_QUEUE_MAX_CONCURRENT", "cacheReadQueue", "Lcom/facebook/internal/WorkQueue;", "downloadQueue", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "pendingRequests", "", "Lcom/facebook/internal/ImageDownloader$RequestKey;", "Lcom/facebook/internal/ImageDownloader$DownloaderContext;", "cancelRequest", "", "request", "Lcom/facebook/internal/ImageRequest;", "clearCache", "", com.vungle.ads.internal.presenter.NativeAdPresenter.DOWNLOAD, com.ironsource.X3.i.W, "downloadAsync", "enqueueCacheRead", "allowCachedRedirects", "enqueueDownload", "enqueueRequest", "workQueue", "workItem", "Ljava/lang/Runnable;", "getPendingRequests", "", "issueResponse", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "bitmap", "Landroid/graphics/Bitmap;", "isCachedRedirect", "prioritizeRequest", "readFromCache", "removePendingRequest", "CacheReadWorkItem", "DownloadImageWorkItem", "DownloaderContext", "RequestKey", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageDownloader {
    private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
    private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;
    private static android.os.Handler handler;
    public static final com.facebook.internal.ImageDownloader INSTANCE = new com.facebook.internal.ImageDownloader();
    private static final com.facebook.internal.WorkQueue downloadQueue = new com.facebook.internal.WorkQueue(8, null, 2, null);
    private static final com.facebook.internal.WorkQueue cacheReadQueue = new com.facebook.internal.WorkQueue(2, null, 2, null);
    private static final java.util.Map<com.facebook.internal.ImageDownloader.RequestKey, com.facebook.internal.ImageDownloader.DownloaderContext> pendingRequests = new java.util.HashMap();

    private ImageDownloader() {
    }

    private final synchronized android.os.Handler getHandler() {
        if (handler == null) {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        return handler;
    }

    @kotlin.jvm.JvmStatic
    public static final void downloadAsync(com.facebook.internal.ImageRequest request) {
        if (request == null) {
            return;
        }
        com.facebook.internal.ImageDownloader.RequestKey requestKey = new com.facebook.internal.ImageDownloader.RequestKey(request.getImageUri(), request.getCallerTag());
        java.util.Map<com.facebook.internal.ImageDownloader.RequestKey, com.facebook.internal.ImageDownloader.DownloaderContext> map = pendingRequests;
        synchronized (map) {
            com.facebook.internal.ImageDownloader.DownloaderContext downloaderContext = map.get(requestKey);
            if (downloaderContext != null) {
                downloaderContext.setRequest(request);
                downloaderContext.setCancelled(false);
                com.facebook.internal.WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                if (workItem != null) {
                    workItem.moveToFront();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            } else {
                INSTANCE.enqueueCacheRead(request, requestKey, request.isCachedRedirectAllowed());
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean cancelRequest(com.facebook.internal.ImageRequest request) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.facebook.internal.ImageDownloader.RequestKey requestKey = new com.facebook.internal.ImageDownloader.RequestKey(request.getImageUri(), request.getCallerTag());
        java.util.Map<com.facebook.internal.ImageDownloader.RequestKey, com.facebook.internal.ImageDownloader.DownloaderContext> map = pendingRequests;
        synchronized (map) {
            com.facebook.internal.ImageDownloader.DownloaderContext downloaderContext = map.get(requestKey);
            if (downloaderContext != null) {
                com.facebook.internal.WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                z = true;
                if (workItem != null && workItem.cancel()) {
                    map.remove(requestKey);
                } else {
                    downloaderContext.setCancelled(true);
                }
            } else {
                z = false;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return z;
    }

    @kotlin.jvm.JvmStatic
    public static final void prioritizeRequest(com.facebook.internal.ImageRequest request) {
        com.facebook.internal.WorkQueue.WorkItem workItem;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.facebook.internal.ImageDownloader.RequestKey requestKey = new com.facebook.internal.ImageDownloader.RequestKey(request.getImageUri(), request.getCallerTag());
        java.util.Map<com.facebook.internal.ImageDownloader.RequestKey, com.facebook.internal.ImageDownloader.DownloaderContext> map = pendingRequests;
        synchronized (map) {
            com.facebook.internal.ImageDownloader.DownloaderContext downloaderContext = map.get(requestKey);
            if (downloaderContext != null && (workItem = downloaderContext.getWorkItem()) != null) {
                workItem.moveToFront();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void clearCache() {
        com.facebook.internal.ImageResponseCache imageResponseCache = com.facebook.internal.ImageResponseCache.INSTANCE;
        com.facebook.internal.ImageResponseCache.clearCache();
        com.facebook.internal.UrlRedirectCache urlRedirectCache = com.facebook.internal.UrlRedirectCache.INSTANCE;
        com.facebook.internal.UrlRedirectCache.clearCache();
    }

    public final java.util.Map<com.facebook.internal.ImageDownloader.RequestKey, com.facebook.internal.ImageDownloader.DownloaderContext> getPendingRequests() {
        return pendingRequests;
    }

    private final void enqueueCacheRead(com.facebook.internal.ImageRequest request, com.facebook.internal.ImageDownloader.RequestKey key, boolean allowCachedRedirects) {
        enqueueRequest(request, key, cacheReadQueue, new com.facebook.internal.ImageDownloader.CacheReadWorkItem(key, allowCachedRedirects));
    }

    private final void enqueueDownload(com.facebook.internal.ImageRequest request, com.facebook.internal.ImageDownloader.RequestKey key) {
        enqueueRequest(request, key, downloadQueue, new com.facebook.internal.ImageDownloader.DownloadImageWorkItem(key));
    }

    private final void enqueueRequest(com.facebook.internal.ImageRequest request, com.facebook.internal.ImageDownloader.RequestKey key, com.facebook.internal.WorkQueue workQueue, java.lang.Runnable workItem) {
        java.util.Map<com.facebook.internal.ImageDownloader.RequestKey, com.facebook.internal.ImageDownloader.DownloaderContext> map = pendingRequests;
        synchronized (map) {
            com.facebook.internal.ImageDownloader.DownloaderContext downloaderContext = new com.facebook.internal.ImageDownloader.DownloaderContext(request);
            map.put(key, downloaderContext);
            downloaderContext.setWorkItem(com.facebook.internal.WorkQueue.addActiveWorkItem$default(workQueue, workItem, false, 2, null));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void issueResponse(com.facebook.internal.ImageDownloader.RequestKey key, final java.lang.Exception error, final android.graphics.Bitmap bitmap, final boolean isCachedRedirect) {
        android.os.Handler handler2;
        com.facebook.internal.ImageDownloader.DownloaderContext removePendingRequest = removePendingRequest(key);
        if (removePendingRequest == null || removePendingRequest.getIsCancelled()) {
            return;
        }
        final com.facebook.internal.ImageRequest request = removePendingRequest.getRequest();
        final com.facebook.internal.ImageRequest.Callback callback = request == null ? null : request.getCallback();
        if (callback == null || (handler2 = getHandler()) == null) {
            return;
        }
        handler2.post(new java.lang.Runnable() { // from class: com.facebook.internal.ImageDownloader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.internal.ImageDownloader.m5189issueResponse$lambda4(com.facebook.internal.ImageRequest.this, error, isCachedRedirect, bitmap, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: issueResponse$lambda-4, reason: not valid java name */
    public static final void m5189issueResponse$lambda4(com.facebook.internal.ImageRequest request, java.lang.Exception exc, boolean z, android.graphics.Bitmap bitmap, com.facebook.internal.ImageRequest.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "$request");
        callback.onCompleted(new com.facebook.internal.ImageResponse(request, exc, z, bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void readFromCache(com.facebook.internal.ImageDownloader.RequestKey key, boolean allowCachedRedirects) {
        java.io.InputStream inputStream;
        boolean z = false;
        if (allowCachedRedirects) {
            com.facebook.internal.UrlRedirectCache urlRedirectCache = com.facebook.internal.UrlRedirectCache.INSTANCE;
            android.net.Uri redirectedUri = com.facebook.internal.UrlRedirectCache.getRedirectedUri(key.getUri());
            if (redirectedUri != null) {
                com.facebook.internal.ImageResponseCache imageResponseCache = com.facebook.internal.ImageResponseCache.INSTANCE;
                inputStream = com.facebook.internal.ImageResponseCache.getCachedImageStream(redirectedUri);
                if (inputStream != null) {
                    z = true;
                }
                if (!z) {
                    com.facebook.internal.ImageResponseCache imageResponseCache2 = com.facebook.internal.ImageResponseCache.INSTANCE;
                    inputStream = com.facebook.internal.ImageResponseCache.getCachedImageStream(key.getUri());
                }
                if (inputStream == null) {
                    android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(inputStream);
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.closeQuietly(inputStream);
                    issueResponse(key, null, decodeStream, z);
                    return;
                }
                com.facebook.internal.ImageDownloader.DownloaderContext removePendingRequest = removePendingRequest(key);
                com.facebook.internal.ImageRequest request = removePendingRequest != null ? removePendingRequest.getRequest() : null;
                if (removePendingRequest == null || removePendingRequest.getIsCancelled() || request == null) {
                    return;
                }
                enqueueDownload(request, key);
                return;
            }
        }
        inputStream = null;
        if (!z) {
        }
        if (inputStream == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00f1: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:59:0x00f1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void download(com.facebook.internal.ImageDownloader.RequestKey key) {
        java.net.HttpURLConnection httpURLConnection;
        ?? r4;
        java.io.Closeable closeable;
        java.io.IOException iOException;
        java.net.URLConnection openConnection;
        java.io.InputStream interceptAndCacheImageStream;
        android.graphics.Bitmap decodeStream;
        java.io.Closeable closeable2 = null;
        java.io.InputStream inputStream = null;
        closeable2 = null;
        android.graphics.Bitmap bitmap = null;
        boolean z = true;
        try {
            try {
                openConnection = new java.net.URL(key.getUri().toString()).openConnection();
            } catch (java.lang.Throwable th) {
                th = th;
                closeable2 = closeable;
            }
        } catch (java.io.IOException e) {
            e = e;
            httpURLConnection = null;
            r4 = 0;
        } catch (java.lang.Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        if (openConnection == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        httpURLConnection = (java.net.HttpURLConnection) openConnection;
        try {
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                r4 = httpURLConnection.getResponseCode();
                try {
                } catch (java.io.IOException e2) {
                    e = e2;
                }
            } catch (java.io.IOException e3) {
                e = e3;
                r4 = 0;
            }
            if (r4 == 200) {
                com.facebook.internal.ImageResponseCache imageResponseCache = com.facebook.internal.ImageResponseCache.INSTANCE;
                interceptAndCacheImageStream = com.facebook.internal.ImageResponseCache.interceptAndCacheImageStream(httpURLConnection);
                decodeStream = android.graphics.BitmapFactory.decodeStream(interceptAndCacheImageStream);
                iOException = null;
            } else {
                if (r4 == 301 || r4 == 302) {
                    try {
                        java.lang.String headerField = httpURLConnection.getHeaderField(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
                        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                        if (!com.facebook.internal.Utility.isNullOrEmpty(headerField)) {
                            android.net.Uri redirectUri = android.net.Uri.parse(headerField);
                            com.facebook.internal.UrlRedirectCache urlRedirectCache = com.facebook.internal.UrlRedirectCache.INSTANCE;
                            com.facebook.internal.UrlRedirectCache.cacheUriRedirect(key.getUri(), redirectUri);
                            com.facebook.internal.ImageDownloader.DownloaderContext removePendingRequest = removePendingRequest(key);
                            if (removePendingRequest != null && !removePendingRequest.getIsCancelled()) {
                                com.facebook.internal.ImageRequest request = removePendingRequest.getRequest();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(redirectUri, "redirectUri");
                                enqueueCacheRead(request, new com.facebook.internal.ImageDownloader.RequestKey(redirectUri, key.getTag()), false);
                            }
                        }
                        decodeStream = null;
                        iOException = null;
                        z = false;
                        com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.closeQuietly(inputStream);
                        com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.disconnectQuietly(httpURLConnection);
                        bitmap = decodeStream;
                    } catch (java.io.IOException e4) {
                        e = e4;
                        r4 = 0;
                        z = false;
                        iOException = e;
                        com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.closeQuietly((java.io.Closeable) r4);
                        com.facebook.internal.Utility utility5 = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.disconnectQuietly(httpURLConnection);
                        if (z) {
                        }
                    }
                    if (z) {
                        issueResponse(key, iOException, bitmap, false);
                        return;
                    }
                    return;
                }
                interceptAndCacheImageStream = httpURLConnection.getErrorStream();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (interceptAndCacheImageStream != null) {
                    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(interceptAndCacheImageStream);
                    char[] cArr = new char[128];
                    while (true) {
                        int read = inputStreamReader.read(cArr, 0, 128);
                        if (read <= 0) {
                            break;
                        } else {
                            sb.append(cArr, 0, read);
                        }
                    }
                    com.facebook.internal.Utility utility6 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.closeQuietly(inputStreamReader);
                } else {
                    sb.append("Unexpected error while downloading an image.");
                }
                iOException = new com.facebook.FacebookException(sb.toString());
                decodeStream = null;
            }
            inputStream = interceptAndCacheImageStream;
            com.facebook.internal.Utility utility22 = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.closeQuietly(inputStream);
            com.facebook.internal.Utility utility32 = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.disconnectQuietly(httpURLConnection);
            bitmap = decodeStream;
            if (z) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            com.facebook.internal.Utility utility7 = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.closeQuietly(closeable2);
            com.facebook.internal.Utility utility8 = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.disconnectQuietly(httpURLConnection);
            throw th;
        }
    }

    private final com.facebook.internal.ImageDownloader.DownloaderContext removePendingRequest(com.facebook.internal.ImageDownloader.RequestKey key) {
        com.facebook.internal.ImageDownloader.DownloaderContext remove;
        java.util.Map<com.facebook.internal.ImageDownloader.RequestKey, com.facebook.internal.ImageDownloader.DownloaderContext> map = pendingRequests;
        synchronized (map) {
            remove = map.remove(key);
        }
        return remove;
    }

    /* compiled from: ImageDownloader.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0004\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/ImageDownloader$RequestKey;", "", com.facebook.share.internal.ShareConstants.MEDIA_URI, "Landroid/net/Uri;", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "(Landroid/net/Uri;Ljava/lang/Object;)V", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "equals", "", "o", "hashCode", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class RequestKey {
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        private java.lang.Object tag;
        private android.net.Uri uri;

        public RequestKey(android.net.Uri uri, java.lang.Object tag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            this.uri = uri;
            this.tag = tag;
        }

        public final java.lang.Object getTag() {
            return this.tag;
        }

        public final android.net.Uri getUri() {
            return this.uri;
        }

        public final void setTag(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.tag = obj;
        }

        public final void setUri(android.net.Uri uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "<set-?>");
            this.uri = uri;
        }

        public int hashCode() {
            return ((1073 + this.uri.hashCode()) * 37) + this.tag.hashCode();
        }

        public boolean equals(java.lang.Object o) {
            if (o == null || !(o instanceof com.facebook.internal.ImageDownloader.RequestKey)) {
                return false;
            }
            com.facebook.internal.ImageDownloader.RequestKey requestKey = (com.facebook.internal.ImageDownloader.RequestKey) o;
            return requestKey.uri == this.uri && requestKey.tag == this.tag;
        }
    }

    /* compiled from: ImageDownloader.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/ImageDownloader$DownloaderContext;", "", "request", "Lcom/facebook/internal/ImageRequest;", "(Lcom/facebook/internal/ImageRequest;)V", "isCancelled", "", "()Z", "setCancelled", "(Z)V", "getRequest", "()Lcom/facebook/internal/ImageRequest;", "setRequest", "workItem", "Lcom/facebook/internal/WorkQueue$WorkItem;", "getWorkItem", "()Lcom/facebook/internal/WorkQueue$WorkItem;", "setWorkItem", "(Lcom/facebook/internal/WorkQueue$WorkItem;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DownloaderContext {
        private boolean isCancelled;
        private com.facebook.internal.ImageRequest request;
        private com.facebook.internal.WorkQueue.WorkItem workItem;

        public DownloaderContext(com.facebook.internal.ImageRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
        }

        public final com.facebook.internal.ImageRequest getRequest() {
            return this.request;
        }

        public final void setRequest(com.facebook.internal.ImageRequest imageRequest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageRequest, "<set-?>");
            this.request = imageRequest;
        }

        public final com.facebook.internal.WorkQueue.WorkItem getWorkItem() {
            return this.workItem;
        }

        public final void setWorkItem(com.facebook.internal.WorkQueue.WorkItem workItem) {
            this.workItem = workItem;
        }

        /* renamed from: isCancelled, reason: from getter */
        public final boolean getIsCancelled() {
            return this.isCancelled;
        }

        public final void setCancelled(boolean z) {
            this.isCancelled = z;
        }
    }

    /* compiled from: ImageDownloader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/internal/ImageDownloader$CacheReadWorkItem;", "Ljava/lang/Runnable;", com.ironsource.X3.i.W, "Lcom/facebook/internal/ImageDownloader$RequestKey;", "allowCachedRedirects", "", "(Lcom/facebook/internal/ImageDownloader$RequestKey;Z)V", "run", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class CacheReadWorkItem implements java.lang.Runnable {
        private final boolean allowCachedRedirects;
        private final com.facebook.internal.ImageDownloader.RequestKey key;

        public CacheReadWorkItem(com.facebook.internal.ImageDownloader.RequestKey key, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.allowCachedRedirects = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        com.facebook.internal.ImageDownloader.INSTANCE.readFromCache(this.key, this.allowCachedRedirects);
                    } catch (java.lang.Throwable th) {
                        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    }
                } catch (java.lang.Throwable th2) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
                }
            } catch (java.lang.Throwable th3) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
            }
        }
    }

    /* compiled from: ImageDownloader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/ImageDownloader$DownloadImageWorkItem;", "Ljava/lang/Runnable;", com.ironsource.X3.i.W, "Lcom/facebook/internal/ImageDownloader$RequestKey;", "(Lcom/facebook/internal/ImageDownloader$RequestKey;)V", "run", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class DownloadImageWorkItem implements java.lang.Runnable {
        private final com.facebook.internal.ImageDownloader.RequestKey key;

        public DownloadImageWorkItem(com.facebook.internal.ImageDownloader.RequestKey key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        com.facebook.internal.ImageDownloader.INSTANCE.download(this.key);
                    } catch (java.lang.Throwable th) {
                        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    }
                } catch (java.lang.Throwable th2) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
                }
            } catch (java.lang.Throwable th3) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
            }
        }
    }
}
