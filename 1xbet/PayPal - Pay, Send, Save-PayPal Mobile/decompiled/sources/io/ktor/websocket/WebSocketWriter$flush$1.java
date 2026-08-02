package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0}, l = {163, 166, 171}, m = "flush", n = {"it"}, s = {"L$1"})
/* loaded from: classes3.dex */
final class WebSocketWriter$flush$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.websocket.WebSocketWriter getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.flush(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketWriter$flush$1(io.ktor.websocket.WebSocketWriter webSocketWriter, kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketWriter$flush$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = webSocketWriter;
    }
}
