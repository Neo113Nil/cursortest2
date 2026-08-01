package io.ktor.websocket;

import androidx.compose.material.MenuKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebSocketReader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {}, l = {MenuKt.InTransitionDuration}, m = "handleFrameIfProduced", n = {}, s = {})
/* loaded from: classes7.dex */
final class WebSocketReader$handleFrameIfProduced$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebSocketReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketReader$handleFrameIfProduced$1(WebSocketReader webSocketReader, Continuation<? super WebSocketReader$handleFrameIfProduced$1> continuation) {
        super(continuation);
        this.this$0 = webSocketReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleFrameIfProduced;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleFrameIfProduced = this.this$0.handleFrameIfProduced(this);
        return handleFrameIfProduced;
    }
}
