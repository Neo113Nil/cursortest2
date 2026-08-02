package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {72, 81, 82, 87, 101, 101}, m = "decodeChunked", n = {"input", "out", "chunkSizeBuffer", "totalBytesCopied", "input", "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize", "input", "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize", "input", "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1"})
/* loaded from: classes3.dex */
final class ChunkedTransferEncodingKt$decodeChunked$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return io.ktor.http.cio.ChunkedTransferEncodingKt.decodeChunked((io.ktor.utils.io.ByteReadChannel) null, (io.ktor.utils.io.ByteWriteChannel) null, this);
    }

    ChunkedTransferEncodingKt$decodeChunked$2(kotlin.coroutines.Continuation<? super io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2> continuation) {
        super(continuation);
    }
}
