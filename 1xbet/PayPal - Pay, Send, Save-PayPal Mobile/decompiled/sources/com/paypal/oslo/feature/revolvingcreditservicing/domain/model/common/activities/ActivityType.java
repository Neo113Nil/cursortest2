package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/ActivityType;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "toTransactionType", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "ADJUSTMENT", "CASH_ADVANCE", "CREDIT_BALANCE_REFUND", "FEE", "INTEREST", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "PAYMENT_FAILED", "PAYMENT_REVERSAL", "PURCHASE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType ADJUSTMENT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType CASH_ADVANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType CREDIT_BALANCE_REFUND;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType FEE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType INTEREST;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType PAYMENT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType PAYMENT_FAILED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType PAYMENT_REVERSAL;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType PURCHASE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType REFUND;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType[] getHighSpeedVideoFpsRangesFor;

    private ActivityType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType("ADJUSTMENT", 0);
        ADJUSTMENT = activityType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType("CASH_ADVANCE", 1);
        CASH_ADVANCE = activityType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType("CREDIT_BALANCE_REFUND", 2);
        CREDIT_BALANCE_REFUND = activityType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType("FEE", 3);
        FEE = activityType4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType("INTEREST", 4);
        INTEREST = activityType5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType6 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, 5);
        PAYMENT = activityType6;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType7 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType("PAYMENT_FAILED", 6);
        PAYMENT_FAILED = activityType7;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType8 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType("PAYMENT_REVERSAL", 7);
        PAYMENT_REVERSAL = activityType8;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType9 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType("PURCHASE", 8);
        PURCHASE = activityType9;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType10 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, 9);
        REFUND = activityType10;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType11 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType("UNKNOWN", 10);
        UNKNOWN = activityType11;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType[] activityTypeArr = {activityType, activityType2, activityType3, activityType4, activityType5, activityType6, activityType7, activityType8, activityType9, activityType10, activityType11};
        getHighSpeedVideoFpsRangesFor = activityTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(activityTypeArr);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType toTransactionType() {
        switch (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.ADJUSTMENT;
            case 2:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.CASH_ADVANCE;
            case 3:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.ADJUSTMENT;
            case 4:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.FEE;
            case 5:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.INTEREST;
            case 6:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PAYMENT;
            case 7:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PAYMENT_FAILED;
            case 8:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PAYMENT_REVERSAL;
            case 9:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PURCHASE;
            case 10:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.REFUND;
            case 11:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.OTHER;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.ADJUSTMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.CASH_ADVANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.CREDIT_BALANCE_REFUND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.FEE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.INTEREST.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PAYMENT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PAYMENT_FAILED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PAYMENT_REVERSAL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PURCHASE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.REFUND.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.UNKNOWN.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
