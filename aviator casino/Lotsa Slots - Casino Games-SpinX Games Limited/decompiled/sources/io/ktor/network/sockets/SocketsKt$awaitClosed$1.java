package io.ktor.network.sockets;

/* compiled from: Sockets.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.SocketsKt", f = "Sockets.kt", i = {0}, l = {49}, m = "awaitClosed", n = {"$this$awaitClosed"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class SocketsKt$awaitClosed$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    SocketsKt$awaitClosed$1(kotlin.coroutines.Continuation<? super io.ktor.network.sockets.SocketsKt$awaitClosed$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.network.sockets.SocketsKt.awaitClosed(null, this);
    }
}
