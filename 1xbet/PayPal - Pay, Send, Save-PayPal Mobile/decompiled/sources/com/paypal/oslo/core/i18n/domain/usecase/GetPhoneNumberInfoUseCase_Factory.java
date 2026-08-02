package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class GetPhoneNumberInfoUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.GetPhoneNumberInfoUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase> Camera2StreamConfigurationMap;

    private GetPhoneNumberInfoUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.GetPhoneNumberInfoUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetPhoneNumberInfoUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase> provider) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetPhoneNumberInfoUseCase_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetPhoneNumberInfoUseCase newInstance(com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase validatePhoneNumberUseCase) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetPhoneNumberInfoUseCase(validatePhoneNumberUseCase);
    }
}
