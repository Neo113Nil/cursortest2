package com.paypal.oslo.feature.wallet.banks.connectsdk.di;

/* loaded from: classes15.dex */
public final class MastercardConnectModule_ProvideMastercardConnectRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository.MastercardConnectRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler> getHighSpeedVideoFpsRanges;

    private MastercardConnectModule_ProvideMastercardConnectRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository.MastercardConnectRepository get() {
        return provideMastercardConnectRepository(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.connectsdk.di.MastercardConnectModule_ProvideMastercardConnectRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler> provider) {
        return new com.paypal.oslo.feature.wallet.banks.connectsdk.di.MastercardConnectModule_ProvideMastercardConnectRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository.MastercardConnectRepository provideMastercardConnectRepository(com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler mastercardConnectEventHandler) {
        return (com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository.MastercardConnectRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.wallet.banks.connectsdk.di.MastercardConnectModule.INSTANCE.provideMastercardConnectRepository(mastercardConnectEventHandler));
    }
}
