package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003"}, d2 = {"Lio/ktor/network/sockets/ServerSocket;", "Lio/ktor/network/sockets/ASocket;", "Lio/ktor/network/sockets/ABoundSocket;", "Lio/ktor/network/sockets/Acceptable;", "Lio/ktor/network/sockets/Socket;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ServerSocket extends io.ktor.network.sockets.ASocket, io.ktor.network.sockets.ABoundSocket, io.ktor.network.sockets.Acceptable<io.ktor.network.sockets.Socket> {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void dispose(io.ktor.network.sockets.ServerSocket serverSocket) {
            io.ktor.network.sockets.ASocket.DefaultImpls.dispose(serverSocket);
        }
    }
}
