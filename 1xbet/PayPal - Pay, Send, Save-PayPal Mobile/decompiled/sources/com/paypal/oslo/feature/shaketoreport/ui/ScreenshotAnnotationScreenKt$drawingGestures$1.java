package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final class ScreenshotAnnotationScreenKt$drawingGestures$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ com.paypal.oslo.feature.shaketoreport.ui.AnnotationState getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (this.getHighSpeedVideoFpsRanges.getSelectedTool() == com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool.PEN) {
            final com.paypal.oslo.feature.shaketoreport.ui.AnnotationState annotationState = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shaketoreport.ui.ScreenshotAnnotationScreenKt$drawingGestures$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.shaketoreport.ui.ScreenshotAnnotationScreenKt$drawingGestures$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.shaketoreport.ui.AnnotationState.this, (androidx.compose.ui.geometry.Offset) obj);
                }
            };
            final com.paypal.oslo.feature.shaketoreport.ui.AnnotationState annotationState2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.ScreenshotAnnotationScreenKt$drawingGestures$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.shaketoreport.ui.ScreenshotAnnotationScreenKt$drawingGestures$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.shaketoreport.ui.AnnotationState.this);
                }
            };
            final com.paypal.oslo.feature.shaketoreport.ui.AnnotationState annotationState3 = this.getHighSpeedVideoFpsRanges;
            java.lang.Object detectDragGestures$default = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, function1, function0, null, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.ScreenshotAnnotationScreenKt$drawingGestures$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.ScreenshotAnnotationScreenKt$drawingGestures$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.shaketoreport.ui.AnnotationState.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj);
                }
            }, continuation, 4, null);
            return detectDragGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDragGestures$default : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.shaketoreport.ui.AnnotationState annotationState, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerInputChange, "");
        annotationState.getOnAddPointToPath().invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange.getPosition()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.shaketoreport.ui.AnnotationState annotationState) {
        com.paypal.oslo.feature.shaketoreport.ui.ScreenshotAnnotationScreenKt.access$handleDragEnd(annotationState);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.shaketoreport.ui.AnnotationState annotationState, androidx.compose.ui.geometry.Offset offset) {
        annotationState.getOnClearCurrentPath().invoke();
        annotationState.getOnAddPointToPath().invoke(offset);
        return kotlin.Unit.INSTANCE;
    }

    ScreenshotAnnotationScreenKt$drawingGestures$1(com.paypal.oslo.feature.shaketoreport.ui.AnnotationState annotationState) {
        this.getHighSpeedVideoFpsRanges = annotationState;
    }
}
