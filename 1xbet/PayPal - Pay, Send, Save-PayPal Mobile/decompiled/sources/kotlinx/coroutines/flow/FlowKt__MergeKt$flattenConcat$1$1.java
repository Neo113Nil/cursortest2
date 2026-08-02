package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FlowKt__MergeKt$flattenConcat$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1) {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1) continuation;
            if ((flowKt__MergeKt$flattenConcat$1$1$emit$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                flowKt__MergeKt$flattenConcat$1$1$emit$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = flowKt__MergeKt$flattenConcat$1$1$emit$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__MergeKt$flattenConcat$1$1$emit$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                    flowKt__MergeKt$flattenConcat$1$1$emit$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, flow, flowKt__MergeKt$flattenConcat$1$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
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
        flowKt__MergeKt$flattenConcat$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, continuation);
        java.lang.Object obj2 = flowKt__MergeKt$flattenConcat$1$1$emit$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__MergeKt$flattenConcat$1$1$emit$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__MergeKt$flattenConcat$1$1(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
        this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
    }
}
