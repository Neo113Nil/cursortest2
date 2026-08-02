package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class ValidatePhoneNumberUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase_Factory create() {
        return com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase newInstance() {
        return new com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
