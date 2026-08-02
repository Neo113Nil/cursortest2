package com.paypal.oslo.feature.inappcheckout.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BillingType;", "", "<init>", "(Ljava/lang/String;I)V", "MERCHANT_INITIATED_BILLING", "MERCHANT_INITIATED_SINGLE_BILLING", "CHANNEL_INITIATED_BILLING", "RECURRING_PAYMENTS", "SUBSCRIPTIONS_V1", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BillingType {
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType CHANNEL_INITIATED_BILLING;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType MERCHANT_INITIATED_BILLING;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType MERCHANT_INITIATED_SINGLE_BILLING;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType RECURRING_PAYMENTS;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType SUBSCRIPTIONS_V1;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType[] getHighSpeedVideoFpsRangesFor;

    private BillingType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType = new com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType("MERCHANT_INITIATED_BILLING", 0);
        MERCHANT_INITIATED_BILLING = billingType;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType("MERCHANT_INITIATED_SINGLE_BILLING", 1);
        MERCHANT_INITIATED_SINGLE_BILLING = billingType2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType3 = new com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType("CHANNEL_INITIATED_BILLING", 2);
        CHANNEL_INITIATED_BILLING = billingType3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType4 = new com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType("RECURRING_PAYMENTS", 3);
        RECURRING_PAYMENTS = billingType4;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType5 = new com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType("SUBSCRIPTIONS_V1", 4);
        SUBSCRIPTIONS_V1 = billingType5;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType6 = new com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType("UNKNOWN__", 5);
        UNKNOWN__ = billingType6;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType[] billingTypeArr = {billingType, billingType2, billingType3, billingType4, billingType5, billingType6};
        getHighSpeedVideoFpsRangesFor = billingTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(billingTypeArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
