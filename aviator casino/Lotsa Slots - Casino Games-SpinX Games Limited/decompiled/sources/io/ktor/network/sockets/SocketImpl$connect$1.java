package io.ktor.network.sockets;

/* compiled from: SocketImpl.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.SocketImpl", f = "SocketImpl.kt", i = {}, l = {47, 65}, m = "connect$ktor_network", n = {}, s = {})
/* loaded from: classes6.dex */
final class SocketImpl$connect$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.network.sockets.SocketImpl<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SocketImpl$connect$1(io.ktor.network.sockets.SocketImpl<? extends S> socketImpl, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.SocketImpl$connect$1> continuation) {
        super(continuation);
        this.this$0 = socketImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.connect$ktor_network(null, this);
    }
}
