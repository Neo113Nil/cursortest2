package io.ktor.websocket;

/* compiled from: DefaultWebSocketSession.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0}, l = {361}, m = "checkMaxFrameSize", n = {"size"}, s = {"I$0"})
/* loaded from: classes6.dex */
final class DefaultWebSocketSessionImpl$checkMaxFrameSize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.websocket.DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketSessionImpl$checkMaxFrameSize$1(io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, kotlin.coroutines.Continuation<? super io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1> continuation) {
        super(continuation);
        this.this$0 = defaultWebSocketSessionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object checkMaxFrameSize;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        checkMaxFrameSize = this.this$0.checkMaxFrameSize(null, null, this);
        return checkMaxFrameSize;
    }
}
