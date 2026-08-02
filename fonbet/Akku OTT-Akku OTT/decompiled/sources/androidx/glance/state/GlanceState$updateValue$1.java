package androidx.glance.state;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.state.GlanceState", f = "GlanceStateDefinition.kt", i = {0}, l = {122, 122}, m = "updateValue", n = {"updateBlock"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class GlanceState$updateValue$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceState$updateValue$1(GlanceState glanceState, Continuation<? super GlanceState$updateValue$1> continuation) {
        super(continuation);
        this.this$0 = glanceState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateValue(null, null, null, null, this);
    }
}
