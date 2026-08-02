package com.paypal.oslo.feature.packagetracking.domain.usecase;

/* loaded from: classes13.dex */
public final class DeleteImportedDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.usecase.DeleteImportedDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> getHighResolutionOutputSizeshNQ4ISI;

    private DeleteImportedDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.usecase.DeleteImportedDataUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.DeleteImportedDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> provider) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.DeleteImportedDataUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.DeleteImportedDataUseCase newInstance(com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.DeleteImportedDataUseCase(packageRepository);
    }
}
