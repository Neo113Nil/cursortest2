package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RecurringSubscriptionStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "SUBSCRIBED", com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RecurringSubscriptionStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus CANCELLED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus PAUSED;
    public static final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus SUBSCRIBED;
    public static final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private RecurringSubscriptionStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus recurringSubscriptionStatus = new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus("SUBSCRIBED", 0, "SUBSCRIBED");
        SUBSCRIBED = recurringSubscriptionStatus;
        com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus recurringSubscriptionStatus2 = new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, 1, com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED);
        PAUSED = recurringSubscriptionStatus2;
        com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus recurringSubscriptionStatus3 = new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 2, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        CANCELLED = recurringSubscriptionStatus3;
        com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus recurringSubscriptionStatus4 = new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = recurringSubscriptionStatus4;
        com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus[] recurringSubscriptionStatusArr = {recurringSubscriptionStatus, recurringSubscriptionStatus2, recurringSubscriptionStatus3, recurringSubscriptionStatus4};
        Camera2StreamConfigurationMap = recurringSubscriptionStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(recurringSubscriptionStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("RecurringSubscriptionStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"SUBSCRIBED", com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RecurringSubscriptionStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/RecurringSubscriptionStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/RecurringSubscriptionStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/RecurringSubscriptionStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus[]{com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus.SUBSCRIBED, com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus.PAUSED, com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus.CANCELLED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus recurringSubscriptionStatus = (com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus) obj;
            return recurringSubscriptionStatus == null ? com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus.UNKNOWN__ : recurringSubscriptionStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.RecurringSubscriptionStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
