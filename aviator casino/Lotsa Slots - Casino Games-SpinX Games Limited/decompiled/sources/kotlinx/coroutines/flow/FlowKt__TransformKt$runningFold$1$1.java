package kotlinx.coroutines.flow;

/* compiled from: Transform.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FlowKt__TransformKt$runningFold$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<R> $accumulator;
    final /* synthetic */ kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $operation;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningFold$1$1(kotlin.jvm.internal.Ref.ObjectRef<R> objectRef, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector) {
        this.$accumulator = objectRef;
        this.$operation = function3;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1<T> flowKt__TransformKt$runningFold$1$1;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.FlowCollector<R> flowCollector;
        T t2;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) {
            flowKt__TransformKt$runningFold$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) continuation;
            if ((flowKt__TransformKt$runningFold$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$1$1$emit$1.label -= Integer.MIN_VALUE;
                T t3 = (T) flowKt__TransformKt$runningFold$1$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__TransformKt$runningFold$1$1$emit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(t3);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.$accumulator;
                    kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.$operation;
                    T t4 = objectRef2.element;
                    flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = this;
                    flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = objectRef2;
                    flowKt__TransformKt$runningFold$1$1$emit$1.label = 1;
                    java.lang.Object invoke = function3.invoke(t4, t, flowKt__TransformKt$runningFold$1$1$emit$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__TransformKt$runningFold$1$1 = this;
                    t3 = (T) invoke;
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(t3);
                        return kotlin.Unit.INSTANCE;
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__TransformKt$runningFold$1$1$emit$1.L$1;
                    flowKt__TransformKt$runningFold$1$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1) flowKt__TransformKt$runningFold$1$1$emit$1.L$0;
                    kotlin.ResultKt.throwOnFailure(t3);
                }
                objectRef.element = t3;
                flowCollector = flowKt__TransformKt$runningFold$1$1.$this_flow;
                t2 = flowKt__TransformKt$runningFold$1$1.$accumulator.element;
                flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
                if (flowCollector.emit(t2, flowKt__TransformKt$runningFold$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        flowKt__TransformKt$runningFold$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
        T t32 = (T) flowKt__TransformKt$runningFold$1$1$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__TransformKt$runningFold$1$1$emit$1.label;
        if (i != 0) {
        }
        objectRef.element = t32;
        flowCollector = flowKt__TransformKt$runningFold$1$1.$this_flow;
        t2 = flowKt__TransformKt$runningFold$1$1.$accumulator.element;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
        if (flowCollector.emit(t2, flowKt__TransformKt$runningFold$1$1$emit$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
