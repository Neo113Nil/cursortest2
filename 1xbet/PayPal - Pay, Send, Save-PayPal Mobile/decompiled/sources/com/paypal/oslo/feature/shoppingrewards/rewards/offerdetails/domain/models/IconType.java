package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/IconType;", "", "<init>", "(Ljava/lang/String;I)V", "CHECK_ICON", "CLOCK_ICON", "CART_ICON", "SHOPPING_BAG_ICON", "TROPHY_ICON", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IconType {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType CART_ICON;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType CHECK_ICON;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType CLOCK_ICON;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType NONE;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType SHOPPING_BAG_ICON;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType TROPHY_ICON;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType[] getHighResolutionOutputSizeshNQ4ISI;

    private IconType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType iconType = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType("CHECK_ICON", 0);
        CHECK_ICON = iconType;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType iconType2 = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType("CLOCK_ICON", 1);
        CLOCK_ICON = iconType2;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType iconType3 = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType("CART_ICON", 2);
        CART_ICON = iconType3;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType iconType4 = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType("SHOPPING_BAG_ICON", 3);
        SHOPPING_BAG_ICON = iconType4;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType iconType5 = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType("TROPHY_ICON", 4);
        TROPHY_ICON = iconType5;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType iconType6 = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType("NONE", 5);
        NONE = iconType6;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType[] iconTypeArr = {iconType, iconType2, iconType3, iconType4, iconType5, iconType6};
        getHighResolutionOutputSizeshNQ4ISI = iconTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(iconTypeArr);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
