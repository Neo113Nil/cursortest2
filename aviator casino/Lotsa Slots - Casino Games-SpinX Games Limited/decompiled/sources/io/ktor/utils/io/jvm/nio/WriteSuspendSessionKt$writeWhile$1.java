package io.ktor.utils.io.jvm.nio;

/* compiled from: WriteSuspendSession.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0, 0, 0}, l = {59}, m = "writeWhile", n = {"$this$writeWhile", "block", "done"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class WriteSuspendSessionKt$writeWhile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;

    WriteSuspendSessionKt$writeWhile$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt.writeWhile(null, null, this);
    }
}
