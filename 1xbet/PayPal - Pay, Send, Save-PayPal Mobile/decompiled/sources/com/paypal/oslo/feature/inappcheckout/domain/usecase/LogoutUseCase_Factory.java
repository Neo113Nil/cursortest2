package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class LogoutUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> getHighSpeedVideoSizes;

    private LogoutUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase newInstance(com.paypal.oslo.feature.identity.api.IdentitySession identitySession, com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider inAppCheckoutStringsProvider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase(identitySession, inAppCheckoutStringsProvider);
    }
}
