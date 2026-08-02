package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleResolveContingency$1", f = "ContactSectionViewModel.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED}, m = "invokeSuspend", n = {}, nl = {563}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ContactSectionViewModel$handleResolveContingency$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase resolvePaymentContingencyUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            resolvePaymentContingencyUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = resolvePaymentContingencyUseCase.invoke(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ReceiverNameInput(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel = this.getHighSpeedVideoSizesFor;
        java.lang.String str = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.access$handleContingencyResolutionError(contactSectionViewModel, (com.paypal.oslo.feature.p2p.domain.error.TransferError) ((arrow.core.Ior.Left) ior).getValue(), str, function1);
        } else if (ior instanceof arrow.core.Ior.Right) {
            function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverSuccess((com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver) ((arrow.core.Ior.Right) ior).getValue()));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverSuccess((com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver) both.getRightValue()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleResolveContingency$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleResolveContingency$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContactSectionViewModel$handleResolveContingency$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleResolveContingency$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = contactSectionViewModel;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
        this.Camera2StreamConfigurationMap = function1;
    }
}
