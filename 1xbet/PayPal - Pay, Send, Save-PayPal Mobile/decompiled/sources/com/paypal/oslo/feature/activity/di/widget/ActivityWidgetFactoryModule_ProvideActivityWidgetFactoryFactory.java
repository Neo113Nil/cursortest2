package com.paypal.oslo.feature.activity.di.widget;

/* loaded from: classes10.dex */
public final class ActivityWidgetFactoryModule_ProvideActivityWidgetFactoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl> getHighSpeedVideoFpsRanges;

    private ActivityWidgetFactoryModule_ProvideActivityWidgetFactoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory get() {
        return provideActivityWidgetFactory(this.getHighSpeedVideoFpsRanges);
    }

    public static com.paypal.oslo.feature.activity.di.widget.ActivityWidgetFactoryModule_ProvideActivityWidgetFactoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl> provider) {
        return new com.paypal.oslo.feature.activity.di.widget.ActivityWidgetFactoryModule_ProvideActivityWidgetFactoryFactory(provider);
    }

    public static com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory provideActivityWidgetFactory(javax.inject.Provider<com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl> provider) {
        return (com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.activity.di.widget.ActivityWidgetFactoryModule.INSTANCE.provideActivityWidgetFactory(provider));
    }
}
