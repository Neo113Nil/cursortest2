package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class MaskPhoneNumberUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase_Factory create() {
        return com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase newInstance() {
        return new com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
