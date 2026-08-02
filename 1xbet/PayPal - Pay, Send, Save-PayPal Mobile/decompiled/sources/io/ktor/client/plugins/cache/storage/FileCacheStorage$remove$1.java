package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 257, 258}, m = "remove", n = {"varyKeys", "urlHex", "this_$iv", "$this$withLock_u24default$iv$iv", "varyKeys", "urlHex", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes17.dex */
final class FileCacheStorage$remove$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.client.plugins.cache.storage.FileCacheStorage getInputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputFormats.remove(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$remove$1(io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.FileCacheStorage$remove$1> continuation) {
        super(continuation);
        this.getInputFormats = fileCacheStorage;
    }
}
