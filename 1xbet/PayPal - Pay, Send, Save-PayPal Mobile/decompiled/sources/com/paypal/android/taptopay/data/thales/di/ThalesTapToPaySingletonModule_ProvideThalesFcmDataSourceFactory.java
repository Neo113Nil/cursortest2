package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideThalesFcmDataSourceFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource get() {
        return provideThalesFcmDataSource();
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesFcmDataSourceFactory create() {
        return com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesFcmDataSourceFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource provideThalesFcmDataSource() {
        return (com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideThalesFcmDataSource());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        private static final com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesFcmDataSourceFactory getHighSpeedVideoSizes = new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesFcmDataSourceFactory();

        private InstanceHolder() {
        }
    }
}
