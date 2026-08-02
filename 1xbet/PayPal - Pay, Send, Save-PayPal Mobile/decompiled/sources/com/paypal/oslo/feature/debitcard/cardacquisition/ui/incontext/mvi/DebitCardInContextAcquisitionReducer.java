package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardInContextAcquisitionReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DebitCardInContextAcquisitionReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DebitCardInContextAcquisitionReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect>> reduce(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent event) {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.Hidden hidden;
        com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserSkippedFlow userSkippedFlow;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.LegalLinkClicked)) {
            if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.AgreeAndContinueClicked) {
                return state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.AgreeAndContinueClicked) event);
            }
            if (!(event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnValidationPassed)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceMissing.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceContingencyDetected.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceSelectionChanged.INSTANCE)) {
                    if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBannerClicked) {
                        return kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBannerClicked) event).getBannerState(), com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.NoFundingSource.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToAddBank.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnReadyToNavigateToConfirmBank) {
                        com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnReadyToNavigateToConfirmBank onReadyToNavigateToConfirmBank = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnReadyToNavigateToConfirmBank) event;
                        if (state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToConfirmBank(onReadyToNavigateToConfirmBank.getConfig()));
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, onReadyToNavigateToConfirmBank);
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBackButtonClicked.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnCloseButtonClicked.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnSkipButtonClicked.INSTANCE)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Initial.INSTANCE)) {
                            if (!(state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting)) {
                                if (!(state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error)) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                                }
                                com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error error = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error) state;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.CheckInContextProvisionEligibility.INSTANCE)) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.AwaitingData.EligibilityStatus.INSTANCE, error.getRetryCount() + 1), null, 2, null);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                            }
                            com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting awaiting = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting) state;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(awaiting.getAwaitingData(), com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.AwaitingData.EligibilityStatus.INSTANCE)) {
                                if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckSucceeded) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked(((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckSucceeded) event).getEligibleDebitCardDetails(), null, 2, null), null, 2, null);
                                }
                                if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckFailed) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.INELIGIBLE, 0, 2, null), null, 2, null);
                                }
                                if (event instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckError) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE, awaiting.getRetryCount()), null, 2, null);
                                }
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(awaiting, event);
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.CheckInContextProvisionEligibility.INSTANCE)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.AwaitingData.EligibilityStatus.INSTANCE, 0, 2, null), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBackButtonClicked.INSTANCE)) {
                        userSkippedFlow = com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserNavigatedBack.INSTANCE;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnCloseButtonClicked.INSTANCE)) {
                        userSkippedFlow = com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserClosedFlow.INSTANCE;
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnSkipButtonClicked.INSTANCE)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                        }
                        userSkippedFlow = com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.UserSkippedFlow.INSTANCE;
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateBackWithCancellation(userSkippedFlow));
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceMissing.INSTANCE)) {
                    hidden = com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.NoFundingSource.INSTANCE;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceContingencyDetected.INSTANCE)) {
                    hidden = com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.FundingSourceContingency.INSTANCE;
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceSelectionChanged.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                    }
                    hidden = com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.Hidden.INSTANCE;
                }
                return state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked.copy$default((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked) state, null, hidden, 1, null), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnValidationPassed onValidationPassed = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnValidationPassed) event;
            if (state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToInContextAcquisitionLoading(onValidationPassed.getFundingSourceId()));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, onValidationPassed);
        }
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.LegalLinkClicked legalLinkClicked = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.LegalLinkClicked) event;
        if (kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Initial.INSTANCE) || (state instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, legalLinkClicked);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiEffect.NavigateToWebView(legalLinkClicked.getUrl()));
    }
}
