package com.squareup.picasso;

/* loaded from: classes5.dex */
public final class OkHttp3Downloader implements com.squareup.picasso.Downloader {
    private final okhttp3.Cache cache;
    final okhttp3.Call.Factory client;
    private boolean sharedClient;

    public OkHttp3Downloader(android.content.Context context) {
        this(com.squareup.picasso.Utils.createDefaultCacheDir(context));
    }

    public OkHttp3Downloader(java.io.File file) {
        this(file, com.squareup.picasso.Utils.calculateDiskCacheSize(file));
    }

    public OkHttp3Downloader(android.content.Context context, long j) {
        this(com.squareup.picasso.Utils.createDefaultCacheDir(context), j);
    }

    public OkHttp3Downloader(java.io.File file, long j) {
        this(new okhttp3.OkHttpClient.Builder().cache(new okhttp3.Cache(file, j)).build());
        this.sharedClient = false;
    }

    public OkHttp3Downloader(okhttp3.OkHttpClient okHttpClient) {
        this.sharedClient = true;
        this.client = okHttpClient;
        this.cache = okHttpClient.cache();
    }

    public OkHttp3Downloader(okhttp3.Call.Factory factory) {
        this.sharedClient = true;
        this.client = factory;
        this.cache = null;
    }

    @Override // com.squareup.picasso.Downloader
    public okhttp3.Response load(okhttp3.Request request) throws java.io.IOException {
        return this.client.newCall(request).execute();
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        okhttp3.Cache cache;
        if (this.sharedClient || (cache = this.cache) == null) {
            return;
        }
        try {
            cache.close();
        } catch (java.io.IOException unused) {
        }
    }
}
