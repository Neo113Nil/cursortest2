package com.paypal.oslo.feature.wallet.api.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "BUSINESS_CHECKING", "BUSINESS_SAVINGS", com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, "CUSTOM", "NORMAL", "SAVINGS", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class BankAccountType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType BUSINESS_CHECKING;
    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType BUSINESS_SAVINGS;
    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType CHECKING;
    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType CUSTOM;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType NORMAL;
    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType SAVINGS;
    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private BankAccountType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = new com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType("BUSINESS_CHECKING", 0);
        BUSINESS_CHECKING = bankAccountType;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType2 = new com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType("BUSINESS_SAVINGS", 1);
        BUSINESS_SAVINGS = bankAccountType2;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType3 = new com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType(com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, 2);
        CHECKING = bankAccountType3;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType4 = new com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType("CUSTOM", 3);
        CUSTOM = bankAccountType4;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType5 = new com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType("NORMAL", 4);
        NORMAL = bankAccountType5;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType6 = new com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType("SAVINGS", 5);
        SAVINGS = bankAccountType6;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType7 = new com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType("UNKNOWN", 6);
        UNKNOWN = bankAccountType7;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType[] bankAccountTypeArr = {bankAccountType, bankAccountType2, bankAccountType3, bankAccountType4, bankAccountType5, bankAccountType6, bankAccountType7};
        $VALUES = bankAccountTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountTypeArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType", com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType[] values() {
        return (com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType> getEntries() {
        return $ENTRIES;
    }
}
