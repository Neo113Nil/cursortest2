package com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantEvent;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState;Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantEvent;)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PpwMerchantReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiEffect> {
    public static final int $stable = 0;
    public static final java.lang.String AMOUNT_EXCEEDED_APPROVED_ISSUE = "AMOUNT_EXCEEDED_APPROVED";
    public static final java.lang.String FX_RATE_CHANGED_ISSUE = "FX_RATE_CHANGED";

    @javax.inject.Inject
    public PpwMerchantReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PpwMerchantReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiEffect>> reduce(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState state, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent event) {
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error error;
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiModel copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Content)) {
                if (!(state instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error error2 = (com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error) state;
                if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent.RetryClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error2, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiEffect.NavigateToEnterAmount.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error2, event);
            }
            com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Content content = (com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Content) state;
            if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent.TimerTick) {
                long coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(content.getUiModel().getRemainingSeconds() - 1, 0L);
                if (coerceAtLeast == 0) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_title_recoverable_error_screen_after_pay, com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_recoverable_error_screen_after_pay), null, 2, null);
                }
                copy = r8.copy((r25 & 1) != 0 ? r8.receiverAmount : null, (r25 & 2) != 0 ? r8.senderAmount : null, (r25 & 4) != 0 ? r8.senderCurrencyCode : null, (r25 & 8) != 0 ? r8.receiverCurrencyCode : null, (r25 & 16) != 0 ? r8.senderCountryCode : null, (r25 & 32) != 0 ? r8.receiverCountryCode : null, (r25 & 64) != 0 ? r8.senderFee : null, (r25 & 128) != 0 ? r8.receiverFee : null, (r25 & 256) != 0 ? r8.totalSender : null, (r25 & 512) != 0 ? content.getUiModel().remainingSeconds : coerceAtLeast);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(copy), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent.BackClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiEffect.NavigateBack.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent.CloseClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiEffect.NavigateCloseFlow.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent.ApiError) {
                java.lang.String issueType = ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent.ApiError) event).getIssueType();
                if (kotlin.jvm.internal.Intrinsics.areEqual(issueType, AMOUNT_EXCEEDED_APPROVED_ISSUE)) {
                    error = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_title_amount_mismatch, com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_desc_amount_mismatch);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(issueType, FX_RATE_CHANGED_ISSUE)) {
                    error = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_title_recoverable_error_screen_after_pay, com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_recoverable_error_screen_after_pay);
                } else {
                    error = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Error(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_title_error, com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_desc_error);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(content, event);
        }
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Initial initial = (com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent.LoadScreen) {
            com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent.LoadScreen loadScreen = (com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent.LoadScreen) event;
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(loadScreen.getSenderAmount());
            double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
            java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00");
            java.lang.String receiverAmount = loadScreen.getReceiverAmount();
            java.lang.String senderAmount = loadScreen.getSenderAmount();
            java.lang.String senderCurrencyCode = loadScreen.getSenderCurrencyCode();
            java.lang.String receiverCurrencyCode = loadScreen.getReceiverCurrencyCode();
            java.lang.String senderCountryCode = loadScreen.getSenderCountryCode();
            java.lang.String receiverCountryCode = loadScreen.getReceiverCountryCode();
            java.lang.String format = decimalFormat.format(0.0d);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            java.lang.String format2 = decimalFormat.format(0.0d);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
            java.lang.String format3 = decimalFormat.format(doubleValue + 0.0d);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "");
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Content(new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiModel(receiverAmount, senderAmount, senderCurrencyCode, receiverCurrencyCode, senderCountryCode, receiverCountryCode, format, format2, format3, 0L, 512, null)), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
