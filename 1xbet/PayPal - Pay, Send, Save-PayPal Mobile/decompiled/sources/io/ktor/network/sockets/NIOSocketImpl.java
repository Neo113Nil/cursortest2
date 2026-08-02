package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\b \u0018\u0000*\u000e\b\u0000\u0010\u0003 \u0001*\u00020\u0001*\u00020\u00022\u00020\u00042\u00020\u0005B3\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00028\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lio/ktor/network/sockets/NIOSocketImpl;", "Ljava/nio/channels/ByteChannel;", "Ljava/nio/channels/SelectableChannel;", "S", "Lio/ktor/network/sockets/ReadWriteSocket;", "Lio/ktor/network/sockets/SocketBase;", "channel", "Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "<init>", "(Ljava/nio/channels/SelectableChannel;Lio/ktor/network/selector/SelectorManager;Lio/ktor/utils/io/pool/ObjectPool;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)V", "Lio/ktor/utils/io/ByteChannel;", "Lio/ktor/utils/io/WriterJob;", "attachForReadingImpl", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ReaderJob;", "attachForWritingImpl", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/ReaderJob;", "", "actualClose$ktor_network", "()Ljava/lang/Throwable;", "Ljava/nio/channels/SelectableChannel;", "getChannel", "()Ljava/nio/channels/SelectableChannel;", "Lio/ktor/network/selector/SelectorManager;", "getSelector", "()Lio/ktor/network/selector/SelectorManager;", "Lio/ktor/utils/io/pool/ObjectPool;", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "getHighSpeedVideoSizes", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NIOSocketImpl<S extends java.nio.channels.SelectableChannel & java.nio.channels.ByteChannel> extends io.ktor.network.sockets.SocketBase implements io.ktor.network.sockets.ReadWriteSocket {
    private final S channel;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions getHighSpeedVideoFpsRanges;
    private final io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool;
    private final io.ktor.network.selector.SelectorManager selector;

    public /* synthetic */ NIOSocketImpl(java.nio.channels.SelectableChannel selectableChannel, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.utils.io.pool.ObjectPool objectPool, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(selectableChannel, selectorManager, objectPool, (i & 8) != 0 ? null : tCPClientSocketOptions);
    }

    @Override // io.ktor.network.selector.Selectable
    public S getChannel() {
        return this.channel;
    }

    public final io.ktor.network.selector.SelectorManager getSelector() {
        return this.selector;
    }

    public final io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> getPool() {
        return this.pool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NIOSocketImpl(S s, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        super(kotlin.coroutines.EmptyCoroutineContext.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectorManager, "");
        this.channel = s;
        this.selector = selectorManager;
        this.pool = objectPool;
        this.getHighSpeedVideoFpsRanges = tCPClientSocketOptions;
    }

    @Override // io.ktor.network.sockets.SocketBase
    public final io.ktor.utils.io.WriterJob attachForReadingImpl(io.ktor.utils.io.ByteChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        if (this.pool != null) {
            return io.ktor.network.sockets.CIOReaderKt.attachForReadingImpl(this, channel, (java.nio.channels.ReadableByteChannel) getChannel(), this, this.selector, this.pool, this.getHighSpeedVideoFpsRanges);
        }
        return io.ktor.network.sockets.CIOReaderKt.attachForReadingDirectImpl(this, channel, (java.nio.channels.ReadableByteChannel) getChannel(), this, this.selector, this.getHighSpeedVideoFpsRanges);
    }

    @Override // io.ktor.network.sockets.SocketBase
    public final io.ktor.utils.io.ReaderJob attachForWritingImpl(io.ktor.utils.io.ByteChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        return io.ktor.network.sockets.CIOWriterKt.attachForWritingDirectImpl(this, channel, (java.nio.channels.WritableByteChannel) getChannel(), this, this.selector, this.getHighSpeedVideoFpsRanges);
    }

    @Override // io.ktor.network.sockets.SocketBase
    public java.lang.Throwable actualClose$ktor_network() {
        try {
            getChannel().close();
            super.close();
            this.selector.notifyClosed(this);
            return null;
        } catch (java.lang.Throwable th) {
            this.selector.notifyClosed(this);
            return th;
        }
    }
}
