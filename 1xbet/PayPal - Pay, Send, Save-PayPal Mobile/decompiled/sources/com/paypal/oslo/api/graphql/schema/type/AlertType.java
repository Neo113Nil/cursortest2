package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AlertType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CRITICAL", "INFO", "WARNING", "CONTACT_US", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AlertType {
    public static final com.paypal.oslo.api.graphql.schema.type.AlertType CONTACT_US;
    public static final com.paypal.oslo.api.graphql.schema.type.AlertType CRITICAL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AlertType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AlertType INFO;
    public static final com.paypal.oslo.api.graphql.schema.type.AlertType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.AlertType WARNING;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AlertType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AlertType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AlertType alertType = new com.paypal.oslo.api.graphql.schema.type.AlertType("CRITICAL", 0, "CRITICAL");
        CRITICAL = alertType;
        com.paypal.oslo.api.graphql.schema.type.AlertType alertType2 = new com.paypal.oslo.api.graphql.schema.type.AlertType("INFO", 1, "INFO");
        INFO = alertType2;
        com.paypal.oslo.api.graphql.schema.type.AlertType alertType3 = new com.paypal.oslo.api.graphql.schema.type.AlertType("WARNING", 2, "WARNING");
        WARNING = alertType3;
        com.paypal.oslo.api.graphql.schema.type.AlertType alertType4 = new com.paypal.oslo.api.graphql.schema.type.AlertType("CONTACT_US", 3, "CONTACT_US");
        CONTACT_US = alertType4;
        com.paypal.oslo.api.graphql.schema.type.AlertType alertType5 = new com.paypal.oslo.api.graphql.schema.type.AlertType("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = alertType5;
        com.paypal.oslo.api.graphql.schema.type.AlertType[] alertTypeArr = {alertType, alertType2, alertType3, alertType4, alertType5};
        getHighSpeedVideoFpsRangesFor = alertTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(alertTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AlertType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AlertType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CRITICAL", "INFO", "WARNING", "CONTACT_US"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AlertType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AlertType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AlertType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AlertType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AlertType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AlertType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AlertType[]{com.paypal.oslo.api.graphql.schema.type.AlertType.CRITICAL, com.paypal.oslo.api.graphql.schema.type.AlertType.INFO, com.paypal.oslo.api.graphql.schema.type.AlertType.WARNING, com.paypal.oslo.api.graphql.schema.type.AlertType.CONTACT_US});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AlertType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AlertType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AlertType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AlertType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AlertType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AlertType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AlertType alertType = (com.paypal.oslo.api.graphql.schema.type.AlertType) obj;
            return alertType == null ? com.paypal.oslo.api.graphql.schema.type.AlertType.UNKNOWN__ : alertType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AlertType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AlertType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AlertType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AlertType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AlertType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AlertType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
