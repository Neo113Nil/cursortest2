package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideCpsCardStateChangeDataSourceFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource get() {
        return provideCpsCardStateChangeDataSource();
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCpsCardStateChangeDataSourceFactory create() {
        return com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCpsCardStateChangeDataSourceFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource provideCpsCardStateChangeDataSource() {
        return (com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideCpsCardStateChangeDataSource());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        private static final com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCpsCardStateChangeDataSourceFactory Camera2StreamConfigurationMap = new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideCpsCardStateChangeDataSourceFactory();

        private InstanceHolder() {
        }
    }
}
