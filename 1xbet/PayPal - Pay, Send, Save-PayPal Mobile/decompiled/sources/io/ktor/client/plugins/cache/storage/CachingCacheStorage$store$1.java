package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {41, 42}, m = com.google.android.libraries.places.api.model.PlaceTypes.STORE, n = {"url"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class CachingCacheStorage$store$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.plugins.cache.storage.CachingCacheStorage getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.store(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachingCacheStorage$store$1(io.ktor.client.plugins.cache.storage.CachingCacheStorage cachingCacheStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = cachingCacheStorage;
    }
}
