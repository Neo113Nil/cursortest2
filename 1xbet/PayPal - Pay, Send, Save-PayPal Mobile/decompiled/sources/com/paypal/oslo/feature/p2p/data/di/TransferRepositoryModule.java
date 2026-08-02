package com.paypal.oslo.feature.p2p.data.di;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H!¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH!¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH!¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0013H!¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0017H!¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/di/TransferRepositoryModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/p2p/data/repository/CurrencyRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/p2p/domain/repository/CurrencyRepository;", "bindsCurrencyRepository$p2p_prodRelease", "(Lcom/paypal/oslo/feature/p2p/data/repository/CurrencyRepositoryImpl;)Lcom/paypal/oslo/feature/p2p/domain/repository/CurrencyRepository;", "Lcom/paypal/oslo/feature/p2p/data/repository/AmountRepositoryImpl;", "amountRepositoryImpl", "Lcom/paypal/oslo/feature/p2p/domain/repository/AmountRepository;", "bindAmountRepository$p2p_prodRelease", "(Lcom/paypal/oslo/feature/p2p/data/repository/AmountRepositoryImpl;)Lcom/paypal/oslo/feature/p2p/domain/repository/AmountRepository;", "Lcom/paypal/oslo/feature/p2p/data/repository/TransferFlowRepositoryImpl;", "transferFlowRepositoryImpl", "Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;", "bindTransferFlowRepository$p2p_prodRelease", "(Lcom/paypal/oslo/feature/p2p/data/repository/TransferFlowRepositoryImpl;)Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;", "Lcom/paypal/oslo/feature/p2p/data/repository/PaymentTransferRepositoryImpl;", "Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentTransferRepository;", "bindsPaymentTransferRepository$p2p_prodRelease", "(Lcom/paypal/oslo/feature/p2p/data/repository/PaymentTransferRepositoryImpl;)Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentTransferRepository;", "Lcom/paypal/oslo/feature/p2p/data/repository/PaymentRequestRepositoryImpl;", "Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentRequestRepository;", "bindsPaymentRequestRepository$p2p_prodRelease", "(Lcom/paypal/oslo/feature/p2p/data/repository/PaymentRequestRepositoryImpl;)Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentRequestRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public abstract class TransferRepositoryModule {
    public static final int $stable = 0;

    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.paypal.oslo.feature.p2p.domain.repository.AmountRepository bindAmountRepository$p2p_prodRelease(com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl amountRepositoryImpl);

    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository bindTransferFlowRepository$p2p_prodRelease(com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl);

    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository bindsCurrencyRepository$p2p_prodRelease(com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl impl);

    @dagger.Binds
    public abstract com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository bindsPaymentRequestRepository$p2p_prodRelease(com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository bindsPaymentTransferRepository$p2p_prodRelease(com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl impl);
}
