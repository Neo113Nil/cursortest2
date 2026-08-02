package com.paypal.oslo.feature.directdeposit.ui.pdf;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerContent$2$1$2$2$2$1$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final androidx.compose.runtime.MutableFloatState mutableFloatState = this.getHighSpeedVideoFpsRanges;
        final androidx.compose.runtime.MutableFloatState mutableFloatState2 = this.getHighSpeedVideoSizes;
        final androidx.compose.runtime.MutableFloatState mutableFloatState3 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerContent$2$1$2$2$2$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerContent$2$1$2$2$2$1$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableFloatState.this, mutableFloatState2, mutableFloatState3);
            }
        }, null, null, null, continuation, 14, null);
        return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableFloatState mutableFloatState2, androidx.compose.runtime.MutableFloatState mutableFloatState3) {
        float floatValue;
        floatValue = mutableFloatState.getFloatValue();
        mutableFloatState.setFloatValue(floatValue <= 1.0f ? 2.0f : 1.0f);
        mutableFloatState2.setFloatValue(0.0f);
        mutableFloatState3.setFloatValue(0.0f);
        return kotlin.Unit.INSTANCE;
    }

    DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerContent$2$1$2$2$2$1$1(androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableFloatState mutableFloatState2, androidx.compose.runtime.MutableFloatState mutableFloatState3) {
        this.getHighSpeedVideoFpsRanges = mutableFloatState;
        this.getHighSpeedVideoSizes = mutableFloatState2;
        this.getHighSpeedVideoFpsRangesFor = mutableFloatState3;
    }
}
