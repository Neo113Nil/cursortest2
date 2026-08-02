package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeFlowType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "LOGIN", "TRANSACTION", "PASSWORD_RESET", "SWITCH_ACCOUNT"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ChallengeFlowType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType LOGIN;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType PASSWORD_RESET;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType SWITCH_ACCOUNT;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType TRANSACTION;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeFlowType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeFlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ChallengeFlowType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType challengeFlowType = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType("LOGIN", 0);
        LOGIN = challengeFlowType;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType challengeFlowType2 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType("TRANSACTION", 1);
        TRANSACTION = challengeFlowType2;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType challengeFlowType3 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType("PASSWORD_RESET", 2);
        PASSWORD_RESET = challengeFlowType3;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType challengeFlowType4 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType("SWITCH_ACCOUNT", 3);
        SWITCH_ACCOUNT = challengeFlowType4;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType[] challengeFlowTypeArr = {challengeFlowType, challengeFlowType2, challengeFlowType3, challengeFlowType4};
        $VALUES = challengeFlowTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(challengeFlowTypeArr);
        INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType[] values() {
        return (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType> getEntries() {
        return $ENTRIES;
    }
}
