package uz.shs.better_player_plus;

import android.content.Context;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@UnstableApi
/* loaded from: classes5.dex */
public final class j implements DataSource.Factory {
    public final Context a;
    public final long b;
    public final long c;
    public final DefaultDataSource.Factory d;

    public j(Context context, long j, long j2, DefaultHttpDataSource.Factory factory) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = j;
        this.c = j2;
        DefaultBandwidthMeter build = new DefaultBandwidthMeter.Builder(context).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        if (factory != null) {
            DefaultDataSource.Factory factory2 = new DefaultDataSource.Factory(context, factory);
            this.d = factory2;
            factory2.setTransferListener(build);
        }
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CacheDataSource createDataSource() {
        h hVar = h.a;
        Context context = this.a;
        long j = this.b;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (h.b == null) {
            synchronized (h.class) {
                try {
                    if (h.b == null) {
                        h.b = new SimpleCache(new File(context.getCacheDir(), "betterPlayerCache"), new LeastRecentlyUsedCacheEvictor(j), new StandaloneDatabaseProvider(context));
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        SimpleCache simpleCache = h.b;
        if (simpleCache == null) {
            throw new IllegalStateException("Cache can't be null.");
        }
        DefaultDataSource.Factory factory = this.d;
        return new CacheDataSource(simpleCache, factory != null ? factory.createDataSource() : null, new FileDataSource(), new CacheDataSink(simpleCache, this.c), 3, null);
    }
}
