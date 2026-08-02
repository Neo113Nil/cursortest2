package com.paypal.oslo.feature.activity.ui.widget;

/* loaded from: classes10.dex */
public final class ActivityWidgetProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory> getHighSpeedVideoSizes;

    private ActivityWidgetProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetProviderImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory> provider) {
        return new com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetProviderImpl newInstance(com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory factory) {
        return new com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetProviderImpl(factory);
    }
}
