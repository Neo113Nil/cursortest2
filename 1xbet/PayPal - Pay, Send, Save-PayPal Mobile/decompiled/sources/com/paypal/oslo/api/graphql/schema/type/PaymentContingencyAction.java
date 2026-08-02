package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "USER_DATA_COLLECTION_REQUIRED", "DISPLAY_SCAM_WARNING", "SENDER_CIP_VERIFICATION_REQUIRED", "PURPOSE_CODE_COLLECTION_REQUIRED", "FEATURE_PROVISIONING_REQUIRED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentContingencyAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction DISPLAY_SCAM_WARNING;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction FEATURE_PROVISIONING_REQUIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction PURPOSE_CODE_COLLECTION_REQUIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction SENDER_CIP_VERIFICATION_REQUIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction USER_DATA_COLLECTION_REQUIRED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PaymentContingencyAction(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction = new com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction("USER_DATA_COLLECTION_REQUIRED", 0, "USER_DATA_COLLECTION_REQUIRED");
        USER_DATA_COLLECTION_REQUIRED = paymentContingencyAction;
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction2 = new com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction("DISPLAY_SCAM_WARNING", 1, "DISPLAY_SCAM_WARNING");
        DISPLAY_SCAM_WARNING = paymentContingencyAction2;
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction3 = new com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction("SENDER_CIP_VERIFICATION_REQUIRED", 2, "SENDER_CIP_VERIFICATION_REQUIRED");
        SENDER_CIP_VERIFICATION_REQUIRED = paymentContingencyAction3;
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction4 = new com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction("PURPOSE_CODE_COLLECTION_REQUIRED", 3, "PURPOSE_CODE_COLLECTION_REQUIRED");
        PURPOSE_CODE_COLLECTION_REQUIRED = paymentContingencyAction4;
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction5 = new com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction("FEATURE_PROVISIONING_REQUIRED", 4, "FEATURE_PROVISIONING_REQUIRED");
        FEATURE_PROVISIONING_REQUIRED = paymentContingencyAction5;
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction6 = new com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = paymentContingencyAction6;
        com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction[] paymentContingencyActionArr = {paymentContingencyAction, paymentContingencyAction2, paymentContingencyAction3, paymentContingencyAction4, paymentContingencyAction5, paymentContingencyAction6};
        getHighSpeedVideoSizes = paymentContingencyActionArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(paymentContingencyActionArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PaymentContingencyAction", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"USER_DATA_COLLECTION_REQUIRED", "DISPLAY_SCAM_WARNING", "SENDER_CIP_VERIFICATION_REQUIRED", "PURPOSE_CODE_COLLECTION_REQUIRED", "FEATURE_PROVISIONING_REQUIRED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PaymentContingencyAction;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction[]{com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.USER_DATA_COLLECTION_REQUIRED, com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.DISPLAY_SCAM_WARNING, com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.SENDER_CIP_VERIFICATION_REQUIRED, com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.PURPOSE_CODE_COLLECTION_REQUIRED, com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.FEATURE_PROVISIONING_REQUIRED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction paymentContingencyAction = (com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction) obj;
            return paymentContingencyAction == null ? com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.UNKNOWN__ : paymentContingencyAction;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
