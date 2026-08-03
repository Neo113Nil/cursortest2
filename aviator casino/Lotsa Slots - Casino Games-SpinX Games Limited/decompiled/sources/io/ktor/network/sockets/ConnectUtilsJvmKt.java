package io.ktor.network.sockets;

/* compiled from: ConnectUtilsJvm.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00140\u0014*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketAddress;", "remoteAddress", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "Lio/ktor/network/sockets/Socket;", "tcpConnect", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "localAddress", "Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "Lio/ktor/network/sockets/ServerSocket;", "tcpBind", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/channels/spi/SelectorProvider;", com.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Ljava/nio/channels/SocketChannel;", "kotlin.jvm.PlatformType", "openSocketChannelFor", "(Ljava/nio/channels/spi/SelectorProvider;Lio/ktor/network/sockets/SocketAddress;)Ljava/nio/channels/SocketChannel;", "Ljava/nio/channels/ServerSocketChannel;", "openServerSocketChannelFor", "(Ljava/nio/channels/spi/SelectorProvider;Lio/ktor/network/sockets/SocketAddress;)Ljava/nio/channels/ServerSocketChannel;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConnectUtilsJvmKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object tcpConnect(io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketAddress socketAddress, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Socket> continuation) {
        io.ktor.network.sockets.ConnectUtilsJvmKt$tcpConnect$1 connectUtilsJvmKt$tcpConnect$1;
        int i;
        java.io.Closeable closeable;
        if (continuation instanceof io.ktor.network.sockets.ConnectUtilsJvmKt$tcpConnect$1) {
            connectUtilsJvmKt$tcpConnect$1 = (io.ktor.network.sockets.ConnectUtilsJvmKt$tcpConnect$1) continuation;
            if ((connectUtilsJvmKt$tcpConnect$1.label & Integer.MIN_VALUE) != 0) {
                connectUtilsJvmKt$tcpConnect$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = connectUtilsJvmKt$tcpConnect$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = connectUtilsJvmKt$tcpConnect$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.nio.channels.SocketChannel openSocketChannelFor = openSocketChannelFor(selectorManager.getProvider(), socketAddress);
                    try {
                        java.nio.channels.SocketChannel socketChannel = openSocketChannelFor;
                        if (socketAddress instanceof io.ktor.network.sockets.InetSocketAddress) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(socketChannel);
                            io.ktor.network.sockets.JavaSocketOptionsKt.assignOptions(socketChannel, tCPClientSocketOptions);
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(socketChannel);
                        io.ktor.network.sockets.JavaSocketOptionsKt.nonBlocking(socketChannel);
                        io.ktor.network.sockets.SocketImpl socketImpl = new io.ktor.network.sockets.SocketImpl(socketChannel, selectorManager, tCPClientSocketOptions);
                        java.net.SocketAddress javaAddress = io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(socketAddress);
                        connectUtilsJvmKt$tcpConnect$1.L$0 = openSocketChannelFor;
                        connectUtilsJvmKt$tcpConnect$1.L$1 = socketImpl;
                        connectUtilsJvmKt$tcpConnect$1.label = 1;
                        return socketImpl.connect$ktor_network(javaAddress, connectUtilsJvmKt$tcpConnect$1) == coroutine_suspended ? coroutine_suspended : socketImpl;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        closeable = openSocketChannelFor;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    io.ktor.network.sockets.SocketImpl socketImpl2 = (io.ktor.network.sockets.SocketImpl) connectUtilsJvmKt$tcpConnect$1.L$1;
                    closeable = (java.io.Closeable) connectUtilsJvmKt$tcpConnect$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return socketImpl2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                }
                closeable.close();
                throw th;
            }
        }
        connectUtilsJvmKt$tcpConnect$1 = new io.ktor.network.sockets.ConnectUtilsJvmKt$tcpConnect$1(continuation);
        java.lang.Object obj2 = connectUtilsJvmKt$tcpConnect$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = connectUtilsJvmKt$tcpConnect$1.label;
        if (i != 0) {
        }
        closeable.close();
        throw th;
    }

    public static final java.nio.channels.SocketChannel openSocketChannelFor(java.nio.channels.spi.SelectorProvider selectorProvider, io.ktor.network.sockets.SocketAddress address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectorProvider, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        if (address instanceof io.ktor.network.sockets.InetSocketAddress) {
            return selectorProvider.openSocketChannel();
        }
        if (!(address instanceof io.ktor.network.sockets.UnixSocketAddress)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.Object invoke = java.nio.channels.spi.SelectorProvider.class.getMethod("openSocketChannel", java.net.ProtocolFamily.class).invoke(selectorProvider, java.net.StandardProtocolFamily.valueOf("UNIX"));
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.nio.channels.SocketChannel");
        return (java.nio.channels.SocketChannel) invoke;
    }

    public static final java.nio.channels.ServerSocketChannel openServerSocketChannelFor(java.nio.channels.spi.SelectorProvider selectorProvider, io.ktor.network.sockets.SocketAddress socketAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectorProvider, "<this>");
        if (socketAddress == null) {
            return selectorProvider.openServerSocketChannel();
        }
        if (socketAddress instanceof io.ktor.network.sockets.InetSocketAddress) {
            return selectorProvider.openServerSocketChannel();
        }
        if (!(socketAddress instanceof io.ktor.network.sockets.UnixSocketAddress)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.Object invoke = java.nio.channels.spi.SelectorProvider.class.getMethod("openServerSocketChannel", java.net.ProtocolFamily.class).invoke(selectorProvider, java.net.StandardProtocolFamily.valueOf("UNIX"));
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.nio.channels.ServerSocketChannel");
        return (java.nio.channels.ServerSocketChannel) invoke;
    }

    public static final java.lang.Object tcpBind(io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketAddress socketAddress, io.ktor.network.sockets.SocketOptions.AcceptorOptions acceptorOptions, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.ServerSocket> continuation) {
        java.nio.channels.ServerSocketChannel openServerSocketChannelFor = openServerSocketChannelFor(selectorManager.getProvider(), socketAddress);
        try {
            java.nio.channels.ServerSocketChannel serverSocketChannel = openServerSocketChannelFor;
            if (socketAddress instanceof io.ktor.network.sockets.InetSocketAddress) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(serverSocketChannel);
                io.ktor.network.sockets.JavaSocketOptionsKt.assignOptions(serverSocketChannel, acceptorOptions);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(serverSocketChannel);
            io.ktor.network.sockets.JavaSocketOptionsKt.nonBlocking(serverSocketChannel);
            io.ktor.network.sockets.ServerSocketImpl serverSocketImpl = new io.ktor.network.sockets.ServerSocketImpl(serverSocketChannel, selectorManager);
            if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                serverSocketImpl.getChannel().bind(socketAddress != null ? io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null, acceptorOptions.getBacklogSize());
            } else {
                serverSocketImpl.getChannel().socket().bind(socketAddress != null ? io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null, acceptorOptions.getBacklogSize());
            }
            return serverSocketImpl;
        } catch (java.lang.Throwable th) {
            openServerSocketChannelFor.close();
            throw th;
        }
    }
}
