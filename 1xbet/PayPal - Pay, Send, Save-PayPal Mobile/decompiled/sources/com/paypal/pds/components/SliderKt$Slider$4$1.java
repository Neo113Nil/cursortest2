package com.paypal.pds.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final class SliderKt$Slider$4$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.runtime.MutableFloatState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> getInputFormats;
    final /* synthetic */ int getInputSizeshNQ4ISI;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (this.getHighSpeedVideoSizes) {
            final float f = this.getHighSpeedVideoFpsRangesFor;
            final float f2 = this.getHighSpeedVideoFpsRanges;
            final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> function1 = this.getInputFormats;
            final int i = this.getInputSizeshNQ4ISI;
            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange = this.getHighSpeedVideoSizesFor;
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>> state = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.runtime.MutableFloatState mutableFloatState = this.Camera2StreamConfigurationMap;
            java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderKt$Slider$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.pds.components.SliderKt$Slider$4$1.getHighSpeedVideoFpsRangesFor(f, f2, function1, i, closedFloatingPointRange, state, mutableFloatState, (androidx.compose.ui.geometry.Offset) obj);
                }
            }, continuation, 7, null);
            return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(float f, float f2, kotlin.jvm.functions.Function1 function1, int i, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, androidx.compose.runtime.State state, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.ui.geometry.Offset offset) {
        float highSpeedVideoFpsRangesFor;
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() >> 32)), f, f2);
        highSpeedVideoFpsRangesFor = com.paypal.pds.components.SliderKt.getHighSpeedVideoFpsRangesFor(((java.lang.Number) function1.invoke(java.lang.Float.valueOf(coerceIn))).floatValue(), i, closedFloatingPointRange);
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(highSpeedVideoFpsRangesFor), (kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>) closedFloatingPointRange));
        mutableFloatState.setFloatValue(coerceIn);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$Slider$4$1(boolean z, float f, float f2, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, int i, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>> state, androidx.compose.runtime.MutableFloatState mutableFloatState) {
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoFpsRanges = f2;
        this.getInputFormats = function1;
        this.getInputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizesFor = closedFloatingPointRange;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.Camera2StreamConfigurationMap = mutableFloatState;
    }
}
