package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class AddPhoneUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> getHighSpeedVideoFpsRangesFor;

    private AddPhoneUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository phoneRepository) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase(phoneRepository);
    }
}
