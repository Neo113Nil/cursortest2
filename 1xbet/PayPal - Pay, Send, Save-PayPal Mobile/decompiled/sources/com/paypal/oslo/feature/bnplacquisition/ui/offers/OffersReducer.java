package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect;", "<init>", "()V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;)Larrow/core/Either;", "", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OffersReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public OffersReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState state, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect>> output;
        java.lang.Object obj;
        com.paypal.oslo.core.commonui.utils.RefText continueButtonText;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel copy;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel copy2;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel copy3;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel copy4;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel copy5;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel copy6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error)) {
                        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline decline = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline) state;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.DeclineClosePressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(decline, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.CloseAcquisition.INSTANCE);
                        } else {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(decline, event);
                        }
                    } else {
                        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ErrorBackPressed) {
                            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel = error.getUiModel();
                            if (uiModel == null || (output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success(uiModel, false, 2, null), null, 2, null)) == null) {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Initial.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateBack.INSTANCE);
                            }
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ClosePressed) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.ShowExitConfirmationModal.INSTANCE);
                        } else {
                            output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ConfirmExitPressed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                        }
                    }
                } else {
                    com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success) state;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Pressed.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                    } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Valid)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Invalid.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success.copy$default(success, null, true, 1, null), null, 2, null);
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.UpdateReviewTermsSuccess) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToReviewTerms(((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.UpdateReviewTermsSuccess) event).getReviewTermsSuccess()));
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.ShowExitConfirmationModal.INSTANCE);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.EmoneyInfoPressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.ShowEmoneyInfoSheet.INSTANCE);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ConfirmExitPressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.CloseAcquisition.INSTANCE);
                        } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                        } else {
                            java.util.Iterator<T> it = success.getUiModel().getOffers().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem) obj).getId(), ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected) event).getOfferId())) {
                                    break;
                                }
                            }
                            com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem offerItem = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem) obj;
                            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel uiModel2 = success.getUiModel();
                            java.lang.String offerId = ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected) event).getOfferId();
                            if (offerItem == null || (continueButtonText = offerItem.getContinueButtonText()) == null) {
                                continueButtonText = success.getUiModel().getContinueButtonText();
                            }
                            copy = uiModel2.copy((r32 & 1) != 0 ? uiModel2.amount : null, (r32 & 2) != 0 ? uiModel2.rawTransactionAmount : null, (r32 & 4) != 0 ? uiModel2.offers : null, (r32 & 8) != 0 ? uiModel2.selectedOfferId : offerId, (r32 & 16) != 0 ? uiModel2.headerTitle : null, (r32 & 32) != 0 ? uiModel2.headerSubtitle : null, (r32 & 64) != 0 ? uiModel2.footer : null, (r32 & 128) != 0 ? uiModel2.continueButtonText : continueButtonText, (r32 & 256) != 0 ? uiModel2.choosePlanError : null, (r32 & 512) != 0 ? uiModel2.apiLoadSuccessful : false, (r32 & 1024) != 0 ? uiModel2.showSubtitleInfoButton : false, (r32 & 2048) != 0 ? uiModel2.subtitleButtonText : null, (r32 & 4096) != 0 ? uiModel2.exitConfirmationContent : null, (r32 & 8192) != 0 ? uiModel2.emoneyModalContent : null, (r32 & 16384) != 0 ? uiModel2.toolBarContent : null);
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy, false), null, 2, null);
                        }
                    } else {
                        copy2 = r6.copy((r32 & 1) != 0 ? r6.amount : null, (r32 & 2) != 0 ? r6.rawTransactionAmount : null, (r32 & 4) != 0 ? r6.offers : null, (r32 & 8) != 0 ? r6.selectedOfferId : null, (r32 & 16) != 0 ? r6.headerTitle : null, (r32 & 32) != 0 ? r6.headerSubtitle : null, (r32 & 64) != 0 ? r6.footer : null, (r32 & 128) != 0 ? r6.continueButtonText : null, (r32 & 256) != 0 ? r6.choosePlanError : null, (r32 & 512) != 0 ? r6.apiLoadSuccessful : false, (r32 & 1024) != 0 ? r6.showSubtitleInfoButton : false, (r32 & 2048) != 0 ? r6.subtitleButtonText : null, (r32 & 4096) != 0 ? r6.exitConfirmationContent : null, (r32 & 8192) != 0 ? r6.emoneyModalContent : null, (r32 & 16384) != 0 ? success.getUiModel().toolBarContent : null);
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading(copy2), null, 2, null);
                    }
                }
            } else {
                com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading loading = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading) state;
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Initial.INSTANCE, null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.SwitchToSuccess) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.SwitchToSuccess) event).getUiModel(), false, 2, null), null, 2, null);
                } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.UpdateReviewTermsSuccess)) {
                    if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.CreateCreditSuccess)) {
                        if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.FetchRepaymentsSuccess)) {
                            if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.NavigateToAdditionalInfo)) {
                                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError) {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Error(((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError) event).getErrorContent(), loading.getUiModel()), null, 2, null);
                                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApplicationDeclined) {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Decline(((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApplicationDeclined) event).getDeclineContent()), null, 2, null);
                                } else {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                                }
                            } else {
                                copy3 = r6.copy((r32 & 1) != 0 ? r6.amount : null, (r32 & 2) != 0 ? r6.rawTransactionAmount : null, (r32 & 4) != 0 ? r6.offers : null, (r32 & 8) != 0 ? r6.selectedOfferId : null, (r32 & 16) != 0 ? r6.headerTitle : null, (r32 & 32) != 0 ? r6.headerSubtitle : null, (r32 & 64) != 0 ? r6.footer : null, (r32 & 128) != 0 ? r6.continueButtonText : null, (r32 & 256) != 0 ? r6.choosePlanError : null, (r32 & 512) != 0 ? r6.apiLoadSuccessful : true, (r32 & 1024) != 0 ? r6.showSubtitleInfoButton : false, (r32 & 2048) != 0 ? r6.subtitleButtonText : null, (r32 & 4096) != 0 ? r6.exitConfirmationContent : null, (r32 & 8192) != 0 ? r6.emoneyModalContent : null, (r32 & 16384) != 0 ? loading.getUiModel().toolBarContent : null);
                                com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Loading copy7 = loading.copy(copy3);
                                com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.NavigateToAdditionalInfo navigateToAdditionalInfo = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.NavigateToAdditionalInfo) event;
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy7, new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToAdditionalInfo(navigateToAdditionalInfo.getFormattedAmount(), navigateToAdditionalInfo.getSelectedOfferId()));
                            }
                        } else {
                            copy4 = r6.copy((r32 & 1) != 0 ? r6.amount : null, (r32 & 2) != 0 ? r6.rawTransactionAmount : null, (r32 & 4) != 0 ? r6.offers : null, (r32 & 8) != 0 ? r6.selectedOfferId : null, (r32 & 16) != 0 ? r6.headerTitle : null, (r32 & 32) != 0 ? r6.headerSubtitle : null, (r32 & 64) != 0 ? r6.footer : null, (r32 & 128) != 0 ? r6.continueButtonText : null, (r32 & 256) != 0 ? r6.choosePlanError : null, (r32 & 512) != 0 ? r6.apiLoadSuccessful : true, (r32 & 1024) != 0 ? r6.showSubtitleInfoButton : false, (r32 & 2048) != 0 ? r6.subtitleButtonText : null, (r32 & 4096) != 0 ? r6.exitConfirmationContent : null, (r32 & 8192) != 0 ? r6.emoneyModalContent : null, (r32 & 16384) != 0 ? loading.getUiModel().toolBarContent : null);
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading.copy(copy4), new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToRepaymentSelection(((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.FetchRepaymentsSuccess) event).getData()));
                        }
                    } else {
                        copy5 = r6.copy((r32 & 1) != 0 ? r6.amount : null, (r32 & 2) != 0 ? r6.rawTransactionAmount : null, (r32 & 4) != 0 ? r6.offers : null, (r32 & 8) != 0 ? r6.selectedOfferId : null, (r32 & 16) != 0 ? r6.headerTitle : null, (r32 & 32) != 0 ? r6.headerSubtitle : null, (r32 & 64) != 0 ? r6.footer : null, (r32 & 128) != 0 ? r6.continueButtonText : null, (r32 & 256) != 0 ? r6.choosePlanError : null, (r32 & 512) != 0 ? r6.apiLoadSuccessful : true, (r32 & 1024) != 0 ? r6.showSubtitleInfoButton : false, (r32 & 2048) != 0 ? r6.subtitleButtonText : null, (r32 & 4096) != 0 ? r6.exitConfirmationContent : null, (r32 & 8192) != 0 ? r6.emoneyModalContent : null, (r32 & 16384) != 0 ? loading.getUiModel().toolBarContent : null);
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading.copy(copy5), new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToPersonalInfo(((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.CreateCreditSuccess) event).getData()));
                    }
                } else {
                    copy6 = r6.copy((r32 & 1) != 0 ? r6.amount : null, (r32 & 2) != 0 ? r6.rawTransactionAmount : null, (r32 & 4) != 0 ? r6.offers : null, (r32 & 8) != 0 ? r6.selectedOfferId : null, (r32 & 16) != 0 ? r6.headerTitle : null, (r32 & 32) != 0 ? r6.headerSubtitle : null, (r32 & 64) != 0 ? r6.footer : null, (r32 & 128) != 0 ? r6.continueButtonText : null, (r32 & 256) != 0 ? r6.choosePlanError : null, (r32 & 512) != 0 ? r6.apiLoadSuccessful : true, (r32 & 1024) != 0 ? r6.showSubtitleInfoButton : false, (r32 & 2048) != 0 ? r6.subtitleButtonText : null, (r32 & 4096) != 0 ? r6.exitConfirmationContent : null, (r32 & 8192) != 0 ? r6.emoneyModalContent : null, (r32 & 16384) != 0 ? loading.getUiModel().toolBarContent : null);
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading.copy(copy6), new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToReviewTerms(((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.UpdateReviewTermsSuccess) event).getReviewTermsSuccess()));
                }
            }
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Initial initial = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Initial) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
            } else {
                output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Success ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Success) event).getUiModel(), false, 2, null), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), output.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), output.isLeft());
        return output;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "OffersReducer";
    }
}
