package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class FormatAsTypedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase_Factory create() {
        return com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase newInstance() {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
