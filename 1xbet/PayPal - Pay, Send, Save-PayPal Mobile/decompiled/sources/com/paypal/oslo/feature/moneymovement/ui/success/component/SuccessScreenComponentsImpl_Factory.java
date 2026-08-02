package com.paypal.oslo.feature.moneymovement.ui.success.component;

/* loaded from: classes13.dex */
public final class SuccessScreenComponentsImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private SuccessScreenComponentsImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase> provider) {
        return new com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase formatRelativeTimeUseCase) {
        return new com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl(formatRelativeTimeUseCase);
    }
}
