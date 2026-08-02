package com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities;

/* loaded from: classes12.dex */
public final class GetCryptoCapabilitiesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase_Factory create() {
        return com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase newInstance() {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
