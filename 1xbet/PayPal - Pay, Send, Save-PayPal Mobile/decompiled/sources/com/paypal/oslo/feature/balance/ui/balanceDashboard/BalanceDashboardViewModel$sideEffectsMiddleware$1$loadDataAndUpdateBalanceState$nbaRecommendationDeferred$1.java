package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/api/errors/NbaError;", "", "Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$nbaRecommendationDeferred$1", f = "BalanceDashboardViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$nbaRecommendationDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.api.errors.NbaError, ? extends java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation>>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.balance.domain.usecase.nba.GetNbaDomainRecommendationsUseCase getNbaDomainRecommendationsUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        getNbaDomainRecommendationsUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object invoke = getNbaDomainRecommendationsUseCase.invoke(com.paypal.oslo.feature.balance.api.models.nba.NbaSurface.BALANCE, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.api.errors.NbaError, ? extends java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation>>> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$nbaRecommendationDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$nbaRecommendationDeferred$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$nbaRecommendationDeferred$1(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel balanceDashboardViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$nbaRecommendationDeferred$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = balanceDashboardViewModel;
    }
}
