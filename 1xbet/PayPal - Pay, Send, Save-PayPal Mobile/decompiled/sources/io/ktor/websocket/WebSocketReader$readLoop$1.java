package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0, 1}, l = {73, 79}, m = "readLoop", n = {"buffer", "buffer"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class WebSocketReader$readLoop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.websocket.WebSocketReader getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return io.ktor.websocket.WebSocketReader.access$readLoop(this.getHighSpeedVideoSizes, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketReader$readLoop$1(io.ktor.websocket.WebSocketReader webSocketReader, kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketReader$readLoop$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = webSocketReader;
    }
}
