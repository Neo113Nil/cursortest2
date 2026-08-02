package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/ConditionalRuleValueType;", "", "<init>", "(Ljava/lang/String;I)V", com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, "PERCENT", "NO_VALUE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConditionalRuleValueType {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType AMOUNT;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType NO_VALUE;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType PERCENT;
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ConditionalRuleValueType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType conditionalRuleValueType = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType(com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, 0);
        AMOUNT = conditionalRuleValueType;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType conditionalRuleValueType2 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType("PERCENT", 1);
        PERCENT = conditionalRuleValueType2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType conditionalRuleValueType3 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType("NO_VALUE", 2);
        NO_VALUE = conditionalRuleValueType3;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType[] conditionalRuleValueTypeArr = {conditionalRuleValueType, conditionalRuleValueType2, conditionalRuleValueType3};
        getHighResolutionOutputSizeshNQ4ISI = conditionalRuleValueTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(conditionalRuleValueTypeArr);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
