package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {63, 64}, m = "remove", n = {"url"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class CachingCacheStorage$remove$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.client.plugins.cache.storage.CachingCacheStorage Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.remove(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachingCacheStorage$remove$1(io.ktor.client.plugins.cache.storage.CachingCacheStorage cachingCacheStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachingCacheStorage$remove$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = cachingCacheStorage;
    }
}
