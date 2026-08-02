package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailUiState;", "email", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "currentState"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$emailUiState$2", f = "EmailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class EmailViewModel$emailUiState$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState emailUiState = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState.copy$default(emailUiState, new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData(str, null), null, null, false, 14, null);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email email, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState emailUiState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState> continuation) {
        java.lang.String m15927unboximpl = email.m15927unboximpl();
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$emailUiState$2 emailViewModel$emailUiState$2 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$emailUiState$2(continuation);
        emailViewModel$emailUiState$2.getHighResolutionOutputSizeshNQ4ISI = m15927unboximpl;
        emailViewModel$emailUiState$2.Camera2StreamConfigurationMap = emailUiState;
        return emailViewModel$emailUiState$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    EmailViewModel$emailUiState$2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel$emailUiState$2> continuation) {
        super(3, continuation);
    }
}
