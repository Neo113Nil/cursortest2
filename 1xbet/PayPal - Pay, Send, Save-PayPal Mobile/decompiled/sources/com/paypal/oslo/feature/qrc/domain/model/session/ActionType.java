package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "PAYMENT_PULL", "PAYMENT_PUSH", "PAYMENT_RESULT", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "DYNAMIC_MERCHANT_FLOW", "CONSENT", "FUNDING_PREFERENCE_SETUP", "NEED_MORE_DATA", "ENROLLMENT_REQUIRED", "MANAGE_QR", "REDIRECT", "THIRD_PARTY_REDIRECT", "PAYMENT_PROVISIONING"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes14.dex */
public final class ActionType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.ActionType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType CONSENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType DYNAMIC_MERCHANT_FLOW;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType ENROLLMENT_REQUIRED;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType FUNDING_PREFERENCE_SETUP;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType MANAGE_QR;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType NEED_MORE_DATA;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType PAYMENT;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType PAYMENT_PROVISIONING;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType PAYMENT_PULL;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType PAYMENT_PUSH;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType PAYMENT_RESULT;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType REDIRECT;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.ActionType THIRD_PARTY_REDIRECT;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/ActionType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/ActionType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.ActionType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.qrc.domain.model.session.ActionType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ActionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("PAYMENT_PULL", 0);
        PAYMENT_PULL = actionType;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType2 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("PAYMENT_PUSH", 1);
        PAYMENT_PUSH = actionType2;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType3 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("PAYMENT_RESULT", 2);
        PAYMENT_RESULT = actionType3;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType4 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, 3);
        PAYMENT = actionType4;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType5 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("DYNAMIC_MERCHANT_FLOW", 4);
        DYNAMIC_MERCHANT_FLOW = actionType5;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType6 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("CONSENT", 5);
        CONSENT = actionType6;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType7 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("FUNDING_PREFERENCE_SETUP", 6);
        FUNDING_PREFERENCE_SETUP = actionType7;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType8 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("NEED_MORE_DATA", 7);
        NEED_MORE_DATA = actionType8;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType9 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("ENROLLMENT_REQUIRED", 8);
        ENROLLMENT_REQUIRED = actionType9;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType10 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("MANAGE_QR", 9);
        MANAGE_QR = actionType10;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType11 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("REDIRECT", 10);
        REDIRECT = actionType11;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType12 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("THIRD_PARTY_REDIRECT", 11);
        THIRD_PARTY_REDIRECT = actionType12;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType actionType13 = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType("PAYMENT_PROVISIONING", 12);
        PAYMENT_PROVISIONING = actionType13;
        com.paypal.oslo.feature.qrc.domain.model.session.ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5, actionType6, actionType7, actionType8, actionType9, actionType10, actionType11, actionType12, actionType13};
        $VALUES = actionTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(actionTypeArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.ActionType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.session.ActionType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.qrc.domain.model.session.ActionType", com.paypal.oslo.feature.qrc.domain.model.session.ActionType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.ActionType[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.ActionType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.ActionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.ActionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.ActionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.ActionType> getEntries() {
        return $ENTRIES;
    }
}
