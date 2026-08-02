package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

/* loaded from: classes12.dex */
public final class IsInContextTapToPayEligibleUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.IsTapToPayEnabled> getHighResolutionOutputSizeshNQ4ISI;

    private IsInContextTapToPayEligibleUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.IsTapToPayEnabled> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.IsTapToPayEnabled> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase newInstance(com.paypal.oslo.feature.taptopay.api.domain.usecase.IsTapToPayEnabled isTapToPayEnabled) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase(isTapToPayEnabled);
    }
}
