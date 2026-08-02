package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models;

/* loaded from: classes15.dex */
public final class RedeemUiDataMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighSpeedVideoFpsRangesFor;

    private RedeemUiDataMapper_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper(formatCurrencyUseCase, localeInformation);
    }
}
