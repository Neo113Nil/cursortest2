package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b "}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "AUTHORIZATION", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "MONEY_TRANSFER", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, "REVERSAL", "CURRENCY_TRANSFER", "PAYPAL_CREDIT_PAYMENT", "HOLD", "RECURRING_PAYMENT_PROFILE", "SUBSCRIPTION_CREATION", "SUBSCRIPTION_COMPLETION", "SUBSCRIPTION_MODIFICATION", "SUBSCRIPTION_CANCELLATION", "ADJUSTMENT", "CORRECTION", "SAVINGS", "HOLDING_BALANCE_TRANSFER", "FEE", "LOAN", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.CRYPTO_PAYMENT, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivitySubType {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType ADJUSTMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType AUTHORIZATION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType CORRECTION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType CRYPTO;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType CRYPTO_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType CURRENCY_TRANSFER;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType FEE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType HOLDING_BALANCE_TRANSFER;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType LOAN;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType MONEY_TRANSFER;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType PAYPAL_CREDIT_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType RECURRING_PAYMENT_PROFILE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType REFUND;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType SAVINGS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType SUBSCRIPTION_CANCELLATION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType SUBSCRIPTION_COMPLETION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType SUBSCRIPTION_CREATION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType SUBSCRIPTION_MODIFICATION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivitySubType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivitySubType[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivitySubType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("AUTHORIZATION", 0, "AUTHORIZATION");
        AUTHORIZATION = activitySubType;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType2 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, 1, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT);
        PAYMENT = activitySubType2;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType3 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("MONEY_TRANSFER", 2, "MONEY_TRANSFER");
        MONEY_TRANSFER = activitySubType3;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType4 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, 3, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND);
        REFUND = activitySubType4;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType5 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("REVERSAL", 4, "REVERSAL");
        REVERSAL = activitySubType5;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType6 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("CURRENCY_TRANSFER", 5, "CURRENCY_TRANSFER");
        CURRENCY_TRANSFER = activitySubType6;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType7 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("PAYPAL_CREDIT_PAYMENT", 6, "PAYPAL_CREDIT_PAYMENT");
        PAYPAL_CREDIT_PAYMENT = activitySubType7;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType8 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("HOLD", 7, "HOLD");
        HOLD = activitySubType8;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType9 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("RECURRING_PAYMENT_PROFILE", 8, "RECURRING_PAYMENT_PROFILE");
        RECURRING_PAYMENT_PROFILE = activitySubType9;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType10 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("SUBSCRIPTION_CREATION", 9, "SUBSCRIPTION_CREATION");
        SUBSCRIPTION_CREATION = activitySubType10;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType11 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("SUBSCRIPTION_COMPLETION", 10, "SUBSCRIPTION_COMPLETION");
        SUBSCRIPTION_COMPLETION = activitySubType11;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType12 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("SUBSCRIPTION_MODIFICATION", 11, "SUBSCRIPTION_MODIFICATION");
        SUBSCRIPTION_MODIFICATION = activitySubType12;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType13 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("SUBSCRIPTION_CANCELLATION", 12, "SUBSCRIPTION_CANCELLATION");
        SUBSCRIPTION_CANCELLATION = activitySubType13;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType14 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("ADJUSTMENT", 13, "ADJUSTMENT");
        ADJUSTMENT = activitySubType14;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType15 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("CORRECTION", 14, "CORRECTION");
        CORRECTION = activitySubType15;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType16 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("SAVINGS", 15, "SAVINGS");
        SAVINGS = activitySubType16;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType17 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("HOLDING_BALANCE_TRANSFER", 16, "HOLDING_BALANCE_TRANSFER");
        HOLDING_BALANCE_TRANSFER = activitySubType17;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType18 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("FEE", 17, "FEE");
        FEE = activitySubType18;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType19 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("LOAN", 18, "LOAN");
        LOAN = activitySubType19;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType20 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 19, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO);
        CRYPTO = activitySubType20;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType21 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.CRYPTO_PAYMENT, 20, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.CRYPTO_PAYMENT);
        CRYPTO_PAYMENT = activitySubType21;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType22 = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType("UNKNOWN__", 21, "UNKNOWN__");
        UNKNOWN__ = activitySubType22;
        com.paypal.oslo.api.graphql.schema.type.ActivitySubType[] activitySubTypeArr = {activitySubType, activitySubType2, activitySubType3, activitySubType4, activitySubType5, activitySubType6, activitySubType7, activitySubType8, activitySubType9, activitySubType10, activitySubType11, activitySubType12, activitySubType13, activitySubType14, activitySubType15, activitySubType16, activitySubType17, activitySubType18, activitySubType19, activitySubType20, activitySubType21, activitySubType22};
        getHighSpeedVideoFpsRanges = activitySubTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(activitySubTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivitySubType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivitySubType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"AUTHORIZATION", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "MONEY_TRANSFER", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, "REVERSAL", "CURRENCY_TRANSFER", "PAYPAL_CREDIT_PAYMENT", "HOLD", "RECURRING_PAYMENT_PROFILE", "SUBSCRIPTION_CREATION", "SUBSCRIPTION_COMPLETION", "SUBSCRIPTION_MODIFICATION", "SUBSCRIPTION_CANCELLATION", "ADJUSTMENT", "CORRECTION", "SAVINGS", "HOLDING_BALANCE_TRANSFER", "FEE", "LOAN", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.CRYPTO_PAYMENT}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivitySubType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivitySubType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivitySubType[]{com.paypal.oslo.api.graphql.schema.type.ActivitySubType.AUTHORIZATION, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.MONEY_TRANSFER, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.REFUND, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.REVERSAL, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.CURRENCY_TRANSFER, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.PAYPAL_CREDIT_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.HOLD, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.RECURRING_PAYMENT_PROFILE, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.SUBSCRIPTION_CREATION, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.SUBSCRIPTION_COMPLETION, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.SUBSCRIPTION_MODIFICATION, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.SUBSCRIPTION_CANCELLATION, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.ADJUSTMENT, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.CORRECTION, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.SAVINGS, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.HOLDING_BALANCE_TRANSFER, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.FEE, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.LOAN, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.CRYPTO, com.paypal.oslo.api.graphql.schema.type.ActivitySubType.CRYPTO_PAYMENT});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivitySubType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivitySubType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivitySubType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivitySubType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivitySubType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivitySubType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType = (com.paypal.oslo.api.graphql.schema.type.ActivitySubType) obj;
            return activitySubType == null ? com.paypal.oslo.api.graphql.schema.type.ActivitySubType.UNKNOWN__ : activitySubType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivitySubType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivitySubType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivitySubType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivitySubType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivitySubType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivitySubType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
