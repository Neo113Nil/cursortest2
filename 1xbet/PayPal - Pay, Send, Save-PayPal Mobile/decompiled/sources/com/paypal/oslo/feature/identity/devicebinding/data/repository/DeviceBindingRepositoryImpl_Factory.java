package com.paypal.oslo.feature.identity.devicebinding.data.repository;

/* loaded from: classes12.dex */
public final class DeviceBindingRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository> getOutputMinFrameDuration;

    private DeviceBindingRepositoryImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository> provider7, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider> provider8) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getInputSizeshNQ4ISI = provider4;
        this.getInputFormats = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
        this.getOutputMinFrameDuration = provider7;
        this.getHighSpeedVideoFpsRangesFor = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getInputSizeshNQ4ISI.get(), this.getInputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository> provider7, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider> provider8) {
        return new com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl newInstance(android.content.Context context, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper biometricKeyWrapper, com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper nonBiometricKeyWrapper, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository biometricBindEligibilityRepository, com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository lLSBindEligibilityRepository, com.paypal.oslo.feature.identity.login.domain.BindSchemeProvider bindSchemeProvider) {
        return new com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingRepositoryImpl(context, apolloClient, biometricKeyWrapper, nonBiometricKeyWrapper, deviceBindingTokenStorage, biometricBindEligibilityRepository, lLSBindEligibilityRepository, bindSchemeProvider);
    }
}
