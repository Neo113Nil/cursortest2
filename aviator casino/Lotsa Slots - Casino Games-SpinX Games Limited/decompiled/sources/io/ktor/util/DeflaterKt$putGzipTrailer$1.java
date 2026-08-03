package io.ktor.util;

/* compiled from: Deflater.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0}, l = {43, 44}, m = "putGzipTrailer", n = {"$this$putGzipTrailer", "deflater"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class DeflaterKt$putGzipTrailer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    DeflaterKt$putGzipTrailer$1(kotlin.coroutines.Continuation<? super io.ktor.util.DeflaterKt$putGzipTrailer$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object putGzipTrailer;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        putGzipTrailer = io.ktor.util.DeflaterKt.putGzipTrailer(null, null, null, this);
        return putGzipTrailer;
    }
}
