package com.paypal.oslo.feature.smartroute.ui.mvi.middleware;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt$handleRefreshAutoReload$1", f = "DistributionLoadMiddleware.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, nl = {174}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DistributionLoadMiddlewareKt$handleRefreshAutoReload$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = this.getHighSpeedVideoSizes.getUseCases().getGetConfiguration().invoke(this);
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
        com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration = (com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration) ((arrow.core.Either.Right) either).getValue();
            java.lang.String autoReloadThresholdAmount = distributionConfiguration.getAutoReloadThresholdAmount();
            java.lang.String formatCurrency$smart_route_prodRelease = autoReloadThresholdAmount != null ? distributionViewModel.getMapper().formatCurrency$smart_route_prodRelease(autoReloadThresholdAmount) : null;
            java.lang.String autoReloadAmount = distributionConfiguration.getAutoReloadAmount();
            distributionViewModel.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadDataRefreshed(distributionConfiguration.getAutoReloadEnabled(), formatCurrency$smart_route_prodRelease, autoReloadAmount != null ? distributionViewModel.getMapper().formatCurrency$smart_route_prodRelease(autoReloadAmount) : null, distributionConfiguration.getAutoReloadFinancialInstrumentId()));
        } else if (either instanceof arrow.core.Either.Left) {
            distributionViewModel.processEvent$smart_route_prodRelease(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadRefreshFailed.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt$handleRefreshAutoReload$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt$handleRefreshAutoReload$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DistributionLoadMiddlewareKt$handleRefreshAutoReload$1(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt$handleRefreshAutoReload$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = distributionViewModel;
    }
}
