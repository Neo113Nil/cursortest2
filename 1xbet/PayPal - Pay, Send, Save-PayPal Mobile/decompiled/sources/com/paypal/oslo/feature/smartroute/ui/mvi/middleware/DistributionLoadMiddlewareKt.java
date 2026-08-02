package com.paypal.oslo.feature.smartroute.ui.mvi.middleware;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"$\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent;", "getLoadMiddleware", "(Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;)Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "loadMiddleware"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DistributionLoadMiddlewareKt {
    public static final com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent> getLoadMiddleware(final com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionViewModel, "");
        return new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent>() { // from class: com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt$loadMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Initialize) {
                    com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt.access$handleInitialize(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, 0);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Retry) {
                    int currentRetryCount = ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Retry) event).getCurrentRetryCount() + 1;
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "User initiated load retry", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "LOAD_RETRY"), kotlin.TuplesKt.to("attemptNumber", java.lang.Integer.valueOf(currentRetryCount))), null, 4, null);
                    com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt.access$handleInitialize(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, currentRetryCount);
                } else if (event instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.RefreshAutoReload) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r9), null, null, new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt$handleRefreshAutoReload$1(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, null), 3, null);
                }
            }
        };
    }

    public static final /* synthetic */ void access$handleInitialize(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, int i) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.smartroute.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "LOAD");
        pairArr[1] = kotlin.TuplesKt.to("retryCount", java.lang.Integer.valueOf(i));
        pairArr[2] = kotlin.TuplesKt.to("isRetry", java.lang.Boolean.valueOf(i > 0));
        com.paypal.android.logger.Logger.i$default(logger, "Initializing distribution screen", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        distributionViewModel.processEvent$smart_route_prodRelease(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadStarted.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(distributionViewModel), null, null, new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt$handleInitialize$1(distributionViewModel, i, null), 3, null);
    }
}
