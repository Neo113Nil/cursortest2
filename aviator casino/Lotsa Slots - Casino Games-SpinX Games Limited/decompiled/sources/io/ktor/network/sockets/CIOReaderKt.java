package io.ktor.network.sockets;

/* compiled from: CIOReader.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aM\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0015\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteChannel;", "channel", "Ljava/nio/channels/ReadableByteChannel;", "nioChannel", "Lio/ktor/network/selector/Selectable;", "selectable", "Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "Lio/ktor/utils/io/WriterJob;", "attachForReadingImpl", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteChannel;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lio/ktor/utils/io/pool/ObjectPool;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)Lio/ktor/utils/io/WriterJob;", "attachForReadingDirectImpl", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteChannel;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ByteWriteChannel;", "", "readFrom", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/channels/ReadableByteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "selectForRead", "(Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CIOReaderKt {
    public static /* synthetic */ io.ktor.utils.io.WriterJob attachForReadingImpl$default(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteChannel byteChannel, java.nio.channels.ReadableByteChannel readableByteChannel, io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.utils.io.pool.ObjectPool objectPool, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            tCPClientSocketOptions = null;
        }
        return attachForReadingImpl(coroutineScope, byteChannel, readableByteChannel, selectable, selectorManager, objectPool, tCPClientSocketOptions);
    }

    public static final io.ktor.utils.io.WriterJob attachForReadingImpl(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteChannel channel, java.nio.channels.ReadableByteChannel nioChannel, io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selector, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nioChannel, "nioChannel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectable, "selectable");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "pool");
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer(coroutineScope, kotlinx.coroutines.Dispatchers.getIO().plus(new kotlinx.coroutines.CoroutineName("cio-from-nio-reader")), channel, new io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1(tCPClientSocketOptions, channel, selectable, pool.borrow(), pool, nioChannel, selector, null));
    }

    public static /* synthetic */ io.ktor.utils.io.WriterJob attachForReadingDirectImpl$default(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteChannel byteChannel, java.nio.channels.ReadableByteChannel readableByteChannel, io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            tCPClientSocketOptions = null;
        }
        return attachForReadingDirectImpl(coroutineScope, byteChannel, readableByteChannel, selectable, selectorManager, tCPClientSocketOptions);
    }

    public static final io.ktor.utils.io.WriterJob attachForReadingDirectImpl(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteChannel channel, java.nio.channels.ReadableByteChannel nioChannel, io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selector, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "channel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nioChannel, "nioChannel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectable, "selectable");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer(coroutineScope, kotlinx.coroutines.Dispatchers.getIO().plus(new kotlinx.coroutines.CoroutineName("cio-from-nio-reader")), channel, new io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1(selectable, tCPClientSocketOptions, channel, nioChannel, selector, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readFrom(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, final java.nio.channels.ReadableByteChannel readableByteChannel, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        io.ktor.network.sockets.CIOReaderKt$readFrom$1 cIOReaderKt$readFrom$1;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef;
        if (continuation instanceof io.ktor.network.sockets.CIOReaderKt$readFrom$1) {
            cIOReaderKt$readFrom$1 = (io.ktor.network.sockets.CIOReaderKt$readFrom$1) continuation;
            if ((cIOReaderKt$readFrom$1.label & Integer.MIN_VALUE) != 0) {
                cIOReaderKt$readFrom$1.label -= Integer.MIN_VALUE;
                io.ktor.network.sockets.CIOReaderKt$readFrom$1 cIOReaderKt$readFrom$12 = cIOReaderKt$readFrom$1;
                java.lang.Object obj = cIOReaderKt$readFrom$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cIOReaderKt$readFrom$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.network.sockets.CIOReaderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            kotlin.Unit readFrom$lambda$0;
                            readFrom$lambda$0 = io.ktor.network.sockets.CIOReaderKt.readFrom$lambda$0(kotlin.jvm.internal.Ref.IntRef.this, readableByteChannel, (java.nio.ByteBuffer) obj2);
                            return readFrom$lambda$0;
                        }
                    };
                    cIOReaderKt$readFrom$12.L$0 = intRef2;
                    cIOReaderKt$readFrom$12.label = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.write$default(byteWriteChannel, 0, function1, cIOReaderKt$readFrom$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intRef = intRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (kotlin.jvm.internal.Ref.IntRef) cIOReaderKt$readFrom$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
            }
        }
        cIOReaderKt$readFrom$1 = new io.ktor.network.sockets.CIOReaderKt$readFrom$1(continuation);
        io.ktor.network.sockets.CIOReaderKt$readFrom$1 cIOReaderKt$readFrom$122 = cIOReaderKt$readFrom$1;
        java.lang.Object obj2 = cIOReaderKt$readFrom$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cIOReaderKt$readFrom$122.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit readFrom$lambda$0(kotlin.jvm.internal.Ref.IntRef intRef, java.nio.channels.ReadableByteChannel readableByteChannel, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        intRef.element = readableByteChannel.read(buffer);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object selectForRead(io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selectorManager, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        selectable.interestOp(io.ktor.network.selector.SelectInterest.READ, true);
        java.lang.Object select = selectorManager.select(selectable, io.ktor.network.selector.SelectInterest.READ, continuation);
        return select == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? select : kotlin.Unit.INSTANCE;
    }
}
