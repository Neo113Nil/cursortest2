package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class DOBValidationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase_Factory create() {
        return com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase newInstance() {
        return new com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
