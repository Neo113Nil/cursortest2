package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

/* loaded from: classes11.dex */
public final class EnterAmountReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig> getHighSpeedVideoFpsRangesFor;

    private EnterAmountReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountReducer get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountReducer_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountReducer newInstance(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountReducer(enterAmountConfig);
    }
}
