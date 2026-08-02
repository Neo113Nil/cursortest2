package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase;

/* loaded from: classes12.dex */
public final class GetWalletStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase_Factory create() {
        return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase newInstance() {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
