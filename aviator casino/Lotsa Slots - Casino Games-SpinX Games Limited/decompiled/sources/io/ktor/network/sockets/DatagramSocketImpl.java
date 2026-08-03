package io.ktor.network.sockets;

/* compiled from: DatagramSocketImpl.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082P¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010\fR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lio/ktor/network/sockets/DatagramSocketImpl;", "Lio/ktor/network/sockets/BoundDatagramSocket;", "Lio/ktor/network/sockets/ConnectedDatagramSocket;", "Lio/ktor/network/sockets/NIOSocketImpl;", "Ljava/nio/channels/DatagramChannel;", "channel", "Lio/ktor/network/selector/SelectorManager;", "selector", "<init>", "(Ljava/nio/channels/DatagramChannel;Lio/ktor/network/selector/SelectorManager;)V", "", "close", "()V", "Lio/ktor/network/sockets/Datagram;", "receiveImpl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/ByteBuffer;", "buffer", "receiveSuspend", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/channels/DatagramChannel;", "getChannel", "()Ljava/nio/channels/DatagramChannel;", "Lio/ktor/network/sockets/SocketAddress;", "getLocalAddress", "()Lio/ktor/network/sockets/SocketAddress;", "localAddress", "getRemoteAddress", "remoteAddress", "Lkotlinx/coroutines/channels/SendChannel;", "sender", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "receiver", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getReceiver$annotations", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "incoming", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DatagramSocketImpl extends io.ktor.network.sockets.NIOSocketImpl<java.nio.channels.DatagramChannel> implements io.ktor.network.sockets.BoundDatagramSocket, io.ktor.network.sockets.ConnectedDatagramSocket {
    private final java.nio.channels.DatagramChannel channel;
    private final kotlinx.coroutines.channels.ReceiveChannel<io.ktor.network.sockets.Datagram> receiver;
    private final kotlinx.coroutines.channels.SendChannel<io.ktor.network.sockets.Datagram> sender;

    private static /* synthetic */ void getReceiver$annotations() {
    }

    @Override // io.ktor.network.sockets.DatagramReadChannel
    public java.lang.Object receive(kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Datagram> continuation) {
        return io.ktor.network.sockets.BoundDatagramSocket.DefaultImpls.receive(this, continuation);
    }

    @Override // io.ktor.network.sockets.DatagramWriteChannel
    public java.lang.Object send(io.ktor.network.sockets.Datagram datagram, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return io.ktor.network.sockets.BoundDatagramSocket.DefaultImpls.send(this, datagram, continuation);
    }

    @Override // io.ktor.network.sockets.NIOSocketImpl, io.ktor.network.selector.Selectable
    public java.nio.channels.DatagramChannel getChannel() {
        return this.channel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatagramSocketImpl(java.nio.channels.DatagramChannel channel, io.ktor.network.selector.SelectorManager selector) {
        super(channel, selector, io.ktor.network.util.PoolsKt.getDefaultDatagramByteBufferPool(), null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        this.channel = channel;
        this.sender = new io.ktor.network.sockets.DatagramSendChannel(getChannel(), this);
        this.receiver = kotlinx.coroutines.channels.ProduceKt.produce$default(this, kotlinx.coroutines.Dispatchers.getIO(), 0, new io.ktor.network.sockets.DatagramSocketImpl$receiver$1(this, null), 2, null);
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

    @Override // io.ktor.network.sockets.DatagramReadChannel
    public kotlinx.coroutines.channels.ReceiveChannel<io.ktor.network.sockets.Datagram> getIncoming() {
        return this.receiver;
    }

    @Override // io.ktor.network.sockets.DatagramWriteChannel
    public kotlinx.coroutines.channels.SendChannel<io.ktor.network.sockets.Datagram> getOutgoing() {
        return this.sender;
    }

    @Override // io.ktor.network.sockets.SocketBase, io.ktor.network.selector.SelectableBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) this.receiver, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        super.close();
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.sender, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object receiveImpl(kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Datagram> continuation) {
        java.nio.ByteBuffer borrow = io.ktor.network.util.PoolsKt.getDefaultDatagramByteBufferPool().borrow();
        try {
            java.net.SocketAddress receive = getChannel().receive(borrow);
            if (receive == null) {
                return receiveSuspend(borrow, continuation);
            }
            interestOp(io.ktor.network.selector.SelectInterest.READ, false);
            borrow.flip();
            kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
            io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(buffer, borrow);
            io.ktor.network.sockets.Datagram datagram = new io.ktor.network.sockets.Datagram(buffer, io.ktor.network.sockets.JavaSocketAddressUtilsKt.toSocketAddress(receive));
            return datagram;
        } finally {
            io.ktor.network.util.PoolsKt.getDefaultDatagramByteBufferPool().recycle(borrow);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0058 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object receiveSuspend(java.nio.ByteBuffer r7, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Datagram> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.network.sockets.DatagramSocketImpl$receiveSuspend$1
            if (r0 == 0) goto L14
            r0 = r8
            io.ktor.network.sockets.DatagramSocketImpl$receiveSuspend$1 r0 = (io.ktor.network.sockets.DatagramSocketImpl$receiveSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            io.ktor.network.sockets.DatagramSocketImpl$receiveSuspend$1 r0 = new io.ktor.network.sockets.DatagramSocketImpl$receiveSuspend$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.L$1
            io.ktor.network.sockets.DatagramSocketImpl r7 = (io.ktor.network.sockets.DatagramSocketImpl) r7
            java.lang.Object r2 = r0.L$0
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r2
            goto L5b
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r6
        L40:
            io.ktor.network.selector.SelectInterest r2 = io.ktor.network.selector.SelectInterest.READ
            r7.interestOp(r2, r3)
            io.ktor.network.selector.SelectorManager r2 = r7.getSelector()
            r4 = r7
            io.ktor.network.selector.Selectable r4 = (io.ktor.network.selector.Selectable) r4
            io.ktor.network.selector.SelectInterest r5 = io.ktor.network.selector.SelectInterest.READ
            r0.L$0 = r8
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r2 = r2.select(r4, r5, r0)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            java.nio.channels.DatagramChannel r2 = r7.getChannel()     // Catch: java.lang.Throwable -> L8d
            java.net.SocketAddress r2 = r2.receive(r8)     // Catch: java.lang.Throwable -> L8d
            if (r2 != 0) goto L66
            goto L40
        L66:
            io.ktor.network.selector.SelectInterest r0 = io.ktor.network.selector.SelectInterest.READ
            r1 = 0
            r7.interestOp(r0, r1)
            r8.flip()
            kotlinx.io.Buffer r7 = new kotlinx.io.Buffer
            r7.<init>()
            r0 = r7
            kotlinx.io.Sink r0 = (kotlinx.io.Sink) r0
            io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(r0, r8)
            kotlinx.io.Source r7 = (kotlinx.io.Source) r7
            io.ktor.network.sockets.SocketAddress r0 = io.ktor.network.sockets.JavaSocketAddressUtilsKt.toSocketAddress(r2)
            io.ktor.network.sockets.Datagram r1 = new io.ktor.network.sockets.Datagram
            r1.<init>(r7, r0)
            io.ktor.utils.io.pool.ObjectPool r7 = io.ktor.network.util.PoolsKt.getDefaultDatagramByteBufferPool()
            r7.recycle(r8)
            return r1
        L8d:
            r7 = move-exception
            io.ktor.utils.io.pool.ObjectPool r0 = io.ktor.network.util.PoolsKt.getDefaultDatagramByteBufferPool()
            r0.recycle(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.DatagramSocketImpl.receiveSuspend(java.nio.ByteBuffer, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
