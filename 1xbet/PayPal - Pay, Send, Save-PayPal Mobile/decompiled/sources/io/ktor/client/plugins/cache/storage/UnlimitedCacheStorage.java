package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lio/ktor/client/plugins/cache/storage/UnlimitedCacheStorage;", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "<init>", "()V", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/HttpCacheEntry;)V", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;)Lio/ktor/client/plugins/cache/HttpCacheEntry;", "", "findByUrl", "(Lio/ktor/http/Url;)Ljava/util/Set;", "Lio/ktor/util/collections/ConcurrentMap;", "", "Camera2StreamConfigurationMap", "Lio/ktor/util/collections/ConcurrentMap;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnlimitedCacheStorage extends io.ktor.client.plugins.cache.storage.HttpCacheStorage {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.HttpCacheEntry>> getHighSpeedVideoSizes = new io.ktor.util.collections.ConcurrentMap<>(0, 1, null);

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public final void store(io.ktor.http.Url url, io.ktor.client.plugins.cache.HttpCacheEntry value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.Set<io.ktor.client.plugins.cache.HttpCacheEntry> computeIfAbsent = this.getHighSpeedVideoSizes.computeIfAbsent((io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.HttpCacheEntry>>) url, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.cache.storage.UnlimitedCacheStorage$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Set ConcurrentSet;
                ConcurrentSet = io.ktor.util.collections.ConcurrentSetKt.ConcurrentSet();
                return ConcurrentSet;
            }
        });
        if (computeIfAbsent.add(value)) {
            return;
        }
        computeIfAbsent.remove(value);
        computeIfAbsent.add(value);
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public final io.ktor.client.plugins.cache.HttpCacheEntry find(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> varyKeys) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(varyKeys, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.computeIfAbsent((io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.HttpCacheEntry>>) url, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.cache.storage.UnlimitedCacheStorage$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Set ConcurrentSet;
                ConcurrentSet = io.ktor.util.collections.ConcurrentSetKt.ConcurrentSet();
                return ConcurrentSet;
            }
        }).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            io.ktor.client.plugins.cache.HttpCacheEntry httpCacheEntry = (io.ktor.client.plugins.cache.HttpCacheEntry) obj;
            if (!varyKeys.isEmpty()) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : varyKeys.entrySet()) {
                    java.lang.String key = entry.getKey();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(httpCacheEntry.getVaryKeys().get(key), entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return (io.ktor.client.plugins.cache.HttpCacheEntry) obj;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public final java.util.Set<io.ktor.client.plugins.cache.HttpCacheEntry> findByUrl(io.ktor.http.Url url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.util.Set<io.ktor.client.plugins.cache.HttpCacheEntry> set = this.getHighSpeedVideoSizes.get(url);
        return set == null ? kotlin.collections.SetsKt.emptySet() : set;
    }
}
