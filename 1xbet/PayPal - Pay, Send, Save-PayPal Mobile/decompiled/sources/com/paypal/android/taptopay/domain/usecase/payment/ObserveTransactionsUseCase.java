package com.paypal.android.taptopay.domain.usecase.payment;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/payment/ObserveTransactionsUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;", "transactionRepository", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/paypal/android/taptopay/domain/model/payment/Transaction;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ObserveTransactionsUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.payment.TransactionRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ObserveTransactionsUseCase(com.paypal.android.taptopay.domain.repository.payment.TransactionRepository transactionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionRepository, "");
        this.getHighSpeedVideoFpsRanges = transactionRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction>>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Running observe transactions use case", null, null, 6, null);
        return this.getHighSpeedVideoFpsRanges.observeTransactions(continuation);
    }
}
