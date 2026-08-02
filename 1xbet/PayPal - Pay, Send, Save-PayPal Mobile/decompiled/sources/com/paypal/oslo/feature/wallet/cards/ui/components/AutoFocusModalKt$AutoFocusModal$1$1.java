package com.paypal.oslo.feature.wallet.cards.ui.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt$AutoFocusModal$1$1", f = "AutoFocusModal.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, nl = {65}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AutoFocusModalKt$AutoFocusModal$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.platform.SoftwareKeyboardController getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighResolutionOutputSizeshNQ4ISI.getVisible()) {
                this.Camera2StreamConfigurationMap = 1;
                if (kotlinx.coroutines.android.HandlerDispatcherKt.awaitFrame(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = this.getHighSpeedVideoSizes;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(this.getHighSpeedVideoFpsRanges, 0, 1, null);
        androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController2 = this.getHighSpeedVideoSizes;
        if (softwareKeyboardController2 != null) {
            softwareKeyboardController2.show();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt$AutoFocusModal$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt$AutoFocusModal$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoFocusModalKt$AutoFocusModal$1$1(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt$AutoFocusModal$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
        this.getHighSpeedVideoFpsRanges = focusRequester;
        this.getHighSpeedVideoSizes = softwareKeyboardController;
    }
}
