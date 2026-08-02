package com.paypal.oslo.feature.taptopay.domain.model.personalization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/EnrolledProduct;", "", "<init>", "(Ljava/lang/String;I)V", "PPDC", "BDMC", "PAYLATER", "THIRD_PARTY_ACTIONABLE", "THIRD_PARTY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EnrolledProduct {
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct BDMC;
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct PAYLATER;
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct PPDC;
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct THIRD_PARTY;
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct THIRD_PARTY_ACTIONABLE;
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private EnrolledProduct(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct enrolledProduct = new com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct("PPDC", 0);
        PPDC = enrolledProduct;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct enrolledProduct2 = new com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct("BDMC", 1);
        BDMC = enrolledProduct2;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct enrolledProduct3 = new com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct("PAYLATER", 2);
        PAYLATER = enrolledProduct3;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct enrolledProduct4 = new com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct("THIRD_PARTY_ACTIONABLE", 3);
        THIRD_PARTY_ACTIONABLE = enrolledProduct4;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct enrolledProduct5 = new com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct("THIRD_PARTY", 4);
        THIRD_PARTY = enrolledProduct5;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct enrolledProduct6 = new com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct("UNKNOWN", 5);
        UNKNOWN = enrolledProduct6;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct[] enrolledProductArr = {enrolledProduct, enrolledProduct2, enrolledProduct3, enrolledProduct4, enrolledProduct5, enrolledProduct6};
        getHighSpeedVideoFpsRanges = enrolledProductArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(enrolledProductArr);
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.personalization.EnrolledProduct> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
