package com.paypal.oslo.feature.bnplservicing.di;

/* loaded from: classes11.dex */
public final class BnplServDataModule_BindMakeAPaymentRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.MakeAPaymentRepositoryImpl> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private BnplServDataModule_BindMakeAPaymentRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.MakeAPaymentRepositoryImpl> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository get() {
        return bindMakeAPaymentRepository(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindMakeAPaymentRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.MakeAPaymentRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindMakeAPaymentRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository bindMakeAPaymentRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository mockMakeAPaymentRepository, com.paypal.oslo.feature.bnplservicing.data.repository.MakeAPaymentRepositoryImpl makeAPaymentRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule.INSTANCE.bindMakeAPaymentRepository(featureGate, mockMakeAPaymentRepository, makeAPaymentRepositoryImpl));
    }
}
