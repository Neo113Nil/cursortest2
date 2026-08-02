package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$3$1", f = "Swipeable.kt", i = {}, l = {602}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class SwipeableKt$swipeable$3$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material.SwipeableState<T> Camera2StreamConfigurationMap;
    final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Map<java.lang.Float, T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.unit.Density getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material.ResistanceConfig getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, T, androidx.compose.material.ThresholdConfig> getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Map anchors$material = this.Camera2StreamConfigurationMap.getAnchors$material();
            this.Camera2StreamConfigurationMap.setAnchors$material(this.getHighSpeedVideoFpsRanges);
            this.Camera2StreamConfigurationMap.setResistance$material(this.getHighSpeedVideoSizes);
            androidx.compose.material.SwipeableState<T> swipeableState = this.Camera2StreamConfigurationMap;
            final java.util.Map<java.lang.Float, T> map = this.getHighSpeedVideoFpsRanges;
            final kotlin.jvm.functions.Function2<T, T, androidx.compose.material.ThresholdConfig> function2 = this.getInputSizeshNQ4ISI;
            final androidx.compose.ui.unit.Density density = this.getHighSpeedVideoFpsRangesFor;
            swipeableState.setThresholds$material(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$3$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    float highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.material.SwipeableKt$swipeable$3$3$1.getHighSpeedVideoSizes(map, function2, density, ((java.lang.Float) obj2).floatValue(), ((java.lang.Float) obj3).floatValue());
                    return java.lang.Float.valueOf(highSpeedVideoSizes);
                }
            });
            this.Camera2StreamConfigurationMap.setVelocityThreshold$material(this.getHighSpeedVideoFpsRangesFor.mo1418toPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI));
            this.getOutputFormats = 1;
            if (this.Camera2StreamConfigurationMap.processNewAnchors$material(anchors$material, this.getHighSpeedVideoFpsRanges, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoSizes(java.util.Map map, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.unit.Density density, float f, float f2) {
        return ((androidx.compose.material.ThresholdConfig) function2.invoke(kotlin.collections.MapsKt.getValue(map, java.lang.Float.valueOf(f)), kotlin.collections.MapsKt.getValue(map, java.lang.Float.valueOf(f2)))).computeThreshold(density, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.SwipeableKt$swipeable$3$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material.SwipeableKt$swipeable$3$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwipeableKt$swipeable$3$3$1(androidx.compose.material.SwipeableState<T> swipeableState, java.util.Map<java.lang.Float, ? extends T> map, androidx.compose.material.ResistanceConfig resistanceConfig, androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends androidx.compose.material.ThresholdConfig> function2, float f, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableKt$swipeable$3$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = swipeableState;
        this.getHighSpeedVideoFpsRanges = map;
        this.getHighSpeedVideoSizes = resistanceConfig;
        this.getHighSpeedVideoFpsRangesFor = density;
        this.getInputSizeshNQ4ISI = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }
}
