package com.paypal.oslo.feature.dataprivacy.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARSource;", "", "<init>", "(Ljava/lang/String;I)V", "SELF_SERVICE", "CUSTOMER_SERVICE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DARSource {
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARSource CUSTOMER_SERVICE;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARSource SELF_SERVICE;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARSource UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.DARSource[] getHighSpeedVideoSizes;

    private DARSource(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.domain.model.DARSource dARSource = new com.paypal.oslo.feature.dataprivacy.domain.model.DARSource("SELF_SERVICE", 0);
        SELF_SERVICE = dARSource;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARSource dARSource2 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARSource("CUSTOMER_SERVICE", 1);
        CUSTOMER_SERVICE = dARSource2;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARSource dARSource3 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARSource("UNKNOWN", 2);
        UNKNOWN = dARSource3;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARSource[] dARSourceArr = {dARSource, dARSource2, dARSource3};
        getHighSpeedVideoSizes = dARSourceArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(dARSourceArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.DARSource[] values() {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.DARSource[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.DARSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.DARSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.domain.model.DARSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.domain.model.DARSource> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
