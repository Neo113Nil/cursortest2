package com.paypal.oslo.feature.packagetracking.domain.usecase;

/* loaded from: classes13.dex */
public final class RemovePackageUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.usecase.RemovePackageUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> getHighSpeedVideoFpsRangesFor;

    private RemovePackageUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.usecase.RemovePackageUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.RemovePackageUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> provider) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.RemovePackageUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.RemovePackageUseCase newInstance(com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.RemovePackageUseCase(packageRepository);
    }
}
