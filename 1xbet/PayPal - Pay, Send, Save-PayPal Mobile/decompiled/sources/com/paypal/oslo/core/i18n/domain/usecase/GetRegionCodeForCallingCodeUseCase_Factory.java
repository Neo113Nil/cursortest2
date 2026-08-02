package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class GetRegionCodeForCallingCodeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase_Factory create() {
        return com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase newInstance() {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
