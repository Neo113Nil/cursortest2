package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChunkedTransferEncoding.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2}, l = {175, 135, 140, 146, 146}, m = "encodeChunked", n = {"output", "input", "$this$read$iv", "output", "input", "result$iv", "buffer$iv$iv", "head$iv$iv", "output", "input"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
/* loaded from: classes7.dex */
final class ChunkedTransferEncodingKt$encodeChunked$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    ChunkedTransferEncodingKt$encodeChunked$2(Continuation<? super ChunkedTransferEncodingKt$encodeChunked$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChunkedTransferEncodingKt.encodeChunked(null, null, this);
    }
}
