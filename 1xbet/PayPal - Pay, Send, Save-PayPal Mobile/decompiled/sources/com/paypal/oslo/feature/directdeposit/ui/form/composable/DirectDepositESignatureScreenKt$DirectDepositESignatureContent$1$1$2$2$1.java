package com.paypal.oslo.feature.directdeposit.ui.form.composable;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DirectDepositESignatureScreenKt$DirectDepositESignatureContent$1$1$2$2$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.getHighResolutionOutputSizeshNQ4ISI;
        final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function12 = this.getHighSpeedVideoFpsRanges;
        java.lang.Object detectDragGestures = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(pointerInputScope, function1, function0, function02, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureContent$1$1$2$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureContent$1$1$2$2$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj);
            }
        }, continuation);
        return detectDragGestures == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDragGestures : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerInputChange, "");
        function1.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange.getPosition()));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    DirectDepositESignatureScreenKt$DirectDepositESignatureContent$1$1$2$2$1(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function12) {
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoSizes = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = function02;
        this.getHighSpeedVideoFpsRanges = function12;
    }
}
