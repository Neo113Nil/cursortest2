package com.paypal.oslo.feature.p2p.ui.transfer.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/PaymentTransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferFlowConfiguration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1$transferFlowConfigDeferred$1", f = "TransferViewModel.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1$transferFlowConfigDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration>>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration>> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(this.getHighResolutionOutputSizeshNQ4ISI, this);
        return first == coroutine_suspended ? coroutine_suspended : first;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration>> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1$transferFlowConfigDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1$transferFlowConfigDeferred$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1$transferFlowConfigDeferred$1(kotlinx.coroutines.flow.Flow<? extends arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration>> flow, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel$initializeTransferConfigAndStartTransferAttempt$1$transferFlowConfigDeferred$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = flow;
    }
}
