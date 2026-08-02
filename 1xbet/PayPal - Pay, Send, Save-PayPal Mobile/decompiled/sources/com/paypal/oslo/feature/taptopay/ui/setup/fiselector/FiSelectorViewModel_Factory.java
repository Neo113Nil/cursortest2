package com.paypal.oslo.feature.taptopay.ui.setup.fiselector;

/* loaded from: classes15.dex */
public final class FiSelectorViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase> getOutputMinFrameDuration;

    private FiSelectorViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getOutputMinFrameDuration = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.Camera2StreamConfigurationMap = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase payPalGetCardEligibilityUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase generateRiskDataUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase stepUpUriChallengeUseCase, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorMapper fiSelectorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel(payPalGetAllCardsUseCase, payPalGetCardEligibilityUseCase, generateRiskDataUseCase, stepUpUriChallengeUseCase, fiSelectorMapper, coroutineDispatcher);
    }
}
