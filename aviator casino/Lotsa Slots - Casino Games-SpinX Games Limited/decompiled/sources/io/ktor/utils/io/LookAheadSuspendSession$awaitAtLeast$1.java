package io.ktor.utils.io;

/* compiled from: LookAheadSession.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.LookAheadSuspendSession", f = "LookAheadSession.kt", i = {0}, l = {42}, m = "awaitAtLeast", n = {"min"}, s = {"I$0"})
/* loaded from: classes6.dex */
final class LookAheadSuspendSession$awaitAtLeast$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.utils.io.LookAheadSuspendSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LookAheadSuspendSession$awaitAtLeast$1(io.ktor.utils.io.LookAheadSuspendSession lookAheadSuspendSession, kotlin.coroutines.Continuation<? super io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1> continuation) {
        super(continuation);
        this.this$0 = lookAheadSuspendSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitAtLeast(0, this);
    }
}
