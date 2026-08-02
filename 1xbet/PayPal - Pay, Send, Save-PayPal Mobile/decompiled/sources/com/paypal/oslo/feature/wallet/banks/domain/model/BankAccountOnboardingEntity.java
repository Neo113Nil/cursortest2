package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "EBAY", "PAYPAL", "VENMO", "BRAINTREE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class BankAccountOnboardingEntity {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity BRAINTREE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity EBAY;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity PAYPAL;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity UNKNOWN;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity VENMO;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private BankAccountOnboardingEntity(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity("EBAY", 0);
        EBAY = bankAccountOnboardingEntity;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity2 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity("PAYPAL", 1);
        PAYPAL = bankAccountOnboardingEntity2;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity3 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity("VENMO", 2);
        VENMO = bankAccountOnboardingEntity3;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity4 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity("BRAINTREE", 3);
        BRAINTREE = bankAccountOnboardingEntity4;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity5 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity("UNKNOWN", 4);
        UNKNOWN = bankAccountOnboardingEntity5;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity[] bankAccountOnboardingEntityArr = {bankAccountOnboardingEntity, bankAccountOnboardingEntity2, bankAccountOnboardingEntity3, bankAccountOnboardingEntity4, bankAccountOnboardingEntity5};
        $VALUES = bankAccountOnboardingEntityArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountOnboardingEntityArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity", com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity> getEntries() {
        return $ENTRIES;
    }
}
