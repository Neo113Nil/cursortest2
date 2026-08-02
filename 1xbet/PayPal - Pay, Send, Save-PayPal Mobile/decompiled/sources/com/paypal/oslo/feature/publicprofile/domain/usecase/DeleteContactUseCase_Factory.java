package com.paypal.oslo.feature.publicprofile.domain.usecase;

/* loaded from: classes13.dex */
public final class DeleteContactUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> getHighResolutionOutputSizeshNQ4ISI;

    private DeleteContactUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> provider) {
        return new com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase newInstance(com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository publicProfileRepository) {
        return new com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase(publicProfileRepository);
    }
}
