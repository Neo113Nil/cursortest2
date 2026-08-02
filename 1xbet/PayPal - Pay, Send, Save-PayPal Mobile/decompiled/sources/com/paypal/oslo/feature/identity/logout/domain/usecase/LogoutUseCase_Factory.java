package com.paypal.oslo.feature.identity.logout.domain.usecase;

/* loaded from: classes12.dex */
public final class LogoutUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.logout.domain.repository.LogoutRepository> getHighSpeedVideoSizes;

    private LogoutUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.logout.domain.repository.LogoutRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.logout.domain.repository.LogoutRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter> provider2) {
        return new com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase newInstance(com.paypal.oslo.feature.identity.logout.domain.repository.LogoutRepository logoutRepository, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter deviceRegistrationWriter) {
        return new com.paypal.oslo.feature.identity.logout.domain.usecase.LogoutUseCase(logoutRepository, deviceRegistrationWriter);
    }
}
