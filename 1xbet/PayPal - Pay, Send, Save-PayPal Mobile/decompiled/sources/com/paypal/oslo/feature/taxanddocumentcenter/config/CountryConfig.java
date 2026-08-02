package com.paypal.oslo.feature.taxanddocumentcenter.config;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "", "", "isCountryEligible", "()Z", "", "getBaseYear", "()Ljava/lang/String;", "baseYear", "", "getFinancialYearEndingMonth", "()I", "financialYearEndingMonth", "getFinancialYearEndingDate", "financialYearEndingDate", "", "getSectionWiseAvailabilityDate", "()Ljava/util/Map;", "sectionWiseAvailabilityDate", "", "getTaxDocumentSectionOrder", "()Ljava/util/List;", "taxDocumentSectionOrder", "isYearInReview", "getIneligibilityCutoffBuffer", "ineligibilityCutoffBuffer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CountryConfig {
    java.lang.String getBaseYear();

    int getFinancialYearEndingDate();

    int getFinancialYearEndingMonth();

    default int getIneligibilityCutoffBuffer() {
        return 30;
    }

    java.util.Map<java.lang.String, java.lang.String> getSectionWiseAvailabilityDate();

    java.util.List<java.lang.String> getTaxDocumentSectionOrder();

    boolean isCountryEligible();

    boolean isYearInReview();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static int getIneligibilityCutoffBuffer(com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
            return com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig.super.getIneligibilityCutoffBuffer();
        }
    }
}
