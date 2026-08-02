package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/network/sockets/SocketAddress;", "", "port", "(Lio/ktor/network/sockets/SocketAddress;)I"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SocketAddressKt {
    public static final int port(io.ktor.network.sockets.SocketAddress socketAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketAddress, "");
        if (socketAddress instanceof io.ktor.network.sockets.InetSocketAddress) {
            return ((io.ktor.network.sockets.InetSocketAddress) socketAddress).getPort();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SocketAddress ");
        sb.append(socketAddress);
        sb.append(" does not have a port");
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }
}
