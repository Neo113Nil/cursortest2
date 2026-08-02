package com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenContentKt$TermsSheetContent$1$1", f = "TermsSheetStepScreenContent.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, nl = {151}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class TermsSheetStepScreenContentKt$TermsSheetContent$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.pds.components.BottomSheetController bottomSheetController = this.getHighSpeedVideoFpsRanges;
            if (bottomSheetController == null || bottomSheetController.getVisible()) {
                this.Camera2StreamConfigurationMap = 1;
                if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenContentKt$TermsSheetContent$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(this.getHighResolutionOutputSizeshNQ4ISI, 0, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenContentKt$TermsSheetContent$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenContentKt$TermsSheetContent$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TermsSheetStepScreenContentKt$TermsSheetContent$1$1(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.ui.focus.FocusRequester focusRequester, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.TermsSheetStepScreenContentKt$TermsSheetContent$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = bottomSheetController;
        this.getHighResolutionOutputSizeshNQ4ISI = focusRequester;
    }
}
