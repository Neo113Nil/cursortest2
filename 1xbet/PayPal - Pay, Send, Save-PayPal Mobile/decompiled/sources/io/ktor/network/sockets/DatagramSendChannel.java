package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0019\u001a\u00020\u00102\u0019\u0010\u0018\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\u00100\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R&\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+"}, d2 = {"Lio/ktor/network/sockets/DatagramSendChannel;", "Lkotlinx/coroutines/channels/SendChannel;", "Lio/ktor/network/sockets/Datagram;", "Ljava/nio/channels/DatagramChannel;", "channel", "Lio/ktor/network/sockets/DatagramSocketImpl;", "socket", "<init>", "(Ljava/nio/channels/DatagramChannel;Lio/ktor/network/sockets/DatagramSocketImpl;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "element", "Lkotlinx/coroutines/channels/ChannelResult;", "", "trySend-JP2dKIU", "(Lio/ktor/network/sockets/Datagram;)Ljava/lang/Object;", "trySend", "send", "(Lio/ktor/network/sockets/Datagram;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "Ljava/nio/channels/DatagramChannel;", "getChannel", "()Ljava/nio/channels/DatagramChannel;", "Lio/ktor/network/sockets/DatagramSocketImpl;", "getSocket", "()Lio/ktor/network/sockets/DatagramSocketImpl;", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoSizes", "isClosedForSend", "()Z", "isClosedForSend$annotations", "()V", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatagramSendChannel implements kotlinx.coroutines.channels.SendChannel<io.ktor.network.sockets.Datagram> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.network.sockets.DatagramSendChannel.class, java.lang.Object.class, "onCloseHandler");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.network.sockets.DatagramSendChannel.class, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
    private final java.nio.channels.DatagramChannel channel;
    private volatile /* synthetic */ int closed;
    private volatile /* synthetic */ java.lang.Object closedCause;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoSizes;
    private volatile /* synthetic */ java.lang.Object onCloseHandler;
    private final io.ktor.network.sockets.DatagramSocketImpl socket;

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    public DatagramSendChannel(java.nio.channels.DatagramChannel datagramChannel, io.ktor.network.sockets.DatagramSocketImpl datagramSocketImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datagramChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datagramSocketImpl, "");
        this.channel = datagramChannel;
        this.socket = datagramSocketImpl;
        this.onCloseHandler = null;
        this.closed = 0;
        this.closedCause = null;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:10:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$sendSuspend(io.ktor.network.sockets.DatagramSendChannel r6, java.nio.ByteBuffer r7, io.ktor.network.sockets.SocketAddress r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1
            if (r0 == 0) goto L14
            r0 = r9
            io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1 r0 = (io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1) r0
            int r1 = r0.getHighResolutionOutputSizeshNQ4ISI
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.getHighResolutionOutputSizeshNQ4ISI
            int r9 = r9 + r2
            r0.getHighResolutionOutputSizeshNQ4ISI = r9
            goto L19
        L14:
            io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1 r0 = new io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r9 = r0.getHighSpeedVideoSizes
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.getHighResolutionOutputSizeshNQ4ISI
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.getHighSpeedVideoFpsRangesFor
            io.ktor.network.sockets.SocketAddress r7 = (io.ktor.network.sockets.SocketAddress) r7
            java.lang.Object r8 = r0.getHighSpeedVideoFpsRanges
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            kotlin.ResultKt.throwOnFailure(r9)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L60
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
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
            r0.getHighSpeedVideoFpsRanges = r7
            r0.getHighSpeedVideoFpsRangesFor = r8
            r0.getHighResolutionOutputSizeshNQ4ISI = r3
            java.lang.Object r9 = r9.select(r2, r4, r0)
            if (r9 != r1) goto L60
            return r1
        L60:
            java.nio.channels.DatagramChannel r9 = r6.channel
            java.net.SocketAddress r2 = io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(r8)
            int r9 = r9.send(r7, r2)
            if (r9 == 0) goto L40
            io.ktor.network.sockets.DatagramSocketImpl r6 = r6.socket
            io.ktor.network.selector.SelectInterest r7 = io.ktor.network.selector.SelectInterest.WRITE
            r8 = 0
            r6.interestOp(r7, r8)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.DatagramSendChannel.access$sendSuspend(io.ktor.network.sockets.DatagramSendChannel, java.nio.ByteBuffer, io.ktor.network.sockets.SocketAddress, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public final boolean offer(io.ktor.network.sockets.Datagram datagram) {
        return kotlinx.coroutines.channels.SendChannel.DefaultImpls.offer(this, datagram);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final /* bridge */ /* synthetic */ java.lang.Object send(io.ktor.network.sockets.Datagram datagram, kotlin.coroutines.Continuation continuation) {
        return send2(datagram, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    public final java.nio.channels.DatagramChannel getChannel() {
        return this.channel;
    }

    public final io.ktor.network.sockets.DatagramSocketImpl getSocket() {
        return this.socket;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
        return this.closed;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean close(java.lang.Throwable cause) {
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function1 function13;
        if (!getHighSpeedVideoFpsRanges.compareAndSet(this, 0, 1)) {
            return false;
        }
        this.closedCause = cause;
        if (!this.socket.isClosed()) {
            this.socket.close();
        }
        while (true) {
            kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) this.onCloseHandler;
            function1 = io.ktor.network.sockets.DatagramSendChannelKt.getHighSpeedVideoFpsRangesFor;
            if (function14 == function1) {
                break;
            }
            if (function14 == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Camera2StreamConfigurationMap;
                function13 = io.ktor.network.sockets.DatagramSendChannelKt.getHighSpeedVideoFpsRanges;
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, null, function13)) {
                    break;
                }
            } else {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Camera2StreamConfigurationMap;
                function12 = io.ktor.network.sockets.DatagramSendChannelKt.getHighSpeedVideoFpsRangesFor;
                if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, function14, function12)) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                function14.invoke(this.closedCause);
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public final java.lang.Object mo9266trySendJP2dKIU(io.ktor.network.sockets.Datagram element) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        if (!kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(this.getHighSpeedVideoSizes, null, 1, null)) {
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24093failurePtdJZtk();
        }
        try {
            long remaining = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(element.getPacket());
            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
            kotlinx.io.Buffer getHighResolutionOutputSizeshNQ4ISI = element.getPacket().getGetHighResolutionOutputSizeshNQ4ISI();
            if (getHighResolutionOutputSizeshNQ4ISI.exhausted()) {
                throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
            }
            kotlinx.io.Segment head = getHighResolutionOutputSizeshNQ4ISI.getHead();
            kotlin.jvm.internal.Intrinsics.checkNotNull(head);
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            java.nio.ByteBuffer asReadOnlyBuffer = java.nio.ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos).slice().asReadOnlyBuffer();
            kotlin.jvm.internal.Intrinsics.checkNotNull(asReadOnlyBuffer);
            if (asReadOnlyBuffer.remaining() < remaining) {
                z = true;
            } else {
                z = false;
                if (this.channel.send(asReadOnlyBuffer, io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(element.getAddress())) == 0) {
                    asReadOnlyBuffer.position(asReadOnlyBuffer.limit());
                } else {
                    asReadOnlyBuffer.position(0);
                }
            }
            int position = asReadOnlyBuffer.position();
            if (position != 0) {
                if (position < 0) {
                    throw new java.lang.IllegalStateException("Returned negative read bytes count");
                }
                if (position > head.getSize()) {
                    throw new java.lang.IllegalStateException("Returned too many bytes");
                }
                getHighResolutionOutputSizeshNQ4ISI.skip(position);
            }
            if (z) {
                io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> defaultDatagramByteBufferPool = io.ktor.network.util.PoolsKt.getDefaultDatagramByteBufferPool();
                java.nio.ByteBuffer borrow = defaultDatagramByteBufferPool.borrow();
                try {
                    java.nio.ByteBuffer byteBuffer = borrow;
                    io.ktor.network.sockets.DatagramSendChannelKt.access$writeMessageTo(element.getPacket().peek(), byteBuffer);
                    if (this.channel.send(byteBuffer, io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(element.getAddress())) == 0) {
                        io.ktor.utils.io.core.ByteReadPacketKt.discard$default(element.getPacket(), 0L, 1, null);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    defaultDatagramByteBufferPool.recycle(borrow);
                } catch (java.lang.Throwable th) {
                    defaultDatagramByteBufferPool.recycle(borrow);
                    throw th;
                }
            }
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.getHighSpeedVideoSizes, null, 1, null);
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th2) {
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.getHighSpeedVideoSizes, null, 1, null);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r9.lock(null, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: send, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object send2(io.ktor.network.sockets.Datagram datagram, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.network.sockets.DatagramSendChannel$send$1 datagramSendChannel$send$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.CoroutineDispatcher io2;
        io.ktor.network.sockets.DatagramSendChannel$send$2$1 datagramSendChannel$send$2$1;
        kotlinx.coroutines.sync.Mutex mutex2;
        try {
            if (continuation instanceof io.ktor.network.sockets.DatagramSendChannel$send$1) {
                datagramSendChannel$send$1 = (io.ktor.network.sockets.DatagramSendChannel$send$1) continuation;
                if ((datagramSendChannel$send$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    datagramSendChannel$send$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = datagramSendChannel$send$1.Camera2StreamConfigurationMap;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = datagramSendChannel$send$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.getHighSpeedVideoSizes;
                        datagramSendChannel$send$1.getHighResolutionOutputSizeshNQ4ISI = datagram;
                        datagramSendChannel$send$1.getHighSpeedVideoFpsRanges = mutex;
                        datagramSendChannel$send$1.getHighSpeedVideoSizes = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (kotlinx.coroutines.sync.Mutex) datagramSendChannel$send$1.getHighResolutionOutputSizeshNQ4ISI;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                mutex2.unlock(null);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th) {
                                mutex = mutex2;
                                th = th;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) datagramSendChannel$send$1.getHighSpeedVideoFpsRanges;
                        io.ktor.network.sockets.Datagram datagram2 = (io.ktor.network.sockets.Datagram) datagramSendChannel$send$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        datagram = datagram2;
                    }
                    io2 = kotlinx.coroutines.Dispatchers.getIO();
                    datagramSendChannel$send$2$1 = new io.ktor.network.sockets.DatagramSendChannel$send$2$1(datagram, this, null);
                    datagramSendChannel$send$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                    datagramSendChannel$send$1.getHighSpeedVideoFpsRanges = null;
                    datagramSendChannel$send$1.getHighSpeedVideoSizes = 2;
                    if (kotlinx.coroutines.BuildersKt.withContext(io2, datagramSendChannel$send$2$1, datagramSendChannel$send$1) != coroutine_suspended) {
                        mutex2 = mutex;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        mutex2.unlock(null);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            io2 = kotlinx.coroutines.Dispatchers.getIO();
            datagramSendChannel$send$2$1 = new io.ktor.network.sockets.DatagramSendChannel$send$2$1(datagram, this, null);
            datagramSendChannel$send$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
            datagramSendChannel$send$1.getHighSpeedVideoFpsRanges = null;
            datagramSendChannel$send$1.getHighSpeedVideoSizes = 2;
            if (kotlinx.coroutines.BuildersKt.withContext(io2, datagramSendChannel$send$2$1, datagramSendChannel$send$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
        datagramSendChannel$send$1 = new io.ktor.network.sockets.DatagramSendChannel$send$1(this, continuation);
        java.lang.Object obj2 = datagramSendChannel$send$1.Camera2StreamConfigurationMap;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = datagramSendChannel$send$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final kotlinx.coroutines.selects.SelectClause2<io.ktor.network.sockets.Datagram, kotlinx.coroutines.channels.SendChannel<io.ktor.network.sockets.Datagram>> getOnSend() {
        throw new kotlin.NotImplementedError("An operation is not implemented: [DatagramSendChannel] doesn't support [onSend] select clause");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function1 function13;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Camera2StreamConfigurationMap;
        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, null, handler)) {
            return;
        }
        java.lang.Object obj = this.onCloseHandler;
        function1 = io.ktor.network.sockets.DatagramSendChannelKt.getHighSpeedVideoFpsRanges;
        if (obj == function1) {
            function12 = io.ktor.network.sockets.DatagramSendChannelKt.getHighSpeedVideoFpsRanges;
            function13 = io.ktor.network.sockets.DatagramSendChannelKt.getHighSpeedVideoFpsRangesFor;
            if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, function12, function13)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            handler.invoke(this.closedCause);
            return;
        }
        io.ktor.network.sockets.DatagramSendChannelKt.access$failInvokeOnClose((kotlin.jvm.functions.Function1) this.onCloseHandler);
    }
}
