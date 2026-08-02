package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.DatagramSendChannel$send$2$1", f = "DatagramSendChannel.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {113, 126}, m = "invokeSuspend", n = {"writeWithPool", "buffer$iv", "head$iv$iv", "bb$iv", "buffer", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class DatagramSendChannel$send$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.network.sockets.Datagram getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.network.sockets.DatagramSendChannel getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:41:0x014a, code lost:
    
        if (io.ktor.network.sockets.DatagramSendChannel.access$sendSuspend(r4, r6, r1, r13) == r0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [io.ktor.utils.io.pool.ObjectPool] */
    /* JADX WARN: Type inference failed for: r1v18, types: [io.ktor.utils.io.pool.ObjectPool] */
    /* JADX WARN: Type inference failed for: r1v19 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlinx.io.Buffer getHighResolutionOutputSizeshNQ4ISI;
        kotlinx.io.Segment head;
        java.nio.ByteBuffer asReadOnlyBuffer;
        kotlinx.io.Buffer buffer;
        kotlinx.io.Segment segment;
        java.nio.ByteBuffer byteBuffer;
        java.nio.ByteBuffer byteBuffer2;
        int position;
        io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> defaultDatagramByteBufferPool;
        java.nio.ByteBuffer borrow;
        ?? r1;
        ?? r0;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long remaining = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(this.getHighSpeedVideoFpsRangesFor.getPacket());
            booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
            getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getPacket().getGetHighResolutionOutputSizeshNQ4ISI();
            io.ktor.network.sockets.DatagramSendChannel datagramSendChannel = this.getInputSizeshNQ4ISI;
            io.ktor.network.sockets.Datagram datagram = this.getHighSpeedVideoFpsRangesFor;
            if (getHighResolutionOutputSizeshNQ4ISI.exhausted()) {
                throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
            }
            head = getHighResolutionOutputSizeshNQ4ISI.getHead();
            kotlin.jvm.internal.Intrinsics.checkNotNull(head);
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            asReadOnlyBuffer = java.nio.ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos).slice().asReadOnlyBuffer();
            kotlin.jvm.internal.Intrinsics.checkNotNull(asReadOnlyBuffer);
            if (asReadOnlyBuffer.remaining() < remaining) {
                booleanRef.element = true;
            } else if (datagramSendChannel.getChannel().send(asReadOnlyBuffer, io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(datagram.getAddress())) != 0) {
                datagramSendChannel.getSocket().interestOp(io.ktor.network.selector.SelectInterest.WRITE, false);
                asReadOnlyBuffer.position(asReadOnlyBuffer.limit());
            } else {
                io.ktor.network.sockets.SocketAddress address = datagram.getAddress();
                this.Camera2StreamConfigurationMap = booleanRef;
                this.getHighSpeedVideoFpsRanges = getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = head;
                this.getHighSpeedVideoSizes = asReadOnlyBuffer;
                this.getOutputFormats = asReadOnlyBuffer;
                this.getOutputMinFrameDuration = 1;
                if (io.ktor.network.sockets.DatagramSendChannel.access$sendSuspend(datagramSendChannel, asReadOnlyBuffer, address, this) != coroutine_suspended) {
                    buffer = getHighResolutionOutputSizeshNQ4ISI;
                    segment = head;
                    byteBuffer = asReadOnlyBuffer;
                    byteBuffer2 = byteBuffer;
                }
                return coroutine_suspended;
            }
            position = asReadOnlyBuffer.position();
            if (position != 0) {
                if (position < 0) {
                    throw new java.lang.IllegalStateException("Returned negative read bytes count");
                }
                if (position > head.getSize()) {
                    throw new java.lang.IllegalStateException("Returned too many bytes");
                }
                getHighResolutionOutputSizeshNQ4ISI.skip(position);
            }
            if (booleanRef.element) {
                defaultDatagramByteBufferPool = io.ktor.network.util.PoolsKt.getDefaultDatagramByteBufferPool();
                io.ktor.network.sockets.Datagram datagram2 = this.getHighSpeedVideoFpsRangesFor;
                io.ktor.network.sockets.DatagramSendChannel datagramSendChannel2 = this.getInputSizeshNQ4ISI;
                borrow = defaultDatagramByteBufferPool.borrow();
                try {
                    java.nio.ByteBuffer byteBuffer3 = borrow;
                    io.ktor.network.sockets.DatagramSendChannelKt.access$writeMessageTo(datagram2.getPacket(), byteBuffer3);
                    if (datagramSendChannel2.getChannel().send(byteBuffer3, io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(datagram2.getAddress())) != 0) {
                        datagramSendChannel2.getSocket().interestOp(io.ktor.network.selector.SelectInterest.WRITE, false);
                    } else {
                        io.ktor.network.sockets.SocketAddress address2 = datagram2.getAddress();
                        this.Camera2StreamConfigurationMap = defaultDatagramByteBufferPool;
                        this.getHighSpeedVideoFpsRanges = borrow;
                        this.getHighResolutionOutputSizeshNQ4ISI = null;
                        this.getHighSpeedVideoSizes = null;
                        this.getOutputFormats = null;
                        this.getOutputMinFrameDuration = 2;
                    }
                    r1 = defaultDatagramByteBufferPool;
                    r0 = borrow;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    r1.recycle(r0);
                } catch (java.lang.Throwable th) {
                    th = th;
                    defaultDatagramByteBufferPool.recycle(borrow);
                    throw th;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r0 = this.getHighSpeedVideoFpsRanges;
            r1 = (io.ktor.utils.io.pool.ObjectPool) this.Camera2StreamConfigurationMap;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                r0 = r0;
                r1 = r1;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                r1.recycle(r0);
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th2) {
                borrow = r0;
                th = th2;
                defaultDatagramByteBufferPool = r1;
                defaultDatagramByteBufferPool.recycle(borrow);
                throw th;
            }
        }
        byteBuffer = (java.nio.ByteBuffer) this.getOutputFormats;
        byteBuffer2 = (java.nio.ByteBuffer) this.getHighSpeedVideoSizes;
        segment = (kotlinx.io.Segment) this.getHighResolutionOutputSizeshNQ4ISI;
        buffer = (kotlinx.io.Buffer) this.getHighSpeedVideoFpsRanges;
        booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        byteBuffer.position(byteBuffer.limit());
        asReadOnlyBuffer = byteBuffer2;
        head = segment;
        getHighResolutionOutputSizeshNQ4ISI = buffer;
        position = asReadOnlyBuffer.position();
        if (position != 0) {
        }
        if (booleanRef.element) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.network.sockets.DatagramSendChannel$send$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.network.sockets.DatagramSendChannel$send$2$1(this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSendChannel$send$2$1(io.ktor.network.sockets.Datagram datagram, io.ktor.network.sockets.DatagramSendChannel datagramSendChannel, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.DatagramSendChannel$send$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = datagram;
        this.getInputSizeshNQ4ISI = datagramSendChannel;
    }
}
