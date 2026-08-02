package com.paypal.oslo.feature.oneonboarding.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "intentSuffix", "Ljava/lang/String;", "getIntentSuffix", "()Ljava/lang/String;", "linkWithCurrentUser", "Z", "getLinkWithCurrentUser", "()Z", "Companion", "Organic", "MetaP2p", "PaymentLinks", "SharedAuth"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class AccountCreationEntryPoint {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.Companion INSTANCE;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint MetaP2p;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint Organic;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint PaymentLinks;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint SharedAuth;
    private final java.lang.String intentSuffix;
    private final boolean linkWithCurrentUser;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/AccountCreationEntryPoint;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AccountCreationEntryPoint(java.lang.String str, int i, java.lang.String str2, boolean z) {
        this.intentSuffix = str2;
        this.linkWithCurrentUser = z;
    }

    public final java.lang.String getIntentSuffix() {
        return this.intentSuffix;
    }

    public final boolean getLinkWithCurrentUser() {
        return this.linkWithCurrentUser;
    }

    static {
        com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint = new com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint("Organic", 0, "", false);
        Organic = accountCreationEntryPoint;
        com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint2 = new com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint("MetaP2p", 1, "_META_P2P", false);
        MetaP2p = accountCreationEntryPoint2;
        com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint3 = new com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint("PaymentLinks", 2, "_PAYMENT_LINKS", false);
        PaymentLinks = accountCreationEntryPoint3;
        com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint4 = new com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint("SharedAuth", 3, "_SHARED_AUTH", true);
        SharedAuth = accountCreationEntryPoint4;
        com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint[] accountCreationEntryPointArr = {accountCreationEntryPoint, accountCreationEntryPoint2, accountCreationEntryPoint3, accountCreationEntryPoint4};
        $VALUES = accountCreationEntryPointArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(accountCreationEntryPointArr);
        INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint", com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint[] values() {
        return (com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint> getEntries() {
        return $ENTRIES;
    }
}
