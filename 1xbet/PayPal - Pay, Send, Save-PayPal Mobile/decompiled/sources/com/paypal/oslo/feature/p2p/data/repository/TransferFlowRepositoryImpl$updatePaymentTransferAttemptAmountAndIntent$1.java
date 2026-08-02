package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateAmountAndIntentResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptAmountAndIntent$1", f = "TransferFlowRepositoryImpl.kt", i = {0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 269}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "result"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, 270}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class TransferFlowRepositoryImpl$updatePaymentTransferAttemptAmountAndIntent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.Amount getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl getHighSpeedVideoSizesFor;
    int getInputFormats;
    private /* synthetic */ java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
    
        if (r1.emit(r3, r19) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r3 != r2) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UPDATE_AMOUNT_AND_INTENT_REQUEST, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", this.Camera2StreamConfigurationMap.toString())), null, 4, null);
            this.getOutputFormats = flowCollector;
            this.getInputFormats = 1;
            highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            highResolutionOutputSizeshNQ4ISI = obj;
        }
        arrow.core.Ior ior = (arrow.core.Ior) highResolutionOutputSizeshNQ4ISI;
        if (((com.paypal.oslo.feature.p2p.domain.error.TransferError) ior.leftOrNull()) != null) {
            mutableStateFlow2 = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
            mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        }
        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
        this.getInputFormats = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptAmountAndIntent$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptAmountAndIntent$1 transferFlowRepositoryImpl$updatePaymentTransferAttemptAmountAndIntent$1 = new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptAmountAndIntent$1(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        transferFlowRepositoryImpl$updatePaymentTransferAttemptAmountAndIntent$1.getOutputFormats = obj;
        return transferFlowRepositoryImpl$updatePaymentTransferAttemptAmountAndIntent$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferFlowRepositoryImpl$updatePaymentTransferAttemptAmountAndIntent$1(com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl transferFlowRepositoryImpl, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl$updatePaymentTransferAttemptAmountAndIntent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = transferFlowRepositoryImpl;
        this.Camera2StreamConfigurationMap = paymentTransferIntent;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = amount;
        this.getHighSpeedVideoFpsRanges = str2;
    }
}
