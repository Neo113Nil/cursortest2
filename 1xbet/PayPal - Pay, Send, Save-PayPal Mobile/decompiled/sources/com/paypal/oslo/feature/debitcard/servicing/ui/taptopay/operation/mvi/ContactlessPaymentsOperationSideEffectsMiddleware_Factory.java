package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi;

/* loaded from: classes12.dex */
public final class ContactlessPaymentsOperationSideEffectsMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.IsCardDigitizedApi> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardEligibilityApi> getHighResolutionOutputSizeshNQ4ISI;

    private ContactlessPaymentsOperationSideEffectsMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.IsCardDigitizedApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardEligibilityApi> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.IsCardDigitizedApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardEligibilityApi> provider2) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware newInstance(com.paypal.oslo.feature.taptopay.api.domain.usecase.card.IsCardDigitizedApi isCardDigitizedApi, com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardEligibilityApi getCardEligibilityApi) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware(isCardDigitizedApi, getCardEligibilityApi);
    }
}
