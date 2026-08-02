package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "COMPLETED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "MANUAL_REVIEW", "NEED_MORE_DATA", "NOT_APPLICABLE", "PENDING_VERIFICATION", "EXEMPTED", "PENDING_DOC_GENERATION", "EXPIRED", "PENDING_SYSTEM_PROCESSING", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProcessStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus COMPLETED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus EXEMPTED;
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus EXPIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus MANUAL_REVIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus NEED_MORE_DATA;
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus NOT_APPLICABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus PENDING_DOC_GENERATION;
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus PENDING_SYSTEM_PROCESSING;
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus PENDING_VERIFICATION;
    public static final com.paypal.oslo.api.graphql.schema.type.ProcessStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ProcessStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ProcessStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus("COMPLETED", 0, "COMPLETED");
        COMPLETED = processStatus;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus2 = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 1, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED);
        FAILED = processStatus2;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus3 = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus("MANUAL_REVIEW", 2, "MANUAL_REVIEW");
        MANUAL_REVIEW = processStatus3;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus4 = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus("NEED_MORE_DATA", 3, "NEED_MORE_DATA");
        NEED_MORE_DATA = processStatus4;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus5 = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus("NOT_APPLICABLE", 4, "NOT_APPLICABLE");
        NOT_APPLICABLE = processStatus5;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus6 = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus("PENDING_VERIFICATION", 5, "PENDING_VERIFICATION");
        PENDING_VERIFICATION = processStatus6;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus7 = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus("EXEMPTED", 6, "EXEMPTED");
        EXEMPTED = processStatus7;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus8 = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus("PENDING_DOC_GENERATION", 7, "PENDING_DOC_GENERATION");
        PENDING_DOC_GENERATION = processStatus8;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus9 = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus("EXPIRED", 8, "EXPIRED");
        EXPIRED = processStatus9;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus10 = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus("PENDING_SYSTEM_PROCESSING", 9, "PENDING_SYSTEM_PROCESSING");
        PENDING_SYSTEM_PROCESSING = processStatus10;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus11 = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus("UNKNOWN__", 10, "UNKNOWN__");
        UNKNOWN__ = processStatus11;
        com.paypal.oslo.api.graphql.schema.type.ProcessStatus[] processStatusArr = {processStatus, processStatus2, processStatus3, processStatus4, processStatus5, processStatus6, processStatus7, processStatus8, processStatus9, processStatus10, processStatus11};
        getHighResolutionOutputSizeshNQ4ISI = processStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(processStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ProcessStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ProcessStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"COMPLETED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "MANUAL_REVIEW", "NEED_MORE_DATA", "NOT_APPLICABLE", "PENDING_VERIFICATION", "EXEMPTED", "PENDING_DOC_GENERATION", "EXPIRED", "PENDING_SYSTEM_PROCESSING"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ProcessStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ProcessStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ProcessStatus[]{com.paypal.oslo.api.graphql.schema.type.ProcessStatus.COMPLETED, com.paypal.oslo.api.graphql.schema.type.ProcessStatus.FAILED, com.paypal.oslo.api.graphql.schema.type.ProcessStatus.MANUAL_REVIEW, com.paypal.oslo.api.graphql.schema.type.ProcessStatus.NEED_MORE_DATA, com.paypal.oslo.api.graphql.schema.type.ProcessStatus.NOT_APPLICABLE, com.paypal.oslo.api.graphql.schema.type.ProcessStatus.PENDING_VERIFICATION, com.paypal.oslo.api.graphql.schema.type.ProcessStatus.EXEMPTED, com.paypal.oslo.api.graphql.schema.type.ProcessStatus.PENDING_DOC_GENERATION, com.paypal.oslo.api.graphql.schema.type.ProcessStatus.EXPIRED, com.paypal.oslo.api.graphql.schema.type.ProcessStatus.PENDING_SYSTEM_PROCESSING});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ProcessStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ProcessStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ProcessStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ProcessStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ProcessStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ProcessStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus = (com.paypal.oslo.api.graphql.schema.type.ProcessStatus) obj;
            return processStatus == null ? com.paypal.oslo.api.graphql.schema.type.ProcessStatus.UNKNOWN__ : processStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ProcessStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ProcessStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ProcessStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ProcessStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ProcessStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ProcessStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
