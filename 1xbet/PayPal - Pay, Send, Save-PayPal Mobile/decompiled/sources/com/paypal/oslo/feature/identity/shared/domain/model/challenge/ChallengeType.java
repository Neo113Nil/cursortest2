package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SMS", "IVR", "EMAIL", "SECURITY_QUESTION", "CREDIT_CARD", "SILENT_AUTH", "WHATSAPP", "WEBVIEW", "CHANGE_PASSWORD", "SKIP_AND_LOGIN", "AUTHENTICATOR_APP", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ChallengeType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType AUTHENTICATOR_APP;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType CHANGE_PASSWORD;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType CREDIT_CARD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType EMAIL;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType IVR;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType SECURITY_QUESTION;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType SILENT_AUTH;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType SKIP_AND_LOGIN;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType SMS;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType UNKNOWN;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType WEBVIEW;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType WHATSAPP;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ChallengeType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("SMS", 0);
        SMS = challengeType;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType2 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("IVR", 1);
        IVR = challengeType2;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType3 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("EMAIL", 2);
        EMAIL = challengeType3;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType4 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("SECURITY_QUESTION", 3);
        SECURITY_QUESTION = challengeType4;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType5 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("CREDIT_CARD", 4);
        CREDIT_CARD = challengeType5;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType6 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("SILENT_AUTH", 5);
        SILENT_AUTH = challengeType6;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType7 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("WHATSAPP", 6);
        WHATSAPP = challengeType7;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType8 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("WEBVIEW", 7);
        WEBVIEW = challengeType8;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType9 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("CHANGE_PASSWORD", 8);
        CHANGE_PASSWORD = challengeType9;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType10 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("SKIP_AND_LOGIN", 9);
        SKIP_AND_LOGIN = challengeType10;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType11 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("AUTHENTICATOR_APP", 10);
        AUTHENTICATOR_APP = challengeType11;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType12 = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType("UNKNOWN", 11);
        UNKNOWN = challengeType12;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType[] challengeTypeArr = {challengeType, challengeType2, challengeType3, challengeType4, challengeType5, challengeType6, challengeType7, challengeType8, challengeType9, challengeType10, challengeType11, challengeType12};
        $VALUES = challengeTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(challengeTypeArr);
        INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType", com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType[] values() {
        return (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType> getEntries() {
        return $ENTRIES;
    }
}
