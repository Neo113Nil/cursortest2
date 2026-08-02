package com.apollographql.apollo.cache.normalized.api;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;", "", "<init>", "()V", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "create", "()Lcom/apollographql/apollo/cache/normalized/api/NormalizedCache;", "createChain", "factory", "chain", "(Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;)Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/cache/normalized/api/NormalizedCacheFactory;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NormalizedCacheFactory {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory getHighSpeedVideoFpsRangesFor;

    public abstract com.apollographql.apollo.cache.normalized.api.NormalizedCache create();

    public final com.apollographql.apollo.cache.normalized.api.NormalizedCache createChain() {
        com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory = this.getHighSpeedVideoFpsRangesFor;
        if (normalizedCacheFactory != null) {
            return create().chain(normalizedCacheFactory.createChain());
        }
        return create();
    }

    public final com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory chain(com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory = this;
        while (true) {
            com.apollographql.apollo.cache.normalized.api.NormalizedCacheFactory normalizedCacheFactory2 = normalizedCacheFactory.getHighSpeedVideoFpsRangesFor;
            if (normalizedCacheFactory2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(normalizedCacheFactory2);
                normalizedCacheFactory = normalizedCacheFactory2;
            } else {
                normalizedCacheFactory.getHighSpeedVideoFpsRangesFor = factory;
                return this;
            }
        }
    }
}
