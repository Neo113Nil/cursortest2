package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managesecondarycard/mvi/ManageSecondaryCardUserEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageSecondaryCardUserReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ManageSecondaryCardUserReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ManageSecondaryCardUserReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState state, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent event) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success copy;
        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success copy2;
        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success copy3;
        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success copy4;
        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success copy5;
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo copy6;
        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success copy7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = 0;
        int i2 = 1;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.RetryLoadingInstrument) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading(error.getRetryCount() + 1), null, 2, null);
                    }
                    if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.DismissClicked) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ErrorDismissCtaClicked)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateBack.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success) state;
                if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.RetryLoadingInstrument) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.LoadCardDetails) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardReplacementReceived)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading(i, i2, objArr == true ? 1 : 0), null, 2, null);
                }
                if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.LockCardToggled) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.UnlockCardToggled)) {
                    if (success.isOperationErrorVisible()) {
                        copy2 = success.copy((r20 & 1) != 0 ? success.debitInstrument : null, (r20 & 2) != 0 ? success.productName : null, (r20 & 4) != 0 ? success.isOperationInProgress : true, (r20 & 8) != 0 ? success.isOperationErrorVisible : false, (r20 & 16) != 0 ? success.operationErrorType : null, (r20 & 32) != 0 ? success.operationErrorInfo : null, (r20 & 64) != 0 ? success.operationRetryType : null, (r20 & 128) != 0 ? success.retryCount : success.getRetryCount() + 1, (r20 & 256) != 0 ? success.postLoadAction : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
                    }
                    copy = success.copy((r20 & 1) != 0 ? success.debitInstrument : null, (r20 & 2) != 0 ? success.productName : null, (r20 & 4) != 0 ? success.isOperationInProgress : true, (r20 & 8) != 0 ? success.isOperationErrorVisible : false, (r20 & 16) != 0 ? success.operationErrorType : null, (r20 & 32) != 0 ? success.operationErrorInfo : null, (r20 & 64) != 0 ? success.operationRetryType : null, (r20 & 128) != 0 ? success.retryCount : 0, (r20 & 256) != 0 ? success.postLoadAction : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
                }
                boolean z = event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardLockedFailed;
                if (z || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardUnlockedFailed) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.OperationErrorDismissed)) {
                    if (z) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardLockedFailed cardLockedFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardLockedFailed) event;
                        copy5 = success.copy((r20 & 1) != 0 ? success.debitInstrument : null, (r20 & 2) != 0 ? success.productName : null, (r20 & 4) != 0 ? success.isOperationInProgress : false, (r20 & 8) != 0 ? success.isOperationErrorVisible : true, (r20 & 16) != 0 ? success.operationErrorType : cardLockedFailed.getErrorType(), (r20 & 32) != 0 ? success.operationErrorInfo : cardLockedFailed.getErrorInfo(), (r20 & 64) != 0 ? success.operationRetryType : com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType.LOCK, (r20 & 128) != 0 ? success.retryCount : 0, (r20 & 256) != 0 ? success.postLoadAction : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy5, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardUnlockedFailed) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardUnlockedFailed cardUnlockedFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardUnlockedFailed) event;
                        copy4 = success.copy((r20 & 1) != 0 ? success.debitInstrument : null, (r20 & 2) != 0 ? success.productName : null, (r20 & 4) != 0 ? success.isOperationInProgress : false, (r20 & 8) != 0 ? success.isOperationErrorVisible : true, (r20 & 16) != 0 ? success.operationErrorType : cardUnlockedFailed.getErrorType(), (r20 & 32) != 0 ? success.operationErrorInfo : cardUnlockedFailed.getErrorInfo(), (r20 & 64) != 0 ? success.operationRetryType : com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementOperationRetryType.UNLOCK, (r20 & 128) != 0 ? success.retryCount : 0, (r20 & 256) != 0 ? success.postLoadAction : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy4, null, 2, null);
                    }
                    if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.OperationErrorDismissed)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                    }
                    copy3 = success.copy((r20 & 1) != 0 ? success.debitInstrument : null, (r20 & 2) != 0 ? success.productName : null, (r20 & 4) != 0 ? success.isOperationInProgress : false, (r20 & 8) != 0 ? success.isOperationErrorVisible : false, (r20 & 16) != 0 ? success.operationErrorType : null, (r20 & 32) != 0 ? success.operationErrorInfo : null, (r20 & 64) != 0 ? success.operationRetryType : null, (r20 & 128) != 0 ? success.retryCount : 0, (r20 & 256) != 0 ? success.postLoadAction : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy3, null, 2, null);
                }
                if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.PostLoadActionConsumed)) {
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.BillingAddressSaved) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading(i, i2, objArr2 == true ? 1 : 0), null, 2, null);
                    }
                    boolean z2 = event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ChangePinClicked;
                    if (!z2 && !(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ReportLostStolenCardClicked) && !(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ReportCardClicked) && !(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CancelCardClicked) && !(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.BackClicked) && !(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ActivatePinClicked) && !(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.DidntGetYourCardClicked)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                    }
                    if (z2) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToDebitPin(success.getDebitInstrument().getId()));
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ReportLostStolenCardClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToCardReplacement(com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.toCardReplacementInfo(success.getDebitInstrument())));
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ReportCardClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToReportCardReasonSelection(com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.toCardReplacementInfo(success.getDebitInstrument())));
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CancelCardClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToCancelCard(new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo(success.getProductName(), success.getDebitInstrument().getId(), success.getDebitInstrument().getLastNChars(), success.getDebitInstrument().getProductDetails().getShortName(), false)));
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.BackClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateBack.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.ActivatePinClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToActivatePin.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.DidntGetYourCardClicked) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success success2 = success;
                        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo = com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.toCardReplacementInfo(success.getDebitInstrument());
                        java.lang.String estimatedArrivalDate = success.getDebitInstrument().getShipmentDetails().getEstimatedArrivalDate();
                        java.lang.String formatToMonthDayYear = estimatedArrivalDate != null ? com.paypal.oslo.feature.debitcard.shared.util.DateFormattingExtensionsKt.formatToMonthDayYear(estimatedArrivalDate) : null;
                        copy6 = cardReplacementInfo.copy((r20 & 1) != 0 ? cardReplacementInfo.debitInstrumentId : null, (r20 & 2) != 0 ? cardReplacementInfo.productName : null, (r20 & 4) != 0 ? cardReplacementInfo.cardLastFourDigits : null, (r20 & 8) != 0 ? cardReplacementInfo.displayAddress : null, (r20 & 16) != 0 ? cardReplacementInfo.cardArtUrl : null, (r20 & 32) != 0 ? cardReplacementInfo.billingAddressId : null, (r20 & 64) != 0 ? cardReplacementInfo.expectedArrivalDate : formatToMonthDayYear == null ? "" : formatToMonthDayYear, (r20 & 128) != 0 ? cardReplacementInfo.flowType : com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType.CARD_NOT_RECEIVED, (r20 & 256) != 0 ? cardReplacementInfo.primary : false);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success2, new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEffect.NavigateToDidntGetYourCard(copy6));
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                }
                copy7 = success.copy((r20 & 1) != 0 ? success.debitInstrument : null, (r20 & 2) != 0 ? success.productName : null, (r20 & 4) != 0 ? success.isOperationInProgress : false, (r20 & 8) != 0 ? success.isOperationErrorVisible : false, (r20 & 16) != 0 ? success.operationErrorType : null, (r20 & 32) != 0 ? success.operationErrorInfo : null, (r20 & 64) != 0 ? success.operationRetryType : null, (r20 & 128) != 0 ? success.retryCount : 0, (r20 & 256) != 0 ? success.postLoadAction : com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None.INSTANCE);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy7, null, 2, null);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardDetailsLoaded) {
                com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardDetailsLoaded cardDetailsLoaded = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardDetailsLoaded) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Success(cardDetailsLoaded.getDebitInstrument(), cardDetailsLoaded.getProductName(), false, false, null, null, null, 0, cardDetailsLoaded.getPostLoadAction(), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardDetailsLoadFailed) {
                com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardDetailsLoadFailed cardDetailsLoadFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.CardDetailsLoadFailed) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Error(cardDetailsLoadFailed.getErrorType(), loading.getRetryCount(), cardDetailsLoadFailed.getErrorInfo()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Initial initial = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserEvent.LoadCardDetails) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserState.Loading(i, i2, objArr3 == true ? 1 : 0), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
