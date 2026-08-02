package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0082@¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lio/ktor/network/sockets/ServerSocketImpl;", "Lio/ktor/network/selector/SelectableBase;", "Lio/ktor/network/sockets/ServerSocket;", "Ljava/nio/channels/ServerSocketChannel;", "channel", "Lio/ktor/network/selector/SelectorManager;", "selector", "<init>", "(Ljava/nio/channels/ServerSocketChannel;Lio/ktor/network/selector/SelectorManager;)V", "Lio/ktor/network/sockets/Socket;", "accept", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/nio/channels/SocketChannel;", "p0", "(Ljava/nio/channels/SocketChannel;)Lio/ktor/network/sockets/Socket;", "", "close", "()V", "Ljava/nio/channels/ServerSocketChannel;", "getChannel", "()Ljava/nio/channels/ServerSocketChannel;", "Lio/ktor/network/selector/SelectorManager;", "getSelector", "()Lio/ktor/network/selector/SelectorManager;", "Lkotlinx/coroutines/CompletableJob;", "socketContext", "Lkotlinx/coroutines/CompletableJob;", "getSocketContext", "()Lkotlinx/coroutines/CompletableJob;", "Lio/ktor/network/sockets/SocketAddress;", "getLocalAddress", "()Lio/ktor/network/sockets/SocketAddress;", "localAddress"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ServerSocketImpl extends io.ktor.network.selector.SelectableBase implements io.ktor.network.sockets.ServerSocket {
    private final java.nio.channels.ServerSocketChannel channel;
    private final io.ktor.network.selector.SelectorManager selector;
    private final kotlinx.coroutines.CompletableJob socketContext;

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        io.ktor.network.sockets.ServerSocket.DefaultImpls.dispose(this);
    }

    @Override // io.ktor.network.selector.Selectable
    public final java.nio.channels.ServerSocketChannel getChannel() {
        return this.channel;
    }

    public final io.ktor.network.selector.SelectorManager getSelector() {
        return this.selector;
    }

    public ServerSocketImpl(java.nio.channels.ServerSocketChannel serverSocketChannel, io.ktor.network.selector.SelectorManager selectorManager) {
        kotlinx.coroutines.CompletableJob Job$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSocketChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectorManager, "");
        this.channel = serverSocketChannel;
        this.selector = selectorManager;
        if (!getChannel().isBlocking()) {
            Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
            this.socketContext = Job$default;
            return;
        }
        throw new java.lang.IllegalArgumentException("Channel need to be configured as non-blocking.".toString());
    }

    @Override // io.ktor.network.sockets.ASocket
    public final kotlinx.coroutines.CompletableJob getSocketContext() {
        return this.socketContext;
    }

    @Override // io.ktor.network.sockets.ABoundSocket
    public final io.ktor.network.sockets.SocketAddress getLocalAddress() {
        java.net.SocketAddress localSocketAddress;
        if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
            localSocketAddress = getChannel().getLocalAddress();
        } else {
            localSocketAddress = getChannel().socket().getLocalSocketAddress();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(localSocketAddress);
        return io.ktor.network.sockets.JavaSocketAddressUtilsKt.toSocketAddress(localSocketAddress);
    }

    @Override // io.ktor.network.sockets.Acceptable
    public final java.lang.Object accept(kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Socket> continuation) {
        java.nio.channels.SocketChannel accept = getChannel().accept();
        return accept != null ? getHighResolutionOutputSizeshNQ4ISI(accept) : getHighResolutionOutputSizeshNQ4ISI(continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Socket> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1
            if (r0 == 0) goto L14
            r0 = r6
            io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1 r0 = (io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1) r0
            int r1 = r0.getHighSpeedVideoFpsRanges
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.getHighSpeedVideoFpsRanges
            int r6 = r6 + r2
            r0.getHighSpeedVideoFpsRanges = r6
            goto L19
        L14:
            io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1 r0 = new io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r0.getHighSpeedVideoSizes
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.getHighSpeedVideoFpsRanges
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
        L35:
            io.ktor.network.selector.SelectInterest r6 = io.ktor.network.selector.SelectInterest.ACCEPT
            r5.interestOp(r6, r3)
            io.ktor.network.selector.SelectorManager r6 = r5.selector
            r2 = r5
            io.ktor.network.selector.Selectable r2 = (io.ktor.network.selector.Selectable) r2
            io.ktor.network.selector.SelectInterest r4 = io.ktor.network.selector.SelectInterest.ACCEPT
            r0.getHighSpeedVideoFpsRanges = r3
            java.lang.Object r6 = r6.select(r2, r4, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.nio.channels.ServerSocketChannel r6 = r5.getChannel()
            java.nio.channels.SocketChannel r6 = r6.accept()
            if (r6 == 0) goto L35
            io.ktor.network.sockets.Socket r6 = r5.getHighResolutionOutputSizeshNQ4ISI(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.ServerSocketImpl.getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final io.ktor.network.sockets.Socket getHighResolutionOutputSizeshNQ4ISI(java.nio.channels.SocketChannel p0) {
        interestOp(io.ktor.network.selector.SelectInterest.ACCEPT, false);
        p0.configureBlocking(false);
        if (getLocalAddress() instanceof io.ktor.network.sockets.InetSocketAddress) {
            if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                p0.setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.TCP_NODELAY, (java.net.SocketOption) java.lang.Boolean.TRUE);
            } else {
                p0.socket().setTcpNoDelay(true);
            }
        }
        return new io.ktor.network.sockets.SocketImpl(p0, this.selector, null, 4, null);
    }

    @Override // io.ktor.network.selector.SelectableBase, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            try {
                getChannel().close();
                this.selector.notifyClosed(this);
                getSocketContext().complete();
            } catch (java.lang.Throwable th) {
                this.selector.notifyClosed(this);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            getSocketContext().completeExceptionally(th2);
        }
    }
}
