package com.paypal.oslo.feature.taptopay.data.repository.payment;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B-\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/payment/TransactionRepositoryWrapper;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "Ljavax/inject/Provider;", "thalesRepositoryProvider", "payairRepositoryProvider", "Lcom/paypal/oslo/feature/taptopay/data/wallet/ImplementationSelector;", "implementationSelector", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Lcom/paypal/oslo/feature/taptopay/data/wallet/ImplementationSelector;)V", "", "digitizedCardId", "Ljava/util/Date;", "from", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/GetTransactionHistoryError;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "getTransactionHistory", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTransactions", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Ljavax/inject/Provider;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/data/wallet/ImplementationSelector;", "getHighResolutionOutputSizeshNQ4ISI", "()Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TransactionRepositoryWrapper implements com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public TransactionRepositoryWrapper(javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider, javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider2, com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector implementationSelector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(implementationSelector, "");
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = implementationSelector;
    }

    private final com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository Camera2StreamConfigurationMap() {
        java.lang.String selectedVendor = this.getHighResolutionOutputSizeshNQ4ISI.getSelectedVendor();
        if (kotlin.jvm.internal.Intrinsics.areEqual(selectedVendor, "payair")) {
            com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository transactionRepository = this.getHighSpeedVideoFpsRanges.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transactionRepository, "");
            return transactionRepository;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(selectedVendor, "thales")) {
            com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository transactionRepository2 = this.getHighSpeedVideoSizes.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transactionRepository2, "");
            return transactionRepository2;
        }
        com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository transactionRepository3 = this.getHighSpeedVideoSizes.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transactionRepository3, "");
        return transactionRepository3;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository
    public final java.lang.Object getTransactionHistory(java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>>> continuation) {
        return Camera2StreamConfigurationMap().getTransactionHistory(str, date, continuation);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> observeTransactions() {
        return Camera2StreamConfigurationMap().observeTransactions();
    }
}
