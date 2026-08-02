package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FlowKt__LimitKt$drop$2$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1) continuation;
            if ((flowKt__LimitKt$drop$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = flowKt__LimitKt$drop$2$1$emit$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LimitKt$drop$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getHighSpeedVideoFpsRanges.element < this.getHighSpeedVideoFpsRangesFor) {
                        this.getHighSpeedVideoFpsRanges.element++;
                        int i2 = this.getHighSpeedVideoFpsRanges.element;
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.Camera2StreamConfigurationMap;
                    flowKt__LimitKt$drop$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (flowCollector.emit(t, flowKt__LimitKt$drop$2$1$emit$1) == coroutine_suspended) {
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
        flowKt__LimitKt$drop$2$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
        java.lang.Object obj2 = flowKt__LimitKt$drop$2$1$emit$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LimitKt$drop$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$drop$2$1(kotlin.jvm.internal.Ref.IntRef intRef, int i, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
        this.getHighSpeedVideoFpsRanges = intRef;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = flowCollector;
    }
}
