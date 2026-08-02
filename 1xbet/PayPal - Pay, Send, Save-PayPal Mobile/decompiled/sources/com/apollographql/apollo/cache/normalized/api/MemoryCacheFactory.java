package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/MemoryCacheFactory;", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;", "", "maxSizeBytes", "", "expireAfterMillis", "<init>", "(IJ)V", "Lcom/apollographql/apollo/cache/normalized/api/MemoryCache;", "create", "()Lcom/apollographql/apollo/cache/normalized/api/MemoryCache;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "J", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MemoryCacheFactory extends com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory {
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    public /* synthetic */ MemoryCacheFactory(int i, long j, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? -1L : j);
    }

    public MemoryCacheFactory(int i, long j) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = j;
    }

    @Override // com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory
    public final com.apollographql.apollo.cache.normalized.api.MemoryCache create() {
        return new com.apollographql.apollo.cache.normalized.api.MemoryCache(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
    }

    public MemoryCacheFactory(int i) {
        this(i, 0L, 2, null);
    }

    public MemoryCacheFactory() {
        this(0, 0L, 3, null);
    }
}
