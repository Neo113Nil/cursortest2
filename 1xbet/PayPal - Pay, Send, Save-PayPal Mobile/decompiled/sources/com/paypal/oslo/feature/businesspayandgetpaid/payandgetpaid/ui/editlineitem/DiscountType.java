package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/DiscountType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, "PERCENTAGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DiscountType {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType AMOUNT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType NONE;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType PERCENTAGE;
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType[] getHighSpeedVideoFpsRanges;

    private DiscountType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType discountType = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType("NONE", 0);
        NONE = discountType;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType discountType2 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType(com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, 1);
        AMOUNT = discountType2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType discountType3 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType("PERCENTAGE", 2);
        PERCENTAGE = discountType3;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType[] discountTypeArr = {discountType, discountType2, discountType3};
        getHighSpeedVideoFpsRanges = discountTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(discountTypeArr);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
