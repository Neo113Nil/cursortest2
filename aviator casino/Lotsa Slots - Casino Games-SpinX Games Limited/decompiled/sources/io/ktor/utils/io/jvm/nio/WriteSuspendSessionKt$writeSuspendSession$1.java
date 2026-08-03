package io.ktor.utils.io.jvm.nio;

/* compiled from: WriteSuspendSession.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0}, l = {43, 45, 45}, m = "writeSuspendSession", n = {"$this$writeSuspendSession"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class WriteSuspendSessionKt$writeSuspendSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    WriteSuspendSessionKt$writeSuspendSession$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt.writeSuspendSession(null, null, this);
    }
}
