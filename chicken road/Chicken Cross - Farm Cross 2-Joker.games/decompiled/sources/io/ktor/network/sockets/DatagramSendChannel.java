package io.ktor.network.sockets;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.facebook.appevents.integrity.IntegrityManager;
import io.ktor.network.util.PoolsKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: DatagramSendChannel.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010 \u001a\u00020\u00102#\u0010\u001f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00100\u001cH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u000b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b/\u0010#\u001a\u0004\b-\u0010.R&\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lio/ktor/network/sockets/DatagramSendChannel;", "Lkotlinx/coroutines/channels/SendChannel;", "Lio/ktor/network/sockets/Datagram;", "Ljava/nio/channels/DatagramChannel;", "channel", "Lio/ktor/network/sockets/DatagramSocketImpl;", "socket", "<init>", "(Ljava/nio/channels/DatagramChannel;Lio/ktor/network/sockets/DatagramSocketImpl;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "element", "Lkotlinx/coroutines/channels/ChannelResult;", "", "trySend-JP2dKIU", "(Lio/ktor/network/sockets/Datagram;)Ljava/lang/Object;", "trySend", "send", "(Lio/ktor/network/sockets/Datagram;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/ByteBuffer;", "buffer", "Lio/ktor/network/sockets/SocketAddress;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "sendSuspend", "(Ljava/nio/ByteBuffer;Lio/ktor/network/sockets/SocketAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "closeAndCheckHandler", "()V", "Ljava/nio/channels/DatagramChannel;", "getChannel", "()Ljava/nio/channels/DatagramChannel;", "Lio/ktor/network/sockets/DatagramSocketImpl;", "getSocket", "()Lio/ktor/network/sockets/DatagramSocketImpl;", "Lkotlinx/coroutines/sync/Mutex;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "isClosedForSend", "()Z", "isClosedForSend$annotations", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatagramSendChannel implements SendChannel<Datagram> {
    private final DatagramChannel channel;
    private volatile /* synthetic */ int closed;
    private volatile /* synthetic */ Object closedCause;
    private final Mutex lock;
    private volatile /* synthetic */ Object onCloseHandler;
    private final DatagramSocketImpl socket;
    private static final /* synthetic */ AtomicReferenceFieldUpdater onCloseHandler$FU = AtomicReferenceFieldUpdater.newUpdater(DatagramSendChannel.class, Object.class, "onCloseHandler");
    private static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(DatagramSendChannel.class, "closed");

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    public DatagramSendChannel(DatagramChannel channel, DatagramSocketImpl socket) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.channel = channel;
        this.socket = socket;
        this.onCloseHandler = null;
        this.closed = 0;
        this.closedCause = null;
        this.lock = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(Datagram datagram) {
        return SendChannel.DefaultImpls.offer(this, datagram);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public /* bridge */ /* synthetic */ Object send(Datagram datagram, Continuation continuation) {
        return send2(datagram, (Continuation<? super Unit>) continuation);
    }

    public final DatagramChannel getChannel() {
        return this.channel;
    }

    public final DatagramSocketImpl getSocket() {
        return this.socket;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.closed;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable cause) {
        if (!closed$FU.compareAndSet(this, 0, 1)) {
            return false;
        }
        this.closedCause = cause;
        if (!this.socket.isClosed()) {
            this.socket.close();
        }
        closeAndCheckHandler();
        return true;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public Object mo7997trySendJP2dKIU(Datagram element) {
        boolean z;
        Intrinsics.checkNotNullParameter(element, "element");
        if (!Mutex.DefaultImpls.tryLock$default(this.lock, null, 1, null)) {
            return ChannelResult.INSTANCE.m9612failurePtdJZtk();
        }
        try {
            long remaining = ByteReadPacketKt.getRemaining(element.getPacket());
            UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
            Buffer bufferField = element.getPacket().getBufferField();
            if (bufferField.exhausted()) {
                throw new IllegalArgumentException("Buffer is empty".toString());
            }
            Segment head = bufferField.getHead();
            Intrinsics.checkNotNull(head);
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos).slice().asReadOnlyBuffer();
            Intrinsics.checkNotNull(asReadOnlyBuffer);
            if (asReadOnlyBuffer.remaining() < remaining) {
                z = true;
            } else {
                z = false;
                if (this.channel.send(asReadOnlyBuffer, JavaSocketAddressUtilsKt.toJavaAddress(element.getAddress())) == 0) {
                    asReadOnlyBuffer.position(asReadOnlyBuffer.limit());
                } else {
                    asReadOnlyBuffer.position(0);
                }
            }
            int position = asReadOnlyBuffer.position();
            if (position != 0) {
                if (position < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (position > head.getSize()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                bufferField.skip(position);
            }
            if (z) {
                ObjectPool<ByteBuffer> defaultDatagramByteBufferPool = PoolsKt.getDefaultDatagramByteBufferPool();
                ByteBuffer borrow = defaultDatagramByteBufferPool.borrow();
                try {
                    ByteBuffer byteBuffer = borrow;
                    DatagramSendChannelKt.writeMessageTo(element.getPacket().peek(), byteBuffer);
                    if (this.channel.send(byteBuffer, JavaSocketAddressUtilsKt.toJavaAddress(element.getAddress())) == 0) {
                        ByteReadPacketKt.discard$default(element.getPacket(), 0L, 1, null);
                    }
                    Unit unit = Unit.INSTANCE;
                    defaultDatagramByteBufferPool.recycle(borrow);
                } catch (Throwable th) {
                    defaultDatagramByteBufferPool.recycle(borrow);
                    throw th;
                }
            }
            Mutex.DefaultImpls.unlock$default(this.lock, null, 1, null);
            return ChannelResult.INSTANCE.m9613successJP2dKIU(Unit.INSTANCE);
        } catch (Throwable th2) {
            Mutex.DefaultImpls.unlock$default(this.lock, null, 1, null);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: send, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object send2(Datagram datagram, Continuation<? super Unit> continuation) {
        DatagramSendChannel$send$1 datagramSendChannel$send$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        CoroutineDispatcher io2;
        DatagramSendChannel$send$2$1 datagramSendChannel$send$2$1;
        try {
            if (continuation instanceof DatagramSendChannel$send$1) {
                datagramSendChannel$send$1 = (DatagramSendChannel$send$1) continuation;
                if ((datagramSendChannel$send$1.label & Integer.MIN_VALUE) != 0) {
                    datagramSendChannel$send$1.label -= Integer.MIN_VALUE;
                    Object obj = datagramSendChannel$send$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = datagramSendChannel$send$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.lock;
                        datagramSendChannel$send$1.L$0 = datagram;
                        datagramSendChannel$send$1.L$1 = mutex;
                        datagramSendChannel$send$1.label = 1;
                        if (mutex.lock(null, datagramSendChannel$send$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) datagramSendChannel$send$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) datagramSendChannel$send$1.L$1;
                        Datagram datagram2 = (Datagram) datagramSendChannel$send$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        datagram = datagram2;
                    }
                    io2 = Dispatchers.getIO();
                    datagramSendChannel$send$2$1 = new DatagramSendChannel$send$2$1(datagram, this, null);
                    datagramSendChannel$send$1.L$0 = mutex;
                    datagramSendChannel$send$1.L$1 = null;
                    datagramSendChannel$send$1.label = 2;
                    if (kotlinx.coroutines.BuildersKt.withContext(io2, datagramSendChannel$send$2$1, datagramSendChannel$send$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            io2 = Dispatchers.getIO();
            datagramSendChannel$send$2$1 = new DatagramSendChannel$send$2$1(datagram, this, null);
            datagramSendChannel$send$1.L$0 = mutex;
            datagramSendChannel$send$1.L$1 = null;
            datagramSendChannel$send$1.label = 2;
            if (kotlinx.coroutines.BuildersKt.withContext(io2, datagramSendChannel$send$2$1, datagramSendChannel$send$1) != coroutine_suspended) {
            }
        } catch (Throwable th3) {
            Mutex mutex4 = mutex;
            th = th3;
            mutex2 = mutex4;
            mutex2.unlock(null);
            throw th;
        }
        datagramSendChannel$send$1 = new DatagramSendChannel$send$1(this, continuation);
        Object obj2 = datagramSendChannel$send$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = datagramSendChannel$send$1.label;
        if (i != 0) {
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:10:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendSuspend(java.nio.ByteBuffer r7, io.ktor.network.sockets.SocketAddress r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1
            if (r0 == 0) goto L14
            r0 = r9
            io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1 r0 = (io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1 r0 = new io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$1
            io.ktor.network.sockets.SocketAddress r7 = (io.ktor.network.sockets.SocketAddress) r7
            java.lang.Object r8 = r0.L$0
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            kotlin.ResultKt.throwOnFailure(r9)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L60
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.ResultKt.throwOnFailure(r9)
        L40:
            io.ktor.network.sockets.DatagramSocketImpl r9 = r6.socket
            io.ktor.network.selector.SelectInterest r2 = io.ktor.network.selector.SelectInterest.WRITE
            r9.interestOp(r2, r3)
            io.ktor.network.sockets.DatagramSocketImpl r9 = r6.socket
            io.ktor.network.selector.SelectorManager r9 = r9.getSelector()
            io.ktor.network.sockets.DatagramSocketImpl r2 = r6.socket
            io.ktor.network.selector.Selectable r2 = (io.ktor.network.selector.Selectable) r2
            io.ktor.network.selector.SelectInterest r4 = io.ktor.network.selector.SelectInterest.WRITE
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r9.select(r2, r4, r0)
            if (r9 != r1) goto L60
            return r1
        L60:
            java.nio.channels.DatagramChannel r9 = r6.channel
            java.net.SocketAddress r2 = io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(r8)
            int r9 = r9.send(r7, r2)
            if (r9 == 0) goto L40
            io.ktor.network.sockets.DatagramSocketImpl r7 = r6.socket
            io.ktor.network.selector.SelectInterest r8 = io.ktor.network.selector.SelectInterest.WRITE
            r9 = 0
            r7.interestOp(r8, r9)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.DatagramSendChannel.sendSuspend(java.nio.ByteBuffer, io.ktor.network.sockets.SocketAddress, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<Datagram, SendChannel<Datagram>> getOnSend() {
        throw new NotImplementedError("An operation is not implemented: [DatagramSendChannel] doesn't support [onSend] select clause");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(Function1<? super Throwable, Unit> handler) {
        Function1 function1;
        Function1 function12;
        Function1 function13;
        Intrinsics.checkNotNullParameter(handler, "handler");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onCloseHandler$FU;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, null, handler)) {
            return;
        }
        Object obj = this.onCloseHandler;
        function1 = DatagramSendChannelKt.CLOSED;
        if (obj == function1) {
            function12 = DatagramSendChannelKt.CLOSED;
            function13 = DatagramSendChannelKt.CLOSED_INVOKED;
            if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, function12, function13)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            handler.invoke(this.closedCause);
            return;
        }
        DatagramSendChannelKt.failInvokeOnClose((Function1) this.onCloseHandler);
    }

    private final void closeAndCheckHandler() {
        Function1 function1;
        Function1 function12;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Function1 function13;
        do {
            Function1 function14 = (Function1) this.onCloseHandler;
            function1 = DatagramSendChannelKt.CLOSED_INVOKED;
            if (function14 == function1) {
                return;
            }
            if (function14 == null) {
                atomicReferenceFieldUpdater = onCloseHandler$FU;
                function13 = DatagramSendChannelKt.CLOSED;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = onCloseHandler$FU;
                function12 = DatagramSendChannelKt.CLOSED_INVOKED;
                if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, function14, function12)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                function14.invoke(this.closedCause);
                return;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, null, function13));
    }
}
