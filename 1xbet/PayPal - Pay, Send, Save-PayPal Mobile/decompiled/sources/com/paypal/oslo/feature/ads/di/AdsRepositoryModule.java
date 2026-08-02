package com.paypal.oslo.feature.ads.di;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/ads/di/AdsRepositoryModule;", "", "Lcom/paypal/oslo/feature/ads/data/repository/ol/AdProviderRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/ads/data/repository/ol/AdProviderDataSource;", "bindOrchestrationLayerRepository", "(Lcom/paypal/oslo/feature/ads/data/repository/ol/AdProviderRepositoryImpl;)Lcom/paypal/oslo/feature/ads/data/repository/ol/AdProviderDataSource;", "Lcom/paypal/oslo/feature/ads/data/repository/AdRepositoryImpl;", "Lcom/paypal/oslo/feature/ads/domain/repository/AdRepository;", "bindOsloAdRepository", "(Lcom/paypal/oslo/feature/ads/data/repository/AdRepositoryImpl;)Lcom/paypal/oslo/feature/ads/domain/repository/AdRepository;", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProviderImpl;", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProvider;", "bindUserIdentificationProvider", "(Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProviderImpl;)Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProvider;", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentifierProviderImpl;", "Lcom/paypal/oslo/feature/ads/data/user/UserIdentifierProvider;", "bindUserIdentifierProvider", "(Lcom/paypal/oslo/feature/ads/data/user/UserIdentifierProviderImpl;)Lcom/paypal/oslo/feature/ads/data/user/UserIdentifierProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public interface AdsRepositoryModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.ads.data.repository.ol.AdProviderDataSource bindOrchestrationLayerRepository(com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.ads.domain.repository.AdRepository bindOsloAdRepository(com.paypal.oslo.feature.ads.data.repository.AdRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider bindUserIdentificationProvider(com.paypal.oslo.feature.ads.data.user.UserIdentificationProviderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.ads.data.user.UserIdentifierProvider bindUserIdentifierProvider(com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl impl);
}
