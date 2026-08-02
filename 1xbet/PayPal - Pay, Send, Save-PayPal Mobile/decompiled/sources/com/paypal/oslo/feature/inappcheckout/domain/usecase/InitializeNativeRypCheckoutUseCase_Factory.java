package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class InitializeNativeRypCheckoutUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase> getHighSpeedVideoFpsRangesFor;

    private InitializeNativeRypCheckoutUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository initializeNativeRypCheckoutRepository, com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase formatSmartAuthAmountUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase(initializeNativeRypCheckoutRepository, formatSmartAuthAmountUseCase);
    }
}
