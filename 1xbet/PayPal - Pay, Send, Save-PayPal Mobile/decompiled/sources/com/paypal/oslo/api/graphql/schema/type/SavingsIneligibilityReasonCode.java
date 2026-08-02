package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SavingsIneligibilityReasonCode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorIssues.ACCOUNT_SSN_ALREADY_IN_USE, "ACCOUNT_CLOSED_RECENTLY", "ACCOUNT_ALREADY_EXISTS", "ACCOUNT_RESTRICTED", "UNSUPPORTED_ACCOUNT", "UNCONFIRMED_EMAIL", "APPLICATION_DENIED", "UNSUPPORTED_REGION", "NEGATIVE_BALANCE_IN_WALLET", "SAVINGS_ACCOUNT_PROVISION_INELIGIBILITY_REASON", "VERIFICATION_REQUIRED", "VERIFICATION_FAILED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SavingsIneligibilityReasonCode {
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode ACCOUNT_ALREADY_EXISTS;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode ACCOUNT_CLOSED_RECENTLY;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode ACCOUNT_RESTRICTED;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode ACCOUNT_SSN_ALREADY_IN_USE;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode APPLICATION_DENIED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode NEGATIVE_BALANCE_IN_WALLET;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode SAVINGS_ACCOUNT_PROVISION_INELIGIBILITY_REASON;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode UNCONFIRMED_EMAIL;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode UNSUPPORTED_ACCOUNT;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode UNSUPPORTED_REGION;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode VERIFICATION_FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode VERIFICATION_REQUIRED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private SavingsIneligibilityReasonCode(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode(com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorIssues.ACCOUNT_SSN_ALREADY_IN_USE, 0, com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorIssues.ACCOUNT_SSN_ALREADY_IN_USE);
        ACCOUNT_SSN_ALREADY_IN_USE = savingsIneligibilityReasonCode;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode2 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("ACCOUNT_CLOSED_RECENTLY", 1, "ACCOUNT_CLOSED_RECENTLY");
        ACCOUNT_CLOSED_RECENTLY = savingsIneligibilityReasonCode2;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode3 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("ACCOUNT_ALREADY_EXISTS", 2, "ACCOUNT_ALREADY_EXISTS");
        ACCOUNT_ALREADY_EXISTS = savingsIneligibilityReasonCode3;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode4 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("ACCOUNT_RESTRICTED", 3, "ACCOUNT_RESTRICTED");
        ACCOUNT_RESTRICTED = savingsIneligibilityReasonCode4;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode5 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("UNSUPPORTED_ACCOUNT", 4, "UNSUPPORTED_ACCOUNT");
        UNSUPPORTED_ACCOUNT = savingsIneligibilityReasonCode5;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode6 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("UNCONFIRMED_EMAIL", 5, "UNCONFIRMED_EMAIL");
        UNCONFIRMED_EMAIL = savingsIneligibilityReasonCode6;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode7 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("APPLICATION_DENIED", 6, "APPLICATION_DENIED");
        APPLICATION_DENIED = savingsIneligibilityReasonCode7;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode8 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("UNSUPPORTED_REGION", 7, "UNSUPPORTED_REGION");
        UNSUPPORTED_REGION = savingsIneligibilityReasonCode8;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode9 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("NEGATIVE_BALANCE_IN_WALLET", 8, "NEGATIVE_BALANCE_IN_WALLET");
        NEGATIVE_BALANCE_IN_WALLET = savingsIneligibilityReasonCode9;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode10 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("SAVINGS_ACCOUNT_PROVISION_INELIGIBILITY_REASON", 9, "SAVINGS_ACCOUNT_PROVISION_INELIGIBILITY_REASON");
        SAVINGS_ACCOUNT_PROVISION_INELIGIBILITY_REASON = savingsIneligibilityReasonCode10;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode11 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("VERIFICATION_REQUIRED", 10, "VERIFICATION_REQUIRED");
        VERIFICATION_REQUIRED = savingsIneligibilityReasonCode11;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode12 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("VERIFICATION_FAILED", 11, "VERIFICATION_FAILED");
        VERIFICATION_FAILED = savingsIneligibilityReasonCode12;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode13 = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode("UNKNOWN__", 12, "UNKNOWN__");
        UNKNOWN__ = savingsIneligibilityReasonCode13;
        com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode[] savingsIneligibilityReasonCodeArr = {savingsIneligibilityReasonCode, savingsIneligibilityReasonCode2, savingsIneligibilityReasonCode3, savingsIneligibilityReasonCode4, savingsIneligibilityReasonCode5, savingsIneligibilityReasonCode6, savingsIneligibilityReasonCode7, savingsIneligibilityReasonCode8, savingsIneligibilityReasonCode9, savingsIneligibilityReasonCode10, savingsIneligibilityReasonCode11, savingsIneligibilityReasonCode12, savingsIneligibilityReasonCode13};
        Camera2StreamConfigurationMap = savingsIneligibilityReasonCodeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(savingsIneligibilityReasonCodeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("SavingsIneligibilityReasonCode", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorIssues.ACCOUNT_SSN_ALREADY_IN_USE, "ACCOUNT_CLOSED_RECENTLY", "ACCOUNT_ALREADY_EXISTS", "ACCOUNT_RESTRICTED", "UNSUPPORTED_ACCOUNT", "UNCONFIRMED_EMAIL", "APPLICATION_DENIED", "UNSUPPORTED_REGION", "NEGATIVE_BALANCE_IN_WALLET", "SAVINGS_ACCOUNT_PROVISION_INELIGIBILITY_REASON", "VERIFICATION_REQUIRED", "VERIFICATION_FAILED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SavingsIneligibilityReasonCode$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsIneligibilityReasonCode;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/SavingsIneligibilityReasonCode;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/SavingsIneligibilityReasonCode;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode[]{com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.ACCOUNT_SSN_ALREADY_IN_USE, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.ACCOUNT_CLOSED_RECENTLY, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.ACCOUNT_ALREADY_EXISTS, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.ACCOUNT_RESTRICTED, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.UNSUPPORTED_ACCOUNT, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.UNCONFIRMED_EMAIL, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.APPLICATION_DENIED, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.UNSUPPORTED_REGION, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.NEGATIVE_BALANCE_IN_WALLET, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.SAVINGS_ACCOUNT_PROVISION_INELIGIBILITY_REASON, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.VERIFICATION_REQUIRED, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.VERIFICATION_FAILED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode = (com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode) obj;
            return savingsIneligibilityReasonCode == null ? com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.UNKNOWN__ : savingsIneligibilityReasonCode;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
