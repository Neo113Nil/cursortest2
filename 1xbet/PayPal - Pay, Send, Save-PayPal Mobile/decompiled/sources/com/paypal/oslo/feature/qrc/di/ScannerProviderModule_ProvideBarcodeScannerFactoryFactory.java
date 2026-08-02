package com.paypal.oslo.feature.qrc.di;

/* loaded from: classes14.dex */
public final class ScannerProviderModule_ProvideBarcodeScannerFactoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory get() {
        return provideBarcodeScannerFactory();
    }

    public static com.paypal.oslo.feature.qrc.di.ScannerProviderModule_ProvideBarcodeScannerFactoryFactory create() {
        return com.paypal.oslo.feature.qrc.di.ScannerProviderModule_ProvideBarcodeScannerFactoryFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory provideBarcodeScannerFactory() {
        return (com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.qrc.di.ScannerProviderModule.INSTANCE.provideBarcodeScannerFactory());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.di.ScannerProviderModule_ProvideBarcodeScannerFactoryFactory getHighSpeedVideoSizes = new com.paypal.oslo.feature.qrc.di.ScannerProviderModule_ProvideBarcodeScannerFactoryFactory();

        private InstanceHolder() {
        }
    }
}
