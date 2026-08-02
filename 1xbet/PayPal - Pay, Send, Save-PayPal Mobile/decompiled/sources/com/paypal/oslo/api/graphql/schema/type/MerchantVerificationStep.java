package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MerchantVerificationStep;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "EMAIL_VERIFIED", "ACCOUNT_VERIFIED", "BANK_ACCOUNT_ADDED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MerchantVerificationStep {
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep ACCOUNT_VERIFIED;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep BANK_ACCOUNT_ADDED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep EMAIL_VERIFIED;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private MerchantVerificationStep(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep merchantVerificationStep = new com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep("EMAIL_VERIFIED", 0, "EMAIL_VERIFIED");
        EMAIL_VERIFIED = merchantVerificationStep;
        com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep merchantVerificationStep2 = new com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep("ACCOUNT_VERIFIED", 1, "ACCOUNT_VERIFIED");
        ACCOUNT_VERIFIED = merchantVerificationStep2;
        com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep merchantVerificationStep3 = new com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep("BANK_ACCOUNT_ADDED", 2, "BANK_ACCOUNT_ADDED");
        BANK_ACCOUNT_ADDED = merchantVerificationStep3;
        com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep merchantVerificationStep4 = new com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = merchantVerificationStep4;
        com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep[] merchantVerificationStepArr = {merchantVerificationStep, merchantVerificationStep2, merchantVerificationStep3, merchantVerificationStep4};
        getHighResolutionOutputSizeshNQ4ISI = merchantVerificationStepArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(merchantVerificationStepArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("MerchantVerificationStep", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"EMAIL_VERIFIED", "ACCOUNT_VERIFIED", "BANK_ACCOUNT_ADDED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MerchantVerificationStep$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantVerificationStep;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/MerchantVerificationStep;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/MerchantVerificationStep;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep[]{com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.EMAIL_VERIFIED, com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.ACCOUNT_VERIFIED, com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.BANK_ACCOUNT_ADDED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep merchantVerificationStep = (com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep) obj;
            return merchantVerificationStep == null ? com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.UNKNOWN__ : merchantVerificationStep;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
