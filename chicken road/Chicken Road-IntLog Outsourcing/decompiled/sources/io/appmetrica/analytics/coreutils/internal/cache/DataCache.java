package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;

/* loaded from: classes.dex */
public abstract class DataCache<T> implements UpdateConditionsChecker {

    /* renamed from: a, reason: collision with root package name */
    private CacheUpdateScheduler f6240a;
    protected final CachedDataProvider.CachedData<T> mCachedData;

    public DataCache(long j2, long j6, String str) {
        this.mCachedData = new CachedDataProvider.CachedData<>(j2, j6, str);
    }

    public CachedDataProvider.CachedData<T> getCachedData() {
        return this.mCachedData;
    }

    public T getData() {
        CacheUpdateScheduler cacheUpdateScheduler;
        if (shouldUpdate() && (cacheUpdateScheduler = this.f6240a) != null) {
            cacheUpdateScheduler.scheduleUpdateIfNeededNow();
        }
        if (this.mCachedData.shouldClearData()) {
            this.mCachedData.setData(null);
        }
        return this.mCachedData.getData();
    }

    public void setUpdateScheduler(CacheUpdateScheduler cacheUpdateScheduler) {
        this.f6240a = cacheUpdateScheduler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    public boolean shouldUpdate() {
        return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData();
    }

    public abstract boolean shouldUpdate(T t5);

    public void updateCacheControl(long j2, long j6) {
        this.mCachedData.setExpirationPolicy(j2, j6);
    }

    public void updateData(T t5) {
        if (shouldUpdate(t5)) {
            this.mCachedData.setData(t5);
            CacheUpdateScheduler cacheUpdateScheduler = this.f6240a;
            if (cacheUpdateScheduler != null) {
                cacheUpdateScheduler.onStateUpdated();
            }
        }
    }
}
