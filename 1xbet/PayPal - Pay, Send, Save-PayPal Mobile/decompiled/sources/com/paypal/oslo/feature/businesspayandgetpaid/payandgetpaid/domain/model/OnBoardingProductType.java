package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/OnBoardingProductType;", "", "<init>", "(Ljava/lang/String;)V", "ZETTLE_TAP_TO_PAY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OnBoardingProductType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingProductType ZETTLE_TAP_TO_PAY;
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingProductType[] getHighSpeedVideoSizes;

    private OnBoardingProductType(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingProductType onBoardingProductType = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingProductType("ZETTLE_TAP_TO_PAY");
        ZETTLE_TAP_TO_PAY = onBoardingProductType;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingProductType[] onBoardingProductTypeArr = {onBoardingProductType};
        getHighSpeedVideoSizes = onBoardingProductTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(onBoardingProductTypeArr);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingProductType[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingProductType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingProductType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingProductType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingProductType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingProductType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
