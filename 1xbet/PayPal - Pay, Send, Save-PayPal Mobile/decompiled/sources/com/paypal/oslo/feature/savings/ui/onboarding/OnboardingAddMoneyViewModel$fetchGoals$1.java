package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel$fetchGoals$1", f = "OnboardingAddMoneyViewModel.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class OnboardingAddMoneyViewModel$fetchGoals$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase fetchGoalsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object obj2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState onboardingAddMoneyFormState;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow.setValue(com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Loading.INSTANCE);
            fetchGoalsUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase.invoke$default(fetchGoalsUseCase, null, false, this, 3, null);
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
        com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel onboardingAddMoneyViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            java.util.Iterator it = ((java.util.List) ((arrow.core.Either.Right) either).getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj2).isGeneralSavingsTile()) {
                    break;
                }
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj2;
            if (goalSummaryDTO != null) {
                onboardingAddMoneyViewModel.Camera2StreamConfigurationMap = goalSummaryDTO;
                mutableStateFlow5 = onboardingAddMoneyViewModel.getHighResolutionOutputSizeshNQ4ISI;
                onboardingAddMoneyFormState = onboardingAddMoneyViewModel.getHighSpeedVideoSizes;
                mutableStateFlow5.setValue(new com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Content(goalSummaryDTO, onboardingAddMoneyFormState));
            } else {
                mutableStateFlow4 = onboardingAddMoneyViewModel.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow4.setValue(com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.ServiceUnavailable.INSTANCE);
            }
        } else if (either instanceof arrow.core.Either.Left) {
            if (((com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue()) instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) {
                mutableStateFlow3 = onboardingAddMoneyViewModel.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow3.setValue(com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.NetworkError.INSTANCE);
            } else {
                mutableStateFlow2 = onboardingAddMoneyViewModel.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow2.setValue(com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.ServiceUnavailable.INSTANCE);
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel$fetchGoals$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel$fetchGoals$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingAddMoneyViewModel$fetchGoals$1(com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel onboardingAddMoneyViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel$fetchGoals$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = onboardingAddMoneyViewModel;
    }
}
