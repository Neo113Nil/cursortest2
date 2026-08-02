package com.paypal.oslo.feature.xoom.ui.accountlinking;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiState;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent;", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiState;Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccountLinkingReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AccountLinkingReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AccountLinkingReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect>> reduce(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState state, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState.Initial) {
            return event instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.Initialize ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState.Initializing.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState.Initial) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState.Initializing)) {
            if (!(state instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState.Initialized)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState.Initialized initialized = (com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState.Initialized) state;
            if (event instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnAccountsLinked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initialized, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect.NavigateOnAccountsLinked.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initialized, event);
        }
        com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState.Initializing initializing = (com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState.Initializing) state;
        if (event instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnInitialized) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiState.Initialized(((com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnInitialized) event).getUiModel()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnNetworkError) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initializing, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect.NavigateToErrorScreen.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initializing, event);
    }
}
