package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel;

/* loaded from: classes14.dex */
public final class FetchPaymentOptionsMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper> getHighResolutionOutputSizeshNQ4ISI;

    private FetchPaymentOptionsMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase getPaymentOptionsUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper selectAmountMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware(getPaymentOptionsUseCase, selectAmountMapper);
    }
}
