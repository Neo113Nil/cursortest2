package com.paypal.oslo.feature.home.ui.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/CollectionType;", "", "<init>", "(Ljava/lang/String;I)V", "MERCHANT", "HERO_PRODUCT", "ACCOUNTS", "NEXT_BEST_ACTION", "LARGE_TILE", "SPOTLIGHT_NBA", "FANNED_CAROUSEL", "DECK_CARD", "OFFER_NBA", "ADS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CollectionType {
    public static final com.paypal.oslo.feature.home.ui.navigation.CollectionType ACCOUNTS;
    public static final com.paypal.oslo.feature.home.ui.navigation.CollectionType ADS;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.home.ui.navigation.CollectionType DECK_CARD;
    public static final com.paypal.oslo.feature.home.ui.navigation.CollectionType FANNED_CAROUSEL;
    public static final com.paypal.oslo.feature.home.ui.navigation.CollectionType HERO_PRODUCT;
    public static final com.paypal.oslo.feature.home.ui.navigation.CollectionType LARGE_TILE;
    public static final com.paypal.oslo.feature.home.ui.navigation.CollectionType MERCHANT;
    public static final com.paypal.oslo.feature.home.ui.navigation.CollectionType NEXT_BEST_ACTION;
    public static final com.paypal.oslo.feature.home.ui.navigation.CollectionType OFFER_NBA;
    public static final com.paypal.oslo.feature.home.ui.navigation.CollectionType SPOTLIGHT_NBA;
    private static final /* synthetic */ com.paypal.oslo.feature.home.ui.navigation.CollectionType[] getHighSpeedVideoSizes;

    private CollectionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType = new com.paypal.oslo.feature.home.ui.navigation.CollectionType("MERCHANT", 0);
        MERCHANT = collectionType;
        com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType2 = new com.paypal.oslo.feature.home.ui.navigation.CollectionType("HERO_PRODUCT", 1);
        HERO_PRODUCT = collectionType2;
        com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType3 = new com.paypal.oslo.feature.home.ui.navigation.CollectionType("ACCOUNTS", 2);
        ACCOUNTS = collectionType3;
        com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType4 = new com.paypal.oslo.feature.home.ui.navigation.CollectionType("NEXT_BEST_ACTION", 3);
        NEXT_BEST_ACTION = collectionType4;
        com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType5 = new com.paypal.oslo.feature.home.ui.navigation.CollectionType("LARGE_TILE", 4);
        LARGE_TILE = collectionType5;
        com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType6 = new com.paypal.oslo.feature.home.ui.navigation.CollectionType("SPOTLIGHT_NBA", 5);
        SPOTLIGHT_NBA = collectionType6;
        com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType7 = new com.paypal.oslo.feature.home.ui.navigation.CollectionType("FANNED_CAROUSEL", 6);
        FANNED_CAROUSEL = collectionType7;
        com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType8 = new com.paypal.oslo.feature.home.ui.navigation.CollectionType("DECK_CARD", 7);
        DECK_CARD = collectionType8;
        com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType9 = new com.paypal.oslo.feature.home.ui.navigation.CollectionType("OFFER_NBA", 8);
        OFFER_NBA = collectionType9;
        com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType10 = new com.paypal.oslo.feature.home.ui.navigation.CollectionType("ADS", 9);
        ADS = collectionType10;
        com.paypal.oslo.feature.home.ui.navigation.CollectionType[] collectionTypeArr = {collectionType, collectionType2, collectionType3, collectionType4, collectionType5, collectionType6, collectionType7, collectionType8, collectionType9, collectionType10};
        getHighSpeedVideoSizes = collectionTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(collectionTypeArr);
    }

    public static com.paypal.oslo.feature.home.ui.navigation.CollectionType[] values() {
        return (com.paypal.oslo.feature.home.ui.navigation.CollectionType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.home.ui.navigation.CollectionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.home.ui.navigation.CollectionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.home.ui.navigation.CollectionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.home.ui.navigation.CollectionType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
