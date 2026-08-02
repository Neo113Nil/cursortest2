package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/DiscountError;", "", "<init>", "(Ljava/lang/String;I)V", "ExceedsPrice", "PercentageMax"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DiscountError {
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError ExceedsPrice;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError PercentageMax;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DiscountError(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError discountError = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError("ExceedsPrice", 0);
        ExceedsPrice = discountError;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError discountError2 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError("PercentageMax", 1);
        PercentageMax = discountError2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError[] discountErrorArr = {discountError, discountError2};
        Camera2StreamConfigurationMap = discountErrorArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(discountErrorArr);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountError> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
