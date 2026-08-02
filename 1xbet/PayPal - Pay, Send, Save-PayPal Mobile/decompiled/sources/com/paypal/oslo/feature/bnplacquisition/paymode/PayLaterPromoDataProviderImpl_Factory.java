package com.paypal.oslo.feature.bnplacquisition.paymode;

/* loaded from: classes11.dex */
public final class PayLaterPromoDataProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.paymode.PayLaterPromoDataProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig> getHighSpeedVideoSizes;

    private PayLaterPromoDataProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.paymode.PayLaterPromoDataProviderImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.paymode.PayLaterPromoDataProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.paymode.PayLaterPromoDataProviderImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.paymode.PayLaterPromoDataProviderImpl newInstance(com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig payModeConfig, com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider payModeContentProvider) {
        return new com.paypal.oslo.feature.bnplacquisition.paymode.PayLaterPromoDataProviderImpl(payModeConfig, payModeContentProvider);
    }
}
