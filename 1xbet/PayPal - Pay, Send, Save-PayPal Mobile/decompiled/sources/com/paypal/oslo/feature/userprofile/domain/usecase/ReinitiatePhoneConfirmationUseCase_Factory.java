package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class ReinitiatePhoneConfirmationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> getHighSpeedVideoFpsRangesFor;

    private ReinitiatePhoneConfirmationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository phoneRepository) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase(phoneRepository);
    }
}
