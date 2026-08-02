package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/AmountError;", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl$getAmount$1", f = "AmountRepositoryImpl.kt", i = {0, 0}, l = {36}, m = "invokeSuspend", n = {"$this$flow", "mockSendAmount"}, nl = {37}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class AmountRepositoryImpl$getAmount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.AmountError, ? extends com.paypal.oslo.feature.p2p.domain.model.Amount>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = new com.paypal.oslo.feature.p2p.domain.model.Amount("50.00", "USD", "US");
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(amount);
            this.Camera2StreamConfigurationMap = 1;
            if (flowCollector.emit(arrow.core.IorKt.rightIor(amount), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.AmountError, ? extends com.paypal.oslo.feature.p2p.domain.model.Amount>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl$getAmount$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl$getAmount$1 amountRepositoryImpl$getAmount$1 = new com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl$getAmount$1(continuation);
        amountRepositoryImpl$getAmount$1.getHighSpeedVideoFpsRanges = obj;
        return amountRepositoryImpl$getAmount$1;
    }

    AmountRepositoryImpl$getAmount$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.AmountRepositoryImpl$getAmount$1> continuation) {
        super(2, continuation);
    }
}
