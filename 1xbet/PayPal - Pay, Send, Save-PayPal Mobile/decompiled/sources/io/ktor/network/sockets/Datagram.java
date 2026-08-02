package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lio/ktor/network/sockets/Datagram;", "", "Lkotlinx/io/Source;", "packet", "Lio/ktor/network/sockets/SocketAddress;", "address", "<init>", "(Lkotlinx/io/Source;Lio/ktor/network/sockets/SocketAddress;)V", "Lkotlinx/io/Source;", "getPacket", "()Lkotlinx/io/Source;", "Lio/ktor/network/sockets/SocketAddress;", "getAddress", "()Lio/ktor/network/sockets/SocketAddress;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Datagram {
    private final io.ktor.network.sockets.SocketAddress address;
    private final kotlinx.io.Source packet;

    public Datagram(kotlinx.io.Source source, io.ktor.network.sockets.SocketAddress socketAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketAddress, "");
        this.packet = source;
        this.address = socketAddress;
        if (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(source) <= okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Datagram size limit exceeded: ");
        sb.append(io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(source));
        sb.append(" of possible 65535");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public final kotlinx.io.Source getPacket() {
        return this.packet;
    }

    public final io.ktor.network.sockets.SocketAddress getAddress() {
        return this.address;
    }
}
