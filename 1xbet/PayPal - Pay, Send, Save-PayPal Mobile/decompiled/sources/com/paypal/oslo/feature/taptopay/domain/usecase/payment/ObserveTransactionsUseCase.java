package com.paypal.oslo.feature.taptopay.domain.usecase.payment;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/ObserveTransactionsUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "transactionRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ObserveTransactionsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ObserveTransactionsUseCase(com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository transactionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionRepository, "");
        this.getHighSpeedVideoSizes = transactionRepository;
    }

    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> invoke() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running observe transactions use case", null, null, 6, null);
        return this.getHighSpeedVideoSizes.observeTransactions();
    }
}
