package com.paypal.oslo.core.i18n.domain.implementation;

/* loaded from: classes10.dex */
public final class PhoneNumberHandlerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.implementation.PhoneNumberHandlerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> getHighSpeedVideoSizes;

    private PhoneNumberHandlerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.implementation.PhoneNumberHandlerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.domain.implementation.PhoneNumberHandlerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> provider2) {
        return new com.paypal.oslo.core.i18n.domain.implementation.PhoneNumberHandlerImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.implementation.PhoneNumberHandlerImpl newInstance(com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase getCallingCodeUseCase) {
        return new com.paypal.oslo.core.i18n.domain.implementation.PhoneNumberHandlerImpl(phoneNumberParseUseCase, getCallingCodeUseCase);
    }
}
