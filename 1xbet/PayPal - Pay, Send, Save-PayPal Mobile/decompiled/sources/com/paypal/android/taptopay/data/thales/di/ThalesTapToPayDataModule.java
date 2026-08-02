package com.paypal.android.taptopay.data.thales.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/di/ThalesTapToPayDataModule;", "", "<init>", "()V", "Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;", "transactionDataSource", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesTransactionRepository;", "provideThalesTransactionRepository", "(Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;)Lcom/paypal/android/taptopay/data/thales/payment/ThalesTransactionRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class ThalesTapToPayDataModule {
    public static final com.paypal.android.taptopay.data.thales.di.ThalesTapToPayDataModule INSTANCE = new com.paypal.android.taptopay.data.thales.di.ThalesTapToPayDataModule();

    private ThalesTapToPayDataModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository provideThalesTransactionRepository(com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDataSource, "");
        return new com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository(transactionDataSource, null, 2, null);
    }
}
