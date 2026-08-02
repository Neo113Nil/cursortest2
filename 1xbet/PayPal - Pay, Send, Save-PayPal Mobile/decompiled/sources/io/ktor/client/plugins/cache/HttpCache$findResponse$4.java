package io.ktor.client.plugins.cache;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 1}, l = {com.knotapi.knot.utilities.Constants.ID_KROGER, com.knotapi.knot.utilities.Constants.ID_KROGER}, m = "findResponse", n = {"url", "lookup", "lookup"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
final class HttpCache$findResponse$4 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.plugins.cache.HttpCache getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.cache.HttpCache.access$findResponse(this.getHighResolutionOutputSizeshNQ4ISI, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCache$findResponse$4(io.ktor.client.plugins.cache.HttpCache httpCache, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCache$findResponse$4> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = httpCache;
    }
}
