package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.PingPongKt$ponger$1", f = "PingPong.kt", i = {0, 1}, l = {119, 33}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, s = {"L$1", "L$1"})
/* loaded from: classes3.dex */
final class PingPongKt$ponger$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Pong> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Ping> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        if (r10 != r0) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0081 -> B:8:0x0046). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel;
        kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Pong> sendChannel;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        try {
            try {
            } finally {
            }
        } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused) {
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            receiveChannel = this.getHighSpeedVideoFpsRangesFor;
            sendChannel = this.Camera2StreamConfigurationMap;
            it = receiveChannel.iterator();
        } else if (i == 1) {
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighResolutionOutputSizeshNQ4ISI;
            receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) this.getHighSpeedVideoSizes;
            sendChannel = (kotlinx.coroutines.channels.SendChannel) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            if (((java.lang.Boolean) obj).booleanValue()) {
                io.ktor.websocket.Frame.Ping ping = (io.ktor.websocket.Frame.Ping) it.next();
                io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER().trace("Received ping message, sending pong message");
                io.ktor.websocket.Frame.Pong pong = new io.ktor.websocket.Frame.Pong(ping.getData(), (kotlinx.coroutines.DisposableHandle) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                this.getHighSpeedVideoFpsRanges = sendChannel;
                this.getHighSpeedVideoSizes = receiveChannel;
                this.getHighResolutionOutputSizeshNQ4ISI = it;
                this.getInputSizeshNQ4ISI = 2;
                if (sendChannel.send(pong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighResolutionOutputSizeshNQ4ISI;
            receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) this.getHighSpeedVideoSizes;
            sendChannel = (kotlinx.coroutines.channels.SendChannel) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoFpsRanges = sendChannel;
        this.getHighSpeedVideoSizes = receiveChannel;
        this.getHighResolutionOutputSizeshNQ4ISI = it;
        this.getInputSizeshNQ4ISI = 1;
        obj = it.hasNext(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.PingPongKt$ponger$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.PingPongKt$ponger$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PingPongKt$ponger$1(kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Ping> channel, kotlinx.coroutines.channels.SendChannel<? super io.ktor.websocket.Frame.Pong> sendChannel, kotlin.coroutines.Continuation<? super io.ktor.websocket.PingPongKt$ponger$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = channel;
        this.Camera2StreamConfigurationMap = sendChannel;
    }
}
