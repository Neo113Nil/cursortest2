package io.ktor.network.sockets;

/* compiled from: SocketBase.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0013J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0016H ¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\nJ%\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R#\u0010/\u001a\u00020,*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R%\u00102\u001a\u0004\u0018\u00010\u0016*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lio/ktor/network/sockets/SocketBase;", "Lio/ktor/network/sockets/ReadWriteSocket;", "Lio/ktor/network/selector/SelectableBase;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "parent", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "", "dispose", "()V", "close", "Lio/ktor/utils/io/ByteChannel;", "channel", "Lio/ktor/utils/io/WriterJob;", "attachForReading", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ReaderJob;", "attachForWriting", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/ReaderJob;", "attachForReadingImpl", "attachForWritingImpl", "", "actualClose$ktor_network", "()Ljava/lang/Throwable;", "actualClose", "checkChannels", "e1", "e2", "combine", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/Function1;", "channelCompletionHandler", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/CompletableJob;", "socketContext", "Lkotlinx/coroutines/CompletableJob;", "getSocketContext", "()Lkotlinx/coroutines/CompletableJob;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlinx/atomicfu/AtomicRef;", "Lio/ktor/utils/io/ChannelJob;", "", "getCompletedOrNotStarted", "(Lkotlinx/atomicfu/AtomicRef;)Z", "completedOrNotStarted", "getException", "(Lkotlinx/atomicfu/AtomicRef;)Ljava/lang/Throwable;", "exception", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SocketBase extends io.ktor.network.selector.SelectableBase implements io.ktor.network.sockets.ReadWriteSocket, kotlinx.coroutines.CoroutineScope {
    private volatile /* synthetic */ int actualCloseFlag;
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> channelCompletionHandler;
    private volatile /* synthetic */ int closeFlag;
    volatile /* synthetic */ java.lang.Object readerJob;
    private final kotlinx.coroutines.CompletableJob socketContext;
    volatile /* synthetic */ java.lang.Object writerJob;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater closeFlag$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.network.sockets.SocketBase.class, "closeFlag");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater actualCloseFlag$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.network.sockets.SocketBase.class, "actualCloseFlag");
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater readerJob$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.network.sockets.SocketBase.class, java.lang.Object.class, "readerJob");
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater writerJob$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.network.sockets.SocketBase.class, java.lang.Object.class, "writerJob");

    public abstract java.lang.Throwable actualClose$ktor_network();

    public abstract io.ktor.utils.io.WriterJob attachForReadingImpl(io.ktor.utils.io.ByteChannel channel);

    public abstract io.ktor.utils.io.ReaderJob attachForWritingImpl(io.ktor.utils.io.ByteChannel channel);

    public SocketBase(kotlin.coroutines.CoroutineContext parent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        this.closeFlag = 0;
        this.actualCloseFlag = 0;
        this.readerJob = null;
        this.writerJob = null;
        this.channelCompletionHandler = new kotlin.jvm.functions.Function1() { // from class: io.ktor.network.sockets.SocketBase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit channelCompletionHandler$lambda$0;
                channelCompletionHandler$lambda$0 = io.ktor.network.sockets.SocketBase.channelCompletionHandler$lambda$0(io.ktor.network.sockets.SocketBase.this, (java.lang.Throwable) obj);
                return channelCompletionHandler$lambda$0;
            }
        };
        this.socketContext = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) parent.get(kotlinx.coroutines.Job.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit channelCompletionHandler$lambda$0(io.ktor.network.sockets.SocketBase socketBase, java.lang.Throwable th) {
        socketBase.checkChannels();
        return kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.network.sockets.ASocket
    public kotlinx.coroutines.CompletableJob getSocketContext() {
        return this.socketContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return getSocketContext();
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
        close();
    }

    @Override // io.ktor.network.selector.SelectableBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (closeFlag$FU.compareAndSet(this, 0, 1)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this, new kotlinx.coroutines.CoroutineName("socket-close"), null, new io.ktor.network.sockets.SocketBase$close$1(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void checkChannels() {
        java.lang.Throwable th;
        io.ktor.utils.io.ChannelJob channelJob;
        java.lang.Throwable combine;
        java.util.concurrent.CancellationException cancellationException;
        java.util.concurrent.CancellationException cancellationException2;
        if (this.closeFlag == 0) {
            return;
        }
        io.ktor.utils.io.ChannelJob channelJob2 = (io.ktor.utils.io.ChannelJob) this.readerJob;
        if (channelJob2 != null && !io.ktor.utils.io.ByteWriteChannelOperationsKt.isCompleted(channelJob2)) {
            return;
        }
        io.ktor.utils.io.ChannelJob channelJob3 = (io.ktor.utils.io.ChannelJob) this.writerJob;
        if ((channelJob3 != null && !io.ktor.utils.io.ByteWriteChannelOperationsKt.isCompleted(channelJob3)) || !actualCloseFlag$FU.compareAndSet(this, 0, 1)) {
            return;
        }
        io.ktor.utils.io.ChannelJob channelJob4 = (io.ktor.utils.io.ChannelJob) this.readerJob;
        java.lang.Throwable th2 = null;
        if (channelJob4 != null) {
            if (!io.ktor.utils.io.ByteWriteChannelOperationsKt.isCancelled(channelJob4)) {
                channelJob4 = null;
            }
            if (channelJob4 != null && (cancellationException2 = io.ktor.utils.io.ByteWriteChannelOperationsKt.getCancellationException(channelJob4)) != null) {
                th = cancellationException2.getCause();
                channelJob = (io.ktor.utils.io.ChannelJob) this.writerJob;
                if (channelJob != null) {
                    if (!io.ktor.utils.io.ByteWriteChannelOperationsKt.isCancelled(channelJob)) {
                        channelJob = null;
                    }
                    if (channelJob != null && (cancellationException = io.ktor.utils.io.ByteWriteChannelOperationsKt.getCancellationException(channelJob)) != null) {
                        th2 = cancellationException.getCause();
                    }
                }
                combine = combine(combine(th, th2), actualClose$ktor_network());
                if (combine != null) {
                    getSocketContext().complete();
                    return;
                } else {
                    getSocketContext().completeExceptionally(combine);
                    return;
                }
            }
        }
        th = null;
        channelJob = (io.ktor.utils.io.ChannelJob) this.writerJob;
        if (channelJob != null) {
        }
        combine = combine(combine(th, th2), actualClose$ktor_network());
        if (combine != null) {
        }
    }

    private final java.lang.Throwable combine(java.lang.Throwable e1, java.lang.Throwable e2) {
        if (e1 == null) {
            return e2;
        }
        if (e2 == null || e1 == e2) {
            return e1;
        }
        kotlin.ExceptionsKt.addSuppressed(e1, e2);
        return e1;
    }

    @Override // io.ktor.network.sockets.AReadable
    public final io.ktor.utils.io.WriterJob attachForReading(io.ktor.utils.io.ByteChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        if (this.closeFlag == 0) {
            io.ktor.utils.io.WriterJob attachForReadingImpl = attachForReadingImpl(channel);
            if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(writerJob$FU, this, null, attachForReadingImpl)) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("reading channel has already been set");
                io.ktor.utils.io.ByteWriteChannelOperationsKt.cancel(attachForReadingImpl);
                throw illegalStateException;
            }
            if (this.closeFlag != 0) {
                java.io.IOException iOException = new java.io.IOException("Socket closed");
                io.ktor.utils.io.ByteWriteChannelOperationsKt.cancel(attachForReadingImpl);
                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(channel, iOException);
                throw iOException;
            }
            io.ktor.utils.io.ByteChannelUtilsKt.attachJob(channel, attachForReadingImpl);
            io.ktor.utils.io.ByteWriteChannelOperationsKt.invokeOnCompletion(attachForReadingImpl, this.channelCompletionHandler);
            return attachForReadingImpl;
        }
        java.io.IOException iOException2 = new java.io.IOException("Socket closed");
        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(channel, iOException2);
        throw iOException2;
    }

    @Override // io.ktor.network.sockets.AWritable
    public final io.ktor.utils.io.ReaderJob attachForWriting(io.ktor.utils.io.ByteChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        if (this.closeFlag == 0) {
            io.ktor.utils.io.ReaderJob attachForWritingImpl = attachForWritingImpl(channel);
            if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(readerJob$FU, this, null, attachForWritingImpl)) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("writing channel has already been set");
                io.ktor.utils.io.ByteWriteChannelOperationsKt.cancel(attachForWritingImpl);
                throw illegalStateException;
            }
            if (this.closeFlag != 0) {
                java.io.IOException iOException = new java.io.IOException("Socket closed");
                io.ktor.utils.io.ByteWriteChannelOperationsKt.cancel(attachForWritingImpl);
                io.ktor.utils.io.ByteWriteChannelOperationsKt.close(channel, iOException);
                throw iOException;
            }
            io.ktor.utils.io.ByteChannelUtilsKt.attachJob(channel, attachForWritingImpl);
            io.ktor.utils.io.ByteWriteChannelOperationsKt.invokeOnCompletion(attachForWritingImpl, this.channelCompletionHandler);
            return attachForWritingImpl;
        }
        java.io.IOException iOException2 = new java.io.IOException("Socket closed");
        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(channel, iOException2);
        throw iOException2;
    }
}
