package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CardActivationReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CardActivationReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CardActivationReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Ready)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Activating)) {
                        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Error)) {
                            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.NotReadyToActivateError)) {
                                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.AvailabilityCheckError)) {
                                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.ActivationNetworkError)) {
                                        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.CardAlreadyActivatedError)) {
                                            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.MaxAttemptsError)) {
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                            com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.MaxAttemptsError maxAttemptsError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.MaxAttemptsError) state;
                                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnBackClicked) {
                                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(maxAttemptsError, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.NavigateBack.INSTANCE);
                                            }
                                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCallCreditCardSupportClicked) {
                                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(maxAttemptsError, new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.DialCreditCardSupport(maxAttemptsError.getSupportPhoneNumber()));
                                            }
                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(maxAttemptsError, event);
                                        }
                                        com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.CardAlreadyActivatedError cardAlreadyActivatedError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.CardAlreadyActivatedError) state;
                                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnBackClicked) {
                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(cardAlreadyActivatedError, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.NavigateBack.INSTANCE);
                                        }
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(cardAlreadyActivatedError, event);
                                    }
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.ActivationNetworkError activationNetworkError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.ActivationNetworkError) state;
                                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnBackClicked) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(activationNetworkError, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.NavigateBack.INSTANCE);
                                    }
                                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnTryAgainClicked) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(activationNetworkError.getActivating(), null, 2, null);
                                    }
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(activationNetworkError, event);
                                }
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.AvailabilityCheckError availabilityCheckError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.AvailabilityCheckError) state;
                                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnBackClicked) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(availabilityCheckError, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.NavigateBack.INSTANCE);
                                }
                                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnTryAgainClicked) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Loading.INSTANCE, null, 2, null);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(availabilityCheckError, event);
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.NotReadyToActivateError notReadyToActivateError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.NotReadyToActivateError) state;
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnBackClicked) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(notReadyToActivateError, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.NavigateBack.INSTANCE);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(notReadyToActivateError, event);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnBackClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.NavigateBack.INSTANCE);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Activating activating = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Activating) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationSucceeded) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(activating, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.ActivateCardSuccess.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationFailed) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.ActivationNetworkError(activating), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationMaxAttemptsError) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.MaxAttemptsError(((com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivationMaxAttemptsError) event).getSupportPhoneNumber()), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnBackClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(activating, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.NavigateBack.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDidntGetCardClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(activating, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.ShowDidntGetCardSheet.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDidntGetCardSheetDismissed) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(activating, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.HideDidntGetCardSheet.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCallCreditCardSupportClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(activating, new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.DialCreditCardSupport(activating.getData().getSupportPhoneNumber()));
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(activating, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Ready) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnBackClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.NavigateBack.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCvvChanged) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Ready.copy$default(ready, null, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCvvChanged) event).getCvv(), false, 0, 9, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnActivateClicked) {
                    if (ready.getCvv().length() < 3) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Ready.copy$default(ready, null, null, true, ready.getClearFocusRequest() + 1, 3, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Activating(ready.getData(), ready.getCvv(), ready.getClearFocusRequest() + 1), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDidntGetCardClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.ShowDidntGetCardSheet.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDidntGetCardSheetDismissed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.HideDidntGetCardSheet.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCallCreditCardSupportClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationUiEffect.DialCreditCardSupport(ready.getData().getSupportPhoneNumber()));
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoaded) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Ready(((com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoaded) event).getData(), null, false, 0, 14, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoadFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Error(((com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnDataLoadFailed) event).getErrorMessage()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnNotReadyToActivateError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.NotReadyToActivateError.INSTANCE, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnAvailabilityCheckRequestFailure) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.AvailabilityCheckError.INSTANCE, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnCardAlreadyActivatedError) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.CardAlreadyActivatedError.INSTANCE, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent.OnViewCreated) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState.Loading.INSTANCE, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
