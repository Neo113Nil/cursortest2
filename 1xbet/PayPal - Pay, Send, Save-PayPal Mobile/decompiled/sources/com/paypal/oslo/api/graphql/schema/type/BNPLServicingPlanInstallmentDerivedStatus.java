package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanInstallmentDerivedStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "DUE_TODAY", "DELINQUENT", "PAID", "PAST_DUE", "SCHEDULED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BNPLServicingPlanInstallmentDerivedStatus {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus DELINQUENT;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus DUE_TODAY;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus PAID;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus PAST_DUE;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus SCHEDULED;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BNPLServicingPlanInstallmentDerivedStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus bNPLServicingPlanInstallmentDerivedStatus = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus("DUE_TODAY", 0, "DUE_TODAY");
        DUE_TODAY = bNPLServicingPlanInstallmentDerivedStatus;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus bNPLServicingPlanInstallmentDerivedStatus2 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus("DELINQUENT", 1, "DELINQUENT");
        DELINQUENT = bNPLServicingPlanInstallmentDerivedStatus2;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus bNPLServicingPlanInstallmentDerivedStatus3 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus("PAID", 2, "PAID");
        PAID = bNPLServicingPlanInstallmentDerivedStatus3;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus bNPLServicingPlanInstallmentDerivedStatus4 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus("PAST_DUE", 3, "PAST_DUE");
        PAST_DUE = bNPLServicingPlanInstallmentDerivedStatus4;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus bNPLServicingPlanInstallmentDerivedStatus5 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus("SCHEDULED", 4, "SCHEDULED");
        SCHEDULED = bNPLServicingPlanInstallmentDerivedStatus5;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus bNPLServicingPlanInstallmentDerivedStatus6 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = bNPLServicingPlanInstallmentDerivedStatus6;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus[] bNPLServicingPlanInstallmentDerivedStatusArr = {bNPLServicingPlanInstallmentDerivedStatus, bNPLServicingPlanInstallmentDerivedStatus2, bNPLServicingPlanInstallmentDerivedStatus3, bNPLServicingPlanInstallmentDerivedStatus4, bNPLServicingPlanInstallmentDerivedStatus5, bNPLServicingPlanInstallmentDerivedStatus6};
        getHighResolutionOutputSizeshNQ4ISI = bNPLServicingPlanInstallmentDerivedStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(bNPLServicingPlanInstallmentDerivedStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BNPLServicingPlanInstallmentDerivedStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"DUE_TODAY", "DELINQUENT", "PAID", "PAST_DUE", "SCHEDULED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanInstallmentDerivedStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanInstallmentDerivedStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanInstallmentDerivedStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanInstallmentDerivedStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus[]{com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus.DUE_TODAY, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus.DELINQUENT, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus.PAID, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus.PAST_DUE, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus.SCHEDULED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus bNPLServicingPlanInstallmentDerivedStatus = (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus) obj;
            return bNPLServicingPlanInstallmentDerivedStatus == null ? com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus.UNKNOWN__ : bNPLServicingPlanInstallmentDerivedStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
