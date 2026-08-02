package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SwipeableState$animateTo$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ T getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material.SwipeableState<T> getHighSpeedVideoSizes;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material.SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        int i;
        androidx.compose.runtime.MutableFloatState mutableFloatState;
        java.lang.Float highSpeedVideoSizes;
        java.lang.Object highSpeedVideoFpsRanges;
        androidx.compose.runtime.MutableFloatState mutableFloatState2;
        java.lang.Object firstOrNull;
        try {
            if (continuation instanceof androidx.compose.material.SwipeableState$animateTo$2$emit$1) {
                swipeableState$animateTo$2$emit$1 = (androidx.compose.material.SwipeableState$animateTo$2$emit$1) continuation;
                if ((swipeableState$animateTo$2$emit$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    swipeableState$animateTo$2$emit$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = swipeableState$animateTo$2$emit$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = swipeableState$animateTo$2$emit$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        highSpeedVideoSizes = androidx.compose.material.SwipeableKt.getHighSpeedVideoSizes(map, this.getHighSpeedVideoFpsRanges);
                        if (highSpeedVideoSizes == null) {
                            throw new java.lang.IllegalArgumentException("The target value must have an associated anchor.".toString());
                        }
                        androidx.compose.material.SwipeableState<T> swipeableState = this.getHighSpeedVideoSizes;
                        float floatValue = highSpeedVideoSizes.floatValue();
                        androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec = this.getHighResolutionOutputSizeshNQ4ISI;
                        swipeableState$animateTo$2$emit$1.getHighSpeedVideoFpsRangesFor = map;
                        swipeableState$animateTo$2$emit$1.Camera2StreamConfigurationMap = 1;
                        highSpeedVideoFpsRanges = swipeableState.getHighSpeedVideoFpsRanges(floatValue, animationSpec, swipeableState$animateTo$2$emit$1);
                        if (highSpeedVideoFpsRanges == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        map = (java.util.Map) swipeableState$animateTo$2$emit$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    mutableFloatState2 = ((androidx.compose.material.SwipeableState) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRanges;
                    float floatValue2 = mutableFloatState2.getFloatValue();
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.Float, ? extends T> entry : map.entrySet()) {
                        if (java.lang.Math.abs(entry.getKey().floatValue() - floatValue2) < 0.5f) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    firstOrNull = kotlin.collections.CollectionsKt.firstOrNull(linkedHashMap.values());
                    if (firstOrNull == null) {
                        firstOrNull = this.getHighSpeedVideoSizes.getCurrentValue();
                    }
                    this.getHighSpeedVideoSizes.setCurrentValue(firstOrNull);
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            mutableFloatState2 = ((androidx.compose.material.SwipeableState) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRanges;
            float floatValue22 = mutableFloatState2.getFloatValue();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            while (r7.hasNext()) {
            }
            firstOrNull = kotlin.collections.CollectionsKt.firstOrNull(linkedHashMap2.values());
            if (firstOrNull == null) {
            }
            this.getHighSpeedVideoSizes.setCurrentValue(firstOrNull);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutableFloatState = ((androidx.compose.material.SwipeableState) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRanges;
            float floatValue3 = mutableFloatState.getFloatValue();
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.Float, ? extends T> entry2 : map.entrySet()) {
                if (java.lang.Math.abs(entry2.getKey().floatValue() - floatValue3) < 0.5f) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
            java.lang.Object firstOrNull2 = kotlin.collections.CollectionsKt.firstOrNull(linkedHashMap3.values());
            if (firstOrNull2 == null) {
                firstOrNull2 = this.getHighSpeedVideoSizes.getCurrentValue();
            }
            this.getHighSpeedVideoSizes.setCurrentValue(firstOrNull2);
            throw th;
        }
        swipeableState$animateTo$2$emit$1 = new androidx.compose.material.SwipeableState$animateTo$2$emit$1(this, continuation);
        java.lang.Object obj2 = swipeableState$animateTo$2$emit$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableState$animateTo$2$emit$1.Camera2StreamConfigurationMap;
    }

    SwipeableState$animateTo$2(T t, androidx.compose.material.SwipeableState<T> swipeableState, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
        this.getHighSpeedVideoFpsRanges = t;
        this.getHighSpeedVideoSizes = swipeableState;
        this.getHighResolutionOutputSizeshNQ4ISI = animationSpec;
    }
}
