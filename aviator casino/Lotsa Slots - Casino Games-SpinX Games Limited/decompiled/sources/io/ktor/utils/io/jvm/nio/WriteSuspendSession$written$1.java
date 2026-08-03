package io.ktor.utils.io.jvm.nio;

/* compiled from: WriteSuspendSession.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSession", f = "WriteSuspendSession.kt", i = {}, l = {30, 32}, m = "written", n = {}, s = {})
/* loaded from: classes6.dex */
final class WriteSuspendSession$written$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.utils.io.jvm.nio.WriteSuspendSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteSuspendSession$written$1(io.ktor.utils.io.jvm.nio.WriteSuspendSession writeSuspendSession, kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1> continuation) {
        super(continuation);
        this.this$0 = writeSuspendSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.written(0, this);
    }
}
