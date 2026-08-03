package kotlinx.coroutines.flow;

/* compiled from: Reduce.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class FlowKt__ReduceKt$fold$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<R> $accumulator;
    final /* synthetic */ kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $operation;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$fold$2(kotlin.jvm.internal.Ref.ObjectRef<R> objectRef, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        this.$accumulator = objectRef;
        this.$operation = function3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 flowKt__ReduceKt$fold$2$emit$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) {
            flowKt__ReduceKt$fold$2$emit$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) continuation;
            if ((flowKt__ReduceKt$fold$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$fold$2$emit$1.label -= Integer.MIN_VALUE;
                T t2 = (T) flowKt__ReduceKt$fold$2$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$fold$2$emit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(t2);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.$accumulator;
                    kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.$operation;
                    T t3 = objectRef2.element;
                    flowKt__ReduceKt$fold$2$emit$1.L$0 = objectRef2;
                    flowKt__ReduceKt$fold$2$emit$1.label = 1;
                    java.lang.Object invoke = function3.invoke(t3, t, flowKt__ReduceKt$fold$2$emit$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    t2 = (T) invoke;
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$fold$2$emit$1.L$0;
                    kotlin.ResultKt.throwOnFailure(t2);
                }
                objectRef.element = t2;
                return kotlin.Unit.INSTANCE;
            }
        }
        flowKt__ReduceKt$fold$2$emit$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
        T t22 = (T) flowKt__ReduceKt$fold$2$emit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$fold$2$emit$1.label;
        if (i != 0) {
        }
        objectRef.element = t22;
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object emit$$forInline(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.InlineMarker.mark(4);
        new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
        kotlin.jvm.internal.InlineMarker.mark(5);
        kotlin.jvm.internal.Ref.ObjectRef<R> objectRef = this.$accumulator;
        objectRef.element = (T) this.$operation.invoke(objectRef.element, t, continuation);
        return kotlin.Unit.INSTANCE;
    }
}
