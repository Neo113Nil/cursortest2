package io.appmetrica.analytics.coreutils.internal.cache;

/* loaded from: classes.dex */
public abstract class DataCache<T> implements io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker {

    /* renamed from: a, reason: collision with root package name */
    private io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler f3737a;
    protected final io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider.CachedData<T> mCachedData;

    public DataCache(long j2, long j3, java.lang.String str) {
        this.mCachedData = new io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider.CachedData<>(j2, j3, str);
    }

    public io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider.CachedData<T> getCachedData() {
        return this.mCachedData;
    }

    public T getData() {
        io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler cacheUpdateScheduler;
        if (shouldUpdate() && (cacheUpdateScheduler = this.f3737a) != null) {
            cacheUpdateScheduler.scheduleUpdateIfNeededNow();
        }
        if (this.mCachedData.shouldClearData()) {
            this.mCachedData.setData(null);
        }
        return this.mCachedData.getData();
    }

    public void setUpdateScheduler(io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler cacheUpdateScheduler) {
        this.f3737a = cacheUpdateScheduler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    public boolean shouldUpdate() {
        return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData();
    }

    public abstract boolean shouldUpdate(T t);

    public void updateCacheControl(long j2, long j3) {
        this.mCachedData.setExpirationPolicy(j2, j3);
    }

    public void updateData(T t) {
        if (shouldUpdate(t)) {
            this.mCachedData.setData(t);
            io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler cacheUpdateScheduler = this.f3737a;
            if (cacheUpdateScheduler != null) {
                cacheUpdateScheduler.onStateUpdated();
            }
        }
    }
}
