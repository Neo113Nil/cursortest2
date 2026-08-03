package io.ktor.http.cio;

/* compiled from: ChunkedTransferEncoding.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4}, l = {164, 165, 167, 168, 169}, m = "writeChunk", n = {"$this$writeChunk", "memory", "startIndex", "endIndex", "size", "$this$writeChunk", "memory", "startIndex", "endIndex", "size", "$this$writeChunk", "size", "$this$writeChunk", "size", "size"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "I$0", "L$0", "I$0", "I$0"})
/* loaded from: classes6.dex */
final class ChunkedTransferEncodingKt$writeChunk$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    ChunkedTransferEncodingKt$writeChunk$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.ChunkedTransferEncodingKt$writeChunk$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.http.cio.ChunkedTransferEncodingKt.writeChunk(null, null, 0, 0, this);
    }
}
