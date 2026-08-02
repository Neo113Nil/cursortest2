package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$validateCode$1", f = "StepupOtpVerificationViewModel.kt", i = {0}, l = {339}, m = "invokeSuspend", n = {"input"}, nl = {1005}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class StepupOtpVerificationViewModel$validateCode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext;
        com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext2;
        java.lang.Object invoke;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String id = this.getHighSpeedVideoSizes.getId();
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput validationInput = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput(this.getHighSpeedVideoSizes.getType(), this.Camera2StreamConfigurationMap);
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
            challengeContext = this.getOutputFormats.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext3 = null;
            if (challengeContext == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                challengeContext = null;
            }
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput(id, validationInput, null, null, null, str, str2, challengeContext.getAuthIntent(), null, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, null);
            validateChallengeUseCase = this.getOutputFormats.getHighSpeedVideoSizes;
            challengeContext2 = this.getOutputFormats.getHighSpeedVideoSizesFor;
            if (challengeContext2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                challengeContext3 = challengeContext2;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateChallengeInput);
            this.getInputSizeshNQ4ISI = 1;
            invoke = validateChallengeUseCase.invoke(validateChallengeInput, challengeContext3.getFlowType(), this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel = this.getOutputFormats;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.access$handleValidationResult(stepupOtpVerificationViewModel, (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult) ((arrow.core.Either.Right) either).getValue());
        } else {
            if (!(either instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            stepupOtpVerificationViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpEvent.ValidationFailed(com.paypal.oslo.feature.identity.R.string.feature_identity_otp_error_unknown, true, false, false, null, 24, null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$validateCode$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$validateCode$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupOtpVerificationViewModel$validateCode$1(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel$validateCode$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = challenge;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.getOutputFormats = stepupOtpVerificationViewModel;
    }
}
