package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_GOAL, com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_NON_GOAL, "GOAL", "PUBLIC_GOAL", "RESERVE", "GROUPS_POOL", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MoneyboxCategory {
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory GOAL;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory GROUPS_POOL;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory PUBLIC_GOAL;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory RESERVE;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory SAVINGS_GOAL;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory SAVINGS_NON_GOAL;
    public static final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private MoneyboxCategory(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory = new com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory(com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_GOAL, 0, com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_GOAL);
        SAVINGS_GOAL = moneyboxCategory;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory2 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory(com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_NON_GOAL, 1, com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_NON_GOAL);
        SAVINGS_NON_GOAL = moneyboxCategory2;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory3 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory("GOAL", 2, "GOAL");
        GOAL = moneyboxCategory3;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory4 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory("PUBLIC_GOAL", 3, "PUBLIC_GOAL");
        PUBLIC_GOAL = moneyboxCategory4;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory5 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory("RESERVE", 4, "RESERVE");
        RESERVE = moneyboxCategory5;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory6 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory("GROUPS_POOL", 5, "GROUPS_POOL");
        GROUPS_POOL = moneyboxCategory6;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory7 = new com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = moneyboxCategory7;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory[] moneyboxCategoryArr = {moneyboxCategory, moneyboxCategory2, moneyboxCategory3, moneyboxCategory4, moneyboxCategory5, moneyboxCategory6, moneyboxCategory7};
        Camera2StreamConfigurationMap = moneyboxCategoryArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(moneyboxCategoryArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("MoneyboxCategory", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_GOAL, com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_NON_GOAL, "GOAL", "PUBLIC_GOAL", "RESERVE", "GROUPS_POOL"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory[]{com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.SAVINGS_GOAL, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.SAVINGS_NON_GOAL, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.GOAL, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.PUBLIC_GOAL, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.RESERVE, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.GROUPS_POOL});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory = (com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory) obj;
            return moneyboxCategory == null ? com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.UNKNOWN__ : moneyboxCategory;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
