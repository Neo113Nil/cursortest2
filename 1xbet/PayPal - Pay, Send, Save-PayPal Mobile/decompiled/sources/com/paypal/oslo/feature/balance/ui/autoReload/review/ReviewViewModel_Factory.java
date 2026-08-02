package com.paypal.oslo.feature.balance.ui.autoReload.review;

/* loaded from: classes11.dex */
public final class ReviewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase> getOutputMinFrameDuration;

    private ReviewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> provider8) {
        this.getHighSpeedVideoSizesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getInputSizeshNQ4ISI = provider5;
        this.getOutputMinFrameDuration = provider6;
        this.getHighSpeedVideoFpsRanges = provider7;
        this.getHighSpeedVideoFpsRangesFor = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel get() {
        return newInstance(this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> provider8) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel newInstance(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase getAutoReloadFundingInstrumentUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase createAutoReloadUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase updateAutoReloadUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase getBalanceIdUseCase, com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase, com.paypal.oslo.feature.balance.manager.BalanceFeatureManager balanceFeatureManager) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel(localeInformation, dateTimeFormatUseCase, getAutoReloadFundingInstrumentUseCase, createAutoReloadUseCase, updateAutoReloadUseCase, getBalanceIdUseCase, getAccountTypeUseCase, balanceFeatureManager);
    }
}
