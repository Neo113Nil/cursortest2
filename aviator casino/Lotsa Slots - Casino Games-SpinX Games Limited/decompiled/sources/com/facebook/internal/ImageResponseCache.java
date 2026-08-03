package com.facebook.internal;

/* compiled from: ImageResponseCache.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/facebook/internal/ImageResponseCache;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "imageCache", "Lcom/facebook/internal/FileLruCache;", "clearCache", "", "getCache", "getCachedImageStream", "Ljava/io/InputStream;", com.facebook.share.internal.ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "interceptAndCacheImageStream", "connection", "Ljava/net/HttpURLConnection;", "isCDNURL", "", "BufferedHttpInputStream", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageResponseCache {
    public static final com.facebook.internal.ImageResponseCache INSTANCE = new com.facebook.internal.ImageResponseCache();
    private static final java.lang.String TAG = "ImageResponseCache";
    private static com.facebook.internal.FileLruCache imageCache;

    private ImageResponseCache() {
    }

    public final java.lang.String getTAG() {
        return TAG;
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized com.facebook.internal.FileLruCache getCache() throws java.io.IOException {
        com.facebook.internal.FileLruCache fileLruCache;
        synchronized (com.facebook.internal.ImageResponseCache.class) {
            if (imageCache == null) {
                java.lang.String TAG2 = TAG;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                imageCache = new com.facebook.internal.FileLruCache(TAG2, new com.facebook.internal.FileLruCache.Limits());
            }
            fileLruCache = imageCache;
            if (fileLruCache == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("imageCache");
                throw null;
            }
        }
        return fileLruCache;
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.InputStream getCachedImageStream(android.net.Uri uri) {
        if (uri == null || !INSTANCE.isCDNURL(uri)) {
            return null;
        }
        try {
            com.facebook.internal.FileLruCache cache = getCache();
            java.lang.String uri2 = uri.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
            return com.facebook.internal.FileLruCache.get$default(cache, uri2, null, 2, null);
        } catch (java.io.IOException e) {
            com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.CACHE;
            java.lang.String TAG2 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.log(loggingBehavior, 5, TAG2, e.toString());
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.InputStream interceptAndCacheImageStream(java.net.HttpURLConnection connection) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
        if (connection.getResponseCode() != 200) {
            return null;
        }
        android.net.Uri parse = android.net.Uri.parse(connection.getURL().toString());
        java.io.InputStream inputStream = connection.getInputStream();
        try {
            if (!INSTANCE.isCDNURL(parse)) {
                return inputStream;
            }
            com.facebook.internal.FileLruCache cache = getCache();
            java.lang.String uri = parse.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
            return cache.interceptAndPut(uri, new com.facebook.internal.ImageResponseCache.BufferedHttpInputStream(inputStream, connection));
        } catch (java.io.IOException unused) {
            return inputStream;
        }
    }

    private final boolean isCDNURL(android.net.Uri uri) {
        java.lang.String host;
        return (uri == null || (host = uri.getHost()) == null || (!kotlin.jvm.internal.Intrinsics.areEqual(host, "fbcdn.net") && !kotlin.text.StringsKt.endsWith$default(host, ".fbcdn.net", false, 2, (java.lang.Object) null) && (!kotlin.text.StringsKt.startsWith$default(host, "fbcdn", false, 2, (java.lang.Object) null) || !kotlin.text.StringsKt.endsWith$default(host, ".akamaihd.net", false, 2, (java.lang.Object) null)))) ? false : true;
    }

    @kotlin.jvm.JvmStatic
    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (java.io.IOException e) {
            com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.CACHE;
            java.lang.String TAG2 = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.log(loggingBehavior, 5, TAG2, kotlin.jvm.internal.Intrinsics.stringPlus("clearCache failed ", e.getMessage()));
        }
    }

    /* compiled from: ImageResponseCache.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/facebook/internal/ImageResponseCache$BufferedHttpInputStream;", "Ljava/io/BufferedInputStream;", "stream", "Ljava/io/InputStream;", "connection", "Ljava/net/HttpURLConnection;", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V", "getConnection", "()Ljava/net/HttpURLConnection;", "setConnection", "(Ljava/net/HttpURLConnection;)V", "close", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class BufferedHttpInputStream extends java.io.BufferedInputStream {
        private java.net.HttpURLConnection connection;

        public final java.net.HttpURLConnection getConnection() {
            return this.connection;
        }

        public final void setConnection(java.net.HttpURLConnection httpURLConnection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpURLConnection, "<set-?>");
            this.connection = httpURLConnection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BufferedHttpInputStream(java.io.InputStream inputStream, java.net.HttpURLConnection connection) {
            super(inputStream, 8192);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
            this.connection = connection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            super.close();
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.disconnectQuietly(this.connection);
        }
    }
}
