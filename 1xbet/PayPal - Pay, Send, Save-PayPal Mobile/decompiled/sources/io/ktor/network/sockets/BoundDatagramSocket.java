package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003"}, d2 = {"Lio/ktor/network/sockets/BoundDatagramSocket;", "Lio/ktor/network/sockets/ASocket;", "Lio/ktor/network/sockets/ABoundSocket;", "Lio/ktor/network/sockets/DatagramReadWriteChannel;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface BoundDatagramSocket extends io.ktor.network.sockets.ASocket, io.ktor.network.sockets.ABoundSocket, io.ktor.network.sockets.DatagramReadWriteChannel {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void dispose(io.ktor.network.sockets.BoundDatagramSocket boundDatagramSocket) {
            io.ktor.network.sockets.ASocket.DefaultImpls.dispose(boundDatagramSocket);
        }

        public static java.lang.Object receive(io.ktor.network.sockets.BoundDatagramSocket boundDatagramSocket, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Datagram> continuation) {
            return io.ktor.network.sockets.DatagramReadWriteChannel.DefaultImpls.receive(boundDatagramSocket, continuation);
        }

        public static java.lang.Object send(io.ktor.network.sockets.BoundDatagramSocket boundDatagramSocket, io.ktor.network.sockets.Datagram datagram, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object send = io.ktor.network.sockets.DatagramReadWriteChannel.DefaultImpls.send(boundDatagramSocket, datagram, continuation);
            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
        }
    }
}
