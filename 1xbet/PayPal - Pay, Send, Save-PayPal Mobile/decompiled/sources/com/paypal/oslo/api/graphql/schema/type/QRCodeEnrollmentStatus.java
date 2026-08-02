package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodeEnrollmentStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ENROLLED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "NEED_MORE_DATA", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QRCodeEnrollmentStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus DENIED;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus ENROLLED;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus NEED_MORE_DATA;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus PENDING;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private QRCodeEnrollmentStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus qRCodeEnrollmentStatus = new com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus("ENROLLED", 0, "ENROLLED");
        ENROLLED = qRCodeEnrollmentStatus;
        com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus qRCodeEnrollmentStatus2 = new com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 1, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED);
        DENIED = qRCodeEnrollmentStatus2;
        com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus qRCodeEnrollmentStatus3 = new com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 2, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        PENDING = qRCodeEnrollmentStatus3;
        com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus qRCodeEnrollmentStatus4 = new com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus("NEED_MORE_DATA", 3, "NEED_MORE_DATA");
        NEED_MORE_DATA = qRCodeEnrollmentStatus4;
        com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus qRCodeEnrollmentStatus5 = new com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = qRCodeEnrollmentStatus5;
        com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus[] qRCodeEnrollmentStatusArr = {qRCodeEnrollmentStatus, qRCodeEnrollmentStatus2, qRCodeEnrollmentStatus3, qRCodeEnrollmentStatus4, qRCodeEnrollmentStatus5};
        getHighSpeedVideoSizes = qRCodeEnrollmentStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(qRCodeEnrollmentStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("QRCodeEnrollmentStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ENROLLED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "NEED_MORE_DATA"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodeEnrollmentStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/QRCodeEnrollmentStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/QRCodeEnrollmentStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/QRCodeEnrollmentStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus[]{com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus.ENROLLED, com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus.DENIED, com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus.PENDING, com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus.NEED_MORE_DATA});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus qRCodeEnrollmentStatus = (com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus) obj;
            return qRCodeEnrollmentStatus == null ? com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus.UNKNOWN__ : qRCodeEnrollmentStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.QRCodeEnrollmentStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
