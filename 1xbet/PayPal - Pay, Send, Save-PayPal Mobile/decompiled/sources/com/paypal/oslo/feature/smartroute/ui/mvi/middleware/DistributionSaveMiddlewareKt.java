package com.paypal.oslo.feature.smartroute.ui.mvi.middleware;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0004\u0010\u000b\"$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\f*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;", "p0", "", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;)V", "Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;)Z", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "(Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent;", "getSaveMiddleware", "(Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;)Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "saveMiddleware"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DistributionSaveMiddlewareKt {
    public static final com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent> getSaveMiddleware(final com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionViewModel, "");
        return new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent>() { // from class: com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt$saveMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PrimaryButtonClicked) {
                    com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt.getHighSpeedVideoSizes(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, input.getStates().getFirst());
                } else if (event instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.TurnOffConfirmed) {
                    com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt.access$handleTurnOffConfirmed(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, input.getStates().getFirst());
                } else if (event instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SaveErrorRetryClicked) {
                    com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt.access$handleSaveErrorRetryClicked(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, input.getStates().getFirst());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState) {
        java.lang.Object obj;
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration copy;
        java.lang.Object obj2 = null;
        com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content content = distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content ? (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) distributionState : null;
        if (content != null) {
            com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState screenState = content.getScreenState();
            if (screenState.getShouldShowPyusdOptInOnSave()) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Showing PYUSD opt-in bottom sheet", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "PYUSD_OPT_IN_SHEET_SHOWN"), kotlin.TuplesKt.to("cryptoOptInStatus", screenState.getSavedConfiguration().getCryptoOptInStatus().name())), null, 4, null);
            }
            if (getHighSpeedVideoFpsRanges(screenState)) {
                return;
            }
            com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration savedConfiguration = screenState.getSavedConfiguration();
            java.util.Iterator<T> it = screenState.getAccounts().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) obj).getId(), "savings")) {
                        break;
                    }
                }
            }
            com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi distributionAccountUi = (com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) obj;
            float percentage = distributionAccountUi != null ? distributionAccountUi.getPercentage() : 0.0f;
            java.util.Iterator<T> it2 = screenState.getAccounts().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next = it2.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) next).getId(), "crypto")) {
                    obj2 = next;
                    break;
                }
            }
            com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi distributionAccountUi2 = (com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) obj2;
            copy = savedConfiguration.copy((r30 & 1) != 0 ? savedConfiguration.status : com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.ACTIVE, (r30 & 2) != 0 ? savedConfiguration.savingsPercentage : percentage, (r30 & 4) != 0 ? savedConfiguration.cryptoPercentage : distributionAccountUi2 != null ? distributionAccountUi2.getPercentage() : 0.0f, (r30 & 8) != 0 ? savedConfiguration.cryptoApyRate : null, (r30 & 16) != 0 ? savedConfiguration.cryptoOptInStatus : null, (r30 & 32) != 0 ? savedConfiguration.savingsApy : null, (r30 & 64) != 0 ? savedConfiguration.autoReloadEnabled : false, (r30 & 128) != 0 ? savedConfiguration.autoReloadThresholdAmount : null, (r30 & 256) != 0 ? savedConfiguration.autoReloadAmount : null, (r30 & 512) != 0 ? savedConfiguration.autoReloadCurrency : null, (r30 & 1024) != 0 ? savedConfiguration.autoReloadFinancialInstrumentId : null, (r30 & 2048) != 0 ? savedConfiguration.version : null, (r30 & 4096) != 0 ? savedConfiguration.savingsEligibilityStatus : null, (r30 & 8192) != 0 ? savedConfiguration.pyusdEligibilityStatus : null);
            getHighSpeedVideoSizes(distributionViewModel, copy);
        }
    }

    private static final boolean getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState) {
        if (com.paypal.oslo.feature.smartroute.ui.model.DistributionUiModelsKt.shouldShowSavingsOnboarding(distributionScreenState) || distributionScreenState.getHasAutoReloadToggleChanged() || distributionScreenState.getShouldShowPyusdOptInOnSave()) {
            return true;
        }
        return distributionScreenState.getStatus() == com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.ACTIVE && !distributionScreenState.getHasUnsavedChanges();
    }

    private static final void getHighSpeedVideoSizes(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Executing save operation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "SAVE"), kotlin.TuplesKt.to("status", distributionConfiguration.getStatus().name()), kotlin.TuplesKt.to("savingsPercentage", java.lang.Float.valueOf(distributionConfiguration.getSavingsPercentage())), kotlin.TuplesKt.to("cryptoPercentage", java.lang.Float.valueOf(distributionConfiguration.getCryptoPercentage())), kotlin.TuplesKt.to("autoReloadEnabled", java.lang.Boolean.valueOf(distributionConfiguration.getAutoReloadEnabled()))), null, 4, null);
        distributionViewModel.processEvent$smart_route_prodRelease(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveStarted.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(distributionViewModel), null, null, new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt$executeSave$1(distributionViewModel, distributionConfiguration, null), 3, null);
    }

    public static final /* synthetic */ void access$handleSaveErrorRetryClicked(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "User initiated save retry", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "SAVE_RETRY")), null, 4, null);
        getHighSpeedVideoSizes(distributionViewModel, distributionState);
    }

    public static final /* synthetic */ void access$handleTurnOffConfirmed(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState) {
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration copy;
        com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content content = distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content ? (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) distributionState : null;
        if (content != null) {
            com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration savedConfiguration = content.getScreenState().getSavedConfiguration();
            boolean autoReloadEnabled = savedConfiguration.getAutoReloadEnabled();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Turn-off confirmed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "TURN_OFF"), kotlin.TuplesKt.to("hasAutoReload", java.lang.Boolean.valueOf(autoReloadEnabled))), null, 4, null);
            if (autoReloadEnabled) {
                distributionViewModel.processEvent$smart_route_prodRelease(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveStarted.INSTANCE);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(distributionViewModel), null, null, new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt$executeTurnOffWithAutoReloadDeactivation$1(distributionViewModel, savedConfiguration, null), 3, null);
            } else {
                copy = savedConfiguration.copy((r30 & 1) != 0 ? savedConfiguration.status : com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE, (r30 & 2) != 0 ? savedConfiguration.savingsPercentage : 0.0f, (r30 & 4) != 0 ? savedConfiguration.cryptoPercentage : 0.0f, (r30 & 8) != 0 ? savedConfiguration.cryptoApyRate : null, (r30 & 16) != 0 ? savedConfiguration.cryptoOptInStatus : null, (r30 & 32) != 0 ? savedConfiguration.savingsApy : null, (r30 & 64) != 0 ? savedConfiguration.autoReloadEnabled : false, (r30 & 128) != 0 ? savedConfiguration.autoReloadThresholdAmount : null, (r30 & 256) != 0 ? savedConfiguration.autoReloadAmount : null, (r30 & 512) != 0 ? savedConfiguration.autoReloadCurrency : null, (r30 & 1024) != 0 ? savedConfiguration.autoReloadFinancialInstrumentId : null, (r30 & 2048) != 0 ? savedConfiguration.version : null, (r30 & 4096) != 0 ? savedConfiguration.savingsEligibilityStatus : null, (r30 & 8192) != 0 ? savedConfiguration.pyusdEligibilityStatus : null);
                getHighSpeedVideoSizes(distributionViewModel, copy);
            }
        }
    }
}
