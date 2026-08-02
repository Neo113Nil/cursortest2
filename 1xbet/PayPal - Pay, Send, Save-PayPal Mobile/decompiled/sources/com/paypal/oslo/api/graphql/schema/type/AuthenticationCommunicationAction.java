package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "UNIFIED_ALERT_REQUEST_APPROVED", "UNIFIED_ALERT_REQUEST_DENIED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationCommunicationAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction UNIFIED_ALERT_REQUEST_APPROVED;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction UNIFIED_ALERT_REQUEST_DENIED;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction[] getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AuthenticationCommunicationAction(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction authenticationCommunicationAction = new com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction("UNIFIED_ALERT_REQUEST_APPROVED", 0, "UNIFIED_ALERT_REQUEST_APPROVED");
        UNIFIED_ALERT_REQUEST_APPROVED = authenticationCommunicationAction;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction authenticationCommunicationAction2 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction("UNIFIED_ALERT_REQUEST_DENIED", 1, "UNIFIED_ALERT_REQUEST_DENIED");
        UNIFIED_ALERT_REQUEST_DENIED = authenticationCommunicationAction2;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction authenticationCommunicationAction3 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = authenticationCommunicationAction3;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction[] authenticationCommunicationActionArr = {authenticationCommunicationAction, authenticationCommunicationAction2, authenticationCommunicationAction3};
        getHighResolutionOutputSizeshNQ4ISI = authenticationCommunicationActionArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(authenticationCommunicationActionArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AuthenticationCommunicationAction", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"UNIFIED_ALERT_REQUEST_APPROVED", "UNIFIED_ALERT_REQUEST_DENIED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction[]{com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction.UNIFIED_ALERT_REQUEST_APPROVED, com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction.UNIFIED_ALERT_REQUEST_DENIED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction authenticationCommunicationAction = (com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction) obj;
            return authenticationCommunicationAction == null ? com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction.UNKNOWN__ : authenticationCommunicationAction;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
