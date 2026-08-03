package io.ktor.network.sockets;

/* compiled from: SocketImpl.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Lio/ktor/network/sockets/SocketImpl;", "Ljava/nio/channels/SocketChannel;", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "Lio/ktor/network/sockets/NIOSocketImpl;", "Lio/ktor/network/sockets/Socket;", "channel", "Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "<init>", "(Ljava/nio/channels/SocketChannel;Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)V", "Ljava/net/SocketAddress;", "target", "connect$ktor_network", "(Ljava/net/SocketAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect", "", "state", "", "wantConnect", "(Z)V", "inetSelfConnect", "()Z", "Ljava/nio/channels/SocketChannel;", "getChannel", "()Ljava/nio/channels/SocketChannel;", "Lio/ktor/network/sockets/SocketAddress;", "getLocalAddress", "()Lio/ktor/network/sockets/SocketAddress;", "localAddress", "getRemoteAddress", "remoteAddress", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SocketImpl<S extends java.nio.channels.SocketChannel> extends io.ktor.network.sockets.NIOSocketImpl<S> implements io.ktor.network.sockets.Socket {
    private final S channel;

    public /* synthetic */ SocketImpl(java.nio.channels.SocketChannel socketChannel, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(socketChannel, selectorManager, (i & 4) != 0 ? null : tCPClientSocketOptions);
    }

    @Override // io.ktor.network.sockets.NIOSocketImpl, io.ktor.network.selector.Selectable
    public S getChannel() {
        return this.channel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketImpl(S channel, io.ktor.network.selector.SelectorManager selector, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        super(channel, selector, null, tCPClientSocketOptions);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        this.channel = channel;
        if (!(!getChannel().isBlocking())) {
            throw new java.lang.IllegalArgumentException("Channel need to be configured as non-blocking.".toString());
        }
    }

    @Override // io.ktor.network.sockets.ABoundSocket
    public io.ktor.network.sockets.SocketAddress getLocalAddress() {
        java.net.SocketAddress localSocketAddress;
        io.ktor.network.sockets.SocketAddress socketAddress;
        if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
            localSocketAddress = getChannel().getLocalAddress();
        } else {
            localSocketAddress = getChannel().socket().getLocalSocketAddress();
        }
        if (localSocketAddress == null || (socketAddress = io.ktor.network.sockets.JavaSocketAddressUtilsKt.toSocketAddress(localSocketAddress)) == null) {
            throw new java.lang.IllegalStateException("Channel is not yet bound");
        }
        return socketAddress;
    }

    @Override // io.ktor.network.sockets.AConnectedSocket
    public io.ktor.network.sockets.SocketAddress getRemoteAddress() {
        java.net.SocketAddress remoteSocketAddress;
        io.ktor.network.sockets.SocketAddress socketAddress;
        if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
            remoteSocketAddress = getChannel().getRemoteAddress();
        } else {
            remoteSocketAddress = getChannel().socket().getRemoteSocketAddress();
        }
        if (remoteSocketAddress == null || (socketAddress = io.ktor.network.sockets.JavaSocketAddressUtilsKt.toSocketAddress(remoteSocketAddress)) == null) {
            throw new java.lang.IllegalStateException("Channel is not yet connected");
        }
        return socketAddress;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object connect$ktor_network(java.net.SocketAddress socketAddress, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Socket> continuation) {
        io.ktor.network.sockets.SocketImpl$connect$1 socketImpl$connect$1;
        int i;
        if (continuation instanceof io.ktor.network.sockets.SocketImpl$connect$1) {
            socketImpl$connect$1 = (io.ktor.network.sockets.SocketImpl$connect$1) continuation;
            if ((socketImpl$connect$1.label & Integer.MIN_VALUE) != 0) {
                socketImpl$connect$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = socketImpl$connect$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = socketImpl$connect$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (getChannel().connect(socketAddress)) {
                        return this;
                    }
                    wantConnect(true);
                    io.ktor.network.selector.SelectInterest selectInterest = io.ktor.network.selector.SelectInterest.CONNECT;
                    socketImpl$connect$1.label = 1;
                    if (getSelector().select(this, selectInterest, socketImpl$connect$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (true) {
                    if (!getChannel().finishConnect()) {
                        if (inetSelfConnect()) {
                            if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                                getChannel().close();
                            } else {
                                getChannel().socket().close();
                            }
                        } else {
                            wantConnect(false);
                            return this;
                        }
                    } else {
                        wantConnect(true);
                        io.ktor.network.selector.SelectInterest selectInterest2 = io.ktor.network.selector.SelectInterest.CONNECT;
                        socketImpl$connect$1.label = 2;
                        if (getSelector().select(this, selectInterest2, socketImpl$connect$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
        }
        socketImpl$connect$1 = new io.ktor.network.sockets.SocketImpl$connect$1(this, continuation);
        java.lang.Object obj2 = socketImpl$connect$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = socketImpl$connect$1.label;
        if (i != 0) {
        }
        while (true) {
            if (!getChannel().finishConnect()) {
            }
        }
    }

    static /* synthetic */ void wantConnect$default(io.ktor.network.sockets.SocketImpl socketImpl, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        socketImpl.wantConnect(z);
    }

    private final void wantConnect(boolean state) {
        interestOp(io.ktor.network.selector.SelectInterest.CONNECT, state);
    }

    private final boolean inetSelfConnect() {
        java.net.SocketAddress localSocketAddress;
        java.net.SocketAddress remoteSocketAddress;
        java.lang.String str;
        java.net.InetAddress address;
        java.net.InetAddress address2;
        java.lang.String hostAddress;
        java.net.InetAddress address3;
        if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
            localSocketAddress = getChannel().getLocalAddress();
        } else {
            localSocketAddress = getChannel().socket().getLocalSocketAddress();
        }
        if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
            remoteSocketAddress = getChannel().getRemoteAddress();
        } else {
            remoteSocketAddress = getChannel().socket().getRemoteSocketAddress();
        }
        if (localSocketAddress == null || remoteSocketAddress == null) {
            throw new java.lang.IllegalStateException("localAddress and remoteAddress should not be null.");
        }
        java.net.InetSocketAddress inetSocketAddress = localSocketAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) localSocketAddress : null;
        java.net.InetSocketAddress inetSocketAddress2 = remoteSocketAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) remoteSocketAddress : null;
        if (inetSocketAddress == null && inetSocketAddress2 == null) {
            return false;
        }
        java.lang.String str2 = "";
        if (inetSocketAddress == null || (address3 = inetSocketAddress.getAddress()) == null || (str = address3.getHostAddress()) == null) {
            str = "";
        }
        if (inetSocketAddress2 != null && (address2 = inetSocketAddress2.getAddress()) != null && (hostAddress = address2.getHostAddress()) != null) {
            str2 = hostAddress;
        }
        boolean isAnyLocalAddress = (inetSocketAddress2 == null || (address = inetSocketAddress2.getAddress()) == null) ? false : address.isAnyLocalAddress();
        if (kotlin.jvm.internal.Intrinsics.areEqual(inetSocketAddress != null ? java.lang.Integer.valueOf(inetSocketAddress.getPort()) : null, inetSocketAddress2 != null ? java.lang.Integer.valueOf(inetSocketAddress2.getPort()) : null)) {
            return isAnyLocalAddress || kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
        }
        return false;
    }
}
