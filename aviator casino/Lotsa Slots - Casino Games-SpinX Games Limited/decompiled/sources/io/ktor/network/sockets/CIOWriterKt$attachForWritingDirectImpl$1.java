package io.ktor.network.sockets;

/* compiled from: CIOWriter.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ReaderScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1", f = "CIOWriter.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3}, l = {33, 75, 79, 50}, m = "invokeSuspend", n = {"timeout", "timeout", "rc", "$this$read_u24default$iv", "consumer$iv", "min$iv", "timeout", "rc", "$this$read_u24default$iv", "consumer$iv", "timeout"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes6.dex */
final class CIOWriterKt$attachForWritingDirectImpl$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.ReaderScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteChannel $channel;
    final /* synthetic */ java.nio.channels.WritableByteChannel $nioChannel;
    final /* synthetic */ io.ktor.network.selector.Selectable $selectable;
    final /* synthetic */ io.ktor.network.selector.SelectorManager $selector;
    final /* synthetic */ io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions $socketOptions;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOWriterKt$attachForWritingDirectImpl$1(io.ktor.network.selector.Selectable selectable, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, io.ktor.utils.io.ByteChannel byteChannel, io.ktor.network.selector.SelectorManager selectorManager, java.nio.channels.WritableByteChannel writableByteChannel, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1> continuation) {
        super(2, continuation);
        this.$selectable = selectable;
        this.$socketOptions = tCPClientSocketOptions;
        this.$channel = byteChannel;
        this.$selector = selectorManager;
        this.$nioChannel = writableByteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1 cIOWriterKt$attachForWritingDirectImpl$1 = new io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1(this.$selectable, this.$socketOptions, this.$channel, this.$selector, this.$nioChannel, continuation);
        cIOWriterKt$attachForWritingDirectImpl$1.L$0 = obj;
        return cIOWriterKt$attachForWritingDirectImpl$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(io.ktor.utils.io.ReaderScope readerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1) create(readerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7 A[Catch: all -> 0x018f, TryCatch #2 {all -> 0x018f, blocks: (B:10:0x001c, B:13:0x00af, B:15:0x00b7, B:17:0x00c1, B:24:0x00d9, B:28:0x0103, B:30:0x010b, B:31:0x0114, B:33:0x0118, B:36:0x0139, B:37:0x0160, B:40:0x0163, B:56:0x0039, B:58:0x0046, B:61:0x0062, B:65:0x007f, B:67:0x0083, B:69:0x008f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b A[Catch: all -> 0x018f, TryCatch #2 {all -> 0x018f, blocks: (B:10:0x001c, B:13:0x00af, B:15:0x00b7, B:17:0x00c1, B:24:0x00d9, B:28:0x0103, B:30:0x010b, B:31:0x0114, B:33:0x0118, B:36:0x0139, B:37:0x0160, B:40:0x0163, B:56:0x0039, B:58:0x0046, B:61:0x0062, B:65:0x007f, B:67:0x0083, B:69:0x008f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118 A[Catch: all -> 0x018f, TryCatch #2 {all -> 0x018f, blocks: (B:10:0x001c, B:13:0x00af, B:15:0x00b7, B:17:0x00c1, B:24:0x00d9, B:28:0x0103, B:30:0x010b, B:31:0x0114, B:33:0x0118, B:36:0x0139, B:37:0x0160, B:40:0x0163, B:56:0x0039, B:58:0x0046, B:61:0x0062, B:65:0x007f, B:67:0x0083, B:69:0x008f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0139 A[Catch: all -> 0x018f, TryCatch #2 {all -> 0x018f, blocks: (B:10:0x001c, B:13:0x00af, B:15:0x00b7, B:17:0x00c1, B:24:0x00d9, B:28:0x0103, B:30:0x010b, B:31:0x0114, B:33:0x0118, B:36:0x0139, B:37:0x0160, B:40:0x0163, B:56:0x0039, B:58:0x0046, B:61:0x0062, B:65:0x007f, B:67:0x0083, B:69:0x008f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0163 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #2 {all -> 0x018f, blocks: (B:10:0x001c, B:13:0x00af, B:15:0x00b7, B:17:0x00c1, B:24:0x00d9, B:28:0x0103, B:30:0x010b, B:31:0x0114, B:33:0x0118, B:36:0x0139, B:37:0x0160, B:40:0x0163, B:56:0x0039, B:58:0x0046, B:61:0x0062, B:65:0x007f, B:67:0x0083, B:69:0x008f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0116 -> B:12:0x00af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0136 -> B:12:0x00af). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.network.util.Timeout createTimeout$default;
        final io.ktor.network.util.Timeout timeout;
        io.ktor.network.util.Timeout timeout2;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlin.jvm.functions.Function1 function1;
        io.ktor.utils.io.ByteChannel byteChannel;
        java.lang.Object obj2;
        int i;
        boolean z;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    createTimeout$default = (io.ktor.network.util.Timeout) this.L$0;
                } else if (i2 == 2) {
                    i = this.I$0;
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) this.L$3;
                    byteChannel = (io.ktor.utils.io.ByteReadChannel) this.L$2;
                    kotlin.jvm.internal.Ref.IntRef intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.L$1;
                    io.ktor.network.util.Timeout timeout3 = (io.ktor.network.util.Timeout) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    timeout2 = timeout3;
                    intRef = intRef2;
                    function1 = function12;
                    obj2 = obj;
                    if (((java.lang.Boolean) obj2).booleanValue()) {
                    }
                } else {
                    if (i2 == 3) {
                        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) this.L$3;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel = (io.ktor.utils.io.ByteReadChannel) this.L$2;
                        kotlin.jvm.internal.Ref.IntRef intRef3 = (kotlin.jvm.internal.Ref.IntRef) this.L$1;
                        io.ktor.network.util.Timeout timeout4 = (io.ktor.network.util.Timeout) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function13);
                        }
                        timeout = timeout4;
                        if (intRef3.element == 0) {
                            this.$selectable.interestOp(io.ktor.network.selector.SelectInterest.WRITE, true);
                            this.L$0 = timeout;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 4;
                            if (this.$selector.select(this.$selectable, io.ktor.network.selector.SelectInterest.WRITE, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        while (!this.$channel.isClosedForRead()) {
                            if (io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(this.$channel) == 0) {
                                this.L$0 = timeout;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 1;
                                if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(this.$channel, 0, this, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                final kotlin.jvm.internal.Ref.IntRef intRef4 = new kotlin.jvm.internal.Ref.IntRef();
                                byteChannel = this.$channel;
                                final java.nio.channels.WritableByteChannel writableByteChannel = this.$nioChannel;
                                function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                        kotlin.Unit invokeSuspend$lambda$1;
                                        invokeSuspend$lambda$1 = io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1.invokeSuspend$lambda$1(io.ktor.network.util.Timeout.this, intRef4, writableByteChannel, (java.nio.ByteBuffer) obj3);
                                        return invokeSuspend$lambda$1;
                                    }
                                };
                                this.L$0 = timeout;
                                this.L$1 = intRef4;
                                this.L$2 = byteChannel;
                                this.L$3 = function1;
                                this.I$0 = 1;
                                this.label = 2;
                                obj2 = byteChannel.awaitContent(1, this);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                timeout2 = timeout;
                                intRef = intRef4;
                                i = 1;
                                if (((java.lang.Boolean) obj2).booleanValue()) {
                                    throw new java.io.EOFException("Not enough bytes available: required " + i + " but " + io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(byteChannel) + " available");
                                }
                                io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteChannel.getReadBuffer(), function1);
                                intRef3 = intRef;
                                timeout = timeout2;
                                if (intRef3.element == 0) {
                                }
                                while (!this.$channel.isClosedForRead()) {
                                }
                            }
                        }
                        if (timeout != null) {
                            timeout.finish();
                        }
                        if (z) {
                            try {
                                if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                                    ((java.nio.channels.SocketChannel) this.$nioChannel).shutdownOutput();
                                } else {
                                    ((java.nio.channels.SocketChannel) this.$nioChannel).socket().shutdownOutput();
                                }
                            } catch (java.nio.channels.ClosedChannelException unused) {
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createTimeout$default = (io.ktor.network.util.Timeout) this.L$0;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.utils.io.ReaderScope readerScope = (io.ktor.utils.io.ReaderScope) this.L$0;
                this.$selectable.interestOp(io.ktor.network.selector.SelectInterest.WRITE, false);
                io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions = this.$socketOptions;
                createTimeout$default = (tCPClientSocketOptions != null ? kotlin.coroutines.jvm.internal.Boxing.boxLong(tCPClientSocketOptions.getSocketTimeout()) : null) != null ? io.ktor.network.util.UtilsKt.createTimeout$default(readerScope, "writing-direct", this.$socketOptions.getSocketTimeout(), null, new io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$timeout$1(this.$channel, null), 4, null) : null;
            }
            timeout = createTimeout$default;
            while (!this.$channel.isClosedForRead()) {
            }
            if (timeout != null) {
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            this.$selectable.interestOp(io.ktor.network.selector.SelectInterest.WRITE, false);
            if (this.$nioChannel instanceof java.nio.channels.SocketChannel) {
                try {
                    if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                        ((java.nio.channels.SocketChannel) this.$nioChannel).shutdownOutput();
                    } else {
                        ((java.nio.channels.SocketChannel) this.$nioChannel).socket().shutdownOutput();
                    }
                } catch (java.nio.channels.ClosedChannelException unused2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit invokeSuspend$lambda$1(io.ktor.network.util.Timeout timeout, kotlin.jvm.internal.Ref.IntRef intRef, java.nio.channels.WritableByteChannel writableByteChannel, java.nio.ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            if (timeout == null) {
                do {
                    intRef.element = writableByteChannel.write(byteBuffer);
                    if (byteBuffer.hasRemaining()) {
                    }
                } while (intRef.element > 0);
            } else {
                timeout.start();
                do {
                    try {
                        intRef.element = writableByteChannel.write(byteBuffer);
                        if (!byteBuffer.hasRemaining()) {
                            break;
                        }
                    } finally {
                        timeout.stop();
                    }
                } while (intRef.element > 0);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
