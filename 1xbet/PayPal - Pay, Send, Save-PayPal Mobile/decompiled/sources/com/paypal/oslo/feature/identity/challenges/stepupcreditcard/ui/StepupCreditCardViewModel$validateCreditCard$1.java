package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel$validateCreditCard$1", f = "StepupCreditCardViewModel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m = "invokeSuspend", n = {"normalizedCardNumber", "input"}, nl = {my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class StepupCreditCardViewModel$validateCreditCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard getHighSpeedVideoSizes;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext;
        com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext2;
        java.lang.Object invoke;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (java.lang.Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            java.lang.String obj2 = sb.toString();
            if (obj2.length() == 0) {
                com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel stepupCreditCardViewModel = this.getOutputMinFrameDuration;
                stepupCreditCardViewModel.processEvent(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel.access$createInlineErrorEvent(stepupCreditCardViewModel));
                return kotlin.Unit.INSTANCE;
            }
            java.lang.String id = this.Camera2StreamConfigurationMap.getId();
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.CreditCardValidationInput creditCardValidationInput = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.CreditCardValidationInput(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.CREDIT_CARD, this.getHighSpeedVideoSizes.getId(), obj2);
            java.lang.String nonce = this.Camera2StreamConfigurationMap.getNonce();
            java.lang.String partialToken = this.Camera2StreamConfigurationMap.getPartialToken();
            challengeContext = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext3 = null;
            if (challengeContext == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                challengeContext = null;
            }
            com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput(id, null, null, creditCardValidationInput, null, nonce, partialToken, challengeContext.getAuthIntent(), null, com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, null);
            validateChallengeUseCase = this.getOutputMinFrameDuration.getHighSpeedVideoSizes;
            challengeContext2 = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            if (challengeContext2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                challengeContext3 = challengeContext2;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateChallengeInput);
            this.getOutputFormats = 1;
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
        com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel stepupCreditCardViewModel2 = this.getOutputMinFrameDuration;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel.access$handleValidationResult(stepupCreditCardViewModel2, (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult) ((arrow.core.Either.Right) either).getValue());
        } else {
            if (!(either instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            stepupCreditCardViewModel2.processEvent(new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.mvi.StepupCreditCardEvent.ValidationFailed(com.paypal.oslo.feature.identity.R.string.feature_identity_credit_card_error_invalid, true, false, true, kotlin.collections.CollectionsKt.emptyList()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel$validateCreditCard$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel$validateCreditCard$1(this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupCreditCardViewModel$validateCreditCard$1(java.lang.String str, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel stepupCreditCardViewModel, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCardChallenge creditCardChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel$validateCreditCard$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getOutputMinFrameDuration = stepupCreditCardViewModel;
        this.Camera2StreamConfigurationMap = creditCardChallenge;
        this.getHighSpeedVideoSizes = creditCard;
    }
}
