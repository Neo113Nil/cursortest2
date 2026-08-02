package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {68}, m = "removeAll", n = {"url"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class CachingCacheStorage$removeAll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.plugins.cache.storage.CachingCacheStorage getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.removeAll(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachingCacheStorage$removeAll$1(io.ktor.client.plugins.cache.storage.CachingCacheStorage cachingCacheStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachingCacheStorage$removeAll$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = cachingCacheStorage;
    }
}
