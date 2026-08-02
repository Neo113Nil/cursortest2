package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/PaymentValidationMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "<init>", "()V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentValidationMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PaymentValidationMiddleware() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        if (r2.toBigDecimal().compareTo(r3.toBigDecimal()) >= 0) goto L28;
     */
    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent> input) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationPassed paymentValidationPassed;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState second = input.getStates().getSecond();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent event = input.getEvent();
        if ((second instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready) && (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPayClick)) {
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent, kotlin.Unit> eventDispatcher = input.getEventDispatcher();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready) second).getReadyInfo();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument selectedFundingInstrument = readyInfo.getArgs().getSelectedFundingInstrument();
            boolean z = selectedFundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance;
            boolean isAfter = readyInfo.getPaymentDate().isAfter(java.time.LocalDate.now());
            java.time.LocalDate dueDate = readyInfo.getArgs().getDueDate();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance fundingInstrumentBalance = z ? (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) selectedFundingInstrument : null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount balance = fundingInstrumentBalance != null ? fundingInstrumentBalance.getBalance() : null;
            if (z && isAfter && readyInfo.getArgs().getBackupPaymentMethod() == null) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Payment validation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", "missing_backup_payment_for_future_balance")), null, 4, null);
                paymentValidationPassed = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_review_payment_error_backup_payment, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null);
            } else {
                if (z && !isAfter) {
                    if (balance != null) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount paymentAmount = readyInfo.getArgs().getPaymentAmount();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(balance.getCurrencyCode(), paymentAmount.getCurrencyCode())) {
                        }
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Payment validation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", "insufficient_balance")), null, 4, null);
                    paymentValidationPassed = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed(null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Insufficient PayPal Balance. Please choose another way to pay."));
                }
                if (dueDate != null && readyInfo.getPaymentDate().isAfter(dueDate)) {
                    paymentValidationPassed = com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnScheduledPaymentAfterDueDate.INSTANCE;
                } else {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Payment validation passed", null, null, 6, null);
                    paymentValidationPassed = com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationPassed.INSTANCE;
                }
            }
            eventDispatcher.invoke(paymentValidationPassed);
        }
    }
}
