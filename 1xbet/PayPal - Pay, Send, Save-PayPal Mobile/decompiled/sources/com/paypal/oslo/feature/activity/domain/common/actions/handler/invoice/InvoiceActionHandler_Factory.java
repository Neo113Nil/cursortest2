package com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice;

/* loaded from: classes10.dex */
public final class InvoiceActionHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighSpeedVideoFpsRanges;

    private InvoiceActionHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider) {
        return new com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig) {
        return new com.paypal.oslo.feature.activity.domain.common.actions.handler.invoice.InvoiceActionHandler(activityComposeConfig);
    }
}
