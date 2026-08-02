package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "COMPLETED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "NOT_APPLICABLE", "ENFORCED", "IN_GRACE_PERIOD", "NOT_MET", "EXEMPTED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PolicyStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.PolicyStatus COMPLETED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PolicyStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PolicyStatus ENFORCED;
    public static final com.paypal.oslo.api.graphql.schema.type.PolicyStatus EXEMPTED;
    public static final com.paypal.oslo.api.graphql.schema.type.PolicyStatus FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.PolicyStatus IN_GRACE_PERIOD;
    public static final com.paypal.oslo.api.graphql.schema.type.PolicyStatus NOT_APPLICABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.PolicyStatus NOT_MET;
    public static final com.paypal.oslo.api.graphql.schema.type.PolicyStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PolicyStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PolicyStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus = new com.paypal.oslo.api.graphql.schema.type.PolicyStatus("COMPLETED", 0, "COMPLETED");
        COMPLETED = policyStatus;
        com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus2 = new com.paypal.oslo.api.graphql.schema.type.PolicyStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 1, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED);
        FAILED = policyStatus2;
        com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus3 = new com.paypal.oslo.api.graphql.schema.type.PolicyStatus("NOT_APPLICABLE", 2, "NOT_APPLICABLE");
        NOT_APPLICABLE = policyStatus3;
        com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus4 = new com.paypal.oslo.api.graphql.schema.type.PolicyStatus("ENFORCED", 3, "ENFORCED");
        ENFORCED = policyStatus4;
        com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus5 = new com.paypal.oslo.api.graphql.schema.type.PolicyStatus("IN_GRACE_PERIOD", 4, "IN_GRACE_PERIOD");
        IN_GRACE_PERIOD = policyStatus5;
        com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus6 = new com.paypal.oslo.api.graphql.schema.type.PolicyStatus("NOT_MET", 5, "NOT_MET");
        NOT_MET = policyStatus6;
        com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus7 = new com.paypal.oslo.api.graphql.schema.type.PolicyStatus("EXEMPTED", 6, "EXEMPTED");
        EXEMPTED = policyStatus7;
        com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus8 = new com.paypal.oslo.api.graphql.schema.type.PolicyStatus("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = policyStatus8;
        com.paypal.oslo.api.graphql.schema.type.PolicyStatus[] policyStatusArr = {policyStatus, policyStatus2, policyStatus3, policyStatus4, policyStatus5, policyStatus6, policyStatus7, policyStatus8};
        getHighResolutionOutputSizeshNQ4ISI = policyStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(policyStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PolicyStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PolicyStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"COMPLETED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "NOT_APPLICABLE", "ENFORCED", "IN_GRACE_PERIOD", "NOT_MET", "EXEMPTED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PolicyStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PolicyStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PolicyStatus[]{com.paypal.oslo.api.graphql.schema.type.PolicyStatus.COMPLETED, com.paypal.oslo.api.graphql.schema.type.PolicyStatus.FAILED, com.paypal.oslo.api.graphql.schema.type.PolicyStatus.NOT_APPLICABLE, com.paypal.oslo.api.graphql.schema.type.PolicyStatus.ENFORCED, com.paypal.oslo.api.graphql.schema.type.PolicyStatus.IN_GRACE_PERIOD, com.paypal.oslo.api.graphql.schema.type.PolicyStatus.NOT_MET, com.paypal.oslo.api.graphql.schema.type.PolicyStatus.EXEMPTED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PolicyStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PolicyStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PolicyStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PolicyStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PolicyStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PolicyStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus = (com.paypal.oslo.api.graphql.schema.type.PolicyStatus) obj;
            return policyStatus == null ? com.paypal.oslo.api.graphql.schema.type.PolicyStatus.UNKNOWN__ : policyStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PolicyStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PolicyStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PolicyStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PolicyStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PolicyStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PolicyStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
