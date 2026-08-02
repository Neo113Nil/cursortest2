package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", f = "PingPong.kt", i = {}, l = {77, 81}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class PingPongKt$pinger$1$rc$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r10 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r9.Camera2StreamConfigurationMap.send(new io.ktor.websocket.Frame.Ping(io.ktor.utils.io.core.StringsKt.toByteArray(r9.getHighSpeedVideoFpsRanges, kotlin.text.Charsets.ISO_8859_1)), r9) != r0) goto L12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:6:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket Pinger: sending ping frame");
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.websocket.Frame.Pong pong = (io.ktor.websocket.Frame.Pong) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.decodeToString$default(pong.getData(), 0, pong.getData().length, false, 4, null), this.getHighSpeedVideoFpsRanges)) {
                io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket Pinger: received valid pong frame ".concat(java.lang.String.valueOf(pong)));
                return kotlin.Unit.INSTANCE;
            }
            org.slf4j.Logger logger = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WebSocket Pinger: received invalid pong frame ");
            sb.append(pong);
            sb.append(", continue waiting");
            logger.trace(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        obj = this.getHighSpeedVideoSizes.receive(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.PingPongKt$pinger$1$rc$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.PingPongKt$pinger$1$rc$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PingPongKt$pinger$1$rc$1(kotlinx.coroutines.channels.SendChannel<? super io.ktor.websocket.Frame> sendChannel, java.lang.String str, kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> channel, kotlin.coroutines.Continuation<? super io.ktor.websocket.PingPongKt$pinger$1$rc$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = sendChannel;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = channel;
    }
}
