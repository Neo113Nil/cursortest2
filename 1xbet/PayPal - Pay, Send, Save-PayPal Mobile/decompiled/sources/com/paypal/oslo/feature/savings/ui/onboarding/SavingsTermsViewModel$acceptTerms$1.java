package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel$acceptTerms$1", f = "SavingsTermsViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, nl = {163}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsTermsViewModel$acceptTerms$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.domain.usecase.AcceptSavingsAccountTermsUseCase acceptSavingsAccountTermsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            acceptSavingsAccountTermsUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = acceptSavingsAccountTermsUseCase.invoke(this);
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
        com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            mutableStateFlow2 = savingsTermsViewModel.getHighSpeedVideoSizes;
            mutableStateFlow2.setValue(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState.Content.INSTANCE);
            channel = savingsTermsViewModel.getHighResolutionOutputSizeshNQ4ISI;
            channel.mo9266trySendJP2dKIU(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToOnboardingFlow.INSTANCE);
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow = savingsTermsViewModel.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState.Error.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel$acceptTerms$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel$acceptTerms$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsTermsViewModel$acceptTerms$1(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel$acceptTerms$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = savingsTermsViewModel;
    }
}
