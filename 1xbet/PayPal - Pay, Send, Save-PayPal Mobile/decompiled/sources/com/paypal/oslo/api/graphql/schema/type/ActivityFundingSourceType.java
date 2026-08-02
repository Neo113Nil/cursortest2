package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityFundingSourceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CREDIT_CARD", "BANK_ACCOUNT", "INCENTIVE", "PAYPAL_CREDIT", "GENERIC_INSTRUMENT", "THIRD_PARTY_REWARDS", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "EXTERNAL_WALLET", "PAYPAL_BONUS", "SAVINGS", "ECHECK", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityFundingSourceType {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType BANK_ACCOUNT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType CREDIT_CARD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType ECHECK;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType EXTERNAL_WALLET;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType GENERIC_INSTRUMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType INCENTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType PAYPAL_BONUS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType PAYPAL_CREDIT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType SAVINGS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType THIRD_PARTY_REWARDS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivityFundingSourceType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType("CREDIT_CARD", 0, "CREDIT_CARD");
        CREDIT_CARD = activityFundingSourceType;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType2 = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType("BANK_ACCOUNT", 1, "BANK_ACCOUNT");
        BANK_ACCOUNT = activityFundingSourceType2;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType3 = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType("INCENTIVE", 2, "INCENTIVE");
        INCENTIVE = activityFundingSourceType3;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType4 = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType("PAYPAL_CREDIT", 3, "PAYPAL_CREDIT");
        PAYPAL_CREDIT = activityFundingSourceType4;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType5 = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType("GENERIC_INSTRUMENT", 4, "GENERIC_INSTRUMENT");
        GENERIC_INSTRUMENT = activityFundingSourceType5;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType6 = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType("THIRD_PARTY_REWARDS", 5, "THIRD_PARTY_REWARDS");
        THIRD_PARTY_REWARDS = activityFundingSourceType6;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType7 = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 6, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance);
        BALANCE = activityFundingSourceType7;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType8 = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType("EXTERNAL_WALLET", 7, "EXTERNAL_WALLET");
        EXTERNAL_WALLET = activityFundingSourceType8;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType9 = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType("PAYPAL_BONUS", 8, "PAYPAL_BONUS");
        PAYPAL_BONUS = activityFundingSourceType9;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType10 = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType("SAVINGS", 9, "SAVINGS");
        SAVINGS = activityFundingSourceType10;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType11 = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType("ECHECK", 10, "ECHECK");
        ECHECK = activityFundingSourceType11;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType12 = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType("UNKNOWN__", 11, "UNKNOWN__");
        UNKNOWN__ = activityFundingSourceType12;
        com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType[] activityFundingSourceTypeArr = {activityFundingSourceType, activityFundingSourceType2, activityFundingSourceType3, activityFundingSourceType4, activityFundingSourceType5, activityFundingSourceType6, activityFundingSourceType7, activityFundingSourceType8, activityFundingSourceType9, activityFundingSourceType10, activityFundingSourceType11, activityFundingSourceType12};
        getHighSpeedVideoFpsRanges = activityFundingSourceTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(activityFundingSourceTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivityFundingSourceType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CREDIT_CARD", "BANK_ACCOUNT", "INCENTIVE", "PAYPAL_CREDIT", "GENERIC_INSTRUMENT", "THIRD_PARTY_REWARDS", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "EXTERNAL_WALLET", "PAYPAL_BONUS", "SAVINGS", "ECHECK"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityFundingSourceType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityFundingSourceType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivityFundingSourceType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityFundingSourceType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType[]{com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.CREDIT_CARD, com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.BANK_ACCOUNT, com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.INCENTIVE, com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.PAYPAL_CREDIT, com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.GENERIC_INSTRUMENT, com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.THIRD_PARTY_REWARDS, com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.BALANCE, com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.EXTERNAL_WALLET, com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.PAYPAL_BONUS, com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.SAVINGS, com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.ECHECK});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType activityFundingSourceType = (com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType) obj;
            return activityFundingSourceType == null ? com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.UNKNOWN__ : activityFundingSourceType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivityFundingSourceType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
