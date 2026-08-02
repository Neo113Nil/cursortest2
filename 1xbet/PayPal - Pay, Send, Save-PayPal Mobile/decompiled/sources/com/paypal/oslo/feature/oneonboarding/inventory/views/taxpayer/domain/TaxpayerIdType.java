package com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SSN", "ITIN", "SSN4", "ITIN4", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class TaxpayerIdType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType ITIN;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType ITIN4;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType SSN;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType SSN4;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType UNKNOWN__;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private TaxpayerIdType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType = new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType("SSN", 0);
        SSN = taxpayerIdType;
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType2 = new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType("ITIN", 1);
        ITIN = taxpayerIdType2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType3 = new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType("SSN4", 2);
        SSN4 = taxpayerIdType3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType4 = new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType("ITIN4", 3);
        ITIN4 = taxpayerIdType4;
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType5 = new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType("UNKNOWN__", 4);
        UNKNOWN__ = taxpayerIdType5;
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType[] taxpayerIdTypeArr = {taxpayerIdType, taxpayerIdType2, taxpayerIdType3, taxpayerIdType4, taxpayerIdType5};
        $VALUES = taxpayerIdTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(taxpayerIdTypeArr);
        INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType", com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType[] values() {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType> getEntries() {
        return $ENTRIES;
    }
}
