package com.paypal.oslo.feature.xoom.ui.sendmoney;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiState;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiState;Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SendMoneyReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SendMoneyReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "SendMoneyReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect>> reduce(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState state, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent event) {
        com.paypal.oslo.feature.xoom.ui.sendmoney.YodleeMessage.YodleeData data;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initial) {
            return event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initializing.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initial) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initializing)) {
            if (!(state instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initialized)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initialized initialized = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initialized) state;
            if (event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initializing.INSTANCE, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnSuccessfulTransaction) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initialized, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToHomeDestination.INSTANCE);
            }
            if (!(event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnYodleePostMessage)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initialized, null, 2, null);
            }
            com.paypal.oslo.feature.xoom.ui.sendmoney.YodleeMessage yodleeMessage = (com.paypal.oslo.feature.xoom.ui.sendmoney.YodleeMessage) com.paypal.oslo.feature.xoom.extensions.XoomJsonParser.INSTANCE.fromJson(((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnYodleePostMessage) event).getJsonData(), com.paypal.oslo.feature.xoom.ui.sendmoney.YodleeMessage.INSTANCE.serializer());
            java.lang.String url = (yodleeMessage == null || (data = yodleeMessage.getData()) == null) ? null : data.getUrl();
            if (url == null || !kotlin.text.StringsKt.startsWith(url, "https://", true)) {
                url = null;
            }
            if (url != null) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initialized, new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.OpenExternalUri(url));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initialized, null, 2, null);
        }
        com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initializing initializing = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initializing) state;
        if (event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initializing.INSTANCE, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInitialized) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initialized(((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInitialized) event).getUiModel()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnUnlinkedUserEncountered) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initial.INSTANCE, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToAccountLinking.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnForbiddenUserEncountered) {
            com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnForbiddenUserEncountered onForbiddenUserEncountered = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnForbiddenUserEncountered) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initial.INSTANCE, new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToForbiddenUserScreen(onForbiddenUserEncountered.getTitleRes(), onForbiddenUserEncountered.getDescriptionRes(), onForbiddenUserEncountered.getPrimaryButtonTextRes()));
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInactiveUserEncountered) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initial.INSTANCE, new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInactiveUserScreen(((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInactiveUserEncountered) event).getFailedPaymentInfo()));
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInvalidUrlEncountered) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initial.INSTANCE, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToPreviousScreen.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnNetworkError) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initial.INSTANCE, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToErrorScreen.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.ShowInterstitial) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initial.INSTANCE, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInterstitialScreen.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initializing, event);
    }
}
