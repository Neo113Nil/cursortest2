package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {}, l = {120}, m = "handleFrameIfProduced", n = {}, s = {})
/* loaded from: classes3.dex */
final class WebSocketReader$handleFrameIfProduced$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.websocket.WebSocketReader Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketReader$handleFrameIfProduced$1(io.ktor.websocket.WebSocketReader webSocketReader, kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = webSocketReader;
    }
}
