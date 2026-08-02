package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/UseCaseModule;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/sdk/InitializeTapToPaySdkUseCaseImpl;", "impl", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/sdk/InitializeTapToPaySdkUseCase;", "bindInitializeTapToPaySdkUseCase", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/sdk/InitializeTapToPaySdkUseCaseImpl;)Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/sdk/InitializeTapToPaySdkUseCase;", "Lcom/paypal/oslo/feature/taptopay/data/sdk/CompositeSdkInitializer;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;", "bindSdkInitializer", "(Lcom/paypal/oslo/feature/taptopay/data/sdk/CompositeSdkInitializer;)Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;", "Lcom/paypal/oslo/feature/taptopay/data/payair/init/PayairInitializer;", "bindPayairSdkInitializer", "(Lcom/paypal/oslo/feature/taptopay/data/payair/init/PayairInitializer;)Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;", "Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesInitializerAdapter;", "bindThalesSdkInitializer", "(Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesInitializerAdapter;)Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface UseCaseModule {
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.api.domain.usecase.sdk.InitializeTapToPaySdkUseCase bindInitializeTapToPaySdkUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.sdk.InitializeTapToPaySdkUseCaseImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer bindPayairSdkInitializer(com.paypal.oslo.feature.taptopay.data.payair.init.PayairInitializer impl);

    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer bindSdkInitializer(com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer bindThalesSdkInitializer(com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter impl);
}
