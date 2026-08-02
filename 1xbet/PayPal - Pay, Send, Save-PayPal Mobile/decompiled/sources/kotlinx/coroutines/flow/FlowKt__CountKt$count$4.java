package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FlowKt__CountKt$count$4<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.flow.FlowKt__CountKt$count$4<T> flowKt__CountKt$count$4;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1) {
            flowKt__CountKt$count$4$emit$1 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1) continuation;
            if ((flowKt__CountKt$count$4$emit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$4$emit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                obj = flowKt__CountKt$count$4$emit$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__CountKt$count$4$emit$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.Camera2StreamConfigurationMap;
                    flowKt__CountKt$count$4$emit$1.getHighSpeedVideoSizes = this;
                    flowKt__CountKt$count$4$emit$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = function2.invoke(t, flowKt__CountKt$count$4$emit$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__CountKt$count$4 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__CountKt$count$4 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$4) flowKt__CountKt$count$4$emit$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    flowKt__CountKt$count$4.getHighSpeedVideoSizes.element++;
                    int i2 = flowKt__CountKt$count$4.getHighSpeedVideoSizes.element;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        flowKt__CountKt$count$4$emit$1 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1(this, continuation);
        obj = flowKt__CountKt$count$4$emit$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__CountKt$count$4$emit$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__CountKt$count$4(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.jvm.internal.Ref.IntRef intRef) {
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoSizes = intRef;
    }
}
