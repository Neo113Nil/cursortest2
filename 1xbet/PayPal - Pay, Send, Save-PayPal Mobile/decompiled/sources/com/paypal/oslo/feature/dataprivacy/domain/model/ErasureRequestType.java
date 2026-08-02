package com.paypal.oslo.feature.dataprivacy.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequestType;", "", "<init>", "(Ljava/lang/String;I)V", "DATA_ACCESS_REQUEST", "DATA_ERASURE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErasureRequestType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType DATA_ACCESS_REQUEST;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType DATA_ERASURE;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType[] getHighSpeedVideoFpsRangesFor;

    private ErasureRequestType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType erasureRequestType = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType("DATA_ACCESS_REQUEST", 0);
        DATA_ACCESS_REQUEST = erasureRequestType;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType erasureRequestType2 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType("DATA_ERASURE", 1);
        DATA_ERASURE = erasureRequestType2;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType erasureRequestType3 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType("UNKNOWN", 2);
        UNKNOWN = erasureRequestType3;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType[] erasureRequestTypeArr = {erasureRequestType, erasureRequestType2, erasureRequestType3};
        getHighSpeedVideoFpsRangesFor = erasureRequestTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(erasureRequestTypeArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType[] values() {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
