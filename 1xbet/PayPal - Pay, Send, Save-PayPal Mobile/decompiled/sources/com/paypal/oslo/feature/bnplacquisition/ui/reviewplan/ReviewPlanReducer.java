package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewPlanReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ReviewPlanReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ReviewPlanReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState state, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect>> unexpectedEvent;
        boolean isTapToPayPayMode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.TransitioningLoading)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Error)) {
                        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Decline)) {
                            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.NFCProvisioningError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.NFCProvisioningError nFCProvisioningError = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.NFCProvisioningError) state;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningRetryPressed.INSTANCE)) {
                                unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.TransitioningLoading(nFCProvisioningError.getUiModel()), null, 2, null);
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningGoToMyCardPressed.INSTANCE)) {
                                unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(nFCProvisioningError, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.NavigateToVirtualCardOverview.INSTANCE);
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningErrorClosed.INSTANCE)) {
                                unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(nFCProvisioningError, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.CloseAcquisition.INSTANCE);
                            } else {
                                unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(nFCProvisioningError, event);
                            }
                        } else {
                            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Decline decline = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Decline) state;
                            unexpectedEvent = kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ClosePressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(decline, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(decline, event);
                        }
                    } else {
                        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ErrorBackPressed) {
                            unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success(error.getData()), null, 2, null);
                        } else {
                            unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                        }
                    }
                } else {
                    com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success) state;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ApplyButtonPressed.INSTANCE)) {
                        unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.TransitioningLoading(success.getUiModel()), null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.AgreementLinkPressed) {
                        unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.OpenUrl(((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.AgreementLinkPressed) event).getUrl()));
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ClosePressed.INSTANCE)) {
                        unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.ShowExitConfirmationModal.INSTANCE);
                    } else {
                        unexpectedEvent = kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ConfirmExitPressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                    }
                }
            } else {
                com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.TransitioningLoading transitioningLoading = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.TransitioningLoading) state;
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationSuccess) {
                    unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(transitioningLoading, new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.SaveSubmitApplicationData(((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationSuccess) event).getSubmitApplication()));
                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationError) {
                    unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Error(((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationError) event).getErrorContent(), transitioningLoading.getUiModel()), null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationDecline) {
                    unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Decline(((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationDecline) event).getDeclineContent()), null, 2, null);
                } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCompleted)) {
                    boolean z = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCancelled;
                    if (z || (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationFailed)) {
                        if (z) {
                            isTapToPayPayMode = ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCancelled) event).isTapToPayPayMode();
                        } else {
                            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationFailed) {
                                isTapToPayPayMode = ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationFailed) event).isTapToPayPayMode();
                            }
                            unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(transitioningLoading, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.CloseAcquisition.INSTANCE);
                        }
                        if (isTapToPayPayMode) {
                            unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(transitioningLoading, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.HandleTokenizationTapToPayMode.INSTANCE);
                        }
                        unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(transitioningLoading, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.CloseAcquisition.INSTANCE);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningRemoveCardsSuccess.INSTANCE)) {
                        unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(transitioningLoading, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.NavigateToSetupFlow.INSTANCE);
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningUpdateError) {
                        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningUpdateError nFCProvisioningUpdateError = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningUpdateError) event;
                        unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.NFCProvisioningError(nFCProvisioningUpdateError.getErrorContent(), nFCProvisioningUpdateError.getErrorType(), nFCProvisioningUpdateError.getRetryCount(), transitioningLoading.getUiModel()), null, 2, null);
                    } else {
                        unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(transitioningLoading, event);
                    }
                } else if (((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCompleted) event).isTapToPayPayMode()) {
                    unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(transitioningLoading, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.HandleTokenizationTapToPayMode.INSTANCE);
                } else {
                    unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output(transitioningLoading, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.NavigateToVirtualCardOverview.INSTANCE);
                }
            }
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Initial initial = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Initial) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.LoadDomainData) {
                unexpectedEvent = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
            } else {
                unexpectedEvent = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.Success ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.Success) event).getUiModel()), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), unexpectedEvent.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), unexpectedEvent.isLeft());
        return unexpectedEvent;
    }
}
