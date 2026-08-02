package com.paypal.oslo.feature.taptopay.data.repository.thales;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$observeTransactions$1", f = "ThalesTransactionRepositoryAdapter.kt", i = {0, 1}, l = {52, 51}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, nl = {53, 55}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ThalesTransactionRepositoryAdapter$observeTransactions$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r2, new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$observeTransactions$1$invokeSuspend$$inlined$map$1(r7), r6) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            thalesTransactionRepository = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
            this.getHighSpeedVideoSizes = flowCollector2;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = thalesTransactionRepository.observeTransactions(this);
            if (obj != coroutine_suspended) {
                flowCollector = flowCollector2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
        kotlin.ResultKt.throwOnFailure(obj);
        final kotlinx.coroutines.flow.Flow flow = (kotlinx.coroutines.flow.Flow) obj;
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$observeTransactions$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$observeTransactions$1 thalesTransactionRepositoryAdapter$observeTransactions$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$observeTransactions$1(this.Camera2StreamConfigurationMap, continuation);
        thalesTransactionRepositoryAdapter$observeTransactions$1.getHighSpeedVideoFpsRangesFor = obj;
        return thalesTransactionRepositoryAdapter$observeTransactions$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesTransactionRepositoryAdapter$observeTransactions$1(com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter thalesTransactionRepositoryAdapter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$observeTransactions$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = thalesTransactionRepositoryAdapter;
    }
}
