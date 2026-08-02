package com.paypal.oslo.feature.controlcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class FormatUserDisplayNameUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private FormatUserDisplayNameUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> provider) {
        return new com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase newInstance(com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase nameFormatUseCase) {
        return new com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase(nameFormatUseCase);
    }
}
