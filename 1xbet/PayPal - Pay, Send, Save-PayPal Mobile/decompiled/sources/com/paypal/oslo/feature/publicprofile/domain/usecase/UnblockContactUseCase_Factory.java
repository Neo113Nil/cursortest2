package com.paypal.oslo.feature.publicprofile.domain.usecase;

/* loaded from: classes13.dex */
public final class UnblockContactUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> getHighSpeedVideoFpsRangesFor;

    private UnblockContactUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository> provider) {
        return new com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase newInstance(com.paypal.oslo.feature.publicprofile.domain.repository.PublicProfileRepository publicProfileRepository) {
        return new com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase(publicProfileRepository);
    }
}
