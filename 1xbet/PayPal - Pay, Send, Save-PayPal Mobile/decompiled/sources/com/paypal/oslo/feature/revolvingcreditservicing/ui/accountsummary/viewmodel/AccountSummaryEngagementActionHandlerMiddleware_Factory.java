package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel;

/* loaded from: classes14.dex */
public final class AccountSummaryEngagementActionHandlerMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEngagementActionHandlerMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler> Camera2StreamConfigurationMap;

    private AccountSummaryEngagementActionHandlerMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEngagementActionHandlerMiddleware get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEngagementActionHandlerMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEngagementActionHandlerMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEngagementActionHandlerMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler creditMobileDeeplinkHandler) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEngagementActionHandlerMiddleware(creditMobileDeeplinkHandler);
    }
}
