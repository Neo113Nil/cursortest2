package com.ingo.sdk.kotlin.common.features.transaction_image;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/transaction_image/TransactionImageRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/transaction_image/TransactionImageRepository;", "Lcom/ingo/sdk/kotlin/common/features/transaction_image/TransactionImageApi;", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "<init>", "(Lcom/ingo/sdk/kotlin/common/features/transaction_image/TransactionImageApi;)V", "", "url", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "", "getTransactionImage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/ingo/sdk/kotlin/common/features/transaction_image/TransactionImageApi;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionImageRepositoryImpl implements com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageRepository {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageApi getHighResolutionOutputSizeshNQ4ISI;

    public TransactionImageRepositoryImpl(com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageApi transactionImageApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionImageApi, "");
        this.getHighResolutionOutputSizeshNQ4ISI = transactionImageApi;
    }

    @Override // com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageRepository
    public final java.lang.Object getTransactionImage(java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, byte[]>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTransactionImage(str, continuation);
    }
}
