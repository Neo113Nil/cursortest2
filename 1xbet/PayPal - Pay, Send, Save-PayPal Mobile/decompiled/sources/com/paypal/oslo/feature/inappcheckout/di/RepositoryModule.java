package com.paypal.oslo.feature.inappcheckout.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/di/RepositoryModule;", "", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/CheckoutUrlRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/repository/CheckoutUrlRepository;", "bindCheckoutUrlRepository", "(Lcom/paypal/oslo/feature/inappcheckout/data/repository/CheckoutUrlRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/repository/CheckoutUrlRepository;", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/SaveCheckoutExperienceRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/SaveCheckoutExperienceRepository;", "bindSaveCheckoutExperienceRepository", "(Lcom/paypal/oslo/feature/inappcheckout/data/repository/SaveCheckoutExperienceRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/SaveCheckoutExperienceRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface RepositoryModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.inappcheckout.features.webview.domain.repository.CheckoutUrlRepository bindCheckoutUrlRepository(com.paypal.oslo.feature.inappcheckout.data.repository.CheckoutUrlRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.inappcheckout.domain.repository.SaveCheckoutExperienceRepository bindSaveCheckoutExperienceRepository(com.paypal.oslo.feature.inappcheckout.data.repository.SaveCheckoutExperienceRepositoryImpl impl);
}
