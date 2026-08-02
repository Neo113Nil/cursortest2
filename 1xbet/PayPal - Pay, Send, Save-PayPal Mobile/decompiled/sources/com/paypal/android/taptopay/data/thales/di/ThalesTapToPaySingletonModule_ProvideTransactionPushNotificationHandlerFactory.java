package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideTransactionPushNotificationHandlerFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.TransactionDataSource> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository> getHighSpeedVideoSizes;

    public ThalesTapToPaySingletonModule_ProvideTransactionPushNotificationHandlerFactory(javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.TransactionDataSource> provider2, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency get() {
        return provideTransactionPushNotificationHandler(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideTransactionPushNotificationHandlerFactory create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.TransactionDataSource> provider2, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository> provider3) {
        return new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideTransactionPushNotificationHandlerFactory(provider, provider2, provider3);
    }

    public static com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency provideTransactionPushNotificationHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource, com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository) {
        return (com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideTransactionPushNotificationHandler(pushNotificationDataSource, transactionDataSource, thalesTransactionRepository));
    }
}
