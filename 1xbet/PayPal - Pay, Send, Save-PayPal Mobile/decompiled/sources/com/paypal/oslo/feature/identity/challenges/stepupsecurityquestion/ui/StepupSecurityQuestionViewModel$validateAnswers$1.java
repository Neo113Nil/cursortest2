package com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel$validateAnswers$1", f = "StepupSecurityQuestionViewModel.kt", i = {0}, l = {175}, m = "invokeSuspend", n = {"input"}, nl = {306}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class StepupSecurityQuestionViewModel$validateAnswers$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext;
        com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext2;
        java.lang.Object invoke;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String id = this.getHighSpeedVideoFpsRanges.getId();
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION;
            java.util.Map<java.lang.String, java.lang.String> map = this.Camera2StreamConfigurationMap;
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                arrayList.add(new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionAnswer(entry.getKey(), entry.getValue()));
            }
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionValidationInput securityQuestionValidationInput = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionValidationInput(challengeType, arrayList);
            java.lang.String nonce = this.getHighSpeedVideoFpsRanges.getNonce();
            java.lang.String partialToken = this.getHighSpeedVideoFpsRanges.getPartialToken();
            challengeContext = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext3 = null;
            if (challengeContext == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                challengeContext = null;
            }
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput(id, null, securityQuestionValidationInput, null, null, nonce, partialToken, challengeContext.getAuthIntent(), null, 282, null);
            validateChallengeUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            challengeContext2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            if (challengeContext2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                challengeContext3 = challengeContext2;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateChallengeInput);
            this.getHighSpeedVideoSizes = 1;
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
        com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel stepupSecurityQuestionViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel.access$handleValidationResult(stepupSecurityQuestionViewModel, (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult) ((arrow.core.Either.Right) either).getValue());
        } else {
            if (!(either instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            stepupSecurityQuestionViewModel.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.mvi.StepupSecurityQuestionEvent.TechnicalError(com.paypal.oslo.feature.identity.R.string.feature_identity_security_question_error_technical));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel$validateAnswers$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel$validateAnswers$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupSecurityQuestionViewModel$validateAnswers$1(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SecurityQuestionChallenge securityQuestionChallenge, java.util.Map<java.lang.String, java.lang.String> map, com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel stepupSecurityQuestionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel$validateAnswers$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = securityQuestionChallenge;
        this.Camera2StreamConfigurationMap = map;
        this.getHighSpeedVideoFpsRangesFor = stepupSecurityQuestionViewModel;
    }
}
