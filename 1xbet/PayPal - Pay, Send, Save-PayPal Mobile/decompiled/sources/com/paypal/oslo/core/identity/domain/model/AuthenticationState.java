package com.paypal.oslo.core.identity.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "REMEMBERED", "LOGGED_IN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class AuthenticationState {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.core.identity.domain.model.AuthenticationState[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.identity.domain.model.AuthenticationState.Companion INSTANCE;
    public static final com.paypal.oslo.core.identity.domain.model.AuthenticationState LOGGED_IN;
    public static final com.paypal.oslo.core.identity.domain.model.AuthenticationState REMEMBERED;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.identity.domain.model.AuthenticationState> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.core.identity.domain.model.AuthenticationState.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AuthenticationState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState = new com.paypal.oslo.core.identity.domain.model.AuthenticationState("REMEMBERED", 0);
        REMEMBERED = authenticationState;
        com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState2 = new com.paypal.oslo.core.identity.domain.model.AuthenticationState("LOGGED_IN", 1);
        LOGGED_IN = authenticationState2;
        com.paypal.oslo.core.identity.domain.model.AuthenticationState[] authenticationStateArr = {authenticationState, authenticationState2};
        $VALUES = authenticationStateArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(authenticationStateArr);
        INSTANCE = new com.paypal.oslo.core.identity.domain.model.AuthenticationState.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.identity.domain.model.AuthenticationState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.core.identity.domain.model.AuthenticationState", com.paypal.oslo.core.identity.domain.model.AuthenticationState.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.core.identity.domain.model.AuthenticationState[] values() {
        return (com.paypal.oslo.core.identity.domain.model.AuthenticationState[]) $VALUES.clone();
    }

    public static com.paypal.oslo.core.identity.domain.model.AuthenticationState valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.identity.domain.model.AuthenticationState) java.lang.Enum.valueOf(com.paypal.oslo.core.identity.domain.model.AuthenticationState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.identity.domain.model.AuthenticationState> getEntries() {
        return $ENTRIES;
    }
}
