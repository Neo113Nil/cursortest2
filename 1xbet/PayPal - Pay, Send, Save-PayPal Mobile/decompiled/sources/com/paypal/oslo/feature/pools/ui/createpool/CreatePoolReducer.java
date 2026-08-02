package com.paypal.oslo.feature.pools.ui.createpool;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState;Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolIntent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreatePoolReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CreatePoolReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return com.paypal.oslo.feature.pools.constants.PoolsConstants.ComponentNames.CREATE_POOL_REDUCER;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect>> reduce(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState state, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent event) {
        java.lang.String targetDate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing)) {
            if (!(state instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Loading)) {
                if (state instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Success) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                }
                if (!(state instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Error error = (com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Error) state;
                return event instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DismissError ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error.getFormState(), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Loading loading = (com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationSucceeded) {
                com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationSucceeded creationSucceeded = (com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationSucceeded) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Success(creationSucceeded.getPool()), new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.NavigateToPoolDetails(creationSucceeded.getPool().getId(), creationSucceeded.getPool().getCreator().getId()));
            }
            if (event instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationFailed) {
                com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationFailed creationFailed = (com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.CreationFailed) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Error(creationFailed.getTitleRes(), creationFailed.getDescriptionRes(), loading.getFormState()), new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.ShowErrorSnackbar(creationFailed.getTitleRes(), creationFailed.getDescriptionRes()));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing editing = (com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing) state;
        if (event instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.NameChanged) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing.copy$default(editing, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.NameChanged) event).getPoolName(), null, null, null, null, 30, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DescriptionChanged) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing.copy$default(editing, null, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.DescriptionChanged) event).getDescription(), null, null, null, 29, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.BackgroundImageUrlChanged) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing.copy$default(editing, null, null, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.BackgroundImageUrlChanged) event).getUrl(), null, null, 27, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetAmountChanged) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing.copy$default(editing, null, null, null, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetAmountChanged) event).getAmount(), null, 23, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetDateChanged) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing.copy$default(editing, null, null, null, null, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.TargetDateChanged) event).getDate(), 15, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolIntent.SubmitClicked) {
            if (!kotlin.text.StringsKt.isBlank(editing.getPoolName()) && !kotlin.text.StringsKt.isBlank(editing.getPoolDescription()) && (targetDate = editing.getTargetDate()) != null && !kotlin.text.StringsKt.isBlank(targetDate)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Loading(editing), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(editing, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(editing, event);
    }
}
