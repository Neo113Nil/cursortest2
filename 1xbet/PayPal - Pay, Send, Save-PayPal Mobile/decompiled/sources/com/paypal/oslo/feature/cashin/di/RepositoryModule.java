package com.paypal.oslo.feature.cashin.di;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cashin/di/RepositoryModule;", "", "Lcom/paypal/oslo/feature/cashin/data/repository/DeviceLocationRepository;", "repository", "Lcom/paypal/oslo/feature/cashin/domain/repository/LocationRepository;", "bindLocationRepository", "(Lcom/paypal/oslo/feature/cashin/data/repository/DeviceLocationRepository;)Lcom/paypal/oslo/feature/cashin/domain/repository/LocationRepository;", "Lcom/paypal/oslo/feature/cashin/data/repository/CashInRetailerRepositoryImpl;", "Lcom/paypal/oslo/feature/cashin/domain/repository/RetailerRepository;", "bindRetailerRepository", "(Lcom/paypal/oslo/feature/cashin/data/repository/CashInRetailerRepositoryImpl;)Lcom/paypal/oslo/feature/cashin/domain/repository/RetailerRepository;", "Lcom/paypal/oslo/feature/cashin/data/repository/CashInPreferencesRepositoryImpl;", "Lcom/paypal/oslo/feature/cashin/domain/repository/CashInPreferencesRepository;", "bindCashInPreferencesRepository", "(Lcom/paypal/oslo/feature/cashin/data/repository/CashInPreferencesRepositoryImpl;)Lcom/paypal/oslo/feature/cashin/domain/repository/CashInPreferencesRepository;", "Lcom/paypal/oslo/feature/cashin/data/repository/CashInActivationRepositoryImpl;", "Lcom/paypal/oslo/feature/cashin/domain/repository/ActivationRepository;", "bindActivationRepository", "(Lcom/paypal/oslo/feature/cashin/data/repository/CashInActivationRepositoryImpl;)Lcom/paypal/oslo/feature/cashin/domain/repository/ActivationRepository;", "Lcom/paypal/oslo/feature/cashin/data/repository/CashInStoresRepositoryImpl;", "Lcom/paypal/oslo/feature/cashin/domain/repository/StoresRepository;", "bindStoresRepository", "(Lcom/paypal/oslo/feature/cashin/data/repository/CashInStoresRepositoryImpl;)Lcom/paypal/oslo/feature/cashin/domain/repository/StoresRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public interface RepositoryModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.cashin.domain.repository.ActivationRepository bindActivationRepository(com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl repository);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.cashin.domain.repository.CashInPreferencesRepository bindCashInPreferencesRepository(com.paypal.oslo.feature.cashin.data.repository.CashInPreferencesRepositoryImpl repository);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.cashin.domain.repository.LocationRepository bindLocationRepository(com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository repository);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.cashin.domain.repository.RetailerRepository bindRetailerRepository(com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl repository);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.cashin.domain.repository.StoresRepository bindStoresRepository(com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl repository);
}
