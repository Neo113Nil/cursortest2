package com.paypal.oslo.feature.publicprofile.domain.usecase;

/* loaded from: classes13.dex */
public final class GetPublicProfileUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetPublicProfileUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> provider) {
        return new com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase newInstance(com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository publicProfileRepository) {
        return new com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase(publicProfileRepository);
    }
}
