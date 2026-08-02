package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "NEW", "PRESENTED", "IMPRESSED", "CLICKED", "DISMISSED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.NotificationStatus CLICKED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.NotificationStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.NotificationStatus DISMISSED;
    public static final com.paypal.oslo.api.graphql.schema.type.NotificationStatus IMPRESSED;
    public static final com.paypal.oslo.api.graphql.schema.type.NotificationStatus NEW;
    public static final com.paypal.oslo.api.graphql.schema.type.NotificationStatus PRESENTED;
    public static final com.paypal.oslo.api.graphql.schema.type.NotificationStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.NotificationStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private NotificationStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus = new com.paypal.oslo.api.graphql.schema.type.NotificationStatus("NEW", 0, "NEW");
        NEW = notificationStatus;
        com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus2 = new com.paypal.oslo.api.graphql.schema.type.NotificationStatus("PRESENTED", 1, "PRESENTED");
        PRESENTED = notificationStatus2;
        com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus3 = new com.paypal.oslo.api.graphql.schema.type.NotificationStatus("IMPRESSED", 2, "IMPRESSED");
        IMPRESSED = notificationStatus3;
        com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus4 = new com.paypal.oslo.api.graphql.schema.type.NotificationStatus("CLICKED", 3, "CLICKED");
        CLICKED = notificationStatus4;
        com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus5 = new com.paypal.oslo.api.graphql.schema.type.NotificationStatus("DISMISSED", 4, "DISMISSED");
        DISMISSED = notificationStatus5;
        com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus6 = new com.paypal.oslo.api.graphql.schema.type.NotificationStatus("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = notificationStatus6;
        com.paypal.oslo.api.graphql.schema.type.NotificationStatus[] notificationStatusArr = {notificationStatus, notificationStatus2, notificationStatus3, notificationStatus4, notificationStatus5, notificationStatus6};
        getHighResolutionOutputSizeshNQ4ISI = notificationStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(notificationStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.NotificationStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("NotificationStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"NEW", "PRESENTED", "IMPRESSED", "CLICKED", "DISMISSED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/NotificationStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.NotificationStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.NotificationStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.NotificationStatus[]{com.paypal.oslo.api.graphql.schema.type.NotificationStatus.NEW, com.paypal.oslo.api.graphql.schema.type.NotificationStatus.PRESENTED, com.paypal.oslo.api.graphql.schema.type.NotificationStatus.IMPRESSED, com.paypal.oslo.api.graphql.schema.type.NotificationStatus.CLICKED, com.paypal.oslo.api.graphql.schema.type.NotificationStatus.DISMISSED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.NotificationStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.NotificationStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.NotificationStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.NotificationStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.NotificationStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.NotificationStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.NotificationStatus notificationStatus = (com.paypal.oslo.api.graphql.schema.type.NotificationStatus) obj;
            return notificationStatus == null ? com.paypal.oslo.api.graphql.schema.type.NotificationStatus.UNKNOWN__ : notificationStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.NotificationStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.NotificationStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.NotificationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.NotificationStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.NotificationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.NotificationStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
