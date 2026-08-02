package com.paypal.oslo.feature.revolvingcreditservicing.utils;

/* loaded from: classes14.dex */
public final class CreditMobileDeeplinkHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.RelativeUrlMapper> getHighSpeedVideoFpsRangesFor;

    private CreditMobileDeeplinkHandler_Factory(dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.RelativeUrlMapper> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.RelativeUrlMapper> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler newInstance(com.paypal.oslo.core.deeplink.DeeplinkResolver deeplinkResolver, com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler.RelativeUrlMapper relativeUrlMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler(deeplinkResolver, relativeUrlMapper);
    }
}
