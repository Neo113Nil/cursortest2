package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceFeatureStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "PENDING_CANCELLATION", "PENDING_ACTIVATION", "SUSPENDED", "REVOKED", "APPROVED", "IN_REVIEW", "NEED_DATA", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DENY, com.payair.model.TokenStatusKt.TOKEN_INACTIVE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InvoiceFeatureStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus ACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus APPROVED;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus CANCELLED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus DENY;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus INACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus IN_REVIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus NEED_DATA;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus PENDING;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus PENDING_ACTIVATION;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus PENDING_CANCELLATION;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus REVOKED;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus SUSPENDED;
    public static final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private InvoiceFeatureStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
        ACTIVE = invoiceFeatureStatus;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus2 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 1, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        CANCELLED = invoiceFeatureStatus2;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus3 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus("PENDING_CANCELLATION", 2, "PENDING_CANCELLATION");
        PENDING_CANCELLATION = invoiceFeatureStatus3;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus4 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus("PENDING_ACTIVATION", 3, "PENDING_ACTIVATION");
        PENDING_ACTIVATION = invoiceFeatureStatus4;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus5 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus("SUSPENDED", 4, "SUSPENDED");
        SUSPENDED = invoiceFeatureStatus5;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus6 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus("REVOKED", 5, "REVOKED");
        REVOKED = invoiceFeatureStatus6;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus7 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus("APPROVED", 6, "APPROVED");
        APPROVED = invoiceFeatureStatus7;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus8 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus("IN_REVIEW", 7, "IN_REVIEW");
        IN_REVIEW = invoiceFeatureStatus8;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus9 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus("NEED_DATA", 8, "NEED_DATA");
        NEED_DATA = invoiceFeatureStatus9;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus10 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DENY, 9, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DENY);
        DENY = invoiceFeatureStatus10;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus11 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 10, com.payair.model.TokenStatusKt.TOKEN_INACTIVE);
        INACTIVE = invoiceFeatureStatus11;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus12 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 11, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        PENDING = invoiceFeatureStatus12;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus13 = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus("UNKNOWN__", 12, "UNKNOWN__");
        UNKNOWN__ = invoiceFeatureStatus13;
        com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus[] invoiceFeatureStatusArr = {invoiceFeatureStatus, invoiceFeatureStatus2, invoiceFeatureStatus3, invoiceFeatureStatus4, invoiceFeatureStatus5, invoiceFeatureStatus6, invoiceFeatureStatus7, invoiceFeatureStatus8, invoiceFeatureStatus9, invoiceFeatureStatus10, invoiceFeatureStatus11, invoiceFeatureStatus12, invoiceFeatureStatus13};
        getHighSpeedVideoFpsRanges = invoiceFeatureStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(invoiceFeatureStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("InvoiceFeatureStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "PENDING_CANCELLATION", "PENDING_ACTIVATION", "SUSPENDED", "REVOKED", "APPROVED", "IN_REVIEW", "NEED_DATA", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DENY, com.payair.model.TokenStatusKt.TOKEN_INACTIVE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InvoiceFeatureStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceFeatureStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/InvoiceFeatureStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/InvoiceFeatureStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus[]{com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.ACTIVE, com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.CANCELLED, com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.PENDING_CANCELLATION, com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.PENDING_ACTIVATION, com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.SUSPENDED, com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.REVOKED, com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.APPROVED, com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.IN_REVIEW, com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.NEED_DATA, com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.DENY, com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.INACTIVE, com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.PENDING});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus invoiceFeatureStatus = (com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus) obj;
            return invoiceFeatureStatus == null ? com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.UNKNOWN__ : invoiceFeatureStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.InvoiceFeatureStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
