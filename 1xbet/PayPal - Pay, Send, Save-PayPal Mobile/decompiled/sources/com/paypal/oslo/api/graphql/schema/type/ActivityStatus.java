package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BLOCKED", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, "COMPLETED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "PAID", "HELD", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "REFUNDED", "PARTIALLY_PAID", "REVERSED", "PARTIALLY_REFUNDED", "UNCLAIMED", "SENT", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus BLOCKED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus CANCELED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus COMPLETED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus CREATED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus DENIED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus HELD;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus PAID;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus PARTIALLY_PAID;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus PARTIALLY_REFUNDED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus PENDING;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus REFUNDED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus REVERSED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus SENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus UNCLAIMED;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityStatus UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivityStatus[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivityStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus("BLOCKED", 0, "BLOCKED");
        BLOCKED = activityStatus;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus2 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, 1, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED);
        CREATED = activityStatus2;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus3 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, 2, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS);
        CANCELED = activityStatus3;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus4 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus("COMPLETED", 3, "COMPLETED");
        COMPLETED = activityStatus4;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus5 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 4, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED);
        DENIED = activityStatus5;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus6 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 5, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED);
        FAILED = activityStatus6;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus7 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus("PAID", 6, "PAID");
        PAID = activityStatus7;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus8 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus("HELD", 7, "HELD");
        HELD = activityStatus8;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus9 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 8, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        PENDING = activityStatus9;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus10 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus("REFUNDED", 9, "REFUNDED");
        REFUNDED = activityStatus10;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus11 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus("PARTIALLY_PAID", 10, "PARTIALLY_PAID");
        PARTIALLY_PAID = activityStatus11;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus12 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus("REVERSED", 11, "REVERSED");
        REVERSED = activityStatus12;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus13 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus("PARTIALLY_REFUNDED", 12, "PARTIALLY_REFUNDED");
        PARTIALLY_REFUNDED = activityStatus13;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus14 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus("UNCLAIMED", 13, "UNCLAIMED");
        UNCLAIMED = activityStatus14;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus15 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus("SENT", 14, "SENT");
        SENT = activityStatus15;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus16 = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus("UNKNOWN__", 15, "UNKNOWN__");
        UNKNOWN__ = activityStatus16;
        com.paypal.oslo.api.graphql.schema.type.ActivityStatus[] activityStatusArr = {activityStatus, activityStatus2, activityStatus3, activityStatus4, activityStatus5, activityStatus6, activityStatus7, activityStatus8, activityStatus9, activityStatus10, activityStatus11, activityStatus12, activityStatus13, activityStatus14, activityStatus15, activityStatus16};
        getHighSpeedVideoFpsRangesFor = activityStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(activityStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivityStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivityStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BLOCKED", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, "COMPLETED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "PAID", "HELD", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "REFUNDED", "PARTIALLY_PAID", "REVERSED", "PARTIALLY_REFUNDED", "UNCLAIMED", "SENT"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivityStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityStatus[]{com.paypal.oslo.api.graphql.schema.type.ActivityStatus.BLOCKED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.CREATED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.CANCELED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.COMPLETED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.DENIED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.FAILED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.PAID, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.HELD, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.PENDING, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.REFUNDED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.PARTIALLY_PAID, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.REVERSED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.PARTIALLY_REFUNDED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.UNCLAIMED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.SENT});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivityStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivityStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivityStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivityStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivityStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus = (com.paypal.oslo.api.graphql.schema.type.ActivityStatus) obj;
            return activityStatus == null ? com.paypal.oslo.api.graphql.schema.type.ActivityStatus.UNKNOWN__ : activityStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivityStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivityStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
