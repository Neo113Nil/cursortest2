package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$executeSendTransfer$1", f = "ReviewViewModel.kt", i = {0, 0, 0}, l = {345}, m = "invokeSuspend", n = {"currentState", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID}, nl = {348}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class ReviewViewModel$executeSendTransfer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase executeSendTransferUseCase;
        java.lang.String str;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState value = this.getHighSpeedVideoFpsRangesFor.getUiState().getValue();
            java.lang.String transferAttemptId = value.getTransferAttemptId();
            java.lang.String fundingOptionId = value.getFundingOptionId();
            if (transferAttemptId.length() != 0 && fundingOptionId.length() != 0) {
                this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateLoadingState(true));
                executeSendTransferUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                this.getHighSpeedVideoFpsRanges = transferAttemptId;
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingOptionId);
                this.getHighSpeedVideoSizes = 1;
                obj = executeSendTransferUseCase.invoke(transferAttemptId, fundingOptionId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = transferAttemptId;
            } else {
                this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferFailed(new com.paypal.oslo.feature.p2p.ui.UiText.StringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_error_missing_data, null, 2, null)));
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError executePaymentTransferError = (com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError) ((arrow.core.Ior.Left) ior).getValue();
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$logPaymentFailed(reviewViewModel, str, executePaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND);
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$handleTransferError(reviewViewModel, executePaymentTransferError);
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send send = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send) ((arrow.core.Ior.Right) ior).getValue();
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$logPaymentSuccess(reviewViewModel, str, send, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND);
            reviewViewModel.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferSucceeded(send));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send send2 = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send) both.getRightValue();
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$logPaymentSuccess(reviewViewModel, str, send2, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND);
            reviewViewModel.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferSucceeded(send2));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$executeSendTransfer$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$executeSendTransfer$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$executeSendTransfer$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$executeSendTransfer$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = reviewViewModel;
    }
}
