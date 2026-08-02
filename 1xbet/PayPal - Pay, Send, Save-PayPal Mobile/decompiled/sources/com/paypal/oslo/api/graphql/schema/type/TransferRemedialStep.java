package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TransferRemedialStep;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ADD_BANK_ACCOUNT", "VERIFY_BANK_ACCOUNT", "CONFIRM_EMAIL", "ADD_CARD", "VERIFY_IDENTITY", "ACCEPT_USER_AGREEMENT", "COMPLETE_CIP", "PROVISIONING_REQUIRED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransferRemedialStep {
    public static final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep ACCEPT_USER_AGREEMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep ADD_BANK_ACCOUNT;
    public static final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep ADD_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep COMPLETE_CIP;
    public static final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep CONFIRM_EMAIL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep PROVISIONING_REQUIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep VERIFY_BANK_ACCOUNT;
    public static final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep VERIFY_IDENTITY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private TransferRemedialStep(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep = new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep("ADD_BANK_ACCOUNT", 0, "ADD_BANK_ACCOUNT");
        ADD_BANK_ACCOUNT = transferRemedialStep;
        com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep2 = new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep("VERIFY_BANK_ACCOUNT", 1, "VERIFY_BANK_ACCOUNT");
        VERIFY_BANK_ACCOUNT = transferRemedialStep2;
        com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep3 = new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep("CONFIRM_EMAIL", 2, "CONFIRM_EMAIL");
        CONFIRM_EMAIL = transferRemedialStep3;
        com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep4 = new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep("ADD_CARD", 3, "ADD_CARD");
        ADD_CARD = transferRemedialStep4;
        com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep5 = new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep("VERIFY_IDENTITY", 4, "VERIFY_IDENTITY");
        VERIFY_IDENTITY = transferRemedialStep5;
        com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep6 = new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep("ACCEPT_USER_AGREEMENT", 5, "ACCEPT_USER_AGREEMENT");
        ACCEPT_USER_AGREEMENT = transferRemedialStep6;
        com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep7 = new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep("COMPLETE_CIP", 6, "COMPLETE_CIP");
        COMPLETE_CIP = transferRemedialStep7;
        com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep8 = new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep("PROVISIONING_REQUIRED", 7, "PROVISIONING_REQUIRED");
        PROVISIONING_REQUIRED = transferRemedialStep8;
        com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep9 = new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = transferRemedialStep9;
        com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep[] transferRemedialStepArr = {transferRemedialStep, transferRemedialStep2, transferRemedialStep3, transferRemedialStep4, transferRemedialStep5, transferRemedialStep6, transferRemedialStep7, transferRemedialStep8, transferRemedialStep9};
        getHighSpeedVideoSizes = transferRemedialStepArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(transferRemedialStepArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("TransferRemedialStep", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ADD_BANK_ACCOUNT", "VERIFY_BANK_ACCOUNT", "CONFIRM_EMAIL", "ADD_CARD", "VERIFY_IDENTITY", "ACCEPT_USER_AGREEMENT", "COMPLETE_CIP", "PROVISIONING_REQUIRED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TransferRemedialStep$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/TransferRemedialStep;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/TransferRemedialStep;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/TransferRemedialStep;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep[]{com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.ADD_BANK_ACCOUNT, com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.VERIFY_BANK_ACCOUNT, com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.CONFIRM_EMAIL, com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.ADD_CARD, com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.VERIFY_IDENTITY, com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.ACCEPT_USER_AGREEMENT, com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.COMPLETE_CIP, com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.PROVISIONING_REQUIRED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep = (com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep) obj;
            return transferRemedialStep == null ? com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.UNKNOWN__ : transferRemedialStep;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
