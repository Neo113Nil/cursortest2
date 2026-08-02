package com.paypal.oslo.feature.revolvingcreditacquisition.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US", "PAYPAL_CREDIT_CARD_US", "PPC_US_V2", "PP_UK_PPC", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class CreditProductIdentifier {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.Companion INSTANCE;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier PAYPAL_CREDIT_CARD_US;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier PPC_US_V2;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier PP_UK_PPC;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/api/model/CreditProductIdentifier;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private CreditProductIdentifier(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier = new com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier("CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US", 0);
        CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US = creditProductIdentifier;
        com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier2 = new com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier("PAYPAL_CREDIT_CARD_US", 1);
        PAYPAL_CREDIT_CARD_US = creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier3 = new com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier("PPC_US_V2", 2);
        PPC_US_V2 = creditProductIdentifier3;
        com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier4 = new com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier("PP_UK_PPC", 3);
        PP_UK_PPC = creditProductIdentifier4;
        com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier creditProductIdentifier5 = new com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier("UNKNOWN", 4);
        UNKNOWN = creditProductIdentifier5;
        com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier[] creditProductIdentifierArr = {creditProductIdentifier, creditProductIdentifier2, creditProductIdentifier3, creditProductIdentifier4, creditProductIdentifier5};
        $VALUES = creditProductIdentifierArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(creditProductIdentifierArr);
        INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier", com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier[] values() {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier> getEntries() {
        return $ENTRIES;
    }
}
