package com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant;

/* loaded from: classes14.dex */
public final class PpwMerchantViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantReducer> getHighResolutionOutputSizeshNQ4ISI;

    private PpwMerchantViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantReducer> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantReducer> provider) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel newInstance(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantReducer ppwMerchantReducer) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantViewModel(ppwMerchantReducer);
    }
}
