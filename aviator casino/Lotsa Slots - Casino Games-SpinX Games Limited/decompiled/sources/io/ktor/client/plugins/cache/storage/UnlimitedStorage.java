package io.ktor.client.plugins.cache.storage;

/* compiled from: UnlimitedCacheStorage.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0014\u0010\u0012R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/ktor/client/plugins/cache/storage/UnlimitedStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "<init>", "()V", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "data", "", com.ironsource.X3.i.U, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "removeAll", "Lio/ktor/util/collections/ConcurrentMap;", "", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnlimitedStorage implements io.ktor.client.plugins.cache.storage.CacheStorage {
    private final io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> store = new io.ktor.util.collections.ConcurrentMap<>(0, 1, null);

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object store(io.ktor.http.Url url, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData> computeIfAbsent = this.store.computeIfAbsent((io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>>) url, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.cache.storage.UnlimitedStorage$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Set ConcurrentSet;
                ConcurrentSet = io.ktor.util.collections.ConcurrentSetKt.ConcurrentSet();
                return ConcurrentSet;
            }
        });
        if (!computeIfAbsent.add(cachedResponseData)) {
            computeIfAbsent.remove(cachedResponseData);
            computeIfAbsent.add(cachedResponseData);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object find(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> continuation) {
        for (java.lang.Object obj : this.store.computeIfAbsent((io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>>) url, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.cache.storage.UnlimitedStorage$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Set ConcurrentSet;
                ConcurrentSet = io.ktor.util.collections.ConcurrentSetKt.ConcurrentSet();
                return ConcurrentSet;
            }
        })) {
            io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
            if (map.isEmpty()) {
                return obj;
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(cachedResponseData.getVaryKeys().get(key), entry.getValue())) {
                    break;
                }
            }
            return obj;
        }
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object findAll(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> continuation) {
        java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData> set = this.store.get(url);
        return set == null ? kotlin.collections.SetsKt.emptySet() : set;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object remove(io.ktor.http.Url url, final java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData> set = this.store.get(url);
        if (set != null) {
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(kotlin.collections.CollectionsKt.removeAll(set, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.cache.storage.UnlimitedStorage$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    boolean remove$lambda$5;
                    remove$lambda$5 = io.ktor.client.plugins.cache.storage.UnlimitedStorage.remove$lambda$5(map, (io.ktor.client.plugins.cache.storage.CachedResponseData) obj);
                    return java.lang.Boolean.valueOf(remove$lambda$5);
                }
            }));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object removeAll(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.store.remove(url);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean remove$lambda$5(java.util.Map map, io.ktor.client.plugins.cache.storage.CachedResponseData entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "entry");
        if (!map.isEmpty()) {
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getVaryKeys().get((java.lang.String) entry2.getKey()), (java.lang.String) entry2.getValue())) {
                    break;
                }
            }
        }
        return map.size() == entry.getVaryKeys().size();
    }
}
