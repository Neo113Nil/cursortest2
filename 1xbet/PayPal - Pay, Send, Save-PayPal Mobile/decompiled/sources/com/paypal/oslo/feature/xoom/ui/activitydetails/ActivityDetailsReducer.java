package com.paypal.oslo.feature.xoom.ui.activitydetails;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState;Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ActivityDetailsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ActivityDetailsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ActivityDetailsReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect>> reduce(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState state, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initial) {
            return event instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.Initialize ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initializing.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initial) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initializing)) {
            if (!(state instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initialized)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initialized initialized = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initialized) state;
            if (event instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnSendAgainClick) {
                com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnSendAgainClick onSendAgainClick = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnSendAgainClick) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initialized, new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToSendAgainScreen(onSendAgainClick.getUrl(), onSendAgainClick.getRefTag()));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initialized, null, 2, null);
        }
        com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initializing initializing = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initializing) state;
        if (event instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInitialized) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initialized(((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInitialized) event).getUiModel()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnUnlinkedUserEncountered) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initial.INSTANCE, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToAccountLinking.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnForbiddenUserEncountered) {
            com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnForbiddenUserEncountered onForbiddenUserEncountered = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnForbiddenUserEncountered) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initial.INSTANCE, new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToForbiddenUserScreen(onForbiddenUserEncountered.getTitleRes(), onForbiddenUserEncountered.getDescriptionRes(), onForbiddenUserEncountered.getPrimaryButtonTextRes()));
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInactiveUserEncountered) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initial.INSTANCE, new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToInactiveUserScreen(((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInactiveUserEncountered) event).getFailedPaymentInfo()));
        }
        if (event instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnNetworkError) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initial.INSTANCE, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToErrorScreen.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initializing, event);
    }
}
