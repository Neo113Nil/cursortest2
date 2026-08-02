package com.paypal.oslo.feature.savings.domain.model.savingshub.registry;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/registry/PromoZoneTileType;", "", "<init>", "(Ljava/lang/String;I)V", "InterestTile", "PromoTile"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PromoZoneTileType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType InterestTile;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType PromoTile;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType[] getHighSpeedVideoFpsRanges;

    private PromoZoneTileType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType promoZoneTileType = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType("InterestTile", 0);
        InterestTile = promoZoneTileType;
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType promoZoneTileType2 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType("PromoTile", 1);
        PromoTile = promoZoneTileType2;
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType[] promoZoneTileTypeArr = {promoZoneTileType, promoZoneTileType2};
        getHighSpeedVideoFpsRanges = promoZoneTileTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(promoZoneTileTypeArr);
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType[] values() {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.model.savingshub.registry.PromoZoneTileType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
