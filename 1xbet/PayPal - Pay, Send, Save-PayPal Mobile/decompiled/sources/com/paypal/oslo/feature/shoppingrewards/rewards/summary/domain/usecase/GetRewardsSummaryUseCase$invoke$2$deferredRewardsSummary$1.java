package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase$Response;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2$deferredRewardsSummary$1", f = "GetRewardsSummaryUseCase.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class GetRewardsSummaryUseCase$invoke$2$deferredRewardsSummary$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository rewardsSummaryRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        rewardsSummaryRepository = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object rewardsSummary = rewardsSummaryRepository.getRewardsSummary(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.access$earnOffersRequest(this.Camera2StreamConfigurationMap), this);
        return rewardsSummary == coroutine_suspended ? coroutine_suspended : rewardsSummary;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>>> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2$deferredRewardsSummary$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2$deferredRewardsSummary$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetRewardsSummaryUseCase$invoke$2$deferredRewardsSummary$1(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getRewardsSummaryUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$invoke$2$deferredRewardsSummary$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = getRewardsSummaryUseCase;
    }
}
