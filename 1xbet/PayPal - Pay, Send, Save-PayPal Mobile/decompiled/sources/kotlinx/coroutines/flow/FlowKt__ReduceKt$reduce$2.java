package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FlowKt__ReduceKt$reduce$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.functions.Function3<S, T, kotlin.coroutines.Continuation<? super S>, java.lang.Object> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef;
        T t2;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef2;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1) {
            flowKt__ReduceKt$reduce$2$emit$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1) continuation;
            if ((flowKt__ReduceKt$reduce$2$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$2$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = flowKt__ReduceKt$reduce$2$emit$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$reduce$2$emit$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef = this.getHighSpeedVideoFpsRangesFor;
                    if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        kotlin.jvm.functions.Function3<S, T, kotlin.coroutines.Continuation<? super S>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRanges;
                        java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor.element;
                        flowKt__ReduceKt$reduce$2$emit$1.getHighSpeedVideoSizes = objectRef;
                        flowKt__ReduceKt$reduce$2$emit$1.getHighSpeedVideoFpsRanges = 1;
                        java.lang.Object invoke = function3.invoke(obj2, t, flowKt__ReduceKt$reduce$2$emit$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        t2 = invoke;
                        objectRef2 = objectRef;
                    }
                    objectRef.element = t;
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$reduce$2$emit$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                t2 = obj;
                T t3 = t2;
                objectRef = objectRef2;
                t = t3;
                objectRef.element = t;
                return kotlin.Unit.INSTANCE;
            }
        }
        flowKt__ReduceKt$reduce$2$emit$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
        java.lang.Object obj3 = flowKt__ReduceKt$reduce$2$emit$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$reduce$2$emit$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        T t32 = t2;
        objectRef = objectRef2;
        t = t32;
        objectRef.element = t;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ReduceKt$reduce$2(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef, kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> function3) {
        this.getHighSpeedVideoFpsRangesFor = objectRef;
        this.getHighSpeedVideoFpsRanges = function3;
    }
}
