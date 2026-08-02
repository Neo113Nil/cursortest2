package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$4$1", f = "RememberedLoginScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class RememberedLoginScreenKt$RememberedLoginScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState access$RememberedLoginScreen$lambda$2 = com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt.access$RememberedLoginScreen$lambda$2(this.getHighSpeedVideoFpsRanges);
        if (access$RememberedLoginScreen$lambda$2 instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success) {
            this.getHighSpeedVideoFpsRangesFor.trackAuthSuccess$identity_prodRelease(com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod.PASSKEY);
            com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success success = (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success) access$RememberedLoginScreen$lambda$2;
            this.getHighResolutionOutputSizeshNQ4ISI.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess(this.getHighSpeedVideoSizes, success.getToken(), null, success.getPostAuthOperations(), 4, null));
        } else if (access$RememberedLoginScreen$lambda$2 instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired) {
            this.getHighResolutionOutputSizeshNQ4ISI.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired(this.getHighSpeedVideoSizes, ((com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired) access$RememberedLoginScreen$lambda$2).getChallengeResult()));
        } else if (!(access$RememberedLoginScreen$lambda$2 instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.FallbackToPassword) && (access$RememberedLoginScreen$lambda$2 instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Error)) {
            this.getHighSpeedVideoFpsRangesFor.trackErrorBannerShown$identity_prodRelease(com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod.PASSKEY);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$4$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RememberedLoginScreenKt$RememberedLoginScreen$4$1(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel, com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginScreenKt$RememberedLoginScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = rememberedLoginViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = loginFlowController;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = state;
    }
}
