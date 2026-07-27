package io.ktor.client.plugins.sse;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultClientSSESession.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {161, 163, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE}, m = "parseEvent", n = {"$this$parseEvent", "data", "comments", "curRetry", "lastEventId", "wasData", "wasComments", "$this$parseEvent", "data", "comments", "curRetry", "lastEventId", "wasData", "wasComments", "$this$parseEvent", "data", "comments", "eventType", "curRetry", "lastEventId", "wasData", "wasComments"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"})
/* loaded from: classes7.dex */
final class DefaultClientSSESession$parseEvent$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultClientSSESession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultClientSSESession$parseEvent$1(DefaultClientSSESession defaultClientSSESession, Continuation<? super DefaultClientSSESession$parseEvent$1> continuation) {
        super(continuation);
        this.this$0 = defaultClientSSESession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object parseEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        parseEvent = this.this$0.parseEvent(null, this);
        return parseEvent;
    }
}
