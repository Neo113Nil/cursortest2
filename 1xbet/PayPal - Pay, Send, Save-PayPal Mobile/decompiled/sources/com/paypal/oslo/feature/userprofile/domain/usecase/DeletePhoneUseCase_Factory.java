package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class DeletePhoneUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.DeletePhoneUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> getHighSpeedVideoFpsRanges;

    private DeletePhoneUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.DeletePhoneUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.DeletePhoneUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.DeletePhoneUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.DeletePhoneUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository phoneRepository) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.DeletePhoneUseCase(phoneRepository);
    }
}
