package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 1}, l = {50, 52, 67, 67, 67, 67}, m = "writeLoop", n = {"buffer", "buffer"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class WebSocketWriter$writeLoop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.websocket.WebSocketWriter Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketWriter$writeLoop$1(io.ktor.websocket.WebSocketWriter webSocketWriter, kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketWriter$writeLoop$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = webSocketWriter;
    }
}
