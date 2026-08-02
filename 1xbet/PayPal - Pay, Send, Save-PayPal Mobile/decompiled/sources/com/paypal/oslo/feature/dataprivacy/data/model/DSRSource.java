package com.paypal.oslo.feature.dataprivacy.data.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/data/model/DSRSource;", "", "<init>", "(Ljava/lang/String;I)V", "SELF_SERVICE", "SS_LOGGED_OUT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DSRSource {
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRSource SELF_SERVICE;
    public static final com.paypal.oslo.feature.dataprivacy.data.model.DSRSource SS_LOGGED_OUT;
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.model.DSRSource[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DSRSource(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.data.model.DSRSource dSRSource = new com.paypal.oslo.feature.dataprivacy.data.model.DSRSource("SELF_SERVICE", 0);
        SELF_SERVICE = dSRSource;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRSource dSRSource2 = new com.paypal.oslo.feature.dataprivacy.data.model.DSRSource("SS_LOGGED_OUT", 1);
        SS_LOGGED_OUT = dSRSource2;
        com.paypal.oslo.feature.dataprivacy.data.model.DSRSource[] dSRSourceArr = {dSRSource, dSRSource2};
        getHighResolutionOutputSizeshNQ4ISI = dSRSourceArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(dSRSourceArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.data.model.DSRSource[] values() {
        return (com.paypal.oslo.feature.dataprivacy.data.model.DSRSource[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.data.model.DSRSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.data.model.DSRSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.data.model.DSRSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.data.model.DSRSource> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
