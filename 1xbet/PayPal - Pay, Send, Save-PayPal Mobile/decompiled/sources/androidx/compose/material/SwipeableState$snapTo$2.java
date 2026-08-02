package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SwipeableState$snapTo$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ androidx.compose.material.SwipeableState<T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ T getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material.SwipeableState$snapTo$2$emit$1 swipeableState$snapTo$2$emit$1;
        int i;
        java.lang.Float highSpeedVideoSizes;
        java.lang.Object highSpeedVideoFpsRangesFor;
        if (continuation instanceof androidx.compose.material.SwipeableState$snapTo$2$emit$1) {
            swipeableState$snapTo$2$emit$1 = (androidx.compose.material.SwipeableState$snapTo$2$emit$1) continuation;
            if ((swipeableState$snapTo$2$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                swipeableState$snapTo$2$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = swipeableState$snapTo$2$emit$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = swipeableState$snapTo$2$emit$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    highSpeedVideoSizes = androidx.compose.material.SwipeableKt.getHighSpeedVideoSizes(map, this.getHighSpeedVideoSizes);
                    if (highSpeedVideoSizes == null) {
                        throw new java.lang.IllegalArgumentException("The target value must have an associated anchor.".toString());
                    }
                    androidx.compose.material.SwipeableState<T> swipeableState = this.getHighResolutionOutputSizeshNQ4ISI;
                    float floatValue = highSpeedVideoSizes.floatValue();
                    swipeableState$snapTo$2$emit$1.getHighSpeedVideoFpsRanges = 1;
                    highSpeedVideoFpsRangesFor = swipeableState.getHighSpeedVideoFpsRangesFor(floatValue, swipeableState$snapTo$2$emit$1);
                    if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighResolutionOutputSizeshNQ4ISI.setCurrentValue(this.getHighSpeedVideoSizes);
                return kotlin.Unit.INSTANCE;
            }
        }
        swipeableState$snapTo$2$emit$1 = new androidx.compose.material.SwipeableState$snapTo$2$emit$1(this, continuation);
        java.lang.Object obj2 = swipeableState$snapTo$2$emit$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableState$snapTo$2$emit$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setCurrentValue(this.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    SwipeableState$snapTo$2(T t, androidx.compose.material.SwipeableState<T> swipeableState) {
        this.getHighSpeedVideoSizes = t;
        this.getHighResolutionOutputSizeshNQ4ISI = swipeableState;
    }
}
