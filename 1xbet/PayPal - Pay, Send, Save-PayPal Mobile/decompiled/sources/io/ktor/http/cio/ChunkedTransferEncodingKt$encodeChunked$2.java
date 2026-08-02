package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2}, l = {175, 135, 140, 146, 146}, m = "encodeChunked", n = {"output", "input", "$this$read$iv", "output", "input", "result$iv", "buffer$iv$iv", "head$iv$iv", "output", "input"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class ChunkedTransferEncodingKt$encodeChunked$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return io.ktor.http.cio.ChunkedTransferEncodingKt.encodeChunked(null, null, this);
    }

    ChunkedTransferEncodingKt$encodeChunked$2(kotlin.coroutines.Continuation<? super io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2> continuation) {
        super(continuation);
    }
}
