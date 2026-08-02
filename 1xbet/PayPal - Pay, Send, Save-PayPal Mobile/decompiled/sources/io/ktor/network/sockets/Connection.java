package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/network/sockets/Connection;", "", "Lio/ktor/network/sockets/Socket;", "socket", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "<init>", "(Lio/ktor/network/sockets/Socket;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;)V", "Lio/ktor/network/sockets/Socket;", "getSocket", "()Lio/ktor/network/sockets/Socket;", "Lio/ktor/utils/io/ByteReadChannel;", "getInput", "()Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "getOutput", "()Lio/ktor/utils/io/ByteWriteChannel;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Connection {
    private final io.ktor.utils.io.ByteReadChannel input;
    private final io.ktor.utils.io.ByteWriteChannel output;
    private final io.ktor.network.sockets.Socket socket;

    public Connection(io.ktor.network.sockets.Socket socket, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        this.socket = socket;
        this.input = byteReadChannel;
        this.output = byteWriteChannel;
    }

    public final io.ktor.network.sockets.Socket getSocket() {
        return this.socket;
    }

    public final io.ktor.utils.io.ByteReadChannel getInput() {
        return this.input;
    }

    public final io.ktor.utils.io.ByteWriteChannel getOutput() {
        return this.output;
    }
}
