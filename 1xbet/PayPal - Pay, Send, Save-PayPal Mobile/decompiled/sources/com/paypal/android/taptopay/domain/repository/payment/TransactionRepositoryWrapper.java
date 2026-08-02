package com.paypal.android.taptopay.domain.repository.payment;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepositoryWrapper;", "Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;", "thalesRepository", "payairRepository", "Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;", "implementationSelector", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;)V", "", "digitalizedCardId", "Ljava/util/Date;", "from", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/payment/Transaction;", "Lcom/paypal/android/taptopay/domain/model/payment/GetTransactionHistoryError;", "getTransactionHistory", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTransactions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionRepositoryWrapper implements com.paypal.android.taptopay.domain.repository.payment.TransactionRepository {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.di.ImplementationSelector Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.payment.TransactionRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.payment.TransactionRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public TransactionRepositoryWrapper(com.paypal.android.taptopay.domain.repository.payment.TransactionRepository transactionRepository, com.paypal.android.taptopay.domain.repository.payment.TransactionRepository transactionRepository2, com.paypal.android.taptopay.domain.di.ImplementationSelector implementationSelector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionRepository2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(implementationSelector, "");
        this.getHighSpeedVideoFpsRanges = transactionRepository;
        this.getHighSpeedVideoFpsRangesFor = transactionRepository2;
        this.Camera2StreamConfigurationMap = implementationSelector;
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.TransactionRepository
    public final java.lang.Object observeTransactions(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.transformLatest(this.Camera2StreamConfigurationMap.getVendorFlow(), new com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper$observeTransactions$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.paypal.android.taptopay.domain.repository.payment.TransactionRepository
    public final java.lang.Object getTransactionHistory(java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction>, com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError>> continuation) {
        com.paypal.android.taptopay.domain.repository.payment.TransactionRepository transactionRepository;
        java.lang.String selectedVendor = this.Camera2StreamConfigurationMap.getSelectedVendor();
        if (kotlin.jvm.internal.Intrinsics.areEqual(selectedVendor, "payair")) {
            transactionRepository = this.getHighSpeedVideoFpsRangesFor;
        } else {
            kotlin.jvm.internal.Intrinsics.areEqual(selectedVendor, "thales");
            transactionRepository = this.getHighSpeedVideoFpsRanges;
        }
        return transactionRepository.getTransactionHistory(str, date, continuation);
    }
}
