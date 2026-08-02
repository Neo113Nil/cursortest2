package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", f = "ByteChannels.kt", i = {1}, l = {64, 66, 67, 81, 82, 81, 82, 81, 82}, m = "invokeSuspend", n = {"it"}, s = {"L$4"})
/* loaded from: classes17.dex */
final class ByteChannelsKt$copyToBoth$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.utils.io.ByteWriteChannel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.utils.io.ByteWriteChannel getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0160, code lost:
    
        if (r9.getHighResolutionOutputSizeshNQ4ISI.flushAndClose(r9) != r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x012e, code lost:
    
        if (r9.getHighResolutionOutputSizeshNQ4ISI.flushAndClose(r9) == r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r10 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0152, code lost:
    
        if (r9.getHighSpeedVideoSizes.flushAndClose(r9) == r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017d, code lost:
    
        if (r9.getHighSpeedVideoSizes.flushAndClose(r9) == r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0120, code lost:
    
        if (r9.getHighSpeedVideoSizes.flushAndClose(r9) != r0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[Catch: all -> 0x006b, TryCatch #3 {all -> 0x006b, blocks: (B:27:0x00f6, B:28:0x0071, B:30:0x0079, B:32:0x0081, B:34:0x0089, B:36:0x00a3, B:55:0x00fe, B:56:0x0101, B:66:0x0102, B:70:0x0131, B:80:0x0067, B:26:0x00f4, B:38:0x00ac, B:48:0x00eb, B:52:0x00fc), top: B:79:0x0067, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131 A[Catch: all -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x006b, blocks: (B:27:0x00f6, B:28:0x0071, B:30:0x0079, B:32:0x0081, B:34:0x0089, B:36:0x00a3, B:55:0x00fe, B:56:0x0101, B:66:0x0102, B:70:0x0131, B:80:0x0067, B:26:0x00f4, B:38:0x00ac, B:48:0x00eb, B:52:0x00fc), top: B:79:0x0067, inners: #4, #5 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e2 -> B:25:0x00f4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.io.Source source;
        io.ktor.utils.io.ByteReadChannel byteReadChannel;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        java.lang.AutoCloseable autoCloseable;
        java.lang.AutoCloseable autoCloseable2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4;
        io.ktor.utils.io.ByteReadChannel byteReadChannel2;
        kotlinx.io.Source peek;
        java.lang.Throwable closedCause;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getInputFormats) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.getHighSpeedVideoFpsRanges.isClosedForRead() && (!this.getHighSpeedVideoSizes.isClosedForWrite() || !this.getHighResolutionOutputSizeshNQ4ISI.isClosedForWrite())) {
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.Camera2StreamConfigurationMap = null;
                    this.getOutputMinFrameDuration = null;
                    this.getHighSpeedVideoSizesFor = null;
                    this.getOutputFormats = null;
                    this.getInputFormats = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(this.getHighSpeedVideoFpsRanges, 4096L, this);
                    break;
                } else {
                    closedCause = this.getHighSpeedVideoFpsRanges.getClosedCause();
                    if (closedCause != null) {
                        throw closedCause;
                    }
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.Camera2StreamConfigurationMap = null;
                    this.getOutputMinFrameDuration = null;
                    this.getHighSpeedVideoSizesFor = null;
                    this.getOutputFormats = null;
                    this.getInputFormats = 4;
                    break;
                }
                return coroutine_suspended;
            case 1:
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    autoCloseable2 = (java.lang.AutoCloseable) obj;
                    byteWriteChannel3 = this.getHighSpeedVideoSizes;
                    byteWriteChannel4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    byteReadChannel2 = this.getHighSpeedVideoFpsRanges;
                    try {
                        kotlinx.io.Source source2 = (kotlinx.io.Source) autoCloseable2;
                        kotlinx.io.Source peek2 = source2.peek();
                        this.getHighSpeedVideoFpsRangesFor = autoCloseable2;
                        this.Camera2StreamConfigurationMap = byteWriteChannel3;
                        this.getOutputMinFrameDuration = byteWriteChannel4;
                        this.getHighSpeedVideoSizesFor = byteReadChannel2;
                        this.getOutputFormats = source2;
                        this.getInputFormats = 2;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writePacket(byteWriteChannel3, peek2, this) != coroutine_suspended) {
                            autoCloseable = autoCloseable2;
                            byteWriteChannel2 = byteWriteChannel3;
                            byteWriteChannel = byteWriteChannel4;
                            byteReadChannel = byteReadChannel2;
                            source = source2;
                            peek = source.peek();
                            this.getHighSpeedVideoFpsRangesFor = autoCloseable;
                            this.Camera2StreamConfigurationMap = byteWriteChannel2;
                            this.getOutputMinFrameDuration = byteWriteChannel;
                            this.getHighSpeedVideoSizesFor = byteReadChannel;
                            this.getOutputFormats = null;
                            this.getInputFormats = 3;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writePacket(byteWriteChannel, peek, this) != coroutine_suspended) {
                                autoCloseable2 = autoCloseable;
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, null);
                                if (this.getHighSpeedVideoFpsRanges.isClosedForRead()) {
                                    break;
                                }
                                closedCause = this.getHighSpeedVideoFpsRanges.getClosedCause();
                                if (closedCause != null) {
                                }
                            }
                        }
                    } finally {
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(this.getHighSpeedVideoSizes, th);
                        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(this.getHighResolutionOutputSizeshNQ4ISI, th);
                        this.getHighSpeedVideoFpsRangesFor = null;
                        this.Camera2StreamConfigurationMap = null;
                        this.getOutputMinFrameDuration = null;
                        this.getHighSpeedVideoSizesFor = null;
                        this.getOutputFormats = null;
                        this.getInputFormats = 6;
                        break;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        this.getHighSpeedVideoFpsRangesFor = th;
                        this.Camera2StreamConfigurationMap = null;
                        this.getOutputMinFrameDuration = null;
                        this.getHighSpeedVideoSizesFor = null;
                        this.getOutputFormats = null;
                        this.getInputFormats = 8;
                        break;
                    }
                }
                return coroutine_suspended;
            case 2:
                source = (kotlinx.io.Source) this.getOutputFormats;
                byteReadChannel = (io.ktor.utils.io.ByteReadChannel) this.getHighSpeedVideoSizesFor;
                byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) this.getOutputMinFrameDuration;
                byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) this.Camera2StreamConfigurationMap;
                autoCloseable = (java.lang.AutoCloseable) this.getHighSpeedVideoFpsRangesFor;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th3) {
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel5 = byteWriteChannel2;
                    autoCloseable2 = autoCloseable;
                    byteReadChannel.cancel(th3);
                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel5, th3);
                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel, th3);
                    break;
                }
                peek = source.peek();
                this.getHighSpeedVideoFpsRangesFor = autoCloseable;
                this.Camera2StreamConfigurationMap = byteWriteChannel2;
                this.getOutputMinFrameDuration = byteWriteChannel;
                this.getHighSpeedVideoSizesFor = byteReadChannel;
                this.getOutputFormats = null;
                this.getInputFormats = 3;
                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writePacket(byteWriteChannel, peek, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                byteReadChannel2 = (io.ktor.utils.io.ByteReadChannel) this.getHighSpeedVideoSizesFor;
                byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) this.getOutputMinFrameDuration;
                byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) this.Camera2StreamConfigurationMap;
                autoCloseable2 = (java.lang.AutoCloseable) this.getHighSpeedVideoFpsRangesFor;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th4) {
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel6 = byteWriteChannel4;
                    io.ktor.utils.io.ByteReadChannel byteReadChannel3 = byteReadChannel2;
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel7 = byteWriteChannel3;
                    byteReadChannel3.cancel(th4);
                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel7, th4);
                    io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel6, th4);
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, null);
                if (this.getHighSpeedVideoFpsRanges.isClosedForRead()) {
                }
                closedCause = this.getHighSpeedVideoFpsRanges.getClosedCause();
                if (closedCause != null) {
                }
                break;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                this.getInputFormats = 5;
                break;
            case 5:
            case 7:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                this.getInputFormats = 7;
                break;
            case 8:
                java.lang.Throwable th5 = (java.lang.Throwable) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                th = th5;
                this.getHighSpeedVideoFpsRangesFor = th;
                this.getInputFormats = 9;
                if (this.getHighResolutionOutputSizeshNQ4ISI.flushAndClose(this) != coroutine_suspended) {
                    throw th;
                }
                return coroutine_suspended;
            case 9:
                java.lang.Throwable th6 = (java.lang.Throwable) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th6;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.util.ByteChannelsKt$copyToBoth$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.util.ByteChannelsKt$copyToBoth$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelsKt$copyToBoth$1(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel2, kotlin.coroutines.Continuation<? super io.ktor.util.ByteChannelsKt$copyToBoth$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = byteReadChannel;
        this.getHighSpeedVideoSizes = byteWriteChannel;
        this.getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel2;
    }
}
