package androidx.glance.session;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.session.Session", f = "Session.kt", i = {0, 0, 0, 1, 1, 1}, l = {80, 82}, m = "receiveEvents", n = {"this", "context", "block", "this", "context", "block"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class Session$receiveEvents$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Session this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Session$receiveEvents$1(Session session, Continuation<? super Session$receiveEvents$1> continuation) {
        super(continuation);
        this.this$0 = session;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.receiveEvents(null, null, this);
    }
}
