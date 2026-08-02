package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$callVerifyCredentials$1", f = "RememberedLoginViewModel.kt", i = {0, 0}, l = {362}, m = "invokeSuspend", n = {"credential", "request"}, nl = {455}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class RememberedLoginViewModel$callVerifyCredentials$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential;
        com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase verifyCredentialUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI.processEvent(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialStarted.INSTANCE);
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) this.getHighSpeedVideoFpsRanges, (java.lang.CharSequence) "@", false, 2, (java.lang.Object) null)) {
                phoneCredential = new com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential(this.getHighSpeedVideoFpsRanges, null, 2, null);
            } else {
                phoneCredential = new com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential(this.getHighSpeedVideoFpsRanges, "+1", null, 4, null);
            }
            com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest verifyCredentialRequest = new com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest(com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN, phoneCredential);
            verifyCredentialUseCase = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneCredential);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(verifyCredentialRequest);
            this.Camera2StreamConfigurationMap = 1;
            obj = verifyCredentialUseCase.invoke(verifyCredentialRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult verifyCredentialResult = (com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult) ((arrow.core.Either.Right) either).getValue();
            if (verifyCredentialResult instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess) {
                rememberedLoginViewModel.processEvent(new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialSuccess(((com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess) verifyCredentialResult).getAuthOptions()));
            } else {
                if (!(verifyCredentialResult instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.AvailableForSignUp) && !(verifyCredentialResult instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.SuggestedCorrection) && !(verifyCredentialResult instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.ConfirmationRequired)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                rememberedLoginViewModel.processEvent(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialFailed.INSTANCE);
            }
        } else if (either instanceof arrow.core.Either.Left) {
            rememberedLoginViewModel.processEvent(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialFailed.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$callVerifyCredentials$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$callVerifyCredentials$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberedLoginViewModel$callVerifyCredentials$1(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$callVerifyCredentials$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = rememberedLoginViewModel;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
