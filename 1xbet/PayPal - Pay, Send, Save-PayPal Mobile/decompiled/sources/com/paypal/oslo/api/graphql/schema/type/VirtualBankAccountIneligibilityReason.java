package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountIneligibilityReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "UNSUPPORTED_ACCOUNT_TYPE", "UNSUPPORTED_BUSINESS_TYPE", "UNSUPPORTED_COUNTRY", "ACCOUNT_RESTRICTED", "ACCOUNT_LOCKED", "ACCOUNT_CLOSED", com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse.REASON_SIMILAR_PRODUCT_EXISTS, "SIMILAR_PRODUCT_EXISTS_MULTIPLE", "VERIFICATION_REQUIRED", "VERIFICATION_UNDER_REVIEW", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VirtualBankAccountIneligibilityReason {
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason ACCOUNT_CLOSED;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason ACCOUNT_LOCKED;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason ACCOUNT_RESTRICTED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason SIMILAR_PRODUCT_EXISTS;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason SIMILAR_PRODUCT_EXISTS_MULTIPLE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason UNSUPPORTED_ACCOUNT_TYPE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason UNSUPPORTED_BUSINESS_TYPE;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason UNSUPPORTED_COUNTRY;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason VERIFICATION_REQUIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason VERIFICATION_UNDER_REVIEW;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private VirtualBankAccountIneligibilityReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason("UNSUPPORTED_ACCOUNT_TYPE", 0, "UNSUPPORTED_ACCOUNT_TYPE");
        UNSUPPORTED_ACCOUNT_TYPE = virtualBankAccountIneligibilityReason;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason2 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason("UNSUPPORTED_BUSINESS_TYPE", 1, "UNSUPPORTED_BUSINESS_TYPE");
        UNSUPPORTED_BUSINESS_TYPE = virtualBankAccountIneligibilityReason2;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason3 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason("UNSUPPORTED_COUNTRY", 2, "UNSUPPORTED_COUNTRY");
        UNSUPPORTED_COUNTRY = virtualBankAccountIneligibilityReason3;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason4 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason("ACCOUNT_RESTRICTED", 3, "ACCOUNT_RESTRICTED");
        ACCOUNT_RESTRICTED = virtualBankAccountIneligibilityReason4;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason5 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason("ACCOUNT_LOCKED", 4, "ACCOUNT_LOCKED");
        ACCOUNT_LOCKED = virtualBankAccountIneligibilityReason5;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason6 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason("ACCOUNT_CLOSED", 5, "ACCOUNT_CLOSED");
        ACCOUNT_CLOSED = virtualBankAccountIneligibilityReason6;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason7 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse.REASON_SIMILAR_PRODUCT_EXISTS, 6, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse.REASON_SIMILAR_PRODUCT_EXISTS);
        SIMILAR_PRODUCT_EXISTS = virtualBankAccountIneligibilityReason7;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason8 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason("SIMILAR_PRODUCT_EXISTS_MULTIPLE", 7, "SIMILAR_PRODUCT_EXISTS_MULTIPLE");
        SIMILAR_PRODUCT_EXISTS_MULTIPLE = virtualBankAccountIneligibilityReason8;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason9 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason("VERIFICATION_REQUIRED", 8, "VERIFICATION_REQUIRED");
        VERIFICATION_REQUIRED = virtualBankAccountIneligibilityReason9;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason10 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason("VERIFICATION_UNDER_REVIEW", 9, "VERIFICATION_UNDER_REVIEW");
        VERIFICATION_UNDER_REVIEW = virtualBankAccountIneligibilityReason10;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason11 = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason("UNKNOWN__", 10, "UNKNOWN__");
        UNKNOWN__ = virtualBankAccountIneligibilityReason11;
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason[] virtualBankAccountIneligibilityReasonArr = {virtualBankAccountIneligibilityReason, virtualBankAccountIneligibilityReason2, virtualBankAccountIneligibilityReason3, virtualBankAccountIneligibilityReason4, virtualBankAccountIneligibilityReason5, virtualBankAccountIneligibilityReason6, virtualBankAccountIneligibilityReason7, virtualBankAccountIneligibilityReason8, virtualBankAccountIneligibilityReason9, virtualBankAccountIneligibilityReason10, virtualBankAccountIneligibilityReason11};
        getHighResolutionOutputSizeshNQ4ISI = virtualBankAccountIneligibilityReasonArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(virtualBankAccountIneligibilityReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("VirtualBankAccountIneligibilityReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"UNSUPPORTED_ACCOUNT_TYPE", "UNSUPPORTED_BUSINESS_TYPE", "UNSUPPORTED_COUNTRY", "ACCOUNT_RESTRICTED", "ACCOUNT_LOCKED", "ACCOUNT_CLOSED", com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse.REASON_SIMILAR_PRODUCT_EXISTS, "SIMILAR_PRODUCT_EXISTS_MULTIPLE", "VERIFICATION_REQUIRED", "VERIFICATION_UNDER_REVIEW"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountIneligibilityReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountIneligibilityReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountIneligibilityReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountIneligibilityReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason[]{com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.UNSUPPORTED_ACCOUNT_TYPE, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.UNSUPPORTED_BUSINESS_TYPE, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.UNSUPPORTED_COUNTRY, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.ACCOUNT_RESTRICTED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.ACCOUNT_LOCKED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.ACCOUNT_CLOSED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.SIMILAR_PRODUCT_EXISTS, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.SIMILAR_PRODUCT_EXISTS_MULTIPLE, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.VERIFICATION_REQUIRED, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.VERIFICATION_UNDER_REVIEW});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason = (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason) obj;
            return virtualBankAccountIneligibilityReason == null ? com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.UNKNOWN__ : virtualBankAccountIneligibilityReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
