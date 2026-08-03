package io.ktor.network.sockets;

/* compiled from: Datagram.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/network/sockets/DatagramReadWriteChannel;", "Lio/ktor/network/sockets/DatagramReadChannel;", "Lio/ktor/network/sockets/DatagramWriteChannel;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DatagramReadWriteChannel extends io.ktor.network.sockets.DatagramReadChannel, io.ktor.network.sockets.DatagramWriteChannel {

    /* compiled from: Datagram.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.Object receive(io.ktor.network.sockets.DatagramReadWriteChannel datagramReadWriteChannel, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Datagram> continuation) {
            return io.ktor.network.sockets.DatagramReadChannel.DefaultImpls.receive(datagramReadWriteChannel, continuation);
        }

        public static java.lang.Object send(io.ktor.network.sockets.DatagramReadWriteChannel datagramReadWriteChannel, io.ktor.network.sockets.Datagram datagram, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object send = io.ktor.network.sockets.DatagramWriteChannel.DefaultImpls.send(datagramReadWriteChannel, datagram, continuation);
            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
        }
    }
}
