package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/ItemType;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCT", "SERVICE", "CUSTOM_AMOUNT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ItemType {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType CUSTOM_AMOUNT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType PRODUCT;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType SERVICE;
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType[] getHighResolutionOutputSizeshNQ4ISI;

    private ItemType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType itemType = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType("PRODUCT", 0);
        PRODUCT = itemType;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType itemType2 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType("SERVICE", 1);
        SERVICE = itemType2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType itemType3 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType("CUSTOM_AMOUNT", 2);
        CUSTOM_AMOUNT = itemType3;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType[] itemTypeArr = {itemType, itemType2, itemType3};
        getHighResolutionOutputSizeshNQ4ISI = itemTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(itemTypeArr);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
