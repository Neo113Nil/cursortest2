package com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityError;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1$eligibilityDeferred$1", f = "GetEligibilityAndBalancesUseCase.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, nl = {57}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class GetEligibilityAndBalancesUseCase$invoke$3$1$eligibilityDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError, ? extends com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository fIFORepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        fIFORepository = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object addWithdrawEligibility = fIFORepository.getAddWithdrawEligibility(new com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityInput(com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier.CONSUMER_TRANSFERS), this);
        return addWithdrawEligibility == coroutine_suspended ? coroutine_suspended : addWithdrawEligibility;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError, ? extends com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult>> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1$eligibilityDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1$eligibilityDeferred$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetEligibilityAndBalancesUseCase$invoke$3$1$eligibilityDeferred$1(com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase getEligibilityAndBalancesUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1$eligibilityDeferred$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = getEligibilityAndBalancesUseCase;
    }
}
