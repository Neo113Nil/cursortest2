package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "Ljava/time/Instant;", "getDisplayTimestamp", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;)Ljava/time/Instant;", "displayTimestamp"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransactionKt {
    public static final java.time.Instant getDisplayTimestamp(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        boolean z = transaction instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity;
        if (z) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) transaction;
            if (repaymentActivity.getRepaymentType() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.REAL_TIME) {
                return repaymentActivity.getGetHighSpeedVideoFpsRangesFor();
            }
        }
        if (z) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity repaymentActivity2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity) transaction;
            java.time.Instant paymentTime = repaymentActivity2.getPaymentTime();
            return paymentTime == null ? repaymentActivity2.getGetHighSpeedVideoFpsRangesFor() : paymentTime;
        }
        return transaction.getGetHighSpeedVideoFpsRangesFor();
    }
}
