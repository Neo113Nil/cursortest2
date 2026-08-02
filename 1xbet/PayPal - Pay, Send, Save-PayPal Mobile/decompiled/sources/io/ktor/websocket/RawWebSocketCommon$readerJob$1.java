package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", f = "RawWebSocketCommon.kt", i = {2, 3}, l = {98, 102, 105, 109}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class RawWebSocketCommon$readerJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.websocket.RawWebSocketCommon getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r11 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        if (r1.send(r11, r10) == r0) goto L46;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0087 -> B:20:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.channels.Channel channel2;
        io.ktor.websocket.FrameTooBigException frameTooBigException;
        io.ktor.websocket.ProtocolViolationException protocolViolationException;
        kotlinx.coroutines.channels.Channel channel3;
        kotlinx.coroutines.channels.Channel channel4;
        kotlinx.coroutines.channels.Channel channel5;
        kotlinx.coroutines.channels.Channel channel6;
        kotlinx.coroutines.channels.Channel channel7;
        io.ktor.utils.io.ByteReadChannel byteReadChannel;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.Camera2StreamConfigurationMap;
        try {
            try {
                try {
                    try {
                        try {
                        } catch (io.ktor.websocket.ProtocolViolationException e) {
                            this.getHighSpeedVideoFpsRangesFor = e;
                            this.Camera2StreamConfigurationMap = 4;
                            if (this.getHighSpeedVideoSizes.getOutgoing().send(new io.ktor.websocket.Frame.Close(new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.PROTOCOL_ERROR, e.getMessage())), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            protocolViolationException = e;
                        }
                    } catch (io.ktor.websocket.FrameTooBigException e2) {
                        this.getHighSpeedVideoFpsRangesFor = e2;
                        this.Camera2StreamConfigurationMap = 3;
                        if (this.getHighSpeedVideoSizes.getOutgoing().send(new io.ktor.websocket.Frame.Close(new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.TOO_BIG, e2.getMessage())), this) != coroutine_suspended) {
                            frameTooBigException = e2;
                        }
                        return coroutine_suspended;
                    }
                } catch (java.lang.Throwable th) {
                    channel2 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                    channel2.close(th);
                    throw th;
                }
            } catch (java.util.concurrent.CancellationException e3) {
                channel = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                channel.cancel(e3);
            }
            if (i2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
            } else if (i2 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.websocket.Frame frame = (io.ktor.websocket.Frame) obj;
                if (!frame.getFrameType().getControlFrame()) {
                    this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI = frame.getFin() ? 0 : frame.getFrameType().getOpcode();
                }
                channel7 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                this.Camera2StreamConfigurationMap = 2;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        frameTooBigException = (io.ktor.websocket.FrameTooBigException) this.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        channel4 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                        channel4.close(frameTooBigException);
                        channel5 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    protocolViolationException = (io.ktor.websocket.ProtocolViolationException) this.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    channel6 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                    channel6.close(protocolViolationException);
                    channel5 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel5, null, 1, null);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            byteReadChannel = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            long maxFrameSize = this.getHighSpeedVideoSizes.getMaxFrameSize();
            i = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            obj = io.ktor.websocket.RawWebSocketCommonKt.readFrame(byteReadChannel, maxFrameSize, i, this);
        } catch (java.lang.Throwable th2) {
            channel3 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel3, null, 1, null);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.RawWebSocketCommon$readerJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.RawWebSocketCommon$readerJob$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawWebSocketCommon$readerJob$1(io.ktor.websocket.RawWebSocketCommon rawWebSocketCommon, kotlin.coroutines.Continuation<? super io.ktor.websocket.RawWebSocketCommon$readerJob$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = rawWebSocketCommon;
    }
}
