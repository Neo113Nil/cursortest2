package com.paypal.oslo.feature.subscriptions.shared.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "", "<init>", "(Ljava/lang/String;I)V", "MERCHANT_MANAGED", "PAYPAL_MANAGED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MerchantManagementType {
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType MERCHANT_MANAGED;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType PAYPAL_MANAGED;
    private static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private MerchantManagementType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType = new com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType("MERCHANT_MANAGED", 0);
        MERCHANT_MANAGED = merchantManagementType;
        com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType2 = new com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType("PAYPAL_MANAGED", 1);
        PAYPAL_MANAGED = merchantManagementType2;
        com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType[] merchantManagementTypeArr = {merchantManagementType, merchantManagementType2};
        getHighSpeedVideoFpsRanges = merchantManagementTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(merchantManagementTypeArr);
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType[] values() {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType) java.lang.Enum.valueOf(com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
