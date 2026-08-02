package com.paypal.oslo.feature.bankingbundle.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/domain/BundleProduct;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CONSUMER_VIRTUAL_BANK_ACCOUNT", "CONSUMER_DEBIT_CARD", "PAYPAL_CASH_PLUS"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes11.dex */
public final class BundleProduct {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct CONSUMER_DEBIT_CARD;
    public static final com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct CONSUMER_VIRTUAL_BANK_ACCOUNT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct PAYPAL_CASH_PLUS;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/domain/BundleProduct$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BundleProduct;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private BundleProduct(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct bundleProduct = new com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct("CONSUMER_VIRTUAL_BANK_ACCOUNT", 0);
        CONSUMER_VIRTUAL_BANK_ACCOUNT = bundleProduct;
        com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct bundleProduct2 = new com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct("CONSUMER_DEBIT_CARD", 1);
        CONSUMER_DEBIT_CARD = bundleProduct2;
        com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct bundleProduct3 = new com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct("PAYPAL_CASH_PLUS", 2);
        PAYPAL_CASH_PLUS = bundleProduct3;
        com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct[] bundleProductArr = {bundleProduct, bundleProduct2, bundleProduct3};
        $VALUES = bundleProductArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(bundleProductArr);
        INSTANCE = new com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct", com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct[] values() {
        return (com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct) java.lang.Enum.valueOf(com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct> getEntries() {
        return $ENTRIES;
    }
}
