package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$observePaymentTransferAttempt$1", f = "NoteViewModel.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, nl = {119}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NoteViewModel$observePaymentTransferAttempt$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getPaymentTransferAttemptUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt> invoke = getPaymentTransferAttemptUseCase.invoke();
            final com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$observePaymentTransferAttempt$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
                    com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) obj2;
                    if (paymentTransferAttempt != null) {
                        com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel2 = com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.this;
                        mviStateStore = noteViewModel2.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.String paymentTransferAttemptId = ((com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState) mviStateStore.getUiState().getValue()).getPaymentTransferAttemptId();
                        if (paymentTransferAttemptId == null) {
                            paymentTransferAttemptId = "";
                        }
                        if (paymentTransferAttemptId.length() > 0 && !kotlin.jvm.internal.Intrinsics.areEqual(paymentTransferAttemptId, paymentTransferAttempt.getId())) {
                            noteViewModel2.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.ResetForNewFlow(paymentTransferAttempt.getId()));
                        } else {
                            noteViewModel2.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.PaymentIdInitialized(paymentTransferAttempt.getId()));
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$observePaymentTransferAttempt$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$observePaymentTransferAttempt$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NoteViewModel$observePaymentTransferAttempt$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$observePaymentTransferAttempt$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = noteViewModel;
    }
}
