package com.paypal.oslo.core.i18n.domain.strategy;

/* loaded from: classes10.dex */
public final class BestFitFormattingStrategy_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.strategy.BestFitFormattingStrategy> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter> getHighResolutionOutputSizeshNQ4ISI;

    private BestFitFormattingStrategy_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.strategy.BestFitFormattingStrategy get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.domain.strategy.BestFitFormattingStrategy_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter> provider) {
        return new com.paypal.oslo.core.i18n.domain.strategy.BestFitFormattingStrategy_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.strategy.BestFitFormattingStrategy newInstance(com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter relativeTimeFormatter) {
        return new com.paypal.oslo.core.i18n.domain.strategy.BestFitFormattingStrategy(relativeTimeFormatter);
    }
}
