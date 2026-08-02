package com.paypal.oslo.feature.publicprofile.domain.usecase;

/* loaded from: classes13.dex */
public final class BlockContactUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> getHighSpeedVideoFpsRanges;

    private BlockContactUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> provider) {
        return new com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase newInstance(com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository publicProfileRepository) {
        return new com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase(publicProfileRepository);
    }
}
