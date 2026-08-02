package com.paypal.oslo.feature.dataprivacy.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureDomain;", "", "<init>", "(Ljava/lang/String;I)V", "PAYPAL", "HONEY", "XOOM", "ZETTLE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErasureDomain {
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain HONEY;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain PAYPAL;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain UNKNOWN;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain XOOM;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain ZETTLE;
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private ErasureDomain(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain erasureDomain = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain("PAYPAL", 0);
        PAYPAL = erasureDomain;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain erasureDomain2 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain("HONEY", 1);
        HONEY = erasureDomain2;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain erasureDomain3 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain("XOOM", 2);
        XOOM = erasureDomain3;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain erasureDomain4 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain("ZETTLE", 3);
        ZETTLE = erasureDomain4;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain erasureDomain5 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain("UNKNOWN", 4);
        UNKNOWN = erasureDomain5;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain[] erasureDomainArr = {erasureDomain, erasureDomain2, erasureDomain3, erasureDomain4, erasureDomain5};
        getHighResolutionOutputSizeshNQ4ISI = erasureDomainArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(erasureDomainArr);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain[] values() {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
