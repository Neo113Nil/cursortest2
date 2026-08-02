package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "DEPENDENT_REPORT_NOT_READY", "UNAVAILABLE_NO_ACTION", "GENERATION_ON_ACTION", "GENERATED", "GENERATION_ON_DEMAND", "GENERATION_IN_PROGRESS", "NOT_ELIGIBLE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TaxReportStatus {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus DEPENDENT_REPORT_NOT_READY;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus GENERATED;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus GENERATION_IN_PROGRESS;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus GENERATION_ON_ACTION;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus GENERATION_ON_DEMAND;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus NOT_ELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus UNAVAILABLE_NO_ACTION;
    public static final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.TaxReportStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private TaxReportStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus = new com.paypal.oslo.api.graphql.schema.type.TaxReportStatus("DEPENDENT_REPORT_NOT_READY", 0, "DEPENDENT_REPORT_NOT_READY");
        DEPENDENT_REPORT_NOT_READY = taxReportStatus;
        com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus2 = new com.paypal.oslo.api.graphql.schema.type.TaxReportStatus("UNAVAILABLE_NO_ACTION", 1, "UNAVAILABLE_NO_ACTION");
        UNAVAILABLE_NO_ACTION = taxReportStatus2;
        com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus3 = new com.paypal.oslo.api.graphql.schema.type.TaxReportStatus("GENERATION_ON_ACTION", 2, "GENERATION_ON_ACTION");
        GENERATION_ON_ACTION = taxReportStatus3;
        com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus4 = new com.paypal.oslo.api.graphql.schema.type.TaxReportStatus("GENERATED", 3, "GENERATED");
        GENERATED = taxReportStatus4;
        com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus5 = new com.paypal.oslo.api.graphql.schema.type.TaxReportStatus("GENERATION_ON_DEMAND", 4, "GENERATION_ON_DEMAND");
        GENERATION_ON_DEMAND = taxReportStatus5;
        com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus6 = new com.paypal.oslo.api.graphql.schema.type.TaxReportStatus("GENERATION_IN_PROGRESS", 5, "GENERATION_IN_PROGRESS");
        GENERATION_IN_PROGRESS = taxReportStatus6;
        com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus7 = new com.paypal.oslo.api.graphql.schema.type.TaxReportStatus("NOT_ELIGIBLE", 6, "NOT_ELIGIBLE");
        NOT_ELIGIBLE = taxReportStatus7;
        com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus8 = new com.paypal.oslo.api.graphql.schema.type.TaxReportStatus("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = taxReportStatus8;
        com.paypal.oslo.api.graphql.schema.type.TaxReportStatus[] taxReportStatusArr = {taxReportStatus, taxReportStatus2, taxReportStatus3, taxReportStatus4, taxReportStatus5, taxReportStatus6, taxReportStatus7, taxReportStatus8};
        getHighResolutionOutputSizeshNQ4ISI = taxReportStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(taxReportStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("TaxReportStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"DEPENDENT_REPORT_NOT_READY", "UNAVAILABLE_NO_ACTION", "GENERATION_ON_ACTION", "GENERATED", "GENERATION_ON_DEMAND", "GENERATION_IN_PROGRESS", "NOT_ELIGIBLE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TaxReportStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.TaxReportStatus[]{com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.DEPENDENT_REPORT_NOT_READY, com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.UNAVAILABLE_NO_ACTION, com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.GENERATION_ON_ACTION, com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.GENERATED, com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.GENERATION_ON_DEMAND, com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.GENERATION_IN_PROGRESS, com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.NOT_ELIGIBLE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.TaxReportStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.TaxReportStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.TaxReportStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus = (com.paypal.oslo.api.graphql.schema.type.TaxReportStatus) obj;
            return taxReportStatus == null ? com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.UNKNOWN__ : taxReportStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.TaxReportStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.TaxReportStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.TaxReportStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.TaxReportStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.TaxReportStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
