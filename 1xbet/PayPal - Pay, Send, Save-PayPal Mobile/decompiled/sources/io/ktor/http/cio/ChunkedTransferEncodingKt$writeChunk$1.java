package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 165, 167, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m = "writeChunk", n = {"$this$writeChunk", "memory", "startIndex", "endIndex", io.ktor.http.ContentDisposition.Parameters.Size, "$this$writeChunk", "memory", "startIndex", "endIndex", io.ktor.http.ContentDisposition.Parameters.Size, "$this$writeChunk", io.ktor.http.ContentDisposition.Parameters.Size, "$this$writeChunk", io.ktor.http.ContentDisposition.Parameters.Size, io.ktor.http.ContentDisposition.Parameters.Size}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "I$0", "L$0", "I$0", "I$0"})
/* loaded from: classes3.dex */
final class ChunkedTransferEncodingKt$writeChunk$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return io.ktor.http.cio.ChunkedTransferEncodingKt.access$writeChunk(null, null, 0, 0, this);
    }

    ChunkedTransferEncodingKt$writeChunk$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.ChunkedTransferEncodingKt$writeChunk$1> continuation) {
        super(continuation);
    }
}
