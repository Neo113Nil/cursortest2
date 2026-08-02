package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/PreTransactionModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/data/PreTransactionManagerImpl;", "impl", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/payment/PreTransactionManager;", "bindPreTransactionManager", "(Lcom/paypal/oslo/feature/taptopay/data/PreTransactionManagerImpl;)Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/payment/PreTransactionManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public abstract class PreTransactionModule {
    public static final int $stable = 0;

    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.paypal.oslo.feature.taptopay.api.domain.usecase.payment.PreTransactionManager bindPreTransactionManager(com.paypal.oslo.feature.taptopay.data.PreTransactionManagerImpl impl);
}
