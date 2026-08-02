package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$2$1", f = "UserVerificationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class UserVerificationScreenKt$UserVerificationScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState access$UserVerificationScreen$lambda$4 = com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt.access$UserVerificationScreen$lambda$4(this.getHighResolutionOutputSizeshNQ4ISI);
        if (access$UserVerificationScreen$lambda$4 instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success) {
            com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success success = (com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success) access$UserVerificationScreen$lambda$4;
            this.getHighSpeedVideoSizes.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess(this.Camera2StreamConfigurationMap, success.getToken(), this.getHighSpeedVideoFpsRanges, success.getPostAuthOperations()));
        } else if (access$UserVerificationScreen$lambda$4 instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired) {
            this.getHighSpeedVideoSizes.handleEffect(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired(this.Camera2StreamConfigurationMap, ((com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired) access$UserVerificationScreen$lambda$4).getChallengeResult()));
        } else if ((access$UserVerificationScreen$lambda$4 instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Cancelled) || (access$UserVerificationScreen$lambda$4 instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Error) || (access$UserVerificationScreen$lambda$4 instanceof com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.FallbackToPassword)) {
            this.getInputSizeshNQ4ISI.signUpWithGoogle(this.getHighSpeedVideoFpsRangesFor);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$2$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UserVerificationScreenKt$UserVerificationScreen$2$1(com.paypal.oslo.feature.identity.logincontroller.domain.LoginFlowController loginFlowController, java.lang.String str, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel, android.content.Context context, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.ui.UserVerificationScreenKt$UserVerificationScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = loginFlowController;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = authIntent;
        this.getInputSizeshNQ4ISI = userVerificationViewModel;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }
}
