package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class NameLayoutUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameUtil> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.NameRepository> getHighSpeedVideoFpsRangesFor;

    private NameLayoutUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.NameRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameUtil> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.NameRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameUtil> provider2) {
        return new com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.NameRepository nameRepository, com.paypal.oslo.core.i18n.domain.util.NameUtil nameUtil) {
        return new com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase(nameRepository, nameUtil);
    }
}
