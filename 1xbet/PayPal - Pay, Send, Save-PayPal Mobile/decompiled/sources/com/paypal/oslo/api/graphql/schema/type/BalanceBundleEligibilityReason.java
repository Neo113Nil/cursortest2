package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "IDENTITY_VERIFICATION_FAILED", "IDENTITY_VERIFICATION_REQUIRED", "IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL", "USER_DOCUMENT_VALIDATION_FAILED", "BALANCE_DENIED", "BANK_ACCOUNT_OR_DEBIT_INELIGIBLE", "INVALID_USER_ACCOUNT_TYPE", "USER_ACCOUNT_CLOSED", "USER_ACCOUNT_LOCKED", "USER_ACCOUNT_RESTRICTED", "UNSUPPORTED_COUNTRY", com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress, "MANUAL_REVIEW", "OTHER", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BalanceBundleEligibilityReason {
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason BALANCE_DENIED;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason BANK_ACCOUNT_OR_DEBIT_INELIGIBLE;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason IDENTITY_VERIFICATION_FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason IDENTITY_VERIFICATION_REQUIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason INVALID_ADDRESS;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason INVALID_USER_ACCOUNT_TYPE;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason MANUAL_REVIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason OTHER;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason UNSUPPORTED_COUNTRY;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason USER_ACCOUNT_CLOSED;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason USER_ACCOUNT_LOCKED;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason USER_ACCOUNT_RESTRICTED;
    public static final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason USER_DOCUMENT_VALIDATION_FAILED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BalanceBundleEligibilityReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("IDENTITY_VERIFICATION_FAILED", 0, "IDENTITY_VERIFICATION_FAILED");
        IDENTITY_VERIFICATION_FAILED = balanceBundleEligibilityReason;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason2 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("IDENTITY_VERIFICATION_REQUIRED", 1, "IDENTITY_VERIFICATION_REQUIRED");
        IDENTITY_VERIFICATION_REQUIRED = balanceBundleEligibilityReason2;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason3 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL", 2, "IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL");
        IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL = balanceBundleEligibilityReason3;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason4 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("USER_DOCUMENT_VALIDATION_FAILED", 3, "USER_DOCUMENT_VALIDATION_FAILED");
        USER_DOCUMENT_VALIDATION_FAILED = balanceBundleEligibilityReason4;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason5 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("BALANCE_DENIED", 4, "BALANCE_DENIED");
        BALANCE_DENIED = balanceBundleEligibilityReason5;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason6 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("BANK_ACCOUNT_OR_DEBIT_INELIGIBLE", 5, "BANK_ACCOUNT_OR_DEBIT_INELIGIBLE");
        BANK_ACCOUNT_OR_DEBIT_INELIGIBLE = balanceBundleEligibilityReason6;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason7 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("INVALID_USER_ACCOUNT_TYPE", 6, "INVALID_USER_ACCOUNT_TYPE");
        INVALID_USER_ACCOUNT_TYPE = balanceBundleEligibilityReason7;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason8 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("USER_ACCOUNT_CLOSED", 7, "USER_ACCOUNT_CLOSED");
        USER_ACCOUNT_CLOSED = balanceBundleEligibilityReason8;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason9 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("USER_ACCOUNT_LOCKED", 8, "USER_ACCOUNT_LOCKED");
        USER_ACCOUNT_LOCKED = balanceBundleEligibilityReason9;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason10 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("USER_ACCOUNT_RESTRICTED", 9, "USER_ACCOUNT_RESTRICTED");
        USER_ACCOUNT_RESTRICTED = balanceBundleEligibilityReason10;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason11 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("UNSUPPORTED_COUNTRY", 10, "UNSUPPORTED_COUNTRY");
        UNSUPPORTED_COUNTRY = balanceBundleEligibilityReason11;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason12 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress, 11, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress);
        INVALID_ADDRESS = balanceBundleEligibilityReason12;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason13 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("MANUAL_REVIEW", 12, "MANUAL_REVIEW");
        MANUAL_REVIEW = balanceBundleEligibilityReason13;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason14 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("OTHER", 13, "OTHER");
        OTHER = balanceBundleEligibilityReason14;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason15 = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason("UNKNOWN__", 14, "UNKNOWN__");
        UNKNOWN__ = balanceBundleEligibilityReason15;
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason[] balanceBundleEligibilityReasonArr = {balanceBundleEligibilityReason, balanceBundleEligibilityReason2, balanceBundleEligibilityReason3, balanceBundleEligibilityReason4, balanceBundleEligibilityReason5, balanceBundleEligibilityReason6, balanceBundleEligibilityReason7, balanceBundleEligibilityReason8, balanceBundleEligibilityReason9, balanceBundleEligibilityReason10, balanceBundleEligibilityReason11, balanceBundleEligibilityReason12, balanceBundleEligibilityReason13, balanceBundleEligibilityReason14, balanceBundleEligibilityReason15};
        Camera2StreamConfigurationMap = balanceBundleEligibilityReasonArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(balanceBundleEligibilityReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BalanceBundleEligibilityReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"IDENTITY_VERIFICATION_FAILED", "IDENTITY_VERIFICATION_REQUIRED", "IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL", "USER_DOCUMENT_VALIDATION_FAILED", "BALANCE_DENIED", "BANK_ACCOUNT_OR_DEBIT_INELIGIBLE", "INVALID_USER_ACCOUNT_TYPE", "USER_ACCOUNT_CLOSED", "USER_ACCOUNT_LOCKED", "USER_ACCOUNT_RESTRICTED", "UNSUPPORTED_COUNTRY", com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress, "MANUAL_REVIEW", "OTHER"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason[]{com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.IDENTITY_VERIFICATION_FAILED, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.IDENTITY_VERIFICATION_REQUIRED, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.USER_DOCUMENT_VALIDATION_FAILED, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.BALANCE_DENIED, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.BANK_ACCOUNT_OR_DEBIT_INELIGIBLE, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.INVALID_USER_ACCOUNT_TYPE, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.USER_ACCOUNT_CLOSED, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.USER_ACCOUNT_LOCKED, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.USER_ACCOUNT_RESTRICTED, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.UNSUPPORTED_COUNTRY, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.INVALID_ADDRESS, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.MANUAL_REVIEW, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.OTHER});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason = (com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason) obj;
            return balanceBundleEligibilityReason == null ? com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.UNKNOWN__ : balanceBundleEligibilityReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
