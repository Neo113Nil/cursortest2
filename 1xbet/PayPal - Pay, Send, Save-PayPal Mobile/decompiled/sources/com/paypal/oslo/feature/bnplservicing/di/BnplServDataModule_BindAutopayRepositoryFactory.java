package com.paypal.oslo.feature.bnplservicing.di;

/* loaded from: classes11.dex */
public final class BnplServDataModule_BindAutopayRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private BnplServDataModule_BindAutopayRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository get() {
        return bindAutopayRepository(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindAutopayRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindAutopayRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository bindAutopayRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository mockAutopayRepository, com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl autopayRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule.INSTANCE.bindAutopayRepository(featureGate, mockAutopayRepository, autopayRepositoryImpl));
    }
}
