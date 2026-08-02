package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketSessionKt", f = "WebSocketSession.kt", i = {0}, l = {150, 151}, m = "close", n = {"$this$close"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class WebSocketSessionKt$close$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return io.ktor.websocket.WebSocketSessionKt.close((io.ktor.websocket.WebSocketSession) null, (io.ktor.websocket.CloseReason) null, this);
    }

    WebSocketSessionKt$close$1(kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketSessionKt$close$1> continuation) {
        super(continuation);
    }
}
