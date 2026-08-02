package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$5", f = "SavingsGoalDetailsViewModel.kt", i = {0}, l = {163}, m = "invokeSuspend", n = {"state"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState second = this.getHighResolutionOutputSizeshNQ4ISI.getStates().getSecond();
            if (second instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success) {
                com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success success = (com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success) second;
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(second);
                this.getHighSpeedVideoFpsRanges = 1;
                highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(success.getGoal().getId(), success.getGoal().getTitle(), this.getHighResolutionOutputSizeshNQ4ISI.getEventDispatcher(), false, this);
                if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$5) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$5(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$5(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent> input, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel savingsGoalDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel$sideEffectsMiddleware$1$invoke$5> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = input;
        this.getHighSpeedVideoSizes = savingsGoalDetailsViewModel;
    }
}
