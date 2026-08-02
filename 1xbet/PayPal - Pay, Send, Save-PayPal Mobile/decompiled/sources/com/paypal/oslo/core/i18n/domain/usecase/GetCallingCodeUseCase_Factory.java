package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class GetCallingCodeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.PhoneRepository> getHighSpeedVideoFpsRangesFor;

    private GetCallingCodeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.PhoneRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.PhoneRepository> provider) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.PhoneRepository phoneRepository) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase(phoneRepository);
    }
}
