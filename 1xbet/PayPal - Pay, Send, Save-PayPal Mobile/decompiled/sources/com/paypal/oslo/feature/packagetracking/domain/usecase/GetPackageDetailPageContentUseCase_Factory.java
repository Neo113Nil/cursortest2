package com.paypal.oslo.feature.packagetracking.domain.usecase;

/* loaded from: classes13.dex */
public final class GetPackageDetailPageContentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetMerchantHeaderTitleUseCase> getHighSpeedVideoSizes;

    private GetPackageDetailPageContentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetMerchantHeaderTitleUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.usecase.GetMerchantHeaderTitleUseCase> provider2) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase newInstance(com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository, com.paypal.oslo.feature.packagetracking.domain.usecase.GetMerchantHeaderTitleUseCase getMerchantHeaderTitleUseCase) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase(packageRepository, getMerchantHeaderTitleUseCase);
    }
}
