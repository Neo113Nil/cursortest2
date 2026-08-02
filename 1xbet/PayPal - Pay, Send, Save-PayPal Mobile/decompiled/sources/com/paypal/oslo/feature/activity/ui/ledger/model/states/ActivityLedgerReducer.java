package com.paypal.oslo.feature.activity.ui.ledger.model.states;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;)Larrow/core/Either;", "p0", "p1", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ActivityLedgerReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ActivityLedgerReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect>> reduce(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState state, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState)) {
            if (!(state instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState ledgerFilterState = (com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState) state;
            if (event instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.RenderLedgerPageEvent) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ledgerFilterState, new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.ReLoadInitialLedgerScreen(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.RenderLedgerPageEvent) event).getFilterType()));
            }
            if (event instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.ClearFilter) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState(null, 1, null), new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterCleared(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.ClearFilter) event).getFilterType()));
            }
            if (event instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ledgerFilterState, new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandlePackageTrackingLinkEmailPressed(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent) event).getDestinationKey()));
            }
            return getHighSpeedVideoFpsRanges(ledgerFilterState, event);
        }
        com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState ledgerInitialState = (com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState) state;
        if (event instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.RenderLedgerPageEvent) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ledgerInitialState, new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.ReLoadInitialLedgerScreen(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.RenderLedgerPageEvent) event).getFilterType()));
        }
        if (event instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ledgerInitialState, new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandlePackageTrackingLinkEmailPressed(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent) event).getDestinationKey()));
        }
        return getHighSpeedVideoFpsRanges(ledgerInitialState, event);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState p0, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent p1) {
        if (p1 instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTilePressedEvent) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToActivityDetailScreen(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTilePressedEvent) p1).getActivityTransactionModel()));
        }
        if (p1 instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTileActionPressedEvent) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleActivityTransactionPrimaryAction(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTileActionPressedEvent) p1).getPrimaryActionModel()));
        }
        if (p1 instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.SearchActionClickedEvent) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToSearchScreen.INSTANCE);
        }
        if (p1 instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PackageTrackPressedEvent) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPackageDetailScreen(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PackageTrackPressedEvent) p1).getDestinationKey()));
        }
        if (p1 instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PromotionalRewardPressedEvent) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPromotionalRewardScreen(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PromotionalRewardPressedEvent) p1).getDestinationKey()));
        }
        if (p1 instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.XoomTransactionTileActionPressedEvent) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleXoomActivityTransactionTilePressed(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.XoomTransactionTileActionPressedEvent) p1).getDestinationKey()));
        }
        if (p1 instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.FilterApplied) {
            com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.FilterApplied filterApplied = (com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.FilterApplied) p1;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState(filterApplied.getFilterType()), new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterApplied(filterApplied.getFilterType()));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(p0, p1);
    }
}
