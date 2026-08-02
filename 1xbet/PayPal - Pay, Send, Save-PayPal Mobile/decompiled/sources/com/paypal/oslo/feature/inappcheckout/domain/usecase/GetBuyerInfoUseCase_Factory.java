package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class GetBuyerInfoUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetBuyerInfoUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.BuyerInfoApiRepository> Camera2StreamConfigurationMap;

    private GetBuyerInfoUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.BuyerInfoApiRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetBuyerInfoUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.GetBuyerInfoUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.BuyerInfoApiRepository> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetBuyerInfoUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.GetBuyerInfoUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.BuyerInfoApiRepository buyerInfoApiRepository) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetBuyerInfoUseCase(buyerInfoApiRepository);
    }
}
