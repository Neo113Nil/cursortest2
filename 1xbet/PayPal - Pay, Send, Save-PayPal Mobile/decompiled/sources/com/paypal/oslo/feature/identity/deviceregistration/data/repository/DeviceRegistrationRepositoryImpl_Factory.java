package com.paypal.oslo.feature.identity.deviceregistration.data.repository;

/* loaded from: classes12.dex */
public final class DeviceRegistrationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal> getHighSpeedVideoSizes;

    private DeviceRegistrationRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal> provider3, dagger.internal.Provider<java.lang.String> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal> provider3, dagger.internal.Provider<java.lang.String> provider4) {
        return new com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter deviceRegistrationWriter, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal deviceRegistrationSignal, javax.inject.Provider<java.lang.String> provider) {
        return new com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl(apolloClient, deviceRegistrationWriter, deviceRegistrationSignal, provider);
    }
}
