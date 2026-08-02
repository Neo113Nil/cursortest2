package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/PreviewData;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/ConfirmationDetailItem;", "mockItems", "Ljava/util/List;", "getMockItems$shopping_rewards_prodRelease", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategoryConfirmationUiData;", "mockCategoryConfirmationData", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategoryConfirmationUiData;", "getMockCategoryConfirmationData$shopping_rewards_prodRelease", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/models/CategoryConfirmationUiData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PreviewData {
    public static final int $stable;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.PreviewData INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.PreviewData();
    private static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData mockCategoryConfirmationData;
    private static final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem> mockItems;

    private PreviewData() {
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem> getMockItems$shopping_rewards_prodRelease() {
        return mockItems;
    }

    static {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem[]{new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem(com.paypal.pds.core.Icon.Card.INSTANCE, "Pay with PayPal Debit Card", "In stores or online"), new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem(com.paypal.pds.core.Icon.Trophy.INSTANCE, "5 points per $1 spent in your category", "On up to $1,000 of spending this month"), new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ConfirmationDetailItem(com.paypal.pds.core.Icon.Calendar.INSTANCE, "Choose again next month", "Keep the same category or switch it up")});
        mockItems = listOf;
        mockCategoryConfirmationData = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData("You're earning 5 points per $1 on Restaurants", "https://www.paypalobjects.com/webstatic/icon/pp258.png", "Until 11:59 PM PST, October, 31st 2025", listOf, "Terms Apply", "", new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData("Done", null, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.SharedDataModelsKt.getBUTTON_STATE_ENABLED(), 2, null));
        $stable = 8;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.CategoryConfirmationUiData getMockCategoryConfirmationData$shopping_rewards_prodRelease() {
        return mockCategoryConfirmationData;
    }
}
