package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final class ChatContentKt$ChatContent$7$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.ui.focus.FocusManager getHighSpeedVideoFpsRangesFor;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final androidx.compose.ui.focus.FocusManager focusManager = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ChatContent$7$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ChatContent$7$1.getHighSpeedVideoFpsRanges(androidx.compose.ui.focus.FocusManager.this);
            }
        }, continuation, 7, null);
        return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.focus.FocusManager focusManager) {
        androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    ChatContentKt$ChatContent$7$1(androidx.compose.ui.focus.FocusManager focusManager) {
        this.getHighSpeedVideoFpsRangesFor = focusManager;
    }
}
