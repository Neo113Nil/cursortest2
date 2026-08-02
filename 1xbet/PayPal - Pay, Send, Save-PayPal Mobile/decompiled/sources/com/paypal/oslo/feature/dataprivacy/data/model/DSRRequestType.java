package com.paypal.oslo.feature.dataprivacy.data.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/data/model/DSRRequestType;", "", "<init>", "(Ljava/lang/String;I)V", "DATA_ACCESS_REQUEST", "DATA_ERASURE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DSRRequestType {
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType DATA_ACCESS_REQUEST;
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType DATA_ERASURE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private DSRRequestType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType dSRRequestType = new com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType("DATA_ACCESS_REQUEST", 0);
        DATA_ACCESS_REQUEST = dSRRequestType;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType dSRRequestType2 = new com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType("DATA_ERASURE", 1);
        DATA_ERASURE = dSRRequestType2;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType[] dSRRequestTypeArr = {dSRRequestType, dSRRequestType2};
        Camera2StreamConfigurationMap = dSRRequestTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(dSRRequestTypeArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType[] values() {
        return (com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.data.model.DSRRequestType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
