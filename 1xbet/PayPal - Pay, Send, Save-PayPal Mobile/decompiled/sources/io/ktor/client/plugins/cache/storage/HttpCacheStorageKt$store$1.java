package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0}, l = {69}, m = com.google.android.libraries.places.api.model.PlaceTypes.STORE, n = {"$this$store", "url"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class HttpCacheStorageKt$store$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.store((io.ktor.client.plugins.cache.storage.HttpCacheStorage) null, (io.ktor.http.Url) null, (io.ktor.client.statement.HttpResponse) null, false, (kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCacheEntry>) this);
    }

    HttpCacheStorageKt$store$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1> continuation) {
        super(continuation);
    }
}
