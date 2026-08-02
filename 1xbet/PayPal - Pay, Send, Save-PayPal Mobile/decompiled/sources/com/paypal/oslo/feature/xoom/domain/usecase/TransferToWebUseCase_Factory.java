package com.paypal.oslo.feature.xoom.domain.usecase;

/* loaded from: classes16.dex */
public final class TransferToWebUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> getHighResolutionOutputSizeshNQ4ISI;

    private TransferToWebUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> provider) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase newInstance(com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransfer) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase(identitySessionTransfer);
    }
}
