package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004"}, d2 = {"Lio/ktor/network/sockets/Socket;", "Lio/ktor/network/sockets/ReadWriteSocket;", "Lio/ktor/network/sockets/ABoundSocket;", "Lio/ktor/network/sockets/AConnectedSocket;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Socket extends io.ktor.network.sockets.ReadWriteSocket, io.ktor.network.sockets.ABoundSocket, io.ktor.network.sockets.AConnectedSocket, kotlinx.coroutines.CoroutineScope {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void dispose(io.ktor.network.sockets.Socket socket) {
            io.ktor.network.sockets.ReadWriteSocket.DefaultImpls.dispose(socket);
        }
    }
}
