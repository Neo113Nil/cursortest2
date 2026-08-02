package com.paypal.android.taptopay.data.thales.di;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\"2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020'2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\"H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0017H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001dH\u0007¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0007¢\u0006\u0004\b2\u00103J'\u00107\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00104\u001a\u0002012\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020%H\u0007¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b<\u0010="}, d2 = {"Lcom/paypal/android/taptopay/data/thales/di/ThalesTapToPaySingletonModule;", "", "<init>", "()V", "Lcom/paypal/android/taptopay/data/thales/card/CardPushNotificationDataSource;", "cardPushNotificationDataSource", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "cardDataSource", "Lcom/paypal/android/taptopay/data/thales/card/CardChangeHandler;", "provideCardChangeHandler", "(Lcom/paypal/android/taptopay/data/thales/card/CardPushNotificationDataSource;Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;)Lcom/paypal/android/taptopay/data/thales/card/CardChangeHandler;", "Landroid/content/Context;", "context", "provideCardDataSource", "(Landroid/content/Context;)Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "Lcom/paypal/android/taptopay/data/thales/fcm/CardPushServiceListener;", "provideCardPushServiceListener", "(Lcom/paypal/android/taptopay/data/thales/card/CardPushNotificationDataSource;)Lcom/paypal/android/taptopay/data/thales/fcm/CardPushServiceListener;", "Lcom/paypal/android/taptopay/data/thales/card/CardStateDataSource;", "provideCardStateDataSource", "(Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;)Lcom/paypal/android/taptopay/data/thales/card/CardStateDataSource;", "provideCpsCardStateChangeDataSource", "()Lcom/paypal/android/taptopay/data/thales/card/CardPushNotificationDataSource;", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;", "pushNotificationDataSource", "cardPushServiceListener", "Lcom/paypal/android/taptopay/domain/di/OrphanedCardLifecycleDependency;", "provideCpsPushNotificationHandler", "(Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;Lcom/paypal/android/taptopay/data/thales/fcm/CardPushServiceListener;)Lcom/paypal/android/taptopay/domain/di/OrphanedCardLifecycleDependency;", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;", "pushNotificationTokenDataSource", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenHandler;", "provideFcmTokenHandler", "(Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;)Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenHandler;", "Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;", "provideKeyReplenisher", "(Landroid/content/Context;)Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;", "paymentDataSource", "Lcom/paypal/android/taptopay/domain/di/OrphanedPaymentLifecycleDependency;", "providePaymentActivityLauncher", "(Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;)Lcom/paypal/android/taptopay/domain/di/OrphanedPaymentLifecycleDependency;", "cardPaymentKeysReplenisher", "provideReplenishmentPushNotificationHandler", "(Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;)Lcom/paypal/android/taptopay/domain/di/OrphanedCardLifecycleDependency;", "provideThalesFcmDataSource", "()Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;", "provideThalesFcmTokenDataSource", "()Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;", "Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;", "provideThalesTransactionDataSource", "()Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;", "transactionDataSource", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesTransactionRepository;", "transactionRepository", "provideTransactionPushNotificationHandler", "(Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;Lcom/paypal/android/taptopay/data/thales/payment/ThalesTransactionRepository;)Lcom/paypal/android/taptopay/domain/di/OrphanedCardLifecycleDependency;", "providesThalesPaymentDataSource", "()Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;", "Lcom/gemalto/mfs/mwsdk/provisioning/sdkconfig/ProvisioningBusinessService;", "providesThalesProvisioningBusinessService", "()Lcom/gemalto/mfs/mwsdk/provisioning/sdkconfig/ProvisioningBusinessService;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule {
    public static final com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule INSTANCE = new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule();

    private ThalesTapToPaySingletonModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource provideThalesFcmTokenDataSource() {
        return new com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource();
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource provideThalesFcmDataSource() {
        return new com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource();
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.data.thales.card.CardDataSource provideCardDataSource(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.android.taptopay.data.thales.card.CardDataSource(new com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase(context, new com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase()), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.data.thales.card.CardStateDataSource provideCardStateDataSource(com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
        return new com.paypal.android.taptopay.data.thales.card.CardStateDataSource(cardDataSource, null, 2, 0 == true ? 1 : 0);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource provideCpsCardStateChangeDataSource() {
        return new com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource();
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener provideCardPushServiceListener(com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource cardPushNotificationDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPushNotificationDataSource, "");
        return new com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener(cardPushNotificationDataSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.Provides
    public final com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher provideKeyReplenisher(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        androidx.work.WorkManager workManager = androidx.work.WorkManager.getInstance(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workManager, "");
        return new com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher(new com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase(workManager, new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.CONNECTED).build()), null, 2, 0 == true ? 1 : 0);
    }

    @dagger.Provides
    public final com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService providesThalesProvisioningBusinessService() {
        com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService provisioningBusinessService = com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(provisioningBusinessService, "");
        return provisioningBusinessService;
    }

    @dagger.Provides
    @javax.inject.Singleton
    @dagger.multibindings.IntoSet
    public final com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency provideCpsPushNotificationHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener cardPushServiceListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPushServiceListener, "");
        return new com.paypal.android.taptopay.data.thales.card.CardPushNotificationHandler(pushNotificationDataSource, cardPushServiceListener, null, 4, null);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource providesThalesPaymentDataSource() {
        return new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.data.thales.payment.TransactionDataSource provideThalesTransactionDataSource() {
        return new com.paypal.android.taptopay.data.thales.payment.TransactionDataSource(null, 1, 0 == true ? 1 : 0);
    }

    @dagger.Provides
    @javax.inject.Singleton
    @dagger.multibindings.IntoSet
    public final com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency provideTransactionPushNotificationHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource, com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository transactionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionRepository, "");
        return new com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler(pushNotificationDataSource, transactionDataSource, transactionRepository, null, 8, null);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.data.thales.card.CardChangeHandler provideCardChangeHandler(com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource cardPushNotificationDataSource, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPushNotificationDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
        return new com.paypal.android.taptopay.data.thales.card.CardChangeHandler(cardPushNotificationDataSource, cardDataSource);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler provideFcmTokenHandler(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenDataSource, "");
        return new com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler(context, pushNotificationTokenDataSource, null, 4, null);
    }

    @dagger.Provides
    @javax.inject.Singleton
    @dagger.multibindings.IntoSet
    public final com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency providePaymentActivityLauncher(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource paymentDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDataSource, "");
        return new com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher(context, paymentDataSource, null, 4, null);
    }

    @dagger.Provides
    @javax.inject.Singleton
    @dagger.multibindings.IntoSet
    public final com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency provideReplenishmentPushNotificationHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentKeysReplenisher, "");
        return new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler(pushNotificationDataSource, cardPaymentKeysReplenisher, null, 4, null);
    }
}
