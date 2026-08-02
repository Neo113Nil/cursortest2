package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodeFlowDirective;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "FLOW_REQUIRES_RISK_VETTING", "FLOW_CAN_HANDLE_AUTH_DECISION", "FLOW_CAN_HANDLE_REAL_TIME_BALANCE_DECISION", "FLOW_CAN_HANDLE_TRAVEL_RULE", "FLOW_CAN_HANDLE_USER_LEGAL_CONTINGENCY", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QRCodeFlowDirective {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective FLOW_CAN_HANDLE_AUTH_DECISION;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective FLOW_CAN_HANDLE_REAL_TIME_BALANCE_DECISION;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective FLOW_CAN_HANDLE_TRAVEL_RULE;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective FLOW_CAN_HANDLE_USER_LEGAL_CONTINGENCY;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective FLOW_REQUIRES_RISK_VETTING;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private QRCodeFlowDirective(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective qRCodeFlowDirective = new com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective("FLOW_REQUIRES_RISK_VETTING", 0, "FLOW_REQUIRES_RISK_VETTING");
        FLOW_REQUIRES_RISK_VETTING = qRCodeFlowDirective;
        com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective qRCodeFlowDirective2 = new com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective("FLOW_CAN_HANDLE_AUTH_DECISION", 1, "FLOW_CAN_HANDLE_AUTH_DECISION");
        FLOW_CAN_HANDLE_AUTH_DECISION = qRCodeFlowDirective2;
        com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective qRCodeFlowDirective3 = new com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective("FLOW_CAN_HANDLE_REAL_TIME_BALANCE_DECISION", 2, "FLOW_CAN_HANDLE_REAL_TIME_BALANCE_DECISION");
        FLOW_CAN_HANDLE_REAL_TIME_BALANCE_DECISION = qRCodeFlowDirective3;
        com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective qRCodeFlowDirective4 = new com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective("FLOW_CAN_HANDLE_TRAVEL_RULE", 3, "FLOW_CAN_HANDLE_TRAVEL_RULE");
        FLOW_CAN_HANDLE_TRAVEL_RULE = qRCodeFlowDirective4;
        com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective qRCodeFlowDirective5 = new com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective("FLOW_CAN_HANDLE_USER_LEGAL_CONTINGENCY", 4, "FLOW_CAN_HANDLE_USER_LEGAL_CONTINGENCY");
        FLOW_CAN_HANDLE_USER_LEGAL_CONTINGENCY = qRCodeFlowDirective5;
        com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective qRCodeFlowDirective6 = new com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = qRCodeFlowDirective6;
        com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective[] qRCodeFlowDirectiveArr = {qRCodeFlowDirective, qRCodeFlowDirective2, qRCodeFlowDirective3, qRCodeFlowDirective4, qRCodeFlowDirective5, qRCodeFlowDirective6};
        getHighSpeedVideoSizes = qRCodeFlowDirectiveArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(qRCodeFlowDirectiveArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("QRCodeFlowDirective", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"FLOW_REQUIRES_RISK_VETTING", "FLOW_CAN_HANDLE_AUTH_DECISION", "FLOW_CAN_HANDLE_REAL_TIME_BALANCE_DECISION", "FLOW_CAN_HANDLE_TRAVEL_RULE", "FLOW_CAN_HANDLE_USER_LEGAL_CONTINGENCY"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodeFlowDirective$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/QRCodeFlowDirective;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/QRCodeFlowDirective;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/QRCodeFlowDirective;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective[]{com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective.FLOW_REQUIRES_RISK_VETTING, com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective.FLOW_CAN_HANDLE_AUTH_DECISION, com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective.FLOW_CAN_HANDLE_REAL_TIME_BALANCE_DECISION, com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective.FLOW_CAN_HANDLE_TRAVEL_RULE, com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective.FLOW_CAN_HANDLE_USER_LEGAL_CONTINGENCY});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective qRCodeFlowDirective = (com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective) obj;
            return qRCodeFlowDirective == null ? com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective.UNKNOWN__ : qRCodeFlowDirective;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.QRCodeFlowDirective> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
