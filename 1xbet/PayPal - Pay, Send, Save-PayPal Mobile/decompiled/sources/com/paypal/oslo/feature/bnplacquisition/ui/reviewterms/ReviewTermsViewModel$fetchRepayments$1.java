package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel$fetchRepayments$1", f = "ReviewTermsViewModel.kt", i = {0, 0, 0}, l = {165}, m = "invokeSuspend", n = {"$this$launch", "sessionId", "request"}, nl = {166}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes11.dex */
final class ReviewTermsViewModel$fetchRepayments$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase getRepaymentDetailsUseCase;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper reviewTermsUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper reviewTermsUiMapper2;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiMapper reviewTermsUiMapper3;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionStorage = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            java.lang.String camera2StreamConfigurationMap = sessionStorage.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap == null) {
                com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel reviewTermsViewModel = this.Camera2StreamConfigurationMap;
                reviewTermsUiMapper = reviewTermsViewModel.getHighSpeedVideoFpsRangesFor;
                reviewTermsViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateError(reviewTermsUiMapper.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null))));
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest repaymentRequest = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest(camera2StreamConfigurationMap, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType[]{com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType.INSTALLMENT_AGREEMENT, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType.PRIVACY_NOTICE, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ConsentType.CREDIT_SCORE_DISCLOSURE}), null, 4, null);
            getRepaymentDetailsUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(camera2StreamConfigurationMap);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(repaymentRequest);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = getRepaymentDetailsUseCase.invoke2(repaymentRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
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
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel reviewTermsViewModel2 = this.Camera2StreamConfigurationMap;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            success.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel.access$handleRepaymentsSuccess(reviewTermsViewModel2, data);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel reviewTermsViewModel3 = this.Camera2StreamConfigurationMap;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Failed to fetch repayments", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", error.getTag())), null, 4, null);
            reviewTermsUiMapper3 = reviewTermsViewModel3.getHighSpeedVideoFpsRangesFor;
            reviewTermsViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateError(reviewTermsUiMapper3.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from(error))));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel reviewTermsViewModel4 = this.Camera2StreamConfigurationMap;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            java.lang.String data2 = decline.getData();
            java.lang.String correlationId = decline.getCorrelationId();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Application declined", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", data2 == null ? "UNKNOWN" : data2)), null, 4, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from = com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.INSTANCE.from(data2, correlationId);
            reviewTermsUiMapper2 = reviewTermsViewModel4.getHighSpeedVideoFpsRangesFor;
            reviewTermsViewModel4.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ApplicationDeclined(reviewTermsUiMapper2.toDeclineContent(from)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel$fetchRepayments$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel$fetchRepayments$1 reviewTermsViewModel$fetchRepayments$1 = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel$fetchRepayments$1(this.Camera2StreamConfigurationMap, continuation);
        reviewTermsViewModel$fetchRepayments$1.getHighSpeedVideoSizes = obj;
        return reviewTermsViewModel$fetchRepayments$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTermsViewModel$fetchRepayments$1(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel reviewTermsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel$fetchRepayments$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = reviewTermsViewModel;
    }
}
