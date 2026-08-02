package com.paypal.oslo.feature.qrc.domain.usecase;

/* loaded from: classes14.dex */
public final class GenerateQrCodeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase_Factory create() {
        return com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase newInstance() {
        return new com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
