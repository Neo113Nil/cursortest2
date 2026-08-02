package com.paypal.oslo.feature.smartroute.ui.mvi.middleware;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"$\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent;", "getPyusdOptInMiddleware", "(Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;)Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "pyusdOptInMiddleware"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DistributionPyusdOptInMiddlewareKt {
    public static final com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent> getPyusdOptInMiddleware(final com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionViewModel, "");
        return new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent>() { // from class: com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionPyusdOptInMiddlewareKt$pyusdOptInMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptInButtonClicked) {
                    com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionPyusdOptInMiddlewareKt.access$handlePyusdOptInButtonClicked(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, input.getStates().getFirst());
                } else if (event instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptInModalDismissed) {
                    com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionPyusdOptInMiddlewareKt.access$handlePyusdOptInModalDismissed(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, input.getStates().getFirst());
                }
            }
        };
    }

    public static final /* synthetic */ void access$handlePyusdOptInButtonClicked(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState) {
        com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content content = distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content ? (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) distributionState : null;
        if (content != null) {
            com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration savedConfiguration = content.getScreenState().getSavedConfiguration();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "User initiated PYUSD opt-in", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "PYUSD_OPT_IN"), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CURRENT_STATUS_KEY, savedConfiguration.getCryptoOptInStatus().name())), null, 4, null);
            distributionViewModel.processEvent$smart_route_prodRelease(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.PyusdOptInStarted.INSTANCE);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(distributionViewModel), null, null, new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionPyusdOptInMiddlewareKt$handlePyusdOptInButtonClicked$1(distributionViewModel, savedConfiguration, null), 3, null);
        }
    }

    public static final /* synthetic */ void access$handlePyusdOptInModalDismissed(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState) {
        com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content content = distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content ? (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) distributionState : null;
        if (content != null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "User dismissed PYUSD opt-in modal", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "PYUSD_OPT_IN_DISMISSED"), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CURRENT_STATUS_KEY, content.getScreenState().getSavedConfiguration().getCryptoOptInStatus().name())), null, 4, null);
        }
    }
}
