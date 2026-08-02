package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m = "deleteCache", n = {"urlHex", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class FileCacheStorage$deleteCache$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.client.plugins.cache.storage.FileCacheStorage Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$deleteCache$1(io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.FileCacheStorage$deleteCache$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = fileCacheStorage;
    }
}
