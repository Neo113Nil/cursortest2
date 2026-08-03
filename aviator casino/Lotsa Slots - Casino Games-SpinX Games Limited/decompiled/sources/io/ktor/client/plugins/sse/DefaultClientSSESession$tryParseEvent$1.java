package io.ktor.client.plugins.sse;

/* compiled from: DefaultClientSSESession.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", i = {}, l = {145}, m = "tryParseEvent", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultClientSSESession$tryParseEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.client.plugins.sse.DefaultClientSSESession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultClientSSESession$tryParseEvent$1(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1> continuation) {
        super(continuation);
        this.this$0 = defaultClientSSESession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object tryParseEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tryParseEvent = this.this$0.tryParseEvent(null, this);
        return tryParseEvent;
    }
}
