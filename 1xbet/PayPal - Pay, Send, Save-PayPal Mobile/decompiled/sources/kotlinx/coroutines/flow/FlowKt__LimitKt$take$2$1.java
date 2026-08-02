package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FlowKt__LimitKt$take$2$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r7.emit(r6, r0) != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt__LimitKt.getHighSpeedVideoSizes(r7, r6, r2, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) continuation;
            if ((flowKt__LimitKt$take$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = flowKt__LimitKt$take$2$1$emit$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LimitKt$take$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap.element++;
                if (this.Camera2StreamConfigurationMap.element < this.getHighSpeedVideoSizes) {
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.getHighSpeedVideoFpsRanges;
                    flowKt__LimitKt$take$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                } else {
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = this.getHighSpeedVideoFpsRanges;
                    java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor;
                    flowKt__LimitKt$take$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                }
                return coroutine_suspended;
            }
        }
        flowKt__LimitKt$take$2$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
        java.lang.Object obj3 = flowKt__LimitKt$take$2$1$emit$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LimitKt$take$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$take$2$1(kotlin.jvm.internal.Ref.IntRef intRef, int i, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = intRef;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = flowCollector;
        this.getHighSpeedVideoFpsRangesFor = obj;
    }
}
