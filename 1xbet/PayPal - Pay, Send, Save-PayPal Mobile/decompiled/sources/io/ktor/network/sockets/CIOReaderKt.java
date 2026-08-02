package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteChannel;", "channel", "Ljava/nio/channels/ReadableByteChannel;", "nioChannel", "Lio/ktor/network/selector/Selectable;", "selectable", "Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "Lio/ktor/utils/io/WriterJob;", "attachForReadingImpl", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteChannel;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lio/ktor/utils/io/pool/ObjectPool;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)Lio/ktor/utils/io/WriterJob;", "attachForReadingDirectImpl", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/utils/io/ByteChannel;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)Lio/ktor/utils/io/WriterJob;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CIOReaderKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$readFrom(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, final java.nio.channels.ReadableByteChannel readableByteChannel, kotlin.coroutines.Continuation continuation) {
        io.ktor.network.sockets.CIOReaderKt$readFrom$1 cIOReaderKt$readFrom$1;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef;
        if (continuation instanceof io.ktor.network.sockets.CIOReaderKt$readFrom$1) {
            cIOReaderKt$readFrom$1 = (io.ktor.network.sockets.CIOReaderKt$readFrom$1) continuation;
            if ((cIOReaderKt$readFrom$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                cIOReaderKt$readFrom$1.getHighSpeedVideoFpsRanges -= 2147483648;
                io.ktor.network.sockets.CIOReaderKt$readFrom$1 cIOReaderKt$readFrom$12 = cIOReaderKt$readFrom$1;
                java.lang.Object obj = cIOReaderKt$readFrom$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cIOReaderKt$readFrom$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.network.sockets.CIOReaderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return io.ktor.network.sockets.CIOReaderKt.$r8$lambda$Js9p8Q8zGEhfyoRx4vADpPJikgM(kotlin.jvm.internal.Ref.IntRef.this, readableByteChannel, (java.nio.ByteBuffer) obj2);
                        }
                    };
                    cIOReaderKt$readFrom$12.Camera2StreamConfigurationMap = intRef2;
                    cIOReaderKt$readFrom$12.getHighSpeedVideoFpsRanges = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.write$default(byteWriteChannel, 0, function1, cIOReaderKt$readFrom$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intRef = intRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (kotlin.jvm.internal.Ref.IntRef) cIOReaderKt$readFrom$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
            }
        }
        cIOReaderKt$readFrom$1 = new io.ktor.network.sockets.CIOReaderKt$readFrom$1(continuation);
        io.ktor.network.sockets.CIOReaderKt$readFrom$1 cIOReaderKt$readFrom$122 = cIOReaderKt$readFrom$1;
        java.lang.Object obj2 = cIOReaderKt$readFrom$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cIOReaderKt$readFrom$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
    }

    public static /* synthetic */ io.ktor.utils.io.WriterJob attachForReadingImpl$default(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteChannel byteChannel, java.nio.channels.ReadableByteChannel readableByteChannel, io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.utils.io.pool.ObjectPool objectPool, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            tCPClientSocketOptions = null;
        }
        return attachForReadingImpl(coroutineScope, byteChannel, readableByteChannel, selectable, selectorManager, objectPool, tCPClientSocketOptions);
    }

    public static final io.ktor.utils.io.WriterJob attachForReadingImpl(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteChannel byteChannel, java.nio.channels.ReadableByteChannel readableByteChannel, io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readableByteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectorManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectPool, "");
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer(coroutineScope, kotlinx.coroutines.Dispatchers.getIO().plus(new kotlinx.coroutines.CoroutineName("cio-from-nio-reader")), byteChannel, new io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1(tCPClientSocketOptions, byteChannel, selectable, objectPool.borrow(), objectPool, readableByteChannel, selectorManager, null));
    }

    public static /* synthetic */ io.ktor.utils.io.WriterJob attachForReadingDirectImpl$default(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteChannel byteChannel, java.nio.channels.ReadableByteChannel readableByteChannel, io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            tCPClientSocketOptions = null;
        }
        return attachForReadingDirectImpl(coroutineScope, byteChannel, readableByteChannel, selectable, selectorManager, tCPClientSocketOptions);
    }

    public static final io.ktor.utils.io.WriterJob attachForReadingDirectImpl(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.utils.io.ByteChannel byteChannel, java.nio.channels.ReadableByteChannel readableByteChannel, io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readableByteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectorManager, "");
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer(coroutineScope, kotlinx.coroutines.Dispatchers.getIO().plus(new kotlinx.coroutines.CoroutineName("cio-from-nio-reader")), byteChannel, new io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1(selectable, tCPClientSocketOptions, byteChannel, readableByteChannel, selectorManager, null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Js9p8Q8zGEhfyoRx4vADpPJikgM(kotlin.jvm.internal.Ref.IntRef intRef, java.nio.channels.ReadableByteChannel readableByteChannel, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        intRef.element = readableByteChannel.read(byteBuffer);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$selectForRead(io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectorManager selectorManager, kotlin.coroutines.Continuation continuation) {
        selectable.interestOp(io.ktor.network.selector.SelectInterest.READ, true);
        java.lang.Object select = selectorManager.select(selectable, io.ktor.network.selector.SelectInterest.READ, continuation);
        return select == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? select : kotlin.Unit.INSTANCE;
    }
}
