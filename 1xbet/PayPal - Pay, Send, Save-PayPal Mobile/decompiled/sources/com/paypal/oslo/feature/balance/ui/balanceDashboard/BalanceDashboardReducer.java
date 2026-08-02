package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState;Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceDashboardReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public BalanceDashboardReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return com.paypal.oslo.feature.balance.common.BalanceConstants.ComponentNames.BALANCE_DASHBOARD_REDUCER;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect>> reduce(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState state, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent event) {
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error copy;
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error copy2;
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error copy3;
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success copy4;
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success copy5;
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success copy6;
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success copy7;
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success copy8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Idle) {
            return kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Initialize.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Idle) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success)) {
                if (!(state instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error error = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.RefreshScreen.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Loading.INSTANCE, null, 2, null);
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.RetryBalanceLoad.INSTANCE)) {
                    if (event instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded) {
                        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded balanceLoaded = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded) event;
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success(null, false, false, balanceLoaded.getBalanceUiModel(), false, balanceLoaded.getTaxHoldPolicy(), null, balanceLoaded.getNbaRecommendations(), false, false, balanceLoaded.isAccountRoutingEligible(), 343, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error) {
                        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error error2 = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error) event;
                        java.lang.String errorMessage = error2.getErrorMessage();
                        java.lang.Integer errorCode = error2.getErrorCode();
                        java.lang.String errorType = error2.getErrorType();
                        java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> nbaRecommendations = error2.getNbaRecommendations();
                        if (nbaRecommendations.isEmpty()) {
                            nbaRecommendations = error.getNbaRecommendations();
                        }
                        copy2 = error.copy((r18 & 1) != 0 ? error.errorMessage : errorMessage, (r18 & 2) != 0 ? error.errorCode : errorCode, (r18 & 4) != 0 ? error.errorType : errorType, (r18 & 8) != 0 ? error.isRetrying : false, (r18 & 16) != 0 ? error.nbaRecommendations : nbaRecommendations, (r18 & 32) != 0 ? error.isNbaDismissed : false, (r18 & 64) != 0 ? error.isNbaLoading : false, (r18 & 128) != 0 ? error.isPrepaidError : error2.isPrepaidError());
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect.ShowToast(((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage) event).getMessage(), 0L, 2, null));
                    }
                    if (!(event instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.DismissNba)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                    }
                    copy = error.copy((r18 & 1) != 0 ? error.errorMessage : null, (r18 & 2) != 0 ? error.errorCode : null, (r18 & 4) != 0 ? error.errorType : null, (r18 & 8) != 0 ? error.isRetrying : false, (r18 & 16) != 0 ? error.nbaRecommendations : null, (r18 & 32) != 0 ? error.isNbaDismissed : true, (r18 & 64) != 0 ? error.isNbaLoading : false, (r18 & 128) != 0 ? error.isPrepaidError : false);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
                }
                copy3 = error.copy((r18 & 1) != 0 ? error.errorMessage : null, (r18 & 2) != 0 ? error.errorCode : null, (r18 & 4) != 0 ? error.errorType : null, (r18 & 8) != 0 ? error.isRetrying : true, (r18 & 16) != 0 ? error.nbaRecommendations : null, (r18 & 32) != 0 ? error.isNbaDismissed : false, (r18 & 64) != 0 ? error.isNbaLoading : false, (r18 & 128) != 0 ? error.isPrepaidError : false);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy3, null, 2, null);
            }
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success success = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Initialize.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.RefreshScreen.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Loading.INSTANCE, null, 2, null);
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowViewCurrenciesBottomSheet.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.DismissViewCurrenciesBottomSheet.INSTANCE)) {
                    if (event instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded) {
                        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded balanceLoaded2 = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded) event;
                        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel = balanceLoaded2.getBalanceUiModel();
                        java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> nbaRecommendations2 = balanceLoaded2.getNbaRecommendations();
                        if (nbaRecommendations2.isEmpty()) {
                            nbaRecommendations2 = success.getNbaRecommendations();
                        }
                        copy6 = success.copy((r24 & 1) != 0 ? success.currencyBalances : null, (r24 & 2) != 0 ? success.isViewCurrenciesBottomSheetVisible : false, (r24 & 4) != 0 ? success.isCurrenciesLoading : false, (r24 & 8) != 0 ? success.balanceUiModel : balanceUiModel, (r24 & 16) != 0 ? success.isRefreshing : false, (r24 & 32) != 0 ? success.taxHoldPolicy : balanceLoaded2.getTaxHoldPolicy(), (r24 & 64) != 0 ? success.autoReloadInfo : null, (r24 & 128) != 0 ? success.nbaRecommendations : nbaRecommendations2, (r24 & 256) != 0 ? success.isNbaDismissed : false, (r24 & 512) != 0 ? success.isNbaLoading : false, (r24 & 1024) != 0 ? success.isAccountRoutingEligible : balanceLoaded2.isAccountRoutingEligible());
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy6, null, 2, null);
                    }
                    if (!(event instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.CurrenciesLoaded)) {
                        if (event instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect.ShowToast(((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage) event).getMessage(), 0L, 2, null));
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.DismissNba.INSTANCE)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                        }
                        copy4 = success.copy((r24 & 1) != 0 ? success.currencyBalances : null, (r24 & 2) != 0 ? success.isViewCurrenciesBottomSheetVisible : false, (r24 & 4) != 0 ? success.isCurrenciesLoading : false, (r24 & 8) != 0 ? success.balanceUiModel : null, (r24 & 16) != 0 ? success.isRefreshing : false, (r24 & 32) != 0 ? success.taxHoldPolicy : null, (r24 & 64) != 0 ? success.autoReloadInfo : null, (r24 & 128) != 0 ? success.nbaRecommendations : null, (r24 & 256) != 0 ? success.isNbaDismissed : true, (r24 & 512) != 0 ? success.isNbaLoading : false, (r24 & 1024) != 0 ? success.isAccountRoutingEligible : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy4, null, 2, null);
                    }
                    copy5 = success.copy((r24 & 1) != 0 ? success.currencyBalances : ((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.CurrenciesLoaded) event).getCurrencies(), (r24 & 2) != 0 ? success.isViewCurrenciesBottomSheetVisible : false, (r24 & 4) != 0 ? success.isCurrenciesLoading : false, (r24 & 8) != 0 ? success.balanceUiModel : null, (r24 & 16) != 0 ? success.isRefreshing : false, (r24 & 32) != 0 ? success.taxHoldPolicy : null, (r24 & 64) != 0 ? success.autoReloadInfo : null, (r24 & 128) != 0 ? success.nbaRecommendations : null, (r24 & 256) != 0 ? success.isNbaDismissed : false, (r24 & 512) != 0 ? success.isNbaLoading : false, (r24 & 1024) != 0 ? success.isAccountRoutingEligible : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy5, null, 2, null);
                }
                copy7 = success.copy((r24 & 1) != 0 ? success.currencyBalances : null, (r24 & 2) != 0 ? success.isViewCurrenciesBottomSheetVisible : false, (r24 & 4) != 0 ? success.isCurrenciesLoading : false, (r24 & 8) != 0 ? success.balanceUiModel : null, (r24 & 16) != 0 ? success.isRefreshing : false, (r24 & 32) != 0 ? success.taxHoldPolicy : null, (r24 & 64) != 0 ? success.autoReloadInfo : null, (r24 & 128) != 0 ? success.nbaRecommendations : null, (r24 & 256) != 0 ? success.isNbaDismissed : false, (r24 & 512) != 0 ? success.isNbaLoading : false, (r24 & 1024) != 0 ? success.isAccountRoutingEligible : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy7, null, 2, null);
            }
            copy8 = success.copy((r24 & 1) != 0 ? success.currencyBalances : null, (r24 & 2) != 0 ? success.isViewCurrenciesBottomSheetVisible : true, (r24 & 4) != 0 ? success.isCurrenciesLoading : false, (r24 & 8) != 0 ? success.balanceUiModel : null, (r24 & 16) != 0 ? success.isRefreshing : false, (r24 & 32) != 0 ? success.taxHoldPolicy : null, (r24 & 64) != 0 ? success.autoReloadInfo : null, (r24 & 128) != 0 ? success.nbaRecommendations : null, (r24 & 256) != 0 ? success.isNbaDismissed : false, (r24 & 512) != 0 ? success.isNbaLoading : false, (r24 & 1024) != 0 ? success.isAccountRoutingEligible : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy8, null, 2, null);
        }
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Loading loading = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Initialize) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Loading.INSTANCE, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded) {
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded balanceLoaded3 = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success(balanceLoaded3.getCurrencies(), false, false, balanceLoaded3.getBalanceUiModel(), false, balanceLoaded3.getTaxHoldPolicy(), balanceLoaded3.getAutoReloadInfo(), balanceLoaded3.getNbaRecommendations(), false, false, balanceLoaded3.isAccountRoutingEligible(), com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error) {
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error error3 = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error(error3.getErrorMessage(), error3.getErrorCode(), error3.getErrorType(), false, error3.getNbaRecommendations(), false, false, error3.isPrepaidError(), 40, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect.ShowToast(((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.ShowToastMessage) event).getMessage(), 0L, 2, null));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }
}
