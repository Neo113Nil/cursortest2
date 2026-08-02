package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class PhoneNumberParseUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.PhoneRepository> getHighSpeedVideoFpsRanges;

    private PhoneNumberParseUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.PhoneRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.PhoneRepository> provider) {
        return new com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.PhoneRepository phoneRepository) {
        return new com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase(phoneRepository);
    }
}
