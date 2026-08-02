package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/ReducerUtils;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadySelection;", "", "categoryId", "recalculateReadyStateAfterCategorySelection$shopping_rewards_prodRelease", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadySelection;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState$ReadySelection;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/ShoppingCategory;", "", "selectedIndex", "updatedSelectedShoppingCategory$shopping_rewards_prodRelease", "(Ljava/util/List;I)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReducerUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.ReducerUtils INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.ReducerUtils();

    private ReducerUtils() {
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection recalculateReadyStateAfterCategorySelection$shopping_rewards_prodRelease(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection readySelection, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readySelection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory> categories = readySelection.getCategorySelectionUiData().getCategories();
        java.util.Iterator<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory> it = categories.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(next.getId(), str) && !next.isSelected()) {
                break;
            }
            i++;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection copy$default = valueOf != null ? com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadySelection.copy$default(readySelection, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategorySelectionUiData.copy$default(readySelection.getCategorySelectionUiData(), INSTANCE.updatedSelectedShoppingCategory$shopping_rewards_prodRelease(categories, valueOf.intValue()), null, null, null, null, null, 62, null), false, 2, null) : null;
        return copy$default == null ? readySelection : copy$default;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory> updatedSelectedShoppingCategory$shopping_rewards_prodRelease(java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory> list, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i2 = 0;
        for (java.lang.Object obj : list2) {
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory.copy$default((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory) obj, null, null, null, null, i2 == i, false, 47, null));
            i2++;
        }
        return arrayList;
    }
}
