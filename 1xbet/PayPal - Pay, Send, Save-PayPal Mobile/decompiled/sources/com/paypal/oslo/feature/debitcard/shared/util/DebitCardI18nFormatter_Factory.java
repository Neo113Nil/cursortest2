package com.paypal.oslo.feature.debitcard.shared.util;

/* loaded from: classes12.dex */
public final class DebitCardI18nFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighSpeedVideoSizes;

    private DebitCardI18nFormatter_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2) {
        return new com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter newInstance(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        return new com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter(localeInformation, formatCurrencyUseCase);
    }
}
