package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final class ScreenshotAnnotationScreenKt$eraserGestures$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ com.paypal.oslo.feature.shaketoreport.ui.AnnotationState getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (this.getHighSpeedVideoFpsRanges.getSelectedTool() == com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool.ERASER) {
            final com.paypal.oslo.feature.shaketoreport.ui.AnnotationState annotationState = this.getHighSpeedVideoFpsRanges;
            java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shaketoreport.ui.ScreenshotAnnotationScreenKt$eraserGestures$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.shaketoreport.ui.ScreenshotAnnotationScreenKt$eraserGestures$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.shaketoreport.ui.AnnotationState.this, (androidx.compose.ui.geometry.Offset) obj);
                }
            }, continuation, 7, null);
            return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.shaketoreport.ui.AnnotationState annotationState, androidx.compose.ui.geometry.Offset offset) {
        annotationState.getOnTapToErase().invoke(offset);
        return kotlin.Unit.INSTANCE;
    }

    ScreenshotAnnotationScreenKt$eraserGestures$1(com.paypal.oslo.feature.shaketoreport.ui.AnnotationState annotationState) {
        this.getHighSpeedVideoFpsRanges = annotationState;
    }
}
