package com.paypal.oslo.feature.identity.otplogin.verifyotp.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel$verifyOtp$1", f = "OtpVerificationViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {"request"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class OtpVerificationViewModel$verifyOtp$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.usecase.OtpVerificationUseCase otpVerificationUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.model.OtpVerificationRequest otpVerificationRequest = new com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.model.OtpVerificationRequest(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, false, null, 48, null);
            otpVerificationUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(otpVerificationRequest);
            this.getHighSpeedVideoSizesFor = 1;
            obj = otpVerificationUseCase.invoke(otpVerificationRequest, this);
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
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult = (com.paypal.oslo.feature.identity.login.domain.model.LoginResult) ((arrow.core.Either.Right) either).getValue();
            if (loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.Success) {
                com.paypal.oslo.feature.identity.login.domain.model.Success success = (com.paypal.oslo.feature.identity.login.domain.model.Success) loginResult;
                function1.invoke(new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationSucceeded(success.getFirstPartyUserAccessToken(), success.getPostAuthOperations()));
            } else {
                if (!(loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                function1.invoke(new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChallengeRequired(((com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) loginResult).getChallengeResult()));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.login.domain.model.LoginError loginError = (com.paypal.oslo.feature.identity.login.domain.model.LoginError) ((arrow.core.Either.Left) either).getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(loginError, "");
            com.paypal.oslo.feature.identity.login.domain.model.AuthError authError = (com.paypal.oslo.feature.identity.login.domain.model.AuthError) loginError;
            function1.invoke(new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationFailed(authError.getMsg(), com.paypal.oslo.feature.identity.otplogin.verifyotp.domain.error.OtpErrorClassifier.INSTANCE.isExpiredError(null, authError.getMsg())));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel$verifyOtp$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel$verifyOtp$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OtpVerificationViewModel$verifyOtp$1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel otpVerificationViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel$verifyOtp$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
        this.Camera2StreamConfigurationMap = str4;
        this.getInputSizeshNQ4ISI = otpVerificationViewModel;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
