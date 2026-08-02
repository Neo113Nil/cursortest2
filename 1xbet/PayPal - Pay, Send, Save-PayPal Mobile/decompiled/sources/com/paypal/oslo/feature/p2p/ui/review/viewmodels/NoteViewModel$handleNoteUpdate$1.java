package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1", f = "NoteViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NoteViewModel$handleNoteUpdate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.NoteDetails getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.UpdateNoteUseCase updateNoteUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            updateNoteUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(kotlinx.coroutines.flow.FlowKt.m24097catch(updateNoteUseCase.invoke(new com.paypal.oslo.feature.p2p.domain.model.Note(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges)), new com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null)), new com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptNoteResult;", "exception", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1$1", f = "NoteViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent, kotlin.Unit> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.NoteDetails getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel getInputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.access$logNoteUpdateFailed(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, th);
            this.Camera2StreamConfigurationMap.invoke(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteFailed.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1.AnonymousClass1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = th;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.getInputSizeshNQ4ISI = noteViewModel;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoSizes = noteDetails;
            this.Camera2StreamConfigurationMap = function1;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptNoteResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1$2", f = "NoteViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent, kotlin.Unit> Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.NoteDetails getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel getInputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
            arrow.core.Ior ior = (arrow.core.Ior) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel = this.getInputSizeshNQ4ISI;
            java.lang.String str = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
            if (ior instanceof arrow.core.Ior.Left) {
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.access$logNoteUpdateFailed(noteViewModel, str, noteDetails, (com.paypal.oslo.feature.p2p.domain.error.TransferError) ((arrow.core.Ior.Left) ior).getValue());
                function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteFailed.INSTANCE);
            } else if (ior instanceof arrow.core.Ior.Right) {
                com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult updatePaymentTransferAttemptNoteResult = (com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult) ((arrow.core.Ior.Right) ior).getValue();
                mutableStateFlow2 = noteViewModel.Camera2StreamConfigurationMap;
                mutableStateFlow2.setValue(updatePaymentTransferAttemptNoteResult.getFundingOptions());
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.access$logNoteUpdateSuccess(noteViewModel, str, noteDetails);
                function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteSuccess.INSTANCE);
            } else if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult updatePaymentTransferAttemptNoteResult2 = (com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult) both.getRightValue();
                mutableStateFlow = noteViewModel.Camera2StreamConfigurationMap;
                mutableStateFlow.setValue(updatePaymentTransferAttemptNoteResult2.getFundingOptions());
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel.access$logNoteUpdateSuccess(noteViewModel, str, noteDetails);
                function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent.UpdateNoteSuccess.INSTANCE);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult> ior, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1.AnonymousClass2) create(ior, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1.AnonymousClass2 anonymousClass2 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1.AnonymousClass2(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass2.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getInputSizeshNQ4ISI = noteViewModel;
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRanges = noteDetails;
            this.Camera2StreamConfigurationMap = function1;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NoteViewModel$handleNoteUpdate$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel noteViewModel, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.NoteEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel$handleNoteUpdate$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = noteViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = noteDetails;
        this.getHighSpeedVideoSizes = function1;
    }
}
