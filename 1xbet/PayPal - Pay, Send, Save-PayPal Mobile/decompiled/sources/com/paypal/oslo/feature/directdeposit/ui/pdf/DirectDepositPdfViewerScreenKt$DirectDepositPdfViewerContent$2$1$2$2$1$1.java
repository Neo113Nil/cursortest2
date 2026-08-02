package com.paypal.oslo.feature.directdeposit.ui.pdf;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerContent$2$1$2$2$1$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.runtime.MutableFloatState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final androidx.compose.runtime.MutableFloatState mutableFloatState = this.Camera2StreamConfigurationMap;
        final androidx.compose.runtime.MutableFloatState mutableFloatState2 = this.getHighSpeedVideoSizes;
        final androidx.compose.runtime.MutableFloatState mutableFloatState3 = this.getHighSpeedVideoFpsRanges;
        java.lang.Object detectTransformGestures$default = androidx.compose.foundation.gestures.TransformGestureDetectorKt.detectTransformGestures$default(pointerInputScope, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerContent$2$1$2$2$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerContent$2$1$2$2$1$1.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableFloatState.this, mutableFloatState2, mutableFloatState3, (androidx.compose.ui.geometry.Offset) obj2, ((java.lang.Float) obj3).floatValue());
            }
        }, continuation, 1, null);
        return detectTransformGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTransformGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableFloatState mutableFloatState2, androidx.compose.runtime.MutableFloatState mutableFloatState3, androidx.compose.ui.geometry.Offset offset, float f) {
        float floatValue;
        float floatValue2;
        float floatValue3;
        float floatValue4;
        floatValue = mutableFloatState.getFloatValue();
        floatValue2 = mutableFloatState.getFloatValue();
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(floatValue2 * f, 1.0f, 4.0f);
        mutableFloatState.setFloatValue(coerceIn);
        if (coerceIn > 1.0f) {
            floatValue3 = mutableFloatState2.getFloatValue();
            mutableFloatState2.setFloatValue(floatValue3 + java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() >> 32)));
            floatValue4 = mutableFloatState3.getFloatValue();
            mutableFloatState3.setFloatValue(floatValue4 + java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() & 4294967295L)));
        } else if (floatValue > 1.0f && coerceIn == 1.0f) {
            mutableFloatState2.setFloatValue(0.0f);
            mutableFloatState3.setFloatValue(0.0f);
        }
        return kotlin.Unit.INSTANCE;
    }

    DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerContent$2$1$2$2$1$1(androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableFloatState mutableFloatState2, androidx.compose.runtime.MutableFloatState mutableFloatState3) {
        this.Camera2StreamConfigurationMap = mutableFloatState;
        this.getHighSpeedVideoSizes = mutableFloatState2;
        this.getHighSpeedVideoFpsRanges = mutableFloatState3;
    }
}
