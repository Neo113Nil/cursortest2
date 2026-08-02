package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {47}, m = "find", n = {"url", "varyKeys"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class CachingCacheStorage$find$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ io.ktor.client.plugins.cache.storage.CachingCacheStorage getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.find(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachingCacheStorage$find$1(io.ktor.client.plugins.cache.storage.CachingCacheStorage cachingCacheStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = cachingCacheStorage;
    }
}
