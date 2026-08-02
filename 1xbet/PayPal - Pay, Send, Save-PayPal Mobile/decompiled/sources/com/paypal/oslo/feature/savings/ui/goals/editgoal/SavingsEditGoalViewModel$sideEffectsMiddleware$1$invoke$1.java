package com.paypal.oslo.feature.savings.ui.goals.editgoal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$sideEffectsMiddleware$1$invoke$1", f = "SavingsEditGoalViewModel.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, nl = {134}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsEditGoalViewModel$sideEffectsMiddleware$1$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel.access$validateDuplicateNameAndSave(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI.getGoalId(), this.getHighResolutionOutputSizeshNQ4ISI.getGoalName(), this.getHighSpeedVideoFpsRanges.getEventDispatcher(), this) == coroutine_suspended) {
                return coroutine_suspended;
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
        return ((com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$sideEffectsMiddleware$1$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$sideEffectsMiddleware$1$invoke$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsEditGoalViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel savingsEditGoalViewModel, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState savingsEditGoalState, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalState, com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalIntent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.editgoal.SavingsEditGoalViewModel$sideEffectsMiddleware$1$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = savingsEditGoalViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = savingsEditGoalState;
        this.getHighSpeedVideoFpsRanges = input;
    }
}
