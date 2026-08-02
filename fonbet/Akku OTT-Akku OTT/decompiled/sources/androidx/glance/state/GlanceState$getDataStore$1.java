package androidx.glance.state;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.state.GlanceState", f = "GlanceStateDefinition.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {183, 144}, m = "getDataStore", n = {"context", "definition", "fileKey", "$this$withLock_u24default$iv", "fileKey", "$this$withLock_u24default$iv", "$this$getOrPut$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class GlanceState$getDataStore$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceState$getDataStore$1(GlanceState glanceState, Continuation<? super GlanceState$getDataStore$1> continuation) {
        super(continuation);
        this.this$0 = glanceState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object dataStore;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        dataStore = this.this$0.getDataStore(null, null, null, this);
        return dataStore;
    }
}
