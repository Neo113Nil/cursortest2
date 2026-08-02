package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FlowKt__TransformKt$runningFold$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<R> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r8.emit(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        int i;
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1<T> flowKt__TransformKt$runningFold$1$1;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) {
            flowKt__TransformKt$runningFold$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) continuation;
            if ((flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                T t2 = (T) flowKt__TransformKt$runningFold$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(t2);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = this.Camera2StreamConfigurationMap;
                    kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRangesFor;
                    T t3 = objectRef2.element;
                    flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoFpsRanges = this;
                    flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoSizes = objectRef2;
                    flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object invoke = function3.invoke(t3, t, flowKt__TransformKt$runningFold$1$1$emit$1);
                    if (invoke != coroutine_suspended) {
                        flowKt__TransformKt$runningFold$1$1 = this;
                        t2 = (T) invoke;
                        objectRef = objectRef2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(t2);
                    return kotlin.Unit.INSTANCE;
                }
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoSizes;
                flowKt__TransformKt$runningFold$1$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1) flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(t2);
                objectRef.element = t2;
                kotlinx.coroutines.flow.FlowCollector<R> flowCollector = flowKt__TransformKt$runningFold$1$1.getHighResolutionOutputSizeshNQ4ISI;
                T t4 = flowKt__TransformKt$runningFold$1$1.Camera2StreamConfigurationMap.element;
                flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoFpsRanges = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoSizes = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        flowKt__TransformKt$runningFold$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
        T t22 = (T) flowKt__TransformKt$runningFold$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        objectRef.element = t22;
        kotlinx.coroutines.flow.FlowCollector<R> flowCollector2 = flowKt__TransformKt$runningFold$1$1.getHighResolutionOutputSizeshNQ4ISI;
        T t42 = flowKt__TransformKt$runningFold$1$1.Camera2StreamConfigurationMap.element;
        flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoFpsRanges = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoSizes = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.getHighSpeedVideoFpsRangesFor = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningFold$1$1(kotlin.jvm.internal.Ref.ObjectRef<R> objectRef, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector) {
        this.Camera2StreamConfigurationMap = objectRef;
        this.getHighSpeedVideoFpsRangesFor = function3;
        this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
    }
}
