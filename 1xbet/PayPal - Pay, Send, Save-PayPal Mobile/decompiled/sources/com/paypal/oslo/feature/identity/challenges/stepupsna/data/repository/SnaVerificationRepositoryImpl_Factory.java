package com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository;

/* loaded from: classes12.dex */
public final class SnaVerificationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private SnaVerificationRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl newInstance(com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager cellularNetworkManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsna.data.repository.SnaVerificationRepositoryImpl(cellularNetworkManager, coroutineDispatcher);
    }
}
