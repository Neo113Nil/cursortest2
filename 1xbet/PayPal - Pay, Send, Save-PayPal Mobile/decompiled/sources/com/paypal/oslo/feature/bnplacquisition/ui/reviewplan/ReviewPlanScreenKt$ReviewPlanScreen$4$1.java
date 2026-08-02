package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$4$1", f = "ReviewPlanScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ReviewPlanScreenKt$ReviewPlanScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsData;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt.access$ReviewPlanScreen$lambda$0(this.getHighSpeedVideoFpsRangesFor) instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState.Initial) && (reviewPlanDetailsData = this.getHighSpeedVideoFpsRanges.getReviewPlanDetailsData()) != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.LoadDomainData(reviewPlanDetailsData));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$4$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewPlanScreenKt$ReviewPlanScreen$4$1(com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiState> state, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = bnplAcquisitionSharedViewModel;
        this.getHighSpeedVideoFpsRangesFor = state;
        this.getHighResolutionOutputSizeshNQ4ISI = reviewPlanViewModel;
    }
}
