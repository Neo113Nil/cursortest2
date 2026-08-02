package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/ConditionalRuleType;", "", "<init>", "(Ljava/lang/String;I)V", "EARLY_PAYMENT_DISCOUNT", "AUTO_CANCEL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConditionalRuleType {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType AUTO_CANCEL;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType EARLY_PAYMENT_DISCOUNT;
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ConditionalRuleType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType conditionalRuleType = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType("EARLY_PAYMENT_DISCOUNT", 0);
        EARLY_PAYMENT_DISCOUNT = conditionalRuleType;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType conditionalRuleType2 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType("AUTO_CANCEL", 1);
        AUTO_CANCEL = conditionalRuleType2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType[] conditionalRuleTypeArr = {conditionalRuleType, conditionalRuleType2};
        getHighResolutionOutputSizeshNQ4ISI = conditionalRuleTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(conditionalRuleTypeArr);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
