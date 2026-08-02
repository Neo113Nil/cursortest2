package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "INSTANT_CONFIRMATION", "PAYPAL_CODE_CONFIRMATION", "TWO_DEPOSIT_CONFIRMATION", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ConfirmationMethod {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod INSTANT_CONFIRMATION;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod PAYPAL_CODE_CONFIRMATION;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod TWO_DEPOSIT_CONFIRMATION;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationMethod$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationMethod;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ConfirmationMethod(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod confirmationMethod = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod("INSTANT_CONFIRMATION", 0);
        INSTANT_CONFIRMATION = confirmationMethod;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod confirmationMethod2 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod("PAYPAL_CODE_CONFIRMATION", 1);
        PAYPAL_CODE_CONFIRMATION = confirmationMethod2;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod confirmationMethod3 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod("TWO_DEPOSIT_CONFIRMATION", 2);
        TWO_DEPOSIT_CONFIRMATION = confirmationMethod3;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod confirmationMethod4 = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod("UNKNOWN", 3);
        UNKNOWN = confirmationMethod4;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod[] confirmationMethodArr = {confirmationMethod, confirmationMethod2, confirmationMethod3, confirmationMethod4};
        $VALUES = confirmationMethodArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(confirmationMethodArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod", com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod> getEntries() {
        return $ENTRIES;
    }
}
