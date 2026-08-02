package com.paypal.oslo.feature.identity.stepup.domain.usecase;

/* loaded from: classes13.dex */
public final class ProcessStepupUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase_Factory create() {
        return com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase newInstance() {
        return new com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
