package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ACTION_REQUIRED_NEW", "ACTION_REQUIRED_RESUME", "IN_PROGRESS", "NOT_AVAILABLE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TaxReportCorrectionFlowStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus ACTION_REQUIRED_NEW;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus ACTION_REQUIRED_RESUME;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus IN_PROGRESS;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus NOT_AVAILABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private TaxReportCorrectionFlowStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus taxReportCorrectionFlowStatus = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus("ACTION_REQUIRED_NEW", 0, "ACTION_REQUIRED_NEW");
        ACTION_REQUIRED_NEW = taxReportCorrectionFlowStatus;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus taxReportCorrectionFlowStatus2 = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus("ACTION_REQUIRED_RESUME", 1, "ACTION_REQUIRED_RESUME");
        ACTION_REQUIRED_RESUME = taxReportCorrectionFlowStatus2;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus taxReportCorrectionFlowStatus3 = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus("IN_PROGRESS", 2, "IN_PROGRESS");
        IN_PROGRESS = taxReportCorrectionFlowStatus3;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus taxReportCorrectionFlowStatus4 = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus("NOT_AVAILABLE", 3, "NOT_AVAILABLE");
        NOT_AVAILABLE = taxReportCorrectionFlowStatus4;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus taxReportCorrectionFlowStatus5 = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = taxReportCorrectionFlowStatus5;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus[] taxReportCorrectionFlowStatusArr = {taxReportCorrectionFlowStatus, taxReportCorrectionFlowStatus2, taxReportCorrectionFlowStatus3, taxReportCorrectionFlowStatus4, taxReportCorrectionFlowStatus5};
        Camera2StreamConfigurationMap = taxReportCorrectionFlowStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(taxReportCorrectionFlowStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("TaxReportCorrectionFlowStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ACTION_REQUIRED_NEW", "ACTION_REQUIRED_RESUME", "IN_PROGRESS", "NOT_AVAILABLE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus[]{com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.ACTION_REQUIRED_NEW, com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.ACTION_REQUIRED_RESUME, com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.IN_PROGRESS, com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.NOT_AVAILABLE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus taxReportCorrectionFlowStatus = (com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus) obj;
            return taxReportCorrectionFlowStatus == null ? com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.UNKNOWN__ : taxReportCorrectionFlowStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
