package com.paypal.oslo.feature.activity.domain.common.actions.operations;

/* loaded from: classes10.dex */
public final class ActivityNavigationActionOperationHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider> getHighSpeedVideoSizes;

    private ActivityNavigationActionOperationHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider> provider4) {
        return new com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler newInstance(com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler invoiceActionHandler, com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.PayActionHandler payActionHandler, com.paypal.oslo.feature.activity.domain.common.actions.handler.addtaxid.AddTaxIdActionHandler addTaxIdActionHandler, com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider activityDeepLinkNavigationProvider) {
        return new com.paypal.oslo.feature.activity.domain.common.actions.operations.ActivityNavigationActionOperationHandler(invoiceActionHandler, payActionHandler, addTaxIdActionHandler, activityDeepLinkNavigationProvider);
    }
}
