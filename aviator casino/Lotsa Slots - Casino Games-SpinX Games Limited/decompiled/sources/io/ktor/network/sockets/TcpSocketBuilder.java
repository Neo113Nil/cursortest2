package io.ktor.network.sockets;

/* compiled from: TcpSocketBuilder.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086@¢\u0006\u0004\b\u0016\u0010\u0013J3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0019J7\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086@¢\u0006\u0004\b\u0016\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lio/ktor/network/sockets/TcpSocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "Lio/ktor/network/selector/SelectorManager;", "selector", "options", "<init>", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;)V", "", "hostname", "", "port", "Lkotlin/Function1;", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "", "Lkotlin/ExtensionFunctionType;", "configure", "Lio/ktor/network/sockets/Socket;", "connect", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "Lio/ktor/network/sockets/ServerSocket;", "bind", "Lio/ktor/network/sockets/SocketAddress;", "remoteAddress", "(Lio/ktor/network/sockets/SocketAddress;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "localAddress", "Lio/ktor/network/selector/SelectorManager;", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "getOptions", "()Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "setOptions", "(Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;)V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TcpSocketBuilder implements io.ktor.network.sockets.Configurable<io.ktor.network.sockets.TcpSocketBuilder, io.ktor.network.sockets.SocketOptions.PeerSocketOptions> {
    private io.ktor.network.sockets.SocketOptions.PeerSocketOptions options;
    private final io.ktor.network.selector.SelectorManager selector;

    public TcpSocketBuilder(io.ktor.network.selector.SelectorManager selector, io.ktor.network.sockets.SocketOptions.PeerSocketOptions options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        this.selector = selector;
        this.options = options;
    }

    @Override // io.ktor.network.sockets.Configurable
    public io.ktor.network.sockets.TcpSocketBuilder configure(kotlin.jvm.functions.Function1<? super io.ktor.network.sockets.SocketOptions.PeerSocketOptions, kotlin.Unit> function1) {
        return (io.ktor.network.sockets.TcpSocketBuilder) io.ktor.network.sockets.Configurable.DefaultImpls.configure(this, function1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.network.sockets.Configurable
    public io.ktor.network.sockets.SocketOptions.PeerSocketOptions getOptions() {
        return this.options;
    }

    @Override // io.ktor.network.sockets.Configurable
    public void setOptions(io.ktor.network.sockets.SocketOptions.PeerSocketOptions peerSocketOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peerSocketOptions, "<set-?>");
        this.options = peerSocketOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object connect$default(io.ktor.network.sockets.TcpSocketBuilder tcpSocketBuilder, java.lang.String str, int i, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.network.sockets.TcpSocketBuilder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit connect$lambda$0;
                    connect$lambda$0 = io.ktor.network.sockets.TcpSocketBuilder.connect$lambda$0((io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) obj2);
                    return connect$lambda$0;
                }
            };
        }
        return tcpSocketBuilder.connect(str, i, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit connect$lambda$0(io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tCPClientSocketOptions, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object connect(java.lang.String str, int i, kotlin.jvm.functions.Function1<? super io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Socket> continuation) {
        return connect(new io.ktor.network.sockets.InetSocketAddress(str, i), function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object bind$default(io.ktor.network.sockets.TcpSocketBuilder tcpSocketBuilder, java.lang.String str, int i, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = "0.0.0.0";
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.network.sockets.TcpSocketBuilder$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit bind$lambda$1;
                    bind$lambda$1 = io.ktor.network.sockets.TcpSocketBuilder.bind$lambda$1((io.ktor.network.sockets.SocketOptions.AcceptorOptions) obj2);
                    return bind$lambda$1;
                }
            };
        }
        return tcpSocketBuilder.bind(str, i, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit bind$lambda$1(io.ktor.network.sockets.SocketOptions.AcceptorOptions acceptorOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptorOptions, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object bind(java.lang.String str, int i, kotlin.jvm.functions.Function1<? super io.ktor.network.sockets.SocketOptions.AcceptorOptions, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.ServerSocket> continuation) {
        return bind(new io.ktor.network.sockets.InetSocketAddress(str, i), function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object connect$default(io.ktor.network.sockets.TcpSocketBuilder tcpSocketBuilder, io.ktor.network.sockets.SocketAddress socketAddress, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.network.sockets.TcpSocketBuilder$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit connect$lambda$2;
                    connect$lambda$2 = io.ktor.network.sockets.TcpSocketBuilder.connect$lambda$2((io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) obj2);
                    return connect$lambda$2;
                }
            };
        }
        return tcpSocketBuilder.connect(socketAddress, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit connect$lambda$2(io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tCPClientSocketOptions, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object connect(io.ktor.network.sockets.SocketAddress socketAddress, kotlin.jvm.functions.Function1<? super io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Socket> continuation) {
        io.ktor.network.selector.SelectorManager selectorManager = this.selector;
        io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tcpConnect$ktor_network = getOptions().tcpConnect$ktor_network();
        function1.invoke(tcpConnect$ktor_network);
        return io.ktor.network.sockets.ConnectUtilsJvmKt.tcpConnect(selectorManager, socketAddress, tcpConnect$ktor_network, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object bind$default(io.ktor.network.sockets.TcpSocketBuilder tcpSocketBuilder, io.ktor.network.sockets.SocketAddress socketAddress, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            socketAddress = null;
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.network.sockets.TcpSocketBuilder$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit bind$lambda$3;
                    bind$lambda$3 = io.ktor.network.sockets.TcpSocketBuilder.bind$lambda$3((io.ktor.network.sockets.SocketOptions.AcceptorOptions) obj2);
                    return bind$lambda$3;
                }
            };
        }
        return tcpSocketBuilder.bind(socketAddress, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit bind$lambda$3(io.ktor.network.sockets.SocketOptions.AcceptorOptions acceptorOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptorOptions, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object bind(io.ktor.network.sockets.SocketAddress socketAddress, kotlin.jvm.functions.Function1<? super io.ktor.network.sockets.SocketOptions.AcceptorOptions, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.ServerSocket> continuation) {
        io.ktor.network.selector.SelectorManager selectorManager = this.selector;
        io.ktor.network.sockets.SocketOptions.AcceptorOptions tcpAccept$ktor_network = getOptions().tcpAccept$ktor_network();
        function1.invoke(tcpAccept$ktor_network);
        return io.ktor.network.sockets.ConnectUtilsJvmKt.tcpBind(selectorManager, socketAddress, tcpAccept$ktor_network, continuation);
    }
}
