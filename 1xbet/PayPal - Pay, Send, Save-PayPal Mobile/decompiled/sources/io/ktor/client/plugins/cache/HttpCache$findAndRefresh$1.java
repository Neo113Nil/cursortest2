package io.ktor.client.plugins.cache;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 0, 1, 1, 1}, l = {343, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD}, m = "findAndRefresh", n = {"request", "response", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "request", "response", com.datadog.trace.api.DDSpanTypes.CACHE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class HttpCache$findAndRefresh$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.client.plugins.cache.HttpCache getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.cache.HttpCache.access$findAndRefresh(this.getOutputMinFrameDuration, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCache$findAndRefresh$1(io.ktor.client.plugins.cache.HttpCache httpCache, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = httpCache;
    }
}
