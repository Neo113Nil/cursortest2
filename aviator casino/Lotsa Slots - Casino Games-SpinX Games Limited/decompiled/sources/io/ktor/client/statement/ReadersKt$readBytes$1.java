package io.ktor.client.statement;

/* compiled from: Readers.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {17}, m = "readBytes", n = {}, s = {})
/* loaded from: classes6.dex */
final class ReadersKt$readBytes$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    ReadersKt$readBytes$1(kotlin.coroutines.Continuation<? super io.ktor.client.statement.ReadersKt$readBytes$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.client.statement.ReadersKt.readBytes(null, 0, this);
    }
}
