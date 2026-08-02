package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0, 0}, l = {306}, m = "sendCloseSequence", n = {"exception", "reasonToSend"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class DefaultWebSocketSessionImpl$sendCloseSequence$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.websocket.DefaultWebSocketSessionImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketSessionImpl$sendCloseSequence$1(io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, kotlin.coroutines.Continuation<? super io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = defaultWebSocketSessionImpl;
    }
}
