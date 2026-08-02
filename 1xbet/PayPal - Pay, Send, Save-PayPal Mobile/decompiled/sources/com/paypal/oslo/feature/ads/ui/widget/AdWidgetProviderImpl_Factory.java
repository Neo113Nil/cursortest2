package com.paypal.oslo.feature.ads.ui.widget;

/* loaded from: classes11.dex */
public final class AdWidgetProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.ui.widget.AdWidgetProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.Factory> Camera2StreamConfigurationMap;

    private AdWidgetProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.Factory> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.ui.widget.AdWidgetProviderImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.ads.ui.widget.AdWidgetProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.Factory> provider) {
        return new com.paypal.oslo.feature.ads.ui.widget.AdWidgetProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.ads.ui.widget.AdWidgetProviderImpl newInstance(com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.Factory factory) {
        return new com.paypal.oslo.feature.ads.ui.widget.AdWidgetProviderImpl(factory);
    }
}
