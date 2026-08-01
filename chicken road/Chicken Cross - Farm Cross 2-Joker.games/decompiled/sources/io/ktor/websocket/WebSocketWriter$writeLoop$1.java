package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebSocketWriter.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 1}, l = {50, 52, 67, 67, 67, 67}, m = "writeLoop", n = {"buffer", "buffer"}, s = {"L$0", "L$0"})
/* loaded from: classes7.dex */
final class WebSocketWriter$writeLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebSocketWriter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketWriter$writeLoop$1(WebSocketWriter webSocketWriter, Continuation<? super WebSocketWriter$writeLoop$1> continuation) {
        super(continuation);
        this.this$0 = webSocketWriter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object writeLoop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        writeLoop = this.this$0.writeLoop(null, this);
        return writeLoop;
    }
}
