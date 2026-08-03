package io.ktor.websocket;

/* compiled from: WebSocketWriter.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 1}, l = {50, 52, 67, 67, 67, 67}, m = "writeLoop", n = {"buffer", "buffer"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
final class WebSocketWriter$writeLoop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.websocket.WebSocketWriter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketWriter$writeLoop$1(io.ktor.websocket.WebSocketWriter webSocketWriter, kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketWriter$writeLoop$1> continuation) {
        super(continuation);
        this.this$0 = webSocketWriter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object writeLoop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        writeLoop = this.this$0.writeLoop(null, this);
        return writeLoop;
    }
}
