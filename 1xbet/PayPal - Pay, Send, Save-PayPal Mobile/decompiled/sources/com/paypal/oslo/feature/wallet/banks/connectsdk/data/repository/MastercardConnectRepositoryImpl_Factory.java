package com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository;

/* loaded from: classes15.dex */
public final class MastercardConnectRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler> getHighSpeedVideoSizes;

    private MastercardConnectRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler> provider) {
        return new com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl newInstance(com.paypal.oslo.feature.wallet.banks.connectsdk.handler.MastercardConnectEventHandler mastercardConnectEventHandler) {
        return new com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl(mastercardConnectEventHandler);
    }
}
