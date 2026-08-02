package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ManageCardReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ManageCardReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ManageCardReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent event) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo copy;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo copy2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo copy3;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo copy4;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo copy5;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo copy6;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo copy7;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo copy8;
        java.lang.String nationalNumber;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.StartPaperlessDeliveryBottomSheet startPaperlessDeliveryBottomSheet = null;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToPushToWallet navigateToPushToWallet = null;
        r5 = null;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowUserInfoBottomSheet showUserInfoBottomSheet = null;
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus)) {
                        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Error)) {
                            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel)) {
                                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchingCardDetails)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchingCardDetails fetchingCardDetails = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchingCardDetails) state;
                                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCardDetailsReceived) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready(fetchingCardDetails.getReadyInfo()), new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsBottomSheet(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCardDetailsReceived) event).getCardDetails()));
                                }
                                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnErrorFetchingCardDetails) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready(fetchingCardDetails.getReadyInfo()), com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowCardDetailsErrorBottomSheet.INSTANCE);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(fetchingCardDetails, event);
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel initializingUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel) state;
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized) {
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized onUiModelInitialized = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUiModelInitialized) event;
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo(onUiModelInitialized.getManageCardDetailUiModel(), onUiModelInitialized.getCpi(), onUiModelInitialized.getManagementSections(), onUiModelInitialized.getCreditAccountId(), onUiModelInitialized.getCreditInstrumentId(), false, onUiModelInitialized.getESignConsentUrl(), onUiModelInitialized.getPdfUrl(), null, false, null, null, 3872, null)), null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initializingUiModel, event);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Error) state;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryUpdateStatementDelivery.INSTANCE)) {
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.ReadyInfo readyInfo = error.getReadyInfo();
                            if (readyInfo == null || error.getError() == null) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                            }
                            copy = readyInfo.copy((r26 & 1) != 0 ? readyInfo.manageCardDetailUiModel : null, (r26 & 2) != 0 ? readyInfo.cpi : null, (r26 & 4) != 0 ? readyInfo.managementSections : null, (r26 & 8) != 0 ? readyInfo.creditAccountId : null, (r26 & 16) != 0 ? readyInfo.creditInstrumentId : null, (r26 & 32) != 0 ? readyInfo.cardLockStatusChanged : false, (r26 & 64) != 0 ? readyInfo.eSignConsentUrl : null, (r26 & 128) != 0 ? readyInfo.benefitsUrl : null, (r26 & 256) != 0 ? readyInfo.lastFailedStatementDeliveryEnrollment : null, (r26 & 512) != 0 ? readyInfo.isUpdatingStatementDelivery : true, (r26 & 1024) != 0 ? readyInfo.enrollingInPaper : java.lang.Boolean.valueOf(error.getEnrollingInPaper()), (r26 & 2048) != 0 ? readyInfo.statementDeliveryError : null);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready(copy), null, 2, null);
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryClicked) event).getCpi()), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus togglingCardLockStatus = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusSuccess) {
                        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> managementSections = togglingCardLockStatus.getReadyInfo().getManagementSections();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(managementSections, 10));
                        for (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard lockCard : managementSections) {
                            if (lockCard instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard) {
                                lockCard = com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard.copy$default((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard) lockCard, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusSuccess) event).getNewLockState().isLocked(), null, 2, null);
                            }
                            arrayList.add(lockCard);
                        }
                        copy2 = r7.copy((r26 & 1) != 0 ? r7.manageCardDetailUiModel : null, (r26 & 2) != 0 ? r7.cpi : null, (r26 & 4) != 0 ? r7.managementSections : arrayList, (r26 & 8) != 0 ? r7.creditAccountId : null, (r26 & 16) != 0 ? r7.creditInstrumentId : null, (r26 & 32) != 0 ? r7.cardLockStatusChanged : true, (r26 & 64) != 0 ? r7.eSignConsentUrl : null, (r26 & 128) != 0 ? r7.benefitsUrl : null, (r26 & 256) != 0 ? r7.lastFailedStatementDeliveryEnrollment : null, (r26 & 512) != 0 ? r7.isUpdatingStatementDelivery : false, (r26 & 1024) != 0 ? r7.enrollingInPaper : null, (r26 & 2048) != 0 ? togglingCardLockStatus.getReadyInfo().statementDeliveryError : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready(copy2), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure) {
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready(togglingCardLockStatus.getReadyInfo());
                        boolean isLocked = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnToggleCardLockStatusFailure) event).getTargetLockState().isLocked();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber contactusPhoneNumber = togglingCardLockStatus.getReadyInfo().getManageCardDetailUiModel().getContactusPhoneNumber();
                        java.lang.String nationalNumber2 = contactusPhoneNumber != null ? contactusPhoneNumber.getNationalNumber() : null;
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowLockCardErrorBottomSheet(isLocked, nationalNumber2 != null ? nationalNumber2 : ""));
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(togglingCardLockStatus, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready ready2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CallCreditCardSupport) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.LaunchPhoneDialer(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CallCreditCardSupport) event).getPhoneNumber()));
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.CloseUserInfoBottomSheet.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready2.copy(ready2.getReadyInfo()), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ActionItemClicked) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ActionItemClicked actionItemClicked = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ActionItemClicked) event;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel action = actionItemClicked.getAction();
                    if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ContactUs) {
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready ready3 = ready2;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber contactusPhoneNumber2 = ready2.getReadyInfo().getManageCardDetailUiModel().getContactusPhoneNumber();
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready3, contactusPhoneNumber2 != null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToContactUsScreen(contactusPhoneNumber2) : null);
                    }
                    if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.StatementDelivery) {
                        if (!((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.StatementDelivery) actionItemClicked.getAction()).isErrorState()) {
                            startPaperlessDeliveryBottomSheet = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.StatementDelivery) actionItemClicked.getAction()).getHasPaperStatements() ? com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.StopPaperlessDeliveryBottomSheet.INSTANCE : com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.StartPaperlessDeliveryBottomSheet.INSTANCE;
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, startPaperlessDeliveryBottomSheet);
                    }
                    if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ReportLostOrStolen) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ReportLostOrStolenBottomSheet(ready2.getReadyInfo().getManageCardDetailUiModel().getLostStolenPhoneNumber()));
                    }
                    if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Autopay) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Autopay) actionItemClicked.getAction()).getContextualAlert() == null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToAutopay.INSTANCE : null);
                    }
                    if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Benefits) {
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready ready4 = ready2;
                        java.lang.String benefitsUrl = ready2.getReadyInfo().getBenefitsUrl();
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready4, new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView(benefitsUrl != null ? benefitsUrl : "", false));
                    }
                    if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.SetAsPreferred) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToSetAsPreferred.INSTANCE);
                    }
                    if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ManageCreditLimit) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToCreditLimitHub.INSTANCE);
                    }
                    if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Help) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToWebView(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.RevolvingCreditUrls.UK_HELP_URL, false));
                    }
                    if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ManagePin) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToManagePin(ready2.getReadyInfo().getCpi(), ready2.getReadyInfo().getManageCardDetailUiModel().getCardArtSectionUiModel().getCardArtImageSource(), ready2.getReadyInfo().getManageCardDetailUiModel().getCardArtSectionUiModel().getLastFourDigits(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ManagePin) actionItemClicked.getAction()).getHasPhysicalCard()));
                    }
                    if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet) {
                        int i2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardReducer.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet) actionItemClicked.getAction()).getCardType().ordinal()];
                        if (i2 == 1) {
                            navigateToPushToWallet = com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateToPushToWallet.INSTANCE;
                        } else if (i2 == 2 || i2 == 3) {
                            navigateToPushToWallet = com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ViewCardInWallet.INSTANCE;
                        } else if (i2 != 4) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, navigateToPushToWallet);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready2, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.LockCardToggled) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.TogglingCardLockStatus(ready2.getReadyInfo(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.LockCardToggled) event).getTargetLockState()), null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ShowUserInfoBottomSheet.INSTANCE)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Ready copy9 = ready2.copy(ready2.getReadyInfo());
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber contactusPhoneNumber3 = ready2.getReadyInfo().getManageCardDetailUiModel().getContactusPhoneNumber();
                    if (contactusPhoneNumber3 != null && (nationalNumber = contactusPhoneNumber3.getNationalNumber()) != null) {
                        showUserInfoBottomSheet = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowUserInfoBottomSheet(nationalNumber);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy9, showUserInfoBottomSheet);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.NavigateBack.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.NavigateBack.INSTANCE);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnPushToWalletFinishSetupClicked.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ViewCardInWallet.INSTANCE);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStatementDeliveryViewDetailsLinkClicked.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliveryDetailsBottomSheet.INSTANCE);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStartPaperStatementsClicked.INSTANCE)) {
                    if (ready2.getReadyInfo().isUpdatingStatementDelivery()) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready2, null, 2, null);
                    }
                    copy8 = r6.copy((r26 & 1) != 0 ? r6.manageCardDetailUiModel : null, (r26 & 2) != 0 ? r6.cpi : null, (r26 & 4) != 0 ? r6.managementSections : null, (r26 & 8) != 0 ? r6.creditAccountId : null, (r26 & 16) != 0 ? r6.creditInstrumentId : null, (r26 & 32) != 0 ? r6.cardLockStatusChanged : false, (r26 & 64) != 0 ? r6.eSignConsentUrl : null, (r26 & 128) != 0 ? r6.benefitsUrl : null, (r26 & 256) != 0 ? r6.lastFailedStatementDeliveryEnrollment : null, (r26 & 512) != 0 ? r6.isUpdatingStatementDelivery : true, (r26 & 1024) != 0 ? r6.enrollingInPaper : java.lang.Boolean.TRUE, (r26 & 2048) != 0 ? ready2.getReadyInfo().statementDeliveryError : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready2.copy(copy8), null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStopPaperStatementsClicked.INSTANCE)) {
                    if (ready2.getReadyInfo().isUpdatingStatementDelivery()) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready2, null, 2, null);
                    }
                    copy7 = r6.copy((r26 & 1) != 0 ? r6.manageCardDetailUiModel : null, (r26 & 2) != 0 ? r6.cpi : null, (r26 & 4) != 0 ? r6.managementSections : null, (r26 & 8) != 0 ? r6.creditAccountId : null, (r26 & 16) != 0 ? r6.creditInstrumentId : null, (r26 & 32) != 0 ? r6.cardLockStatusChanged : false, (r26 & 64) != 0 ? r6.eSignConsentUrl : null, (r26 & 128) != 0 ? r6.benefitsUrl : null, (r26 & 256) != 0 ? r6.lastFailedStatementDeliveryEnrollment : null, (r26 & 512) != 0 ? r6.isUpdatingStatementDelivery : true, (r26 & 1024) != 0 ? r6.enrollingInPaper : java.lang.Boolean.FALSE, (r26 & 2048) != 0 ? ready2.getReadyInfo().statementDeliveryError : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready2.copy(copy7), null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnRetryUpdateStatementDelivery.INSTANCE)) {
                    java.lang.Boolean lastFailedStatementDeliveryEnrollment = ready2.getReadyInfo().getLastFailedStatementDeliveryEnrollment();
                    if (lastFailedStatementDeliveryEnrollment == null) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready2, null, 2, null);
                    }
                    copy6 = r6.copy((r26 & 1) != 0 ? r6.manageCardDetailUiModel : null, (r26 & 2) != 0 ? r6.cpi : null, (r26 & 4) != 0 ? r6.managementSections : null, (r26 & 8) != 0 ? r6.creditAccountId : null, (r26 & 16) != 0 ? r6.creditInstrumentId : null, (r26 & 32) != 0 ? r6.cardLockStatusChanged : false, (r26 & 64) != 0 ? r6.eSignConsentUrl : null, (r26 & 128) != 0 ? r6.benefitsUrl : null, (r26 & 256) != 0 ? r6.lastFailedStatementDeliveryEnrollment : null, (r26 & 512) != 0 ? r6.isUpdatingStatementDelivery : true, (r26 & 1024) != 0 ? r6.enrollingInPaper : java.lang.Boolean.valueOf(lastFailedStatementDeliveryEnrollment.booleanValue()), (r26 & 2048) != 0 ? ready2.getReadyInfo().statementDeliveryError : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready2.copy(copy6), null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCancelStatementDeliveryUpdate.INSTANCE)) {
                    if (!ready2.getReadyInfo().isUpdatingStatementDelivery()) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready2, null, 2, null);
                    }
                    copy5 = r6.copy((r26 & 1) != 0 ? r6.manageCardDetailUiModel : null, (r26 & 2) != 0 ? r6.cpi : null, (r26 & 4) != 0 ? r6.managementSections : null, (r26 & 8) != 0 ? r6.creditAccountId : null, (r26 & 16) != 0 ? r6.creditInstrumentId : null, (r26 & 32) != 0 ? r6.cardLockStatusChanged : false, (r26 & 64) != 0 ? r6.eSignConsentUrl : null, (r26 & 128) != 0 ? r6.benefitsUrl : null, (r26 & 256) != 0 ? r6.lastFailedStatementDeliveryEnrollment : null, (r26 & 512) != 0 ? r6.isUpdatingStatementDelivery : false, (r26 & 1024) != 0 ? r6.enrollingInPaper : null, (r26 & 2048) != 0 ? ready2.getReadyInfo().statementDeliveryError : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready2.copy(copy5), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliverySuccess) {
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> managementSections2 = ready2.getReadyInfo().getManagementSections();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(managementSections2, 10));
                    for (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.StatementDelivery statementDelivery : managementSections2) {
                        if (statementDelivery instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.StatementDelivery) {
                            statementDelivery = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.StatementDelivery) statementDelivery).copy(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliverySuccess) event).getEnrolledInPaper(), false);
                        }
                        arrayList2.add(statementDelivery);
                    }
                    java.util.ArrayList arrayList3 = arrayList2;
                    if (((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliverySuccess) event).getEnrolledInPaper()) {
                        i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_delivery_enrolled_success;
                    } else {
                        i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_delivery_unenrolled_success;
                    }
                    int i3 = i;
                    copy4 = r8.copy((r26 & 1) != 0 ? r8.manageCardDetailUiModel : null, (r26 & 2) != 0 ? r8.cpi : null, (r26 & 4) != 0 ? r8.managementSections : arrayList3, (r26 & 8) != 0 ? r8.creditAccountId : null, (r26 & 16) != 0 ? r8.creditInstrumentId : null, (r26 & 32) != 0 ? r8.cardLockStatusChanged : false, (r26 & 64) != 0 ? r8.eSignConsentUrl : null, (r26 & 128) != 0 ? r8.benefitsUrl : null, (r26 & 256) != 0 ? r8.lastFailedStatementDeliveryEnrollment : null, (r26 & 512) != 0 ? r8.isUpdatingStatementDelivery : false, (r26 & 1024) != 0 ? r8.enrollingInPaper : null, (r26 & 2048) != 0 ? ready2.getReadyInfo().statementDeliveryError : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2.copy(copy4), new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.ShowStatementDeliverySuccessToast(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(i3, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                }
                if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCardDetailsClicked.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchingCardDetails(ready2.getReadyInfo()), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCopyCardNumberClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardUiEffect.CopyCardNumber(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnCopyCardNumberClicked) event).getCardNumber()));
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready2, event);
                }
                copy3 = r6.copy((r26 & 1) != 0 ? r6.manageCardDetailUiModel : null, (r26 & 2) != 0 ? r6.cpi : null, (r26 & 4) != 0 ? r6.managementSections : null, (r26 & 8) != 0 ? r6.creditAccountId : null, (r26 & 16) != 0 ? r6.creditInstrumentId : null, (r26 & 32) != 0 ? r6.cardLockStatusChanged : false, (r26 & 64) != 0 ? r6.eSignConsentUrl : null, (r26 & 128) != 0 ? r6.benefitsUrl : null, (r26 & 256) != 0 ? r6.lastFailedStatementDeliveryEnrollment : ready2.getReadyInfo().getEnrollingInPaper(), (r26 & 512) != 0 ? r6.isUpdatingStatementDelivery : false, (r26 & 1024) != 0 ? r6.enrollingInPaper : null, (r26 & 2048) != 0 ? ready2.getReadyInfo().statementDeliveryError : ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnUpdateStatementDeliveryError) event).getError());
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready2.copy(copy3), null, 2, null);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary fetchAccountSummary = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded onDataLoaded = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoaded) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel(onDataLoaded.getCpi(), onDataLoaded.getManageCardDetails()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDataLoadFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Error(null, false, null, 7, null), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(fetchAccountSummary, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCreated) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnViewCreated) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.InitializingUiModel(onViewCreated.getCpi(), onViewCreated.getManageCardDetails()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDeepLinkEntry) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardState.FetchAccountSummary(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnDeepLinkEntry) event).getCpi()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet.CardType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet.CardType.NOT_ENROLLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet.CardType.ACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet.CardType.PENDING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet.CardType.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
