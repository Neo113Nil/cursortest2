package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideThalesFcmTokenDataSourceFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource get() {
        return provideThalesFcmTokenDataSource();
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesFcmTokenDataSourceFactory create() {
        return com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesFcmTokenDataSourceFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource provideThalesFcmTokenDataSource() {
        return (com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideThalesFcmTokenDataSource());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        private static final com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesFcmTokenDataSourceFactory Camera2StreamConfigurationMap = new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesFcmTokenDataSourceFactory();

        private InstanceHolder() {
        }
    }
}
