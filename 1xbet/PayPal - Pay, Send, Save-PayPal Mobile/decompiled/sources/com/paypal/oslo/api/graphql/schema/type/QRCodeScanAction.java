package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodeScanAction;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PAYMENT_PULL", "PAYMENT_PUSH", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "PAYMENT_RESULT", "DYNAMIC_MERCHANT_FLOW", "CONSENT", "FUNDING_PREFERENCE_SETUP", "ENROLLMENT_REQUIRED", "NEED_MORE_DATA", "MANAGE_QR", "REDIRECT", "PAYMENT_PROVISIONING", "THIRD_PARTY_REDIRECT", "NON_INTERACTIVE_WITH_LOYALTY_CARD", "DECODE", "SHOW_VALIDATION_ERROR", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QRCodeScanAction {
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction CONSENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction DECODE;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction DYNAMIC_MERCHANT_FLOW;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction ENROLLMENT_REQUIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction FUNDING_PREFERENCE_SETUP;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction MANAGE_QR;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction NEED_MORE_DATA;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction NON_INTERACTIVE_WITH_LOYALTY_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction PAYMENT_PROVISIONING;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction PAYMENT_PULL;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction PAYMENT_PUSH;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction PAYMENT_RESULT;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction REDIRECT;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction SHOW_VALIDATION_ERROR;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction THIRD_PARTY_REDIRECT;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private QRCodeScanAction(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("PAYMENT_PULL", 0, "PAYMENT_PULL");
        PAYMENT_PULL = qRCodeScanAction;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction2 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("PAYMENT_PUSH", 1, "PAYMENT_PUSH");
        PAYMENT_PUSH = qRCodeScanAction2;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction3 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, 2, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT);
        PAYMENT = qRCodeScanAction3;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction4 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("PAYMENT_RESULT", 3, "PAYMENT_RESULT");
        PAYMENT_RESULT = qRCodeScanAction4;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction5 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("DYNAMIC_MERCHANT_FLOW", 4, "DYNAMIC_MERCHANT_FLOW");
        DYNAMIC_MERCHANT_FLOW = qRCodeScanAction5;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction6 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("CONSENT", 5, "CONSENT");
        CONSENT = qRCodeScanAction6;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction7 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("FUNDING_PREFERENCE_SETUP", 6, "FUNDING_PREFERENCE_SETUP");
        FUNDING_PREFERENCE_SETUP = qRCodeScanAction7;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction8 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("ENROLLMENT_REQUIRED", 7, "ENROLLMENT_REQUIRED");
        ENROLLMENT_REQUIRED = qRCodeScanAction8;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction9 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("NEED_MORE_DATA", 8, "NEED_MORE_DATA");
        NEED_MORE_DATA = qRCodeScanAction9;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction10 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("MANAGE_QR", 9, "MANAGE_QR");
        MANAGE_QR = qRCodeScanAction10;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction11 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("REDIRECT", 10, "REDIRECT");
        REDIRECT = qRCodeScanAction11;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction12 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("PAYMENT_PROVISIONING", 11, "PAYMENT_PROVISIONING");
        PAYMENT_PROVISIONING = qRCodeScanAction12;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction13 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("THIRD_PARTY_REDIRECT", 12, "THIRD_PARTY_REDIRECT");
        THIRD_PARTY_REDIRECT = qRCodeScanAction13;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction14 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("NON_INTERACTIVE_WITH_LOYALTY_CARD", 13, "NON_INTERACTIVE_WITH_LOYALTY_CARD");
        NON_INTERACTIVE_WITH_LOYALTY_CARD = qRCodeScanAction14;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction15 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("DECODE", 14, "DECODE");
        DECODE = qRCodeScanAction15;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction16 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("SHOW_VALIDATION_ERROR", 15, "SHOW_VALIDATION_ERROR");
        SHOW_VALIDATION_ERROR = qRCodeScanAction16;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction17 = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction("UNKNOWN__", 16, "UNKNOWN__");
        UNKNOWN__ = qRCodeScanAction17;
        com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction[] qRCodeScanActionArr = {qRCodeScanAction, qRCodeScanAction2, qRCodeScanAction3, qRCodeScanAction4, qRCodeScanAction5, qRCodeScanAction6, qRCodeScanAction7, qRCodeScanAction8, qRCodeScanAction9, qRCodeScanAction10, qRCodeScanAction11, qRCodeScanAction12, qRCodeScanAction13, qRCodeScanAction14, qRCodeScanAction15, qRCodeScanAction16, qRCodeScanAction17};
        getHighSpeedVideoFpsRangesFor = qRCodeScanActionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(qRCodeScanActionArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("QRCodeScanAction", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PAYMENT_PULL", "PAYMENT_PUSH", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "PAYMENT_RESULT", "DYNAMIC_MERCHANT_FLOW", "CONSENT", "FUNDING_PREFERENCE_SETUP", "ENROLLMENT_REQUIRED", "NEED_MORE_DATA", "MANAGE_QR", "REDIRECT", "PAYMENT_PROVISIONING", "THIRD_PARTY_REDIRECT", "NON_INTERACTIVE_WITH_LOYALTY_CARD", "DECODE", "SHOW_VALIDATION_ERROR"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodeScanAction$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/QRCodeScanAction;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/QRCodeScanAction;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/QRCodeScanAction;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction[]{com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.PAYMENT_PULL, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.PAYMENT_PUSH, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.PAYMENT, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.PAYMENT_RESULT, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.DYNAMIC_MERCHANT_FLOW, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.CONSENT, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.FUNDING_PREFERENCE_SETUP, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.ENROLLMENT_REQUIRED, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.NEED_MORE_DATA, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.MANAGE_QR, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.REDIRECT, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.PAYMENT_PROVISIONING, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.THIRD_PARTY_REDIRECT, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.NON_INTERACTIVE_WITH_LOYALTY_CARD, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.DECODE, com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.SHOW_VALIDATION_ERROR});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction qRCodeScanAction = (com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction) obj;
            return qRCodeScanAction == null ? com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.UNKNOWN__ : qRCodeScanAction;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.QRCodeScanAction> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
