package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentType;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "toTransactionType", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "AUTOPAY", "DOWN_PAYMENT", "REAL_TIME", "SCHEDULED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RepaymentType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType AUTOPAY;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType DOWN_PAYMENT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType REAL_TIME;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType SCHEDULED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private RepaymentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType("AUTOPAY", 0);
        AUTOPAY = repaymentType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType("DOWN_PAYMENT", 1);
        DOWN_PAYMENT = repaymentType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType("REAL_TIME", 2);
        REAL_TIME = repaymentType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType("SCHEDULED", 3);
        SCHEDULED = repaymentType4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType repaymentType5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType("UNKNOWN", 4);
        UNKNOWN = repaymentType5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType[] repaymentTypeArr = {repaymentType, repaymentType2, repaymentType3, repaymentType4, repaymentType5};
        Camera2StreamConfigurationMap = repaymentTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(repaymentTypeArr);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType toTransactionType() {
        int i = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.AUTOPAY_PAYMENT;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.DOWN_PAYMENT;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.REAL_TIME_PAYMENT;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.SCHEDULED_PAYMENT;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.OTHER;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType[]) Camera2StreamConfigurationMap.clone();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.AUTOPAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.DOWN_PAYMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.REAL_TIME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.SCHEDULED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
