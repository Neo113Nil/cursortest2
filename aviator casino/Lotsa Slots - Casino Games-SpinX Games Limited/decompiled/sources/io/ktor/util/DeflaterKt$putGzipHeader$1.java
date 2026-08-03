package io.ktor.util;

/* compiled from: Deflater.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 1}, l = {37, 38, 39}, m = "putGzipHeader", n = {"$this$putGzipHeader", "$this$putGzipHeader"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
final class DeflaterKt$putGzipHeader$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    DeflaterKt$putGzipHeader$1(kotlin.coroutines.Continuation<? super io.ktor.util.DeflaterKt$putGzipHeader$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object putGzipHeader;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        putGzipHeader = io.ktor.util.DeflaterKt.putGzipHeader(null, this);
        return putGzipHeader;
    }
}
