package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiState;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiState;Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PpwEnterAmountReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PpwEnterAmountReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PpwEnterAmountReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect>> reduce(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState state, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent event) {
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel copy;
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel copy2;
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel copy3;
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel copy4;
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel copy5;
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel copy6;
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel copy7;
        int i;
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel copy8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content content = (com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content) state;
        if (!(event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ContinuePressed)) {
            if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.BackPressed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateBack.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ClosePressed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.CloseFlow.INSTANCE);
            }
            if (!(event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SenderAmountChanged)) {
                if (!(event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ReceiverAmountChanged)) {
                    if (!(event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.PrimaryRowClicked)) {
                        if (!(event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SecondaryRowClicked)) {
                            if (!(event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ResetAmount)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            copy = r5.copy((r18 & 1) != 0 ? r5.senderAmount : "0", (r18 & 2) != 0 ? r5.receiverAmount : "0", (r18 & 4) != 0 ? r5.senderCurrencyCode : null, (r18 & 8) != 0 ? r5.receiverCurrencyCode : null, (r18 & 16) != 0 ? r5.senderCountryCode : null, (r18 & 32) != 0 ? r5.receiverCountryCode : null, (r18 & 64) != 0 ? r5.activeCurrency : com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency.SENDER, (r18 & 128) != 0 ? content.getUiModel().errorMessage : null);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy), null, 2, null);
                        }
                        copy2 = r5.copy((r18 & 1) != 0 ? r5.senderAmount : null, (r18 & 2) != 0 ? r5.receiverAmount : null, (r18 & 4) != 0 ? r5.senderCurrencyCode : null, (r18 & 8) != 0 ? r5.receiverCurrencyCode : null, (r18 & 16) != 0 ? r5.senderCountryCode : null, (r18 & 32) != 0 ? r5.receiverCountryCode : null, (r18 & 64) != 0 ? r5.activeCurrency : com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency.RECEIVER, (r18 & 128) != 0 ? content.getUiModel().errorMessage : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy2), null, 2, null);
                    }
                    copy3 = r5.copy((r18 & 1) != 0 ? r5.senderAmount : null, (r18 & 2) != 0 ? r5.receiverAmount : null, (r18 & 4) != 0 ? r5.senderCurrencyCode : null, (r18 & 8) != 0 ? r5.receiverCurrencyCode : null, (r18 & 16) != 0 ? r5.senderCountryCode : null, (r18 & 32) != 0 ? r5.receiverCountryCode : null, (r18 & 64) != 0 ? r5.activeCurrency : com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency.SENDER, (r18 & 128) != 0 ? content.getUiModel().errorMessage : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy3), null, 2, null);
                }
                java.lang.String newAmount = ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ReceiverAmountChanged) event).getNewAmount();
                java.lang.String receiverCurrencyCode = content.getUiModel().getReceiverCurrencyCode();
                com.paypal.oslo.core.money.Money parseAsMoneyOrNull = com.paypal.oslo.core.money.MoneyKt.parseAsMoneyOrNull(newAmount, receiverCurrencyCode);
                if (parseAsMoneyOrNull == null) {
                    parseAsMoneyOrNull = new com.paypal.oslo.core.money.Money(0L, receiverCurrencyCode);
                }
                copy4 = r9.copy((r18 & 1) != 0 ? r9.senderAmount : com.paypal.oslo.core.money.MoneyFormattingKt.formatAsDecimalNumber(parseAsMoneyOrNull.div(6.95d)), (r18 & 2) != 0 ? r9.receiverAmount : newAmount, (r18 & 4) != 0 ? r9.senderCurrencyCode : null, (r18 & 8) != 0 ? r9.receiverCurrencyCode : null, (r18 & 16) != 0 ? r9.senderCountryCode : null, (r18 & 32) != 0 ? r9.receiverCountryCode : null, (r18 & 64) != 0 ? r9.activeCurrency : com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency.RECEIVER, (r18 & 128) != 0 ? content.getUiModel().errorMessage : null);
                copy5 = copy4.copy((r18 & 1) != 0 ? copy4.senderAmount : null, (r18 & 2) != 0 ? copy4.receiverAmount : null, (r18 & 4) != 0 ? copy4.senderCurrencyCode : null, (r18 & 8) != 0 ? copy4.receiverCurrencyCode : null, (r18 & 16) != 0 ? copy4.senderCountryCode : null, (r18 & 32) != 0 ? copy4.receiverCountryCode : null, (r18 & 64) != 0 ? copy4.activeCurrency : null, (r18 & 128) != 0 ? copy4.errorMessage : copy4.isValidAmount$qrc_prodRelease() ? null : content.getUiModel().getErrorMessage());
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy5), null, 2, null);
            }
            java.lang.String newAmount2 = ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SenderAmountChanged) event).getNewAmount();
            java.lang.String senderCurrencyCode = content.getUiModel().getSenderCurrencyCode();
            com.paypal.oslo.core.money.Money parseAsMoneyOrNull2 = com.paypal.oslo.core.money.MoneyKt.parseAsMoneyOrNull(newAmount2, senderCurrencyCode);
            if (parseAsMoneyOrNull2 == null) {
                parseAsMoneyOrNull2 = new com.paypal.oslo.core.money.Money(0L, senderCurrencyCode);
            }
            copy6 = r9.copy((r18 & 1) != 0 ? r9.senderAmount : newAmount2, (r18 & 2) != 0 ? r9.receiverAmount : com.paypal.oslo.core.money.MoneyFormattingKt.formatAsDecimalNumber(parseAsMoneyOrNull2.times(6.95d)), (r18 & 4) != 0 ? r9.senderCurrencyCode : null, (r18 & 8) != 0 ? r9.receiverCurrencyCode : null, (r18 & 16) != 0 ? r9.senderCountryCode : null, (r18 & 32) != 0 ? r9.receiverCountryCode : null, (r18 & 64) != 0 ? r9.activeCurrency : com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency.SENDER, (r18 & 128) != 0 ? content.getUiModel().errorMessage : null);
            copy7 = copy6.copy((r18 & 1) != 0 ? copy6.senderAmount : null, (r18 & 2) != 0 ? copy6.receiverAmount : null, (r18 & 4) != 0 ? copy6.senderCurrencyCode : null, (r18 & 8) != 0 ? copy6.receiverCurrencyCode : null, (r18 & 16) != 0 ? copy6.senderCountryCode : null, (r18 & 32) != 0 ? copy6.receiverCountryCode : null, (r18 & 64) != 0 ? copy6.activeCurrency : null, (r18 & 128) != 0 ? copy6.errorMessage : copy6.isValidAmount$qrc_prodRelease() ? null : content.getUiModel().getErrorMessage());
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy7), null, 2, null);
        }
        if (content.getUiModel().isValidAmount$qrc_prodRelease()) {
            java.lang.String receiverAmount = content.getUiModel().getReceiverAmount();
            if (receiverAmount.length() == 0) {
                receiverAmount = "0.00";
            }
            java.lang.String str = receiverAmount;
            java.lang.String senderAmount = content.getUiModel().getSenderAmount();
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateToLoading(str, senderAmount.length() != 0 ? senderAmount : "0.00", content.getUiModel().getSenderCurrencyCode(), content.getUiModel().getReceiverCurrencyCode(), content.getUiModel().getSenderCountryCode(), content.getUiModel().getReceiverCountryCode()));
        }
        if (kotlin.text.StringsKt.endsWith$default(content.getUiModel().getAmount(), ".", false, 2, (java.lang.Object) null)) {
            i = com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_error_invalid_amount;
        } else {
            i = com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_zero_amount;
        }
        copy8 = r5.copy((r18 & 1) != 0 ? r5.senderAmount : null, (r18 & 2) != 0 ? r5.receiverAmount : null, (r18 & 4) != 0 ? r5.senderCurrencyCode : null, (r18 & 8) != 0 ? r5.receiverCurrencyCode : null, (r18 & 16) != 0 ? r5.senderCountryCode : null, (r18 & 32) != 0 ? r5.receiverCountryCode : null, (r18 & 64) != 0 ? r5.activeCurrency : null, (r18 & 128) != 0 ? content.getUiModel().errorMessage : java.lang.Integer.valueOf(i));
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy8), null, 2, null);
    }
}
