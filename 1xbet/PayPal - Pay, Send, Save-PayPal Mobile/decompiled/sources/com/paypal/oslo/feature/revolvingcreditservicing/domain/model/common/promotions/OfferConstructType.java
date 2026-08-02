package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/OfferConstructType;", "", "<init>", "(Ljava/lang/String;I)V", "DYNAMIC_RATE_INSTALLMENT", "INSTALLMENT", "NO_INTEREST", "PROMOTIONAL_APR", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OfferConstructType {
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType DYNAMIC_RATE_INSTALLMENT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType INSTALLMENT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType NO_INTEREST;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType PROMOTIONAL_APR;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private OfferConstructType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType offerConstructType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType("DYNAMIC_RATE_INSTALLMENT", 0);
        DYNAMIC_RATE_INSTALLMENT = offerConstructType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType offerConstructType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType("INSTALLMENT", 1);
        INSTALLMENT = offerConstructType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType offerConstructType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType("NO_INTEREST", 2);
        NO_INTEREST = offerConstructType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType offerConstructType4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType("PROMOTIONAL_APR", 3);
        PROMOTIONAL_APR = offerConstructType4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType offerConstructType5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType("UNKNOWN", 4);
        UNKNOWN = offerConstructType5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType[] offerConstructTypeArr = {offerConstructType, offerConstructType2, offerConstructType3, offerConstructType4, offerConstructType5};
        Camera2StreamConfigurationMap = offerConstructTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(offerConstructTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.OfferConstructType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
