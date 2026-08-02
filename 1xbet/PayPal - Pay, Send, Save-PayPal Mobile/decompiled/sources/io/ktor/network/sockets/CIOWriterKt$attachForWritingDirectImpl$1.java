package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ReaderScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1", f = "CIOWriter.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3}, l = {33, 75, 79, 50}, m = "invokeSuspend", n = {com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "rc", "$this$read_u24default$iv", "consumer$iv", "min$iv", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "rc", "$this$read_u24default$iv", "consumer$iv", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes17.dex */
final class CIOWriterKt$attachForWritingDirectImpl$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.ReaderScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.ByteChannel Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.nio.channels.WritableByteChannel getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.network.selector.SelectorManager getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.network.selector.Selectable getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0115 A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x018d, blocks: (B:13:0x0031, B:15:0x003e, B:17:0x0111, B:24:0x00a9, B:26:0x00b1, B:28:0x00bb, B:34:0x00d4, B:37:0x0100, B:39:0x0108, B:40:0x0136, B:41:0x015d, B:44:0x0161, B:19:0x0115, B:58:0x005a, B:61:0x0067, B:63:0x0079, B:65:0x007d, B:67:0x0089), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108 A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x018d, blocks: (B:13:0x0031, B:15:0x003e, B:17:0x0111, B:24:0x00a9, B:26:0x00b1, B:28:0x00bb, B:34:0x00d4, B:37:0x0100, B:39:0x0108, B:40:0x0136, B:41:0x015d, B:44:0x0161, B:19:0x0115, B:58:0x005a, B:61:0x0067, B:63:0x0079, B:65:0x007d, B:67:0x0089), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136 A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x018d, blocks: (B:13:0x0031, B:15:0x003e, B:17:0x0111, B:24:0x00a9, B:26:0x00b1, B:28:0x00bb, B:34:0x00d4, B:37:0x0100, B:39:0x0108, B:40:0x0136, B:41:0x015d, B:44:0x0161, B:19:0x0115, B:58:0x005a, B:61:0x0067, B:63:0x0079, B:65:0x007d, B:67:0x0089), top: B:2:0x000d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0113 -> B:19:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0133 -> B:19:0x00a9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final io.ktor.network.util.Timeout createTimeout$default;
        io.ktor.network.util.Timeout timeout;
        kotlin.jvm.internal.Ref.IntRef intRef;
        java.lang.Object obj2;
        io.ktor.utils.io.ByteChannel byteChannel;
        kotlin.jvm.functions.Function1 function1;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        boolean z;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getInputFormats;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = this.getOutputFormats;
                        function1 = (kotlin.jvm.functions.Function1) this.getOutputMinFrameDuration;
                        byteChannel = (io.ktor.utils.io.ByteReadChannel) this.getInputSizeshNQ4ISI;
                        kotlin.jvm.internal.Ref.IntRef intRef3 = (kotlin.jvm.internal.Ref.IntRef) this.getHighSpeedVideoSizesFor;
                        io.ktor.network.util.Timeout timeout2 = (io.ktor.network.util.Timeout) this.getOutputStallDurationlomOqCM;
                        kotlin.ResultKt.throwOnFailure(obj);
                        timeout = timeout2;
                        intRef = intRef3;
                        obj2 = obj;
                        if (((java.lang.Boolean) obj2).booleanValue()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("Not enough bytes available: required ");
                            sb.append(i);
                            sb.append(" but ");
                            sb.append(io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(byteChannel));
                            sb.append(" available");
                            throw new java.io.EOFException(sb.toString());
                        }
                        io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteChannel.getReadBuffer(), function1);
                        intRef2 = intRef;
                        createTimeout$default = timeout;
                        if (intRef2.element == 0) {
                        }
                    } else if (i2 == 3) {
                        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) this.getOutputMinFrameDuration;
                        io.ktor.utils.io.ByteReadChannel byteReadChannel = (io.ktor.utils.io.ByteReadChannel) this.getInputSizeshNQ4ISI;
                        intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.getHighSpeedVideoSizesFor;
                        io.ktor.network.util.Timeout timeout3 = (io.ktor.network.util.Timeout) this.getOutputStallDurationlomOqCM;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), function12);
                        }
                        createTimeout$default = timeout3;
                        if (intRef2.element == 0) {
                            this.getHighSpeedVideoSizes.interestOp(io.ktor.network.selector.SelectInterest.WRITE, true);
                            this.getOutputStallDurationlomOqCM = createTimeout$default;
                            this.getHighSpeedVideoSizesFor = null;
                            this.getInputSizeshNQ4ISI = null;
                            this.getOutputMinFrameDuration = null;
                            this.getInputFormats = 4;
                            if (this.getHighSpeedVideoFpsRangesFor.select(this.getHighSpeedVideoSizes, io.ktor.network.selector.SelectInterest.WRITE, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                createTimeout$default = (io.ktor.network.util.Timeout) this.getOutputStallDurationlomOqCM;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.utils.io.ReaderScope readerScope = (io.ktor.utils.io.ReaderScope) this.getOutputStallDurationlomOqCM;
                this.getHighSpeedVideoSizes.interestOp(io.ktor.network.selector.SelectInterest.WRITE, false);
                io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions = this.getHighResolutionOutputSizeshNQ4ISI;
                createTimeout$default = (tCPClientSocketOptions != null ? kotlin.coroutines.jvm.internal.Boxing.boxLong(tCPClientSocketOptions.getSocketTimeout()) : null) != null ? io.ktor.network.util.UtilsKt.createTimeout$default(readerScope, "writing-direct", this.getHighResolutionOutputSizeshNQ4ISI.getSocketTimeout(), null, new io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$timeout$1(this.Camera2StreamConfigurationMap, null), 4, null) : null;
            }
            while (!this.Camera2StreamConfigurationMap.isClosedForRead()) {
                if (io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(this.Camera2StreamConfigurationMap) == 0) {
                    this.getOutputStallDurationlomOqCM = createTimeout$default;
                    this.getHighSpeedVideoSizesFor = null;
                    this.getInputSizeshNQ4ISI = null;
                    this.getOutputMinFrameDuration = null;
                    this.getInputFormats = 1;
                    if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(this.Camera2StreamConfigurationMap, 0, this, 1, null) == coroutine_suspended) {
                    }
                } else {
                    final kotlin.jvm.internal.Ref.IntRef intRef4 = new kotlin.jvm.internal.Ref.IntRef();
                    byteChannel = this.Camera2StreamConfigurationMap;
                    final java.nio.channels.WritableByteChannel writableByteChannel = this.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            kotlin.Unit highSpeedVideoFpsRangesFor;
                            highSpeedVideoFpsRangesFor = io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1.getHighSpeedVideoFpsRangesFor(io.ktor.network.util.Timeout.this, intRef4, writableByteChannel, (java.nio.ByteBuffer) obj3);
                            return highSpeedVideoFpsRangesFor;
                        }
                    };
                    this.getOutputStallDurationlomOqCM = createTimeout$default;
                    this.getHighSpeedVideoSizesFor = intRef4;
                    this.getInputSizeshNQ4ISI = byteChannel;
                    this.getOutputMinFrameDuration = function13;
                    this.getOutputFormats = 1;
                    this.getInputFormats = 2;
                    obj2 = byteChannel.awaitContent(1, this);
                    if (obj2 != coroutine_suspended) {
                        timeout = createTimeout$default;
                        i = 1;
                        intRef = intRef4;
                        function1 = function13;
                        if (((java.lang.Boolean) obj2).booleanValue()) {
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (createTimeout$default != null) {
                createTimeout$default.finish();
            }
            if (z) {
                try {
                    if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                        ((java.nio.channels.SocketChannel) this.getHighSpeedVideoFpsRanges).shutdownOutput();
                    } else {
                        ((java.nio.channels.SocketChannel) this.getHighSpeedVideoFpsRanges).socket().shutdownOutput();
                    }
                } catch (java.nio.channels.ClosedChannelException unused) {
                }
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            this.getHighSpeedVideoSizes.interestOp(io.ktor.network.selector.SelectInterest.WRITE, false);
            if (this.getHighSpeedVideoFpsRanges instanceof java.nio.channels.SocketChannel) {
                try {
                    if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                        ((java.nio.channels.SocketChannel) this.getHighSpeedVideoFpsRanges).shutdownOutput();
                    } else {
                        ((java.nio.channels.SocketChannel) this.getHighSpeedVideoFpsRanges).socket().shutdownOutput();
                    }
                } catch (java.nio.channels.ClosedChannelException unused2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(io.ktor.network.util.Timeout timeout, kotlin.jvm.internal.Ref.IntRef intRef, java.nio.channels.WritableByteChannel writableByteChannel, java.nio.ByteBuffer byteBuffer) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.ReaderScope readerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1) create(readerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1 cIOWriterKt$attachForWritingDirectImpl$1 = new io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        cIOWriterKt$attachForWritingDirectImpl$1.getOutputStallDurationlomOqCM = obj;
        return cIOWriterKt$attachForWritingDirectImpl$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOWriterKt$attachForWritingDirectImpl$1(io.ktor.network.selector.Selectable selectable, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, io.ktor.utils.io.ByteChannel byteChannel, io.ktor.network.selector.SelectorManager selectorManager, java.nio.channels.WritableByteChannel writableByteChannel, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = selectable;
        this.getHighResolutionOutputSizeshNQ4ISI = tCPClientSocketOptions;
        this.Camera2StreamConfigurationMap = byteChannel;
        this.getHighSpeedVideoFpsRangesFor = selectorManager;
        this.getHighSpeedVideoFpsRanges = writableByteChannel;
    }
}
