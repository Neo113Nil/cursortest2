package com.paypal.oslo.feature.settings.legal.ui.mvi.reducer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mvi/reducer/LegalReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState;Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegalReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public LegalReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel.LEGAL_REDUCER;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEffect>> reduce(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState state, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent)) {
            if (!(event instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.SystemEvent)) {
                if (!(event instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent dataEvent = (com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent) event;
                if (!(dataEvent instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent.LegalItemsLoaded)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent.LegalItemsLoaded legalItemsLoaded = (com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent.LegalItemsLoaded) dataEvent;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state.copy(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Ready.INSTANCE, legalItemsLoaded.getItems(), legalItemsLoaded.getShowFooter()), null, 2, null);
            }
            if (!(((com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.SystemEvent) event) instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.SystemEvent.LoadLegalItems)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.copy$default(state, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState.ScreenState.Loading.INSTANCE, null, false, 6, null), null, 2, null);
        }
        com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent userIntent = (com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent) event;
        if (!(userIntent instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnBackClicked)) {
            if (!(userIntent instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLinkClicked)) {
                if (!(userIntent instanceof com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.UserIntent.OnLegalHubClicked)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEffect.NavigateBack.INSTANCE);
    }
}
