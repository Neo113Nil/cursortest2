package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferClickType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CATEGORY_CONFIRMATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActiveOfferClickType {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType CATEGORY_CONFIRMATION;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType DEFAULT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ActiveOfferClickType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType activeOfferClickType = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType("DEFAULT", 0);
        DEFAULT = activeOfferClickType;
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType activeOfferClickType2 = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType("CATEGORY_CONFIRMATION", 1);
        CATEGORY_CONFIRMATION = activeOfferClickType2;
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType[] activeOfferClickTypeArr = {activeOfferClickType, activeOfferClickType2};
        Camera2StreamConfigurationMap = activeOfferClickTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(activeOfferClickTypeArr);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
