package com.paypal.oslo.feature.qrc.ui.success;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessUiState;", "Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessEvent;", "Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessUiState;Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessEvent;)Larrow/core/Either;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentSuccessReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState, com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessEvent, com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PaymentSuccessReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PaymentSuccessReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState, com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiEffect>> reduce(com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState state, com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessEvent event) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState.Content)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState.Content content = (com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState.Content) state;
            return event instanceof com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessEvent.ClosePressed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiEffect.ExitPaymentFlow.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(content, event);
        }
        com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState.Initial initial = (com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessEvent.LoadScreen) {
            com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs navArgs = ((com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessEvent.LoadScreen) event).getNavArgs();
            java.lang.String transactionId = navArgs.getTransactionId();
            java.lang.String paymentAmountValue = navArgs.getPaymentAmountValue();
            java.lang.String paymentAmountCurrencyCode = navArgs.getPaymentAmountCurrencyCode();
            if (paymentAmountValue == null || paymentAmountCurrencyCode == null) {
                str = "$0.00";
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
                sb.append(paymentAmountValue);
                sb.append(" ");
                sb.append(paymentAmountCurrencyCode);
                str = sb.toString();
            }
            java.lang.String str2 = str;
            java.lang.String paymentAmountCurrencyCode2 = navArgs.getPaymentAmountCurrencyCode();
            java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(navArgs.getTxnTimestamp());
            java.lang.String str3 = highResolutionOutputSizeshNQ4ISI == null ? "" : highResolutionOutputSizeshNQ4ISI;
            java.lang.String merchantDisplayName = navArgs.getMerchantDisplayName();
            java.lang.String str4 = (merchantDisplayName == null && (merchantDisplayName = navArgs.getMerchantName()) == null) ? "" : merchantDisplayName;
            java.lang.String merchantDisplayInitials = navArgs.getMerchantDisplayInitials();
            if (merchantDisplayInitials == null) {
                merchantDisplayInitials = com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.extractInitials(navArgs.getMerchantDisplayName());
            }
            java.lang.String str5 = merchantDisplayInitials;
            boolean isPayPalWorld = navArgs.isPayPalWorld();
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentStatus status = navArgs.getStatus();
            java.lang.String sourceAmountValue = navArgs.getSourceAmountValue();
            if (sourceAmountValue == null) {
                sourceAmountValue = navArgs.getPaymentAmountValue();
            }
            java.lang.String str6 = sourceAmountValue;
            java.lang.String sourceAmountCurrencyCode = navArgs.getSourceAmountCurrencyCode();
            if (sourceAmountCurrencyCode == null) {
                sourceAmountCurrencyCode = navArgs.getPaymentAmountCurrencyCode();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiState.Content(new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessUiModel(transactionId, str2, paymentAmountCurrencyCode2, str3, str4, str5, status, str6, sourceAmountCurrencyCode, isPayPalWorld, navArgs.getPpwFxRate())), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        java.lang.String format;
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("MMM d, yyyy h:mm a", java.util.Locale.US);
        java.lang.String str = p0;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return simpleDateFormat.format(new java.util.Date());
        }
        try {
            java.util.Date parse = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", java.util.Locale.US).parse(p0);
            return (parse == null || (format = simpleDateFormat.format(parse)) == null) ? simpleDateFormat.format(new java.util.Date()) : format;
        } catch (java.text.ParseException unused) {
            return simpleDateFormat.format(new java.util.Date());
        } catch (java.lang.Exception unused2) {
            return simpleDateFormat.format(new java.util.Date());
        }
    }
}
