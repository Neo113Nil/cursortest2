package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatusReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "FUNDING_SOURCES_UNAVAILABLE", "RISK_STEPUP", "INVALID_FUNDING_PREFERENCE", "INVALID_ACCOUNT_STATE", "EXTERNAL_REDIRECT", "ACCESS_INSTRUMENTS_UNAVAILABLE", "NEGATIVE_BALANCE_DECLINE", "RISK_DECLINE", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentFundingOptionStatusReason {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason ACCESS_INSTRUMENTS_UNAVAILABLE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason EXTERNAL_REDIRECT;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason FUNDING_SOURCES_UNAVAILABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason INVALID_ACCOUNT_STATE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason INVALID_FUNDING_PREFERENCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason NEGATIVE_BALANCE_DECLINE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason RISK_DECLINE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason RISK_STEPUP;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentFundingOptionStatusReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason("FUNDING_SOURCES_UNAVAILABLE", 0, "FUNDING_SOURCES_UNAVAILABLE");
        FUNDING_SOURCES_UNAVAILABLE = debitInstrumentFundingOptionStatusReason;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason("RISK_STEPUP", 1, "RISK_STEPUP");
        RISK_STEPUP = debitInstrumentFundingOptionStatusReason2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason("INVALID_FUNDING_PREFERENCE", 2, "INVALID_FUNDING_PREFERENCE");
        INVALID_FUNDING_PREFERENCE = debitInstrumentFundingOptionStatusReason3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason("INVALID_ACCOUNT_STATE", 3, "INVALID_ACCOUNT_STATE");
        INVALID_ACCOUNT_STATE = debitInstrumentFundingOptionStatusReason4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason("EXTERNAL_REDIRECT", 4, "EXTERNAL_REDIRECT");
        EXTERNAL_REDIRECT = debitInstrumentFundingOptionStatusReason5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason("ACCESS_INSTRUMENTS_UNAVAILABLE", 5, "ACCESS_INSTRUMENTS_UNAVAILABLE");
        ACCESS_INSTRUMENTS_UNAVAILABLE = debitInstrumentFundingOptionStatusReason6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason7 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason("NEGATIVE_BALANCE_DECLINE", 6, "NEGATIVE_BALANCE_DECLINE");
        NEGATIVE_BALANCE_DECLINE = debitInstrumentFundingOptionStatusReason7;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason8 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason("RISK_DECLINE", 7, "RISK_DECLINE");
        RISK_DECLINE = debitInstrumentFundingOptionStatusReason8;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason9 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason("UNKNOWN", 8, "UNKNOWN");
        UNKNOWN = debitInstrumentFundingOptionStatusReason9;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason10 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentFundingOptionStatusReason10;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason[] debitInstrumentFundingOptionStatusReasonArr = {debitInstrumentFundingOptionStatusReason, debitInstrumentFundingOptionStatusReason2, debitInstrumentFundingOptionStatusReason3, debitInstrumentFundingOptionStatusReason4, debitInstrumentFundingOptionStatusReason5, debitInstrumentFundingOptionStatusReason6, debitInstrumentFundingOptionStatusReason7, debitInstrumentFundingOptionStatusReason8, debitInstrumentFundingOptionStatusReason9, debitInstrumentFundingOptionStatusReason10};
        getHighSpeedVideoFpsRanges = debitInstrumentFundingOptionStatusReasonArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentFundingOptionStatusReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentFundingOptionStatusReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"FUNDING_SOURCES_UNAVAILABLE", "RISK_STEPUP", "INVALID_FUNDING_PREFERENCE", "INVALID_ACCOUNT_STATE", "EXTERNAL_REDIRECT", "ACCESS_INSTRUMENTS_UNAVAILABLE", "NEGATIVE_BALANCE_DECLINE", "RISK_DECLINE", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatusReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatusReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatusReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatusReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.FUNDING_SOURCES_UNAVAILABLE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.RISK_STEPUP, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.INVALID_FUNDING_PREFERENCE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.INVALID_ACCOUNT_STATE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.EXTERNAL_REDIRECT, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.ACCESS_INSTRUMENTS_UNAVAILABLE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.NEGATIVE_BALANCE_DECLINE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.RISK_DECLINE, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason) obj;
            return debitInstrumentFundingOptionStatusReason == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.UNKNOWN__ : debitInstrumentFundingOptionStatusReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
