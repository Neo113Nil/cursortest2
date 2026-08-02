package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$submitApplication$1", f = "ReviewPlanViewModel.kt", i = {0}, l = {127}, m = "invokeSuspend", n = {"$this$launch"}, nl = {128}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class ReviewPlanViewModel$submitApplication$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase submitCreditApplicationUsecase;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper reviewPlanUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper reviewPlanUiMapper2;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiMapper reviewPlanUiMapper3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess success;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            submitCreditApplicationUsecase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = coroutineScope;
            this.getHighSpeedVideoSizes = 1;
            obj = submitCreditApplicationUsecase.invoke2(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel.access$buildSubmitRequest(this.getHighResolutionOutputSizeshNQ4ISI), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult) obj;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success2 = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success2.getData();
            java.lang.String correlationId = success2.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails submitVirtualCardApplicationDetails = data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails ? (com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails) data : null;
            if (submitVirtualCardApplicationDetails == null || (success = submitVirtualCardApplicationDetails.getSuccess()) == null) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "SubmitVirtualCardApplicationDetailsSuccess is null", null, null, null, 14, null);
                reviewPlanUiMapper3 = reviewPlanViewModel.getHighResolutionOutputSizeshNQ4ISI;
                reviewPlanViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationError(reviewPlanUiMapper3.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null))));
            } else {
                java.lang.String creditAccountId = success.getCreditApplication().getCreditAccountId();
                if (creditAccountId != null) {
                    sessionStorage = reviewPlanViewModel.getHighSpeedVideoFpsRanges;
                    sessionStorage.setCreditAccountId(creditAccountId);
                }
                reviewPlanViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationSuccess(success, correlationId));
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Failed to submit credit application", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", error.getTag())), null, 4, null);
            reviewPlanUiMapper2 = reviewPlanViewModel2.getHighResolutionOutputSizeshNQ4ISI;
            reviewPlanViewModel2.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationError(reviewPlanUiMapper2.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from(error))));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            java.lang.String data2 = decline.getData();
            java.lang.String correlationId2 = decline.getCorrelationId();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Application declined", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", data2 == null ? "UNKNOWN" : data2)), null, 4, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from = com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.INSTANCE.from(data2, correlationId2);
            reviewPlanUiMapper = reviewPlanViewModel3.getHighResolutionOutputSizeshNQ4ISI;
            reviewPlanViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationDecline(reviewPlanUiMapper.toDeclineContent(from)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$submitApplication$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$submitApplication$1 reviewPlanViewModel$submitApplication$1 = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$submitApplication$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        reviewPlanViewModel$submitApplication$1.getHighSpeedVideoFpsRanges = obj;
        return reviewPlanViewModel$submitApplication$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPlanViewModel$submitApplication$1(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$submitApplication$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = reviewPlanViewModel;
    }
}
