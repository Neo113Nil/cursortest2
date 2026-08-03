package io.ktor.network.sockets;

/* compiled from: ServerSocketImpl.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.ServerSocketImpl", f = "ServerSocketImpl.kt", i = {}, l = {41}, m = "acceptSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ServerSocketImpl$acceptSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.network.sockets.ServerSocketImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServerSocketImpl$acceptSuspend$1(io.ktor.network.sockets.ServerSocketImpl serverSocketImpl, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1> continuation) {
        super(continuation);
        this.this$0 = serverSocketImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object acceptSuspend;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        acceptSuspend = this.this$0.acceptSuspend(this);
        return acceptSuspend;
    }
}
