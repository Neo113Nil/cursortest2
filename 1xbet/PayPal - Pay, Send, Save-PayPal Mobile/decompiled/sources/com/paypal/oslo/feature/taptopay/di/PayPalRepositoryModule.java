package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/PayPalRepositoryModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/data/repository/PayPalCardRepositoryProvider;", "provider", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "providePayPalCardRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/PayPalCardRepositoryProvider;)Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/DeviceWalletDataBase;", "provideDeviceWalletDataBase", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/DeviceWalletDataBase;", "Lcom/paypal/oslo/feature/taptopay/data/repository/PayPalLocalCardDataRepositoryProvider;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "providePayPalLocalCardDataRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/PayPalLocalCardDataRepositoryProvider;)Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "Lcom/paypal/oslo/feature/taptopay/data/repository/CachedTransactionRepositoryProvider;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/transaction/CachedTransactionRepository;", "provideCachedTransactionRepository", "(Lcom/paypal/oslo/feature/taptopay/data/repository/CachedTransactionRepositoryProvider;)Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/transaction/CachedTransactionRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class PayPalRepositoryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule INSTANCE = new com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule();

    private PayPalRepositoryModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository providePayPalCardRepository(com.paypal.oslo.feature.taptopay.data.repository.PayPalCardRepositoryProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return provider.get();
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase provideDeviceWalletDataBase(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return (com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase) androidx.room.Room.databaseBuilder(applicationContext, com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase.class, "tap-to-pay-device-wallet-db").build();
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository providePayPalLocalCardDataRepository(com.paypal.oslo.feature.taptopay.data.repository.PayPalLocalCardDataRepositoryProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return provider.get();
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository provideCachedTransactionRepository(com.paypal.oslo.feature.taptopay.data.repository.CachedTransactionRepositoryProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return provider.get();
    }
}
