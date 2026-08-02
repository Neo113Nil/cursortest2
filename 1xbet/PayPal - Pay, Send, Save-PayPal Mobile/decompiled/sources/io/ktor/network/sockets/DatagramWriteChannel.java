package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lio/ktor/network/sockets/DatagramWriteChannel;", "", "Lio/ktor/network/sockets/Datagram;", "datagram", "", "send", "(Lio/ktor/network/sockets/Datagram;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface DatagramWriteChannel {
    kotlinx.coroutines.channels.SendChannel<io.ktor.network.sockets.Datagram> getOutgoing();

    java.lang.Object send(io.ktor.network.sockets.Datagram datagram, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.Object send(io.ktor.network.sockets.DatagramWriteChannel datagramWriteChannel, io.ktor.network.sockets.Datagram datagram, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object send = datagramWriteChannel.getOutgoing().send(datagram, continuation);
            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
        }
    }
}
