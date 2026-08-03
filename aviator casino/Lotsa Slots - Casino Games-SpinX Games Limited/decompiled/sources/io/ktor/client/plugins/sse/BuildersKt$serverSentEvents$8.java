package io.ktor.client.plugins.sse;

/* compiled from: builders.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt", f = "builders.kt", i = {0, 1}, l = {648, 650}, m = "serverSentEvents-Mswn-_c", n = {"block", "session"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
final class BuildersKt$serverSentEvents$8 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    BuildersKt$serverSentEvents$8(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.sse.BuildersKt.m10628serverSentEventsMswn_c(null, null, null, null, null, null, null, this);
    }
}
