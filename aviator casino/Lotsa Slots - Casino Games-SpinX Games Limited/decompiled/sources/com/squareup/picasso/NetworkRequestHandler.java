package com.squareup.picasso;

/* loaded from: classes5.dex */
class NetworkRequestHandler extends com.squareup.picasso.RequestHandler {
    private static final java.lang.String SCHEME_HTTP = "http";
    private static final java.lang.String SCHEME_HTTPS = "https";
    private final com.squareup.picasso.Downloader downloader;
    private final com.squareup.picasso.Stats stats;

    @Override // com.squareup.picasso.RequestHandler
    int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean supportsReplay() {
        return true;
    }

    NetworkRequestHandler(com.squareup.picasso.Downloader downloader, com.squareup.picasso.Stats stats) {
        this.downloader = downloader;
        this.stats = stats;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(com.squareup.picasso.Request request) {
        java.lang.String scheme = request.uri.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.RequestHandler
    public com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request request, int i) throws java.io.IOException {
        okhttp3.Response load = this.downloader.load(createRequest(request, i));
        okhttp3.ResponseBody body = load.body();
        if (!load.isSuccessful()) {
            body.close();
            throw new com.squareup.picasso.NetworkRequestHandler.ResponseException(load.code(), request.networkPolicy);
        }
        com.squareup.picasso.Picasso.LoadedFrom loadedFrom = load.cacheResponse() == null ? com.squareup.picasso.Picasso.LoadedFrom.NETWORK : com.squareup.picasso.Picasso.LoadedFrom.DISK;
        if (loadedFrom == com.squareup.picasso.Picasso.LoadedFrom.DISK && body.getContentLength() == 0) {
            body.close();
            throw new com.squareup.picasso.NetworkRequestHandler.ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == com.squareup.picasso.Picasso.LoadedFrom.NETWORK && body.getContentLength() > 0) {
            this.stats.dispatchDownloadFinished(body.getContentLength());
        }
        return new com.squareup.picasso.RequestHandler.Result(body.getSource(), loadedFrom);
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean shouldRetry(boolean z, android.net.NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    private static okhttp3.Request createRequest(com.squareup.picasso.Request request, int i) {
        okhttp3.CacheControl cacheControl;
        if (i == 0) {
            cacheControl = null;
        } else if (com.squareup.picasso.NetworkPolicy.isOfflineOnly(i)) {
            cacheControl = okhttp3.CacheControl.FORCE_CACHE;
        } else {
            okhttp3.CacheControl.Builder builder = new okhttp3.CacheControl.Builder();
            if (!com.squareup.picasso.NetworkPolicy.shouldReadFromDiskCache(i)) {
                builder.noCache();
            }
            if (!com.squareup.picasso.NetworkPolicy.shouldWriteToDiskCache(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        okhttp3.Request.Builder url = new okhttp3.Request.Builder().url(request.uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        return url.build();
    }

    static class ContentLengthException extends java.io.IOException {
        ContentLengthException(java.lang.String str) {
            super(str);
        }
    }

    static final class ResponseException extends java.io.IOException {
        final int code;
        final int networkPolicy;

        ResponseException(int i, int i2) {
            super("HTTP " + i);
            this.code = i;
            this.networkPolicy = i2;
        }
    }
}
