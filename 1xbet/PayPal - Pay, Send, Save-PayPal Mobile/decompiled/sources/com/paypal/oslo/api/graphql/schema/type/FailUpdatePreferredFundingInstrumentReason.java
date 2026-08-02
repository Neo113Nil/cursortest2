package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FailUpdatePreferredFundingInstrumentReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ACCOUNT_NEEDS_FURTHER_VERIFICATION", "ONLY_CHECKING_OR_DEBIT_SUPPORTED", "FI_NEEDS_FURTHER_VERIFICATION", "DECLINED_BY_ISSUER", "OTHER", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FailUpdatePreferredFundingInstrumentReason {
    public static final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason ACCOUNT_NEEDS_FURTHER_VERIFICATION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason DECLINED_BY_ISSUER;
    public static final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason FI_NEEDS_FURTHER_VERIFICATION;
    public static final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason ONLY_CHECKING_OR_DEBIT_SUPPORTED;
    public static final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason OTHER;
    public static final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private FailUpdatePreferredFundingInstrumentReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason failUpdatePreferredFundingInstrumentReason = new com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason("ACCOUNT_NEEDS_FURTHER_VERIFICATION", 0, "ACCOUNT_NEEDS_FURTHER_VERIFICATION");
        ACCOUNT_NEEDS_FURTHER_VERIFICATION = failUpdatePreferredFundingInstrumentReason;
        com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason failUpdatePreferredFundingInstrumentReason2 = new com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason("ONLY_CHECKING_OR_DEBIT_SUPPORTED", 1, "ONLY_CHECKING_OR_DEBIT_SUPPORTED");
        ONLY_CHECKING_OR_DEBIT_SUPPORTED = failUpdatePreferredFundingInstrumentReason2;
        com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason failUpdatePreferredFundingInstrumentReason3 = new com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason("FI_NEEDS_FURTHER_VERIFICATION", 2, "FI_NEEDS_FURTHER_VERIFICATION");
        FI_NEEDS_FURTHER_VERIFICATION = failUpdatePreferredFundingInstrumentReason3;
        com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason failUpdatePreferredFundingInstrumentReason4 = new com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason("DECLINED_BY_ISSUER", 3, "DECLINED_BY_ISSUER");
        DECLINED_BY_ISSUER = failUpdatePreferredFundingInstrumentReason4;
        com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason failUpdatePreferredFundingInstrumentReason5 = new com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason("OTHER", 4, "OTHER");
        OTHER = failUpdatePreferredFundingInstrumentReason5;
        com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason failUpdatePreferredFundingInstrumentReason6 = new com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = failUpdatePreferredFundingInstrumentReason6;
        com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason[] failUpdatePreferredFundingInstrumentReasonArr = {failUpdatePreferredFundingInstrumentReason, failUpdatePreferredFundingInstrumentReason2, failUpdatePreferredFundingInstrumentReason3, failUpdatePreferredFundingInstrumentReason4, failUpdatePreferredFundingInstrumentReason5, failUpdatePreferredFundingInstrumentReason6};
        getHighSpeedVideoFpsRangesFor = failUpdatePreferredFundingInstrumentReasonArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(failUpdatePreferredFundingInstrumentReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("FailUpdatePreferredFundingInstrumentReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ACCOUNT_NEEDS_FURTHER_VERIFICATION", "ONLY_CHECKING_OR_DEBIT_SUPPORTED", "FI_NEEDS_FURTHER_VERIFICATION", "DECLINED_BY_ISSUER", "OTHER"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FailUpdatePreferredFundingInstrumentReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/FailUpdatePreferredFundingInstrumentReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/FailUpdatePreferredFundingInstrumentReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/FailUpdatePreferredFundingInstrumentReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason[]{com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.ACCOUNT_NEEDS_FURTHER_VERIFICATION, com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.ONLY_CHECKING_OR_DEBIT_SUPPORTED, com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.FI_NEEDS_FURTHER_VERIFICATION, com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.DECLINED_BY_ISSUER, com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.OTHER});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason failUpdatePreferredFundingInstrumentReason = (com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason) obj;
            return failUpdatePreferredFundingInstrumentReason == null ? com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.UNKNOWN__ : failUpdatePreferredFundingInstrumentReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
