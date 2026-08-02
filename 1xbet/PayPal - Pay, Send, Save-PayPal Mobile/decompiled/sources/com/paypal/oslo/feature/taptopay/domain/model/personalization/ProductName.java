package com.paypal.oslo.feature.taptopay.domain.model.personalization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/ProductName;", "", "<init>", "(Ljava/lang/String;I)V", "PPDC", "PAYLATER", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProductName {
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName PAYLATER;
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName PPDC;
    public static final com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ProductName(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName productName = new com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName("PPDC", 0);
        PPDC = productName;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName productName2 = new com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName("PAYLATER", 1);
        PAYLATER = productName2;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName productName3 = new com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName("UNKNOWN", 2);
        UNKNOWN = productName3;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName[] productNameArr = {productName, productName2, productName3};
        getHighResolutionOutputSizeshNQ4ISI = productNameArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(productNameArr);
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
