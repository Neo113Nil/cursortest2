package com.paypal.oslo.feature.inappcheckout.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FlowEnum;", "", "<init>", "(Ljava/lang/String;I)V", "BILLING_WITH_PURCHASE", "BILLING_WITHOUT_PURCHASE", "EC_ONE_TIME_CHECKOUT", "WPS_ONE_TIME_CHECKOUT", "SUBSCRIPTION", "RECURRING_BILLING", "RECURRING_BILLING_WITH_PURCHASE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlowEnum {
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum BILLING_WITHOUT_PURCHASE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum BILLING_WITH_PURCHASE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum EC_ONE_TIME_CHECKOUT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum RECURRING_BILLING;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum RECURRING_BILLING_WITH_PURCHASE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum SUBSCRIPTION;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum UNKNOWN__;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum WPS_ONE_TIME_CHECKOUT;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private FlowEnum(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum = new com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum("BILLING_WITH_PURCHASE", 0);
        BILLING_WITH_PURCHASE = flowEnum;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum("BILLING_WITHOUT_PURCHASE", 1);
        BILLING_WITHOUT_PURCHASE = flowEnum2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum3 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum("EC_ONE_TIME_CHECKOUT", 2);
        EC_ONE_TIME_CHECKOUT = flowEnum3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum4 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum("WPS_ONE_TIME_CHECKOUT", 3);
        WPS_ONE_TIME_CHECKOUT = flowEnum4;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum5 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum("SUBSCRIPTION", 4);
        SUBSCRIPTION = flowEnum5;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum6 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum("RECURRING_BILLING", 5);
        RECURRING_BILLING = flowEnum6;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum7 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum("RECURRING_BILLING_WITH_PURCHASE", 6);
        RECURRING_BILLING_WITH_PURCHASE = flowEnum7;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum8 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum("UNKNOWN__", 7);
        UNKNOWN__ = flowEnum8;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum[] flowEnumArr = {flowEnum, flowEnum2, flowEnum3, flowEnum4, flowEnum5, flowEnum6, flowEnum7, flowEnum8};
        getHighResolutionOutputSizeshNQ4ISI = flowEnumArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(flowEnumArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
