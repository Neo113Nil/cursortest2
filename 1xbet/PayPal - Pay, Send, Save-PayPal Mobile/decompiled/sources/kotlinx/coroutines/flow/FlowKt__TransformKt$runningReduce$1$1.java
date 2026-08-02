package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FlowKt__TransformKt$runningReduce$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r8.emit(r9, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 flowKt__TransformKt$runningReduce$1$1$emit$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef;
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1<T> flowKt__TransformKt$runningReduce$1$1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) {
            flowKt__TransformKt$runningReduce$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) continuation;
            if ((flowKt__TransformKt$runningReduce$1$1$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningReduce$1$1$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = flowKt__TransformKt$runningReduce$1$1$emit$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__TransformKt$runningReduce$1$1$emit$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef = this.getHighSpeedVideoFpsRanges;
                    if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRangesFor;
                        T t2 = this.getHighSpeedVideoFpsRanges.element;
                        flowKt__TransformKt$runningReduce$1$1$emit$1.getHighSpeedVideoFpsRangesFor = this;
                        flowKt__TransformKt$runningReduce$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = objectRef;
                        flowKt__TransformKt$runningReduce$1$1$emit$1.getHighSpeedVideoFpsRanges = 1;
                        t = (T) function3.invoke(t2, t, flowKt__TransformKt$runningReduce$1$1$emit$1);
                    }
                    flowKt__TransformKt$runningReduce$1$1 = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__TransformKt$runningReduce$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    flowKt__TransformKt$runningReduce$1$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1) flowKt__TransformKt$runningReduce$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef = objectRef2;
                    t = (T) obj;
                }
                objectRef.element = t;
                kotlinx.coroutines.flow.FlowCollector<T> flowCollector = flowKt__TransformKt$runningReduce$1$1.getHighResolutionOutputSizeshNQ4ISI;
                T t3 = flowKt__TransformKt$runningReduce$1$1.getHighSpeedVideoFpsRanges.element;
                flowKt__TransformKt$runningReduce$1$1$emit$1.getHighSpeedVideoFpsRangesFor = null;
                flowKt__TransformKt$runningReduce$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = null;
                flowKt__TransformKt$runningReduce$1$1$emit$1.getHighSpeedVideoFpsRanges = 2;
            }
        }
        flowKt__TransformKt$runningReduce$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1(this, continuation);
        java.lang.Object obj2 = flowKt__TransformKt$runningReduce$1$1$emit$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__TransformKt$runningReduce$1$1$emit$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        objectRef.element = t;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = flowKt__TransformKt$runningReduce$1$1.getHighResolutionOutputSizeshNQ4ISI;
        T t32 = flowKt__TransformKt$runningReduce$1$1.getHighSpeedVideoFpsRanges.element;
        flowKt__TransformKt$runningReduce$1$1$emit$1.getHighSpeedVideoFpsRangesFor = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.getHighSpeedVideoFpsRanges = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningReduce$1$1(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef, kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
        this.getHighSpeedVideoFpsRanges = objectRef;
        this.getHighSpeedVideoFpsRangesFor = function3;
        this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
    }
}
