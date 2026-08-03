package kotlinx.coroutines.flow;

/* compiled from: Distinct.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DistinctFlowImpl$collect$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $collector;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $previousKey;
    final /* synthetic */ kotlinx.coroutines.flow.DistinctFlowImpl<T> this$0;

    /* JADX WARN: Multi-variable type inference failed */
    DistinctFlowImpl$collect$2(kotlinx.coroutines.flow.DistinctFlowImpl<T> distinctFlowImpl, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
        this.this$0 = distinctFlowImpl;
        this.$previousKey = objectRef;
        this.$collector = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) {
            distinctFlowImpl$collect$2$emit$1 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) continuation;
            if ((distinctFlowImpl$collect$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                distinctFlowImpl$collect$2$emit$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = distinctFlowImpl$collect$2$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = distinctFlowImpl$collect$2$emit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    T t2 = (T) this.this$0.keySelector.invoke(t);
                    if (this.$previousKey.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL || !this.this$0.areEquivalent.invoke(this.$previousKey.element, t2).booleanValue()) {
                        this.$previousKey.element = t2;
                        kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.$collector;
                        distinctFlowImpl$collect$2$emit$1.label = 1;
                        if (flowCollector.emit(t, distinctFlowImpl$collect$2$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        distinctFlowImpl$collect$2$emit$1 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1(this, continuation);
        java.lang.Object obj2 = distinctFlowImpl$collect$2$emit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = distinctFlowImpl$collect$2$emit$1.label;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
