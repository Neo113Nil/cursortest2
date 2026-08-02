package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models;

/* loaded from: classes15.dex */
public final class UiDataMappers_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatNumberUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoSizes;

    private UiDataMappers_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatNumberUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatNumberUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider3) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatNumberUseCase formatNumberUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers(formatNumberUseCase, formatCurrencyUseCase, localeInformation);
    }
}
