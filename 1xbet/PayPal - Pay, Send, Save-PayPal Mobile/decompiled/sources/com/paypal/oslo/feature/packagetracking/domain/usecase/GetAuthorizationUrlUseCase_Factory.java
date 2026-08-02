package com.paypal.oslo.feature.packagetracking.domain.usecase;

/* loaded from: classes13.dex */
public final class GetAuthorizationUrlUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> Camera2StreamConfigurationMap;

    private GetAuthorizationUrlUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> provider) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase newInstance(com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase(packageRepository);
    }
}
