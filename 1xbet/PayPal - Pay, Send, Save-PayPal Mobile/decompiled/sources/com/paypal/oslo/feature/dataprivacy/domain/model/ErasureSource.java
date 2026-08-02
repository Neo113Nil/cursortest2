package com.paypal.oslo.feature.dataprivacy.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureSource;", "", "<init>", "(Ljava/lang/String;I)V", "SELF_SERVICE", "CUSTOMER_SERVICE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErasureSource {
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource CUSTOMER_SERVICE;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource SELF_SERVICE;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource[] getHighSpeedVideoSizes;

    private ErasureSource(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource erasureSource = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource("SELF_SERVICE", 0);
        SELF_SERVICE = erasureSource;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource erasureSource2 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource("CUSTOMER_SERVICE", 1);
        CUSTOMER_SERVICE = erasureSource2;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource erasureSource3 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource("UNKNOWN", 2);
        UNKNOWN = erasureSource3;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource[] erasureSourceArr = {erasureSource, erasureSource2, erasureSource3};
        getHighSpeedVideoSizes = erasureSourceArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(erasureSourceArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource[] values() {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
