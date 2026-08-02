package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$deferreds$1$1", f = "SavingsHomeViewModel.kt", i = {}, l = {463}, m = "invokeSuspend", n = {}, nl = {529}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$deferreds$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.domain.usecase.GetGoalSuccessStatusUseCase getGoalSuccessStatusUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getGoalSuccessStatusUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = getGoalSuccessStatusUseCase.invoke(this.getHighSpeedVideoSizes.getId(), this);
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
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            if (((com.paypal.oslo.feature.savings.domain.model.goals.GoalSuccessStatus) ((arrow.core.Either.Right) either).getValue()).getHasAcknowledgedTargetReached()) {
                return null;
            }
            return goalSummaryDTO;
        }
        if (!(either instanceof arrow.core.Either.Left)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$deferreds$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$deferreds$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$deferreds$1$1(com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$deferreds$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = savingsHomeViewModel;
        this.getHighSpeedVideoSizes = goalSummaryDTO;
    }
}
