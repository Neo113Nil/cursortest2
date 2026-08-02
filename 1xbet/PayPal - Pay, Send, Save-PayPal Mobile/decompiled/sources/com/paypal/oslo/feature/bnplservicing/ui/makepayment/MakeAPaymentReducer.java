package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00100\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakePaymentValidator;", "validator", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakePaymentValidator;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiState;Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;)Larrow/core/Either;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakePaymentValidator;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MakeAPaymentReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakePaymentValidator getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public MakeAPaymentReducer(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakePaymentValidator makePaymentValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makePaymentValidator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = makePaymentValidator;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "MakeAPaymentReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect>> reduce(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState state, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect>> output$default;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel uiModel;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel copy;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel copy2;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel copy3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Error error = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Error) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.NavigateBack.INSTANCE)) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.Back.INSTANCE);
                } else {
                    output$default = kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.LoadData.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
            } else {
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success success = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success) state;
                if (!(event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ConfirmAndPayPressed)) {
                    if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.NavigateBack) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.Back.INSTANCE);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success(((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded) event).getUiModel(), null, null, 6, null), null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ShowErrorScreen) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Error.INSTANCE, null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.PaymentAuthorizationPressed) {
                        com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions = success.getUiModel().getTermsAndConditions();
                        java.lang.String url = termsAndConditions != null ? termsAndConditions.getUrl() : null;
                        if (url != null) {
                            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.OpenPaymentAuthorization(INSTANCE.buildPaymentAuthorizationDocument$bnpl_servicing_prodRelease(url, success.getUiModel())));
                        } else {
                            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                        }
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.AmountSelected) {
                        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.AmountSelected amountSelected = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.AmountSelected) event;
                        copy3 = r7.copy((r42 & 1) != 0 ? r7.content : null, (r42 & 2) != 0 ? r7.planStatus : null, (r42 & 4) != 0 ? r7.creditProductIdentifier : null, (r42 & 8) != 0 ? r7.creditAccountId : null, (r42 & 16) != 0 ? r7.currentDueAmount : null, (r42 & 32) != 0 ? r7.isAutopayEnabled : false, (r42 & 64) != 0 ? r7.paymentOptions : null, (r42 & 128) != 0 ? r7.customAmountOption : null, (r42 & 256) != 0 ? r7.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? r7.defaultFundingInstrument : null, (r42 & 1024) != 0 ? r7.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? r7.termsAndConditions : null, (r42 & 4096) != 0 ? r7.currencyCode : null, (r42 & 8192) != 0 ? r7.selectedAmount : amountSelected.getAmount(), (r42 & 16384) != 0 ? r7.selectedFundingInstrument : null, (r42 & 32768) != 0 ? r7.processingMakeAPayment : false, (r42 & 65536) != 0 ? r7.formAlertMessage : null, (r42 & 131072) != 0 ? r7.customAmountAlertMessage : null, (r42 & 262144) != 0 ? r7.isCustomAmountInError : false, (r42 & 524288) != 0 ? r7.selectedIndex : java.lang.Integer.valueOf(amountSelected.getIndex()), (r42 & 1048576) != 0 ? r7.fundingInstruments : null, (r42 & 2097152) != 0 ? r7.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? r7.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? success.getUiModel().locale : null);
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success.copy$default(success, this.getHighResolutionOutputSizeshNQ4ISI.validateAmount(copy3), null, null, 6, null), null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangePaymentMethodPressed) {
                        java.lang.String creditAccountId = success.getUiModel().getCreditAccountId();
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = success.getUiModel().getCreditProductIdentifier();
                        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument currentFundingInstrument = success.getUiModel().getCurrentFundingInstrument();
                        java.lang.String id = currentFundingInstrument != null ? currentFundingInstrument.getId() : null;
                        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType = com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType.MAKE_A_PAYMENT;
                        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments = success.getUiModel().getFundingInstruments();
                        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> supportingFundingInstrumentsToAdd = success.getUiModel().getSupportingFundingInstrumentsToAdd();
                        com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions2 = success.getUiModel().getTermsAndConditions();
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success.copy$default(success, null, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel(creditAccountId, creditProductIdentifier, id, changeFiFlowType, fundingInstruments, supportingFundingInstrumentsToAdd, termsAndConditions2 != null ? termsAndConditions2.getUrl() : null), null, 5, null), null, 2, null);
                    } else if (!(event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.FundingInstrumentSelected)) {
                        if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentSucceeded) {
                            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToPaymentSuccess(((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentSucceeded) event).getData()));
                        } else if (!(event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentError)) {
                            if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangeFiDismissed) {
                                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangeFiDismissed changeFiDismissed = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangeFiDismissed) event;
                                if (changeFiDismissed.getUpdatedFundingInstruments().isEmpty()) {
                                    uiModel = success.getUiModel();
                                } else {
                                    uiModel = r7.copy((r42 & 1) != 0 ? r7.content : null, (r42 & 2) != 0 ? r7.planStatus : null, (r42 & 4) != 0 ? r7.creditProductIdentifier : null, (r42 & 8) != 0 ? r7.creditAccountId : null, (r42 & 16) != 0 ? r7.currentDueAmount : null, (r42 & 32) != 0 ? r7.isAutopayEnabled : false, (r42 & 64) != 0 ? r7.paymentOptions : null, (r42 & 128) != 0 ? r7.customAmountOption : null, (r42 & 256) != 0 ? r7.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? r7.defaultFundingInstrument : null, (r42 & 1024) != 0 ? r7.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? r7.termsAndConditions : null, (r42 & 4096) != 0 ? r7.currencyCode : null, (r42 & 8192) != 0 ? r7.selectedAmount : null, (r42 & 16384) != 0 ? r7.selectedFundingInstrument : null, (r42 & 32768) != 0 ? r7.processingMakeAPayment : false, (r42 & 65536) != 0 ? r7.formAlertMessage : null, (r42 & 131072) != 0 ? r7.customAmountAlertMessage : null, (r42 & 262144) != 0 ? r7.isCustomAmountInError : false, (r42 & 524288) != 0 ? r7.selectedIndex : null, (r42 & 1048576) != 0 ? r7.fundingInstruments : changeFiDismissed.getUpdatedFundingInstruments(), (r42 & 2097152) != 0 ? r7.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? r7.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? success.getUiModel().locale : null);
                                }
                                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success.copy$default(success, uiModel, null, null, 4, null), null, 2, null);
                            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnAddFiSuccess) {
                                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success.copy$default(success, null, null, ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnAddFiSuccess) event).getNewFiIds(), 3, null), null, 2, null);
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnNewFiConsumed.INSTANCE)) {
                                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success.copy$default(success, null, null, kotlin.collections.CollectionsKt.emptyList(), 3, null), null, 2, null);
                            } else {
                                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                            }
                        } else {
                            copy = r7.copy((r42 & 1) != 0 ? r7.content : null, (r42 & 2) != 0 ? r7.planStatus : null, (r42 & 4) != 0 ? r7.creditProductIdentifier : null, (r42 & 8) != 0 ? r7.creditAccountId : null, (r42 & 16) != 0 ? r7.currentDueAmount : null, (r42 & 32) != 0 ? r7.isAutopayEnabled : false, (r42 & 64) != 0 ? r7.paymentOptions : null, (r42 & 128) != 0 ? r7.customAmountOption : null, (r42 & 256) != 0 ? r7.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? r7.defaultFundingInstrument : null, (r42 & 1024) != 0 ? r7.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? r7.termsAndConditions : null, (r42 & 4096) != 0 ? r7.currencyCode : null, (r42 & 8192) != 0 ? r7.selectedAmount : null, (r42 & 16384) != 0 ? r7.selectedFundingInstrument : null, (r42 & 32768) != 0 ? r7.processingMakeAPayment : false, (r42 & 65536) != 0 ? r7.formAlertMessage : null, (r42 & 131072) != 0 ? r7.customAmountAlertMessage : null, (r42 & 262144) != 0 ? r7.isCustomAmountInError : false, (r42 & 524288) != 0 ? r7.selectedIndex : null, (r42 & 1048576) != 0 ? r7.fundingInstruments : null, (r42 & 2097152) != 0 ? r7.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? r7.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? success.getUiModel().locale : null);
                            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success.copy$default(success, copy, null, null, 6, null), com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.ShowPaymentError.INSTANCE);
                        }
                    } else {
                        copy2 = r7.copy((r42 & 1) != 0 ? r7.content : null, (r42 & 2) != 0 ? r7.planStatus : null, (r42 & 4) != 0 ? r7.creditProductIdentifier : null, (r42 & 8) != 0 ? r7.creditAccountId : null, (r42 & 16) != 0 ? r7.currentDueAmount : null, (r42 & 32) != 0 ? r7.isAutopayEnabled : false, (r42 & 64) != 0 ? r7.paymentOptions : null, (r42 & 128) != 0 ? r7.customAmountOption : null, (r42 & 256) != 0 ? r7.formattedCurrentDueAmount : null, (r42 & 512) != 0 ? r7.defaultFundingInstrument : null, (r42 & 1024) != 0 ? r7.addFundingInstrumentLinks : null, (r42 & 2048) != 0 ? r7.termsAndConditions : null, (r42 & 4096) != 0 ? r7.currencyCode : null, (r42 & 8192) != 0 ? r7.selectedAmount : null, (r42 & 16384) != 0 ? r7.selectedFundingInstrument : ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.FundingInstrumentSelected) event).getFundingInstrument(), (r42 & 32768) != 0 ? r7.processingMakeAPayment : false, (r42 & 65536) != 0 ? r7.formAlertMessage : null, (r42 & 131072) != 0 ? r7.customAmountAlertMessage : null, (r42 & 262144) != 0 ? r7.isCustomAmountInError : false, (r42 & 524288) != 0 ? r7.selectedIndex : null, (r42 & 1048576) != 0 ? r7.fundingInstruments : null, (r42 & 2097152) != 0 ? r7.supportingFundingInstrumentsToAdd : null, (r42 & 4194304) != 0 ? r7.shouldShowOtherAmountOption : false, (r42 & 8388608) != 0 ? success.getUiModel().locale : null);
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success.copy$default(success, this.getHighResolutionOutputSizeshNQ4ISI.revalidateIfNeeded(copy2), null, null, 6, null), null, 2, null);
                    }
                } else if (success.getUiModel().getCurrentFundingInstrument() == null) {
                    com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success success2 = success;
                    java.lang.String creditAccountId2 = success.getUiModel().getCreditAccountId();
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier2 = success.getUiModel().getCreditProductIdentifier();
                    com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument currentFundingInstrument2 = success.getUiModel().getCurrentFundingInstrument();
                    java.lang.String id2 = currentFundingInstrument2 != null ? currentFundingInstrument2.getId() : null;
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType changeFiFlowType2 = com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType.MAKE_A_PAYMENT;
                    java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments2 = success.getUiModel().getFundingInstruments();
                    java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> supportingFundingInstrumentsToAdd2 = success.getUiModel().getSupportingFundingInstrumentsToAdd();
                    com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions3 = success.getUiModel().getTermsAndConditions();
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success2, new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToChangePaymentMethod(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel(creditAccountId2, creditProductIdentifier2, id2, changeFiFlowType2, fundingInstruments2, supportingFundingInstrumentsToAdd2, termsAndConditions3 != null ? termsAndConditions3.getUrl() : null)));
                } else {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success.copy$default(success, this.getHighResolutionOutputSizeshNQ4ISI.validateForm(success.getUiModel()), null, null, 6, null), null, 2, null);
                }
            }
        } else {
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Loading loading = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Loading) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.NavigateBack.INSTANCE)) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.Back.INSTANCE);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.LoadData) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success(((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded) event).getUiModel(), null, null, 6, null), null, 2, null);
            } else {
                output$default = event instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ShowErrorScreen ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Error.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            }
        }
        if (output$default instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), false, 4, null);
            return output$default;
        }
        if (output$default instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), true);
            return output$default;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentReducer$Companion;", "", "<init>", "()V", "", "url", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;", "uiModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "buildPaymentAuthorizationDocument$bnpl_servicing_prodRelease", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel buildPaymentAuthorizationDocument$bnpl_servicing_prodRelease(java.lang.String url, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel.INSTANCE.buildPaymentAuthorizationDocument(url, uiModel.getCreditAccountId(), uiModel.getCreditProductIdentifier());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
