package com.paypal.android.taptopay.domain.repository.payment;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper$observeTransactions$$inlined$flatMapLatest$1", f = "TransactionRepositoryWrapper.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class TransactionRepositoryWrapper$observeTransactions$$inlined$flatMapLatest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.android.taptopay.domain.model.payment.Transaction>>, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, (kotlinx.coroutines.flow.Flow) r7, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r7 != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        com.paypal.android.taptopay.domain.repository.payment.TransactionRepository transactionRepository;
        com.paypal.android.taptopay.domain.repository.payment.TransactionRepository transactionRepository2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) this.Camera2StreamConfigurationMap, "payair")) {
                transactionRepository2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = flowCollector;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = transactionRepository2.observeTransactions(this);
            } else {
                transactionRepository = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoSizes = flowCollector;
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
                obj = transactionRepository.observeTransactions(this);
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.android.taptopay.domain.model.payment.Transaction>> flowCollector, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper$observeTransactions$$inlined$flatMapLatest$1 transactionRepositoryWrapper$observeTransactions$$inlined$flatMapLatest$1 = new com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper$observeTransactions$$inlined$flatMapLatest$1(continuation, this.getHighSpeedVideoFpsRangesFor);
        transactionRepositoryWrapper$observeTransactions$$inlined$flatMapLatest$1.getHighSpeedVideoSizes = flowCollector;
        transactionRepositoryWrapper$observeTransactions$$inlined$flatMapLatest$1.Camera2StreamConfigurationMap = str;
        return transactionRepositoryWrapper$observeTransactions$$inlined$flatMapLatest$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionRepositoryWrapper$observeTransactions$$inlined$flatMapLatest$1(kotlin.coroutines.Continuation continuation, com.paypal.android.taptopay.domain.repository.payment.TransactionRepositoryWrapper transactionRepositoryWrapper) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = transactionRepositoryWrapper;
    }
}
