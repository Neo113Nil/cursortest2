package io.ktor.websocket;

/* compiled from: WebSocketReader.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {}, l = {120}, m = "handleFrameIfProduced", n = {}, s = {})
/* loaded from: classes6.dex */
final class WebSocketReader$handleFrameIfProduced$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.websocket.WebSocketReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketReader$handleFrameIfProduced$1(io.ktor.websocket.WebSocketReader webSocketReader, kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1> continuation) {
        super(continuation);
        this.this$0 = webSocketReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object handleFrameIfProduced;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleFrameIfProduced = this.this$0.handleFrameIfProduced(this);
        return handleFrameIfProduced;
    }
}
