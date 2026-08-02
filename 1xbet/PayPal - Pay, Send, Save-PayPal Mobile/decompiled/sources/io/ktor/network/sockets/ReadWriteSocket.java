package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003"}, d2 = {"Lio/ktor/network/sockets/ReadWriteSocket;", "Lio/ktor/network/sockets/ASocket;", "Lio/ktor/network/sockets/AReadable;", "Lio/ktor/network/sockets/AWritable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ReadWriteSocket extends io.ktor.network.sockets.ASocket, io.ktor.network.sockets.AReadable, io.ktor.network.sockets.AWritable {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void dispose(io.ktor.network.sockets.ReadWriteSocket readWriteSocket) {
            io.ktor.network.sockets.ASocket.DefaultImpls.dispose(readWriteSocket);
        }
    }
}
