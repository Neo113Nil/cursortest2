package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$3$1", f = "RememberedLoginScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class RememberedLoginScreenKt$RememberedLoginScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState access$RememberedLoginScreen$lambda$1 = com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.access$RememberedLoginScreen$lambda$1(this.getHighSpeedVideoFpsRanges);
        if (access$RememberedLoginScreen$lambda$1 instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success) {
            this.getOutputFormats.resetBiometricState();
            this.getOutputFormats.trackAuthSuccess$identity_prodRelease(com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod.BIOMETRIC);
            com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success success = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success) access$RememberedLoginScreen$lambda$1;
            this.getHighSpeedVideoSizes.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess(this.getHighSpeedVideoFpsRangesFor, success.getToken(), null, success.getPostAuthOperations(), 4, null));
        } else if (access$RememberedLoginScreen$lambda$1 instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.ChallengeRequired) {
            this.getOutputFormats.resetBiometricState();
            this.getHighSpeedVideoSizes.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired(this.getHighSpeedVideoFpsRangesFor, ((com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.ChallengeRequired) access$RememberedLoginScreen$lambda$1).getChallengeResult()));
        } else if (access$RememberedLoginScreen$lambda$1 instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.NotAvailable) {
            if (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.access$RememberedLoginScreen$lambda$2(this.getHighResolutionOutputSizeshNQ4ISI) instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Idle) {
                this.getOutputFormats.attemptPasskeyLogin(this.Camera2StreamConfigurationMap);
            }
        } else if (access$RememberedLoginScreen$lambda$1 instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Error) {
            this.getOutputFormats.trackErrorBannerShown$identity_prodRelease(com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod.BIOMETRIC);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$3$1(this.getOutputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RememberedLoginScreenKt$RememberedLoginScreen$3$1(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, android.content.Context context, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState> state, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$3$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = rememberedLoginViewModel;
        this.getHighSpeedVideoSizes = loginFlowController;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighResolutionOutputSizeshNQ4ISI = state2;
    }
}
