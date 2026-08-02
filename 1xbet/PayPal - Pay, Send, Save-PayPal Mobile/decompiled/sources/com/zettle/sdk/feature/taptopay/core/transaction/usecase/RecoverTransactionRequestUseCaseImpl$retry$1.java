package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl$retry$1", f = "RecoverTransactionRequestUseCase.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class RecoverTransactionRequestUseCaseImpl$retry$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.zettle.sdk.commons.network.NetworkClient getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r4.Camera2StreamConfigurationMap.recoverTransactionRequest(r0, r1, new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl$callRecoverService$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl$retry$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl$retry$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RecoverTransactionRequestUseCaseImpl$retry$1(com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl recoverTransactionRequestUseCaseImpl, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.commons.network.NetworkClient networkClient, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl$retry$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = recoverTransactionRequestUseCaseImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = transactionInfo;
        this.getHighSpeedVideoSizes = networkClient;
        this.Camera2StreamConfigurationMap = function1;
    }
}
