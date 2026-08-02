package com.paypal.oslo.feature.taptopay.data.repository.payair;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayairTransactionRepositoryKt {
    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction access$toTransaction(com.payair.db.transactionhistory.TransactionHistoryEntry transactionHistoryEntry) {
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus transactionStatus;
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType transactionType;
        java.lang.String valueOf = java.lang.String.valueOf(transactionHistoryEntry.getTransactionId());
        double doubleValue = transactionHistoryEntry.getAmount().doubleValue();
        int i = com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepositoryKt.WhenMappings.$EnumSwitchMapping$0[transactionHistoryEntry.getAuthorizationStatus().ordinal()];
        if (i == 1) {
            transactionStatus = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.DECLINED;
        } else if (i == 2) {
            transactionStatus = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.APPROVED;
        } else if (i == 3) {
            transactionStatus = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.CLEARED;
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            transactionStatus = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.REFUNDED;
        }
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus transactionStatus2 = transactionStatus;
        switch (com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepositoryKt.WhenMappings.$EnumSwitchMapping$1[transactionHistoryEntry.getTransactionType().ordinal()]) {
            case 1:
                transactionType = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.PURCHASE;
                break;
            case 2:
                transactionType = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.REFUND;
                break;
            case 3:
                transactionType = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.WITHDRAWAL;
                break;
            case 4:
                transactionType = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.UNKNOWN;
                break;
            case 5:
                transactionType = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.UNKNOWN;
                break;
            case 6:
                transactionType = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.UNKNOWN;
                break;
            case 7:
                transactionType = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.UNKNOWN;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction(valueOf, transactionHistoryEntry.getNetworkTokenReference(), transactionStatus2, transactionType, doubleValue, transactionHistoryEntry.getCurrencyCode(), transactionHistoryEntry.getAmount().toString(), transactionHistoryEntry.getDate(), transactionHistoryEntry.getMerchantName(), transactionHistoryEntry.getMerchantCity(), transactionHistoryEntry.getIndustryCatgCode());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.values().length];
            try {
                iArr[com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.DECLINED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.AUTHORIZED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.CLEARED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.REVERSED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.values().length];
            try {
                iArr2[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.PURCHASE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.REFUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.ATM_WITHDRAWAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.CASH_DISBURSEMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.PAYMENT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.ATM_DEPOSIT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.ATM_TRANSFER.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
