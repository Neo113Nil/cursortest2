package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationState;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "BYPASS_CONFIRMED", "INITIATED", "INITIATION_PENDING", "NEEDS_REINITIATION", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ConfirmationState {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState BYPASS_CONFIRMED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState INITIATED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState INITIATION_PENDING;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState NEEDS_REINITIATION;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationState$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationState;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ConfirmationState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState confirmationState = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState("BYPASS_CONFIRMED", 0);
        BYPASS_CONFIRMED = confirmationState;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState confirmationState2 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState("INITIATED", 1);
        INITIATED = confirmationState2;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState confirmationState3 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState("INITIATION_PENDING", 2);
        INITIATION_PENDING = confirmationState3;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState confirmationState4 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState("NEEDS_REINITIATION", 3);
        NEEDS_REINITIATION = confirmationState4;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState confirmationState5 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState("UNKNOWN", 4);
        UNKNOWN = confirmationState5;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState[] confirmationStateArr = {confirmationState, confirmationState2, confirmationState3, confirmationState4, confirmationState5};
        $VALUES = confirmationStateArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(confirmationStateArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState", com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState> getEntries() {
        return $ENTRIES;
    }
}
