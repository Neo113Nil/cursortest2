package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementHubReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public StatementHubReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "StatementHubReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Initial) {
            return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnViewCreated ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading(((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnViewCreated) event).getArgs()), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Initial) state, event);
        }
        if (state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading) state;
            return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatements ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Ready(loading.getArgs(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatements) event).getItems()), null, 2, null) : event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadEmptyStatements ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Empty.INSTANCE, null, 2, null) : kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnLoadStatementsFailed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Error(loading.getArgs()), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Ready)) {
            if (state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Error) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Error) state;
                return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnTryAgainClick ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Loading(error.getArgs()), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Empty)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Empty) state, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Ready) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnItemClick) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubUiEffect.GoToDetails(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementDetailsDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs(((com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnItemClick) event).getUiModel().getRawData().getId(), ready.getArgs().getCreditAccountId(), ready.getArgs().getCpi()))));
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
    }
}
