package com.paypal.oslo.feature.identity.otplogin.verifyotp.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationScreenKt$OtpVerificationScreen$3$1", f = "OtpVerificationScreen.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, nl = {140}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class OtpVerificationScreenKt$OtpVerificationScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.platform.SoftwareKeyboardController Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.focus.FocusManager getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel getHighSpeedVideoSizes;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect> uiEffect = this.getHighSpeedVideoSizes.getUiEffect();
            final com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController = this.getHighSpeedVideoFpsRangesFor;
            final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = this.Camera2StreamConfigurationMap;
            final androidx.compose.ui.focus.FocusManager focusManager = this.getHighSpeedVideoFpsRanges;
            this.getOutputFormats = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationScreenKt$OtpVerificationScreen$3$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect otpVerificationUiEffect = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect) obj2;
                    if (otpVerificationUiEffect instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateBack) {
                        com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController.this.handleEffect(com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.Back.INSTANCE);
                    } else if (otpVerificationUiEffect instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateToNextChallenge) {
                        com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateToNextChallenge navigateToNextChallenge = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.NavigateToNextChallenge) otpVerificationUiEffect;
                        com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController.this.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess(str, navigateToNextChallenge.getToken(), null, navigateToNextChallenge.getPostAuthOperations(), 4, null));
                    } else if (otpVerificationUiEffect instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ChallengeRequired) {
                        com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController.this.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired(str, ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ChallengeRequired) otpVerificationUiEffect).getChallengeResult()));
                    } else if (otpVerificationUiEffect instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.HideKeyboard) {
                        androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                        if (softwareKeyboardController2 != null) {
                            softwareKeyboardController2.hide();
                        }
                        androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
                    } else if (!(otpVerificationUiEffect instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiEffect.ShowKeyboard)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationScreenKt$OtpVerificationScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationScreenKt$OtpVerificationScreen$3$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtpVerificationScreenKt$OtpVerificationScreen$3$1(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel otpVerificationViewModel, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, androidx.compose.ui.focus.FocusManager focusManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationScreenKt$OtpVerificationScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = otpVerificationViewModel;
        this.getHighSpeedVideoFpsRangesFor = loginFlowController;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = softwareKeyboardController;
        this.getHighSpeedVideoFpsRanges = focusManager;
    }
}
