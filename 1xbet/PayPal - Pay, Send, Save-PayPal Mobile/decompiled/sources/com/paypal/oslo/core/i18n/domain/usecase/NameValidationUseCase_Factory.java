package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class NameValidationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.NameRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameUtil> getHighSpeedVideoSizes;

    private NameValidationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.NameRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameUtil> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.NameRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameUtil> provider2) {
        return new com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.NameRepository nameRepository, com.paypal.oslo.core.i18n.domain.util.NameUtil nameUtil) {
        return new com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase(nameRepository, nameUtil);
    }
}
