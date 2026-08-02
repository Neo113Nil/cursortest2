package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH¦@¢\u0006\u0004\b\u0011\u0010\rJ\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0010"}, d2 = {"Lio/ktor/client/plugins/cache/storage/CacheStorage;", "", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "removeAll", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CacheStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.cache.storage.CacheStorage.Companion INSTANCE = io.ktor.client.plugins.cache.storage.CacheStorage.Companion.getHighSpeedVideoSizes;

    java.lang.Object find(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> continuation);

    java.lang.Object findAll(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> continuation);

    java.lang.Object remove(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object removeAll(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object store(io.ktor.http.Url url, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lio/ktor/client/plugins/cache/storage/CacheStorage$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Unlimited", "Lkotlin/jvm/functions/Function0;", "getUnlimited", "()Lkotlin/jvm/functions/Function0;", "Disabled", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "getDisabled", "()Lio/ktor/client/plugins/cache/storage/CacheStorage;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ io.ktor.client.plugins.cache.storage.CacheStorage.Companion getHighSpeedVideoSizes = new io.ktor.client.plugins.cache.storage.CacheStorage.Companion();
        private static final kotlin.jvm.functions.Function0<io.ktor.client.plugins.cache.storage.CacheStorage> Unlimited = new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.cache.storage.CacheStorage$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return io.ktor.client.plugins.cache.storage.CacheStorage.Companion.$r8$lambda$4c8jvauKobEtbJyBIa91Bsr99zo();
            }
        };
        private static final io.ktor.client.plugins.cache.storage.CacheStorage Disabled = io.ktor.client.plugins.cache.storage.DisabledStorage.INSTANCE;

        private Companion() {
        }

        public final kotlin.jvm.functions.Function0<io.ktor.client.plugins.cache.storage.CacheStorage> getUnlimited() {
            return Unlimited;
        }

        public final io.ktor.client.plugins.cache.storage.CacheStorage getDisabled() {
            return Disabled;
        }

        public static /* synthetic */ io.ktor.client.plugins.cache.storage.UnlimitedStorage $r8$lambda$4c8jvauKobEtbJyBIa91Bsr99zo() {
            return new io.ktor.client.plugins.cache.storage.UnlimitedStorage();
        }
    }
}
