package com.paypal.oslo.feature.cryptocurrency.ui.receive;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0345CryptoReceiveViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases> getHighSpeedVideoSizes;

    private C0345CryptoReceiveViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel get(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return newInstance(str, str2, str3, str4, this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.receive.C0345CryptoReceiveViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.receive.C0345CryptoReceiveViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel newInstance(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases cryptoReceiveUseCases, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel(str, str2, str3, str4, cryptoReceiveUseCases, dynamicConfigurationManager);
    }
}
