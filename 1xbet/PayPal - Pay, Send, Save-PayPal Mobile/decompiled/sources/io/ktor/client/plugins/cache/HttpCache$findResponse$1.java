package io.ktor.client.plugins.cache;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {1}, l = {355, 360}, m = "findResponse", n = {"requestHeaders"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class HttpCache$findResponse$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.plugins.cache.HttpCache getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(null, null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCache$findResponse$1(io.ktor.client.plugins.cache.HttpCache httpCache, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCache$findResponse$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = httpCache;
    }
}
