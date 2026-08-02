package com.paypal.oslo.feature.home.ui.accountsnapshot.mvi;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001bB\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00120\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiEffect;", "Lcom/paypal/oslo/feature/home/ui/navigation/HomeNavigationRouter;", "navigationRouter", "Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;", "loadingSectionProvider", "<init>", "(Lcom/paypal/oslo/feature/home/ui/navigation/HomeNavigationRouter;Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiState;Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/home/ui/navigation/HomeNavigationRouter;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountSnapshotReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public AccountSnapshotReducer(com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter homeNavigationRouter, com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider loadingSectionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeNavigationRouter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingSectionProvider, "");
        this.Camera2StreamConfigurationMap = homeNavigationRouter;
        this.getHighSpeedVideoFpsRangesFor = loadingSectionProvider;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AccountSnapshotReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect>> reduce(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState state, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success)) {
                if (!(state instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error error = (com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.Retry.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading((com.paypal.oslo.feature.home.domain.model.Section) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.getHighSpeedVideoFpsRangesFor.createLoadingSections("wallet_balances_section", com.paypal.oslo.feature.home.domain.model.SectionTypes.ACCOUNT_SNAPSHOT))), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success success = (com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success) state;
            if (event instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ItemClicked) {
                com.paypal.oslo.feature.home.ui.navigation.HomeNavigationEvent routeToCollectionItem = this.Camera2StreamConfigurationMap.routeToCollectionItem(com.paypal.oslo.feature.home.ui.navigation.NavigationParams.INSTANCE.fromAccountSnapshot(((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ItemClicked) event).getItem()));
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, routeToCollectionItem != null ? new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect.Navigate(routeToCollectionItem.getDestination()) : null);
            }
            if (event instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoaded) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success(((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoaded) event).getSection()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
        }
        com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading loading = (com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Loading) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.LoadContent.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoaded) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Success(((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoaded) event).getSection()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoadFailed) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiState.Error(((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoadFailed) event).getErrorSection()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }
}
