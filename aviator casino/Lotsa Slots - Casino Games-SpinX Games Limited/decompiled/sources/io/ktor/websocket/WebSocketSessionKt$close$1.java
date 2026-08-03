package io.ktor.websocket;

/* compiled from: WebSocketSession.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketSessionKt", f = "WebSocketSession.kt", i = {0}, l = {androidx.compose.material.TextFieldImplKt.AnimationDuration, 151}, m = "close", n = {"$this$close"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class WebSocketSessionKt$close$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    WebSocketSessionKt$close$1(kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketSessionKt$close$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.websocket.WebSocketSessionKt.close((io.ktor.websocket.WebSocketSession) null, (io.ktor.websocket.CloseReason) null, this);
    }
}
