package com.ingo.sdk.kotlin.common.features.transaction_status;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase", f = "TransactionStatusUseCase.kt", i = {0}, l = {21, 23}, m = "run", n = {"params"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class TransactionStatusUseCase$run$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.run((java.lang.String) null, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionStatusUseCase$run$1(com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase transactionStatusUseCase, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.transaction_status.TransactionStatusUseCase$run$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = transactionStatusUseCase;
    }
}
