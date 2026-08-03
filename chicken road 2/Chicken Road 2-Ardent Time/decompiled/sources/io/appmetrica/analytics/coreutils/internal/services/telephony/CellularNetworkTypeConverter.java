package io.appmetrica.analytics.coreutils.internal.services.telephony;

/* loaded from: classes.dex */
public final class CellularNetworkTypeConverter {
    public static final io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeConverter INSTANCE = new io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeConverter();

    /* renamed from: a, reason: collision with root package name */
    private static final android.util.SparseArray f3790a;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        sparseArray.put(0, io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
        sparseArray.put(7, "1xRTT");
        sparseArray.put(4, "CDMA");
        sparseArray.put(2, "EDGE");
        sparseArray.put(14, "eHRPD");
        sparseArray.put(5, "EVDO rev.0");
        sparseArray.put(6, "EVDO rev.A");
        sparseArray.put(1, "GPRS");
        sparseArray.put(8, "HSDPA");
        sparseArray.put(10, "HSPA");
        sparseArray.put(15, "HSPA+");
        sparseArray.put(9, "HSUPA");
        sparseArray.put(11, "iDen");
        sparseArray.put(3, "UMTS");
        sparseArray.put(13, "LTE");
        sparseArray.put(16, "GSM");
        sparseArray.put(17, "TD_SCDMA");
        sparseArray.put(18, "IWLAN");
        if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(29)) {
            sparseArray.put(20, "NR");
        }
        f3790a = sparseArray;
    }

    private CellularNetworkTypeConverter() {
    }

    public static final java.lang.String convert(java.lang.Integer num) {
        java.lang.String str;
        return (num == null || (str = (java.lang.String) f3790a.get(num.intValue())) == null) ? io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE : str;
    }
}
