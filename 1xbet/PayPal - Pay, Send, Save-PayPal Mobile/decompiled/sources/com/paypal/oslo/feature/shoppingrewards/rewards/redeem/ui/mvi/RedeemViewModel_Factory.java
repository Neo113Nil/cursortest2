package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

/* loaded from: classes15.dex */
public final class RedeemViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper> getInputSizeshNQ4ISI;

    private RedeemViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper> provider6) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getInputSizeshNQ4ISI = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getInputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper> provider6) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase getRedeemConversionRateUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase getCharitiesUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase redeemPointsToBalanceUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase redeemPointsToSavingsUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase redeemPointsToDonationUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper redeemUiDataMapper) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel(getRedeemConversionRateUseCase, getCharitiesUseCase, redeemPointsToBalanceUseCase, redeemPointsToSavingsUseCase, redeemPointsToDonationUseCase, redeemUiDataMapper);
    }
}
