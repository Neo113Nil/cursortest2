package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FlowKt__TransformKt$chunked$2$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<java.util.List<? extends T>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.ArrayList<T>> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1 flowKt__TransformKt$chunked$2$1$emit$1;
        int i;
        kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1<T> flowKt__TransformKt$chunked$2$1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1) {
            flowKt__TransformKt$chunked$2$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1) continuation;
            if ((flowKt__TransformKt$chunked$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$chunked$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = flowKt__TransformKt$chunked$2$1$emit$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__TransformKt$chunked$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.AbstractCollection abstractCollection = (T) ((java.util.ArrayList) ((java.util.ArrayList<T>) this.getHighSpeedVideoFpsRangesFor.element));
                    java.util.AbstractCollection abstractCollection2 = abstractCollection;
                    if (abstractCollection == null) {
                        T t2 = (T) new java.util.ArrayList(this.getHighSpeedVideoSizes);
                        this.getHighSpeedVideoFpsRangesFor.element = t2;
                        abstractCollection2 = t2;
                    }
                    abstractCollection2.add(t);
                    if (abstractCollection2.size() == this.getHighSpeedVideoSizes) {
                        kotlinx.coroutines.flow.FlowCollector<java.util.List<? extends T>> flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                        flowKt__TransformKt$chunked$2$1$emit$1.getHighSpeedVideoFpsRangesFor = this;
                        flowKt__TransformKt$chunked$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (flowCollector.emit(abstractCollection2, flowKt__TransformKt$chunked$2$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        flowKt__TransformKt$chunked$2$1 = this;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowKt__TransformKt$chunked$2$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1) flowKt__TransformKt$chunked$2$1$emit$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                flowKt__TransformKt$chunked$2$1.getHighSpeedVideoFpsRangesFor.element = null;
                return kotlin.Unit.INSTANCE;
            }
        }
        flowKt__TransformKt$chunked$2$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1(this, continuation);
        java.lang.Object obj2 = flowKt__TransformKt$chunked$2$1$emit$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__TransformKt$chunked$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        flowKt__TransformKt$chunked$2$1.getHighSpeedVideoFpsRangesFor.element = null;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$chunked$2$1(kotlin.jvm.internal.Ref.ObjectRef<java.util.ArrayList<T>> objectRef, int i, kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends T>> flowCollector) {
        this.getHighSpeedVideoFpsRangesFor = objectRef;
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
    }
}
