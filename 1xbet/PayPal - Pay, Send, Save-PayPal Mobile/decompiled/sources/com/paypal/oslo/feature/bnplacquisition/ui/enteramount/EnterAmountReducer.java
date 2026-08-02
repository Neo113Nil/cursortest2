package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r0\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig;", "config", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig;)V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountEvent;)Larrow/core/Either;", "", "getName", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig;", "getConfig", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/enteramount/EnterAmountConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnterAmountReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig config;

    @javax.inject.Inject
    public EnterAmountReducer(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountConfig, "");
        this.config = enterAmountConfig;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig getConfig() {
        return this.config;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState state, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect>> output;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel copy;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel copy2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess copy3;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel copy4;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel copy5;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel copy6;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel copy7;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel copy8;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel copy9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Success)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.ApiLoading)) {
                    if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Error)) {
                        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Decline)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Decline decline = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Decline) state;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.DeclineClosePressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(decline, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.CloseAcquisition.INSTANCE);
                        } else {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(decline, event);
                        }
                    } else {
                        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ErrorBackPressed) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ErrorBackPressed) event).getModel()), null, 2, null);
                        } else {
                            output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ClosePressed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                        }
                    }
                } else {
                    com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.ApiLoading apiLoading = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.ApiLoading) state;
                    if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateCreditSuccess)) {
                        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SwitchToSuccess) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SwitchToSuccess) event).getModel()), null, 2, null);
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Error(((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError) event).getErrorContent(), apiLoading.getModel()), null, 2, null);
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Decline(((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined) event).getDeclineContent()), null, 2, null);
                        } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateApplicationSuccess)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(apiLoading, event);
                        } else {
                            copy = r3.copy((r34 & 1) != 0 ? r3.min : 0.0d, (r34 & 2) != 0 ? r3.max : 0.0d, (r34 & 4) != 0 ? r3.content : null, (r34 & 8) != 0 ? r3.maxDigits : 0, (r34 & 16) != 0 ? r3.currencyCode : null, (r34 & 32) != 0 ? r3.amountInput : null, (r34 & 64) != 0 ? r3.isSymbolInFront : false, (r34 & 128) != 0 ? r3.howItWorksImageUrl : null, (r34 & 256) != 0 ? r3.longTermUrl : null, (r34 & 512) != 0 ? r3.shouldShowValidationError : false, (r34 & 1024) != 0 ? r3.howItWorksUiModel : null, (r34 & 2048) != 0 ? r3.apiSuccessful : true, (r34 & 4096) != 0 ? r3.spendingPowerText : null, (r34 & 8192) != 0 ? r3.showPrequal : false, (r34 & 16384) != 0 ? apiLoading.getModel().toolBarContent : null);
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(apiLoading.copy(copy), new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToOffers(((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateApplicationSuccess) event).getCreditApplication()));
                        }
                    } else {
                        copy2 = r5.copy((r34 & 1) != 0 ? r5.min : 0.0d, (r34 & 2) != 0 ? r5.max : 0.0d, (r34 & 4) != 0 ? r5.content : null, (r34 & 8) != 0 ? r5.maxDigits : 0, (r34 & 16) != 0 ? r5.currencyCode : null, (r34 & 32) != 0 ? r5.amountInput : null, (r34 & 64) != 0 ? r5.isSymbolInFront : false, (r34 & 128) != 0 ? r5.howItWorksImageUrl : null, (r34 & 256) != 0 ? r5.longTermUrl : null, (r34 & 512) != 0 ? r5.shouldShowValidationError : false, (r34 & 1024) != 0 ? r5.howItWorksUiModel : null, (r34 & 2048) != 0 ? r5.apiSuccessful : true, (r34 & 4096) != 0 ? r5.spendingPowerText : null, (r34 & 8192) != 0 ? r5.showPrequal : false, (r34 & 16384) != 0 ? apiLoading.getModel().toolBarContent : null);
                        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.ApiLoading copy10 = apiLoading.copy(copy2);
                        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateCreditSuccess createCreditSuccess = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateCreditSuccess) event;
                        copy3 = r3.copy((r18 & 1) != 0 ? r3.documents : null, (r18 & 2) != 0 ? r3.userInfo : null, (r18 & 4) != 0 ? r3.loanAmount : null, (r18 & 8) != 0 ? r3.creditAccountId : null, (r18 & 16) != 0 ? r3.requiredConsents : null, (r18 & 32) != 0 ? r3.eligibleCPIs : createCreditSuccess.getEligibleOfferCPIs(), (r18 & 64) != 0 ? r3.paymentFundingInstruments : null, (r18 & 128) != 0 ? createCreditSuccess.getData().selectedPaymentFundingInstrument : null);
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy10, new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPersonalInfo(copy3));
                    }
                }
            } else {
                com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Success) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Pressed.INSTANCE)) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Valid.INSTANCE)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.Continue.Invalid.INSTANCE)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.CloseAcquisition.INSTANCE);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ShowKeyboard.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.ShowKeyboard.INSTANCE);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.HideKeyboard.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.HideKeyboard.INSTANCE);
                        } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.AmountChanged)) {
                            if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded)) {
                                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckIfFirstTimeOnScreen) {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.HowItWorksPressed.INSTANCE)) {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.ShowHowItWorks.INSTANCE);
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerInfoPressed.INSTANCE)) {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToSpendingPowerFaq.INSTANCE);
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LongTermUrlPressed.INSTANCE)) {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayMonthly(success.getModel().getLongTermUrl()));
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ShortTermUrlPressed.INSTANCE)) {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToPayIn4.INSTANCE);
                                } else {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                                }
                            } else {
                                copy4 = r5.copy((r34 & 1) != 0 ? r5.min : 0.0d, (r34 & 2) != 0 ? r5.max : 0.0d, (r34 & 4) != 0 ? r5.content : null, (r34 & 8) != 0 ? r5.maxDigits : 0, (r34 & 16) != 0 ? r5.currencyCode : null, (r34 & 32) != 0 ? r5.amountInput : null, (r34 & 64) != 0 ? r5.isSymbolInFront : false, (r34 & 128) != 0 ? r5.howItWorksImageUrl : null, (r34 & 256) != 0 ? r5.longTermUrl : null, (r34 & 512) != 0 ? r5.shouldShowValidationError : false, (r34 & 1024) != 0 ? r5.howItWorksUiModel : null, (r34 & 2048) != 0 ? r5.apiSuccessful : false, (r34 & 4096) != 0 ? r5.spendingPowerText : ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded) event).getSpendingPowerText(), (r34 & 8192) != 0 ? r5.showPrequal : false, (r34 & 16384) != 0 ? success.getModel().toolBarContent : null);
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy4), null, 2, null);
                            }
                        } else {
                            copy5 = r5.copy((r34 & 1) != 0 ? r5.min : 0.0d, (r34 & 2) != 0 ? r5.max : 0.0d, (r34 & 4) != 0 ? r5.content : null, (r34 & 8) != 0 ? r5.maxDigits : 0, (r34 & 16) != 0 ? r5.currencyCode : null, (r34 & 32) != 0 ? r5.amountInput : ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.AmountChanged) event).getAmount(), (r34 & 64) != 0 ? r5.isSymbolInFront : false, (r34 & 128) != 0 ? r5.howItWorksImageUrl : null, (r34 & 256) != 0 ? r5.longTermUrl : null, (r34 & 512) != 0 ? r5.shouldShowValidationError : false, (r34 & 1024) != 0 ? r5.howItWorksUiModel : null, (r34 & 2048) != 0 ? r5.apiSuccessful : false, (r34 & 4096) != 0 ? r5.spendingPowerText : null, (r34 & 8192) != 0 ? r5.showPrequal : false, (r34 & 16384) != 0 ? success.getModel().toolBarContent : null);
                            copy6 = copy5.copy((r34 & 1) != 0 ? copy5.min : 0.0d, (r34 & 2) != 0 ? copy5.max : 0.0d, (r34 & 4) != 0 ? copy5.content : null, (r34 & 8) != 0 ? copy5.maxDigits : 0, (r34 & 16) != 0 ? copy5.currencyCode : null, (r34 & 32) != 0 ? copy5.amountInput : null, (r34 & 64) != 0 ? copy5.isSymbolInFront : false, (r34 & 128) != 0 ? copy5.howItWorksImageUrl : null, (r34 & 256) != 0 ? copy5.longTermUrl : null, (r34 & 512) != 0 ? copy5.shouldShowValidationError : !copy5.isValid(), (r34 & 1024) != 0 ? copy5.howItWorksUiModel : null, (r34 & 2048) != 0 ? copy5.apiSuccessful : false, (r34 & 4096) != 0 ? copy5.spendingPowerText : null, (r34 & 8192) != 0 ? copy5.showPrequal : false, (r34 & 16384) != 0 ? copy5.toolBarContent : null);
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy6), null, 2, null);
                        }
                    } else {
                        copy7 = r5.copy((r34 & 1) != 0 ? r5.min : 0.0d, (r34 & 2) != 0 ? r5.max : 0.0d, (r34 & 4) != 0 ? r5.content : null, (r34 & 8) != 0 ? r5.maxDigits : 0, (r34 & 16) != 0 ? r5.currencyCode : null, (r34 & 32) != 0 ? r5.amountInput : null, (r34 & 64) != 0 ? r5.isSymbolInFront : false, (r34 & 128) != 0 ? r5.howItWorksImageUrl : null, (r34 & 256) != 0 ? r5.longTermUrl : null, (r34 & 512) != 0 ? r5.shouldShowValidationError : true, (r34 & 1024) != 0 ? r5.howItWorksUiModel : null, (r34 & 2048) != 0 ? r5.apiSuccessful : false, (r34 & 4096) != 0 ? r5.spendingPowerText : null, (r34 & 8192) != 0 ? r5.showPrequal : false, (r34 & 16384) != 0 ? success.getModel().toolBarContent : null);
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy7), null, 2, null);
                    }
                } else {
                    copy8 = r5.copy((r34 & 1) != 0 ? r5.min : 0.0d, (r34 & 2) != 0 ? r5.max : 0.0d, (r34 & 4) != 0 ? r5.content : null, (r34 & 8) != 0 ? r5.maxDigits : 0, (r34 & 16) != 0 ? r5.currencyCode : null, (r34 & 32) != 0 ? r5.amountInput : null, (r34 & 64) != 0 ? r5.isSymbolInFront : false, (r34 & 128) != 0 ? r5.howItWorksImageUrl : null, (r34 & 256) != 0 ? r5.longTermUrl : null, (r34 & 512) != 0 ? r5.shouldShowValidationError : false, (r34 & 1024) != 0 ? r5.howItWorksUiModel : null, (r34 & 2048) != 0 ? r5.apiSuccessful : false, (r34 & 4096) != 0 ? r5.spendingPowerText : null, (r34 & 8192) != 0 ? r5.showPrequal : false, (r34 & 16384) != 0 ? success.getModel().toolBarContent : null);
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.ApiLoading(copy8), null, 2, null);
                }
            }
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Loading loading = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckScreenLock) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.NavigateToRequireScreenLock.INSTANCE);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ScreenLockCompleted) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ScreenLockCancelled) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiEffect.CloseAcquisition.INSTANCE);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CreateExperienceSession) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ExperienceSessionCreated) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading.copy(((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded) event).getSpendingPowerText()), null, 2, null);
            } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LoanConstraintsLoaded)) {
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Error(((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError) event).getErrorContent(), null), null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Decline(((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined) event).getDeclineContent()), null, 2, null);
                } else {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                }
            } else {
                copy9 = r5.copy((r34 & 1) != 0 ? r5.min : 0.0d, (r34 & 2) != 0 ? r5.max : 0.0d, (r34 & 4) != 0 ? r5.content : null, (r34 & 8) != 0 ? r5.maxDigits : 0, (r34 & 16) != 0 ? r5.currencyCode : null, (r34 & 32) != 0 ? r5.amountInput : null, (r34 & 64) != 0 ? r5.isSymbolInFront : false, (r34 & 128) != 0 ? r5.howItWorksImageUrl : null, (r34 & 256) != 0 ? r5.longTermUrl : null, (r34 & 512) != 0 ? r5.shouldShowValidationError : false, (r34 & 1024) != 0 ? r5.howItWorksUiModel : null, (r34 & 2048) != 0 ? r5.apiSuccessful : false, (r34 & 4096) != 0 ? r5.spendingPowerText : loading.getPendingSpendingPowerText(), (r34 & 8192) != 0 ? r5.showPrequal : false, (r34 & 16384) != 0 ? ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LoanConstraintsLoaded) event).getModel().toolBarContent : null);
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiState.Success(copy9), null, 2, null);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), output.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), output.isLeft());
        return output;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "EnterAmountReducer";
    }
}
