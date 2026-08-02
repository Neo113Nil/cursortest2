package com.paypal.oslo.feature.pools.ui.pooldetails;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState;Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolDetailsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PoolDetailsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return com.paypal.oslo.feature.pools.constants.PoolsConstants.ComponentNames.POOL_DETAILS_REDUCER;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect>> reduce(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState state, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Initial) {
            return event instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Initialize ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Initial) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Loading)) {
            if (state instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Success) {
                return event instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Initialize ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Success) state, event);
            }
            if (state instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error) {
                return kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.RetryRequested.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error) state, event);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Loading loading = (com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.PoolDetailsLoaded) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Success(((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.PoolDetailsLoaded) event).getPoolDetail()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Error) {
            com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Error error = (com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Error) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error(error.getTitleRes(), error.getDescriptionRes(), error.getPoolId()), new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect.NavigateToError(new com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs(null, error.getTitleRes(), error.getDescriptionRes(), error.getPrimaryButtonRes(), 1, null)));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }
}
