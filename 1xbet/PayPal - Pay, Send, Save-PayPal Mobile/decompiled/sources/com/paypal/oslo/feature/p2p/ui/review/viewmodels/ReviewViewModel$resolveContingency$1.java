package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$resolveContingency$1", f = "ReviewViewModel.kt", i = {}, l = {504}, m = "invokeSuspend", n = {}, nl = {574}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ReviewViewModel$resolveContingency$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase resolvePlanContingencyUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateLoadingState(true));
            resolvePlanContingencyUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = resolvePlanContingencyUseCase.invoke(this.getHighSpeedVideoSizes, this);
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
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel = this.Camera2StreamConfigurationMap;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$handleContingencyResolutionError(reviewViewModel, (com.paypal.oslo.feature.p2p.domain.error.TransferError) ((arrow.core.Ior.Left) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$onContingencyStepResolved(reviewViewModel, (com.paypal.oslo.feature.p2p.domain.model.FundingOptions) ((arrow.core.Ior.Right) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel.access$onContingencyStepResolved(reviewViewModel, (com.paypal.oslo.feature.p2p.domain.model.FundingOptions) both.getRightValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$resolveContingency$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$resolveContingency$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$resolveContingency$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput resolvePlanContingencyInput, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel$resolveContingency$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = reviewViewModel;
        this.getHighSpeedVideoSizes = resolvePlanContingencyInput;
    }
}
