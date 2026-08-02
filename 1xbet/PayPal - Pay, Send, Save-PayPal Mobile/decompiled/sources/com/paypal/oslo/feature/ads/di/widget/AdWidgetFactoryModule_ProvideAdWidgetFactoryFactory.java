package com.paypal.oslo.feature.ads.di.widget;

/* loaded from: classes11.dex */
public final class AdWidgetFactoryModule_ProvideAdWidgetFactoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.Factory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl> getHighResolutionOutputSizeshNQ4ISI;

    private AdWidgetFactoryModule_ProvideAdWidgetFactoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.Factory get() {
        return provideAdWidgetFactory(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static com.paypal.oslo.feature.ads.di.widget.AdWidgetFactoryModule_ProvideAdWidgetFactoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl> provider) {
        return new com.paypal.oslo.feature.ads.di.widget.AdWidgetFactoryModule_ProvideAdWidgetFactoryFactory(provider);
    }

    public static com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.Factory provideAdWidgetFactory(javax.inject.Provider<com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl> provider) {
        return (com.paypal.oslo.feature.ads.ui.widget.AdWidgetImpl.Factory) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.ads.di.widget.AdWidgetFactoryModule.INSTANCE.provideAdWidgetFactory(provider));
    }
}
