package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ADDRESS_NORMALIZATION_FAILURE", "DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED", "MULTI_FACTOR_AUTHENTICATION_FAILED", "FRAUD_DETECTION", "INELIGIBLE_ADDRESS", "KYC_THRESHOLD_REACHED", "KYC_VERIFICATION_FAILURE", "RISK_ASSESSMENT_FAILURE", "STRONG_CUSTOMER_AUTHENTICATION_FAILURE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BNPLAcquisitionApplicationDeclineReason {
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason ADDRESS_NORMALIZATION_FAILURE;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason FRAUD_DETECTION;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason INELIGIBLE_ADDRESS;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason KYC_THRESHOLD_REACHED;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason KYC_VERIFICATION_FAILURE;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason MULTI_FACTOR_AUTHENTICATION_FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason RISK_ASSESSMENT_FAILURE;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason STRONG_CUSTOMER_AUTHENTICATION_FAILURE;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BNPLAcquisitionApplicationDeclineReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason = new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason("ADDRESS_NORMALIZATION_FAILURE", 0, "ADDRESS_NORMALIZATION_FAILURE");
        ADDRESS_NORMALIZATION_FAILURE = bNPLAcquisitionApplicationDeclineReason;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason2 = new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason("DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED", 1, "DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED");
        DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED = bNPLAcquisitionApplicationDeclineReason2;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason3 = new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason("MULTI_FACTOR_AUTHENTICATION_FAILED", 2, "MULTI_FACTOR_AUTHENTICATION_FAILED");
        MULTI_FACTOR_AUTHENTICATION_FAILED = bNPLAcquisitionApplicationDeclineReason3;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason4 = new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason("FRAUD_DETECTION", 3, "FRAUD_DETECTION");
        FRAUD_DETECTION = bNPLAcquisitionApplicationDeclineReason4;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason5 = new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason("INELIGIBLE_ADDRESS", 4, "INELIGIBLE_ADDRESS");
        INELIGIBLE_ADDRESS = bNPLAcquisitionApplicationDeclineReason5;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason6 = new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason("KYC_THRESHOLD_REACHED", 5, "KYC_THRESHOLD_REACHED");
        KYC_THRESHOLD_REACHED = bNPLAcquisitionApplicationDeclineReason6;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason7 = new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason("KYC_VERIFICATION_FAILURE", 6, "KYC_VERIFICATION_FAILURE");
        KYC_VERIFICATION_FAILURE = bNPLAcquisitionApplicationDeclineReason7;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason8 = new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason("RISK_ASSESSMENT_FAILURE", 7, "RISK_ASSESSMENT_FAILURE");
        RISK_ASSESSMENT_FAILURE = bNPLAcquisitionApplicationDeclineReason8;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason9 = new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason("STRONG_CUSTOMER_AUTHENTICATION_FAILURE", 8, "STRONG_CUSTOMER_AUTHENTICATION_FAILURE");
        STRONG_CUSTOMER_AUTHENTICATION_FAILURE = bNPLAcquisitionApplicationDeclineReason9;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason10 = new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = bNPLAcquisitionApplicationDeclineReason10;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason[] bNPLAcquisitionApplicationDeclineReasonArr = {bNPLAcquisitionApplicationDeclineReason, bNPLAcquisitionApplicationDeclineReason2, bNPLAcquisitionApplicationDeclineReason3, bNPLAcquisitionApplicationDeclineReason4, bNPLAcquisitionApplicationDeclineReason5, bNPLAcquisitionApplicationDeclineReason6, bNPLAcquisitionApplicationDeclineReason7, bNPLAcquisitionApplicationDeclineReason8, bNPLAcquisitionApplicationDeclineReason9, bNPLAcquisitionApplicationDeclineReason10};
        getHighSpeedVideoFpsRanges = bNPLAcquisitionApplicationDeclineReasonArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(bNPLAcquisitionApplicationDeclineReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BNPLAcquisitionApplicationDeclineReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ADDRESS_NORMALIZATION_FAILURE", "DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED", "MULTI_FACTOR_AUTHENTICATION_FAILED", "FRAUD_DETECTION", "INELIGIBLE_ADDRESS", "KYC_THRESHOLD_REACHED", "KYC_VERIFICATION_FAILURE", "RISK_ASSESSMENT_FAILURE", "STRONG_CUSTOMER_AUTHENTICATION_FAILURE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason[]{com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.ADDRESS_NORMALIZATION_FAILURE, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.MULTI_FACTOR_AUTHENTICATION_FAILED, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.FRAUD_DETECTION, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.INELIGIBLE_ADDRESS, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.KYC_THRESHOLD_REACHED, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.KYC_VERIFICATION_FAILURE, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.RISK_ASSESSMENT_FAILURE, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.STRONG_CUSTOMER_AUTHENTICATION_FAILURE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason = (com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason) obj;
            return bNPLAcquisitionApplicationDeclineReason == null ? com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.UNKNOWN__ : bNPLAcquisitionApplicationDeclineReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
