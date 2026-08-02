package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentUiState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentUiState;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/mvi/FundingOptionsComponentEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FundingOptionsComponentReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public FundingOptionsComponentReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "FundingOptionsComponentReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiEffect>> reduce(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState state, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Initial.INSTANCE)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Loading.INSTANCE)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Ready)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.ApiError.INSTANCE)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Loading.INSTANCE, null, 2, null);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchBalanceAmountData.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Ready(null, null, 2, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                }
                com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Ready ready = (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Ready) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Loading.INSTANCE, null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchBalanceAmountData.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Ready(null, null, 2, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingSourceChanged) {
                    com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingSourceChanged onFundingSourceChanged = (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingSourceChanged) event;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Ready.copy$default(ready, null, onFundingSourceChanged.getSelectedFundingSourceId(), 1, null), new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiEffect.FundingSourceSelected(onFundingSourceChanged.getSelectedFundingSourceId()));
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetched) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Ready(((com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetched) event).getDebitCardFundingOptions(), null, 2, null), null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.OnFundingOptionsDataFetchFailed.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.ApiError.INSTANCE, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchFundingOptionsData) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Loading.INSTANCE, null, 2, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent.FetchBalanceAmountData.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState.Ready(null, null, 2, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
    }
}
