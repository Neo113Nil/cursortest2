package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "THREE_D_SECURE_DATA_COLLECTION_REQUIRED", "THREE_D_SECURE_AUTHENTICATION_REQUIRED", "CARD_VERIFICATION_DATA_COLLECTION_REQUIRED", "OBTAIN_REAL_TIME_BALANCE_CONSENT", "REFRESH_REAL_TIME_BALANCE", "TOPUP_INSTRUMENT", "USER_DATA_COLLECTION_REQUIRED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlanContingencyAction {
    public static final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction CARD_VERIFICATION_DATA_COLLECTION_REQUIRED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction OBTAIN_REAL_TIME_BALANCE_CONSENT;
    public static final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction REFRESH_REAL_TIME_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction THREE_D_SECURE_AUTHENTICATION_REQUIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction THREE_D_SECURE_DATA_COLLECTION_REQUIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction TOPUP_INSTRUMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction USER_DATA_COLLECTION_REQUIRED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction[] getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PlanContingencyAction(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction = new com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction("THREE_D_SECURE_DATA_COLLECTION_REQUIRED", 0, "THREE_D_SECURE_DATA_COLLECTION_REQUIRED");
        THREE_D_SECURE_DATA_COLLECTION_REQUIRED = planContingencyAction;
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction2 = new com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction("THREE_D_SECURE_AUTHENTICATION_REQUIRED", 1, "THREE_D_SECURE_AUTHENTICATION_REQUIRED");
        THREE_D_SECURE_AUTHENTICATION_REQUIRED = planContingencyAction2;
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction3 = new com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction("CARD_VERIFICATION_DATA_COLLECTION_REQUIRED", 2, "CARD_VERIFICATION_DATA_COLLECTION_REQUIRED");
        CARD_VERIFICATION_DATA_COLLECTION_REQUIRED = planContingencyAction3;
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction4 = new com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction("OBTAIN_REAL_TIME_BALANCE_CONSENT", 3, "OBTAIN_REAL_TIME_BALANCE_CONSENT");
        OBTAIN_REAL_TIME_BALANCE_CONSENT = planContingencyAction4;
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction5 = new com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction("REFRESH_REAL_TIME_BALANCE", 4, "REFRESH_REAL_TIME_BALANCE");
        REFRESH_REAL_TIME_BALANCE = planContingencyAction5;
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction6 = new com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction("TOPUP_INSTRUMENT", 5, "TOPUP_INSTRUMENT");
        TOPUP_INSTRUMENT = planContingencyAction6;
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction7 = new com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction("USER_DATA_COLLECTION_REQUIRED", 6, "USER_DATA_COLLECTION_REQUIRED");
        USER_DATA_COLLECTION_REQUIRED = planContingencyAction7;
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction8 = new com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = planContingencyAction8;
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction[] planContingencyActionArr = {planContingencyAction, planContingencyAction2, planContingencyAction3, planContingencyAction4, planContingencyAction5, planContingencyAction6, planContingencyAction7, planContingencyAction8};
        getHighResolutionOutputSizeshNQ4ISI = planContingencyActionArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(planContingencyActionArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PlanContingencyAction", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"THREE_D_SECURE_DATA_COLLECTION_REQUIRED", "THREE_D_SECURE_AUTHENTICATION_REQUIRED", "CARD_VERIFICATION_DATA_COLLECTION_REQUIRED", "OBTAIN_REAL_TIME_BALANCE_CONSENT", "REFRESH_REAL_TIME_BALANCE", "TOPUP_INSTRUMENT", "USER_DATA_COLLECTION_REQUIRED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PlanContingencyAction;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction[]{com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.THREE_D_SECURE_DATA_COLLECTION_REQUIRED, com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.THREE_D_SECURE_AUTHENTICATION_REQUIRED, com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.CARD_VERIFICATION_DATA_COLLECTION_REQUIRED, com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.OBTAIN_REAL_TIME_BALANCE_CONSENT, com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.REFRESH_REAL_TIME_BALANCE, com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.TOPUP_INSTRUMENT, com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.USER_DATA_COLLECTION_REQUIRED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction = (com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction) obj;
            return planContingencyAction == null ? com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.UNKNOWN__ : planContingencyAction;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
