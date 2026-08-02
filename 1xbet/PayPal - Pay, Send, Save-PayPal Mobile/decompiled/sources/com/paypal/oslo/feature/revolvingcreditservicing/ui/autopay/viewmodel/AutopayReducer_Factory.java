package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

/* loaded from: classes14.dex */
public final class AutopayReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayPaymentMethodMapper> getHighSpeedVideoSizes;

    private AutopayReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayPaymentMethodMapper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayPaymentMethodMapper> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayValidator autopayValidator, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayPaymentMethodMapper autopayPaymentMethodMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayReducer(autopayValidator, autopayPaymentMethodMapper);
    }
}
