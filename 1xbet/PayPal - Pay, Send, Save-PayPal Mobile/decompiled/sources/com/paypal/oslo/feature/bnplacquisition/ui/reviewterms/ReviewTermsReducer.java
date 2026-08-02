package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r0\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsContentProvider;", "contentProvider", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsContentProvider;)V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;)Larrow/core/Either;", "", "getName", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsContentProvider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewTermsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect> {
    public static final int $stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ReviewTermsReducer(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsContentProvider reviewTermsContentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsContentProvider, "");
        this.getHighSpeedVideoFpsRanges = reviewTermsContentProvider;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState state, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect>> output;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel copy;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel copy2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Error)) {
                        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Decline)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Decline decline = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Decline) state;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DeclineClosePressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(decline, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.CloseAcquisition.INSTANCE);
                        } else {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(decline, event);
                        }
                    } else {
                        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ErrorBackPressed) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success(error.getData(), error.isAgreed(), false, 4, null), null, 2, null);
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ClosePressed) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowExitConfirmationModal.INSTANCE);
                        } else {
                            output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ConfirmExitPressed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                        }
                    }
                } else {
                    com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success) state;
                    if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.AgreementClicked) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success.copy$default(success, null, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.AgreementClicked) event).isChecked(), false, 1, null), null, 2, null);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DownloadDocumentPressed.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowDocumentsHalfSheet(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsUiModelKt.toDocumentsSheetUiModel(success.getData().getDocuments())));
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DisclaimerLinkPressed) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.OpenContentViewer) {
                        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.OpenContentViewer openContentViewer = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.OpenContentViewer) event;
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.OpenUrl(openContentViewer.getUrl(), openContentViewer.getHtml(), openContentViewer.getDownloadStaticUrl(), openContentViewer.getDownloadRelativePath(), openContentViewer.getDownloadFileName()));
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Pressed.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                    } else if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Valid.INSTANCE)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Invalid.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success.copy$default(success, null, false, true, 3, null), null, 2, null);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.NavigateBack.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Initial.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateBack.INSTANCE);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowExitConfirmationModal.INSTANCE);
                        } else {
                            output = kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ConfirmExitPressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                        }
                    } else {
                        copy = r7.copy((r28 & 1) != 0 ? r7.header : null, (r28 & 2) != 0 ? r7.document : null, (r28 & 4) != 0 ? r7.consent : null, (r28 & 8) != 0 ? r7.continueButton : null, (r28 & 16) != 0 ? r7.documents : null, (r28 & 32) != 0 ? r7.apiLoadSuccessful : false, (r28 & 64) != 0 ? r7.exitConfirmationContent : null, (r28 & 128) != 0 ? r7.toolBarContent : null, (r28 & 256) != 0 ? r7.noPdfViewerMessage : null, (r28 & 512) != 0 ? r7.documentsSheetTitle : null, (r28 & 1024) != 0 ? r7.documentsSheetDownloadError : null, (r28 & 2048) != 0 ? r7.documentsSheetEmptyState : null, (r28 & 4096) != 0 ? success.getData().documentsSheetCloseButton : null);
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading(copy, success.isAgreed()), null, 2, null);
                    }
                }
            } else {
                com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading loading = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading) state;
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.LoadDomainModel) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Initial.INSTANCE, null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.SwitchToSuccess) {
                    com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.SwitchToSuccess switchToSuccess = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.SwitchToSuccess) event;
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success(switchToSuccess.getData(), switchToSuccess.isAgreed(), false, 4, null), null, 2, null);
                } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateRepaymentsSuccess)) {
                    if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateError) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Error(((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateError) event).getErrorContent(), loading.getData(), loading.isAgreed()), null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ApplicationDeclined) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Decline(((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ApplicationDeclined) event).getDeclineContent()), null, 2, null);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.NavigateBack.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Initial.INSTANCE, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateBack.INSTANCE);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ClosePressed.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowExitConfirmationModal.INSTANCE);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ConfirmExitPressed.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.CloseAcquisition.INSTANCE);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DownloadDocumentPressed.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowDocumentsHalfSheet(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsUiModelKt.toDocumentsSheetUiModel(loading.getData().getDocuments())));
                    } else {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                    }
                } else {
                    copy2 = r6.copy((r28 & 1) != 0 ? r6.header : null, (r28 & 2) != 0 ? r6.document : null, (r28 & 4) != 0 ? r6.consent : null, (r28 & 8) != 0 ? r6.continueButton : null, (r28 & 16) != 0 ? r6.documents : null, (r28 & 32) != 0 ? r6.apiLoadSuccessful : true, (r28 & 64) != 0 ? r6.exitConfirmationContent : null, (r28 & 128) != 0 ? r6.toolBarContent : null, (r28 & 256) != 0 ? r6.noPdfViewerMessage : null, (r28 & 512) != 0 ? r6.documentsSheetTitle : null, (r28 & 1024) != 0 ? r6.documentsSheetDownloadError : null, (r28 & 2048) != 0 ? r6.documentsSheetEmptyState : null, (r28 & 4096) != 0 ? loading.getData().documentsSheetCloseButton : null);
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Loading.copy$default(loading, copy2, false, 2, null), new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateToRepaymentSelection(((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateRepaymentsSuccess) event).getData()));
                }
            }
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Initial initial = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Initial) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.LoadDomainModel) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DomainModelLoaded) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DomainModelLoaded) event).getUiModel(), false, false, 4, null), new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowApprovedToast(this.getHighSpeedVideoFpsRanges.getApprovedText()));
            } else {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), output.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), output.isLeft());
        return output;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ReviewTermsReducer";
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
