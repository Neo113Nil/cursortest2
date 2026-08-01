package io.ktor.network.sockets;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import io.ktor.network.selector.SelectableBase;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteChannelUtilsKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ChannelJob;
import io.ktor.utils.io.ReaderJob;
import io.ktor.utils.io.WriterJob;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: SocketBase.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0013J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0016H ¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\nJ%\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R#\u0010/\u001a\u00020,*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R%\u00102\u001a\u0004\u0018\u00010\u0016*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lio/ktor/network/sockets/SocketBase;", "Lio/ktor/network/sockets/ReadWriteSocket;", "Lio/ktor/network/selector/SelectableBase;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "parent", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "", "dispose", "()V", "close", "Lio/ktor/utils/io/ByteChannel;", "channel", "Lio/ktor/utils/io/WriterJob;", "attachForReading", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ReaderJob;", "attachForWriting", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/ReaderJob;", "attachForReadingImpl", "attachForWritingImpl", "", "actualClose$ktor_network", "()Ljava/lang/Throwable;", "actualClose", "checkChannels", "e1", "e2", "combine", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/Function1;", "channelCompletionHandler", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/CompletableJob;", "socketContext", "Lkotlinx/coroutines/CompletableJob;", "getSocketContext", "()Lkotlinx/coroutines/CompletableJob;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlinx/atomicfu/AtomicRef;", "Lio/ktor/utils/io/ChannelJob;", "", "getCompletedOrNotStarted", "(Lkotlinx/atomicfu/AtomicRef;)Z", "completedOrNotStarted", "getException", "(Lkotlinx/atomicfu/AtomicRef;)Ljava/lang/Throwable;", "exception", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SocketBase extends SelectableBase implements ReadWriteSocket, CoroutineScope {
    private volatile /* synthetic */ int actualCloseFlag;
    private final Function1<Throwable, Unit> channelCompletionHandler;
    private volatile /* synthetic */ int closeFlag;
    volatile /* synthetic */ Object readerJob;
    private final CompletableJob socketContext;
    volatile /* synthetic */ Object writerJob;
    private static final /* synthetic */ AtomicIntegerFieldUpdater closeFlag$FU = AtomicIntegerFieldUpdater.newUpdater(SocketBase.class, "closeFlag");
    private static final /* synthetic */ AtomicIntegerFieldUpdater actualCloseFlag$FU = AtomicIntegerFieldUpdater.newUpdater(SocketBase.class, "actualCloseFlag");
    static final /* synthetic */ AtomicReferenceFieldUpdater readerJob$FU = AtomicReferenceFieldUpdater.newUpdater(SocketBase.class, Object.class, "readerJob");
    static final /* synthetic */ AtomicReferenceFieldUpdater writerJob$FU = AtomicReferenceFieldUpdater.newUpdater(SocketBase.class, Object.class, "writerJob");

    public abstract Throwable actualClose$ktor_network();

    public abstract WriterJob attachForReadingImpl(ByteChannel channel);

    public abstract ReaderJob attachForWritingImpl(ByteChannel channel);

    public SocketBase(CoroutineContext parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.closeFlag = 0;
        this.actualCloseFlag = 0;
        this.readerJob = null;
        this.writerJob = null;
        this.channelCompletionHandler = new Function1() { // from class: io.ktor.network.sockets.SocketBase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit channelCompletionHandler$lambda$0;
                channelCompletionHandler$lambda$0 = SocketBase.channelCompletionHandler$lambda$0(SocketBase.this, (Throwable) obj);
                return channelCompletionHandler$lambda$0;
            }
        };
        this.socketContext = JobKt.Job((Job) parent.get(Job.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit channelCompletionHandler$lambda$0(SocketBase socketBase, Throwable th) {
        socketBase.checkChannels();
        return Unit.INSTANCE;
    }

    @Override // io.ktor.network.sockets.ASocket
    public CompletableJob getSocketContext() {
        return this.socketContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return getSocketContext();
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
        close();
    }

    @Override // io.ktor.network.selector.SelectableBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (closeFlag$FU.compareAndSet(this, 0, 1)) {
            BuildersKt__Builders_commonKt.launch$default(this, new CoroutineName("socket-close"), null, new SocketBase$close$1(this, null), 2, null);
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
        Throwable th;
        ChannelJob channelJob;
        Throwable combine;
        CancellationException cancellationException;
        CancellationException cancellationException2;
        if (this.closeFlag == 0) {
            return;
        }
        ChannelJob channelJob2 = (ChannelJob) this.readerJob;
        if (channelJob2 != null && !ByteWriteChannelOperationsKt.isCompleted(channelJob2)) {
            return;
        }
        ChannelJob channelJob3 = (ChannelJob) this.writerJob;
        if ((channelJob3 != null && !ByteWriteChannelOperationsKt.isCompleted(channelJob3)) || !actualCloseFlag$FU.compareAndSet(this, 0, 1)) {
            return;
        }
        ChannelJob channelJob4 = (ChannelJob) this.readerJob;
        Throwable th2 = null;
        if (channelJob4 != null) {
            if (!ByteWriteChannelOperationsKt.isCancelled(channelJob4)) {
                channelJob4 = null;
            }
            if (channelJob4 != null && (cancellationException2 = ByteWriteChannelOperationsKt.getCancellationException(channelJob4)) != null) {
                th = cancellationException2.getCause();
                channelJob = (ChannelJob) this.writerJob;
                if (channelJob != null) {
                    if (!ByteWriteChannelOperationsKt.isCancelled(channelJob)) {
                        channelJob = null;
                    }
                    if (channelJob != null && (cancellationException = ByteWriteChannelOperationsKt.getCancellationException(channelJob)) != null) {
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
        channelJob = (ChannelJob) this.writerJob;
        if (channelJob != null) {
        }
        combine = combine(combine(th, th2), actualClose$ktor_network());
        if (combine != null) {
        }
    }

    private final Throwable combine(Throwable e1, Throwable e2) {
        if (e1 == null) {
            return e2;
        }
        if (e2 == null || e1 == e2) {
            return e1;
        }
        ExceptionsKt.addSuppressed(e1, e2);
        return e1;
    }

    @Override // io.ktor.network.sockets.AReadable
    public final WriterJob attachForReading(ByteChannel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        if (this.closeFlag == 0) {
            WriterJob attachForReadingImpl = attachForReadingImpl(channel);
            if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(writerJob$FU, this, null, attachForReadingImpl)) {
                IllegalStateException illegalStateException = new IllegalStateException("reading channel has already been set");
                ByteWriteChannelOperationsKt.cancel(attachForReadingImpl);
                throw illegalStateException;
            }
            if (this.closeFlag != 0) {
                IOException iOException = new IOException("Socket closed");
                ByteWriteChannelOperationsKt.cancel(attachForReadingImpl);
                ByteWriteChannelOperationsKt.close(channel, iOException);
                throw iOException;
            }
            ByteChannelUtilsKt.attachJob(channel, attachForReadingImpl);
            ByteWriteChannelOperationsKt.invokeOnCompletion(attachForReadingImpl, this.channelCompletionHandler);
            return attachForReadingImpl;
        }
        IOException iOException2 = new IOException("Socket closed");
        ByteWriteChannelOperationsKt.close(channel, iOException2);
        throw iOException2;
    }

    @Override // io.ktor.network.sockets.AWritable
    public final ReaderJob attachForWriting(ByteChannel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        if (this.closeFlag == 0) {
            ReaderJob attachForWritingImpl = attachForWritingImpl(channel);
            if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(readerJob$FU, this, null, attachForWritingImpl)) {
                IllegalStateException illegalStateException = new IllegalStateException("writing channel has already been set");
                ByteWriteChannelOperationsKt.cancel(attachForWritingImpl);
                throw illegalStateException;
            }
            if (this.closeFlag != 0) {
                IOException iOException = new IOException("Socket closed");
                ByteWriteChannelOperationsKt.cancel(attachForWritingImpl);
                ByteWriteChannelOperationsKt.close(channel, iOException);
                throw iOException;
            }
            ByteChannelUtilsKt.attachJob(channel, attachForWritingImpl);
            ByteWriteChannelOperationsKt.invokeOnCompletion(attachForWritingImpl, this.channelCompletionHandler);
            return attachForWritingImpl;
        }
        IOException iOException2 = new IOException("Socket closed");
        ByteWriteChannelOperationsKt.close(channel, iOException2);
        throw iOException2;
    }
}
