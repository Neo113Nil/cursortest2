package com.inmobi.media;

import android.content.Context;
import android.os.storage.StorageManager;
import androidx.media3.common.MediaItem;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.ContentMetadata;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.i3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3783i3 {
    public static final Lazy g = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.inmobi.media.i3$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C3783i3.b();
        }
    });

    /* renamed from: a, reason: collision with root package name */
    public final Object f7156a = new Object();
    public final Context b;
    public final AdConfig.VideoCacheConfig c;
    public final LeastRecentlyUsedCacheEvictor d;
    public final StandaloneDatabaseProvider e;
    public volatile SimpleCache f;

    public C3783i3() {
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNull(context);
        this.b = context;
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        this.c = ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getHybridNative().getVideoCache();
        this.e = new StandaloneDatabaseProvider(context);
        this.d = new LeastRecentlyUsedCacheEvictor(a(context));
    }

    public static final C3783i3 b() {
        return new C3783i3();
    }

    public final long a(Context context) {
        long j = 1024;
        long maxSize = this.c.getMaxSize() * j * j;
        Y5.f6965a.getClass();
        if (Y5.A()) {
            try {
                Object systemService = context.getSystemService(U3.a.k);
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
                StorageManager storageManager = (StorageManager) systemService;
                UUID uuidForPath = storageManager.getUuidForPath(context.getCacheDir());
                Intrinsics.checkNotNullExpressionValue(uuidForPath, "getUuidForPath(...)");
                return Math.min(maxSize, storageManager.getCacheQuotaBytes(uuidForPath));
            } catch (Exception e) {
                String str = "Failed to get cache quota. Defaulting to max size. Error: " + e.getMessage();
            }
        }
        return maxSize;
    }

    public final SimpleCache a() {
        File file = new File(this.b.getCacheDir(), "im_exoplayer_video_cache");
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("Could not create cache directory: " + file);
        }
        return new SimpleCache(file, this.d, this.e);
    }

    public final MediaSource a(String url, boolean z) {
        DataSource.Factory factory;
        SimpleCache simpleCache;
        Intrinsics.checkNotNullParameter(url, "url");
        MediaItem build = new MediaItem.Builder().setUri(url).setCustomCacheKey(url).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        if (this.c.getIsEnabled() && z) {
            DefaultDataSource.Factory factory2 = new DefaultDataSource.Factory(this.b);
            synchronized (this.f7156a) {
                simpleCache = this.f;
                if (simpleCache == null) {
                    simpleCache = a();
                    this.f = simpleCache;
                }
            }
            factory = new CacheDataSource.Factory().setCache(simpleCache).setUpstreamDataSourceFactory(factory2).setCacheWriteDataSinkFactory(new CacheDataSink.Factory().setCache(simpleCache)).setCacheReadDataSourceFactory(new FileDataSource.Factory()).setFlags(2);
            Intrinsics.checkNotNullExpressionValue(factory, "setFlags(...)");
        } else {
            factory = new DefaultDataSource.Factory(this.b);
        }
        MediaSource createMediaSource = new DefaultMediaSourceFactory(factory).createMediaSource(build);
        Intrinsics.checkNotNullExpressionValue(createMediaSource, "createMediaSource(...)");
        return createMediaSource;
    }

    public final int a(String url) {
        SimpleCache simpleCache;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            synchronized (this.f7156a) {
                simpleCache = this.f;
            }
            if (simpleCache == null) {
                return 0;
            }
            ContentMetadata contentMetadata = simpleCache.getContentMetadata(url);
            Intrinsics.checkNotNullExpressionValue(contentMetadata, "getContentMetadata(...)");
            long contentLength = ContentMetadata.getContentLength(contentMetadata);
            if (contentLength <= 0) {
                return 0;
            }
            return (int) ((simpleCache.getCachedLength(url, 0L, contentLength) * 100) / contentLength);
        } catch (Exception e) {
            String str = "Error getting cache progress: " + e.getMessage();
            return 0;
        }
    }
}
