package io.appmetrica.analytics.coreutils.internal.cache;

/* loaded from: classes.dex */
public abstract class SynchronizedDataCache<T> extends io.appmetrica.analytics.coreutils.internal.cache.DataCache<T> {
    public SynchronizedDataCache(long j2, long j3, java.lang.String str) {
        super(j2, j3, str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    public synchronized T getData() {
        return (T) super.getData();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache, io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    public synchronized boolean shouldUpdate() {
        return super.shouldUpdate();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    public synchronized void updateData(T t) {
        super.updateData(t);
    }
}
