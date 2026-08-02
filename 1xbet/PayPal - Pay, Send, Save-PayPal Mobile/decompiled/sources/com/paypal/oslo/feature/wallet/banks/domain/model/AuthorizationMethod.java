package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/AuthorizationMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ELECTRONIC_MANDATE", "MANUAL_MANDATE", "PAYPAL_AGREEMENT", "PAYPAL_HELD_ELV_MANDATE", "PAYPAL_HELD_SEPA_MANDATE", "ONLINE_MANDATE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class AuthorizationMethod {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod ELECTRONIC_MANDATE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod MANUAL_MANDATE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod ONLINE_MANDATE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod PAYPAL_AGREEMENT;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod PAYPAL_HELD_ELV_MANDATE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod PAYPAL_HELD_SEPA_MANDATE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/AuthorizationMethod$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/AuthorizationMethod;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AuthorizationMethod(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod authorizationMethod = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod("ELECTRONIC_MANDATE", 0);
        ELECTRONIC_MANDATE = authorizationMethod;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod authorizationMethod2 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod("MANUAL_MANDATE", 1);
        MANUAL_MANDATE = authorizationMethod2;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod authorizationMethod3 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod("PAYPAL_AGREEMENT", 2);
        PAYPAL_AGREEMENT = authorizationMethod3;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod authorizationMethod4 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod("PAYPAL_HELD_ELV_MANDATE", 3);
        PAYPAL_HELD_ELV_MANDATE = authorizationMethod4;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod authorizationMethod5 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod("PAYPAL_HELD_SEPA_MANDATE", 4);
        PAYPAL_HELD_SEPA_MANDATE = authorizationMethod5;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod authorizationMethod6 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod("ONLINE_MANDATE", 5);
        ONLINE_MANDATE = authorizationMethod6;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod authorizationMethod7 = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod("UNKNOWN", 6);
        UNKNOWN = authorizationMethod7;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod[] authorizationMethodArr = {authorizationMethod, authorizationMethod2, authorizationMethod3, authorizationMethod4, authorizationMethod5, authorizationMethod6, authorizationMethod7};
        $VALUES = authorizationMethodArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(authorizationMethodArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod", com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod> getEntries() {
        return $ENTRIES;
    }
}
