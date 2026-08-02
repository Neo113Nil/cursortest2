package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FlowKt__EmittersKt$onEmpty$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1$emit$1 flowKt__EmittersKt$onEmpty$1$1$emit$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1$emit$1) {
            flowKt__EmittersKt$onEmpty$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1$emit$1) continuation;
            if ((flowKt__EmittersKt$onEmpty$1$1$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$onEmpty$1$1$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = flowKt__EmittersKt$onEmpty$1$1$emit$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__EmittersKt$onEmpty$1$1$emit$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRanges.element = false;
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.getHighSpeedVideoFpsRangesFor;
                    flowKt__EmittersKt$onEmpty$1$1$emit$1.getHighSpeedVideoFpsRanges = 1;
                    if (flowCollector.emit(t, flowKt__EmittersKt$onEmpty$1$1$emit$1) == coroutine_suspended) {
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
        flowKt__EmittersKt$onEmpty$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1$emit$1(this, continuation);
        java.lang.Object obj2 = flowKt__EmittersKt$onEmpty$1$1$emit$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__EmittersKt$onEmpty$1$1$emit$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__EmittersKt$onEmpty$1$1(kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
        this.getHighSpeedVideoFpsRanges = booleanRef;
        this.getHighSpeedVideoFpsRangesFor = flowCollector;
    }
}
