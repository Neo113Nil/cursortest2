package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", i = {1, 2}, l = {62, 64, 65, 84, 84, 84, 84}, m = "invokeSuspend", n = {"message", "message"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class RawWebSocketCommon$writerJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.websocket.RawWebSocketCommon getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r10 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r10.flush(r9) != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        if (r10.flushAndClose(r9) == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0148, code lost:
    
        if (r10.flushAndClose(r9) == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0110, code lost:
    
        if (r10.flushAndClose(r9) != r0) goto L69;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0085 -> B:20:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c1 -> B:22:0x003c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.channels.Channel channel2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
        kotlinx.coroutines.channels.Channel channel3;
        kotlinx.coroutines.channels.Channel channel4;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        kotlinx.coroutines.channels.Channel channel5;
        java.lang.Object obj2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4;
        kotlinx.coroutines.channels.Channel channel6;
        kotlinx.coroutines.channels.Channel channel7;
        kotlinx.coroutines.channels.Channel channel8;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel5;
        kotlinx.coroutines.channels.Channel channel9;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (io.ktor.util.cio.ChannelWriteException e) {
            channel3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            channel3.close(kotlinx.coroutines.ExceptionsKt.CancellationException("Failed to write to WebSocket.", e));
            channel4 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            channel4.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
            byteWriteChannel2 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoFpsRangesFor = 5;
        } catch (java.lang.Throwable th) {
            channel = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            channel.close(th);
            channel2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            channel2.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
            byteWriteChannel = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoFpsRangesFor = 6;
        }
        switch (this.getHighSpeedVideoFpsRangesFor) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                channel6 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = channel6.receive(this);
                break;
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                if (obj instanceof io.ktor.websocket.Frame) {
                    byteWriteChannel4 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                    this.getHighSpeedVideoFpsRanges = obj;
                    this.getHighSpeedVideoFpsRangesFor = 2;
                    if (io.ktor.websocket.RawWebSocketCommonKt.writeFrame(byteWriteChannel4, (io.ktor.websocket.Frame) obj, this.getHighResolutionOutputSizeshNQ4ISI.getMasking(), this) != coroutine_suspended) {
                        obj2 = obj;
                        byteWriteChannel3 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                        this.getHighSpeedVideoFpsRanges = obj2;
                        this.getHighSpeedVideoFpsRangesFor = 3;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                } else {
                    if (!(obj instanceof io.ktor.websocket.RawWebSocketCommon.FlushRequest)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("unknown message ");
                        sb.append(obj);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((io.ktor.websocket.RawWebSocketCommon.FlushRequest) obj).getHighResolutionOutputSizeshNQ4ISI.complete());
                    channel6 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    obj = channel6.receive(this);
                    break;
                }
            case 2:
                obj2 = this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                byteWriteChannel3 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = obj2;
                this.getHighSpeedVideoFpsRangesFor = 3;
                break;
            case 3:
                obj2 = this.getHighSpeedVideoFpsRanges;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (obj2 instanceof io.ktor.websocket.Frame.Close) {
                        channel7 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel7, null, 1, null);
                        channel8 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                        channel8.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
                        byteWriteChannel5 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                        this.getHighSpeedVideoFpsRanges = null;
                        this.getHighSpeedVideoFpsRangesFor = 4;
                        break;
                    }
                    channel6 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    obj = channel6.receive(this);
                    break;
                } catch (java.lang.Throwable th2) {
                    channel9 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                    channel9.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
                    byteWriteChannel6 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                    this.getHighSpeedVideoFpsRanges = th2;
                    this.getHighSpeedVideoFpsRangesFor = 7;
                    if (byteWriteChannel6.flushAndClose(this) != coroutine_suspended) {
                        throw th2;
                    }
                }
                break;
            case 4:
            case 5:
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                while (true) {
                    channel5 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object m24084getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(channel5.mo24073tryReceivePtdJZtk());
                    if (m24084getOrNullimpl == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    if (m24084getOrNullimpl instanceof io.ktor.websocket.RawWebSocketCommon.FlushRequest) {
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((io.ktor.websocket.RawWebSocketCommon.FlushRequest) m24084getOrNullimpl).getHighResolutionOutputSizeshNQ4ISI.complete());
                    }
                }
            case 7:
                java.lang.Throwable th3 = (java.lang.Throwable) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th3;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.RawWebSocketCommon$writerJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.RawWebSocketCommon$writerJob$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawWebSocketCommon$writerJob$1(io.ktor.websocket.RawWebSocketCommon rawWebSocketCommon, kotlin.coroutines.Continuation<? super io.ktor.websocket.RawWebSocketCommon$writerJob$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = rawWebSocketCommon;
    }
}
