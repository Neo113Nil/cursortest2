package io.ktor.client.plugins.sse;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultClientSSESession.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", i = {}, l = {145}, m = "tryParseEvent", n = {}, s = {})
/* loaded from: classes7.dex */
final class DefaultClientSSESession$tryParseEvent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultClientSSESession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultClientSSESession$tryParseEvent$1(DefaultClientSSESession defaultClientSSESession, Continuation<? super DefaultClientSSESession$tryParseEvent$1> continuation) {
        super(continuation);
        this.this$0 = defaultClientSSESession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object tryParseEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tryParseEvent = this.this$0.tryParseEvent(null, this);
        return tryParseEvent;
    }
}
