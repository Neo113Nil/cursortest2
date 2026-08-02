package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0, 1, 1, 1, 2, 3}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 134, 134, 137}, m = "parsePartBodyImpl", n = {"output", "boundaryPrefixed", "input", "output", "output", "byteCount"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "J$0"})
/* loaded from: classes17.dex */
final class MultipartKt$parsePartBodyImpl$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return io.ktor.http.cio.MultipartKt.access$parsePartBodyImpl(null, null, null, null, 0L, this);
    }

    MultipartKt$parsePartBodyImpl$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1> continuation) {
        super(continuation);
    }
}
