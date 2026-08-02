package io.ktor.client.plugins.cache;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCacheEntryKt", f = "HttpCacheEntry.kt", i = {0, 0}, l = {18}, m = "HttpCacheEntry", n = {"response", "isShared"}, s = {"L$0", "Z$0"})
/* loaded from: classes3.dex */
final class HttpCacheEntryKt$HttpCacheEntry$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.cache.HttpCacheEntryKt.HttpCacheEntry(false, null, this);
    }

    HttpCacheEntryKt$HttpCacheEntry$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1> continuation) {
        super(continuation);
    }
}
