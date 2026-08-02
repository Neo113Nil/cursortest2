package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorUiState;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FundingSourceSelectorReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public FundingSourceSelectorReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "FundingSourceSelectorReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect>> reduce(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState state, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent event) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready)) {
                    if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving)) {
                        if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Error)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Error error = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnRetryClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Loading.INSTANCE, null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCancelClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial.INSTANCE, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.Dismiss.INSTANCE);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                    }
                    com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving saving = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving) state;
                    if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceSuccess) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial.INSTANCE, new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.FundingSourceSelected(((com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceSuccess) event).getSelectedFundingSourceId()));
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnSaveFundingSourceFailed) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready(saving.getSelectedFundingSourceId(), saving.getAvailableFundingSources(), saving.getVariant(), false, null, saving.getAvailableFundingSources().getFundingSources().isEmpty(), 24, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCancelClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial.INSTANCE, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.Dismiss.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(saving, event);
                }
                com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready ready = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFundingSourceSelected) {
                    com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFundingSourceSelected onFundingSourceSelected = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFundingSourceSelected) event;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready.copy$default(ready, onFundingSourceSelected.getFundingSource().getId(), null, null, onFundingSourceSelected.getFundingSource().getStatus() != com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.CONTINGENT ? false : ready.getShowContingencyBanner(), null, false, 54, null), null, 2, null);
                }
                if (!(event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnDoneClicked)) {
                    if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCancelClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial.INSTANCE, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.Dismiss.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnLinkBankClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.NavigateToLinkBank.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnLinkCardClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.NavigateToLinkCard.INSTANCE);
                    }
                    if ((event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnBankLinked) || (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCardLinked)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Loading.INSTANCE, null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
                }
                java.lang.String selectedFundingSourceId = ready.getSelectedFundingSourceId();
                if (selectedFundingSourceId == null) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial.INSTANCE, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.Dismiss.INSTANCE);
                }
                if (!ready.getAvailableFundingSources().getFundingSources().isEmpty()) {
                    java.util.Iterator<T> it = ready.getAvailableFundingSources().getFundingSources().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource) obj).getId(), selectedFundingSourceId)) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource) obj;
                    if ((debitCardFundingSource != null ? debitCardFundingSource.getStatus() : null) != com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.CONTINGENT) {
                        if (ready.getVariant() == com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant.SELECT_FUNDING_SOURCE) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial.INSTANCE, new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.FundingSourceSelected(selectedFundingSourceId));
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Saving(selectedFundingSourceId, ready.getAvailableFundingSources(), ready.getVariant()), null, 2, null);
                    }
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready.copy$default(ready, null, null, null, true, null, false, 55, null), null, 2, null);
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Loading loading = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched) {
                com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched onAvailableFundingSourcesFetched = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnAvailableFundingSourcesFetched) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Ready(onAvailableFundingSourcesFetched.getSelectedFundingSourceId(), onAvailableFundingSourcesFetched.getAvailableFundingSources(), onAvailableFundingSourcesFetched.getVariant(), false, onAvailableFundingSourcesFetched.getSecondaryFundingOptions(), onAvailableFundingSourcesFetched.getAvailableFundingSources().getFundingSources().isEmpty(), 8, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnFetchFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Error.INSTANCE, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.OnCancelClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial.INSTANCE, com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.Dismiss.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial initial = (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Initial) state;
        if ((event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromCache) || (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEvent.FetchAvailableFundingSourcesFromRemote)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorUiState.Loading.INSTANCE, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
