package com.paypal.oslo.feature.taptopay.ui.paymode.cardselection;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class PayModeStackViewKt$PayModeStackView$2$1$1$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.unit.Density getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.ranges.ClosedRange<androidx.compose.ui.unit.Dp> getHighSpeedVideoSizesFor;
    final /* synthetic */ boolean getInputFormats;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputFormats;
    final /* synthetic */ float getOutputMinFrameDuration;
    final /* synthetic */ float getOutputSizes;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> getOutputSizeshNQ4ISI;
    final /* synthetic */ float getOutputStallDuration;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final boolean z = this.getInputFormats;
        if (!z) {
            return kotlin.Unit.INSTANCE;
        }
        final kotlinx.coroutines.CoroutineScope coroutineScope = this.getInputSizeshNQ4ISI;
        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getOutputFormats;
        final float f = this.Camera2StreamConfigurationMap;
        final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> list = this.getHighSpeedVideoFpsRanges;
        final float f2 = this.getOutputMinFrameDuration;
        final float f3 = this.getHighSpeedVideoFpsRangesFor;
        final float f4 = this.getOutputStallDuration;
        final float f5 = this.getOutputSizes;
        final kotlin.ranges.ClosedRange<androidx.compose.ui.unit.Dp> closedRange = this.getHighSpeedVideoSizesFor;
        final androidx.compose.ui.unit.Density density = this.getHighResolutionOutputSizeshNQ4ISI;
        final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState2 = this.getOutputSizeshNQ4ISI;
        final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState3 = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$1$1.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CoroutineScope.this, mutableState, z, f, list, f2, f3, f4, f5, closedRange, density, mutableState2, mutableState3);
            }
        };
        final androidx.compose.ui.unit.Density density2 = this.getHighResolutionOutputSizeshNQ4ISI;
        final kotlin.ranges.ClosedRange<androidx.compose.ui.unit.Dp> closedRange2 = this.getHighSpeedVideoSizesFor;
        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState4 = this.getOutputFormats;
        final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState5 = this.getOutputSizeshNQ4ISI;
        java.lang.Object detectVerticalDragGestures$default = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectVerticalDragGestures$default(pointerInputScope, null, function0, null, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$1$1.getHighSpeedVideoFpsRanges(androidx.compose.ui.unit.Density.this, closedRange2, mutableState4, mutableState5, (androidx.compose.ui.input.pointer.PointerInputChange) obj, ((java.lang.Float) obj2).floatValue());
            }
        }, continuation, 5, null);
        return detectVerticalDragGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectVerticalDragGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.unit.Density density, kotlin.ranges.ClosedRange closedRange, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, float f) {
        float m8615unboximpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerInputChange, "");
        mutableState.setValue(java.lang.Boolean.valueOf(true));
        float mo1414toDpu2uoSUM = density.mo1414toDpu2uoSUM(f);
        m8615unboximpl = ((androidx.compose.ui.unit.Dp) mutableState2.getValue()).m8615unboximpl();
        mutableState2.setValue(androidx.compose.ui.unit.Dp.m8599boximpl(((androidx.compose.ui.unit.Dp) kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(m8615unboximpl - androidx.compose.ui.unit.Dp.m8601constructorimpl(mo1414toDpu2uoSUM * 0.3f))), closedRange.getStart(), closedRange.getEndInclusive())).m8615unboximpl()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState mutableState, boolean z, float f, java.util.List list, float f2, float f3, float f4, float f5, kotlin.ranges.ClosedRange closedRange, androidx.compose.ui.unit.Density density, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3) {
        mutableState.setValue(java.lang.Boolean.valueOf(false));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$1$1$1$1(z, f, list, f2, f3, f4, f5, closedRange, density, mutableState2, mutableState3, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    PayModeStackViewKt$PayModeStackView$2$1$1$1(boolean z, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, float f, java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> list, float f2, float f3, float f4, float f5, kotlin.ranges.ClosedRange<androidx.compose.ui.unit.Dp> closedRange, androidx.compose.ui.unit.Density density, androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState2, androidx.compose.runtime.MutableState<androidx.compose.ui.unit.Dp> mutableState3) {
        this.getInputFormats = z;
        this.getInputSizeshNQ4ISI = coroutineScope;
        this.getOutputFormats = mutableState;
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoFpsRanges = list;
        this.getOutputMinFrameDuration = f2;
        this.getHighSpeedVideoFpsRangesFor = f3;
        this.getOutputStallDuration = f4;
        this.getOutputSizes = f5;
        this.getHighSpeedVideoSizesFor = closedRange;
        this.getHighResolutionOutputSizeshNQ4ISI = density;
        this.getOutputSizeshNQ4ISI = mutableState2;
        this.getHighSpeedVideoSizes = mutableState3;
    }
}
