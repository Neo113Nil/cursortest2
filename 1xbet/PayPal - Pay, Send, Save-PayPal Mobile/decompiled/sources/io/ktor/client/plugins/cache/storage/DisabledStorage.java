package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0014\u0010\u0012"}, d2 = {"Lio/ktor/client/plugins/cache/storage/DisabledStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "<init>", "()V", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "removeAll"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DisabledStorage implements io.ktor.client.plugins.cache.storage.CacheStorage {
    public static final io.ktor.client.plugins.cache.storage.DisabledStorage INSTANCE = new io.ktor.client.plugins.cache.storage.DisabledStorage();

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public final java.lang.Object find(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> continuation) {
        return null;
    }

    private DisabledStorage() {
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public final java.lang.Object store(io.ktor.http.Url url, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public final java.lang.Object findAll(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> continuation) {
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public final java.lang.Object remove(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public final java.lang.Object removeAll(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }
}
