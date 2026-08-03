package io.ktor.websocket;

/* compiled from: WebSocketWriter.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {125, 129, 143}, m = "drainQueueAndSerialize", n = {"buffer", "flush", "closeSent", "buffer", "flush", "it", "closeSent", "flush", "closeSent"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "I$0"})
/* loaded from: classes6.dex */
final class WebSocketWriter$drainQueueAndSerialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.websocket.WebSocketWriter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketWriter$drainQueueAndSerialize$1(io.ktor.websocket.WebSocketWriter webSocketWriter, kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1> continuation) {
        super(continuation);
        this.this$0 = webSocketWriter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object drainQueueAndSerialize;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        drainQueueAndSerialize = this.this$0.drainQueueAndSerialize(null, null, this);
        return drainQueueAndSerialize;
    }
}
