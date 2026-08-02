package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportModeDomain;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "CORRECTION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportModeDomain {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain CORRECTION;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain INITIAL;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain[] getHighSpeedVideoFpsRangesFor;

    private TaxReportModeDomain(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain taxReportModeDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain("INITIAL", 0);
        INITIAL = taxReportModeDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain taxReportModeDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain("CORRECTION", 1);
        CORRECTION = taxReportModeDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain[] taxReportModeDomainArr = {taxReportModeDomain, taxReportModeDomain2};
        getHighSpeedVideoFpsRangesFor = taxReportModeDomainArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(taxReportModeDomainArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
