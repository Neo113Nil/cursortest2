package com.paypal.oslo.feature.subscriptions.shared.ui;

/* loaded from: classes15.dex */
public final class SubscriptionsActivityWidgetHelper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.shared.ui.SubscriptionsActivityWidgetHelper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> getHighSpeedVideoFpsRanges;

    private SubscriptionsActivityWidgetHelper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.shared.ui.SubscriptionsActivityWidgetHelper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.subscriptions.shared.ui.SubscriptionsActivityWidgetHelper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider) {
        return new com.paypal.oslo.feature.subscriptions.shared.ui.SubscriptionsActivityWidgetHelper_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.shared.ui.SubscriptionsActivityWidgetHelper newInstance(com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider) {
        return new com.paypal.oslo.feature.subscriptions.shared.ui.SubscriptionsActivityWidgetHelper(iActivityWidgetProvider);
    }
}
