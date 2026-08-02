package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "COMPLETED", "INITIAL", "MANUAL_REVIEW", "PENDING_INFORMATION", "PROCESSING_FAILED", "PROCESSING_REPORT", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TaxReportCorrectionStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus COMPLETED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus INITIAL;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus MANUAL_REVIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus PENDING_INFORMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus PROCESSING_FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus PROCESSING_REPORT;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private TaxReportCorrectionStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus("COMPLETED", 0, "COMPLETED");
        COMPLETED = taxReportCorrectionStatus;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus2 = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus("INITIAL", 1, "INITIAL");
        INITIAL = taxReportCorrectionStatus2;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus3 = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus("MANUAL_REVIEW", 2, "MANUAL_REVIEW");
        MANUAL_REVIEW = taxReportCorrectionStatus3;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus4 = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus("PENDING_INFORMATION", 3, "PENDING_INFORMATION");
        PENDING_INFORMATION = taxReportCorrectionStatus4;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus5 = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus("PROCESSING_FAILED", 4, "PROCESSING_FAILED");
        PROCESSING_FAILED = taxReportCorrectionStatus5;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus6 = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus("PROCESSING_REPORT", 5, "PROCESSING_REPORT");
        PROCESSING_REPORT = taxReportCorrectionStatus6;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus7 = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = taxReportCorrectionStatus7;
        com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus[] taxReportCorrectionStatusArr = {taxReportCorrectionStatus, taxReportCorrectionStatus2, taxReportCorrectionStatus3, taxReportCorrectionStatus4, taxReportCorrectionStatus5, taxReportCorrectionStatus6, taxReportCorrectionStatus7};
        getHighSpeedVideoSizes = taxReportCorrectionStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(taxReportCorrectionStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("TaxReportCorrectionStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"COMPLETED", "INITIAL", "MANUAL_REVIEW", "PENDING_INFORMATION", "PROCESSING_FAILED", "PROCESSING_REPORT"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus[]{com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.COMPLETED, com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.INITIAL, com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.MANUAL_REVIEW, com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.PENDING_INFORMATION, com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.PROCESSING_FAILED, com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.PROCESSING_REPORT});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus = (com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus) obj;
            return taxReportCorrectionStatus == null ? com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.UNKNOWN__ : taxReportCorrectionStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
