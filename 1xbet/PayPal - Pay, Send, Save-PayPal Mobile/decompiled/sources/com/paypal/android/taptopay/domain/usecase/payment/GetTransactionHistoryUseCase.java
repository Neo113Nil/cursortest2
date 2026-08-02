package com.paypal.android.taptopay.domain.usecase.payment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/payment/GetTransactionHistoryUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;", "transactionRepository", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;)V", "", "cardId", "Ljava/util/Date;", "from", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/payment/Transaction;", "Lcom/paypal/android/taptopay/domain/model/payment/GetTransactionHistoryError;", "invoke", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/domain/repository/payment/TransactionRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetTransactionHistoryUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.payment.TransactionRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetTransactionHistoryUseCase(com.paypal.android.taptopay.domain.repository.payment.TransactionRepository transactionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionRepository, "");
        this.getHighSpeedVideoFpsRanges = transactionRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.android.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase getTransactionHistoryUseCase, java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            date = null;
        }
        return getTransactionHistoryUseCase.invoke(str, date, continuation);
    }

    public final java.lang.Object invoke(java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction>, com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError>> continuation) {
        return this.getHighSpeedVideoFpsRanges.getTransactionHistory(str, date, continuation);
    }
}
