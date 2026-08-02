package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$executeRequestTransfer$1", f = "ReviewViewModel.kt", i = {0}, l = {401}, m = "invokeSuspend", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID}, nl = {403}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class ReviewViewModel$executeRequestTransfer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase executeRequestTransferUseCase;
        java.lang.String str;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String transferAttemptId = this.getHighSpeedVideoSizes.getUiState().getValue().getTransferAttemptId();
            if (transferAttemptId.length() != 0) {
                this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateLoadingState(true));
                executeRequestTransferUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                this.getHighResolutionOutputSizeshNQ4ISI = transferAttemptId;
                this.Camera2StreamConfigurationMap = 1;
                java.lang.Object invoke = executeRequestTransferUseCase.invoke(transferAttemptId, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = transferAttemptId;
                obj = invoke;
            } else {
                this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferFailed(new com.paypal.oslo.feature.p2p.ui.UiText.StringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_error_missing_data, null, 2, null)));
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel = this.getHighSpeedVideoSizes;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError executePaymentTransferError = (com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError) ((arrow.core.Ior.Left) ior).getValue();
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$logPaymentFailed(reviewViewModel, str, executePaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST);
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$handleTransferError(reviewViewModel, executePaymentTransferError);
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request request = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request) ((arrow.core.Ior.Right) ior).getValue();
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$logPaymentSuccess(reviewViewModel, str, request, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST);
            reviewViewModel.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferSucceeded(request));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request request2 = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request) both.getRightValue();
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$logPaymentSuccess(reviewViewModel, str, request2, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST);
            reviewViewModel.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TransferSucceeded(request2));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$executeRequestTransfer$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$executeRequestTransfer$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$executeRequestTransfer$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$executeRequestTransfer$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = reviewViewModel;
    }
}
