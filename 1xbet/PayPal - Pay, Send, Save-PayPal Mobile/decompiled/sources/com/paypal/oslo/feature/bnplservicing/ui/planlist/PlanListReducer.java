package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiState;Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanListReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PlanListReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PlanListReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect>> reduce(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState state, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect>> output$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Success)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Error error = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Error) state;
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.BackPressed) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.NavigateBack.INSTANCE);
                } else {
                    output$default = event instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.LoadData ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
            } else {
                com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Success success = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Success) state;
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.BackPressed) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.NavigateBack.INSTANCE);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.Error) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Error.INSTANCE, null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToPlanDetail) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.NavigateToPlanDetail(((com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToPlanDetail) event).getCreditAccountId()));
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToVirtualCardOverview) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.NavigateToVirtualCardOverview(((com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.NavigateToVirtualCardOverview) event).getCreditAccountId()));
                } else {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                }
            }
        } else {
            com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Loading loading = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.BackPressed) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiEffect.NavigateBack.INSTANCE);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.LoadData) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.DataLoaded) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Success(((com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.DataLoaded) event).getModel()), null, 2, null);
            } else {
                output$default = event instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent.Error ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiState.Error.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            }
        }
        if (output$default instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), false, 4, null);
            return output$default;
        }
        if (output$default instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), true);
            return output$default;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
