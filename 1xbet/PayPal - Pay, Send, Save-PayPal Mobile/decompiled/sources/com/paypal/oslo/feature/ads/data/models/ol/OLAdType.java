package com.paypal.oslo.feature.ads.data.models.ol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/ol/OLAdType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "NATIVE_IMAGE", "NATIVE_TEXT_AND_IMAGE", "PAYPAL_SHOP", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OLAdType {
    private static final /* synthetic */ com.paypal.oslo.feature.ads.data.models.ol.OLAdType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.ads.data.models.ol.OLAdType IMAGE;
    public static final com.paypal.oslo.feature.ads.data.models.ol.OLAdType NATIVE_IMAGE;
    public static final com.paypal.oslo.feature.ads.data.models.ol.OLAdType NATIVE_TEXT_AND_IMAGE;
    public static final com.paypal.oslo.feature.ads.data.models.ol.OLAdType PAYPAL_SHOP;
    public static final com.paypal.oslo.feature.ads.data.models.ol.OLAdType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private OLAdType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.ads.data.models.ol.OLAdType oLAdType = new com.paypal.oslo.feature.ads.data.models.ol.OLAdType("IMAGE", 0);
        IMAGE = oLAdType;
        com.paypal.oslo.feature.ads.data.models.ol.OLAdType oLAdType2 = new com.paypal.oslo.feature.ads.data.models.ol.OLAdType("NATIVE_IMAGE", 1);
        NATIVE_IMAGE = oLAdType2;
        com.paypal.oslo.feature.ads.data.models.ol.OLAdType oLAdType3 = new com.paypal.oslo.feature.ads.data.models.ol.OLAdType("NATIVE_TEXT_AND_IMAGE", 2);
        NATIVE_TEXT_AND_IMAGE = oLAdType3;
        com.paypal.oslo.feature.ads.data.models.ol.OLAdType oLAdType4 = new com.paypal.oslo.feature.ads.data.models.ol.OLAdType("PAYPAL_SHOP", 3);
        PAYPAL_SHOP = oLAdType4;
        com.paypal.oslo.feature.ads.data.models.ol.OLAdType oLAdType5 = new com.paypal.oslo.feature.ads.data.models.ol.OLAdType("UNKNOWN", 4);
        UNKNOWN = oLAdType5;
        com.paypal.oslo.feature.ads.data.models.ol.OLAdType[] oLAdTypeArr = {oLAdType, oLAdType2, oLAdType3, oLAdType4, oLAdType5};
        Camera2StreamConfigurationMap = oLAdTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(oLAdTypeArr);
    }

    public static com.paypal.oslo.feature.ads.data.models.ol.OLAdType[] values() {
        return (com.paypal.oslo.feature.ads.data.models.ol.OLAdType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.ads.data.models.ol.OLAdType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.ads.data.models.ol.OLAdType) java.lang.Enum.valueOf(com.paypal.oslo.feature.ads.data.models.ol.OLAdType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.ads.data.models.ol.OLAdType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
