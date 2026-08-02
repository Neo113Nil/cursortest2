package com.paypal.oslo.feature.pools.ui.poolslist;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListState;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListState;Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolsListReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PoolsListReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return com.paypal.oslo.feature.pools.constants.PoolsConstants.ComponentNames.POOLS_LIST_REDUCER;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect>> reduce(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState state, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState.Success success = (com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState.Success) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.Initialize.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.NavigateToPoolDetails) {
                com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.NavigateToPoolDetails navigateToPoolDetails = (com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.NavigateToPoolDetails) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToPoolDetails(navigateToPoolDetails.getPoolId(), navigateToPoolDetails.getPoolCreatorAccountId(), navigateToPoolDetails.getUserRole()));
            }
            if (event instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.OnLoadError) {
                com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.OnLoadError onLoadError = (com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.OnLoadError) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToError(new com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs(null, onLoadError.getTitleRes(), onLoadError.getDescriptionRes(), onLoadError.getPrimaryButtonRes(), 1, null)));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
        }
        com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState.Initial initial = (com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState.Initial) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.Initialize.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListState.Success.INSTANCE, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
