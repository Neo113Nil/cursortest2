package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi;

/* loaded from: classes12.dex */
public final class StepupOtpReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider> getHighResolutionOutputSizeshNQ4ISI;

    private StepupOtpReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider> provider) {
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer newInstance(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider stepupOtpContentProvider) {
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer(stepupOtpContentProvider);
    }
}
