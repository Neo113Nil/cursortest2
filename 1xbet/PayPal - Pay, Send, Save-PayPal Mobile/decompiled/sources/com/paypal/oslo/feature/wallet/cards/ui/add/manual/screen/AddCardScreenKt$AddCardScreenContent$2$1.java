package com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class AddCardScreenKt$AddCardScreenContent$2$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.ui.focus.FocusManager Camera2StreamConfigurationMap;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final androidx.compose.ui.focus.FocusManager focusManager = this.Camera2StreamConfigurationMap;
        java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenKt$AddCardScreenContent$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenKt$AddCardScreenContent$2$1.Camera2StreamConfigurationMap(androidx.compose.ui.focus.FocusManager.this);
            }
        }, continuation, 7, null);
        return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.focus.FocusManager focusManager) {
        androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    AddCardScreenKt$AddCardScreenContent$2$1(androidx.compose.ui.focus.FocusManager focusManager) {
        this.Camera2StreamConfigurationMap = focusManager;
    }
}
