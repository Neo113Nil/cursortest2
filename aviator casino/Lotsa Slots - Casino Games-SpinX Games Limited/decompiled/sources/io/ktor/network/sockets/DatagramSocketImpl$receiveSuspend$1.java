package io.ktor.network.sockets;

/* compiled from: DatagramSocketImpl.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.DatagramSocketImpl", f = "DatagramSocketImpl.kt", i = {0}, l = {90}, m = "receiveSuspend", n = {"buffer"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class DatagramSocketImpl$receiveSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.network.sockets.DatagramSocketImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSocketImpl$receiveSuspend$1(io.ktor.network.sockets.DatagramSocketImpl datagramSocketImpl, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.DatagramSocketImpl$receiveSuspend$1> continuation) {
        super(continuation);
        this.this$0 = datagramSocketImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object receiveSuspend;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        receiveSuspend = this.this$0.receiveSuspend(null, this);
        return receiveSuspend;
    }
}
