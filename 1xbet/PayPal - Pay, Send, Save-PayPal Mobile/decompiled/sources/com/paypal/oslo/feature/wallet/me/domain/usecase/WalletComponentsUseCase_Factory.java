package com.paypal.oslo.feature.wallet.me.domain.usecase;

/* loaded from: classes16.dex */
public final class WalletComponentsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.me.domain.repository.WalletComponentsRepository> getHighSpeedVideoSizes;

    private WalletComponentsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.me.domain.repository.WalletComponentsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.me.domain.repository.WalletComponentsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase newInstance(com.paypal.oslo.feature.wallet.me.domain.repository.WalletComponentsRepository walletComponentsRepository, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase(walletComponentsRepository, walletFeatureManager, coroutineDispatcher);
    }
}
