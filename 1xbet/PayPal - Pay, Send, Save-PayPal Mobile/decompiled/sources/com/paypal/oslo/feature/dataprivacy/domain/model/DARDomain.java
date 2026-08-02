package com.paypal.oslo.feature.dataprivacy.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARDomain;", "", "<init>", "(Ljava/lang/String;I)V", "PAYPAL", "HONEY", "XOOM", "ZETTLE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DARDomain {
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain HONEY;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain PAYPAL;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain UNKNOWN;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain XOOM;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain ZETTLE;
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private DARDomain(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain dARDomain = new com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain("PAYPAL", 0);
        PAYPAL = dARDomain;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain dARDomain2 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain("HONEY", 1);
        HONEY = dARDomain2;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain dARDomain3 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain("XOOM", 2);
        XOOM = dARDomain3;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain dARDomain4 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain("ZETTLE", 3);
        ZETTLE = dARDomain4;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain dARDomain5 = new com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain("UNKNOWN", 4);
        UNKNOWN = dARDomain5;
        com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain[] dARDomainArr = {dARDomain, dARDomain2, dARDomain3, dARDomain4, dARDomain5};
        getHighResolutionOutputSizeshNQ4ISI = dARDomainArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(dARDomainArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain[] values() {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.domain.model.DARDomain> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
