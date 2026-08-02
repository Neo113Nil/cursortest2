package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$2$1", f = "ReviewPlanScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ReviewPlanScreenKt$ReviewPlanScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult setupFlowNavResult = (com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status status = setupFlowNavResult.getStatus();
        if (status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed) {
            this.getHighSpeedVideoFpsRanges.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCompleted(this.getHighSpeedVideoSizes.isEntryPointTapToPayPayMode$bnpl_acquisition_prodRelease()));
        } else if (status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled) {
            this.getHighSpeedVideoFpsRanges.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCancelled(this.getHighSpeedVideoSizes.isEntryPointTapToPayPayMode$bnpl_acquisition_prodRelease()));
        } else {
            if (!(status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status status2 = setupFlowNavResult.getStatus();
            kotlin.jvm.internal.Intrinsics.checkNotNull(status2, "");
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed) status2).getError().getClass()).getSimpleName();
            this.getHighSpeedVideoFpsRanges.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationFailed(simpleName != null ? simpleName : "", this.getHighSpeedVideoSizes.isEntryPointTapToPayPayMode$bnpl_acquisition_prodRelease()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult setupFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$2$1) create(setupFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$2$1 reviewPlanScreenKt$ReviewPlanScreen$2$1 = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        reviewPlanScreenKt$ReviewPlanScreen$2$1.Camera2StreamConfigurationMap = obj;
        return reviewPlanScreenKt$ReviewPlanScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPlanScreenKt$ReviewPlanScreen$2$1(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanScreenKt$ReviewPlanScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = reviewPlanViewModel;
        this.getHighSpeedVideoSizes = bnplAcquisitionSharedViewModel;
    }
}
