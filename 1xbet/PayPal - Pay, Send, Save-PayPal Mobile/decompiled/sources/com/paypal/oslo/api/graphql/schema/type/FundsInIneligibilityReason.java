package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FundsInIneligibilityReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CIP_REQUIRED", "MANUAL_REVIEW", "RISK_STEP_UP_AUTH", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, "UNCONFIRMED_EMAIL", "UNCONFIRMED_ADDRESS", "UNCONFIRMED_PHONE", "RESTRICTED_ACCOUNT", "LOCKED_ACCOUNT", "UNSUPPORTED_ACCOUNT_TYPE", "RECEIVING_MONEY_DISABLED", "BUSINESS_TYPE_UNSELECTED", "FAILED_EXTERNAL_VERIFICATION", "UNSUPPORTED_DOCUMENT_IDENTIFIER", "CFPB_LEGAL_LOGGING", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FundsInIneligibilityReason {
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason BUSINESS_TYPE_UNSELECTED;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason CFPB_LEGAL_LOGGING;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason CIP_REQUIRED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason DENIED;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason FAILED_EXTERNAL_VERIFICATION;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason LOCKED_ACCOUNT;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason MANUAL_REVIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason RECEIVING_MONEY_DISABLED;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason RESTRICTED_ACCOUNT;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason RISK_STEP_UP_AUTH;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason UNCONFIRMED_ADDRESS;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason UNCONFIRMED_EMAIL;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason UNCONFIRMED_PHONE;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason UNSUPPORTED_ACCOUNT_TYPE;
    public static final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason UNSUPPORTED_DOCUMENT_IDENTIFIER;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private FundsInIneligibilityReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("CIP_REQUIRED", 0, "CIP_REQUIRED");
        CIP_REQUIRED = fundsInIneligibilityReason;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason2 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("MANUAL_REVIEW", 1, "MANUAL_REVIEW");
        MANUAL_REVIEW = fundsInIneligibilityReason2;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason3 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("RISK_STEP_UP_AUTH", 2, "RISK_STEP_UP_AUTH");
        RISK_STEP_UP_AUTH = fundsInIneligibilityReason3;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason4 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 3, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED);
        DENIED = fundsInIneligibilityReason4;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason5 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("UNCONFIRMED_EMAIL", 4, "UNCONFIRMED_EMAIL");
        UNCONFIRMED_EMAIL = fundsInIneligibilityReason5;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason6 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("UNCONFIRMED_ADDRESS", 5, "UNCONFIRMED_ADDRESS");
        UNCONFIRMED_ADDRESS = fundsInIneligibilityReason6;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason7 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("UNCONFIRMED_PHONE", 6, "UNCONFIRMED_PHONE");
        UNCONFIRMED_PHONE = fundsInIneligibilityReason7;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason8 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("RESTRICTED_ACCOUNT", 7, "RESTRICTED_ACCOUNT");
        RESTRICTED_ACCOUNT = fundsInIneligibilityReason8;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason9 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("LOCKED_ACCOUNT", 8, "LOCKED_ACCOUNT");
        LOCKED_ACCOUNT = fundsInIneligibilityReason9;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason10 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("UNSUPPORTED_ACCOUNT_TYPE", 9, "UNSUPPORTED_ACCOUNT_TYPE");
        UNSUPPORTED_ACCOUNT_TYPE = fundsInIneligibilityReason10;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason11 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("RECEIVING_MONEY_DISABLED", 10, "RECEIVING_MONEY_DISABLED");
        RECEIVING_MONEY_DISABLED = fundsInIneligibilityReason11;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason12 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("BUSINESS_TYPE_UNSELECTED", 11, "BUSINESS_TYPE_UNSELECTED");
        BUSINESS_TYPE_UNSELECTED = fundsInIneligibilityReason12;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason13 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("FAILED_EXTERNAL_VERIFICATION", 12, "FAILED_EXTERNAL_VERIFICATION");
        FAILED_EXTERNAL_VERIFICATION = fundsInIneligibilityReason13;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason14 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("UNSUPPORTED_DOCUMENT_IDENTIFIER", 13, "UNSUPPORTED_DOCUMENT_IDENTIFIER");
        UNSUPPORTED_DOCUMENT_IDENTIFIER = fundsInIneligibilityReason14;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason15 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("CFPB_LEGAL_LOGGING", 14, "CFPB_LEGAL_LOGGING");
        CFPB_LEGAL_LOGGING = fundsInIneligibilityReason15;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason16 = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason("UNKNOWN__", 15, "UNKNOWN__");
        UNKNOWN__ = fundsInIneligibilityReason16;
        com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason[] fundsInIneligibilityReasonArr = {fundsInIneligibilityReason, fundsInIneligibilityReason2, fundsInIneligibilityReason3, fundsInIneligibilityReason4, fundsInIneligibilityReason5, fundsInIneligibilityReason6, fundsInIneligibilityReason7, fundsInIneligibilityReason8, fundsInIneligibilityReason9, fundsInIneligibilityReason10, fundsInIneligibilityReason11, fundsInIneligibilityReason12, fundsInIneligibilityReason13, fundsInIneligibilityReason14, fundsInIneligibilityReason15, fundsInIneligibilityReason16};
        getHighSpeedVideoFpsRangesFor = fundsInIneligibilityReasonArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(fundsInIneligibilityReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("FundsInIneligibilityReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CIP_REQUIRED", "MANUAL_REVIEW", "RISK_STEP_UP_AUTH", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, "UNCONFIRMED_EMAIL", "UNCONFIRMED_ADDRESS", "UNCONFIRMED_PHONE", "RESTRICTED_ACCOUNT", "LOCKED_ACCOUNT", "UNSUPPORTED_ACCOUNT_TYPE", "RECEIVING_MONEY_DISABLED", "BUSINESS_TYPE_UNSELECTED", "FAILED_EXTERNAL_VERIFICATION", "UNSUPPORTED_DOCUMENT_IDENTIFIER", "CFPB_LEGAL_LOGGING"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FundsInIneligibilityReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/FundsInIneligibilityReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/FundsInIneligibilityReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/FundsInIneligibilityReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason[]{com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.CIP_REQUIRED, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.MANUAL_REVIEW, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.RISK_STEP_UP_AUTH, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.DENIED, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.UNCONFIRMED_EMAIL, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.UNCONFIRMED_ADDRESS, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.UNCONFIRMED_PHONE, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.RESTRICTED_ACCOUNT, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.LOCKED_ACCOUNT, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.UNSUPPORTED_ACCOUNT_TYPE, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.RECEIVING_MONEY_DISABLED, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.BUSINESS_TYPE_UNSELECTED, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.FAILED_EXTERNAL_VERIFICATION, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.UNSUPPORTED_DOCUMENT_IDENTIFIER, com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.CFPB_LEGAL_LOGGING});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason fundsInIneligibilityReason = (com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason) obj;
            return fundsInIneligibilityReason == null ? com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.UNKNOWN__ : fundsInIneligibilityReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.FundsInIneligibilityReason> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
