package com.paypal.oslo.feature.wallet.me.domain.savings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsGoalCategory;", "", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "p0", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;)V", "category", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "getCategory", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_GOAL}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SavingsGoalCategory {
    public static final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoalCategory SAVINGS_GOAL;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoalCategory[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory category;

    private SavingsGoalCategory(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory) {
        this.category = moneyboxCategory;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory getCategory() {
        return this.category;
    }

    static {
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoalCategory savingsGoalCategory = new com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoalCategory(com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_GOAL, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.SAVINGS_GOAL);
        SAVINGS_GOAL = savingsGoalCategory;
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoalCategory[] savingsGoalCategoryArr = {savingsGoalCategory};
        getHighResolutionOutputSizeshNQ4ISI = savingsGoalCategoryArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(savingsGoalCategoryArr);
    }

    public static com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoalCategory[] values() {
        return (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoalCategory[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoalCategory valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoalCategory) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoalCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoalCategory> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
