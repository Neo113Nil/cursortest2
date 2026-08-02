package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1", f = "CIOReader.kt", i = {0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7}, l = {96, 105, 108, 109, 96, 105, 108, 109}, m = "invokeSuspend", n = {com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "$this$withTimeout$iv", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "$this$withTimeout$iv", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "$this$withTimeout$iv", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "$this$withTimeout$iv"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class CIOReaderKt$attachForReadingDirectImpl$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.network.selector.SelectorManager Camera2StreamConfigurationMap;
    final /* synthetic */ java.nio.channels.ReadableByteChannel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.network.selector.Selectable getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.utils.io.ByteChannel getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputStallDuration;
    private /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0230, code lost:
    
        if (((java.lang.Number) r15).intValue() == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a8, code lost:
    
        if (r15 == r0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134 A[Catch: all -> 0x0274, TryCatch #0 {all -> 0x0274, blocks: (B:19:0x0234, B:20:0x012c, B:22:0x0134, B:24:0x013e, B:27:0x015c, B:29:0x0164, B:31:0x016a, B:34:0x017f, B:37:0x0194, B:39:0x01aa, B:42:0x01b4, B:54:0x0241, B:55:0x0244, B:57:0x024c, B:70:0x0273, B:107:0x023b, B:108:0x023e, B:79:0x009e, B:81:0x00b7, B:83:0x00d0, B:85:0x00e9, B:87:0x00f5, B:89:0x0101, B:91:0x010d, B:8:0x002b, B:9:0x022a, B:11:0x01fa, B:15:0x0210, B:18:0x0232, B:43:0x01b7, B:46:0x01d6, B:48:0x01de, B:50:0x01e4, B:73:0x0048, B:75:0x0065, B:77:0x0082), top: B:2:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0164 A[Catch: all -> 0x0274, TryCatch #0 {all -> 0x0274, blocks: (B:19:0x0234, B:20:0x012c, B:22:0x0134, B:24:0x013e, B:27:0x015c, B:29:0x0164, B:31:0x016a, B:34:0x017f, B:37:0x0194, B:39:0x01aa, B:42:0x01b4, B:54:0x0241, B:55:0x0244, B:57:0x024c, B:70:0x0273, B:107:0x023b, B:108:0x023e, B:79:0x009e, B:81:0x00b7, B:83:0x00d0, B:85:0x00e9, B:87:0x00f5, B:89:0x0101, B:91:0x010d, B:8:0x002b, B:9:0x022a, B:11:0x01fa, B:15:0x0210, B:18:0x0232, B:43:0x01b7, B:46:0x01d6, B:48:0x01de, B:50:0x01e4, B:73:0x0048, B:75:0x0065, B:77:0x0082), top: B:2:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01de A[Catch: all -> 0x0087, TryCatch #1 {all -> 0x0087, blocks: (B:8:0x002b, B:9:0x022a, B:11:0x01fa, B:15:0x0210, B:18:0x0232, B:43:0x01b7, B:46:0x01d6, B:48:0x01de, B:50:0x01e4, B:73:0x0048, B:75:0x0065, B:77:0x0082), top: B:2:0x0008, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0227 -> B:9:0x022a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0164 -> B:20:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0168 -> B:20:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01b0 -> B:34:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01b2 -> B:20:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01de -> B:18:0x0232). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01e2 -> B:18:0x0232). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.network.util.Timeout createTimeout$default;
        io.ktor.network.selector.SelectorManager selectorManager;
        io.ktor.network.selector.Selectable selectable;
        java.nio.channels.ReadableByteChannel readableByteChannel;
        io.ktor.utils.io.ByteChannel byteChannel;
        io.ktor.network.selector.SelectorManager selectorManager2;
        java.nio.channels.ReadableByteChannel readableByteChannel2;
        io.ktor.utils.io.ByteChannel byteChannel2;
        io.ktor.network.util.Timeout timeout;
        int intValue;
        int intValue2;
        boolean z;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                switch (this.getOutputStallDuration) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.utils.io.WriterScope writerScope = (io.ktor.utils.io.WriterScope) this.getOutputStallDurationlomOqCM;
                        this.getHighSpeedVideoFpsRanges.interestOp(io.ktor.network.selector.SelectInterest.READ, false);
                        io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions = this.getHighSpeedVideoFpsRangesFor;
                        createTimeout$default = (tCPClientSocketOptions != null ? kotlin.coroutines.jvm.internal.Boxing.boxLong(tCPClientSocketOptions.getSocketTimeout()) : null) != null ? io.ktor.network.util.UtilsKt.createTimeout$default(writerScope, "reading-direct", this.getHighSpeedVideoFpsRangesFor.getSocketTimeout(), null, new io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1$timeout$1(this.getHighSpeedVideoSizes, null), 4, null) : null;
                        if (this.getHighSpeedVideoSizes.isClosedForWrite()) {
                            io.ktor.utils.io.ByteChannel byteChannel3 = this.getHighSpeedVideoSizes;
                            java.nio.channels.ReadableByteChannel readableByteChannel3 = this.getHighResolutionOutputSizeshNQ4ISI;
                            selectable = this.getHighSpeedVideoFpsRanges;
                            io.ktor.network.selector.SelectorManager selectorManager3 = this.Camera2StreamConfigurationMap;
                            if (createTimeout$default == null) {
                                this.getOutputStallDurationlomOqCM = createTimeout$default;
                                this.getInputFormats = byteChannel3;
                                this.getInputSizeshNQ4ISI = readableByteChannel3;
                                this.getOutputFormats = selectable;
                                this.getOutputMinFrameDuration = selectorManager3;
                                this.getHighSpeedVideoSizesFor = null;
                                this.getOutputStallDuration = 1;
                                java.lang.Object access$readFrom = io.ktor.network.sockets.CIOReaderKt.access$readFrom(byteChannel3, readableByteChannel3, this);
                                if (access$readFrom != coroutine_suspended) {
                                    byteChannel = byteChannel3;
                                    obj = access$readFrom;
                                    readableByteChannel = readableByteChannel3;
                                    selectorManager = selectorManager3;
                                    intValue2 = ((java.lang.Number) obj).intValue();
                                    if (intValue2 == -1) {
                                        byteChannel.close();
                                    } else if (intValue2 <= 0) {
                                        this.getOutputStallDurationlomOqCM = createTimeout$default;
                                        this.getInputFormats = byteChannel;
                                        this.getInputSizeshNQ4ISI = readableByteChannel;
                                        this.getOutputFormats = selectable;
                                        this.getOutputMinFrameDuration = selectorManager;
                                        this.getOutputStallDuration = 2;
                                        if (byteChannel.flush(this) == coroutine_suspended) {
                                        }
                                        this.getOutputStallDurationlomOqCM = createTimeout$default;
                                        this.getInputFormats = byteChannel;
                                        this.getInputSizeshNQ4ISI = readableByteChannel;
                                        this.getOutputFormats = selectable;
                                        this.getOutputMinFrameDuration = selectorManager;
                                        this.getOutputStallDuration = 3;
                                        if (io.ktor.network.sockets.CIOReaderKt.access$selectForRead(selectable, selectorManager, this) == coroutine_suspended) {
                                        }
                                        this.getOutputStallDurationlomOqCM = createTimeout$default;
                                        this.getInputFormats = byteChannel;
                                        this.getInputSizeshNQ4ISI = readableByteChannel;
                                        this.getOutputFormats = selectable;
                                        this.getOutputMinFrameDuration = selectorManager;
                                        this.getOutputStallDuration = 4;
                                        obj = io.ktor.network.sockets.CIOReaderKt.access$readFrom(byteChannel, readableByteChannel, this);
                                        break;
                                    }
                                    if (this.getHighSpeedVideoSizes.isClosedForWrite()) {
                                        if (createTimeout$default != null) {
                                            createTimeout$default.finish();
                                        }
                                        java.lang.Throwable closedCause = this.getHighSpeedVideoSizes.getClosedCause();
                                        if (closedCause != null) {
                                            throw closedCause;
                                        }
                                        this.getHighSpeedVideoSizes.close();
                                        if (z) {
                                            try {
                                                if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                                                    ((java.nio.channels.SocketChannel) this.getHighResolutionOutputSizeshNQ4ISI).shutdownInput();
                                                } else {
                                                    ((java.nio.channels.SocketChannel) this.getHighResolutionOutputSizeshNQ4ISI).socket().shutdownInput();
                                                }
                                            } catch (java.nio.channels.ClosedChannelException unused) {
                                            }
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }
                            } else {
                                createTimeout$default.start();
                                this.getOutputStallDurationlomOqCM = createTimeout$default;
                                this.getInputFormats = createTimeout$default;
                                this.getInputSizeshNQ4ISI = byteChannel3;
                                this.getOutputFormats = readableByteChannel3;
                                this.getOutputMinFrameDuration = selectable;
                                this.getHighSpeedVideoSizesFor = selectorManager3;
                                this.getOutputStallDuration = 5;
                                java.lang.Object access$readFrom2 = io.ktor.network.sockets.CIOReaderKt.access$readFrom(byteChannel3, readableByteChannel3, this);
                                if (access$readFrom2 != coroutine_suspended) {
                                    timeout = createTimeout$default;
                                    byteChannel2 = byteChannel3;
                                    obj = access$readFrom2;
                                    readableByteChannel2 = readableByteChannel3;
                                    selectorManager2 = selectorManager3;
                                    intValue = ((java.lang.Number) obj).intValue();
                                    if (intValue == -1) {
                                        byteChannel2.close();
                                    } else if (intValue <= 0) {
                                        this.getOutputStallDurationlomOqCM = timeout;
                                        this.getInputFormats = createTimeout$default;
                                        this.getInputSizeshNQ4ISI = byteChannel2;
                                        this.getOutputFormats = readableByteChannel2;
                                        this.getOutputMinFrameDuration = selectable;
                                        this.getHighSpeedVideoSizesFor = selectorManager2;
                                        this.getOutputStallDuration = 6;
                                        if (byteChannel2.flush(this) == coroutine_suspended) {
                                        }
                                        this.getOutputStallDurationlomOqCM = timeout;
                                        this.getInputFormats = createTimeout$default;
                                        this.getInputSizeshNQ4ISI = byteChannel2;
                                        this.getOutputFormats = readableByteChannel2;
                                        this.getOutputMinFrameDuration = selectable;
                                        this.getHighSpeedVideoSizesFor = selectorManager2;
                                        this.getOutputStallDuration = 7;
                                        if (io.ktor.network.sockets.CIOReaderKt.access$selectForRead(selectable, selectorManager2, this) == coroutine_suspended) {
                                        }
                                        this.getOutputStallDurationlomOqCM = timeout;
                                        this.getInputFormats = createTimeout$default;
                                        this.getInputSizeshNQ4ISI = byteChannel2;
                                        this.getOutputFormats = readableByteChannel2;
                                        this.getOutputMinFrameDuration = selectable;
                                        this.getHighSpeedVideoSizesFor = selectorManager2;
                                        this.getOutputStallDuration = 8;
                                        obj = io.ktor.network.sockets.CIOReaderKt.access$readFrom(byteChannel2, readableByteChannel2, this);
                                        if (obj == coroutine_suspended) {
                                        }
                                        break;
                                    }
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    createTimeout$default.stop();
                                    createTimeout$default = timeout;
                                    if (this.getHighSpeedVideoSizes.isClosedForWrite()) {
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                    case 1:
                        selectorManager = (io.ktor.network.selector.SelectorManager) this.getOutputMinFrameDuration;
                        selectable = (io.ktor.network.selector.Selectable) this.getOutputFormats;
                        readableByteChannel = (java.nio.channels.ReadableByteChannel) this.getInputSizeshNQ4ISI;
                        byteChannel = (io.ktor.utils.io.ByteChannel) this.getInputFormats;
                        createTimeout$default = (io.ktor.network.util.Timeout) this.getOutputStallDurationlomOqCM;
                        kotlin.ResultKt.throwOnFailure(obj);
                        intValue2 = ((java.lang.Number) obj).intValue();
                        if (intValue2 == -1) {
                        }
                        if (this.getHighSpeedVideoSizes.isClosedForWrite()) {
                        }
                        break;
                    case 2:
                        selectorManager = (io.ktor.network.selector.SelectorManager) this.getOutputMinFrameDuration;
                        selectable = (io.ktor.network.selector.Selectable) this.getOutputFormats;
                        readableByteChannel = (java.nio.channels.ReadableByteChannel) this.getInputSizeshNQ4ISI;
                        byteChannel = (io.ktor.utils.io.ByteChannel) this.getInputFormats;
                        createTimeout$default = (io.ktor.network.util.Timeout) this.getOutputStallDurationlomOqCM;
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getOutputStallDurationlomOqCM = createTimeout$default;
                        this.getInputFormats = byteChannel;
                        this.getInputSizeshNQ4ISI = readableByteChannel;
                        this.getOutputFormats = selectable;
                        this.getOutputMinFrameDuration = selectorManager;
                        this.getOutputStallDuration = 3;
                        if (io.ktor.network.sockets.CIOReaderKt.access$selectForRead(selectable, selectorManager, this) == coroutine_suspended) {
                        }
                        this.getOutputStallDurationlomOqCM = createTimeout$default;
                        this.getInputFormats = byteChannel;
                        this.getInputSizeshNQ4ISI = readableByteChannel;
                        this.getOutputFormats = selectable;
                        this.getOutputMinFrameDuration = selectorManager;
                        this.getOutputStallDuration = 4;
                        obj = io.ktor.network.sockets.CIOReaderKt.access$readFrom(byteChannel, readableByteChannel, this);
                        break;
                    case 3:
                        selectorManager = (io.ktor.network.selector.SelectorManager) this.getOutputMinFrameDuration;
                        selectable = (io.ktor.network.selector.Selectable) this.getOutputFormats;
                        readableByteChannel = (java.nio.channels.ReadableByteChannel) this.getInputSizeshNQ4ISI;
                        byteChannel = (io.ktor.utils.io.ByteChannel) this.getInputFormats;
                        createTimeout$default = (io.ktor.network.util.Timeout) this.getOutputStallDurationlomOqCM;
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getOutputStallDurationlomOqCM = createTimeout$default;
                        this.getInputFormats = byteChannel;
                        this.getInputSizeshNQ4ISI = readableByteChannel;
                        this.getOutputFormats = selectable;
                        this.getOutputMinFrameDuration = selectorManager;
                        this.getOutputStallDuration = 4;
                        obj = io.ktor.network.sockets.CIOReaderKt.access$readFrom(byteChannel, readableByteChannel, this);
                        break;
                    case 4:
                        selectorManager = (io.ktor.network.selector.SelectorManager) this.getOutputMinFrameDuration;
                        selectable = (io.ktor.network.selector.Selectable) this.getOutputFormats;
                        readableByteChannel = (java.nio.channels.ReadableByteChannel) this.getInputSizeshNQ4ISI;
                        byteChannel = (io.ktor.utils.io.ByteChannel) this.getInputFormats;
                        createTimeout$default = (io.ktor.network.util.Timeout) this.getOutputStallDurationlomOqCM;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Number) obj).intValue() != 0) {
                            if (this.getHighSpeedVideoSizes.isClosedForWrite()) {
                            }
                        }
                        this.getOutputStallDurationlomOqCM = createTimeout$default;
                        this.getInputFormats = byteChannel;
                        this.getInputSizeshNQ4ISI = readableByteChannel;
                        this.getOutputFormats = selectable;
                        this.getOutputMinFrameDuration = selectorManager;
                        this.getOutputStallDuration = 3;
                        if (io.ktor.network.sockets.CIOReaderKt.access$selectForRead(selectable, selectorManager, this) == coroutine_suspended) {
                        }
                        this.getOutputStallDurationlomOqCM = createTimeout$default;
                        this.getInputFormats = byteChannel;
                        this.getInputSizeshNQ4ISI = readableByteChannel;
                        this.getOutputFormats = selectable;
                        this.getOutputMinFrameDuration = selectorManager;
                        this.getOutputStallDuration = 4;
                        obj = io.ktor.network.sockets.CIOReaderKt.access$readFrom(byteChannel, readableByteChannel, this);
                        break;
                    case 5:
                        selectorManager2 = (io.ktor.network.selector.SelectorManager) this.getHighSpeedVideoSizesFor;
                        selectable = (io.ktor.network.selector.Selectable) this.getOutputMinFrameDuration;
                        readableByteChannel2 = (java.nio.channels.ReadableByteChannel) this.getOutputFormats;
                        byteChannel2 = (io.ktor.utils.io.ByteChannel) this.getInputSizeshNQ4ISI;
                        createTimeout$default = (io.ktor.network.util.Timeout) this.getInputFormats;
                        timeout = (io.ktor.network.util.Timeout) this.getOutputStallDurationlomOqCM;
                        kotlin.ResultKt.throwOnFailure(obj);
                        intValue = ((java.lang.Number) obj).intValue();
                        if (intValue == -1) {
                        }
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        createTimeout$default.stop();
                        createTimeout$default = timeout;
                        if (this.getHighSpeedVideoSizes.isClosedForWrite()) {
                        }
                        break;
                    case 6:
                        selectorManager2 = (io.ktor.network.selector.SelectorManager) this.getHighSpeedVideoSizesFor;
                        selectable = (io.ktor.network.selector.Selectable) this.getOutputMinFrameDuration;
                        readableByteChannel2 = (java.nio.channels.ReadableByteChannel) this.getOutputFormats;
                        byteChannel2 = (io.ktor.utils.io.ByteChannel) this.getInputSizeshNQ4ISI;
                        createTimeout$default = (io.ktor.network.util.Timeout) this.getInputFormats;
                        timeout = (io.ktor.network.util.Timeout) this.getOutputStallDurationlomOqCM;
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getOutputStallDurationlomOqCM = timeout;
                        this.getInputFormats = createTimeout$default;
                        this.getInputSizeshNQ4ISI = byteChannel2;
                        this.getOutputFormats = readableByteChannel2;
                        this.getOutputMinFrameDuration = selectable;
                        this.getHighSpeedVideoSizesFor = selectorManager2;
                        this.getOutputStallDuration = 7;
                        if (io.ktor.network.sockets.CIOReaderKt.access$selectForRead(selectable, selectorManager2, this) == coroutine_suspended) {
                        }
                        this.getOutputStallDurationlomOqCM = timeout;
                        this.getInputFormats = createTimeout$default;
                        this.getInputSizeshNQ4ISI = byteChannel2;
                        this.getOutputFormats = readableByteChannel2;
                        this.getOutputMinFrameDuration = selectable;
                        this.getHighSpeedVideoSizesFor = selectorManager2;
                        this.getOutputStallDuration = 8;
                        obj = io.ktor.network.sockets.CIOReaderKt.access$readFrom(byteChannel2, readableByteChannel2, this);
                        if (obj == coroutine_suspended) {
                        }
                        break;
                    case 7:
                        selectorManager2 = (io.ktor.network.selector.SelectorManager) this.getHighSpeedVideoSizesFor;
                        selectable = (io.ktor.network.selector.Selectable) this.getOutputMinFrameDuration;
                        readableByteChannel2 = (java.nio.channels.ReadableByteChannel) this.getOutputFormats;
                        byteChannel2 = (io.ktor.utils.io.ByteChannel) this.getInputSizeshNQ4ISI;
                        createTimeout$default = (io.ktor.network.util.Timeout) this.getInputFormats;
                        timeout = (io.ktor.network.util.Timeout) this.getOutputStallDurationlomOqCM;
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getOutputStallDurationlomOqCM = timeout;
                        this.getInputFormats = createTimeout$default;
                        this.getInputSizeshNQ4ISI = byteChannel2;
                        this.getOutputFormats = readableByteChannel2;
                        this.getOutputMinFrameDuration = selectable;
                        this.getHighSpeedVideoSizesFor = selectorManager2;
                        this.getOutputStallDuration = 8;
                        obj = io.ktor.network.sockets.CIOReaderKt.access$readFrom(byteChannel2, readableByteChannel2, this);
                        if (obj == coroutine_suspended) {
                        }
                        break;
                    case 8:
                        selectorManager2 = (io.ktor.network.selector.SelectorManager) this.getHighSpeedVideoSizesFor;
                        selectable = (io.ktor.network.selector.Selectable) this.getOutputMinFrameDuration;
                        readableByteChannel2 = (java.nio.channels.ReadableByteChannel) this.getOutputFormats;
                        byteChannel2 = (io.ktor.utils.io.ByteChannel) this.getInputSizeshNQ4ISI;
                        createTimeout$default = (io.ktor.network.util.Timeout) this.getInputFormats;
                        timeout = (io.ktor.network.util.Timeout) this.getOutputStallDurationlomOqCM;
                        kotlin.ResultKt.throwOnFailure(obj);
                        break;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (java.lang.Throwable th) {
                createTimeout$default.stop();
                throw th;
            }
        } finally {
            if (this.getHighResolutionOutputSizeshNQ4ISI instanceof java.nio.channels.SocketChannel) {
                try {
                    if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                        ((java.nio.channels.SocketChannel) this.getHighResolutionOutputSizeshNQ4ISI).shutdownInput();
                    } else {
                        ((java.nio.channels.SocketChannel) this.getHighResolutionOutputSizeshNQ4ISI).socket().shutdownInput();
                    }
                } catch (java.nio.channels.ClosedChannelException unused2) {
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1 cIOReaderKt$attachForReadingDirectImpl$1 = new io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        cIOReaderKt$attachForReadingDirectImpl$1.getOutputStallDurationlomOqCM = obj;
        return cIOReaderKt$attachForReadingDirectImpl$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOReaderKt$attachForReadingDirectImpl$1(io.ktor.network.selector.Selectable selectable, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, io.ktor.utils.io.ByteChannel byteChannel, java.nio.channels.ReadableByteChannel readableByteChannel, io.ktor.network.selector.SelectorManager selectorManager, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = selectable;
        this.getHighSpeedVideoFpsRangesFor = tCPClientSocketOptions;
        this.getHighSpeedVideoSizes = byteChannel;
        this.getHighResolutionOutputSizeshNQ4ISI = readableByteChannel;
        this.Camera2StreamConfigurationMap = selectorManager;
    }
}
