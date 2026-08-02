package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00120\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayValidator;", "validator", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayPaymentMethodMapper;", "paymentMethodMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayValidator;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayPaymentMethodMapper;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;)Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayValidator;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayPaymentMethodMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayPaymentMethodMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AutopayReducer(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator autopayValidator, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayPaymentMethodMapper autopayPaymentMethodMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayValidator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayPaymentMethodMapper, "");
        this.Camera2StreamConfigurationMap = autopayValidator;
        this.getHighResolutionOutputSizeshNQ4ISI = autopayPaymentMethodMapper;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AutopayReducer";
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0247 A[LOOP:0: B:70:0x0241->B:72:0x0247, LOOP_END] */
    @Override // com.paypal.oslo.core.mvi.Reducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent event) {
        com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction autopayAction;
        java.util.ArrayList arrayList;
        java.lang.String id;
        java.lang.Object obj;
        boolean areEqual;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel copy;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel copy2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready copy3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel copy4;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready copy5;
        java.lang.String str;
        java.util.Iterator<T> it;
        java.math.BigDecimal amount;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel copy6;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel copy7;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready copy8;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountUiModel copy9;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel copy10;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready copy11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        java.lang.String str2 = null;
        if (state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Initial) {
            return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnViewCreated ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading(((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnViewCreated) event).getCreditAccountId()), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Initial) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate)) {
                        if (state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.UpdateCompleted) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate processingAutopayPreferenceUpdate = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopaySuccess) {
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.UpdateCompleted updateCompleted = com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.UpdateCompleted.INSTANCE;
                        if (processingAutopayPreferenceUpdate.getEnrolled()) {
                            autopayAction = processingAutopayPreferenceUpdate.isNewEnrollment() ? com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction.AUTOPAY_SCHEDULED : com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction.AUTOPAY_UPDATED;
                        } else {
                            autopayAction = com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction.AUTOPAY_CANCELED;
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(updateCompleted, new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateBack(autopayAction, java.lang.Boolean.valueOf(((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopaySuccess) event).getEffectiveInCurrentBillingCycle())));
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopayError) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay(processingAutopayPreferenceUpdate.getData(), processingAutopayPreferenceUpdate.getCreditProductIdentifier(), processingAutopayPreferenceUpdate.getFundingInstruments(), processingAutopayPreferenceUpdate.getCreditAccountId(), processingAutopayPreferenceUpdate.getMaxAllowableRepaymentAmount(), processingAutopayPreferenceUpdate.getCurrencyCode(), processingAutopayPreferenceUpdate.getEnrolled(), processingAutopayPreferenceUpdate.isNewEnrollment(), processingAutopayPreferenceUpdate.getSelectedOption(), processingAutopayPreferenceUpdate.getCustomAmount(), processingAutopayPreferenceUpdate.getSelectedFundingInstruments())), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(processingAutopayPreferenceUpdate, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error) state;
                if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTryAgainClicked)) {
                    return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnBackClicked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateBack(null, null, 3, null)) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext context = error.getContext();
                if (context instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.FetchingData) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading(((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.FetchingData) error.getContext()).getCreditAccountId()), null, 2, null);
                }
                if (!(context instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate(((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) error.getContext()).getData(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) error.getContext()).getCreditProductIdentifier(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) error.getContext()).getFundingInstruments(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) error.getContext()).getCreditAccountId(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) error.getContext()).getMaxAllowableRepaymentAmount(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) error.getContext()).getCurrencyCode(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) error.getContext()).getEnrolled(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) error.getContext()).isNewEnrollment(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) error.getContext()).getSelectedOption(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) error.getContext()).getCustomAmount(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) error.getContext()).getSelectedFundingInstruments()), null, 2, null);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnViewCreated) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
            }
            if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnOptionChanged)) {
                if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCustomAmountChanged)) {
                    if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodActionClicked)) {
                        if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected)) {
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTermsAndConditionsClicked) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.ShowTermsAndConditions(((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTermsAndConditionsClicked) event).getUrl()));
                            }
                            if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnConfirmClicked)) {
                                if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCancelClicked)) {
                                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCancelAutopayConfirmed) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate(ready.getData(), ready.getCreditProductIdentifier(), ready.getEligibleFundingInstruments(), ready.getCreditAccountId(), ready.getMaxAllowableRepaymentAmount(), ready.getCurrencyCode(), false, false, null, null, null, 128, null), null, 2, null);
                                    }
                                    return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnBackClicked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateBack(null, null, 3, null)) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.ShowCancelAutopayBottomSheet.INSTANCE);
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.ConfirmValidationResult validateOnConfirm = this.Camera2StreamConfigurationMap.validateOnConfirm(ready.getData().getSelectAmountData().getSelectedOption(), ready.getData().getSelectAmountData().getCustomAmount(), ready.getMaxAllowableRepaymentAmount(), ready.getData().getPaymentMethodData().getSelectedPaymentMethod() != null);
                            if (validateOnConfirm.getHasErrors()) {
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data = ready.getData();
                                copy = r10.copy((r26 & 1) != 0 ? r10.options : null, (r26 & 2) != 0 ? r10.selectedOption : null, (r26 & 4) != 0 ? r10.selectedAmount : null, (r26 & 8) != 0 ? r10.customAmount : null, (r26 & 16) != 0 ? r10.customAmountError : validateOnConfirm.getCustomAmountError(), (r26 & 32) != 0 ? r10.generalErrorMessage : validateOnConfirm.getPaymentAmountError(), (r26 & 64) != 0 ? r10.formattedMaxAmount : null, (r26 & 128) != 0 ? r10.maxAmount : null, (r26 & 256) != 0 ? r10.formattedZeroAmount : null, (r26 & 512) != 0 ? r10.maxCustomAmount : null, (r26 & 1024) != 0 ? r10.hintText : null, (r26 & 2048) != 0 ? ready.getData().getSelectAmountData().localeString : null);
                                copy2 = data.copy((r18 & 1) != 0 ? data.title : null, (r18 & 2) != 0 ? data.selectAmountData : copy, (r18 & 4) != 0 ? data.paymentMethodData : com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.PaymentMethodUiModel.copy$default(ready.getData().getPaymentMethodData(), null, null, null, validateOnConfirm.getPaymentMethodError(), null, 23, null), (r18 & 8) != 0 ? data.scheduleInfoText : null, (r18 & 16) != 0 ? data.termsAndConditionUrl : null, (r18 & 32) != 0 ? data.isEnrolled : false, (r18 & 64) != 0 ? data.cancelButtonText : null, (r18 & 128) != 0 ? data.currencyCode : null);
                                copy3 = ready.copy((r20 & 1) != 0 ? ready.data : copy2, (r20 & 2) != 0 ? ready.creditProductIdentifier : null, (r20 & 4) != 0 ? ready.eligibleFundingInstruments : null, (r20 & 8) != 0 ? ready.creditAccountId : null, (r20 & 16) != 0 ? ready.maxAllowableRepaymentAmount : null, (r20 & 32) != 0 ? ready.currencyCode : null, (r20 & 64) != 0 ? ready.originalSelectedOption : null, (r20 & 128) != 0 ? ready.originalCustomAmount : null, (r20 & 256) != 0 ? ready.originalFundingInstrumentIds : null);
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy3, null, 2, null);
                            }
                            if (!ready.isSubmitRequired$revolvingcredit_servicing_prodRelease()) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateBack(null, null, 3, null));
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data2 = ready.getData();
                            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = ready.getCreditProductIdentifier();
                            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments = ready.getEligibleFundingInstruments();
                            java.lang.String creditAccountId = ready.getCreditAccountId();
                            java.math.BigDecimal maxAllowableRepaymentAmount = ready.getMaxAllowableRepaymentAmount();
                            java.lang.String currencyCode = ready.getCurrencyCode();
                            boolean isEnrolled = ready.getData().isEnrolled();
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption = ready.getData().getSelectAmountData().getSelectedOption();
                            java.math.BigDecimal selectedAmount = ready.getData().getSelectAmountData().getSelectedOption() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT ? ready.getData().getSelectAmountData().getSelectedAmount() : null;
                            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstrument = ready.getData().getPaymentMethodData().getFundingInstrument();
                            if (fundingInstrument != null) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                for (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument2 : fundingInstrument) {
                                    if (fundingInstrument2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) {
                                        id = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) fundingInstrument2).getId();
                                    } else if (fundingInstrument2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) {
                                        id = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) fundingInstrument2).getId();
                                    } else {
                                        if (!(fundingInstrument2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        id = ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard) fundingInstrument2).getId();
                                    }
                                    java.util.Iterator<T> it2 = ready.getEligibleFundingInstruments().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it2.next();
                                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument eligiblePaymentInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument) obj;
                                        if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) {
                                            areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) eligiblePaymentInstrument).getId(), id);
                                        } else if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) {
                                            areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) eligiblePaymentInstrument).getId(), id);
                                        } else {
                                            if (!(eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card)) {
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                            areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) eligiblePaymentInstrument).getId(), id);
                                        }
                                        if (areEqual) {
                                            break;
                                        }
                                    }
                                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument eligiblePaymentInstrument2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument) obj;
                                    if (eligiblePaymentInstrument2 != null) {
                                        arrayList2.add(eligiblePaymentInstrument2);
                                    }
                                }
                                arrayList = arrayList2;
                            } else {
                                arrayList = null;
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate(data2, creditProductIdentifier, eligibleFundingInstruments, creditAccountId, maxAllowableRepaymentAmount, currencyCode, true, !isEnrolled, selectedOption, selectedAmount, arrayList), null, 2, null);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected onPaymentMethodSelected = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected) event;
                        copy4 = r9.copy((r18 & 1) != 0 ? r9.title : null, (r18 & 2) != 0 ? r9.selectAmountData : null, (r18 & 4) != 0 ? r9.paymentMethodData : com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.PaymentMethodUiModel.copy$default(ready.getData().getPaymentMethodData(), null, null, this.getHighResolutionOutputSizeshNQ4ISI.createSelectedPaymentMethodUiModel(onPaymentMethodSelected, ready.getEligibleFundingInstruments()), null, this.getHighResolutionOutputSizeshNQ4ISI.buildFundingInstrumentsList(onPaymentMethodSelected, ready.getEligibleFundingInstruments()), 3, null), (r18 & 8) != 0 ? r9.scheduleInfoText : null, (r18 & 16) != 0 ? r9.termsAndConditionUrl : null, (r18 & 32) != 0 ? r9.isEnrolled : false, (r18 & 64) != 0 ? r9.cancelButtonText : null, (r18 & 128) != 0 ? ready.getData().currencyCode : null);
                        copy5 = ready.copy((r20 & 1) != 0 ? ready.data : copy4, (r20 & 2) != 0 ? ready.creditProductIdentifier : null, (r20 & 4) != 0 ? ready.eligibleFundingInstruments : null, (r20 & 8) != 0 ? ready.creditAccountId : null, (r20 & 16) != 0 ? ready.maxAllowableRepaymentAmount : null, (r20 & 32) != 0 ? ready.currencyCode : null, (r20 & 64) != 0 ? ready.originalSelectedOption : null, (r20 & 128) != 0 ? ready.originalCustomAmount : null, (r20 & 256) != 0 ? ready.originalFundingInstrumentIds : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy5, null, 2, null);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready ready2 = ready;
                    java.lang.String creditAccountId2 = ready.getCreditAccountId();
                    java.lang.String str3 = creditAccountId2 == null ? "" : creditAccountId2;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = ready.getCreditProductIdentifier();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption2 = ready.getData().getSelectAmountData().getSelectedOption();
                    int i = selectedOption2 == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer.WhenMappings.$EnumSwitchMapping$0[selectedOption2.ordinal()];
                    if (i != -1) {
                        if (i == 1 || i == 2 || i == 3) {
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.selectamount.uimodel.SelectAmountOptionUiModel selectAmountOptionUiModel = ready.getData().getSelectAmountData().getOptions().get(ready.getData().getSelectAmountData().getSelectedOption());
                            if (selectAmountOptionUiModel != null && (amount = selectAmountOptionUiModel.getAmount()) != null) {
                                str2 = amount.toString();
                            }
                            str = str2 == null ? "" : str2;
                        } else if (i == 4) {
                            str = ready.getData().getSelectAmountData().getSelectedAmount().toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                        } else if (i != 5) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        java.lang.String currencyCode2 = ready.getCurrencyCode();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(currencyCode2 != null ? currencyCode2 : "", str);
                        java.lang.String termsAndConditionUrl = ready.getData().getTermsAndConditionUrl();
                        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments2 = ready.getEligibleFundingInstruments();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(eligibleFundingInstruments2, 10));
                        it = eligibleFundingInstruments2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrumentMapperKt.toFundingInstrument((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument) it.next()));
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateToChoosePaymentMethod(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs(str3, creditProductIdentifier2, currencyAmount, termsAndConditionUrl, (java.util.List) arrayList3, this.getHighResolutionOutputSizeshNQ4ISI.selectPrimaryFundingInstrument(ready.getData().getPaymentMethodData().getFundingInstrument()), false, true, 90, (java.time.LocalDate) null, 576, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                    }
                    str = "0";
                    java.lang.String currencyCode22 = ready.getCurrencyCode();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(currencyCode22 != null ? currencyCode22 : "", str);
                    java.lang.String termsAndConditionUrl2 = ready.getData().getTermsAndConditionUrl();
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments22 = ready.getEligibleFundingInstruments();
                    java.util.ArrayList arrayList32 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(eligibleFundingInstruments22, 10));
                    it = eligibleFundingInstruments22.iterator();
                    while (it.hasNext()) {
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayUiEffect.NavigateToChoosePaymentMethod(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs(str3, creditProductIdentifier2, currencyAmount2, termsAndConditionUrl2, (java.util.List) arrayList32, this.getHighResolutionOutputSizeshNQ4ISI.selectPrimaryFundingInstrument(ready.getData().getPaymentMethodData().getFundingInstrument()), false, true, 90, (java.time.LocalDate) null, 576, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCustomAmountChanged onCustomAmountChanged = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCustomAmountChanged) event;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data3 = ready.getData();
                copy6 = r10.copy((r26 & 1) != 0 ? r10.options : null, (r26 & 2) != 0 ? r10.selectedOption : null, (r26 & 4) != 0 ? r10.selectedAmount : com.paypal.oslo.feature.revolvingcreditservicing.utils.BigDecimalExtensionsKt.centsStringToDollars(onCustomAmountChanged.getCustomAmount()), (r26 & 8) != 0 ? r10.customAmount : onCustomAmountChanged.getCustomAmount(), (r26 & 16) != 0 ? r10.customAmountError : this.Camera2StreamConfigurationMap.validateCreditLimitExceeded(onCustomAmountChanged.getCustomAmount(), ready.getMaxAllowableRepaymentAmount()), (r26 & 32) != 0 ? r10.generalErrorMessage : null, (r26 & 64) != 0 ? r10.formattedMaxAmount : null, (r26 & 128) != 0 ? r10.maxAmount : null, (r26 & 256) != 0 ? r10.formattedZeroAmount : null, (r26 & 512) != 0 ? r10.maxCustomAmount : null, (r26 & 1024) != 0 ? r10.hintText : null, (r26 & 2048) != 0 ? ready.getData().getSelectAmountData().localeString : null);
                copy7 = data3.copy((r18 & 1) != 0 ? data3.title : null, (r18 & 2) != 0 ? data3.selectAmountData : copy6, (r18 & 4) != 0 ? data3.paymentMethodData : null, (r18 & 8) != 0 ? data3.scheduleInfoText : null, (r18 & 16) != 0 ? data3.termsAndConditionUrl : null, (r18 & 32) != 0 ? data3.isEnrolled : false, (r18 & 64) != 0 ? data3.cancelButtonText : null, (r18 & 128) != 0 ? data3.currencyCode : null);
                copy8 = ready.copy((r20 & 1) != 0 ? ready.data : copy7, (r20 & 2) != 0 ? ready.creditProductIdentifier : null, (r20 & 4) != 0 ? ready.eligibleFundingInstruments : null, (r20 & 8) != 0 ? ready.creditAccountId : null, (r20 & 16) != 0 ? ready.maxAllowableRepaymentAmount : null, (r20 & 32) != 0 ? ready.currencyCode : null, (r20 & 64) != 0 ? ready.originalSelectedOption : null, (r20 & 128) != 0 ? ready.originalCustomAmount : null, (r20 & 256) != 0 ? ready.originalFundingInstrumentIds : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy8, null, 2, null);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data4 = ready.getData();
            copy9 = r10.copy((r26 & 1) != 0 ? r10.options : null, (r26 & 2) != 0 ? r10.selectedOption : ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnOptionChanged) event).getOption(), (r26 & 4) != 0 ? r10.selectedAmount : null, (r26 & 8) != 0 ? r10.customAmount : null, (r26 & 16) != 0 ? r10.customAmountError : null, (r26 & 32) != 0 ? r10.generalErrorMessage : null, (r26 & 64) != 0 ? r10.formattedMaxAmount : null, (r26 & 128) != 0 ? r10.maxAmount : null, (r26 & 256) != 0 ? r10.formattedZeroAmount : null, (r26 & 512) != 0 ? r10.maxCustomAmount : null, (r26 & 1024) != 0 ? r10.hintText : null, (r26 & 2048) != 0 ? ready.getData().getSelectAmountData().localeString : null);
            copy10 = data4.copy((r18 & 1) != 0 ? data4.title : null, (r18 & 2) != 0 ? data4.selectAmountData : copy9, (r18 & 4) != 0 ? data4.paymentMethodData : null, (r18 & 8) != 0 ? data4.scheduleInfoText : null, (r18 & 16) != 0 ? data4.termsAndConditionUrl : null, (r18 & 32) != 0 ? data4.isEnrolled : false, (r18 & 64) != 0 ? data4.cancelButtonText : null, (r18 & 128) != 0 ? data4.currencyCode : null);
            copy11 = ready.copy((r20 & 1) != 0 ? ready.data : copy10, (r20 & 2) != 0 ? ready.creditProductIdentifier : null, (r20 & 4) != 0 ? ready.eligibleFundingInstruments : null, (r20 & 8) != 0 ? ready.creditAccountId : null, (r20 & 16) != 0 ? ready.maxAllowableRepaymentAmount : null, (r20 & 32) != 0 ? ready.currencyCode : null, (r20 & 64) != 0 ? ready.originalSelectedOption : null, (r20 & 128) != 0 ? ready.originalCustomAmount : null, (r20 & 256) != 0 ? ready.originalFundingInstrumentIds : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy11, null, 2, null);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnViewCreated) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnDataFetched) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnDataFetched onDataFetched = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnDataFetched) event;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data5 = onDataFetched.getData();
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = onDataFetched.getCreditProductIdentifier();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments3 = onDataFetched.getEligibleFundingInstruments();
            java.lang.String creditAccountId3 = onDataFetched.getCreditAccountId();
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready(data5, creditProductIdentifier3, eligibleFundingInstruments3, creditAccountId3 == null ? loading.getCreditAccountId() : creditAccountId3, onDataFetched.getMaxAllowableRepaymentAmount(), onDataFetched.getCurrencyCode(), onDataFetched.getData().getSelectAmountData().getSelectedOption(), onDataFetched.getData().getSelectAmountData().getCustomAmount(), com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayStateKt.toIds(onDataFetched.getData().getPaymentMethodData().getFundingInstrument())), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData onErrorFetchingData = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData) event;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4 = onErrorFetchingData.getCreditProductIdentifier();
            java.lang.String creditAccountId4 = onErrorFetchingData.getCreditAccountId();
            if (creditAccountId4 == null) {
                creditAccountId4 = loading.getCreditAccountId();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.FetchingData(creditProductIdentifier4, creditAccountId4)), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CURRENT_BALANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
