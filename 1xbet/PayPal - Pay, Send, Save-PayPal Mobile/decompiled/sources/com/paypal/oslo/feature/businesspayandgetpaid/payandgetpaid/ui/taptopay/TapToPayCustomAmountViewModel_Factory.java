package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

/* loaded from: classes11.dex */
public final class TapToPayCustomAmountViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRanges;

    private TapToPayCustomAmountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel(userStore);
    }
}
