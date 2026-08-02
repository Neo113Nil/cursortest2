package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0}, l = {352}, m = "checkMaxFrameSize", n = {io.ktor.http.ContentDisposition.Parameters.Size}, s = {"I$0"})
/* loaded from: classes3.dex */
final class DefaultWebSocketSessionImpl$checkMaxFrameSize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.websocket.DefaultWebSocketSessionImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.websocket.DefaultWebSocketSessionImpl.access$checkMaxFrameSize(this.getHighResolutionOutputSizeshNQ4ISI, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketSessionImpl$checkMaxFrameSize$1(io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, kotlin.coroutines.Continuation<? super io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = defaultWebSocketSessionImpl;
    }
}
