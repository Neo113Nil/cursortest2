package io.ktor.network.sockets;

import com.facebook.appevents.integrity.IntegrityManager;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import java.io.Closeable;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConnectUtilsJvm.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00140\u0014*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketAddress;", "remoteAddress", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "Lio/ktor/network/sockets/Socket;", "tcpConnect", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "localAddress", "Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "Lio/ktor/network/sockets/ServerSocket;", "tcpBind", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/channels/spi/SelectorProvider;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Ljava/nio/channels/SocketChannel;", "kotlin.jvm.PlatformType", "openSocketChannelFor", "(Ljava/nio/channels/spi/SelectorProvider;Lio/ktor/network/sockets/SocketAddress;)Ljava/nio/channels/SocketChannel;", "Ljava/nio/channels/ServerSocketChannel;", "openServerSocketChannelFor", "(Ljava/nio/channels/spi/SelectorProvider;Lio/ktor/network/sockets/SocketAddress;)Ljava/nio/channels/ServerSocketChannel;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConnectUtilsJvmKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object tcpConnect(SelectorManager selectorManager, SocketAddress socketAddress, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, Continuation<? super Socket> continuation) {
        ConnectUtilsJvmKt$tcpConnect$1 connectUtilsJvmKt$tcpConnect$1;
        int i;
        Closeable closeable;
        if (continuation instanceof ConnectUtilsJvmKt$tcpConnect$1) {
            connectUtilsJvmKt$tcpConnect$1 = (ConnectUtilsJvmKt$tcpConnect$1) continuation;
            if ((connectUtilsJvmKt$tcpConnect$1.label & Integer.MIN_VALUE) != 0) {
                connectUtilsJvmKt$tcpConnect$1.label -= Integer.MIN_VALUE;
                Object obj = connectUtilsJvmKt$tcpConnect$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = connectUtilsJvmKt$tcpConnect$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SocketChannel openSocketChannelFor = openSocketChannelFor(selectorManager.getProvider(), socketAddress);
                    try {
                        SocketChannel socketChannel = openSocketChannelFor;
                        if (socketAddress instanceof InetSocketAddress) {
                            Intrinsics.checkNotNull(socketChannel);
                            JavaSocketOptionsKt.assignOptions(socketChannel, tCPClientSocketOptions);
                        }
                        Intrinsics.checkNotNull(socketChannel);
                        JavaSocketOptionsKt.nonBlocking(socketChannel);
                        SocketImpl socketImpl = new SocketImpl(socketChannel, selectorManager, tCPClientSocketOptions);
                        java.net.SocketAddress javaAddress = JavaSocketAddressUtilsKt.toJavaAddress(socketAddress);
                        connectUtilsJvmKt$tcpConnect$1.L$0 = openSocketChannelFor;
                        connectUtilsJvmKt$tcpConnect$1.L$1 = socketImpl;
                        connectUtilsJvmKt$tcpConnect$1.label = 1;
                        return socketImpl.connect$ktor_network(javaAddress, connectUtilsJvmKt$tcpConnect$1) == coroutine_suspended ? coroutine_suspended : socketImpl;
                    } catch (Throwable th) {
                        th = th;
                        closeable = openSocketChannelFor;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SocketImpl socketImpl2 = (SocketImpl) connectUtilsJvmKt$tcpConnect$1.L$1;
                    closeable = (Closeable) connectUtilsJvmKt$tcpConnect$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return socketImpl2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                closeable.close();
                throw th;
            }
        }
        connectUtilsJvmKt$tcpConnect$1 = new ConnectUtilsJvmKt$tcpConnect$1(continuation);
        Object obj2 = connectUtilsJvmKt$tcpConnect$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = connectUtilsJvmKt$tcpConnect$1.label;
        if (i != 0) {
        }
        closeable.close();
        throw th;
    }

    public static final SocketChannel openSocketChannelFor(SelectorProvider selectorProvider, SocketAddress address) {
        Intrinsics.checkNotNullParameter(selectorProvider, "<this>");
        Intrinsics.checkNotNullParameter(address, "address");
        if (address instanceof InetSocketAddress) {
            return selectorProvider.openSocketChannel();
        }
        if (!(address instanceof UnixSocketAddress)) {
            throw new NoWhenBranchMatchedException();
        }
        Object invoke = SelectorProvider.class.getMethod("openSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.nio.channels.SocketChannel");
        return (SocketChannel) invoke;
    }

    public static final ServerSocketChannel openServerSocketChannelFor(SelectorProvider selectorProvider, SocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(selectorProvider, "<this>");
        if (socketAddress == null) {
            return selectorProvider.openServerSocketChannel();
        }
        if (socketAddress instanceof InetSocketAddress) {
            return selectorProvider.openServerSocketChannel();
        }
        if (!(socketAddress instanceof UnixSocketAddress)) {
            throw new NoWhenBranchMatchedException();
        }
        Object invoke = SelectorProvider.class.getMethod("openServerSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.nio.channels.ServerSocketChannel");
        return (ServerSocketChannel) invoke;
    }

    public static final Object tcpBind(SelectorManager selectorManager, SocketAddress socketAddress, SocketOptions.AcceptorOptions acceptorOptions, Continuation<? super ServerSocket> continuation) {
        ServerSocketChannel openServerSocketChannelFor = openServerSocketChannelFor(selectorManager.getProvider(), socketAddress);
        try {
            ServerSocketChannel serverSocketChannel = openServerSocketChannelFor;
            if (socketAddress instanceof InetSocketAddress) {
                Intrinsics.checkNotNull(serverSocketChannel);
                JavaSocketOptionsKt.assignOptions(serverSocketChannel, acceptorOptions);
            }
            Intrinsics.checkNotNull(serverSocketChannel);
            JavaSocketOptionsKt.nonBlocking(serverSocketChannel);
            ServerSocketImpl serverSocketImpl = new ServerSocketImpl(serverSocketChannel, selectorManager);
            if (JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                serverSocketImpl.getChannel().bind(socketAddress != null ? JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null, acceptorOptions.getBacklogSize());
            } else {
                serverSocketImpl.getChannel().socket().bind(socketAddress != null ? JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null, acceptorOptions.getBacklogSize());
            }
            return serverSocketImpl;
        } catch (Throwable th) {
            openServerSocketChannelFor.close();
            throw th;
        }
    }
}
