package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "PAYMENT_RESULT", "ENROLLMENT_REQUIRED", "PAYMENT_PULL", "PAYMENT_PUSH", "VALIDATION_ERROR", "REDIRECT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes14.dex */
public final class QrcSessionActionType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType ENROLLMENT_REQUIRED;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType PAYMENT;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType PAYMENT_PULL;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType PAYMENT_PUSH;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType PAYMENT_RESULT;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType REDIRECT;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType UNKNOWN;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType VALIDATION_ERROR;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionActionType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private QrcSessionActionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, 0);
        PAYMENT = qrcSessionActionType;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType2 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType("PAYMENT_RESULT", 1);
        PAYMENT_RESULT = qrcSessionActionType2;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType3 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType("ENROLLMENT_REQUIRED", 2);
        ENROLLMENT_REQUIRED = qrcSessionActionType3;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType4 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType("PAYMENT_PULL", 3);
        PAYMENT_PULL = qrcSessionActionType4;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType5 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType("PAYMENT_PUSH", 4);
        PAYMENT_PUSH = qrcSessionActionType5;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType6 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType("VALIDATION_ERROR", 5);
        VALIDATION_ERROR = qrcSessionActionType6;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType7 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType("REDIRECT", 6);
        REDIRECT = qrcSessionActionType7;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType qrcSessionActionType8 = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType("UNKNOWN", 7);
        UNKNOWN = qrcSessionActionType8;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType[] qrcSessionActionTypeArr = {qrcSessionActionType, qrcSessionActionType2, qrcSessionActionType3, qrcSessionActionType4, qrcSessionActionType5, qrcSessionActionType6, qrcSessionActionType7, qrcSessionActionType8};
        $VALUES = qrcSessionActionTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(qrcSessionActionTypeArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType", com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType> getEntries() {
        return $ENTRIES;
    }
}
