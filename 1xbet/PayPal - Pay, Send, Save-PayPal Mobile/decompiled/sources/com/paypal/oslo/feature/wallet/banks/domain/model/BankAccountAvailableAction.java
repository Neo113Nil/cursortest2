package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAvailableAction;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "INITIATE_PAYPAL_CODE_CONFIRMATION", "INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION", "COMPLETE_PAYPAL_CODE_CONFIRMATION", "COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION", "INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA", "INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION", "COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA", "SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION", "COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION", "COMPLETE_INSTANT_CONFIRMATION", "REMOVE", "SET_AS_PRIMARY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes15.dex */
public final class BankAccountAvailableAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction COMPLETE_INSTANT_CONFIRMATION;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction COMPLETE_PAYPAL_CODE_CONFIRMATION;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction INITIATE_PAYPAL_CODE_CONFIRMATION;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction REMOVE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction SET_AS_PRIMARY;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAvailableAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAvailableAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private BankAccountAvailableAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("INITIATE_PAYPAL_CODE_CONFIRMATION", 0);
        INITIATE_PAYPAL_CODE_CONFIRMATION = bankAccountAvailableAction;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction2 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION", 1);
        INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION = bankAccountAvailableAction2;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction3 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("COMPLETE_PAYPAL_CODE_CONFIRMATION", 2);
        COMPLETE_PAYPAL_CODE_CONFIRMATION = bankAccountAvailableAction3;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction4 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION", 3);
        COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION = bankAccountAvailableAction4;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction5 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA", 4);
        INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA = bankAccountAvailableAction5;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction6 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION", 5);
        INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION = bankAccountAvailableAction6;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction7 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA", 6);
        COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA = bankAccountAvailableAction7;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction8 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION", 7);
        SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION = bankAccountAvailableAction8;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction9 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION", 8);
        COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION = bankAccountAvailableAction9;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction10 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("COMPLETE_INSTANT_CONFIRMATION", 9);
        COMPLETE_INSTANT_CONFIRMATION = bankAccountAvailableAction10;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction11 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("REMOVE", 10);
        REMOVE = bankAccountAvailableAction11;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction12 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("SET_AS_PRIMARY", 11);
        SET_AS_PRIMARY = bankAccountAvailableAction12;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction bankAccountAvailableAction13 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction("UNKNOWN", 12);
        UNKNOWN = bankAccountAvailableAction13;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction[] bankAccountAvailableActionArr = {bankAccountAvailableAction, bankAccountAvailableAction2, bankAccountAvailableAction3, bankAccountAvailableAction4, bankAccountAvailableAction5, bankAccountAvailableAction6, bankAccountAvailableAction7, bankAccountAvailableAction8, bankAccountAvailableAction9, bankAccountAvailableAction10, bankAccountAvailableAction11, bankAccountAvailableAction12, bankAccountAvailableAction13};
        $VALUES = bankAccountAvailableActionArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountAvailableActionArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction", com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction> getEntries() {
        return $ENTRIES;
    }
}
