package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Success;", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState$Success;)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardManagementReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DebitCardManagementReducer(com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoSizes = featureGateManager;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DebitCardManagementReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState state, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent event) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success copy;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success copy2;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPayPalBalanceInfoBottomSheet showPayPalBalanceInfoBottomSheet;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success copy3;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success copy4;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success copy5;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success copy6;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success copy7;
        int i;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardDetailsBottomSheet showCardDetailsBottomSheet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToRequestPhysicalCard navigateToRequestPhysicalCard = null;
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading(error.getProductName(), error.getCardId(), error.getCachedInstruments(), error.getRetryCount() + 1), null, 2, null);
                    }
                    return event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ErrorDismissCtaClicked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateBack.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading(success.getProductName(), success.getCardId(), success.getCachedInstruments(), 0, 8, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ViewShowCardClicked) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success success2 = success;
                    com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success success3 = success;
                    if (com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.isPinRequired(success3) && !com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.isCardLocked(success3)) {
                        showCardDetailsBottomSheet = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPinForShowCard(java.lang.String.valueOf(success.getCardId()));
                    } else {
                        showCardDetailsBottomSheet = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardDetailsBottomSheet.INSTANCE;
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success2, showCardDetailsBottomSheet);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.RequestPhysicalCardClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToRequestPhysicalCard(com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.toRequestPhysicalCardInfo(success)));
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.HelpLinkClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToBrowser(((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.HelpLinkClicked) event).getUrl()));
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.AddCardholderButtonClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToAddCardholderFlow.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ManageSecondaryCardholderClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToManageSecondaryCardholderFlow(success.getProductName()));
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DebitCardBannerClicked) {
                    java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> operationSections = success.getOperationSections();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : operationSections) {
                        if (obj instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner) {
                            arrayList.add(obj);
                        }
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner cardBanner = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState state2 = cardBanner != null ? cardBanner.getState() : null;
                    i = state2 != null ? com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementReducer.WhenMappings.$EnumSwitchMapping$0[state2.ordinal()] : -1;
                    if (i == 1) {
                        if (this.getHighSpeedVideoSizes.isAdditionalCardholderManagementEnabled() && cardBanner.isSecondaryCardActivation()) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToManageSecondaryCardholderFlow(success.getProductName()));
                        }
                        return getHighSpeedVideoSizes(success);
                    }
                    if (i == 2) {
                        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails helpLink = cardBanner.getHelpLink();
                        java.lang.String url = helpLink != null ? helpLink.getUrl() : null;
                        java.lang.String str = url;
                        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToBrowser(url));
                        }
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Help url is not available for Deactivated card banner", null, null, null, 14, null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                }
                if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected)) {
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CancelCardClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCancelCard(com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.toCancelCardInfo(success, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CancelCardClicked) event).getProductName())));
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DebitPinClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPin(java.lang.String.valueOf(success.getCardId())));
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ViewPinClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToViewPin(com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.toViewPinInfo(success)));
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningSuccessful) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPushProvisioningSuccessToast.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningAndPinSetupSuccessful) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading(success.getProductName(), success.getCardId(), success.getCachedInstruments(), 0, 8, null), com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPushProvisioningSuccessToast.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.AddressSaved) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowAddressUpdatedToast.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived pendingFlowEventReceived = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived) event;
                        int i2 = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementReducer.WhenMappings.$EnumSwitchMapping$1[pendingFlowEventReceived.getFlow().ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                return getHighSpeedVideoSizes(success);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, null);
                        }
                        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent flowIntent = pendingFlowEventReceived.getFlowIntent();
                        i = flowIntent != null ? com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementReducer.WhenMappings.$EnumSwitchMapping$2[flowIntent.ordinal()] : -1;
                        if (i == 1) {
                            navigateToRequestPhysicalCard = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToRequestPhysicalCard(com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.toRequestPhysicalCardInfo(success));
                        } else if (i == 2) {
                            navigateToRequestPhysicalCard = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPushProvisioningBottomSheet.INSTANCE;
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, (com.paypal.oslo.core.mvi.UiEffect) navigateToRequestPhysicalCard);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.BackClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateBack.INSTANCE);
                    }
                    if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReplaceDigitalCardClicked)) {
                        if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReportLostStolenCardClicked)) {
                            if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReportCardClicked)) {
                                if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LockCardToggled) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.UnlockCardToggled)) {
                                    if (success.isOperationErrorVisible()) {
                                        copy2 = success.copy((r22 & 1) != 0 ? success.operationSections : null, (r22 & 2) != 0 ? success.cardConnectEligibilityState : null, (r22 & 4) != 0 ? success.productName : null, (r22 & 8) != 0 ? success.cardId : null, (r22 & 16) != 0 ? success.cachedInstruments : null, (r22 & 32) != 0 ? success.isOperationInProgress : true, (r22 & 64) != 0 ? success.isOperationErrorVisible : false, (r22 & 128) != 0 ? success.operationErrorType : null, (r22 & 256) != 0 ? success.operationRetryType : null, (r22 & 512) != 0 ? success.retryCount : success.getRetryCount() + 1);
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
                                    }
                                    copy = success.copy((r22 & 1) != 0 ? success.operationSections : null, (r22 & 2) != 0 ? success.cardConnectEligibilityState : null, (r22 & 4) != 0 ? success.productName : null, (r22 & 8) != 0 ? success.cardId : null, (r22 & 16) != 0 ? success.cachedInstruments : null, (r22 & 32) != 0 ? success.isOperationInProgress : true, (r22 & 64) != 0 ? success.isOperationErrorVisible : false, (r22 & 128) != 0 ? success.operationErrorType : null, (r22 & 256) != 0 ? success.operationRetryType : null, (r22 & 512) != 0 ? success.retryCount : 0);
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
                                }
                                if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardLockedFailed)) {
                                    if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardUnlockedFailed)) {
                                        if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.OperationErrorDismissed)) {
                                            if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectEligible)) {
                                                if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectIneligible)) {
                                                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectEntryPointTapped) {
                                                        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success success4 = success;
                                                        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName = success.getProductName();
                                                        java.lang.String cardId = success.getCardId();
                                                        return cardId == null ? com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success4, event) : com.paypal.oslo.core.mvi.ReducerHelperKt.output(success4, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardConnect(productName, cardId));
                                                    }
                                                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DeactivateContactlessClicked) {
                                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowDeactivateContactlessBottomSheet(((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DeactivateContactlessClicked) event).getCardId()));
                                                    }
                                                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ContactlessDeactivationSuccess) {
                                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading(success.getProductName(), success.getCardId(), success.getCachedInstruments(), 0, 8, null), com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowContactlessDeactivatedToast.INSTANCE);
                                                    }
                                                    boolean z = event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.EditSecondaryFundingSourceClicked;
                                                    if (z || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PayPalBalanceInfoClicked)) {
                                                        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success success5 = success;
                                                        if (z) {
                                                            showPayPalBalanceInfoBottomSheet = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowFundingSourceSelectorBottomSheet.INSTANCE;
                                                        } else {
                                                            showPayPalBalanceInfoBottomSheet = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPayPalBalanceInfoBottomSheet.INSTANCE;
                                                        }
                                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success5, showPayPalBalanceInfoBottomSheet);
                                                    }
                                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                                                }
                                                copy3 = success.copy((r22 & 1) != 0 ? success.operationSections : null, (r22 & 2) != 0 ? success.cardConnectEligibilityState : com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Ineligible.INSTANCE, (r22 & 4) != 0 ? success.productName : null, (r22 & 8) != 0 ? success.cardId : null, (r22 & 16) != 0 ? success.cachedInstruments : null, (r22 & 32) != 0 ? success.isOperationInProgress : false, (r22 & 64) != 0 ? success.isOperationErrorVisible : false, (r22 & 128) != 0 ? success.operationErrorType : null, (r22 & 256) != 0 ? success.operationRetryType : null, (r22 & 512) != 0 ? success.retryCount : 0);
                                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy3, null, 2, null);
                                            }
                                            copy4 = success.copy((r22 & 1) != 0 ? success.operationSections : null, (r22 & 2) != 0 ? success.cardConnectEligibilityState : com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardConnectEligibilityState.Eligible.INSTANCE, (r22 & 4) != 0 ? success.productName : null, (r22 & 8) != 0 ? success.cardId : null, (r22 & 16) != 0 ? success.cachedInstruments : null, (r22 & 32) != 0 ? success.isOperationInProgress : false, (r22 & 64) != 0 ? success.isOperationErrorVisible : false, (r22 & 128) != 0 ? success.operationErrorType : null, (r22 & 256) != 0 ? success.operationRetryType : null, (r22 & 512) != 0 ? success.retryCount : 0);
                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy4, null, 2, null);
                                        }
                                        copy5 = success.copy((r22 & 1) != 0 ? success.operationSections : null, (r22 & 2) != 0 ? success.cardConnectEligibilityState : null, (r22 & 4) != 0 ? success.productName : null, (r22 & 8) != 0 ? success.cardId : null, (r22 & 16) != 0 ? success.cachedInstruments : null, (r22 & 32) != 0 ? success.isOperationInProgress : false, (r22 & 64) != 0 ? success.isOperationErrorVisible : false, (r22 & 128) != 0 ? success.operationErrorType : null, (r22 & 256) != 0 ? success.operationRetryType : null, (r22 & 512) != 0 ? success.retryCount : 0);
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy5, null, 2, null);
                                    }
                                    copy6 = success.copy((r22 & 1) != 0 ? success.operationSections : null, (r22 & 2) != 0 ? success.cardConnectEligibilityState : null, (r22 & 4) != 0 ? success.productName : null, (r22 & 8) != 0 ? success.cardId : null, (r22 & 16) != 0 ? success.cachedInstruments : null, (r22 & 32) != 0 ? success.isOperationInProgress : false, (r22 & 64) != 0 ? success.isOperationErrorVisible : true, (r22 & 128) != 0 ? success.operationErrorType : ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardUnlockedFailed) event).getErrorType(), (r22 & 256) != 0 ? success.operationRetryType : com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType.UNLOCK, (r22 & 512) != 0 ? success.retryCount : 0);
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy6, null, 2, null);
                                }
                                copy7 = success.copy((r22 & 1) != 0 ? success.operationSections : null, (r22 & 2) != 0 ? success.cardConnectEligibilityState : null, (r22 & 4) != 0 ? success.productName : null, (r22 & 8) != 0 ? success.cardId : null, (r22 & 16) != 0 ? success.cachedInstruments : null, (r22 & 32) != 0 ? success.isOperationInProgress : false, (r22 & 64) != 0 ? success.isOperationErrorVisible : true, (r22 & 128) != 0 ? success.operationErrorType : ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardLockedFailed) event).getErrorType(), (r22 & 256) != 0 ? success.operationRetryType : com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType.LOCK, (r22 & 512) != 0 ? success.retryCount : 0);
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy7, null, 2, null);
                            }
                            java.util.Iterator<T> it = success.getCachedInstruments().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                java.lang.Object next = it.next();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) next).getId(), success.getCardId())) {
                                    navigateToRequestPhysicalCard = next;
                                    break;
                                }
                            }
                            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) navigateToRequestPhysicalCard;
                            if (debitInstrument == null) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReportCardReasonSelection(com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.toCardReplacementInfo(debitInstrument)));
                        }
                        java.util.Iterator<T> it2 = success.getCachedInstruments().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            java.lang.Object next2 = it2.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) next2).getId(), success.getCardId())) {
                                navigateToRequestPhysicalCard = next2;
                                break;
                            }
                        }
                        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) navigateToRequestPhysicalCard;
                        if (debitInstrument2 == null) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardReplacement(com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.toCardReplacementInfo(debitInstrument2)));
                    }
                    java.util.Iterator<T> it3 = success.getCachedInstruments().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        java.lang.Object next3 = it3.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) next3).getId(), success.getCardId())) {
                            navigateToRequestPhysicalCard = next3;
                            break;
                        }
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) navigateToRequestPhysicalCard;
                    if (debitInstrument3 == null) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReplaceDigitalCard(com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.toCardReplacementInfo(debitInstrument3)));
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected cardholderSelected = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected) event;
                if (kotlin.jvm.internal.Intrinsics.areEqual(cardholderSelected.getCardId(), success.getCardId())) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.CloseManageCardholderBottomSheet.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading(null, cardholderSelected.getCardId(), success.getCachedInstruments(), 0, 9, null), null, 2, null);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded) {
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded cardDetailsLoaded = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded) event;
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success success6 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success(cardDetailsLoaded.getOperationSections(), null, loading.getProductName(), cardDetailsLoaded.getCardId(), cardDetailsLoaded.getAllInstruments(), false, false, null, null, 0, 994, null);
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction = cardDetailsLoaded.getPostLoadAction();
                if (kotlin.jvm.internal.Intrinsics.areEqual(postLoadAction, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardDetails.INSTANCE)) {
                    navigateToRequestPhysicalCard = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardDetailsBottomSheet.INSTANCE;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(postLoadAction, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardLockedToast.INSTANCE)) {
                    navigateToRequestPhysicalCard = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardLockedToast.INSTANCE;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(postLoadAction, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardUnlockedToast.INSTANCE)) {
                    navigateToRequestPhysicalCard = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardUnlockedToast.INSTANCE;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(postLoadAction, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyLockedToast.INSTANCE)) {
                    navigateToRequestPhysicalCard = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardAlreadyLockedToast.INSTANCE;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(postLoadAction, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyUnlockedToast.INSTANCE)) {
                    navigateToRequestPhysicalCard = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardAlreadyUnlockedToast.INSTANCE;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(postLoadAction, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowPushProvisioningBottomSheet.INSTANCE)) {
                    navigateToRequestPhysicalCard = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPushProvisioningBottomSheet.INSTANCE;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(postLoadAction, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowFundingSourceSelectorBottomSheet.INSTANCE)) {
                    navigateToRequestPhysicalCard = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowFundingSourceSelectorBottomSheet.INSTANCE;
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(postLoadAction, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success6, (com.paypal.oslo.core.mvi.UiEffect) navigateToRequestPhysicalCard);
            }
            if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed)) {
                return event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed cardDetailsLoadFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error(cardDetailsLoadFailed.getErrorCode(), cardDetailsLoadFailed.getErrorType(), loading.getRetryCount(), loading.getProductName(), loading.getCardId(), loading.getCachedInstruments()), null, 2, null);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Initial initial = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading(initial.getProductName(), null, null, 0, 14, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect>> getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success p0) {
        java.lang.Object obj;
        java.util.Iterator<T> it = p0.getCachedInstruments().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getId(), p0.getCardId())) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        if (debitInstrument != null) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToActivateCardFlow(com.paypal.oslo.feature.debitcard.shared.util.DebitInstrumentCommonDataExtensionsKt.toDebitCardActivationInfo(debitInstrument, java.lang.String.valueOf(p0.getCardId()))));
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Current instrument not found for cardId. Cannot navigate to activation.", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", java.lang.String.valueOf(p0.getCardId()))), null, 10, null);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ACTIVATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.DEACTIVATED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.values().length];
            try {
                iArr2[com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.DISPLAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.ACTIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.values().length];
            try {
                iArr3[com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.REQUEST_PHYSICAL_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr3[com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.STAR_PAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
