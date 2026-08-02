package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/utils/SelectAmountValidator;", "selectAmountValidator", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/utils/SelectAmountValidator;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/utils/SelectAmountValidator;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectAmountReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.SelectAmountValidator getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SelectAmountReducer(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.SelectAmountValidator selectAmountValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectAmountValidator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = selectAmountValidator;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "SelectAmountReducer";
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dd  */
    @Override // com.paypal.oslo.core.mvi.Reducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent event) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel copy;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel copy2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption;
        java.math.BigDecimal amount;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel copy3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToChooseWayToPay navigateToChooseWayToPay = null;
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.ErrorFetchingData)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.ErrorFetchingData errorFetchingData = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.ErrorFetchingData) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(errorFetchingData, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnTryAgainClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Loading(errorFetchingData.getCreditProductIdentifier(), errorFetchingData.getCreditAccountId(), false, 4, null), null, 2, null);
                    }
                    return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewPaymentsClicked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(errorFetchingData, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToPaymentSummary(true)) : event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnBackClicked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(errorFetchingData, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateBack.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(errorFetchingData, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
                }
                if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnOptionChanged)) {
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnBackClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateBack.INSTANCE);
                    }
                    if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnNextClicked)) {
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnRemainingStatementBalanceLinkClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.ShowRemainingStatementBalanceSheet.INSTANCE);
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnAutopayClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToAutopay.INSTANCE);
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewPaymentsClicked) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToPaymentSummary(false, 1, null));
                        }
                        if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnCustomAmountChanged)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnCustomAmountChanged onCustomAmountChanged = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnCustomAmountChanged) event;
                        java.math.BigDecimal centsStringToDollars = com.paypal.oslo.feature.revolvingcreditservicing.utils.BigDecimalExtensionsKt.centsStringToDollars(onCustomAmountChanged.getCustomAmount());
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString validationErrorMessage = centsStringToDollars.compareTo(ready.getData().getRadioGroupData().getMaxAmount()) > 0 ? this.getHighResolutionOutputSizeshNQ4ISI.getValidationErrorMessage(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData(centsStringToDollars, ready.getData().getRadioGroupData().getMaxAmount(), ready.getData().getRadioGroupData().getFormattedMaxAmount(), ready.getData().getHasScheduledPayment())) : null;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel data = ready.getData();
                        copy = r7.copy((r26 & 1) != 0 ? r7.options : null, (r26 & 2) != 0 ? r7.selectedOption : null, (r26 & 4) != 0 ? r7.selectedAmount : centsStringToDollars, (r26 & 8) != 0 ? r7.customAmount : onCustomAmountChanged.getCustomAmount(), (r26 & 16) != 0 ? r7.customAmountError : validationErrorMessage, (r26 & 32) != 0 ? r7.generalErrorMessage : null, (r26 & 64) != 0 ? r7.formattedMaxAmount : null, (r26 & 128) != 0 ? r7.maxAmount : null, (r26 & 256) != 0 ? r7.formattedZeroAmount : null, (r26 & 512) != 0 ? r7.maxCustomAmount : null, (r26 & 1024) != 0 ? r7.hintText : null, (r26 & 2048) != 0 ? ready.getData().getRadioGroupData().localeString : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel.copy$default(data, copy, null, null, false, 14, null), null, 0, null, null, 30, null), null, 2, null);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel data2 = ready.getData();
                    boolean hasValidSelectedAmount = this.getHighResolutionOutputSizeshNQ4ISI.hasValidSelectedAmount(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData(data2.getRadioGroupData().getSelectedAmount(), data2.getRadioGroupData().getMaxAmount(), data2.getRadioGroupData().getFormattedMaxAmount(), data2.getHasScheduledPayment()));
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel data3 = ready.getData();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel radioGroupData = ready.getData().getRadioGroupData();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption2 = ready.getData().getRadioGroupData().getSelectedOption();
                    int i2 = selectedOption2 == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountReducer.WhenMappings.$EnumSwitchMapping$0[selectedOption2.ordinal()];
                    if (i2 == -1) {
                        stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_make_a_payment_select_payment_error_message, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    } else if (i2 != 1) {
                        stringResOnly = this.getHighResolutionOutputSizeshNQ4ISI.getValidationErrorMessage(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData(ready.getData().getRadioGroupData().getSelectedAmount(), ready.getData().getRadioGroupData().getMaxAmount(), ready.getData().getRadioGroupData().getFormattedMaxAmount(), ready.getData().getHasScheduledPayment()));
                    } else {
                        uiString = null;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption3 = ready.getData().getRadioGroupData().getSelectedOption();
                        i = selectedOption3 != null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountReducer.WhenMappings.$EnumSwitchMapping$0[selectedOption3.ordinal()];
                        if (i != -1) {
                            stringResOnly2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_make_a_payment_select_payment_error_message, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                        } else if (i == 1) {
                            stringResOnly2 = this.getHighResolutionOutputSizeshNQ4ISI.getValidationErrorMessage(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.utils.AmountValidationData(ready.getData().getRadioGroupData().getSelectedAmount(), ready.getData().getRadioGroupData().getMaxAmount(), ready.getData().getRadioGroupData().getFormattedMaxAmount(), ready.getData().getHasScheduledPayment()));
                        } else {
                            uiString2 = null;
                            copy2 = radioGroupData.copy((r26 & 1) != 0 ? radioGroupData.options : null, (r26 & 2) != 0 ? radioGroupData.selectedOption : null, (r26 & 4) != 0 ? radioGroupData.selectedAmount : null, (r26 & 8) != 0 ? radioGroupData.customAmount : null, (r26 & 16) != 0 ? radioGroupData.customAmountError : uiString2, (r26 & 32) != 0 ? radioGroupData.generalErrorMessage : uiString, (r26 & 64) != 0 ? radioGroupData.formattedMaxAmount : null, (r26 & 128) != 0 ? radioGroupData.maxAmount : null, (r26 & 256) != 0 ? radioGroupData.formattedZeroAmount : null, (r26 & 512) != 0 ? radioGroupData.maxCustomAmount : null, (r26 & 1024) != 0 ? radioGroupData.hintText : null, (r26 & 2048) != 0 ? radioGroupData.localeString : null);
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready copy$default = com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel.copy$default(data3, copy2, null, null, false, 14, null), null, 0, null, null, 30, null);
                            if (hasValidSelectedAmount && (selectedOption = ready.getData().getRadioGroupData().getSelectedOption()) != null) {
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel) kotlin.collections.MapsKt.getValue(ready.getData().getRadioGroupData().getOptions(), selectedOption)).getCurrencyAmount();
                                java.lang.String obj = ready.getData().getRadioGroupData().getSelectedAmount().toString();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                                navigateToChooseWayToPay = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToChooseWayToPay(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount.copy$default(currencyAmount, null, obj, 1, null), ready.getData().getUserAgreementUrl(), ready.getCreditAccountId(), ready.getFundingInstruments(), ready.getMaxDaysInFuture(), ready.getDueDate());
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy$default, navigateToChooseWayToPay);
                        }
                        uiString2 = stringResOnly2;
                        copy2 = radioGroupData.copy((r26 & 1) != 0 ? radioGroupData.options : null, (r26 & 2) != 0 ? radioGroupData.selectedOption : null, (r26 & 4) != 0 ? radioGroupData.selectedAmount : null, (r26 & 8) != 0 ? radioGroupData.customAmount : null, (r26 & 16) != 0 ? radioGroupData.customAmountError : uiString2, (r26 & 32) != 0 ? radioGroupData.generalErrorMessage : uiString, (r26 & 64) != 0 ? radioGroupData.formattedMaxAmount : null, (r26 & 128) != 0 ? radioGroupData.maxAmount : null, (r26 & 256) != 0 ? radioGroupData.formattedZeroAmount : null, (r26 & 512) != 0 ? radioGroupData.maxCustomAmount : null, (r26 & 1024) != 0 ? radioGroupData.hintText : null, (r26 & 2048) != 0 ? radioGroupData.localeString : null);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready copy$default2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel.copy$default(data3, copy2, null, null, false, 14, null), null, 0, null, null, 30, null);
                        if (hasValidSelectedAmount) {
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel) kotlin.collections.MapsKt.getValue(ready.getData().getRadioGroupData().getOptions(), selectedOption)).getCurrencyAmount();
                            java.lang.String obj2 = ready.getData().getRadioGroupData().getSelectedAmount().toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                            navigateToChooseWayToPay = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToChooseWayToPay(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount.copy$default(currencyAmount2, null, obj2, 1, null), ready.getData().getUserAgreementUrl(), ready.getCreditAccountId(), ready.getFundingInstruments(), ready.getMaxDaysInFuture(), ready.getDueDate());
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy$default2, navigateToChooseWayToPay);
                    }
                    uiString = stringResOnly;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption32 = ready.getData().getRadioGroupData().getSelectedOption();
                    if (selectedOption32 != null) {
                    }
                    if (i != -1) {
                    }
                    uiString2 = stringResOnly2;
                    copy2 = radioGroupData.copy((r26 & 1) != 0 ? radioGroupData.options : null, (r26 & 2) != 0 ? radioGroupData.selectedOption : null, (r26 & 4) != 0 ? radioGroupData.selectedAmount : null, (r26 & 8) != 0 ? radioGroupData.customAmount : null, (r26 & 16) != 0 ? radioGroupData.customAmountError : uiString2, (r26 & 32) != 0 ? radioGroupData.generalErrorMessage : uiString, (r26 & 64) != 0 ? radioGroupData.formattedMaxAmount : null, (r26 & 128) != 0 ? radioGroupData.maxAmount : null, (r26 & 256) != 0 ? radioGroupData.formattedZeroAmount : null, (r26 & 512) != 0 ? radioGroupData.maxCustomAmount : null, (r26 & 1024) != 0 ? radioGroupData.hintText : null, (r26 & 2048) != 0 ? radioGroupData.localeString : null);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready copy$default22 = com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel.copy$default(data3, copy2, null, null, false, 14, null), null, 0, null, null, 30, null);
                    if (hasValidSelectedAmount) {
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy$default22, navigateToChooseWayToPay);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnOptionChanged onOptionChanged = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnOptionChanged) event;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel data4 = ready.getData();
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel radioGroupData2 = ready.getData().getRadioGroupData();
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption option = onOptionChanged.getOption();
                if (onOptionChanged.getOption() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT) {
                    amount = com.paypal.oslo.feature.revolvingcreditservicing.utils.BigDecimalExtensionsKt.centsStringToDollars(ready.getData().getRadioGroupData().getCustomAmount());
                } else {
                    amount = onOptionChanged.getAmount();
                }
                copy3 = radioGroupData2.copy((r26 & 1) != 0 ? radioGroupData2.options : null, (r26 & 2) != 0 ? radioGroupData2.selectedOption : option, (r26 & 4) != 0 ? radioGroupData2.selectedAmount : amount, (r26 & 8) != 0 ? radioGroupData2.customAmount : ready.getData().getRadioGroupData().getCustomAmount(), (r26 & 16) != 0 ? radioGroupData2.customAmountError : null, (r26 & 32) != 0 ? radioGroupData2.generalErrorMessage : null, (r26 & 64) != 0 ? radioGroupData2.formattedMaxAmount : null, (r26 & 128) != 0 ? radioGroupData2.maxAmount : null, (r26 & 256) != 0 ? radioGroupData2.formattedZeroAmount : null, (r26 & 512) != 0 ? radioGroupData2.maxCustomAmount : null, (r26 & 1024) != 0 ? radioGroupData2.hintText : null, (r26 & 2048) != 0 ? radioGroupData2.localeString : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel.copy$default(data4, copy3, null, null, false, 14, null), null, 0, null, null, 30, null), null, 2, null);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched onDataFetched = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Ready(onDataFetched.getData(), onDataFetched.getFundingInstruments(), onDataFetched.getMaxDaysInFuture(), onDataFetched.getDueDate(), onDataFetched.getCreditAccountId()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.ErrorFetchingData(((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData) event).getErrorUiModel(), loading.getCreditProductIdentifier(), loading.getCreditAccountId()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Loading(onViewCreated.getCreditProductIdentifier(), onViewCreated.getCreditAccountId(), onViewCreated.getMaxRepayableAmountIsInvalid()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
