package io.ktor.websocket;

/* compiled from: DefaultWebSocketSession.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0, 0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE}, m = "sendCloseSequence", n = {"exception", "reasonToSend"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class DefaultWebSocketSessionImpl$sendCloseSequence$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.websocket.DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketSessionImpl$sendCloseSequence$1(io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, kotlin.coroutines.Continuation<? super io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1> continuation) {
        super(continuation);
        this.this$0 = defaultWebSocketSessionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object sendCloseSequence;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendCloseSequence = this.this$0.sendCloseSequence(null, null, this);
        return sendCloseSequence;
    }
}
