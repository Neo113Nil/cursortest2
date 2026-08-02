package com.paypal.oslo.core.i18n.domain.strategy;

/* loaded from: classes10.dex */
public final class SpecificUnitFormattingStrategy_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.strategy.SpecificUnitFormattingStrategy> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter> getHighSpeedVideoFpsRangesFor;

    private SpecificUnitFormattingStrategy_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.strategy.SpecificUnitFormattingStrategy get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.domain.strategy.SpecificUnitFormattingStrategy_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter> provider) {
        return new com.paypal.oslo.core.i18n.domain.strategy.SpecificUnitFormattingStrategy_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.strategy.SpecificUnitFormattingStrategy newInstance(com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter relativeTimeFormatter) {
        return new com.paypal.oslo.core.i18n.domain.strategy.SpecificUnitFormattingStrategy(relativeTimeFormatter);
    }
}
