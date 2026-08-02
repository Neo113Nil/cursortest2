package com.paypal.oslo.feature.identity.stepup.ui;

/* loaded from: classes13.dex */
public final class StepupViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.ui.StepupReducer> getHighSpeedVideoFpsRangesFor;

    private StepupViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.ui.StepupReducer> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.stepup.ui.StepupReducer> provider3) {
        return new com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel newInstance(com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase processStepupUseCase, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider, com.paypal.oslo.feature.identity.stepup.ui.StepupReducer stepupReducer) {
        return new com.paypal.oslo.feature.identity.stepup.ui.StepupViewModel(processStepupUseCase, stringProvider, stepupReducer);
    }
}
