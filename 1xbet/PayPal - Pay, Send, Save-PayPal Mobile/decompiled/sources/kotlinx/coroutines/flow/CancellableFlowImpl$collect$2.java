package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class CancellableFlowImpl$collect$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1) {
            cancellableFlowImpl$collect$2$emit$1 = (kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1) continuation;
            if ((cancellableFlowImpl$collect$2$emit$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cancellableFlowImpl$collect$2$emit$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = cancellableFlowImpl$collect$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cancellableFlowImpl$collect$2$emit$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.JobKt.ensureActive(cancellableFlowImpl$collect$2$emit$1.getContext());
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                    cancellableFlowImpl$collect$2$emit$1.getHighSpeedVideoSizes = 1;
                    if (flowCollector.emit(t, cancellableFlowImpl$collect$2$emit$1) == coroutine_suspended) {
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
        cancellableFlowImpl$collect$2$emit$1 = new kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1(this, continuation);
        java.lang.Object obj2 = cancellableFlowImpl$collect$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cancellableFlowImpl$collect$2$emit$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    CancellableFlowImpl$collect$2(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
        this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
    }
}
