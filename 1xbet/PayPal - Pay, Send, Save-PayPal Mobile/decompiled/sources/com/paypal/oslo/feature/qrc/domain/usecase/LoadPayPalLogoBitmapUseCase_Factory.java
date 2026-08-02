package com.paypal.oslo.feature.qrc.domain.usecase;

/* loaded from: classes14.dex */
public final class LoadPayPalLogoBitmapUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private LoadPayPalLogoBitmapUseCase_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase(context);
    }
}
