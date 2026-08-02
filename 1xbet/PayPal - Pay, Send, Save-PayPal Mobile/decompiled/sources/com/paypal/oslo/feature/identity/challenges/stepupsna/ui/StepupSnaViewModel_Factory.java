package com.paypal.oslo.feature.identity.challenges.stepupsna.ui;

/* loaded from: classes12.dex */
public final class StepupSnaViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase> getHighSpeedVideoSizes;

    private StepupSnaViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer> provider2) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel newInstance(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase verifySnaUseCase, com.paypal.oslo.feature.identity.challenges.stepupsna.ui.mvi.StepupSnaReducer stepupSnaReducer) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsna.ui.StepupSnaViewModel(verifySnaUseCase, stepupSnaReducer);
    }
}
