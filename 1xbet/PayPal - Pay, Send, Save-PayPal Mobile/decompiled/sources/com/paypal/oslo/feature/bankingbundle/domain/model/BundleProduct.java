package com.paypal.oslo.feature.bankingbundle.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/domain/model/BundleProduct;", "", "<init>", "(Ljava/lang/String;I)V", "CONSUMER_VIRTUAL_BANK_ACCOUNT", "CONSUMER_DEBIT_CARD", "PAYPAL_CASH_PLUS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BundleProduct {
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct CONSUMER_DEBIT_CARD;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct CONSUMER_VIRTUAL_BANK_ACCOUNT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct PAYPAL_CASH_PLUS;
    private static final /* synthetic */ com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct[] getHighSpeedVideoFpsRanges;

    private BundleProduct(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct bundleProduct = new com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct("CONSUMER_VIRTUAL_BANK_ACCOUNT", 0);
        CONSUMER_VIRTUAL_BANK_ACCOUNT = bundleProduct;
        com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct bundleProduct2 = new com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct("CONSUMER_DEBIT_CARD", 1);
        CONSUMER_DEBIT_CARD = bundleProduct2;
        com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct bundleProduct3 = new com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct("PAYPAL_CASH_PLUS", 2);
        PAYPAL_CASH_PLUS = bundleProduct3;
        com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct[] bundleProductArr = {bundleProduct, bundleProduct2, bundleProduct3};
        getHighSpeedVideoFpsRanges = bundleProductArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(bundleProductArr);
    }

    public static com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct[] values() {
        return (com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct) java.lang.Enum.valueOf(com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bankingbundle.domain.model.BundleProduct> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
