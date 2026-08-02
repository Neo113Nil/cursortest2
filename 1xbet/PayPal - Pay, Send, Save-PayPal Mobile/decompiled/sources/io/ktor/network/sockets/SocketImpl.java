package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00028\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Lio/ktor/network/sockets/SocketImpl;", "Ljava/nio/channels/SocketChannel;", "S", "Lio/ktor/network/sockets/NIOSocketImpl;", "Lio/ktor/network/sockets/Socket;", "channel", "Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "<init>", "(Ljava/nio/channels/SocketChannel;Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)V", "Ljava/net/SocketAddress;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "connect$ktor_network", "(Ljava/net/SocketAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/channels/SocketChannel;", "getChannel", "()Ljava/nio/channels/SocketChannel;", "Lio/ktor/network/sockets/SocketAddress;", "getLocalAddress", "()Lio/ktor/network/sockets/SocketAddress;", "localAddress", "getRemoteAddress", "remoteAddress"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SocketImpl<S extends java.nio.channels.SocketChannel> extends io.ktor.network.sockets.NIOSocketImpl<S> implements io.ktor.network.sockets.Socket {
    private final S channel;

    public /* synthetic */ SocketImpl(java.nio.channels.SocketChannel socketChannel, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(socketChannel, selectorManager, (i & 4) != 0 ? null : tCPClientSocketOptions);
    }

    @Override // io.ktor.network.sockets.NIOSocketImpl, io.ktor.network.selector.Selectable
    public final S getChannel() {
        return this.channel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketImpl(S s, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        super(s, selectorManager, null, tCPClientSocketOptions);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectorManager, "");
        this.channel = s;
        if (getChannel().isBlocking()) {
            throw new java.lang.IllegalArgumentException("Channel need to be configured as non-blocking.".toString());
        }
    }

    @Override // io.ktor.network.sockets.ABoundSocket
    public final io.ktor.network.sockets.SocketAddress getLocalAddress() {
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
    public final io.ktor.network.sockets.SocketAddress getRemoteAddress() {
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0149, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0132, code lost:
    
        throw new java.lang.IllegalStateException("localAddress and remoteAddress should not be null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0058, code lost:
    
        if (getSelector().select(r9, r2, r0) != r1) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object connect$ktor_network(java.net.SocketAddress socketAddress, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Socket> continuation) {
        io.ktor.network.sockets.SocketImpl$connect$1 socketImpl$connect$1;
        int i;
        java.net.SocketAddress localSocketAddress;
        java.net.SocketAddress remoteSocketAddress;
        java.lang.String str;
        java.net.InetAddress address;
        java.net.InetAddress address2;
        java.lang.String hostAddress;
        java.net.InetAddress address3;
        if (continuation instanceof io.ktor.network.sockets.SocketImpl$connect$1) {
            socketImpl$connect$1 = (io.ktor.network.sockets.SocketImpl$connect$1) continuation;
            if ((socketImpl$connect$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                socketImpl$connect$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = socketImpl$connect$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = socketImpl$connect$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (getChannel().connect(socketAddress)) {
                        return this;
                    }
                    interestOp(io.ktor.network.selector.SelectInterest.CONNECT, true);
                    io.ktor.network.selector.SelectInterest selectInterest = io.ktor.network.selector.SelectInterest.CONNECT;
                    socketImpl$connect$1.getHighSpeedVideoFpsRanges = 1;
                } else {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (true) {
                    if (!getChannel().finishConnect()) {
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
                        if (localSocketAddress != null && remoteSocketAddress != null) {
                            java.net.InetSocketAddress inetSocketAddress = localSocketAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) localSocketAddress : null;
                            java.net.InetSocketAddress inetSocketAddress2 = remoteSocketAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) remoteSocketAddress : null;
                            if (inetSocketAddress != null || inetSocketAddress2 != null) {
                                java.lang.String str2 = "";
                                if (inetSocketAddress == null || (address3 = inetSocketAddress.getAddress()) == null || (str = address3.getHostAddress()) == null) {
                                    str = "";
                                }
                                if (inetSocketAddress2 != null && (address2 = inetSocketAddress2.getAddress()) != null && (hostAddress = address2.getHostAddress()) != null) {
                                    str2 = hostAddress;
                                }
                                boolean isAnyLocalAddress = (inetSocketAddress2 == null || (address = inetSocketAddress2.getAddress()) == null) ? false : address.isAnyLocalAddress();
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(inetSocketAddress != null ? java.lang.Integer.valueOf(inetSocketAddress.getPort()) : null, inetSocketAddress2 != null ? java.lang.Integer.valueOf(inetSocketAddress2.getPort()) : null) || (!isAnyLocalAddress && !kotlin.jvm.internal.Intrinsics.areEqual(str, str2))) {
                                    break;
                                }
                                if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                                    getChannel().close();
                                } else {
                                    getChannel().socket().close();
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        interestOp(io.ktor.network.selector.SelectInterest.CONNECT, true);
                        io.ktor.network.selector.SelectInterest selectInterest2 = io.ktor.network.selector.SelectInterest.CONNECT;
                        socketImpl$connect$1.getHighSpeedVideoFpsRanges = 2;
                        if (getSelector().select(this, selectInterest2, socketImpl$connect$1) == coroutine_suspended) {
                            break;
                        }
                    }
                }
                interestOp(io.ktor.network.selector.SelectInterest.CONNECT, false);
                return this;
            }
        }
        socketImpl$connect$1 = new io.ktor.network.sockets.SocketImpl$connect$1(this, continuation);
        java.lang.Object obj2 = socketImpl$connect$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = socketImpl$connect$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        while (true) {
            if (!getChannel().finishConnect()) {
            }
        }
        interestOp(io.ktor.network.selector.SelectInterest.CONNECT, false);
        return this;
    }
}
