package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success;

/* loaded from: classes15.dex */
public final class AddMoneySuccessViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> Camera2StreamConfigurationMap;

    private AddMoneySuccessViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel newInstance(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessViewModel(walletFeatureManager);
    }
}
