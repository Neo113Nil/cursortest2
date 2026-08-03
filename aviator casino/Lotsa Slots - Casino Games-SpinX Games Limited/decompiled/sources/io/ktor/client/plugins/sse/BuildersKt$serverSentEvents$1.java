package io.ktor.client.plugins.sse;

/* compiled from: builders.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt", f = "builders.kt", i = {0, 1}, l = {173, 175}, m = "serverSentEvents-mY9Nd3A", n = {"block", "session"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
final class BuildersKt$serverSentEvents$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    BuildersKt$serverSentEvents$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.sse.BuildersKt.m10630serverSentEventsmY9Nd3A(null, null, null, null, null, null, this);
    }
}
