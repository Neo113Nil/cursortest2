package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "SCHEDULED_PAYMENT", "AUTOPAY_PAYMENT", "DOWN_PAYMENT", "REAL_TIME_PAYMENT", "PAYMENT_FAILED", "PAYMENT_REVERSAL", "PURCHASE", "FEE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, "INTEREST", "CASH_ADVANCE", "ADJUSTMENT", "OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransactionType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType ADJUSTMENT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType AUTOPAY_PAYMENT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType CASH_ADVANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType DOWN_PAYMENT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType FEE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType INTEREST;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType OTHER;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType PAYMENT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType PAYMENT_FAILED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType PAYMENT_REVERSAL;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType PURCHASE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType REAL_TIME_PAYMENT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType REFUND;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType SCHEDULED_PAYMENT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType[] getHighSpeedVideoSizes;

    private TransactionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, 0);
        PAYMENT = transactionType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("SCHEDULED_PAYMENT", 1);
        SCHEDULED_PAYMENT = transactionType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("AUTOPAY_PAYMENT", 2);
        AUTOPAY_PAYMENT = transactionType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("DOWN_PAYMENT", 3);
        DOWN_PAYMENT = transactionType4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("REAL_TIME_PAYMENT", 4);
        REAL_TIME_PAYMENT = transactionType5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType6 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("PAYMENT_FAILED", 5);
        PAYMENT_FAILED = transactionType6;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType7 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("PAYMENT_REVERSAL", 6);
        PAYMENT_REVERSAL = transactionType7;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType8 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("PURCHASE", 7);
        PURCHASE = transactionType8;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType9 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("FEE", 8);
        FEE = transactionType9;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType10 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, 9);
        REFUND = transactionType10;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType11 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("INTEREST", 10);
        INTEREST = transactionType11;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType12 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("CASH_ADVANCE", 11);
        CASH_ADVANCE = transactionType12;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType13 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("ADJUSTMENT", 12);
        ADJUSTMENT = transactionType13;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType14 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType("OTHER", 13);
        OTHER = transactionType14;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType[] transactionTypeArr = {transactionType, transactionType2, transactionType3, transactionType4, transactionType5, transactionType6, transactionType7, transactionType8, transactionType9, transactionType10, transactionType11, transactionType12, transactionType13, transactionType14};
        getHighSpeedVideoSizes = transactionTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(transactionTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
