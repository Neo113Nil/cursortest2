package com.paypal.oslo.feature.taxanddocumentcenter.di.module;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/di/module/TaxReportModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/TaxDocumentsConfig;", "impl", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "bindCountryConfig", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/config/TaxDocumentsConfig;)Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/YearDropdownRepositoryImpl;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/YearDropdownRepository;", "bindYearDropdownRepository", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/data/repository/YearDropdownRepositoryImpl;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/repository/YearDropdownRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public abstract class TaxReportModule {
    public static final int $stable = 0;

    @dagger.Binds
    public abstract com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig bindCountryConfig(com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig impl);

    @dagger.Binds
    public abstract com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.YearDropdownRepository bindYearDropdownRepository(com.paypal.oslo.feature.taxanddocumentcenter.data.repository.YearDropdownRepositoryImpl impl);
}
