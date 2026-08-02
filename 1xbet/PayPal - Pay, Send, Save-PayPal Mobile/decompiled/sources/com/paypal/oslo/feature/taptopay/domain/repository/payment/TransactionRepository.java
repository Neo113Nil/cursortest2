package com.paypal.oslo.feature.taptopay.domain.repository.payment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\fH&¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "", "", "digitizedCardId", "Ljava/util/Date;", "from", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/GetTransactionHistoryError;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "getTransactionHistory", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTransactions", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TransactionRepository {
    java.lang.Object getTransactionHistory(java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>>> continuation);

    kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> observeTransactions();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object getTransactionHistory$default(com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository transactionRepository, java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransactionHistory");
        }
        if ((i & 2) != 0) {
            date = null;
        }
        return transactionRepository.getTransactionHistory(str, date, continuation);
    }
}
