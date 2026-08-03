package io.ktor.network.sockets;

/* compiled from: DatagramSendChannel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.DatagramSendChannel$send$2$1", f = "DatagramSendChannel.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {113, 126}, m = "invokeSuspend", n = {"writeWithPool", "buffer$iv", "head$iv$iv", "bb$iv", "buffer", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class DatagramSendChannel$send$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.network.sockets.Datagram $element;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    final /* synthetic */ io.ktor.network.sockets.DatagramSendChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSendChannel$send$2$1(io.ktor.network.sockets.Datagram datagram, io.ktor.network.sockets.DatagramSendChannel datagramSendChannel, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.DatagramSendChannel$send$2$1> continuation) {
        super(2, continuation);
        this.$element = datagram;
        this.this$0 = datagramSendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.network.sockets.DatagramSendChannel$send$2$1(this.$element, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.network.sockets.DatagramSendChannel$send$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlinx.io.Buffer bufferField;
        kotlinx.io.Segment head;
        java.nio.ByteBuffer asReadOnlyBuffer;
        java.lang.Object sendSuspend;
        kotlinx.io.Buffer buffer;
        kotlinx.io.Segment segment;
        java.nio.ByteBuffer byteBuffer;
        java.nio.ByteBuffer byteBuffer2;
        int position;
        io.ktor.utils.io.pool.ObjectPool defaultDatagramByteBufferPool;
        java.lang.Object obj2;
        java.lang.Object sendSuspend2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long remaining = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(this.$element.getPacket());
            booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
            bufferField = this.$element.getPacket().getBufferField();
            io.ktor.network.sockets.DatagramSendChannel datagramSendChannel = this.this$0;
            io.ktor.network.sockets.Datagram datagram = this.$element;
            if (!(!bufferField.exhausted())) {
                throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
            }
            head = bufferField.getHead();
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
                this.L$0 = booleanRef;
                this.L$1 = bufferField;
                this.L$2 = head;
                this.L$3 = asReadOnlyBuffer;
                this.L$4 = asReadOnlyBuffer;
                this.label = 1;
                sendSuspend = datagramSendChannel.sendSuspend(asReadOnlyBuffer, address, this);
                if (sendSuspend == coroutine_suspended) {
                    return coroutine_suspended;
                }
                buffer = bufferField;
                segment = head;
                byteBuffer = asReadOnlyBuffer;
                byteBuffer2 = byteBuffer;
            }
            position = asReadOnlyBuffer.position();
            if (position != 0) {
                if (position < 0) {
                    throw new java.lang.IllegalStateException("Returned negative read bytes count");
                }
                if (position > head.getSize()) {
                    throw new java.lang.IllegalStateException("Returned too many bytes");
                }
                bufferField.skip(position);
            }
            if (booleanRef.element) {
                defaultDatagramByteBufferPool = io.ktor.network.util.PoolsKt.getDefaultDatagramByteBufferPool();
                io.ktor.network.sockets.Datagram datagram2 = this.$element;
                io.ktor.network.sockets.DatagramSendChannel datagramSendChannel2 = this.this$0;
                java.lang.Object borrow = defaultDatagramByteBufferPool.borrow();
                try {
                    java.nio.ByteBuffer byteBuffer3 = (java.nio.ByteBuffer) borrow;
                    io.ktor.network.sockets.DatagramSendChannelKt.writeMessageTo(datagram2.getPacket(), byteBuffer3);
                    if (datagramSendChannel2.getChannel().send(byteBuffer3, io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(datagram2.getAddress())) != 0) {
                        datagramSendChannel2.getSocket().interestOp(io.ktor.network.selector.SelectInterest.WRITE, false);
                    } else {
                        io.ktor.network.sockets.SocketAddress address2 = datagram2.getAddress();
                        this.L$0 = defaultDatagramByteBufferPool;
                        this.L$1 = borrow;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 2;
                        sendSuspend2 = datagramSendChannel2.sendSuspend(byteBuffer3, address2, this);
                        if (sendSuspend2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    obj2 = borrow;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    defaultDatagramByteBufferPool.recycle(obj2);
                } catch (java.lang.Throwable th) {
                    th = th;
                    obj2 = borrow;
                    defaultDatagramByteBufferPool.recycle(obj2);
                    throw th;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$1;
            defaultDatagramByteBufferPool = (io.ktor.utils.io.pool.ObjectPool) this.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                defaultDatagramByteBufferPool.recycle(obj2);
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th2) {
                th = th2;
                defaultDatagramByteBufferPool.recycle(obj2);
                throw th;
            }
        }
        byteBuffer = (java.nio.ByteBuffer) this.L$4;
        byteBuffer2 = (java.nio.ByteBuffer) this.L$3;
        segment = (kotlinx.io.Segment) this.L$2;
        buffer = (kotlinx.io.Buffer) this.L$1;
        booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.L$0;
        kotlin.ResultKt.throwOnFailure(obj);
        byteBuffer.position(byteBuffer.limit());
        asReadOnlyBuffer = byteBuffer2;
        head = segment;
        bufferField = buffer;
        position = asReadOnlyBuffer.position();
        if (position != 0) {
        }
        if (booleanRef.element) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
