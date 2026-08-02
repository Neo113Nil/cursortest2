package com.paypal.oslo.feature.searchandintelligence.domain.model.productcard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/CommerceItemType;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCT", "GIFT_CARD", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommerceItemType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType GIFT_CARD;
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType PRODUCT;
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType[] getHighSpeedVideoFpsRanges;

    private CommerceItemType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType commerceItemType = new com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType("PRODUCT", 0);
        PRODUCT = commerceItemType;
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType commerceItemType2 = new com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType("GIFT_CARD", 1);
        GIFT_CARD = commerceItemType2;
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType commerceItemType3 = new com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType("UNKNOWN", 2);
        UNKNOWN = commerceItemType3;
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType[] commerceItemTypeArr = {commerceItemType, commerceItemType2, commerceItemType3};
        getHighSpeedVideoFpsRanges = commerceItemTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(commerceItemTypeArr);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType[] values() {
        return (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType) java.lang.Enum.valueOf(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
