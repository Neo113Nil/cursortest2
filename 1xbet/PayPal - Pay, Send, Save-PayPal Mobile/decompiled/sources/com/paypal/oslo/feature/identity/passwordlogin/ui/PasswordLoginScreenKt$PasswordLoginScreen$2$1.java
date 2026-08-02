package com.paypal.oslo.feature.identity.passwordlogin.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordLoginScreenKt$PasswordLoginScreen$2$1", f = "PasswordLoginScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PasswordLoginScreenKt$PasswordLoginScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState access$PasswordLoginScreen$lambda$0 = com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordLoginScreenKt.access$PasswordLoginScreen$lambda$0(this.getHighSpeedVideoSizes);
        if (access$PasswordLoginScreen$lambda$0 instanceof com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Success) {
            com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Success success = (com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Success) access$PasswordLoginScreen$lambda$0;
            this.getHighResolutionOutputSizeshNQ4ISI.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess(this.Camera2StreamConfigurationMap, success.getResult(), this.getHighSpeedVideoFpsRangesFor, success.getPostAuthOperations()));
        } else if (access$PasswordLoginScreen$lambda$0 instanceof com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.ChallengeRequired) {
            this.getHighResolutionOutputSizeshNQ4ISI.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired(this.Camera2StreamConfigurationMap, ((com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.ChallengeRequired) access$PasswordLoginScreen$lambda$0).getChallengeResult()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordLoginScreenKt$PasswordLoginScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordLoginScreenKt$PasswordLoginScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PasswordLoginScreenKt$PasswordLoginScreen$2$1(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordLoginScreenKt$PasswordLoginScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = loginFlowController;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = authIntent;
        this.getHighSpeedVideoSizes = state;
    }
}
