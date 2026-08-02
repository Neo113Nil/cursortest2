package com.paypal.oslo.feature.qrc.ui.review.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final class TipOptionsKt$TipContainer$2$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.TipOptionsKt$TipContainer$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.qrc.ui.review.components.TipOptionsKt$TipContainer$2$1.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0.this);
            }
        }, continuation, 7, null);
        return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    TipOptionsKt$TipContainer$2$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }
}
