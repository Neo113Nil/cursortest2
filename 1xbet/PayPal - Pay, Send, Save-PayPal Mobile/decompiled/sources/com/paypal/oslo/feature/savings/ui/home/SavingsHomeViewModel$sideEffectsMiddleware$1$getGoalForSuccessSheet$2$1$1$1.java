package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "goalResult"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$1$1$1", f = "SavingsHomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<kotlinx.coroutines.Deferred<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.Deferred<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.remove(this.getHighSpeedVideoSizes);
        return goalSummaryDTO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$1$1$1) create(goalSummaryDTO, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$1$1$1 savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$1$1$1 = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$1$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$1$1$1.Camera2StreamConfigurationMap = obj;
        return savingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$1$1$1(java.util.List<kotlinx.coroutines.Deferred<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>> list, kotlinx.coroutines.Deferred<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> deferred, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$2$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoSizes = deferred;
    }
}
