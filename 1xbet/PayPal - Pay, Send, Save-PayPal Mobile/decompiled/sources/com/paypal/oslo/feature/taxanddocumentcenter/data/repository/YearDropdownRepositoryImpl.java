package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/YearDropdownRepositoryImpl;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/YearDropdownRepository;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "countryConfig", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/YearDropdownData;", "getYearDropdownData", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/YearDropdownData;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class YearDropdownRepositoryImpl implements com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.YearDropdownRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig getHighSpeedVideoSizes;

    @javax.inject.Inject
    public YearDropdownRepositoryImpl(com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryConfig, "");
        this.getHighSpeedVideoSizes = countryConfig;
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.YearDropdownRepository
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.YearDropdownData getYearDropdownData() {
        int currentFinancialYear = com.paypal.oslo.feature.taxanddocumentcenter.domain.util.FiscalYearUtils.INSTANCE.getCurrentFinancialYear(this.getHighSpeedVideoSizes);
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.YearDropdownData(0, com.paypal.oslo.feature.taxanddocumentcenter.domain.util.FiscalYearUtils.INSTANCE.generateYearList(com.paypal.oslo.feature.taxanddocumentcenter.domain.util.FiscalYearUtils.INSTANCE.parseBaseYear(this.getHighSpeedVideoSizes.getBaseYear()), currentFinancialYear, this.getHighSpeedVideoSizes));
    }
}
