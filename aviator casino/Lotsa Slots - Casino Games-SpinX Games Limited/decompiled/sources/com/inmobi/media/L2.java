package com.inmobi.media;

/* loaded from: classes5.dex */
public final class L2 {
    public static final kotlin.Lazy h = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.L2$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.L2.b();
        }
    });

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f4810a = new java.lang.Object();
    public final android.content.Context b;
    public final com.inmobi.media.core.config.models.AdConfig.VideoCacheConfig c;
    public final androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor d;
    public final androidx.media3.database.StandaloneDatabaseProvider e;
    public final java.util.concurrent.atomic.AtomicInteger f;
    public volatile androidx.media3.datasource.cache.SimpleCache g;

    public L2() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        this.b = context;
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        this.c = ((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getHybridNative().getVideoCache();
        this.e = new androidx.media3.database.StandaloneDatabaseProvider(context);
        this.f = new java.util.concurrent.atomic.AtomicInteger(0);
        this.d = new androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor(a(context));
    }

    public static final com.inmobi.media.L2 b() {
        return new com.inmobi.media.L2();
    }

    public final long a(android.content.Context context) {
        long j = 1024;
        long maxSize = this.c.getMaxSize() * j * j;
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.A()) {
            try {
                java.lang.Object systemService = context.getSystemService(com.ironsource.X3.a.k);
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
                android.os.storage.StorageManager storageManager = (android.os.storage.StorageManager) systemService;
                java.util.UUID uuidForPath = storageManager.getUuidForPath(context.getCacheDir());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidForPath, "getUuidForPath(...)");
                return java.lang.Math.min(maxSize, storageManager.getCacheQuotaBytes(uuidForPath));
            } catch (java.lang.Exception e) {
                e.getMessage();
            }
        }
        return maxSize;
    }

    public final androidx.media3.datasource.cache.SimpleCache a() {
        java.io.File file = new java.io.File(this.b.getCacheDir(), "im_exoplayer_video_cache");
        if (!file.exists() && !file.mkdirs()) {
            throw new java.io.IOException("Could not create cache directory: " + file);
        }
        return new androidx.media3.datasource.cache.SimpleCache(file, this.d, this.e);
    }

    public final androidx.media3.exoplayer.source.MediaSource a(java.lang.String url, boolean z) {
        androidx.media3.datasource.DataSource.Factory factory;
        androidx.media3.datasource.cache.SimpleCache simpleCache;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        androidx.media3.common.MediaItem build = new androidx.media3.common.MediaItem.Builder().setUri(url).setCustomCacheKey(url).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        if (this.c.getIsEnabled() && z) {
            androidx.media3.datasource.DefaultDataSource.Factory factory2 = new androidx.media3.datasource.DefaultDataSource.Factory(this.b);
            synchronized (this.f4810a) {
                simpleCache = this.g;
                if (simpleCache == null) {
                    simpleCache = a();
                    this.g = simpleCache;
                }
            }
            factory = new androidx.media3.datasource.cache.CacheDataSource.Factory().setCache(simpleCache).setUpstreamDataSourceFactory(factory2).setCacheWriteDataSinkFactory(new androidx.media3.datasource.cache.CacheDataSink.Factory().setCache(simpleCache)).setCacheReadDataSourceFactory(new androidx.media3.datasource.FileDataSource.Factory()).setFlags(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(factory, "setFlags(...)");
        } else {
            factory = new androidx.media3.datasource.DefaultDataSource.Factory(this.b);
        }
        androidx.media3.exoplayer.source.MediaSource createMediaSource = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(factory).createMediaSource(build);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createMediaSource, "createMediaSource(...)");
        return createMediaSource;
    }

    public final int a(java.lang.String url) {
        androidx.media3.datasource.cache.SimpleCache simpleCache;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        try {
            synchronized (this.f4810a) {
                simpleCache = this.g;
            }
            if (simpleCache == null) {
                return 0;
            }
            androidx.media3.datasource.cache.ContentMetadata contentMetadata = simpleCache.getContentMetadata(url);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentMetadata, "getContentMetadata(...)");
            long contentLength = androidx.media3.datasource.cache.ContentMetadata.CC.getContentLength(contentMetadata);
            if (contentLength <= 0) {
                return 0;
            }
            return (int) ((simpleCache.getCachedLength(url, 0L, contentLength) * 100) / contentLength);
        } catch (java.lang.Exception e) {
            e.getMessage();
            return 0;
        }
    }
}
