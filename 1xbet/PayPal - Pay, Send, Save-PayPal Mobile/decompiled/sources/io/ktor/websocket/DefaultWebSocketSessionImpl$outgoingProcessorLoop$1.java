package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 282, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "outgoingProcessorLoop", n = {}, s = {})
/* loaded from: classes3.dex */
final class DefaultWebSocketSessionImpl$outgoingProcessorLoop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.websocket.DefaultWebSocketSessionImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return io.ktor.websocket.DefaultWebSocketSessionImpl.access$outgoingProcessorLoop(this.getHighSpeedVideoFpsRanges, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketSessionImpl$outgoingProcessorLoop$1(io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, kotlin.coroutines.Continuation<? super io.ktor.websocket.DefaultWebSocketSessionImpl$outgoingProcessorLoop$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = defaultWebSocketSessionImpl;
    }
}
