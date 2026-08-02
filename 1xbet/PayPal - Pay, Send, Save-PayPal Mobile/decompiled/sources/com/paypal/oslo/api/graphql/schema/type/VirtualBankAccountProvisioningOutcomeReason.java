package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningOutcomeReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "STEP_UP_AUTH", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, "VERIFICATION_FAILED", "VERIFICATION_REQUIRED", "VERIFICATION_IN_REVIEW", "UNSUPPORTED_ACCOUNT_TYPE", "UNSUPPORTED_BUSINESS_TYPE", "UNSUPPORTED_COUNTRY", "ACCOUNT_RESTRICTED", "ACCOUNT_LOCKED", "ACCOUNT_CLOSED", com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse.REASON_SIMILAR_PRODUCT_EXISTS, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VirtualBankAccountProvisioningOutcomeReason {
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason ACCOUNT_CLOSED;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason ACCOUNT_LOCKED;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason ACCOUNT_RESTRICTED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason DENIED;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason SIMILAR_PRODUCT_EXISTS;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason STEP_UP_AUTH;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason UNSUPPORTED_ACCOUNT_TYPE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason UNSUPPORTED_BUSINESS_TYPE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason UNSUPPORTED_COUNTRY;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason VERIFICATION_FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason VERIFICATION_IN_REVIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason VERIFICATION_REQUIRED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private VirtualBankAccountProvisioningOutcomeReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason("STEP_UP_AUTH", 0, "STEP_UP_AUTH");
        STEP_UP_AUTH = virtualBankAccountProvisioningOutcomeReason;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason2 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 1, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED);
        DENIED = virtualBankAccountProvisioningOutcomeReason2;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason3 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason("VERIFICATION_FAILED", 2, "VERIFICATION_FAILED");
        VERIFICATION_FAILED = virtualBankAccountProvisioningOutcomeReason3;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason4 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason("VERIFICATION_REQUIRED", 3, "VERIFICATION_REQUIRED");
        VERIFICATION_REQUIRED = virtualBankAccountProvisioningOutcomeReason4;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason5 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason("VERIFICATION_IN_REVIEW", 4, "VERIFICATION_IN_REVIEW");
        VERIFICATION_IN_REVIEW = virtualBankAccountProvisioningOutcomeReason5;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason6 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason("UNSUPPORTED_ACCOUNT_TYPE", 5, "UNSUPPORTED_ACCOUNT_TYPE");
        UNSUPPORTED_ACCOUNT_TYPE = virtualBankAccountProvisioningOutcomeReason6;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason7 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason("UNSUPPORTED_BUSINESS_TYPE", 6, "UNSUPPORTED_BUSINESS_TYPE");
        UNSUPPORTED_BUSINESS_TYPE = virtualBankAccountProvisioningOutcomeReason7;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason8 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason("UNSUPPORTED_COUNTRY", 7, "UNSUPPORTED_COUNTRY");
        UNSUPPORTED_COUNTRY = virtualBankAccountProvisioningOutcomeReason8;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason9 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason("ACCOUNT_RESTRICTED", 8, "ACCOUNT_RESTRICTED");
        ACCOUNT_RESTRICTED = virtualBankAccountProvisioningOutcomeReason9;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason10 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason("ACCOUNT_LOCKED", 9, "ACCOUNT_LOCKED");
        ACCOUNT_LOCKED = virtualBankAccountProvisioningOutcomeReason10;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason11 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason("ACCOUNT_CLOSED", 10, "ACCOUNT_CLOSED");
        ACCOUNT_CLOSED = virtualBankAccountProvisioningOutcomeReason11;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason12 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse.REASON_SIMILAR_PRODUCT_EXISTS, 11, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse.REASON_SIMILAR_PRODUCT_EXISTS);
        SIMILAR_PRODUCT_EXISTS = virtualBankAccountProvisioningOutcomeReason12;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason13 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason("UNKNOWN__", 12, "UNKNOWN__");
        UNKNOWN__ = virtualBankAccountProvisioningOutcomeReason13;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason[] virtualBankAccountProvisioningOutcomeReasonArr = {virtualBankAccountProvisioningOutcomeReason, virtualBankAccountProvisioningOutcomeReason2, virtualBankAccountProvisioningOutcomeReason3, virtualBankAccountProvisioningOutcomeReason4, virtualBankAccountProvisioningOutcomeReason5, virtualBankAccountProvisioningOutcomeReason6, virtualBankAccountProvisioningOutcomeReason7, virtualBankAccountProvisioningOutcomeReason8, virtualBankAccountProvisioningOutcomeReason9, virtualBankAccountProvisioningOutcomeReason10, virtualBankAccountProvisioningOutcomeReason11, virtualBankAccountProvisioningOutcomeReason12, virtualBankAccountProvisioningOutcomeReason13};
        getHighSpeedVideoFpsRangesFor = virtualBankAccountProvisioningOutcomeReasonArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(virtualBankAccountProvisioningOutcomeReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("VirtualBankAccountProvisioningOutcomeReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"STEP_UP_AUTH", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, "VERIFICATION_FAILED", "VERIFICATION_REQUIRED", "VERIFICATION_IN_REVIEW", "UNSUPPORTED_ACCOUNT_TYPE", "UNSUPPORTED_BUSINESS_TYPE", "UNSUPPORTED_COUNTRY", "ACCOUNT_RESTRICTED", "ACCOUNT_LOCKED", "ACCOUNT_CLOSED", com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse.REASON_SIMILAR_PRODUCT_EXISTS}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningOutcomeReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningOutcomeReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningOutcomeReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningOutcomeReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason[]{com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.STEP_UP_AUTH, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.DENIED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.VERIFICATION_FAILED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.VERIFICATION_REQUIRED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.VERIFICATION_IN_REVIEW, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.UNSUPPORTED_ACCOUNT_TYPE, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.UNSUPPORTED_BUSINESS_TYPE, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.UNSUPPORTED_COUNTRY, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.ACCOUNT_RESTRICTED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.ACCOUNT_LOCKED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.ACCOUNT_CLOSED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.SIMILAR_PRODUCT_EXISTS});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason = (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason) obj;
            return virtualBankAccountProvisioningOutcomeReason == null ? com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.UNKNOWN__ : virtualBankAccountProvisioningOutcomeReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
