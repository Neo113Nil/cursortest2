package com.paypal.oslo.core.commonui.components.containers;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final class DeckKt$dragGesture$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.Camera2StreamConfigurationMap;
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.containers.DeckKt$dragGesture$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.commonui.components.containers.DeckKt$dragGesture$1.getHighSpeedVideoSizes(kotlin.jvm.functions.Function0.this);
            }
        };
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.commonui.components.containers.DeckKt$dragGesture$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.commonui.components.containers.DeckKt$dragGesture$1.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function0.this);
            }
        };
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04 = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.functions.Function0 function05 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.commonui.components.containers.DeckKt$dragGesture$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.commonui.components.containers.DeckKt$dragGesture$1.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0.this);
            }
        };
        final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> function12 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object detectHorizontalDragGestures = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures(pointerInputScope, function1, function03, function05, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.commonui.components.containers.DeckKt$dragGesture$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.core.commonui.components.containers.DeckKt$dragGesture$1.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj, ((java.lang.Float) obj2).floatValue());
            }
        }, continuation);
        return detectHorizontalDragGestures == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectHorizontalDragGestures : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerInputChange, "");
        pointerInputChange.consume();
        function1.invoke(java.lang.Float.valueOf(f));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    DeckKt$dragGesture$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1) {
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoSizes = function02;
        this.getHighSpeedVideoFpsRangesFor = function03;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
