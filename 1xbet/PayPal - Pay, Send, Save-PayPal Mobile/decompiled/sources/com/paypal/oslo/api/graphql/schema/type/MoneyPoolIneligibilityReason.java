package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolIneligibilityReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "MAXIMUM_ACTIVE_MONEY_POOLS_LIMIT_EXCEEDED", "MONEY_POOL_CREATION_DENIED_FOR_NEGATIVE_BALANCE", "MONEY_POOL_CREATION_DENIED_FOR_INACTIVE_PRODUCT_FEATURE", "MAXIMUM_POOLS_LIMIT_REACHED", "MAXIMUM_POOLS_HARD_LIMIT_REACHED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MoneyPoolIneligibilityReason {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason MAXIMUM_ACTIVE_MONEY_POOLS_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason MAXIMUM_POOLS_HARD_LIMIT_REACHED;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason MAXIMUM_POOLS_LIMIT_REACHED;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason MONEY_POOL_CREATION_DENIED_FOR_INACTIVE_PRODUCT_FEATURE;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason MONEY_POOL_CREATION_DENIED_FOR_NEGATIVE_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private MoneyPoolIneligibilityReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason moneyPoolIneligibilityReason = new com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason("MAXIMUM_ACTIVE_MONEY_POOLS_LIMIT_EXCEEDED", 0, "MAXIMUM_ACTIVE_MONEY_POOLS_LIMIT_EXCEEDED");
        MAXIMUM_ACTIVE_MONEY_POOLS_LIMIT_EXCEEDED = moneyPoolIneligibilityReason;
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason moneyPoolIneligibilityReason2 = new com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason("MONEY_POOL_CREATION_DENIED_FOR_NEGATIVE_BALANCE", 1, "MONEY_POOL_CREATION_DENIED_FOR_NEGATIVE_BALANCE");
        MONEY_POOL_CREATION_DENIED_FOR_NEGATIVE_BALANCE = moneyPoolIneligibilityReason2;
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason moneyPoolIneligibilityReason3 = new com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason("MONEY_POOL_CREATION_DENIED_FOR_INACTIVE_PRODUCT_FEATURE", 2, "MONEY_POOL_CREATION_DENIED_FOR_INACTIVE_PRODUCT_FEATURE");
        MONEY_POOL_CREATION_DENIED_FOR_INACTIVE_PRODUCT_FEATURE = moneyPoolIneligibilityReason3;
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason moneyPoolIneligibilityReason4 = new com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason("MAXIMUM_POOLS_LIMIT_REACHED", 3, "MAXIMUM_POOLS_LIMIT_REACHED");
        MAXIMUM_POOLS_LIMIT_REACHED = moneyPoolIneligibilityReason4;
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason moneyPoolIneligibilityReason5 = new com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason("MAXIMUM_POOLS_HARD_LIMIT_REACHED", 4, "MAXIMUM_POOLS_HARD_LIMIT_REACHED");
        MAXIMUM_POOLS_HARD_LIMIT_REACHED = moneyPoolIneligibilityReason5;
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason moneyPoolIneligibilityReason6 = new com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = moneyPoolIneligibilityReason6;
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason[] moneyPoolIneligibilityReasonArr = {moneyPoolIneligibilityReason, moneyPoolIneligibilityReason2, moneyPoolIneligibilityReason3, moneyPoolIneligibilityReason4, moneyPoolIneligibilityReason5, moneyPoolIneligibilityReason6};
        getHighResolutionOutputSizeshNQ4ISI = moneyPoolIneligibilityReasonArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(moneyPoolIneligibilityReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("MoneyPoolIneligibilityReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"MAXIMUM_ACTIVE_MONEY_POOLS_LIMIT_EXCEEDED", "MONEY_POOL_CREATION_DENIED_FOR_NEGATIVE_BALANCE", "MONEY_POOL_CREATION_DENIED_FOR_INACTIVE_PRODUCT_FEATURE", "MAXIMUM_POOLS_LIMIT_REACHED", "MAXIMUM_POOLS_HARD_LIMIT_REACHED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolIneligibilityReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolIneligibilityReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolIneligibilityReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolIneligibilityReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason[]{com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason.MAXIMUM_ACTIVE_MONEY_POOLS_LIMIT_EXCEEDED, com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason.MONEY_POOL_CREATION_DENIED_FOR_NEGATIVE_BALANCE, com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason.MONEY_POOL_CREATION_DENIED_FOR_INACTIVE_PRODUCT_FEATURE, com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason.MAXIMUM_POOLS_LIMIT_REACHED, com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason.MAXIMUM_POOLS_HARD_LIMIT_REACHED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason moneyPoolIneligibilityReason = (com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason) obj;
            return moneyPoolIneligibilityReason == null ? com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason.UNKNOWN__ : moneyPoolIneligibilityReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.MoneyPoolIneligibilityReason> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
