package com.paypal.oslo.feature.activity.di.widget;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/di/widget/ActivityWidgetFactoryModule;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetImpl;", "widgetProvider", "Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetImpl$Factory;", "provideActivityWidgetFactory", "(Ljavax/inject/Provider;)Lcom/paypal/oslo/feature/activity/ui/widget/ActivityWidgetImpl$Factory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class ActivityWidgetFactoryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.di.widget.ActivityWidgetFactoryModule INSTANCE = new com.paypal.oslo.feature.activity.di.widget.ActivityWidgetFactoryModule();

    private ActivityWidgetFactoryModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory provideActivityWidgetFactory(final javax.inject.Provider<com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl> widgetProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetProvider, "");
        return new com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory() { // from class: com.paypal.oslo.feature.activity.di.widget.ActivityWidgetFactoryModule$provideActivityWidgetFactory$1
            @Override // com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.Factory
            public final com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl create(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration config) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
                return widgetProvider.get().initialize(config);
            }
        };
    }
}
