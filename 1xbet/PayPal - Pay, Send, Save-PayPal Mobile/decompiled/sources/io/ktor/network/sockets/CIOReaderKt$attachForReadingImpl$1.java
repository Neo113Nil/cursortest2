package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1", f = "CIOReader.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4}, l = {42, 44, 42, 44, 55}, m = "invokeSuspend", n = {com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "rc", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "rc", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "rc", "$this$withTimeout$iv", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "rc", "$this$withTimeout$iv", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes17.dex */
final class CIOReaderKt$attachForReadingImpl$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.nio.ByteBuffer Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.network.selector.Selectable getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.utils.io.ByteChannel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.nio.channels.ReadableByteChannel getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ io.ktor.network.selector.SelectorManager getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    private /* synthetic */ java.lang.Object unwrapAs;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:50:0x016d, B:52:0x0177, B:56:0x01a0, B:60:0x01d0, B:62:0x01d4, B:68:0x004b, B:70:0x0070), top: B:2:0x000e, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d4 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:50:0x016d, B:52:0x0177, B:56:0x01a0, B:60:0x01d0, B:62:0x01d4, B:68:0x004b, B:70:0x0070), top: B:2:0x000e, outer: #2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0163 -> B:14:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x023d -> B:11:0x0240). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01d2 -> B:50:0x016d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1 cIOReaderKt$attachForReadingImpl$1 = new io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, continuation);
        cIOReaderKt$attachForReadingImpl$1.unwrapAs = obj;
        return cIOReaderKt$attachForReadingImpl$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOReaderKt$attachForReadingImpl$1(io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, io.ktor.utils.io.ByteChannel byteChannel, io.ktor.network.selector.Selectable selectable, java.nio.ByteBuffer byteBuffer, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool, java.nio.channels.ReadableByteChannel readableByteChannel, io.ktor.network.selector.SelectorManager selectorManager, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = tCPClientSocketOptions;
        this.getHighSpeedVideoFpsRangesFor = byteChannel;
        this.getHighResolutionOutputSizeshNQ4ISI = selectable;
        this.Camera2StreamConfigurationMap = byteBuffer;
        this.getHighSpeedVideoFpsRanges = objectPool;
        this.getHighSpeedVideoSizes = readableByteChannel;
        this.getInputSizeshNQ4ISI = selectorManager;
    }
}
