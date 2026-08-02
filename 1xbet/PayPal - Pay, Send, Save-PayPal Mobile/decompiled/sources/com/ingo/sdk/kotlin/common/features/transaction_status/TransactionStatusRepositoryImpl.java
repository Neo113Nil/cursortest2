package com.ingo.sdk.kotlin.common.features.transaction_status;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/transaction_status/TransactionStatusRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/transaction_status/TransactionStatusRepository;", "Lcom/ingo/sdk/kotlin/common/features/transaction_status/TransactionStatusApi;", "transactionStatusApi", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/transaction_status/TransactionStatusApi;)V", "", "transactionId", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/transaction_status/model/TransactionStatusResponse;", "getTransactionStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/kotlin/common/features/transaction_status/TransactionStatusApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionStatusRepositoryImpl implements com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusRepository {
    private final com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusApi Camera2StreamConfigurationMap;

    public TransactionStatusRepositoryImpl(com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusApi transactionStatusApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionStatusApi, "");
        this.Camera2StreamConfigurationMap = transactionStatusApi;
    }

    @Override // com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusRepository
    public final java.lang.Object getTransactionStatus(java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse>> continuation) {
        return this.Camera2StreamConfigurationMap.getTransactionStatus(str, continuation);
    }
}
