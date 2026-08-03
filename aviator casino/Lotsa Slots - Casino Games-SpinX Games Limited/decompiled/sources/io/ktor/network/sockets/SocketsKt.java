package io.ktor.network.sockets;

/* compiled from: Sockets.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0012\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0018\u001a\u00020\u0015*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/ktor/network/sockets/ASocket;", "", "awaitClosed", "(Lio/ktor/network/sockets/ASocket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/network/sockets/AReadable;", "Lio/ktor/utils/io/ByteReadChannel;", "openReadChannel", "(Lio/ktor/network/sockets/AReadable;)Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/network/sockets/AWritable;", "", "autoFlush", "Lio/ktor/utils/io/ByteWriteChannel;", "openWriteChannel", "(Lio/ktor/network/sockets/AWritable;Z)Lio/ktor/utils/io/ByteWriteChannel;", "Lio/ktor/network/sockets/Socket;", "Lio/ktor/network/sockets/Connection;", "connection", "(Lio/ktor/network/sockets/Socket;)Lio/ktor/network/sockets/Connection;", "isClosed", "(Lio/ktor/network/sockets/ASocket;)Z", "Lio/ktor/network/sockets/ServerSocket;", "", "getPort", "(Lio/ktor/network/sockets/ServerSocket;)I", "port", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SocketsKt {
    public static final boolean isClosed(io.ktor.network.sockets.ASocket aSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aSocket, "<this>");
        return aSocket.getSocketContext().isCompleted();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitClosed(io.ktor.network.sockets.ASocket aSocket, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.network.sockets.SocketsKt$awaitClosed$1 socketsKt$awaitClosed$1;
        int i;
        if (continuation instanceof io.ktor.network.sockets.SocketsKt$awaitClosed$1) {
            socketsKt$awaitClosed$1 = (io.ktor.network.sockets.SocketsKt$awaitClosed$1) continuation;
            if ((socketsKt$awaitClosed$1.label & Integer.MIN_VALUE) != 0) {
                socketsKt$awaitClosed$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = socketsKt$awaitClosed$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = socketsKt$awaitClosed$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job socketContext = aSocket.getSocketContext();
                    socketsKt$awaitClosed$1.L$0 = aSocket;
                    socketsKt$awaitClosed$1.label = 1;
                    if (socketContext.join(socketsKt$awaitClosed$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aSocket = (io.ktor.network.sockets.ASocket) socketsKt$awaitClosed$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!aSocket.getSocketContext().isCancelled()) {
                    throw aSocket.getSocketContext().getCancellationException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        socketsKt$awaitClosed$1 = new io.ktor.network.sockets.SocketsKt$awaitClosed$1(continuation);
        java.lang.Object obj2 = socketsKt$awaitClosed$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = socketsKt$awaitClosed$1.label;
        if (i != 0) {
        }
        if (!aSocket.getSocketContext().isCancelled()) {
        }
    }

    public static final io.ktor.utils.io.ByteReadChannel openReadChannel(io.ktor.network.sockets.AReadable aReadable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aReadable, "<this>");
        io.ktor.utils.io.ByteChannel byteChannel = new io.ktor.utils.io.ByteChannel(false);
        aReadable.attachForReading(byteChannel);
        return byteChannel;
    }

    public static /* synthetic */ io.ktor.utils.io.ByteWriteChannel openWriteChannel$default(io.ktor.network.sockets.AWritable aWritable, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return openWriteChannel(aWritable, z);
    }

    public static final io.ktor.utils.io.ByteWriteChannel openWriteChannel(io.ktor.network.sockets.AWritable aWritable, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aWritable, "<this>");
        io.ktor.utils.io.ByteChannel byteChannel = new io.ktor.utils.io.ByteChannel(z);
        aWritable.attachForWriting(byteChannel);
        return byteChannel;
    }

    public static final int getPort(io.ktor.network.sockets.ServerSocket serverSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSocket, "<this>");
        return io.ktor.network.sockets.SocketAddressKt.port(serverSocket.getLocalAddress());
    }

    public static final io.ktor.network.sockets.Connection connection(io.ktor.network.sockets.Socket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "<this>");
        return new io.ktor.network.sockets.Connection(socket, openReadChannel(socket), openWriteChannel$default(socket, false, 1, null));
    }
}
