package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FlowKt__TransformKt$withIndex$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<kotlin.collections.IndexedValue<? extends T>> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef getHighSpeedVideoFpsRanges;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1) {
            flowKt__TransformKt$withIndex$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1) continuation;
            if ((flowKt__TransformKt$withIndex$1$1$emit$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$withIndex$1$1$emit$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = flowKt__TransformKt$withIndex$1$1$emit$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__TransformKt$withIndex$1$1$emit$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.FlowCollector<kotlin.collections.IndexedValue<? extends T>> flowCollector = this.Camera2StreamConfigurationMap;
                    int i2 = this.getHighSpeedVideoFpsRanges.element;
                    this.getHighSpeedVideoFpsRanges.element = i2 + 1;
                    if (i2 < 0) {
                        throw new java.lang.ArithmeticException("Index overflow has happened");
                    }
                    kotlin.collections.IndexedValue<? extends T> indexedValue = new kotlin.collections.IndexedValue<>(i2, t);
                    flowKt__TransformKt$withIndex$1$1$emit$1.getHighSpeedVideoSizes = 1;
                    if (flowCollector.emit(indexedValue, flowKt__TransformKt$withIndex$1$1$emit$1) == coroutine_suspended) {
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
        flowKt__TransformKt$withIndex$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1(this, continuation);
        java.lang.Object obj2 = flowKt__TransformKt$withIndex$1$1$emit$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__TransformKt$withIndex$1$1$emit$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$withIndex$1$1(kotlinx.coroutines.flow.FlowCollector<? super kotlin.collections.IndexedValue<? extends T>> flowCollector, kotlin.jvm.internal.Ref.IntRef intRef) {
        this.Camera2StreamConfigurationMap = flowCollector;
        this.getHighSpeedVideoFpsRanges = intRef;
    }
}
