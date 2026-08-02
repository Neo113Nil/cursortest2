package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1", f = "ContactSectionViewModel.kt", i = {}, l = {349}, m = "invokeSuspend", n = {}, nl = {380}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ContactSectionViewModel$handleReceiverSelection$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ReceiverType getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.UpdateTransferAttemptReceiverUseCase updateTransferAttemptReceiverUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            updateTransferAttemptReceiverUseCase = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(kotlinx.coroutines.flow.FlowKt.m24097catch(updateTransferAttemptReceiverUseCase.invoke(new com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI)), new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1.AnonymousClass1(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null)), new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1.AnonymousClass2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "exception", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1$1", f = "ContactSectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ReceiverType getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel getInputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.access$logReceiverUpdateFailed(this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, th);
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverFailed.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1.AnonymousClass1(this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = th;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.getInputFormats = contactSectionViewModel;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoSizes = str2;
            this.getHighSpeedVideoFpsRangesFor = receiverType;
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1$2", f = "ContactSectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ReceiverType getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> getHighSpeedVideoSizes;
        int getInputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            arrow.core.Ior ior = (arrow.core.Ior) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getInputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel = this.getOutputMinFrameDuration;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String str2 = this.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType = this.getHighSpeedVideoFpsRanges;
            if (ior instanceof arrow.core.Ior.Left) {
                if (((com.paypal.oslo.feature.p2p.domain.error.TransferError) ((arrow.core.Ior.Left) ior).getValue()) instanceof com.paypal.oslo.feature.p2p.domain.error.TransferError.HighRiskScamDecline) {
                    function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.HighRiskScamDeclineDetected.INSTANCE);
                } else {
                    function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverFailed.INSTANCE);
                }
            } else if (ior instanceof arrow.core.Ior.Right) {
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.access$handleReceiverUpdateSuccess(contactSectionViewModel, function1, str, str2, receiverType, (com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver) ((arrow.core.Ior.Right) ior).getValue());
            } else if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.access$handleReceiverUpdateSuccess(contactSectionViewModel, function1, str, str2, receiverType, (com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver) both.getRightValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver> ior, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1.AnonymousClass2) create(ior, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1.AnonymousClass2 anonymousClass2 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1.AnonymousClass2(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass2.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> function1, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = function1;
            this.getOutputMinFrameDuration = contactSectionViewModel;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.Camera2StreamConfigurationMap = str2;
            this.getHighSpeedVideoFpsRanges = receiverType;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContactSectionViewModel$handleReceiverSelection$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = contactSectionViewModel;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = receiverType;
        this.getHighSpeedVideoSizes = function1;
    }
}
