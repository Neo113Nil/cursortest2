package com.ingo.sdk.kotlin.common.features.history;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/history/TransactionHistoryRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/history/TransactionHistoryRepository;", "Lcom/ingo/sdk/kotlin/common/features/history/TransactionHistoryApi;", "transactionHistoryApi", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/history/TransactionHistoryApi;)V", "", "pageSize", "pageNumber", "", "transactionReferenceNumber", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionHistoryResponse;", "getTransactionHistory", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/ingo/sdk/kotlin/common/features/history/TransactionHistoryApi;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionHistoryRepositoryImpl implements com.ingo.sdk.kotlin.common.features.history.TransactionHistoryRepository {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.history.TransactionHistoryApi getHighSpeedVideoFpsRanges;

    public TransactionHistoryRepositoryImpl(com.ingo.sdk.kotlin.common.features.history.TransactionHistoryApi transactionHistoryApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHistoryApi, "");
        this.getHighSpeedVideoFpsRanges = transactionHistoryApi;
    }

    @Override // com.ingo.sdk.kotlin.common.features.history.TransactionHistoryRepository
    public final java.lang.Object getTransactionHistory(int i, int i2, java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.history.model.TransactionHistoryResponse>> continuation) {
        return this.getHighSpeedVideoFpsRanges.getTransactionStatus(i, i2, str, continuation);
    }
}
