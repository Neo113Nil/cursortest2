package com.paypal.oslo.feature.taptopay.domain.usecase.payment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/GetTransactionHistoryUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "transactionRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;)V", "", "cardId", "Ljava/util/Date;", "from", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/GetTransactionHistoryError;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "invoke", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetTransactionHistoryUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetTransactionHistoryUseCase(com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository transactionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionRepository, "");
        this.Camera2StreamConfigurationMap = transactionRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.taptopay.domain.usecase.payment.GetTransactionHistoryUseCase getTransactionHistoryUseCase, java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            date = null;
        }
        return getTransactionHistoryUseCase.invoke(str, date, continuation);
    }

    public final java.lang.Object invoke(java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running get transaction history use case", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", str), kotlin.TuplesKt.to("from", date)), null, 4, null);
        return this.Camera2StreamConfigurationMap.getTransactionHistory(str, date, continuation);
    }
}
