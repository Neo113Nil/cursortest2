package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0, 0, 0, 0, 1}, l = {159, 171}, m = com.google.android.libraries.places.api.model.PlaceTypes.STORE, n = {"$this$store", "response", "varyKeys", "url", "isShared", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0"})
/* loaded from: classes3.dex */
final class HttpCacheStorageKt$store$3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.store((io.ktor.client.plugins.cache.storage.CacheStorage) null, (io.ktor.client.statement.HttpResponse) null, (java.util.Map<java.lang.String, java.lang.String>) null, false, (kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData>) this);
    }

    HttpCacheStorageKt$store$3(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3> continuation) {
        super(continuation);
    }
}
