package com.paypal.oslo.feature.savings.ui.goals.creategoal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validationMiddleware$1$invoke$1", f = "SavingsCreateGoalViewModel.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, nl = {91}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsCreateGoalViewModel$validationMiddleware$1$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel.access$validateDuplicateName(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges.getGoalName(), this.Camera2StreamConfigurationMap.getEventDispatcher(), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validationMiddleware$1$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validationMiddleware$1$invoke$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsCreateGoalViewModel$validationMiddleware$1$invoke$1(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel savingsCreateGoalViewModel, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState savingsCreateGoalState, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalState, com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalIntent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel$validationMiddleware$1$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = savingsCreateGoalViewModel;
        this.getHighSpeedVideoFpsRanges = savingsCreateGoalState;
        this.Camera2StreamConfigurationMap = input;
    }
}
