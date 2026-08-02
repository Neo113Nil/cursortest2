package com.paypal.oslo.feature.p2p.ui.crossborder.reducers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/reducers/CrossBorderReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/state/CrossBorderUiState;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/effects/CrossBorderEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/p2p/ui/crossborder/state/CrossBorderUiState;Lcom/paypal/oslo/feature/p2p/ui/crossborder/events/CrossBorderEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrossBorderReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CrossBorderReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CrossBorderReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState, com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect>> reduce(com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState state, com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent event) {
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy;
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy2;
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy3;
        com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect.NavigateToReview navigateToReview;
        java.lang.String str;
        java.lang.String receiveCurrencyCode;
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy4;
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy5;
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy6;
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy7;
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy8;
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy9;
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy10;
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize) {
            com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize initialize = (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize) event;
            boolean z = initialize.getInitialReceiveAmount().length() > 0 && !kotlin.jvm.internal.Intrinsics.areEqual(initialize.getInitialReceiveAmount(), "0");
            boolean z2 = initialize.getInitialAmount().length() > 0 && !kotlin.jvm.internal.Intrinsics.areEqual(initialize.getInitialAmount(), "0");
            boolean z3 = z2 && z;
            java.lang.String initialAmount = (z3 || !z) ? initialize.getInitialAmount() : "";
            copy11 = state.copy((r38 & 1) != 0 ? state.transferAttemptId : initialize.getTransferAttemptId(), (r38 & 2) != 0 ? state.sendAmount : initialAmount, (r38 & 4) != 0 ? state.sendCurrencyCode : initialize.getSendCurrencyCode(), (r38 & 8) != 0 ? state.receiveAmount : z ? initialize.getInitialReceiveAmount() : "", (r38 & 16) != 0 ? state.receiveCurrencyCode : initialize.getReceiveCurrencyCode(), (r38 & 32) != 0 ? state.receiveCurrencyId : initialize.getReceiveCurrencyId(), (r38 & 64) != 0 ? state.exchangeRate : null, (r38 & 128) != 0 ? state.isLoadingReceiveAmount : !z && z2, (r38 & 256) != 0 ? state.isLoadingSendAmount : z && !z3, (r38 & 512) != 0 ? state.fxQuoteId : null, (r38 & 1024) != 0 ? state.supportedIntents : initialize.getSupportedIntents(), (r38 & 2048) != 0 ? state.isUpdatingIntent : false, (r38 & 4096) != 0 ? state.pendingIntent : null, (r38 & 8192) != 0 ? state.sendMoney : null, (r38 & 16384) != 0 ? state.receiveMoney : null, (r38 & 32768) != 0 ? state.useSendCurrency : false, (r38 & 65536) != 0 ? state.isError : false, (r38 & 131072) != 0 ? state.isEditMode : initialize.isEditMode(), (r38 & 262144) != 0 ? state.editModeIntent : initialize.getEditModeIntent(), (r38 & 524288) != 0 ? state.name : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy11, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged) {
            if (state.isLoadingSendAmount()) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
            }
            boolean isValidPositiveAmount = com.paypal.oslo.feature.p2p.ui.utils.AmountValidationKt.isValidPositiveAmount(((com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged) event).getRawAmount());
            copy10 = state.copy((r38 & 1) != 0 ? state.transferAttemptId : null, (r38 & 2) != 0 ? state.sendAmount : null, (r38 & 4) != 0 ? state.sendCurrencyCode : null, (r38 & 8) != 0 ? state.receiveAmount : isValidPositiveAmount ? state.getReceiveAmount() : "0", (r38 & 16) != 0 ? state.receiveCurrencyCode : null, (r38 & 32) != 0 ? state.receiveCurrencyId : null, (r38 & 64) != 0 ? state.exchangeRate : isValidPositiveAmount ? state.getExchangeRate() : "", (r38 & 128) != 0 ? state.isLoadingReceiveAmount : isValidPositiveAmount, (r38 & 256) != 0 ? state.isLoadingSendAmount : false, (r38 & 512) != 0 ? state.fxQuoteId : null, (r38 & 1024) != 0 ? state.supportedIntents : null, (r38 & 2048) != 0 ? state.isUpdatingIntent : false, (r38 & 4096) != 0 ? state.pendingIntent : null, (r38 & 8192) != 0 ? state.sendMoney : null, (r38 & 16384) != 0 ? state.receiveMoney : !isValidPositiveAmount ? null : state.getReceiveMoney(), (r38 & 32768) != 0 ? state.useSendCurrency : false, (r38 & 65536) != 0 ? state.isError : false, (r38 & 131072) != 0 ? state.isEditMode : false, (r38 & 262144) != 0 ? state.editModeIntent : null, (r38 & 524288) != 0 ? state.name : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy10, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged) {
            if (state.isLoadingReceiveAmount()) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
            }
            boolean isValidPositiveAmount2 = com.paypal.oslo.feature.p2p.ui.utils.AmountValidationKt.isValidPositiveAmount(((com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged) event).getRawAmount());
            copy9 = state.copy((r38 & 1) != 0 ? state.transferAttemptId : null, (r38 & 2) != 0 ? state.sendAmount : !isValidPositiveAmount2 ? "0" : state.getSendAmount(), (r38 & 4) != 0 ? state.sendCurrencyCode : null, (r38 & 8) != 0 ? state.receiveAmount : null, (r38 & 16) != 0 ? state.receiveCurrencyCode : null, (r38 & 32) != 0 ? state.receiveCurrencyId : null, (r38 & 64) != 0 ? state.exchangeRate : isValidPositiveAmount2 ? state.getExchangeRate() : "", (r38 & 128) != 0 ? state.isLoadingReceiveAmount : false, (r38 & 256) != 0 ? state.isLoadingSendAmount : isValidPositiveAmount2, (r38 & 512) != 0 ? state.fxQuoteId : null, (r38 & 1024) != 0 ? state.supportedIntents : null, (r38 & 2048) != 0 ? state.isUpdatingIntent : false, (r38 & 4096) != 0 ? state.pendingIntent : null, (r38 & 8192) != 0 ? state.sendMoney : !isValidPositiveAmount2 ? null : state.getSendMoney(), (r38 & 16384) != 0 ? state.receiveMoney : null, (r38 & 32768) != 0 ? state.useSendCurrency : false, (r38 & 65536) != 0 ? state.isError : false, (r38 & 131072) != 0 ? state.isEditMode : false, (r38 & 262144) != 0 ? state.editModeIntent : null, (r38 & 524288) != 0 ? state.name : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy9, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountFormatted) {
            com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountFormatted sendAmountFormatted = (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountFormatted) event;
            copy8 = state.copy((r38 & 1) != 0 ? state.transferAttemptId : null, (r38 & 2) != 0 ? state.sendAmount : sendAmountFormatted.getFormattedAmount(), (r38 & 4) != 0 ? state.sendCurrencyCode : null, (r38 & 8) != 0 ? state.receiveAmount : null, (r38 & 16) != 0 ? state.receiveCurrencyCode : null, (r38 & 32) != 0 ? state.receiveCurrencyId : null, (r38 & 64) != 0 ? state.exchangeRate : null, (r38 & 128) != 0 ? state.isLoadingReceiveAmount : false, (r38 & 256) != 0 ? state.isLoadingSendAmount : false, (r38 & 512) != 0 ? state.fxQuoteId : null, (r38 & 1024) != 0 ? state.supportedIntents : null, (r38 & 2048) != 0 ? state.isUpdatingIntent : false, (r38 & 4096) != 0 ? state.pendingIntent : null, (r38 & 8192) != 0 ? state.sendMoney : sendAmountFormatted.getMoney(), (r38 & 16384) != 0 ? state.receiveMoney : null, (r38 & 32768) != 0 ? state.useSendCurrency : false, (r38 & 65536) != 0 ? state.isError : false, (r38 & 131072) != 0 ? state.isEditMode : false, (r38 & 262144) != 0 ? state.editModeIntent : null, (r38 & 524288) != 0 ? state.name : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy8, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted) {
            com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted receiveAmountFormatted = (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountFormatted) event;
            copy7 = state.copy((r38 & 1) != 0 ? state.transferAttemptId : null, (r38 & 2) != 0 ? state.sendAmount : null, (r38 & 4) != 0 ? state.sendCurrencyCode : null, (r38 & 8) != 0 ? state.receiveAmount : receiveAmountFormatted.getFormattedAmount(), (r38 & 16) != 0 ? state.receiveCurrencyCode : null, (r38 & 32) != 0 ? state.receiveCurrencyId : null, (r38 & 64) != 0 ? state.exchangeRate : null, (r38 & 128) != 0 ? state.isLoadingReceiveAmount : false, (r38 & 256) != 0 ? state.isLoadingSendAmount : false, (r38 & 512) != 0 ? state.fxQuoteId : null, (r38 & 1024) != 0 ? state.supportedIntents : null, (r38 & 2048) != 0 ? state.isUpdatingIntent : false, (r38 & 4096) != 0 ? state.pendingIntent : null, (r38 & 8192) != 0 ? state.sendMoney : null, (r38 & 16384) != 0 ? state.receiveMoney : receiveAmountFormatted.getMoney(), (r38 & 32768) != 0 ? state.useSendCurrency : false, (r38 & 65536) != 0 ? state.isError : false, (r38 & 131072) != 0 ? state.isEditMode : false, (r38 & 262144) != 0 ? state.editModeIntent : null, (r38 & 524288) != 0 ? state.name : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy7, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteLoaded) {
            com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteLoaded fxQuoteLoaded = (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteLoaded) event;
            com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote = fxQuoteLoaded.getFxQuote();
            java.lang.String value = fxQuote.getExchangeRate().getFromCurrency().getValue();
            java.lang.String currencyCode = fxQuote.getExchangeRate().getFromCurrency().getCurrencyCode();
            java.lang.String value2 = fxQuote.getExchangeRate().getToCurrency().getValue();
            java.lang.String currencyCode2 = fxQuote.getExchangeRate().getToCurrency().getCurrencyCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(value);
            sb.append(" ");
            sb.append(currencyCode);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
            sb.append(value2);
            sb.append(" ");
            sb.append(currencyCode2);
            sb.append("\nThis rate includes a currency conversion spread.");
            copy6 = state.copy((r38 & 1) != 0 ? state.transferAttemptId : null, (r38 & 2) != 0 ? state.sendAmount : state.isLoadingSendAmount() ? fxQuote.getAmountFrom().getValue() : state.getSendAmount(), (r38 & 4) != 0 ? state.sendCurrencyCode : null, (r38 & 8) != 0 ? state.receiveAmount : state.isLoadingReceiveAmount() ? fxQuote.getAmountTo().getValue() : state.getReceiveAmount(), (r38 & 16) != 0 ? state.receiveCurrencyCode : null, (r38 & 32) != 0 ? state.receiveCurrencyId : null, (r38 & 64) != 0 ? state.exchangeRate : sb.toString(), (r38 & 128) != 0 ? state.isLoadingReceiveAmount : false, (r38 & 256) != 0 ? state.isLoadingSendAmount : false, (r38 & 512) != 0 ? state.fxQuoteId : fxQuote.getFxQuoteId(), (r38 & 1024) != 0 ? state.supportedIntents : null, (r38 & 2048) != 0 ? state.isUpdatingIntent : false, (r38 & 4096) != 0 ? state.pendingIntent : null, (r38 & 8192) != 0 ? state.sendMoney : state.isLoadingSendAmount() ? fxQuoteLoaded.getSendMoney() : state.getSendMoney(), (r38 & 16384) != 0 ? state.receiveMoney : state.isLoadingReceiveAmount() ? fxQuoteLoaded.getReceiveMoney() : state.getReceiveMoney(), (r38 & 32768) != 0 ? state.useSendCurrency : false, (r38 & 65536) != 0 ? state.isError : false, (r38 & 131072) != 0 ? state.isEditMode : false, (r38 & 262144) != 0 ? state.editModeIntent : null, (r38 & 524288) != 0 ? state.name : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy6, null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.FxQuoteFailed)) {
            if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent) {
                com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent updateAmountAndIntent = (com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent) event;
                copy4 = state.copy((r38 & 1) != 0 ? state.transferAttemptId : null, (r38 & 2) != 0 ? state.sendAmount : null, (r38 & 4) != 0 ? state.sendCurrencyCode : null, (r38 & 8) != 0 ? state.receiveAmount : null, (r38 & 16) != 0 ? state.receiveCurrencyCode : null, (r38 & 32) != 0 ? state.receiveCurrencyId : null, (r38 & 64) != 0 ? state.exchangeRate : null, (r38 & 128) != 0 ? state.isLoadingReceiveAmount : false, (r38 & 256) != 0 ? state.isLoadingSendAmount : false, (r38 & 512) != 0 ? state.fxQuoteId : null, (r38 & 1024) != 0 ? state.supportedIntents : null, (r38 & 2048) != 0 ? state.isUpdatingIntent : true, (r38 & 4096) != 0 ? state.pendingIntent : updateAmountAndIntent.getIntent(), (r38 & 8192) != 0 ? state.sendMoney : null, (r38 & 16384) != 0 ? state.receiveMoney : null, (r38 & 32768) != 0 ? state.useSendCurrency : updateAmountAndIntent.getUseSendCurrency(), (r38 & 65536) != 0 ? state.isError : false, (r38 & 131072) != 0 ? state.isEditMode : false, (r38 & 262144) != 0 ? state.editModeIntent : null, (r38 & 524288) != 0 ? state.name : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy4, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntentCompleted) {
                java.lang.String sendAmount = state.getUseSendCurrency() ? state.getSendAmount() : state.getReceiveAmount();
                java.lang.String pendingIntent = state.getPendingIntent();
                copy3 = state.copy((r38 & 1) != 0 ? state.transferAttemptId : null, (r38 & 2) != 0 ? state.sendAmount : null, (r38 & 4) != 0 ? state.sendCurrencyCode : null, (r38 & 8) != 0 ? state.receiveAmount : null, (r38 & 16) != 0 ? state.receiveCurrencyCode : null, (r38 & 32) != 0 ? state.receiveCurrencyId : null, (r38 & 64) != 0 ? state.exchangeRate : null, (r38 & 128) != 0 ? state.isLoadingReceiveAmount : false, (r38 & 256) != 0 ? state.isLoadingSendAmount : false, (r38 & 512) != 0 ? state.fxQuoteId : null, (r38 & 1024) != 0 ? state.supportedIntents : null, (r38 & 2048) != 0 ? state.isUpdatingIntent : false, (r38 & 4096) != 0 ? state.pendingIntent : null, (r38 & 8192) != 0 ? state.sendMoney : null, (r38 & 16384) != 0 ? state.receiveMoney : null, (r38 & 32768) != 0 ? state.useSendCurrency : false, (r38 & 65536) != 0 ? state.isError : false, (r38 & 131072) != 0 ? state.isEditMode : false, (r38 & 262144) != 0 ? state.editModeIntent : null, (r38 & 524288) != 0 ? state.name : null);
                com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState crossBorderUiState = copy3;
                if (sendAmount.length() <= 0 || (str = pendingIntent) == null || str.length() == 0) {
                    navigateToReview = null;
                } else {
                    java.lang.String sendAmount2 = state.getSendAmount();
                    java.lang.String fxQuoteId = state.getFxQuoteId();
                    if (state.getUseSendCurrency()) {
                        receiveCurrencyCode = state.getSendCurrencyCode();
                    } else {
                        receiveCurrencyCode = state.getReceiveCurrencyCode();
                    }
                    navigateToReview = new com.paypal.oslo.feature.p2p.ui.crossborder.effects.CrossBorderEffect.NavigateToReview(sendAmount, sendAmount2, pendingIntent, fxQuoteId, receiveCurrencyCode);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(crossBorderUiState, navigateToReview);
            }
            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntentFailed)) {
                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ErrorDismissed)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                copy = state.copy((r38 & 1) != 0 ? state.transferAttemptId : null, (r38 & 2) != 0 ? state.sendAmount : null, (r38 & 4) != 0 ? state.sendCurrencyCode : null, (r38 & 8) != 0 ? state.receiveAmount : null, (r38 & 16) != 0 ? state.receiveCurrencyCode : null, (r38 & 32) != 0 ? state.receiveCurrencyId : null, (r38 & 64) != 0 ? state.exchangeRate : null, (r38 & 128) != 0 ? state.isLoadingReceiveAmount : false, (r38 & 256) != 0 ? state.isLoadingSendAmount : false, (r38 & 512) != 0 ? state.fxQuoteId : null, (r38 & 1024) != 0 ? state.supportedIntents : null, (r38 & 2048) != 0 ? state.isUpdatingIntent : false, (r38 & 4096) != 0 ? state.pendingIntent : null, (r38 & 8192) != 0 ? state.sendMoney : null, (r38 & 16384) != 0 ? state.receiveMoney : null, (r38 & 32768) != 0 ? state.useSendCurrency : false, (r38 & 65536) != 0 ? state.isError : false, (r38 & 131072) != 0 ? state.isEditMode : false, (r38 & 262144) != 0 ? state.editModeIntent : null, (r38 & 524288) != 0 ? state.name : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
            }
            copy2 = state.copy((r38 & 1) != 0 ? state.transferAttemptId : null, (r38 & 2) != 0 ? state.sendAmount : null, (r38 & 4) != 0 ? state.sendCurrencyCode : null, (r38 & 8) != 0 ? state.receiveAmount : null, (r38 & 16) != 0 ? state.receiveCurrencyCode : null, (r38 & 32) != 0 ? state.receiveCurrencyId : null, (r38 & 64) != 0 ? state.exchangeRate : null, (r38 & 128) != 0 ? state.isLoadingReceiveAmount : false, (r38 & 256) != 0 ? state.isLoadingSendAmount : false, (r38 & 512) != 0 ? state.fxQuoteId : null, (r38 & 1024) != 0 ? state.supportedIntents : null, (r38 & 2048) != 0 ? state.isUpdatingIntent : false, (r38 & 4096) != 0 ? state.pendingIntent : null, (r38 & 8192) != 0 ? state.sendMoney : null, (r38 & 16384) != 0 ? state.receiveMoney : null, (r38 & 32768) != 0 ? state.useSendCurrency : false, (r38 & 65536) != 0 ? state.isError : true, (r38 & 131072) != 0 ? state.isEditMode : false, (r38 & 262144) != 0 ? state.editModeIntent : null, (r38 & 524288) != 0 ? state.name : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
        }
        copy5 = state.copy((r38 & 1) != 0 ? state.transferAttemptId : null, (r38 & 2) != 0 ? state.sendAmount : null, (r38 & 4) != 0 ? state.sendCurrencyCode : null, (r38 & 8) != 0 ? state.receiveAmount : null, (r38 & 16) != 0 ? state.receiveCurrencyCode : null, (r38 & 32) != 0 ? state.receiveCurrencyId : null, (r38 & 64) != 0 ? state.exchangeRate : null, (r38 & 128) != 0 ? state.isLoadingReceiveAmount : false, (r38 & 256) != 0 ? state.isLoadingSendAmount : false, (r38 & 512) != 0 ? state.fxQuoteId : null, (r38 & 1024) != 0 ? state.supportedIntents : null, (r38 & 2048) != 0 ? state.isUpdatingIntent : false, (r38 & 4096) != 0 ? state.pendingIntent : null, (r38 & 8192) != 0 ? state.sendMoney : null, (r38 & 16384) != 0 ? state.receiveMoney : null, (r38 & 32768) != 0 ? state.useSendCurrency : false, (r38 & 65536) != 0 ? state.isError : true, (r38 & 131072) != 0 ? state.isEditMode : false, (r38 & 262144) != 0 ? state.editModeIntent : null, (r38 & 524288) != 0 ? state.name : null);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy5, null, 2, null);
    }
}
